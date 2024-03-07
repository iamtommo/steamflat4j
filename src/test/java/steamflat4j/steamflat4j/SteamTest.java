package steamflat4j.steamflat4j;

import org.junit.jupiter.api.Test;
import steamflat4j.SteamFlat4j;

import java.lang.foreign.Arena;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static steamflat4j.SteamFlat4j.*;
import static steamflat4j.SteamFlat4j_1.*;
import static steamflat4j.SteamFlat4j_2.C_CHAR;
import static steamflat4j.SteamFlat4j_2.k_ESteamAPIInitResult_OK;
import static steamflat4j.SteamFlat4j_3.C_CHAR;
import static steamflat4j.SteamFlat4j_3.C_LONG;

public class SteamTest {

    static {
        System.load(Path.of("lib/steam_api64.dll").toAbsolutePath().toString());
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

            var user = SteamAPI_SteamUser_v023();
            //var user3 = SteamAPI_ISteamUser_GetHSteamUser();

            //var ver = arena.allocateFrom("SteamClient017");
            //var steamclient = SteamInternal_CreateInterface(ver);
            //var steampipe = SteamAPI_GetHSteamPipe();

            //var userVer = arena.allocateFrom("SteamUser023");
            //SteamAPI_ISteamClient_GetISteamUser((int) steamclient.address(), steampipe, userVer);

            var steamId = SteamAPI_ISteamUser_GetSteamID(user);
            System.out.println("steamId " + steamId);
            //assertNotEquals(0L, steamId);
        }
    }

}
