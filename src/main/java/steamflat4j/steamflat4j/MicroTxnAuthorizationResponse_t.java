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
 * struct MicroTxnAuthorizationResponse_t {
 *     uint32 m_unAppID;
 *     uint64 m_ulOrderID;
 *     uint8 m_bAuthorized;
 * }
 * }
 */
public class MicroTxnAuthorizationResponse_t {

    MicroTxnAuthorizationResponse_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("m_unAppID"),
        MemoryLayout.paddingLayout(4),
        SteamFlat4j.C_LONG_LONG.withName("m_ulOrderID"),
        SteamFlat4j.C_CHAR.withName("m_bAuthorized"),
        MemoryLayout.paddingLayout(7)
    ).withName("MicroTxnAuthorizationResponse_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_unAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unAppID
     * }
     */
    public static final OfInt m_unAppID$layout() {
        return m_unAppID$LAYOUT;
    }

    private static final long m_unAppID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unAppID
     * }
     */
    public static final long m_unAppID$offset() {
        return m_unAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unAppID
     * }
     */
    public static int m_unAppID(MemorySegment struct) {
        return struct.get(m_unAppID$LAYOUT, m_unAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unAppID
     * }
     */
    public static void m_unAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_unAppID$LAYOUT, m_unAppID$OFFSET, fieldValue);
    }

    private static final OfLong m_ulOrderID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulOrderID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ulOrderID
     * }
     */
    public static final OfLong m_ulOrderID$layout() {
        return m_ulOrderID$LAYOUT;
    }

    private static final long m_ulOrderID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ulOrderID
     * }
     */
    public static final long m_ulOrderID$offset() {
        return m_ulOrderID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ulOrderID
     * }
     */
    public static long m_ulOrderID(MemorySegment struct) {
        return struct.get(m_ulOrderID$LAYOUT, m_ulOrderID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ulOrderID
     * }
     */
    public static void m_ulOrderID(MemorySegment struct, long fieldValue) {
        struct.set(m_ulOrderID$LAYOUT, m_ulOrderID$OFFSET, fieldValue);
    }

    private static final OfByte m_bAuthorized$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bAuthorized"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bAuthorized
     * }
     */
    public static final OfByte m_bAuthorized$layout() {
        return m_bAuthorized$LAYOUT;
    }

    private static final long m_bAuthorized$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bAuthorized
     * }
     */
    public static final long m_bAuthorized$offset() {
        return m_bAuthorized$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bAuthorized
     * }
     */
    public static byte m_bAuthorized(MemorySegment struct) {
        return struct.get(m_bAuthorized$LAYOUT, m_bAuthorized$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bAuthorized
     * }
     */
    public static void m_bAuthorized(MemorySegment struct, byte fieldValue) {
        struct.set(m_bAuthorized$LAYOUT, m_bAuthorized$OFFSET, fieldValue);
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

