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
 * struct UserAchievementIconFetched_t {
 *     CGameID m_nGameID;
 *     char m_rgchAchievementName[128];
 *     bool m_bAchieved;
 *     int m_nIconHandle;
 * }
 * }
 */
public class UserAchievementIconFetched_t {

    UserAchievementIconFetched_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_LONG_LONG.withName("m_nGameID"),
        MemoryLayout.sequenceLayout(128, SteamFlat4j.C_CHAR).withName("m_rgchAchievementName"),
        SteamFlat4j.C_BOOL.withName("m_bAchieved"),
        MemoryLayout.paddingLayout(3),
        SteamFlat4j.C_INT.withName("m_nIconHandle")
    ).withName("UserAchievementIconFetched_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_nGameID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_nGameID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CGameID m_nGameID
     * }
     */
    public static final OfLong m_nGameID$layout() {
        return m_nGameID$LAYOUT;
    }

    private static final long m_nGameID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CGameID m_nGameID
     * }
     */
    public static final long m_nGameID$offset() {
        return m_nGameID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CGameID m_nGameID
     * }
     */
    public static long m_nGameID(MemorySegment struct) {
        return struct.get(m_nGameID$LAYOUT, m_nGameID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CGameID m_nGameID
     * }
     */
    public static void m_nGameID(MemorySegment struct, long fieldValue) {
        struct.set(m_nGameID$LAYOUT, m_nGameID$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_rgchAchievementName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchAchievementName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static final SequenceLayout m_rgchAchievementName$layout() {
        return m_rgchAchievementName$LAYOUT;
    }

    private static final long m_rgchAchievementName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static final long m_rgchAchievementName$offset() {
        return m_rgchAchievementName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static MemorySegment m_rgchAchievementName(MemorySegment struct) {
        return struct.asSlice(m_rgchAchievementName$OFFSET, m_rgchAchievementName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static void m_rgchAchievementName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchAchievementName$OFFSET, m_rgchAchievementName$LAYOUT.byteSize());
    }

    private static long[] m_rgchAchievementName$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static long[] m_rgchAchievementName$dimensions() {
        return m_rgchAchievementName$DIMS;
    }
    private static final VarHandle m_rgchAchievementName$ELEM_HANDLE = m_rgchAchievementName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static byte m_rgchAchievementName(MemorySegment struct, long index0) {
        return (byte)m_rgchAchievementName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchAchievementName[128]
     * }
     */
    public static void m_rgchAchievementName(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchAchievementName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfBoolean m_bAchieved$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bAchieved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bAchieved
     * }
     */
    public static final OfBoolean m_bAchieved$layout() {
        return m_bAchieved$LAYOUT;
    }

    private static final long m_bAchieved$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bAchieved
     * }
     */
    public static final long m_bAchieved$offset() {
        return m_bAchieved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bAchieved
     * }
     */
    public static boolean m_bAchieved(MemorySegment struct) {
        return struct.get(m_bAchieved$LAYOUT, m_bAchieved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bAchieved
     * }
     */
    public static void m_bAchieved(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bAchieved$LAYOUT, m_bAchieved$OFFSET, fieldValue);
    }

    private static final OfInt m_nIconHandle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nIconHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nIconHandle
     * }
     */
    public static final OfInt m_nIconHandle$layout() {
        return m_nIconHandle$LAYOUT;
    }

    private static final long m_nIconHandle$OFFSET = 140;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nIconHandle
     * }
     */
    public static final long m_nIconHandle$offset() {
        return m_nIconHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nIconHandle
     * }
     */
    public static int m_nIconHandle(MemorySegment struct) {
        return struct.get(m_nIconHandle$LAYOUT, m_nIconHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nIconHandle
     * }
     */
    public static void m_nIconHandle(MemorySegment struct, int fieldValue) {
        struct.set(m_nIconHandle$LAYOUT, m_nIconHandle$OFFSET, fieldValue);
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

