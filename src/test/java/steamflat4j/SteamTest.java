package steamflat4j;

import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static steamflat4j.SteamFlat.*;
import static steamflat4j.SteamFlat_1.*;
import static steamflat4j.SteamFlat_2.k_ESteamAPIInitResult_OK;
import static steamflat4j.SteamFlat_3.C_CHAR;

public class SteamTest {

    static {
        var os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            System.load(Path.of("lib/win/steam_api64.dll").toAbsolutePath().toString());
        } else if (os.startsWith("Mac OS") || os.startsWith("Darwin")) {
            System.load(Path.of("lib/osx/libsteam_api.dylib").toAbsolutePath().toString());
        } else {

        }
    }

    @Test
    public void test() {
        try (var arena = Arena.ofConfined()) {
            var errMsg = arena.allocate(C_CHAR, 1024);
            var result = SteamAPI_InitFlat(errMsg);
            if (result != k_ESteamAPIInitResult_OK()) {
                System.out.println("err: " + errMsg.getString(0));
            }
            assertEquals(k_ESteamAPIInitResult_OK(), result);

            SteamAPI_ManualDispatch_Init();

            var user = SteamAPI_SteamUser_v023();
            var steamId = SteamAPI_ISteamUser_GetSteamID(user);

            runCallbacks();
        }
    }

    private void runCallbacks() {
        try (var arena = Arena.ofConfined()) {
            var steamPipe = SteamAPI_GetHSteamPipe();
            SteamAPI_ManualDispatch_RunFrame(steamPipe);
            var callback = CallbackMsg_t.allocate(arena);
            while (SteamAPI_ManualDispatch_GetNextCallback(steamPipe, callback)) {
                System.out.println("callback");

                var callbackId = CallbackMsg_t.m_iCallback(callback);
                if (callbackId == k_iCallback_SteamAPICallCompleted_t()) {
                    try (var callResultArena = Arena.ofConfined()) {
                        var tmpCallResult = callResultArena.allocate(SteamAPICallCompleted_t.m_cubParam(callback));
                        var failed = callResultArena.allocate(C_BOOL, 1);
                        if (SteamAPI_ManualDispatch_GetAPICallResult(steamPipe, SteamAPICallCompleted_t.m_hAsyncCall(callback), tmpCallResult, SteamAPICallCompleted_t.m_cubParam(callback), SteamAPICallCompleted_t.m_iCallback(callback), failed)) {
                            System.out.println("callback dispatch");
                        }
                    }
                } else {
                    System.out.println("callback dispatch2 " + callbackId);
                }
                SteamAPI_ManualDispatch_FreeLastCallback(steamPipe);
            }
/**
 * HSteamPipe hSteamPipe = SteamAPI_GetHSteamPipe(); // See also SteamGameServer_GetHSteamPipe()
 * 	SteamAPI_ManualDispatch_RunFrame( hSteamPipe )
 * 	CallbackMsg_t callback;
 * 	while ( SteamAPI_ManualDispatch_GetNextCallback( hSteamPipe, &callback ) )
 * 	    {
 * 		// Check for dispatching API call results
 * 		if ( callback.m_iCallback == SteamAPICallCompleted_t::k_iCallback )
 *        {
 * 			SteamAPICallCompleted_t *pCallCompleted = (SteamAPICallCompleted_t *)callback.
 * 			void *pTmpCallResult = malloc( pCallback->m_cubParam );
 * 			bool bFailed;
 * 			if ( SteamAPI_ManualDispatch_GetAPICallResult( hSteamPipe, pCallCompleted->m_hAsyncCall, pTmpCallResult, pCallback->m_cubParam, pCallback->m_iCallback, &bFailed ) )
 *            {
 * 				// Dispatch the call result to the registered handler(s) for the
 * 				// call identified by pCallCompleted->m_hAsyncCall
 *            }
 * 			free( pTmpCallResult );
 *        }
 * 		else
 *        {
 * 			// Look at callback.m_iCallback to see what kind of callback it is,
 * 			// and dispatch to appropriate handler(s)
 *        }
 * 		SteamAPI_ManualDispatch_FreeLastCallback( hSteamPipe );
 *    }
 */
        }
    }

}
