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
 * struct SearchForGameProgressCallback_t {
 *     uint64 m_ullSearchID;
 *     EResult m_eResult;
 *     CSteamID m_lobbyID;
 *     CSteamID m_steamIDEndedSearch;
 *     int32 m_nSecondsRemainingEstimate;
 *     int32 m_cPlayersSearching;
 * }
 * }
 */
public class SearchForGameProgressCallback_t {

    SearchForGameProgressCallback_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_ullSearchID"),
        SteamFlat.C_INT.withName("m_eResult"),
        MemoryLayout.paddingLayout(4),
        SteamFlat.C_LONG_LONG.withName("m_lobbyID"),
        SteamFlat.C_LONG_LONG.withName("m_steamIDEndedSearch"),
        SteamFlat.C_INT.withName("m_nSecondsRemainingEstimate"),
        SteamFlat.C_INT.withName("m_cPlayersSearching")
    ).withName("SearchForGameProgressCallback_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_ullSearchID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ullSearchID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ullSearchID
     * }
     */
    public static final OfLong m_ullSearchID$layout() {
        return m_ullSearchID$LAYOUT;
    }

    private static final long m_ullSearchID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ullSearchID
     * }
     */
    public static final long m_ullSearchID$offset() {
        return m_ullSearchID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ullSearchID
     * }
     */
    public static long m_ullSearchID(MemorySegment struct) {
        return struct.get(m_ullSearchID$LAYOUT, m_ullSearchID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ullSearchID
     * }
     */
    public static void m_ullSearchID(MemorySegment struct, long fieldValue) {
        struct.set(m_ullSearchID$LAYOUT, m_ullSearchID$OFFSET, fieldValue);
    }

    private static final OfInt m_eResult$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eResult"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static final OfInt m_eResult$layout() {
        return m_eResult$LAYOUT;
    }

    private static final long m_eResult$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static final long m_eResult$offset() {
        return m_eResult$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static int m_eResult(MemorySegment struct) {
        return struct.get(m_eResult$LAYOUT, m_eResult$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static void m_eResult(MemorySegment struct, int fieldValue) {
        struct.set(m_eResult$LAYOUT, m_eResult$OFFSET, fieldValue);
    }

    private static final OfLong m_lobbyID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_lobbyID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_lobbyID
     * }
     */
    public static final OfLong m_lobbyID$layout() {
        return m_lobbyID$LAYOUT;
    }

    private static final long m_lobbyID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_lobbyID
     * }
     */
    public static final long m_lobbyID$offset() {
        return m_lobbyID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_lobbyID
     * }
     */
    public static long m_lobbyID(MemorySegment struct) {
        return struct.get(m_lobbyID$LAYOUT, m_lobbyID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_lobbyID
     * }
     */
    public static void m_lobbyID(MemorySegment struct, long fieldValue) {
        struct.set(m_lobbyID$LAYOUT, m_lobbyID$OFFSET, fieldValue);
    }

    private static final OfLong m_steamIDEndedSearch$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_steamIDEndedSearch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDEndedSearch
     * }
     */
    public static final OfLong m_steamIDEndedSearch$layout() {
        return m_steamIDEndedSearch$LAYOUT;
    }

    private static final long m_steamIDEndedSearch$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDEndedSearch
     * }
     */
    public static final long m_steamIDEndedSearch$offset() {
        return m_steamIDEndedSearch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDEndedSearch
     * }
     */
    public static long m_steamIDEndedSearch(MemorySegment struct) {
        return struct.get(m_steamIDEndedSearch$LAYOUT, m_steamIDEndedSearch$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDEndedSearch
     * }
     */
    public static void m_steamIDEndedSearch(MemorySegment struct, long fieldValue) {
        struct.set(m_steamIDEndedSearch$LAYOUT, m_steamIDEndedSearch$OFFSET, fieldValue);
    }

    private static final OfInt m_nSecondsRemainingEstimate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nSecondsRemainingEstimate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_nSecondsRemainingEstimate
     * }
     */
    public static final OfInt m_nSecondsRemainingEstimate$layout() {
        return m_nSecondsRemainingEstimate$LAYOUT;
    }

    private static final long m_nSecondsRemainingEstimate$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_nSecondsRemainingEstimate
     * }
     */
    public static final long m_nSecondsRemainingEstimate$offset() {
        return m_nSecondsRemainingEstimate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_nSecondsRemainingEstimate
     * }
     */
    public static int m_nSecondsRemainingEstimate(MemorySegment struct) {
        return struct.get(m_nSecondsRemainingEstimate$LAYOUT, m_nSecondsRemainingEstimate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_nSecondsRemainingEstimate
     * }
     */
    public static void m_nSecondsRemainingEstimate(MemorySegment struct, int fieldValue) {
        struct.set(m_nSecondsRemainingEstimate$LAYOUT, m_nSecondsRemainingEstimate$OFFSET, fieldValue);
    }

    private static final OfInt m_cPlayersSearching$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_cPlayersSearching"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_cPlayersSearching
     * }
     */
    public static final OfInt m_cPlayersSearching$layout() {
        return m_cPlayersSearching$LAYOUT;
    }

    private static final long m_cPlayersSearching$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_cPlayersSearching
     * }
     */
    public static final long m_cPlayersSearching$offset() {
        return m_cPlayersSearching$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_cPlayersSearching
     * }
     */
    public static int m_cPlayersSearching(MemorySegment struct) {
        return struct.get(m_cPlayersSearching$LAYOUT, m_cPlayersSearching$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_cPlayersSearching
     * }
     */
    public static void m_cPlayersSearching(MemorySegment struct, int fieldValue) {
        struct.set(m_cPlayersSearching$LAYOUT, m_cPlayersSearching$OFFSET, fieldValue);
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

