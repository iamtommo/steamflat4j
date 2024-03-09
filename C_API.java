import com.google.gson.Gson;

import java.lang.SuppressWarnings;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

@SuppressWarnings("unchecked")
public class C_API {

    record Decl(String left, String right) {}

    static String unqualify(String type) {
        return type.contains("::") ? type.substring(type.indexOf("::") + 2) : type;
    }

    static Decl parseDecl(String name, String type) {
        if (isFunctionPointer(type)) {
            var args = type.substring(type.indexOf("(*)") + 3).trim();
            var returnType = type.substring(0, type.indexOf("(*)")).trim();
            return new Decl(format("%s (*%s)", returnType, name), args);
        } else if (isArray(type)) {
            var arraytype = type.substring(0, type.indexOf("[") - 1);
            var arraydecl = type.substring(type.indexOf("["));
            return new Decl(arraytype, format("%s%s", name, arraydecl));
        }
        return new Decl(type, name);
    }

    static boolean isFunctionPointer(String type) {
        return type.contains("(*)");
    }

    static boolean isArray(String type) {
        return type.contains("[");
    }

    static String writeTypedefs(List<Map<String, Object>> typedefs) {
        var sb = new StringBuilder();
        for (var entry : typedefs) {
            var name = (String) entry.get("typedef");
            var type = (String) entry.get("type");
            if (isFunctionPointer(type)) {
                var v = type.substring(type.indexOf("(*)") + 3);
                sb.append(format("typedef (*%s) %s;\n", name, v));
            } else {
                var decl = parseDecl(name, type);
                sb.append(format("typedef %s %s;\n", decl.left, decl.right));
            }
        }
        return sb.toString();
    }

    static String writeStructForwardDeclarations(List<Map<String, Object>> structs) {
        var sb = new StringBuilder();
        for (var entry : structs) {
            var name = (String) entry.get("struct");
            sb.append(format("struct %s;\n", name));
        }
        return sb.toString();
    }

    static String writeStructTypedefs(List<Map<String, Object>> structs) {
        var sb = new StringBuilder();
        for (var entry : structs) {
            var name = (String) entry.get("struct");
            sb.append(format("typedef struct %s %s;\n", name, name));
        }
        return sb.toString();
    }

    static String writeStructs(List<Map<String, Object>> structs) {
        var sb = new StringBuilder();
        for (var entry : structs) {
            var struct = (String) entry.get("struct");
            var fields = (List<Map<String, Object>>) entry.get("fields");
            sb.append(format("struct %s {\n", struct));
            for (var field : fields) {
                var fieldName = (String) field.get("fieldname");
                var fieldType = unqualify((String) field.get("fieldtype"));
                var decl = parseDecl(fieldName, fieldType);
                sb.append(format("\t%s %s;\n", decl.left, decl.right));
            }
            sb.append("};\n");
        }
        return sb.toString();
    }

    static String writeEnums(List<Map<String, Object>> enums) {
        var sb = new StringBuilder();
        for (var entry : enums) {
            var name = (String) entry.get("enumname");
            var values = (List<Map<String, Object>>) entry.get("values");
            sb.append("enum " + name + " {\n");
            for (var value : values) {
                var valueName = value.get("name");
                var val = value.get("value");
                sb.append(format("\t%s = %s,\n", valueName, val));
            }
            sb.append("};\n");
        }
        return sb.toString();
    }

    static String writeCallbackId(Map<String, Object> callbackStruct) {
        var sb = new StringBuilder();
        var struct = (String) callbackStruct.get("struct");
        var callbackId = (int) ((double) callbackStruct.get("callback_id"));
        sb.append(format("enum { k_iCallback_%s = %d };\n", struct, callbackId));
        return sb.toString();
    }

    static String writeTypedefEnums(List<Map<String, Object>> enums) {
        var sb = new StringBuilder();
        for (var entry : enums) {
            var name = (String) entry.get("enumname");
            sb.append(format("typedef enum %s %s;\n", name, name));
        }
        return sb.toString();
    }

    static String writeInterfaces(List<Map<String, Object>> interfaces) {
        var sb = new StringBuilder();
        for (var entry : interfaces) {
            var className = (String) entry.get("classname");
            sb.append(format("typedef void* %s;\n", className));
        }
        return sb.toString();
    }

    static String writeMethods(List<Map<String, Object>> methods, String ... instancePtrs) {
        var sb = new StringBuilder();
        for (var entry : methods) {
            var name = (String) entry.get("methodname_flat");
            var returnType = (String) entry.get("returntype");
            if (entry.containsKey("returntype_flat")) {
                returnType = (String) entry.get("returntype_flat");
            }
            var params = (List<Map<String, Object>>) entry.get("params");
            var args = new ArrayList<String>();
            for (var instancePtr : instancePtrs) {
                args.add(instancePtr + " ptr");
            }
            for (var param : params) {
                var paramName = (String) param.get("paramname");
                var paramType = (String) param.get("paramtype");
                if (param.containsKey("paramtype_flat")) {
                    paramType = (String) param.get("paramtype_flat");
                }

                paramType = paramType.replace('&', '*');
                paramType = unqualify(paramType);

                args.add(paramType + " " + paramName);
            }

            // avoid jextract variadic invoker
            if (args.isEmpty()) {
                args.add("void");
            }

            sb.append(format("%s %s(%s);\n", returnType, name, String.join(", ", args)));
        }
        return sb.toString();
    }

    static String writeAccessors(String className, List<Map<String, Object>> accessors) {
        var sb = new StringBuilder();
        for (var entry : accessors) {
            var king = (String) entry.get("kind");
            var name = (String) entry.get("name_flat");
            sb.append(format("%s %s(void);\n", className, name));
        }
        return sb.toString();
    }

    static String writeConsts(List<Map<String, Object>> consts) {
        var sb = new StringBuilder();
        for (var entry : consts) {
            var constName = (String) entry.get("constname");
            var constType = (String) entry.get("consttype");
            var constVal = (String) entry.get("constval");
            sb.append(format("const %s %s = %s;\n", constType, constName, constVal));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        var gson = new Gson();
        var file = Files.readString(Path.of("steam_api.json"));
        var json = gson.fromJson(file, Map.class);

        var code = new StringBuilder();
        List<Map<String, Object>> typedefs = (List<Map<String, Object>>) json.get("typedefs");
        List<Map<String, Object>> structs = (List<Map<String, Object>>) json.get("structs");
        List<Map<String, Object>> callbackStructs = (List<Map<String, Object>>) json.get("callback_structs");
        List<Map<String, Object>> enums = (List<Map<String, Object>>) json.get("enums");
        List<Map<String, Object>> interfaces = (List<Map<String, Object>>) json.get("interfaces");
        List<Map<String, Object>> consts = (List<Map<String, Object>>) json.get("consts");

        code.append("#include <stdint.h>;\n");
        code.append("#include <stdbool.h>;\n");
        code.append("typedef uint64_t size_t;\n");
        code.append("typedef uint64_t uint64_gameid;\n");
        code.append("typedef uint64_t CGameID;\n");
        code.append("typedef uint64_t uint64_steamid;\n");
        code.append("typedef uint64_t CSteamID;\n");

        code.append(writeTypedefEnums(enums)).append("\n\n");
        code.append(writeEnums(enums)).append("\n\n");
        code.append(writeStructForwardDeclarations(structs)).append("\n\n");
        code.append(writeStructTypedefs(structs)).append("\n\n");
        code.append(writeStructTypedefs(callbackStructs)).append("\n\n");
        code.append(writeTypedefs(typedefs)).append("\n\n");
        code.append(writeConsts(consts)).append("\n\n");

        for (var callback : callbackStructs) {
            var callbackEnums = callback.get("enums");
            if (callbackEnums != null) {
                code.append(writeTypedefEnums((List<Map<String, Object>>) callbackEnums)).append("\n\n");
                code.append(writeEnums((List<Map<String, Object>>) callbackEnums)).append("\n\n");
            }
            code.append(writeCallbackId(callback)).append("\n");
        }

        code.append(writeStructs(structs)).append("\n\n");
        code.append(writeStructs(callbackStructs)).append("\n\n");
        code.append(writeInterfaces(interfaces)).append("\n\n");

        for (var struct : structs) {
            var methods = struct.get("methods");
            if (methods == null) continue;
            code.append(writeMethods((List<Map<String, Object>>) methods)).append("\n\n");
        }

        for (var iface : interfaces) {
            var interfaceEnums = iface.get("enums");
            if (interfaceEnums == null) continue;
            code.append(writeTypedefEnums((List<Map<String, Object>>) interfaceEnums)).append("\n\n");
            code.append(writeEnums((List<Map<String, Object>>) interfaceEnums)).append("\n\n");
        }

        for (var iface : interfaces) {
            var className = (String) iface.get("classname");
            var methods = (List<Map<String, Object>>) iface.get("methods");
            var accessors = (List<Map<String, Object>>) iface.get("accessors");
            var versionString = (String) iface.get("version_string");
            if (methods != null) {
                code.append(writeMethods(methods, className)).append("\n\n");
            }
            if (accessors != null) {
                code.append(writeAccessors(className, accessors)).append("\n\n");
            }

            // todo currently ISteamGameServer -> STEAMGAMESERVER, but should maybe use accessor name
            // todo some have no version string (i.e. callback interfaces)
            code.append(format("#define %s_INTERFACE_VERSION \"%s\"\n", className.substring(1).toUpperCase(), versionString));
        }

        // todo presumptuous packing
        // source from steam_api_internal.h:
        //#if defined( VALVE_CALLBACK_PACK_SMALL )
        //#pragma pack( push, 4 )
        //#elif defined( VALVE_CALLBACK_PACK_LARGE )
        //#pragma pack( push, 8 )
        //#else
        //#error steam_api_common.h should define VALVE_CALLBACK_PACK_xxx
        //#endif
        code.append("""
                #pragma pack( push, 8 ) 
                struct CallbackMsg_t
                {
                	HSteamUser m_hSteamUser; // Specific user to whom this callback applies.
                	int m_iCallback; // Callback identifier.  (Corresponds to the k_iCallback enum in the callback structure.)
                	uint8 *m_pubParam; // Points to the callback structure
                	int m_cubParam; // Size of the data pointed to by m_pubParam
                };
                #pragma pack( pop )
                typedef struct CallbackMsg_t CallbackMsg_t;
                """);

        // todo maybe unnecessary
        code.append("""
                enum { k_iSteamUserCallbacks = 100 };
                enum { k_iSteamGameServerCallbacks = 200 };
                enum { k_iSteamFriendsCallbacks = 300 };
                enum { k_iSteamBillingCallbacks = 400 };
                enum { k_iSteamMatchmakingCallbacks = 500 };
                enum { k_iSteamContentServerCallbacks = 600 };
                enum { k_iSteamUtilsCallbacks = 700 };
                enum { k_iSteamAppsCallbacks = 1000 };
                enum { k_iSteamUserStatsCallbacks = 1100 };
                enum { k_iSteamNetworkingCallbacks = 1200 };
                enum { k_iSteamNetworkingSocketsCallbacks = 1220 };
                enum { k_iSteamNetworkingMessagesCallbacks = 1250 };
                enum { k_iSteamNetworkingUtilsCallbacks = 1280 };
                enum { k_iSteamRemoteStorageCallbacks = 1300 };
                enum { k_iSteamGameServerItemsCallbacks = 1500 };
                enum { k_iSteamGameCoordinatorCallbacks = 1700 };
                enum { k_iSteamGameServerStatsCallbacks = 1800 };
                enum { k_iSteam2AsyncCallbacks = 1900 };
                enum { k_iSteamGameStatsCallbacks = 2000 };
                enum { k_iSteamHTTPCallbacks = 2100 };
                enum { k_iSteamScreenshotsCallbacks = 2300 };
                // NOTE: 2500-2599 are reserved
                enum { k_iSteamStreamLauncherCallbacks = 2600 };
                enum { k_iSteamControllerCallbacks = 2800 };
                enum { k_iSteamUGCCallbacks = 3400 };
                enum { k_iSteamStreamClientCallbacks = 3500 };
                enum { k_iSteamMusicCallbacks = 4000 };
                enum { k_iSteamMusicRemoteCallbacks = 4100 };
                enum { k_iSteamGameNotificationCallbacks = 4400 };\s
                enum { k_iSteamHTMLSurfaceCallbacks = 4500 };
                enum { k_iSteamVideoCallbacks = 4600 };
                enum { k_iSteamInventoryCallbacks = 4700 };
                enum { k_ISteamParentalSettingsCallbacks = 5000 };
                enum { k_iSteamGameSearchCallbacks = 5200 };
                enum { k_iSteamPartiesCallbacks = 5300 };
                enum { k_iSteamSTARCallbacks = 5500 };
                enum { k_iSteamRemotePlayCallbacks = 5700 };
                enum { k_iSteamChatCallbacks = 5900 };
                """);

        code.append("HSteamPipe SteamAPI_GetHSteamPipe(void);\n");
        code.append("HSteamUser SteamAPI_GetHSteamUser(void);\n");
        code.append("HSteamPipe SteamGameServer_GetHSteamPipe(void);\n");
        code.append("HSteamUser SteamGameServer_GetHSteamUser(void);\n");

        code.append("ESteamAPIInitResult SteamAPI_InitFlat( SteamErrMsg *pOutErrMsg );\n");
        code.append("void SteamAPI_Shutdown(void);\n");
        code.append("bool SteamAPI_RestartAppIfNecessary( uint32 unOwnAppID );\n");

        // 	const char *pszInternalCheckInterfaceVersions =
        //		STEAMUTILS_INTERFACE_VERSION "\0"
        //		STEAMNETWORKINGUTILS_INTERFACE_VERSION "\0"
        //
        //		STEAMGAMESERVER_INTERFACE_VERSION "\0"
        //		STEAMGAMESERVERSTATS_INTERFACE_VERSION "\0"
        //		STEAMHTTP_INTERFACE_VERSION "\0"
        //		STEAMINVENTORY_INTERFACE_VERSION "\0"
        //		STEAMNETWORKING_INTERFACE_VERSION "\0"
        //		STEAMNETWORKINGMESSAGES_INTERFACE_VERSION "\0"
        //		STEAMNETWORKINGSOCKETS_INTERFACE_VERSION "\0"
        //		STEAMUGC_INTERFACE_VERSION "\0"
        //		"\0";
        code.append("ESteamAPIInitResult SteamInternal_GameServer_Init_V2( uint32 unIP, uint16 usGamePort, uint16 usQueryPort, EServerMode eServerMode, const char *pchVersionString, const char *pszInternalCheckInterfaceVersions, SteamErrMsg *pOutErrMsg );\n");
        code.append("void SteamGameServer_Shutdown(void);\n");
        code.append("uint64 SteamGameServer_GetSteamID(void);\n");
        code.append("bool SteamGameServer_BSecure(void);\n");

        code.append("void SteamAPI_ManualDispatch_Init(void);\n");
        code.append("void SteamAPI_ManualDispatch_RunFrame(HSteamPipe hSteamPipe);\n");
        code.append("bool SteamAPI_ManualDispatch_GetNextCallback( HSteamPipe hSteamPipe, CallbackMsg_t *pCallbackMsg );\n");
        code.append("void SteamAPI_ManualDispatch_FreeLastCallback( HSteamPipe hSteamPipe );\n");
        code.append("bool SteamAPI_ManualDispatch_GetAPICallResult( HSteamPipe hSteamPipe, SteamAPICall_t hSteamAPICall, void *pCallback, int cubCallback, int iCallbackExpected, bool *pbFailed );\n");

        // fixups
        var lines = code.toString().split("\n");
        for (var i = 0; i < lines.length; i++) {
            var line = lines[i];
            if (line.contains("AnalogAction_t")
                    || line.contains("SteamAPIWarningMessageHook_t")
                    || line.contains("ScePadTriggerEffectParam")
                    || line.contains("SteamDatagramRelayAuthTicket")
                    || line.contains("ISteamNetworkingConnectionSignaling")
                    || line.contains("ISteamNetworkingSignalingRecvContext")) {
                lines[i] = "//" + line;
            }
        }

        Files.writeString(Path.of("steam_api.h"), String.join("\n", lines));
    }
}
