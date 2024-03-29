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
 * struct GameServerChangeRequested_t {
 *     char m_rgchServer[64];
 *     char m_rgchPassword[64];
 * }
 * }
 */
public class GameServerChangeRequested_t {

    GameServerChangeRequested_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(64, SteamFlat.C_CHAR).withName("m_rgchServer"),
        MemoryLayout.sequenceLayout(64, SteamFlat.C_CHAR).withName("m_rgchPassword")
    ).withName("GameServerChangeRequested_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout m_rgchServer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchServer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static final SequenceLayout m_rgchServer$layout() {
        return m_rgchServer$LAYOUT;
    }

    private static final long m_rgchServer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static final long m_rgchServer$offset() {
        return m_rgchServer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static MemorySegment m_rgchServer(MemorySegment struct) {
        return struct.asSlice(m_rgchServer$OFFSET, m_rgchServer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static void m_rgchServer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchServer$OFFSET, m_rgchServer$LAYOUT.byteSize());
    }

    private static long[] m_rgchServer$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static long[] m_rgchServer$dimensions() {
        return m_rgchServer$DIMS;
    }
    private static final VarHandle m_rgchServer$ELEM_HANDLE = m_rgchServer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static byte m_rgchServer(MemorySegment struct, long index0) {
        return (byte)m_rgchServer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchServer[64]
     * }
     */
    public static void m_rgchServer(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchServer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout m_rgchPassword$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchPassword"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static final SequenceLayout m_rgchPassword$layout() {
        return m_rgchPassword$LAYOUT;
    }

    private static final long m_rgchPassword$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static final long m_rgchPassword$offset() {
        return m_rgchPassword$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static MemorySegment m_rgchPassword(MemorySegment struct) {
        return struct.asSlice(m_rgchPassword$OFFSET, m_rgchPassword$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static void m_rgchPassword(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchPassword$OFFSET, m_rgchPassword$LAYOUT.byteSize());
    }

    private static long[] m_rgchPassword$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static long[] m_rgchPassword$dimensions() {
        return m_rgchPassword$DIMS;
    }
    private static final VarHandle m_rgchPassword$ELEM_HANDLE = m_rgchPassword$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static byte m_rgchPassword(MemorySegment struct, long index0) {
        return (byte)m_rgchPassword$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchPassword[64]
     * }
     */
    public static void m_rgchPassword(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchPassword$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

