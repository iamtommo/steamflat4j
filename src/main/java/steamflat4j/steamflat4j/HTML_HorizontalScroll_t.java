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
 * struct HTML_HorizontalScroll_t {
 *     HHTMLBrowser unBrowserHandle;
 *     uint32 unScrollMax;
 *     uint32 unScrollCurrent;
 *     float flPageScale;
 *     bool bVisible;
 *     uint32 unPageSize;
 * }
 * }
 */
public class HTML_HorizontalScroll_t {

    HTML_HorizontalScroll_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("unBrowserHandle"),
        SteamFlat4j.C_INT.withName("unScrollMax"),
        SteamFlat4j.C_INT.withName("unScrollCurrent"),
        SteamFlat4j.C_FLOAT.withName("flPageScale"),
        SteamFlat4j.C_BOOL.withName("bVisible"),
        MemoryLayout.paddingLayout(3),
        SteamFlat4j.C_INT.withName("unPageSize")
    ).withName("HTML_HorizontalScroll_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt unBrowserHandle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unBrowserHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HHTMLBrowser unBrowserHandle
     * }
     */
    public static final OfInt unBrowserHandle$layout() {
        return unBrowserHandle$LAYOUT;
    }

    private static final long unBrowserHandle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HHTMLBrowser unBrowserHandle
     * }
     */
    public static final long unBrowserHandle$offset() {
        return unBrowserHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HHTMLBrowser unBrowserHandle
     * }
     */
    public static int unBrowserHandle(MemorySegment struct) {
        return struct.get(unBrowserHandle$LAYOUT, unBrowserHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HHTMLBrowser unBrowserHandle
     * }
     */
    public static void unBrowserHandle(MemorySegment struct, int fieldValue) {
        struct.set(unBrowserHandle$LAYOUT, unBrowserHandle$OFFSET, fieldValue);
    }

    private static final OfInt unScrollMax$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unScrollMax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 unScrollMax
     * }
     */
    public static final OfInt unScrollMax$layout() {
        return unScrollMax$LAYOUT;
    }

    private static final long unScrollMax$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 unScrollMax
     * }
     */
    public static final long unScrollMax$offset() {
        return unScrollMax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 unScrollMax
     * }
     */
    public static int unScrollMax(MemorySegment struct) {
        return struct.get(unScrollMax$LAYOUT, unScrollMax$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 unScrollMax
     * }
     */
    public static void unScrollMax(MemorySegment struct, int fieldValue) {
        struct.set(unScrollMax$LAYOUT, unScrollMax$OFFSET, fieldValue);
    }

    private static final OfInt unScrollCurrent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unScrollCurrent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 unScrollCurrent
     * }
     */
    public static final OfInt unScrollCurrent$layout() {
        return unScrollCurrent$LAYOUT;
    }

    private static final long unScrollCurrent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 unScrollCurrent
     * }
     */
    public static final long unScrollCurrent$offset() {
        return unScrollCurrent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 unScrollCurrent
     * }
     */
    public static int unScrollCurrent(MemorySegment struct) {
        return struct.get(unScrollCurrent$LAYOUT, unScrollCurrent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 unScrollCurrent
     * }
     */
    public static void unScrollCurrent(MemorySegment struct, int fieldValue) {
        struct.set(unScrollCurrent$LAYOUT, unScrollCurrent$OFFSET, fieldValue);
    }

    private static final OfFloat flPageScale$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("flPageScale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float flPageScale
     * }
     */
    public static final OfFloat flPageScale$layout() {
        return flPageScale$LAYOUT;
    }

    private static final long flPageScale$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float flPageScale
     * }
     */
    public static final long flPageScale$offset() {
        return flPageScale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float flPageScale
     * }
     */
    public static float flPageScale(MemorySegment struct) {
        return struct.get(flPageScale$LAYOUT, flPageScale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float flPageScale
     * }
     */
    public static void flPageScale(MemorySegment struct, float fieldValue) {
        struct.set(flPageScale$LAYOUT, flPageScale$OFFSET, fieldValue);
    }

    private static final OfBoolean bVisible$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("bVisible"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool bVisible
     * }
     */
    public static final OfBoolean bVisible$layout() {
        return bVisible$LAYOUT;
    }

    private static final long bVisible$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool bVisible
     * }
     */
    public static final long bVisible$offset() {
        return bVisible$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool bVisible
     * }
     */
    public static boolean bVisible(MemorySegment struct) {
        return struct.get(bVisible$LAYOUT, bVisible$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool bVisible
     * }
     */
    public static void bVisible(MemorySegment struct, boolean fieldValue) {
        struct.set(bVisible$LAYOUT, bVisible$OFFSET, fieldValue);
    }

    private static final OfInt unPageSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unPageSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 unPageSize
     * }
     */
    public static final OfInt unPageSize$layout() {
        return unPageSize$LAYOUT;
    }

    private static final long unPageSize$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 unPageSize
     * }
     */
    public static final long unPageSize$offset() {
        return unPageSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 unPageSize
     * }
     */
    public static int unPageSize(MemorySegment struct) {
        return struct.get(unPageSize$LAYOUT, unPageSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 unPageSize
     * }
     */
    public static void unPageSize(MemorySegment struct, int fieldValue) {
        struct.set(unPageSize$LAYOUT, unPageSize$OFFSET, fieldValue);
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

