# Steamflat4j
[Jextract](https://jdk.java.net/jextract/) generated [Panama](https://openjdk.org/projects/panama/) bindings for the Steamworks sdk (flat)

## Usage
First load the Steam dll
```java
static {
    System.load(Path.of("path/to/steam_api64.dll").toAbsolutePath().toString());
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
            while (SteamAPI_ManualDispatch_GetNextCallback(steamPipe, callback)) {
                var callbackId = CallbackMsg_t.m_iCallback(callback);
                if (callbackId == k_iCallback_SteamAPICallCompleted_t()) {
                    try (var callResultArena = Arena.ofConfined()) {
                        var tmpCallResult = callResultArena.allocate(SteamAPICallCompleted_t.m_cubParam(callback));
                        var failed = callResultArena.allocate(C_BOOL, 1);
                        if (SteamAPI_ManualDispatch_GetAPICallResult(steamPipe, SteamAPICallCompleted_t.m_hAsyncCall(callback), tmpCallResult, SteamAPICallCompleted_t.m_cubParam(callback), SteamAPICallCompleted_t.m_iCallback(callback), failed)) {
                            
                        }
                    }
                } else {
                    
                }
                SteamAPI_ManualDispatch_FreeLastCallback(steamPipe);
            }
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