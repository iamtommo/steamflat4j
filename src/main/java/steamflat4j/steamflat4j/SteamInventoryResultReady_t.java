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
 * struct SteamInventoryResultReady_t {
 *     SteamInventoryResult_t m_handle;
 *     EResult m_result;
 * }
 * }
 */
public class SteamInventoryResultReady_t {

    SteamInventoryResultReady_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("m_handle"),
        SteamFlat4j.C_INT.withName("m_result")
    ).withName("SteamInventoryResultReady_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_handle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_handle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamInventoryResult_t m_handle
     * }
     */
    public static final OfInt m_handle$layout() {
        return m_handle$LAYOUT;
    }

    private static final long m_handle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamInventoryResult_t m_handle
     * }
     */
    public static final long m_handle$offset() {
        return m_handle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamInventoryResult_t m_handle
     * }
     */
    public static int m_handle(MemorySegment struct) {
        return struct.get(m_handle$LAYOUT, m_handle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamInventoryResult_t m_handle
     * }
     */
    public static void m_handle(MemorySegment struct, int fieldValue) {
        struct.set(m_handle$LAYOUT, m_handle$OFFSET, fieldValue);
    }

    private static final OfInt m_result$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_result"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EResult m_result
     * }
     */
    public static final OfInt m_result$layout() {
        return m_result$LAYOUT;
    }

    private static final long m_result$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EResult m_result
     * }
     */
    public static final long m_result$offset() {
        return m_result$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EResult m_result
     * }
     */
    public static int m_result(MemorySegment struct) {
        return struct.get(m_result$LAYOUT, m_result$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EResult m_result
     * }
     */
    public static void m_result(MemorySegment struct, int fieldValue) {
        struct.set(m_result$LAYOUT, m_result$OFFSET, fieldValue);
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

