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
 * struct InputDigitalActionData_t {
 *     bool bState;
 *     bool bActive;
 * }
 * }
 */
public class InputDigitalActionData_t {

    InputDigitalActionData_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_BOOL.withName("bState"),
        SteamFlat.C_BOOL.withName("bActive")
    ).withName("InputDigitalActionData_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfBoolean bState$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("bState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool bState
     * }
     */
    public static final OfBoolean bState$layout() {
        return bState$LAYOUT;
    }

    private static final long bState$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool bState
     * }
     */
    public static final long bState$offset() {
        return bState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool bState
     * }
     */
    public static boolean bState(MemorySegment struct) {
        return struct.get(bState$LAYOUT, bState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool bState
     * }
     */
    public static void bState(MemorySegment struct, boolean fieldValue) {
        struct.set(bState$LAYOUT, bState$OFFSET, fieldValue);
    }

    private static final OfBoolean bActive$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("bActive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool bActive
     * }
     */
    public static final OfBoolean bActive$layout() {
        return bActive$LAYOUT;
    }

    private static final long bActive$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool bActive
     * }
     */
    public static final long bActive$offset() {
        return bActive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool bActive
     * }
     */
    public static boolean bActive(MemorySegment struct) {
        return struct.get(bActive$LAYOUT, bActive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool bActive
     * }
     */
    public static void bActive(MemorySegment struct, boolean fieldValue) {
        struct.set(bActive$LAYOUT, bActive$OFFSET, fieldValue);
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

