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
 * struct HTML_SearchResults_t {
 *     HHTMLBrowser unBrowserHandle;
 *     uint32 unResults;
 *     uint32 unCurrentMatch;
 * }
 * }
 */
public class HTML_SearchResults_t {

    HTML_SearchResults_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("unBrowserHandle"),
        SteamFlat.C_INT.withName("unResults"),
        SteamFlat.C_INT.withName("unCurrentMatch")
    ).withName("HTML_SearchResults_t");

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

    private static final OfInt unResults$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unResults"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 unResults
     * }
     */
    public static final OfInt unResults$layout() {
        return unResults$LAYOUT;
    }

    private static final long unResults$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 unResults
     * }
     */
    public static final long unResults$offset() {
        return unResults$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 unResults
     * }
     */
    public static int unResults(MemorySegment struct) {
        return struct.get(unResults$LAYOUT, unResults$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 unResults
     * }
     */
    public static void unResults(MemorySegment struct, int fieldValue) {
        struct.set(unResults$LAYOUT, unResults$OFFSET, fieldValue);
    }

    private static final OfInt unCurrentMatch$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unCurrentMatch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 unCurrentMatch
     * }
     */
    public static final OfInt unCurrentMatch$layout() {
        return unCurrentMatch$LAYOUT;
    }

    private static final long unCurrentMatch$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 unCurrentMatch
     * }
     */
    public static final long unCurrentMatch$offset() {
        return unCurrentMatch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 unCurrentMatch
     * }
     */
    public static int unCurrentMatch(MemorySegment struct) {
        return struct.get(unCurrentMatch$LAYOUT, unCurrentMatch$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 unCurrentMatch
     * }
     */
    public static void unCurrentMatch(MemorySegment struct, int fieldValue) {
        struct.set(unCurrentMatch$LAYOUT, unCurrentMatch$OFFSET, fieldValue);
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

