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
 * struct FavoritesListChanged_t {
 *     uint32 m_nIP;
 *     uint32 m_nQueryPort;
 *     uint32 m_nConnPort;
 *     uint32 m_nAppID;
 *     uint32 m_nFlags;
 *     bool m_bAdd;
 *     AccountID_t m_unAccountId;
 * }
 * }
 */
public class FavoritesListChanged_t {

    FavoritesListChanged_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_nIP"),
        SteamFlat.C_INT.withName("m_nQueryPort"),
        SteamFlat.C_INT.withName("m_nConnPort"),
        SteamFlat.C_INT.withName("m_nAppID"),
        SteamFlat.C_INT.withName("m_nFlags"),
        SteamFlat.C_BOOL.withName("m_bAdd"),
        MemoryLayout.paddingLayout(3),
        SteamFlat.C_INT.withName("m_unAccountId")
    ).withName("FavoritesListChanged_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_nIP$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nIP"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_nIP
     * }
     */
    public static final OfInt m_nIP$layout() {
        return m_nIP$LAYOUT;
    }

    private static final long m_nIP$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_nIP
     * }
     */
    public static final long m_nIP$offset() {
        return m_nIP$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_nIP
     * }
     */
    public static int m_nIP(MemorySegment struct) {
        return struct.get(m_nIP$LAYOUT, m_nIP$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_nIP
     * }
     */
    public static void m_nIP(MemorySegment struct, int fieldValue) {
        struct.set(m_nIP$LAYOUT, m_nIP$OFFSET, fieldValue);
    }

    private static final OfInt m_nQueryPort$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nQueryPort"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_nQueryPort
     * }
     */
    public static final OfInt m_nQueryPort$layout() {
        return m_nQueryPort$LAYOUT;
    }

    private static final long m_nQueryPort$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_nQueryPort
     * }
     */
    public static final long m_nQueryPort$offset() {
        return m_nQueryPort$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_nQueryPort
     * }
     */
    public static int m_nQueryPort(MemorySegment struct) {
        return struct.get(m_nQueryPort$LAYOUT, m_nQueryPort$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_nQueryPort
     * }
     */
    public static void m_nQueryPort(MemorySegment struct, int fieldValue) {
        struct.set(m_nQueryPort$LAYOUT, m_nQueryPort$OFFSET, fieldValue);
    }

    private static final OfInt m_nConnPort$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nConnPort"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_nConnPort
     * }
     */
    public static final OfInt m_nConnPort$layout() {
        return m_nConnPort$LAYOUT;
    }

    private static final long m_nConnPort$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_nConnPort
     * }
     */
    public static final long m_nConnPort$offset() {
        return m_nConnPort$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_nConnPort
     * }
     */
    public static int m_nConnPort(MemorySegment struct) {
        return struct.get(m_nConnPort$LAYOUT, m_nConnPort$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_nConnPort
     * }
     */
    public static void m_nConnPort(MemorySegment struct, int fieldValue) {
        struct.set(m_nConnPort$LAYOUT, m_nConnPort$OFFSET, fieldValue);
    }

    private static final OfInt m_nAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_nAppID
     * }
     */
    public static final OfInt m_nAppID$layout() {
        return m_nAppID$LAYOUT;
    }

    private static final long m_nAppID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_nAppID
     * }
     */
    public static final long m_nAppID$offset() {
        return m_nAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_nAppID
     * }
     */
    public static int m_nAppID(MemorySegment struct) {
        return struct.get(m_nAppID$LAYOUT, m_nAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_nAppID
     * }
     */
    public static void m_nAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_nAppID$LAYOUT, m_nAppID$OFFSET, fieldValue);
    }

    private static final OfInt m_nFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_nFlags
     * }
     */
    public static final OfInt m_nFlags$layout() {
        return m_nFlags$LAYOUT;
    }

    private static final long m_nFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_nFlags
     * }
     */
    public static final long m_nFlags$offset() {
        return m_nFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_nFlags
     * }
     */
    public static int m_nFlags(MemorySegment struct) {
        return struct.get(m_nFlags$LAYOUT, m_nFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_nFlags
     * }
     */
    public static void m_nFlags(MemorySegment struct, int fieldValue) {
        struct.set(m_nFlags$LAYOUT, m_nFlags$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bAdd$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bAdd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bAdd
     * }
     */
    public static final OfBoolean m_bAdd$layout() {
        return m_bAdd$LAYOUT;
    }

    private static final long m_bAdd$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bAdd
     * }
     */
    public static final long m_bAdd$offset() {
        return m_bAdd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bAdd
     * }
     */
    public static boolean m_bAdd(MemorySegment struct) {
        return struct.get(m_bAdd$LAYOUT, m_bAdd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bAdd
     * }
     */
    public static void m_bAdd(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bAdd$LAYOUT, m_bAdd$OFFSET, fieldValue);
    }

    private static final OfInt m_unAccountId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unAccountId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AccountID_t m_unAccountId
     * }
     */
    public static final OfInt m_unAccountId$layout() {
        return m_unAccountId$LAYOUT;
    }

    private static final long m_unAccountId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AccountID_t m_unAccountId
     * }
     */
    public static final long m_unAccountId$offset() {
        return m_unAccountId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AccountID_t m_unAccountId
     * }
     */
    public static int m_unAccountId(MemorySegment struct) {
        return struct.get(m_unAccountId$LAYOUT, m_unAccountId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AccountID_t m_unAccountId
     * }
     */
    public static void m_unAccountId(MemorySegment struct, int fieldValue) {
        struct.set(m_unAccountId$LAYOUT, m_unAccountId$OFFSET, fieldValue);
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

