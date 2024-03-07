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
 * struct GameOverlayActivated_t {
 *     uint8 m_bActive;
 *     bool m_bUserInitiated;
 *     AppId_t m_nAppID;
 *     uint32 m_dwOverlayPID;
 * }
 * }
 */
public class GameOverlayActivated_t {

    GameOverlayActivated_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_CHAR.withName("m_bActive"),
        SteamFlat4j.C_BOOL.withName("m_bUserInitiated"),
        MemoryLayout.paddingLayout(2),
        SteamFlat4j.C_INT.withName("m_nAppID"),
        SteamFlat4j.C_INT.withName("m_dwOverlayPID")
    ).withName("GameOverlayActivated_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte m_bActive$LAYOUT = (OfByte)$LAYOUT.select(groupElement("m_bActive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8 m_bActive
     * }
     */
    public static final OfByte m_bActive$layout() {
        return m_bActive$LAYOUT;
    }

    private static final long m_bActive$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8 m_bActive
     * }
     */
    public static final long m_bActive$offset() {
        return m_bActive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8 m_bActive
     * }
     */
    public static byte m_bActive(MemorySegment struct) {
        return struct.get(m_bActive$LAYOUT, m_bActive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8 m_bActive
     * }
     */
    public static void m_bActive(MemorySegment struct, byte fieldValue) {
        struct.set(m_bActive$LAYOUT, m_bActive$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bUserInitiated$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bUserInitiated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bUserInitiated
     * }
     */
    public static final OfBoolean m_bUserInitiated$layout() {
        return m_bUserInitiated$LAYOUT;
    }

    private static final long m_bUserInitiated$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bUserInitiated
     * }
     */
    public static final long m_bUserInitiated$offset() {
        return m_bUserInitiated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bUserInitiated
     * }
     */
    public static boolean m_bUserInitiated(MemorySegment struct) {
        return struct.get(m_bUserInitiated$LAYOUT, m_bUserInitiated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bUserInitiated
     * }
     */
    public static void m_bUserInitiated(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bUserInitiated$LAYOUT, m_bUserInitiated$OFFSET, fieldValue);
    }

    private static final OfInt m_nAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AppId_t m_nAppID
     * }
     */
    public static final OfInt m_nAppID$layout() {
        return m_nAppID$LAYOUT;
    }

    private static final long m_nAppID$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AppId_t m_nAppID
     * }
     */
    public static final long m_nAppID$offset() {
        return m_nAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AppId_t m_nAppID
     * }
     */
    public static int m_nAppID(MemorySegment struct) {
        return struct.get(m_nAppID$LAYOUT, m_nAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AppId_t m_nAppID
     * }
     */
    public static void m_nAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_nAppID$LAYOUT, m_nAppID$OFFSET, fieldValue);
    }

    private static final OfInt m_dwOverlayPID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_dwOverlayPID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_dwOverlayPID
     * }
     */
    public static final OfInt m_dwOverlayPID$layout() {
        return m_dwOverlayPID$LAYOUT;
    }

    private static final long m_dwOverlayPID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_dwOverlayPID
     * }
     */
    public static final long m_dwOverlayPID$offset() {
        return m_dwOverlayPID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_dwOverlayPID
     * }
     */
    public static int m_dwOverlayPID(MemorySegment struct) {
        return struct.get(m_dwOverlayPID$LAYOUT, m_dwOverlayPID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_dwOverlayPID
     * }
     */
    public static void m_dwOverlayPID(MemorySegment struct, int fieldValue) {
        struct.set(m_dwOverlayPID$LAYOUT, m_dwOverlayPID$OFFSET, fieldValue);
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

