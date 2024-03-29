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
 * struct SteamNetAuthenticationStatus_t {
 *     ESteamNetworkingAvailability m_eAvail;
 *     char m_debugMsg[256];
 * }
 * }
 */
public class SteamNetAuthenticationStatus_t {

    SteamNetAuthenticationStatus_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_eAvail"),
        MemoryLayout.sequenceLayout(256, SteamFlat.C_CHAR).withName("m_debugMsg")
    ).withName("SteamNetAuthenticationStatus_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_eAvail$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eAvail"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ESteamNetworkingAvailability m_eAvail
     * }
     */
    public static final OfInt m_eAvail$layout() {
        return m_eAvail$LAYOUT;
    }

    private static final long m_eAvail$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ESteamNetworkingAvailability m_eAvail
     * }
     */
    public static final long m_eAvail$offset() {
        return m_eAvail$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ESteamNetworkingAvailability m_eAvail
     * }
     */
    public static int m_eAvail(MemorySegment struct) {
        return struct.get(m_eAvail$LAYOUT, m_eAvail$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ESteamNetworkingAvailability m_eAvail
     * }
     */
    public static void m_eAvail(MemorySegment struct, int fieldValue) {
        struct.set(m_eAvail$LAYOUT, m_eAvail$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_debugMsg$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_debugMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static final SequenceLayout m_debugMsg$layout() {
        return m_debugMsg$LAYOUT;
    }

    private static final long m_debugMsg$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static final long m_debugMsg$offset() {
        return m_debugMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static MemorySegment m_debugMsg(MemorySegment struct) {
        return struct.asSlice(m_debugMsg$OFFSET, m_debugMsg$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static void m_debugMsg(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_debugMsg$OFFSET, m_debugMsg$LAYOUT.byteSize());
    }

    private static long[] m_debugMsg$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static long[] m_debugMsg$dimensions() {
        return m_debugMsg$DIMS;
    }
    private static final VarHandle m_debugMsg$ELEM_HANDLE = m_debugMsg$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static byte m_debugMsg(MemorySegment struct, long index0) {
        return (byte)m_debugMsg$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_debugMsg[256]
     * }
     */
    public static void m_debugMsg(MemorySegment struct, long index0, byte fieldValue) {
        m_debugMsg$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

