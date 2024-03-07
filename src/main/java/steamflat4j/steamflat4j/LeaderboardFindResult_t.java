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
 * struct LeaderboardFindResult_t {
 *     SteamLeaderboard_t m_hSteamLeaderboard;
 *     uint8 m_bLeaderboardFound;
 * }
 * }
 */
public class LeaderboardFindResult_t {

    LeaderboardFindResult_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_LONG_LONG.withName("m_hSteamLeaderboard"),
        SteamFlat4j.C_CHAR.withName("m_bLeaderboardFound"),
        MemoryLayout.paddingLayout(7)
    ).withName("LeaderboardFindResult_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long m_hSteamLeaderboard$OFFSET = 0;

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

    private static final OfByte m_bLeaderboardFound$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bLeaderboardFound"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bLeaderboardFound
     * }
     */
    public static final OfByte m_bLeaderboardFound$layout() {
        return m_bLeaderboardFound$LAYOUT;
    }

    private static final long m_bLeaderboardFound$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bLeaderboardFound
     * }
     */
    public static final long m_bLeaderboardFound$offset() {
        return m_bLeaderboardFound$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bLeaderboardFound
     * }
     */
    public static byte m_bLeaderboardFound(MemorySegment struct) {
        return struct.get(m_bLeaderboardFound$LAYOUT, m_bLeaderboardFound$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bLeaderboardFound
     * }
     */
    public static void m_bLeaderboardFound(MemorySegment struct, byte fieldValue) {
        struct.set(m_bLeaderboardFound$LAYOUT, m_bLeaderboardFound$OFFSET, fieldValue);
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

