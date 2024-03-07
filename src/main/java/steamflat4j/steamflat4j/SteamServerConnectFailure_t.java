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
 * struct SteamServerConnectFailure_t {
 *     EResult m_eResult;
 *     bool m_bStillRetrying;
 * }
 * }
 */
public class SteamServerConnectFailure_t {

    SteamServerConnectFailure_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("m_eResult"),
        SteamFlat4j.C_BOOL.withName("m_bStillRetrying"),
        MemoryLayout.paddingLayout(3)
    ).withName("SteamServerConnectFailure_t");

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

    private static final OfBoolean m_bStillRetrying$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bStillRetrying"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bStillRetrying
     * }
     */
    public static final OfBoolean m_bStillRetrying$layout() {
        return m_bStillRetrying$LAYOUT;
    }

    private static final long m_bStillRetrying$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bStillRetrying
     * }
     */
    public static final long m_bStillRetrying$offset() {
        return m_bStillRetrying$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bStillRetrying
     * }
     */
    public static boolean m_bStillRetrying(MemorySegment struct) {
        return struct.get(m_bStillRetrying$LAYOUT, m_bStillRetrying$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bStillRetrying
     * }
     */
    public static void m_bStillRetrying(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bStillRetrying$LAYOUT, m_bStillRetrying$OFFSET, fieldValue);
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

