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
 * struct FileDetailsResult_t {
 *     EResult m_eResult;
 *     uint64 m_ulFileSize;
 *     uint8 m_FileSHA[20];
 *     uint32 m_unFlags;
 * }
 * }
 */
public class FileDetailsResult_t {

    FileDetailsResult_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_eResult"),
        MemoryLayout.paddingLayout(4),
        SteamFlat.C_LONG_LONG.withName("m_ulFileSize"),
        MemoryLayout.sequenceLayout(20, SteamFlat.C_CHAR).withName("m_FileSHA"),
        SteamFlat.C_INT.withName("m_unFlags")
    ).withName("FileDetailsResult_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long m_eResult$OFFSET = 0;

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

    private static final OfLong m_ulFileSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ulFileSize
     * }
     */
    public static final OfLong m_ulFileSize$layout() {
        return m_ulFileSize$LAYOUT;
    }

    private static final long m_ulFileSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ulFileSize
     * }
     */
    public static final long m_ulFileSize$offset() {
        return m_ulFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ulFileSize
     * }
     */
    public static long m_ulFileSize(MemorySegment struct) {
        return struct.get(m_ulFileSize$LAYOUT, m_ulFileSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ulFileSize
     * }
     */
    public static void m_ulFileSize(MemorySegment struct, long fieldValue) {
        struct.set(m_ulFileSize$LAYOUT, m_ulFileSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_FileSHA$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_FileSHA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static final SequenceLayout m_FileSHA$layout() {
        return m_FileSHA$LAYOUT;
    }

    private static final long m_FileSHA$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static final long m_FileSHA$offset() {
        return m_FileSHA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static MemorySegment m_FileSHA(MemorySegment struct) {
        return struct.asSlice(m_FileSHA$OFFSET, m_FileSHA$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static void m_FileSHA(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_FileSHA$OFFSET, m_FileSHA$LAYOUT.byteSize());
    }

    private static long[] m_FileSHA$DIMS = { 20 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static long[] m_FileSHA$dimensions() {
        return m_FileSHA$DIMS;
    }
    private static final VarHandle m_FileSHA$ELEM_HANDLE = m_FileSHA$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static byte m_FileSHA(MemorySegment struct, long index0) {
        return (byte)m_FileSHA$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8 m_FileSHA[20]
     * }
     */
    public static void m_FileSHA(MemorySegment struct, long index0, byte fieldValue) {
        m_FileSHA$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt m_unFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unFlags
     * }
     */
    public static final OfInt m_unFlags$layout() {
        return m_unFlags$LAYOUT;
    }

    private static final long m_unFlags$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unFlags
     * }
     */
    public static final long m_unFlags$offset() {
        return m_unFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unFlags
     * }
     */
    public static int m_unFlags(MemorySegment struct) {
        return struct.get(m_unFlags$LAYOUT, m_unFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unFlags
     * }
     */
    public static void m_unFlags(MemorySegment struct, int fieldValue) {
        struct.set(m_unFlags$LAYOUT, m_unFlags$OFFSET, fieldValue);
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
