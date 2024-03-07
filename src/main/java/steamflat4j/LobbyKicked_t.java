// Generated by jextract

package steamflat4j;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct LobbyKicked_t {
 *     uint64 m_ulSteamIDLobby;
 *     uint64 m_ulSteamIDAdmin;
 *     uint8 m_bKickedDueToDisconnect;
 * }
 * }
 */
public class LobbyKicked_t {

    LobbyKicked_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_ulSteamIDLobby"),
        SteamFlat.C_LONG_LONG.withName("m_ulSteamIDAdmin"),
        SteamFlat.C_CHAR.withName("m_bKickedDueToDisconnect"),
        MemoryLayout.paddingLayout(7)
    ).withName("LobbyKicked_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_ulSteamIDLobby$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulSteamIDLobby"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDLobby
     * }
     */
    public static final OfLong m_ulSteamIDLobby$layout() {
        return m_ulSteamIDLobby$LAYOUT;
    }

    private static final long m_ulSteamIDLobby$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDLobby
     * }
     */
    public static final long m_ulSteamIDLobby$offset() {
        return m_ulSteamIDLobby$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDLobby
     * }
     */
    public static long m_ulSteamIDLobby(MemorySegment struct) {
        return struct.get(m_ulSteamIDLobby$LAYOUT, m_ulSteamIDLobby$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDLobby
     * }
     */
    public static void m_ulSteamIDLobby(MemorySegment struct, long fieldValue) {
        struct.set(m_ulSteamIDLobby$LAYOUT, m_ulSteamIDLobby$OFFSET, fieldValue);
    }

    private static final OfLong m_ulSteamIDAdmin$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulSteamIDAdmin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDAdmin
     * }
     */
    public static final OfLong m_ulSteamIDAdmin$layout() {
        return m_ulSteamIDAdmin$LAYOUT;
    }

    private static final long m_ulSteamIDAdmin$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDAdmin
     * }
     */
    public static final long m_ulSteamIDAdmin$offset() {
        return m_ulSteamIDAdmin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDAdmin
     * }
     */
    public static long m_ulSteamIDAdmin(MemorySegment struct) {
        return struct.get(m_ulSteamIDAdmin$LAYOUT, m_ulSteamIDAdmin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDAdmin
     * }
     */
    public static void m_ulSteamIDAdmin(MemorySegment struct, long fieldValue) {
        struct.set(m_ulSteamIDAdmin$LAYOUT, m_ulSteamIDAdmin$OFFSET, fieldValue);
    }

    private static final OfByte m_bKickedDueToDisconnect$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bKickedDueToDisconnect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bKickedDueToDisconnect
     * }
     */
    public static final OfByte m_bKickedDueToDisconnect$layout() {
        return m_bKickedDueToDisconnect$LAYOUT;
    }

    private static final long m_bKickedDueToDisconnect$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bKickedDueToDisconnect
     * }
     */
    public static final long m_bKickedDueToDisconnect$offset() {
        return m_bKickedDueToDisconnect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bKickedDueToDisconnect
     * }
     */
    public static byte m_bKickedDueToDisconnect(MemorySegment struct) {
        return struct.get(m_bKickedDueToDisconnect$LAYOUT, m_bKickedDueToDisconnect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bKickedDueToDisconnect
     * }
     */
    public static void m_bKickedDueToDisconnect(MemorySegment struct, byte fieldValue) {
        struct.set(m_bKickedDueToDisconnect$LAYOUT, m_bKickedDueToDisconnect$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
