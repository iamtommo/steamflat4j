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
 * struct HTML_UpdateToolTip_t {
 *     HHTMLBrowser unBrowserHandle;
 *     const char *pchMsg;
 * }
 * }
 */
public class HTML_UpdateToolTip_t {

    HTML_UpdateToolTip_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("unBrowserHandle"),
        MemoryLayout.paddingLayout(4),
        SteamFlat.C_POINTER.withName("pchMsg")
    ).withName("HTML_UpdateToolTip_t");

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

    private static final AddressLayout pchMsg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pchMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pchMsg
     * }
     */
    public static final AddressLayout pchMsg$layout() {
        return pchMsg$LAYOUT;
    }

    private static final long pchMsg$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pchMsg
     * }
     */
    public static final long pchMsg$offset() {
        return pchMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pchMsg
     * }
     */
    public static MemorySegment pchMsg(MemorySegment struct) {
        return struct.get(pchMsg$LAYOUT, pchMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pchMsg
     * }
     */
    public static void pchMsg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pchMsg$LAYOUT, pchMsg$OFFSET, fieldValue);
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
