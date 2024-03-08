package steamflat4j;

import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static steamflat4j.SteamFlat.*;
import static steamflat4j.SteamFlat_2.eServerModeNoAuthentication;
import static steamflat4j.SteamFlat_2.k_ESteamAPIInitResult_OK;
import static steamflat4j.SteamFlat_3.C_CHAR;

public class SteamGameServerTest {

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
            var version = arena.allocateFrom("0.0.0.1");
            var errMsg = arena.allocate(C_CHAR, 1024);

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

            var result = SteamInternal_GameServer_Init_V2(0,
                    (short) 8000, (short) 27017, eServerModeNoAuthentication(), version, versions, errMsg);
            if (result != k_ESteamAPIInitResult_OK()) {
                System.out.println("err: " + errMsg.getString(0));
            }
            assertEquals(k_ESteamAPIInitResult_OK(), result);

            var steamGameServer = SteamAPI_SteamGameServer_v015();
        }
    }
}
