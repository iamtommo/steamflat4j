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
 * struct SteamNetworkingIdentity {
 *     ESteamNetworkingIdentityType m_eType;
 *     int m_cbSize;
 *     char m_szUnknownRawString[128];
 * }
 * }
 */
public class SteamNetworkingIdentity {

    SteamNetworkingIdentity() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_eType"),
        SteamFlat.C_INT.withName("m_cbSize"),
        MemoryLayout.sequenceLayout(128, SteamFlat.C_CHAR).withName("m_szUnknownRawString")
    ).withName("SteamNetworkingIdentity");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_eType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ESteamNetworkingIdentityType m_eType
     * }
     */
    public static final OfInt m_eType$layout() {
        return m_eType$LAYOUT;
    }

    private static final long m_eType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ESteamNetworkingIdentityType m_eType
     * }
     */
    public static final long m_eType$offset() {
        return m_eType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ESteamNetworkingIdentityType m_eType
     * }
     */
    public static int m_eType(MemorySegment struct) {
        return struct.get(m_eType$LAYOUT, m_eType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ESteamNetworkingIdentityType m_eType
     * }
     */
    public static void m_eType(MemorySegment struct, int fieldValue) {
        struct.set(m_eType$LAYOUT, m_eType$OFFSET, fieldValue);
    }

    private static final OfInt m_cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static final OfInt m_cbSize$layout() {
        return m_cbSize$LAYOUT;
    }

    private static final long m_cbSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static final long m_cbSize$offset() {
        return m_cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static int m_cbSize(MemorySegment struct) {
        return struct.get(m_cbSize$LAYOUT, m_cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static void m_cbSize(MemorySegment struct, int fieldValue) {
        struct.set(m_cbSize$LAYOUT, m_cbSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_szUnknownRawString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_szUnknownRawString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static final SequenceLayout m_szUnknownRawString$layout() {
        return m_szUnknownRawString$LAYOUT;
    }

    private static final long m_szUnknownRawString$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static final long m_szUnknownRawString$offset() {
        return m_szUnknownRawString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static MemorySegment m_szUnknownRawString(MemorySegment struct) {
        return struct.asSlice(m_szUnknownRawString$OFFSET, m_szUnknownRawString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static void m_szUnknownRawString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_szUnknownRawString$OFFSET, m_szUnknownRawString$LAYOUT.byteSize());
    }

    private static long[] m_szUnknownRawString$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static long[] m_szUnknownRawString$dimensions() {
        return m_szUnknownRawString$DIMS;
    }
    private static final VarHandle m_szUnknownRawString$ELEM_HANDLE = m_szUnknownRawString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static byte m_szUnknownRawString(MemorySegment struct, long index0) {
        return (byte)m_szUnknownRawString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_szUnknownRawString[128]
     * }
     */
    public static void m_szUnknownRawString(MemorySegment struct, long index0, byte fieldValue) {
        m_szUnknownRawString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

