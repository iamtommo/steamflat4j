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
 * struct EndGameResultCallback_t {
 *     EResult m_eResult;
 *     uint64 ullUniqueGameID;
 * }
 * }
 */
public class EndGameResultCallback_t {

    EndGameResultCallback_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("m_eResult"),
        MemoryLayout.paddingLayout(4),
        SteamFlat4j.C_LONG_LONG.withName("ullUniqueGameID")
    ).withName("EndGameResultCallback_t");

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

    private static final OfLong ullUniqueGameID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ullUniqueGameID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 ullUniqueGameID
     * }
     */
    public static final OfLong ullUniqueGameID$layout() {
        return ullUniqueGameID$LAYOUT;
    }

    private static final long ullUniqueGameID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 ullUniqueGameID
     * }
     */
    public static final long ullUniqueGameID$offset() {
        return ullUniqueGameID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 ullUniqueGameID
     * }
     */
    public static long ullUniqueGameID(MemorySegment struct) {
        return struct.get(ullUniqueGameID$LAYOUT, ullUniqueGameID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 ullUniqueGameID
     * }
     */
    public static void ullUniqueGameID(MemorySegment struct, long fieldValue) {
        struct.set(ullUniqueGameID$LAYOUT, ullUniqueGameID$OFFSET, fieldValue);
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

