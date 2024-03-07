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
 * struct SteamInputActionEvent_t {
 *     InputHandle_t controllerHandle;
 *     ESteamInputActionEventType eEventType;
 * }
 * }
 */
public class SteamInputActionEvent_t {

    SteamInputActionEvent_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("controllerHandle"),
        SteamFlat.C_INT.withName("eEventType"),
        MemoryLayout.paddingLayout(4)
    ).withName("SteamInputActionEvent_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong controllerHandle$LAYOUT = (OfLong)$LAYOUT.select(groupElement("controllerHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * InputHandle_t controllerHandle
     * }
     */
    public static final OfLong controllerHandle$layout() {
        return controllerHandle$LAYOUT;
    }

    private static final long controllerHandle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * InputHandle_t controllerHandle
     * }
     */
    public static final long controllerHandle$offset() {
        return controllerHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * InputHandle_t controllerHandle
     * }
     */
    public static long controllerHandle(MemorySegment struct) {
        return struct.get(controllerHandle$LAYOUT, controllerHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * InputHandle_t controllerHandle
     * }
     */
    public static void controllerHandle(MemorySegment struct, long fieldValue) {
        struct.set(controllerHandle$LAYOUT, controllerHandle$OFFSET, fieldValue);
    }

    private static final OfInt eEventType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("eEventType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ESteamInputActionEventType eEventType
     * }
     */
    public static final OfInt eEventType$layout() {
        return eEventType$LAYOUT;
    }

    private static final long eEventType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ESteamInputActionEventType eEventType
     * }
     */
    public static final long eEventType$offset() {
        return eEventType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ESteamInputActionEventType eEventType
     * }
     */
    public static int eEventType(MemorySegment struct) {
        return struct.get(eEventType$LAYOUT, eEventType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ESteamInputActionEventType eEventType
     * }
     */
    public static void eEventType(MemorySegment struct, int fieldValue) {
        struct.set(eEventType$LAYOUT, eEventType$OFFSET, fieldValue);
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
