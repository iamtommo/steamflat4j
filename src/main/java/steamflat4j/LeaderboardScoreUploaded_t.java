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
 * struct LeaderboardScoreUploaded_t {
 *     uint8 m_bSuccess;
 *     SteamLeaderboard_t m_hSteamLeaderboard;
 *     int32 m_nScore;
 *     uint8 m_bScoreChanged;
 *     int m_nGlobalRankNew;
 *     int m_nGlobalRankPrevious;
 * }
 * }
 */
public class LeaderboardScoreUploaded_t {

    LeaderboardScoreUploaded_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_CHAR.withName("m_bSuccess"),
        MemoryLayout.paddingLayout(7),
        SteamFlat.C_LONG_LONG.withName("m_hSteamLeaderboard"),
        SteamFlat.C_INT.withName("m_nScore"),
        SteamFlat.C_CHAR.withName("m_bScoreChanged"),
        MemoryLayout.paddingLayout(3),
        SteamFlat.C_INT.withName("m_nGlobalRankNew"),
        SteamFlat.C_INT.withName("m_nGlobalRankPrevious")
    ).withName("LeaderboardScoreUploaded_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long m_bSuccess$OFFSET = 0;

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

    private static final OfLong m_hSteamLeaderboard$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_hSteamLeaderboard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamLeaderboard_t m_hSteamLeaderboard
     * }
     */
    public static final OfLong m_hSteamLeaderboard$layout() {
        return m_hSteamLeaderboard$LAYOUT;
    }

    private static final long m_hSteamLeaderboard$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamLeaderboard_t m_hSteamLeaderboard
     * }
     */
    public static final long m_hSteamLeaderboard$offset() {
        return m_hSteamLeaderboard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamLeaderboard_t m_hSteamLeaderboard
     * }
     */
    public static long m_hSteamLeaderboard(MemorySegment struct) {
        return struct.get(m_hSteamLeaderboard$LAYOUT, m_hSteamLeaderboard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamLeaderboard_t m_hSteamLeaderboard
     * }
     */
    public static void m_hSteamLeaderboard(MemorySegment struct, long fieldValue) {
        struct.set(m_hSteamLeaderboard$LAYOUT, m_hSteamLeaderboard$OFFSET, fieldValue);
    }

    private static final OfInt m_nScore$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nScore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_nScore
     * }
     */
    public static final OfInt m_nScore$layout() {
        return m_nScore$LAYOUT;
    }

    private static final long m_nScore$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_nScore
     * }
     */
    public static final long m_nScore$offset() {
        return m_nScore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_nScore
     * }
     */
    public static int m_nScore(MemorySegment struct) {
        return struct.get(m_nScore$LAYOUT, m_nScore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_nScore
     * }
     */
    public static void m_nScore(MemorySegment struct, int fieldValue) {
        struct.set(m_nScore$LAYOUT, m_nScore$OFFSET, fieldValue);
    }

    private static final OfByte m_bScoreChanged$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bScoreChanged"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bScoreChanged
     * }
     */
    public static final OfByte m_bScoreChanged$layout() {
        return m_bScoreChanged$LAYOUT;
    }

    private static final long m_bScoreChanged$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bScoreChanged
     * }
     */
    public static final long m_bScoreChanged$offset() {
        return m_bScoreChanged$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bScoreChanged
     * }
     */
    public static byte m_bScoreChanged(MemorySegment struct) {
        return struct.get(m_bScoreChanged$LAYOUT, m_bScoreChanged$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bScoreChanged
     * }
     */
    public static void m_bScoreChanged(MemorySegment struct, byte fieldValue) {
        struct.set(m_bScoreChanged$LAYOUT, m_bScoreChanged$OFFSET, fieldValue);
    }

    private static final OfInt m_nGlobalRankNew$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nGlobalRankNew"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nGlobalRankNew
     * }
     */
    public static final OfInt m_nGlobalRankNew$layout() {
        return m_nGlobalRankNew$LAYOUT;
    }

    private static final long m_nGlobalRankNew$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nGlobalRankNew
     * }
     */
    public static final long m_nGlobalRankNew$offset() {
        return m_nGlobalRankNew$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nGlobalRankNew
     * }
     */
    public static int m_nGlobalRankNew(MemorySegment struct) {
        return struct.get(m_nGlobalRankNew$LAYOUT, m_nGlobalRankNew$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nGlobalRankNew
     * }
     */
    public static void m_nGlobalRankNew(MemorySegment struct, int fieldValue) {
        struct.set(m_nGlobalRankNew$LAYOUT, m_nGlobalRankNew$OFFSET, fieldValue);
    }

    private static final OfInt m_nGlobalRankPrevious$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nGlobalRankPrevious"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nGlobalRankPrevious
     * }
     */
    public static final OfInt m_nGlobalRankPrevious$layout() {
        return m_nGlobalRankPrevious$LAYOUT;
    }

    private static final long m_nGlobalRankPrevious$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nGlobalRankPrevious
     * }
     */
    public static final long m_nGlobalRankPrevious$offset() {
        return m_nGlobalRankPrevious$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nGlobalRankPrevious
     * }
     */
    public static int m_nGlobalRankPrevious(MemorySegment struct) {
        return struct.get(m_nGlobalRankPrevious$LAYOUT, m_nGlobalRankPrevious$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nGlobalRankPrevious
     * }
     */
    public static void m_nGlobalRankPrevious(MemorySegment struct, int fieldValue) {
        struct.set(m_nGlobalRankPrevious$LAYOUT, m_nGlobalRankPrevious$OFFSET, fieldValue);
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

