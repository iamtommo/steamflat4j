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
 * struct InputAnalogActionData_t {
 *     EInputSourceMode eMode;
 *     float x;
 *     float y;
 *     bool bActive;
 * }
 * }
 */
public class InputAnalogActionData_t {

    InputAnalogActionData_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("eMode"),
        SteamFlat.C_FLOAT.withName("x"),
        SteamFlat.C_FLOAT.withName("y"),
        SteamFlat.C_BOOL.withName("bActive"),
        MemoryLayout.paddingLayout(3)
    ).withName("InputAnalogActionData_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt eMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("eMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EInputSourceMode eMode
     * }
     */
    public static final OfInt eMode$layout() {
        return eMode$LAYOUT;
    }

    private static final long eMode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EInputSourceMode eMode
     * }
     */
    public static final long eMode$offset() {
        return eMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EInputSourceMode eMode
     * }
     */
    public static int eMode(MemorySegment struct) {
        return struct.get(eMode$LAYOUT, eMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EInputSourceMode eMode
     * }
     */
    public static void eMode(MemorySegment struct, int fieldValue) {
        struct.set(eMode$LAYOUT, eMode$OFFSET, fieldValue);
    }

    private static final OfFloat x$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static final OfFloat x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static float x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float x
     * }
     */
    public static void x(MemorySegment struct, float fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfFloat y$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static final OfFloat y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static float y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float y
     * }
     */
    public static void y(MemorySegment struct, float fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
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

    private static final long bActive$OFFSET = 12;

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

