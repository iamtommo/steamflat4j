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
 * struct GSClientKick_t {
 *     CSteamID m_SteamID;
 *     EDenyReason m_eDenyReason;
 * }
 * }
 */
public class GSClientKick_t {

    GSClientKick_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_SteamID"),
        SteamFlat.C_INT.withName("m_eDenyReason"),
        MemoryLayout.paddingLayout(4)
    ).withName("GSClientKick_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_SteamID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_SteamID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_SteamID
     * }
     */
    public static final OfLong m_SteamID$layout() {
        return m_SteamID$LAYOUT;
    }

    private static final long m_SteamID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_SteamID
     * }
     */
    public static final long m_SteamID$offset() {
        return m_SteamID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_SteamID
     * }
     */
    public static long m_SteamID(MemorySegment struct) {
        return struct.get(m_SteamID$LAYOUT, m_SteamID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_SteamID
     * }
     */
    public static void m_SteamID(MemorySegment struct, long fieldValue) {
        struct.set(m_SteamID$LAYOUT, m_SteamID$OFFSET, fieldValue);
    }

    private static final OfInt m_eDenyReason$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eDenyReason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EDenyReason m_eDenyReason
     * }
     */
    public static final OfInt m_eDenyReason$layout() {
        return m_eDenyReason$LAYOUT;
    }

    private static final long m_eDenyReason$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EDenyReason m_eDenyReason
     * }
     */
    public static final long m_eDenyReason$offset() {
        return m_eDenyReason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EDenyReason m_eDenyReason
     * }
     */
    public static int m_eDenyReason(MemorySegment struct) {
        return struct.get(m_eDenyReason$LAYOUT, m_eDenyReason$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EDenyReason m_eDenyReason
     * }
     */
    public static void m_eDenyReason(MemorySegment struct, int fieldValue) {
        struct.set(m_eDenyReason$LAYOUT, m_eDenyReason$OFFSET, fieldValue);
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
