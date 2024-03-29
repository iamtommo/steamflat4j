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
 * struct servernetadr_t {
 *     uint16 m_usConnectionPort;
 *     uint16 m_usQueryPort;
 *     uint32 m_unIP;
 * }
 * }
 */
public class servernetadr_t {

    servernetadr_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_SHORT.withName("m_usConnectionPort"),
        SteamFlat.C_SHORT.withName("m_usQueryPort"),
        SteamFlat.C_INT.withName("m_unIP")
    ).withName("servernetadr_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort m_usConnectionPort$LAYOUT = (OfShort)$LAYOUT.select(groupElement("m_usConnectionPort"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16 m_usConnectionPort
     * }
     */
    public static final OfShort m_usConnectionPort$layout() {
        return m_usConnectionPort$LAYOUT;
    }

    private static final long m_usConnectionPort$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16 m_usConnectionPort
     * }
     */
    public static final long m_usConnectionPort$offset() {
        return m_usConnectionPort$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16 m_usConnectionPort
     * }
     */
    public static short m_usConnectionPort(MemorySegment struct) {
        return struct.get(m_usConnectionPort$LAYOUT, m_usConnectionPort$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16 m_usConnectionPort
     * }
     */
    public static void m_usConnectionPort(MemorySegment struct, short fieldValue) {
        struct.set(m_usConnectionPort$LAYOUT, m_usConnectionPort$OFFSET, fieldValue);
    }

    private static final OfShort m_usQueryPort$LAYOUT = (OfShort)$LAYOUT.select(groupElement("m_usQueryPort"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16 m_usQueryPort
     * }
     */
    public static final OfShort m_usQueryPort$layout() {
        return m_usQueryPort$LAYOUT;
    }

    private static final long m_usQueryPort$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16 m_usQueryPort
     * }
     */
    public static final long m_usQueryPort$offset() {
        return m_usQueryPort$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16 m_usQueryPort
     * }
     */
    public static short m_usQueryPort(MemorySegment struct) {
        return struct.get(m_usQueryPort$LAYOUT, m_usQueryPort$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16 m_usQueryPort
     * }
     */
    public static void m_usQueryPort(MemorySegment struct, short fieldValue) {
        struct.set(m_usQueryPort$LAYOUT, m_usQueryPort$OFFSET, fieldValue);
    }

    private static final OfInt m_unIP$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unIP"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unIP
     * }
     */
    public static final OfInt m_unIP$layout() {
        return m_unIP$LAYOUT;
    }

    private static final long m_unIP$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unIP
     * }
     */
    public static final long m_unIP$offset() {
        return m_unIP$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unIP
     * }
     */
    public static int m_unIP(MemorySegment struct) {
        return struct.get(m_unIP$LAYOUT, m_unIP$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unIP
     * }
     */
    public static void m_unIP(MemorySegment struct, int fieldValue) {
        struct.set(m_unIP$LAYOUT, m_unIP$OFFSET, fieldValue);
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

