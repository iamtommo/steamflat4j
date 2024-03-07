import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

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
                var fieldType = (String) field.get("fieldtype");
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

    static String writeMethods(List<Map<String, Object>> methods) {
        var sb = new StringBuilder();
        for (var entry : methods) {
            var name = (String) entry.get("methodname_flat");
            var returnType = (String) entry.get("returntype");
            if (entry.containsKey("returntype_flat")) {
                returnType = (String) entry.get("returntype_flat");
            }
            var params = (List<Map<String, Object>>) entry.get("params");
            var args = new ArrayList<String>();
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
            sb.append(format("%s %s(%s);\n", returnType, name, String.join(", ", args)));
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

        code.append("#include <stdint.h>;\n");
        code.append("#include <stdbool.h>;\n");
        code.append("typedef uint64_t uint64_gameid;\n");
        code.append("typedef uint64_t CGameID;\n");
        code.append("typedef uint64_t uint64_steamid;\n");
        code.append("typedef uint64_t CSteamID;\n");

        code.append(writeTypedefEnums(enums)).append("\n\n");
        code.append(writeEnums(enums)).append("\n\n");
        code.append(writeStructTypedefs(structs)).append("\n\n");
        code.append(writeStructTypedefs(callbackStructs)).append("\n\n");
        code.append(writeTypedefs(typedefs)).append("\n\n");
        code.append(writeStructs(structs)).append("\n\n");
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
            var methods = iface.get("methods");
            if (methods == null) continue;
            code.append(writeMethods((List<Map<String, Object>>) methods)).append("\n\n");
        }

        // fixups
        var lines = code.toString().split("\n");
        for (var i = 0; i < lines.length; i++) {
            var line = lines[i];
            if (line.contains("SteamInputActionEvent_t::AnalogAction_t")
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
