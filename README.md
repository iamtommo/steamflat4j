# Steamflat4j
[Jextract](https://jdk.java.net/jextract/) generated [Panama](https://openjdk.org/projects/panama/) bindings for the Steamworks sdk (flat)

## Usage
First load the Steam dll (found in Steamworks SDK redistributable_bin)
```java
static {
    var os = System.getProperty("os.name");
    if (os.contains("Windows")) {
        System.load(Path.of("path/to/steam_api64.dll").toAbsolutePath().toString());
    } else if (os.startsWith("Mac OS") || os.startsWith("Darwin")) {
        System.load(Path.of("path/to/libsteam_api.dylib").toAbsolutePath().toString());
    } else {
        System.load(Path.of("path/to/libsteam_api.so").toAbsolutePath().toString());
    }
}
```

And use the `_flat` Steam APIs:

```java
try (var arena = Arena.ofConfined()) {
    var errMsg = arena.allocate(C_CHAR, 1024);
    var result = SteamAPI_InitFlat(errMsg);
    if (result != k_ESteamAPIInitResult_OK()) {
        System.out.println("err: " + errMsg.getString(0));
        System.exit(1);
    }

    var steamUser = SteamAPI_SteamUser_v023();
    var steamId = SteamAPI_ISteamUser_GetSteamID(steamUser);
}
```

### Auth tickets
```java
try (var arena = Arena.ofConfined()) {
    var maxTicketSize = 1024;
    var pTicket = arena.allocate(maxTicketSize);
    var pcbTicket = arena.allocate(C_INT, 1);
    var steamAuthTicket = SteamAPI_ISteamUser_GetAuthSessionTicket(Cl.steamUser, pTicket, maxTicketSize, pcbTicket, MemorySegment.NULL);
    if (steamAuthTicket == 0) {
        // k_HAuthTicketInvalid
        return;
    }
}
	
```

And to cancel an auth ticket:
```java
SteamAPI_ISteamUser_CancelAuthTicket(steamUser, steamAuthTicket);
```

### Request server list
```java
try (var arena = Arena.ofConfined()) {
    var nFilters = 0;
    var filters = MatchMakingKeyValuePair_t.allocateArray(nFilters, arena);
    var steamServerListRequestHandle = SteamAPI_ISteamMatchmakingServers_RequestInternetServerList(steamMatchmakingServers, /*appId*/,
            filters, nFilters, MemorySegment.NULL);
}
```

We don't use the callback here, instead just check the status of the call:
```java
if (SteamAPI_ISteamMatchmakingServers_IsRefreshing(steamMatchmakingServers, steamServerListRequestHandle)) {
    var serverCount = SteamAPI_ISteamMatchmakingServers_GetServerCount(steamMatchmakingServers, steamServerListRequestHandle);
    for (var i = 0; i < serverCount; i++) {
        var details = SteamAPI_ISteamMatchmakingServers_GetServerDetails(steamMatchmakingServers, steamServerListRequestHandle, i);
        var serverName = gameserveritem_t.m_szServerName(details).getString(0);
        var netAddr = gameserveritem_t.m_NetAdr(details);
        var connectionPort = SteamAPI_servernetadr_t_GetConnectionPort(netAddr);
        var connectionString = SteamAPI_servernetadr_t_GetConnectionAddressString(netAddr).getString(0);
    }
}
```

### Callbacks
Steam manual dispatch callbacks look like this in C++:
```C

 HSteamPipe hSteamPipe = SteamAPI_GetHSteamPipe(); // See also SteamGameServer_GetHSteamPipe()
 	SteamAPI_ManualDispatch_RunFrame( hSteamPipe )
 	CallbackMsg_t callback;
 	while ( SteamAPI_ManualDispatch_GetNextCallback( hSteamPipe, &callback ) ) {
 		// Check for dispatching API call results
 		if ( callback.m_iCallback == SteamAPICallCompleted_t::k_iCallback ) {
 			SteamAPICallCompleted_t *pCallCompleted = (SteamAPICallCompleted_t *)callback.
 			void *pTmpCallResult = malloc( pCallback->m_cubParam );
 			bool bFailed;
 			if ( SteamAPI_ManualDispatch_GetAPICallResult( hSteamPipe, pCallCompleted->m_hAsyncCall, pTmpCallResult, pCallback->m_cubParam, pCallback->m_iCallback, &bFailed ) ) {
 				// Dispatch the call result to the registered handler(s) for the
 				// call identified by pCallCompleted->m_hAsyncCall
            }
 			free( pTmpCallResult );
        } else {
 			// Look at callback.m_iCallback to see what kind of callback it is,
 			// and dispatch to appropriate handler(s)
        }
 		SteamAPI_ManualDispatch_FreeLastCallback( hSteamPipe );
    }
```

The Java equivalent looks like this:
```java
try (var arena = Arena.ofConfined()) {
    var steamPipe = SteamAPI_GetHSteamPipe();
    SteamAPI_ManualDispatch_RunFrame(steamPipe);
    var callback = CallbackMsg_t.allocate(arena);
    var callbackDataPtr = CallbackMsg_t.m_pubParam(callback);

    while (SteamAPI_ManualDispatch_GetNextCallback(steamPipe, callback)) {
        var callbackId = CallbackMsg_t.m_iCallback(callback);
        if (callbackId == k_iCallback_SteamAPICallCompleted_t()) {
            var tmpCallResult = callResultArena.allocate(SteamAPICallCompleted_t.m_cubParam(callback));
            var failed = arena.allocate(C_BOOL, 1);
            if (SteamAPI_ManualDispatch_GetAPICallResult(steamPipe, SteamAPICallCompleted_t.m_hAsyncCall(callback), tmpCallResult, SteamAPICallCompleted_t.m_cubParam(callback), SteamAPICallCompleted_t.m_iCallback(callback), failed)) {
                
            }
        } else {
            // handle the callback, for example:
            if (callbackId == k_iCallback_ValidateAuthTicketResponse_t()) {
                var authTicketResponse = ValidateAuthTicketResponse_t.m_eAuthSessionResponse(callbackDataPtr);
                var steamID = ValidateAuthTicketResponse_t.m_SteamID(callbackDataPtr);
            }
        }
        SteamAPI_ManualDispatch_FreeLastCallback(steamPipe);
    }
}
```

## Game Server
Unfortunately `GameServer_Init` is inline and not exported by the Steam API so we just mimic what that call would do:
```java
try (var arena = Arena.ofConfined()) {
    var version = arena.allocateFrom("0.0.0.1");
    var versions = arena.allocateFrom(Stream.of(
                    STEAMUTILS_INTERFACE_VERSION(),
                    STEAMNETWORKINGUTILS_INTERFACE_VERSION(),
                    STEAMGAMESERVER_INTERFACE_VERSION(),
                    STEAMGAMESERVERSTATS_INTERFACE_VERSION(),
                    STEAMHTTP_INTERFACE_VERSION(),
                    STEAMINVENTORY_INTERFACE_VERSION(),
                    STEAMNETWORKING_INTERFACE_VERSION(),
                    STEAMNETWORKINGMESSAGES_INTERFACE_VERSION(),
                    STEAMNETWORKINGSOCKETS_INTERFACE_VERSION(),
                    STEAMUGC_INTERFACE_VERSION()
            )
            .map(mem -> mem.getString(0) + "\0")
            .collect(Collectors.joining()));

    var errMsg = arena.allocate(C_CHAR, 1024);
    var result = SteamInternal_GameServer_Init_V2(0,
            (short) 27016, (short) 27017, eServerModeNoAuthentication(), version, versions, errMsg);
    if (result != k_ESteamAPIInitResult_OK()) {
        // failed
        var error = errMsg.getString(0);
        return;
    }

    SteamAPI_ManualDispatch_Init();
    var steamGameServer = SteamAPI_SteamGameServer_v015();

    SteamAPI_ISteamGameServer_SetModDir(steamGameServer, arena.allocateFrom("Server"));
    SteamAPI_ISteamGameServer_SetProduct(steamGameServer, arena.allocateFrom("Server"));
    SteamAPI_ISteamGameServer_SetDedicatedServer(steamGameServer, true);
    SteamAPI_ISteamGameServer_SetServerName(steamGameServer, arena.allocateFrom("Server name"));
    SteamAPI_ISteamGameServer_SetGameDescription(steamGameServer, arena.allocateFrom("Description"));
    SteamAPI_ISteamGameServer_SetMaxPlayerCount(steamGameServer, 100);
    SteamAPI_ISteamGameServer_SetMapName(steamGameServer, arena.allocateFrom("Map name"));

    SteamAPI_ISteamGameServer_LogOnAnonymous(steamGameServer);
    SteamAPI_ISteamGameServer_SetKeyValue(steamGameServer, arena.allocateFrom("Players"), arena.allocateFrom("00"));
    SteamAPI_ISteamGameServer_SetKeyValue(steamGameServer, arena.allocateFrom("Port"), arena.allocateFrom(String.valueOf(27016)));
    SteamAPI_ISteamGameServer_SetAdvertiseServerActive(steamGameServer, true);
}
```

### Validate an auth ticket
```java
try (var arena = Arena.ofConfined()) {
    var steamAuthTicket = // some byte[] array
    var pAuthTicket = arena.allocate(steamAuthTicketLen);
    for (var i = 0; i < steamAuthTicketLen; i++) {
        pAuthTicket.set(C_CHAR, i, steamAuthTicket[i]);
    }
    var result = SteamAPI_ISteamGameServer_BeginAuthSession(steamGameServer, pAuthTicket,
            steamAuthTicketLen, steamId);
    if (result != k_EBeginAuthSessionResultOK()) {
        // failed
        return;
    }
    
    // proceed to wait for ValidateAuthTicketResponse callback
}
```

## Building
### Requirements
- JDK 22 (Panama)
- Jextract
- Gradle 8.7-rc-1 (jdk 22 support)

### Step 1: Generate C API header
```sh
java -classpath gson-2.10.1.jar C_API.java
```
See output in `steam_api.h`

### Step 2: Generate Java FFI
jextract -t steamflat4j --header-class-name SteamFlat --output src/main/java/ steam_api.h


## How it works
As per the Steam documentation:
```
steam_api_flat.h declares a set of "flat" functions that mirror the interface functions in the SDK. This is not pure C code, but it does use plain C linkage and calling conventions, so it is easy to interop with other languages. These functions are exported by steam_api[64][.dll/.so/dylib].
steam_api.json describes (almost all of) the interfaces, types, and functions in the SDK. It is intended that this file be used by an automated process to generate binding layer. We hope that this can be used to automate 95% of the work, but there are still a few special cases that need to be handled manually. In particular, CSteamID and CGameID will probably require special handling by your binding layer to make it efficient.
```

To use `steam_api_flat.h` first we need to generate a pure C api header, done by `C_API.java`.
This writes out a single header file `steam_api.h` with the whole Steam sdk, i.e.:
```c
enum ESteamAPIInitResult {
	k_ESteamAPIInitResult_OK = 0,
	k_ESteamAPIInitResult_FailedGeneric = 1,
	k_ESteamAPIInitResult_NoSteamClient = 2,
	k_ESteamAPIInitResult_VersionMismatch = 3,
};

typedef char SteamErrMsg[1024];

ESteamAPIInitResult SteamAPI_InitFlat( SteamErrMsg *pOutErrMsg );
```

This is then fed into `jextract` to produce the Java FFI bindings, and ends up with code like so:
```java
var errMsg = arena.allocate(C_CHAR, 1024);
var result = SteamAPI_InitFlat(errMsg);
if (result != k_ESteamAPIInitResult_OK()) {
    // etc
}
```