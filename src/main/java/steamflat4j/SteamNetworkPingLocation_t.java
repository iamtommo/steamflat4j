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
 * struct SteamNetworkPingLocation_t {
 *     uint8 m_data[512];
 * }
 * }
 */
public class SteamNetworkPingLocation_t {

    SteamNetworkPingLocation_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(512, SteamFlat.C_CHAR).withName("m_data")
    ).withName("SteamNetworkPingLocation_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout m_data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static final SequenceLayout m_data$layout() {
        return m_data$LAYOUT;
    }

    private static final long m_data$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static final long m_data$offset() {
        return m_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static MemorySegment m_data(MemorySegment struct) {
        return struct.asSlice(m_data$OFFSET, m_data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static void m_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_data$OFFSET, m_data$LAYOUT.byteSize());
    }

    private static long[] m_data$DIMS = { 512 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static long[] m_data$dimensions() {
        return m_data$DIMS;
    }
    private static final VarHandle m_data$ELEM_HANDLE = m_data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static byte m_data(MemorySegment struct, long index0) {
        return (byte)m_data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8 m_data[512]
     * }
     */
    public static void m_data(MemorySegment struct, long index0, byte fieldValue) {
        m_data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
