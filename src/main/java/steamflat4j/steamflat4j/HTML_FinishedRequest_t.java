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
 * struct HTML_FinishedRequest_t {
 *     HHTMLBrowser unBrowserHandle;
 *     const char *pchURL;
 *     const char *pchPageTitle;
 * }
 * }
 */
public class HTML_FinishedRequest_t {

    HTML_FinishedRequest_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("unBrowserHandle"),
        MemoryLayout.paddingLayout(4),
        SteamFlat4j.C_POINTER.withName("pchURL"),
        SteamFlat4j.C_POINTER.withName("pchPageTitle")
    ).withName("HTML_FinishedRequest_t");

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

    private static final AddressLayout pchURL$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pchURL"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pchURL
     * }
     */
    public static final AddressLayout pchURL$layout() {
        return pchURL$LAYOUT;
    }

    private static final long pchURL$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pchURL
     * }
     */
    public static final long pchURL$offset() {
        return pchURL$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pchURL
     * }
     */
    public static MemorySegment pchURL(MemorySegment struct) {
        return struct.get(pchURL$LAYOUT, pchURL$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pchURL
     * }
     */
    public static void pchURL(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pchURL$LAYOUT, pchURL$OFFSET, fieldValue);
    }

    private static final AddressLayout pchPageTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pchPageTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pchPageTitle
     * }
     */
    public static final AddressLayout pchPageTitle$layout() {
        return pchPageTitle$LAYOUT;
    }

    private static final long pchPageTitle$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pchPageTitle
     * }
     */
    public static final long pchPageTitle$offset() {
        return pchPageTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pchPageTitle
     * }
     */
    public static MemorySegment pchPageTitle(MemorySegment struct) {
        return struct.get(pchPageTitle$LAYOUT, pchPageTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pchPageTitle
     * }
     */
    public static void pchPageTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pchPageTitle$LAYOUT, pchPageTitle$OFFSET, fieldValue);
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

