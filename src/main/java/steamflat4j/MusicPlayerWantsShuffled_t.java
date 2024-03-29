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
 * struct MusicPlayerWantsShuffled_t {
 *     bool m_bShuffled;
 * }
 * }
 */
public class MusicPlayerWantsShuffled_t {

    MusicPlayerWantsShuffled_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_BOOL.withName("m_bShuffled")
    ).withName("MusicPlayerWantsShuffled_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfBoolean m_bShuffled$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bShuffled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bShuffled
     * }
     */
    public static final OfBoolean m_bShuffled$layout() {
        return m_bShuffled$LAYOUT;
    }

    private static final long m_bShuffled$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bShuffled
     * }
     */
    public static final long m_bShuffled$offset() {
        return m_bShuffled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bShuffled
     * }
     */
    public static boolean m_bShuffled(MemorySegment struct) {
        return struct.get(m_bShuffled$LAYOUT, m_bShuffled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bShuffled
     * }
     */
    public static void m_bShuffled(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bShuffled$LAYOUT, m_bShuffled$OFFSET, fieldValue);
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

