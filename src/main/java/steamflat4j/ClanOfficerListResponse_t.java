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
 * struct ClanOfficerListResponse_t {
 *     CSteamID m_steamIDClan;
 *     int m_cOfficers;
 *     uint8 m_bSuccess;
 * }
 * }
 */
public class ClanOfficerListResponse_t {

    ClanOfficerListResponse_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_steamIDClan"),
        SteamFlat.C_INT.withName("m_cOfficers"),
        SteamFlat.C_CHAR.withName("m_bSuccess"),
        MemoryLayout.paddingLayout(3)
    ).withName("ClanOfficerListResponse_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_steamIDClan$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_steamIDClan"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDClan
     * }
     */
    public static final OfLong m_steamIDClan$layout() {
        return m_steamIDClan$LAYOUT;
    }

    private static final long m_steamIDClan$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDClan
     * }
     */
    public static final long m_steamIDClan$offset() {
        return m_steamIDClan$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDClan
     * }
     */
    public static long m_steamIDClan(MemorySegment struct) {
        return struct.get(m_steamIDClan$LAYOUT, m_steamIDClan$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDClan
     * }
     */
    public static void m_steamIDClan(MemorySegment struct, long fieldValue) {
        struct.set(m_steamIDClan$LAYOUT, m_steamIDClan$OFFSET, fieldValue);
    }

    private static final OfInt m_cOfficers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_cOfficers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_cOfficers
     * }
     */
    public static final OfInt m_cOfficers$layout() {
        return m_cOfficers$LAYOUT;
    }

    private static final long m_cOfficers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_cOfficers
     * }
     */
    public static final long m_cOfficers$offset() {
        return m_cOfficers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_cOfficers
     * }
     */
    public static int m_cOfficers(MemorySegment struct) {
        return struct.get(m_cOfficers$LAYOUT, m_cOfficers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_cOfficers
     * }
     */
    public static void m_cOfficers(MemorySegment struct, int fieldValue) {
        struct.set(m_cOfficers$LAYOUT, m_cOfficers$OFFSET, fieldValue);
    }

    private static final OfByte m_bSuccess$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bSuccess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bSuccess
     * }
     */
    public static final OfByte m_bSuccess$layout() {
        return m_bSuccess$LAYOUT;
    }

    private static final long m_bSuccess$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bSuccess
     * }
     */
    public static final long m_bSuccess$offset() {
        return m_bSuccess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bSuccess
     * }
     */
    public static byte m_bSuccess(MemorySegment struct) {
        return struct.get(m_bSuccess$LAYOUT, m_bSuccess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bSuccess
     * }
     */
    public static void m_bSuccess(MemorySegment struct, byte fieldValue) {
        struct.set(m_bSuccess$LAYOUT, m_bSuccess$OFFSET, fieldValue);
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
