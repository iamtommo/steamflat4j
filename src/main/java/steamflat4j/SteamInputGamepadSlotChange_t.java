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
 * struct SteamInputGamepadSlotChange_t {
 *     AppId_t m_unAppID;
 *     InputHandle_t m_ulDeviceHandle;
 *     ESteamInputType m_eDeviceType;
 *     int m_nOldGamepadSlot;
 *     int m_nNewGamepadSlot;
 * }
 * }
 */
public class SteamInputGamepadSlotChange_t {

    SteamInputGamepadSlotChange_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_unAppID"),
        MemoryLayout.paddingLayout(4),
        SteamFlat.C_LONG_LONG.withName("m_ulDeviceHandle"),
        SteamFlat.C_INT.withName("m_eDeviceType"),
        SteamFlat.C_INT.withName("m_nOldGamepadSlot"),
        SteamFlat.C_INT.withName("m_nNewGamepadSlot"),
        MemoryLayout.paddingLayout(4)
    ).withName("SteamInputGamepadSlotChange_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_unAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AppId_t m_unAppID
     * }
     */
    public static final OfInt m_unAppID$layout() {
        return m_unAppID$LAYOUT;
    }

    private static final long m_unAppID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AppId_t m_unAppID
     * }
     */
    public static final long m_unAppID$offset() {
        return m_unAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AppId_t m_unAppID
     * }
     */
    public static int m_unAppID(MemorySegment struct) {
        return struct.get(m_unAppID$LAYOUT, m_unAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AppId_t m_unAppID
     * }
     */
    public static void m_unAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_unAppID$LAYOUT, m_unAppID$OFFSET, fieldValue);
    }

    private static final OfLong m_ulDeviceHandle$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulDeviceHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * InputHandle_t m_ulDeviceHandle
     * }
     */
    public static final OfLong m_ulDeviceHandle$layout() {
        return m_ulDeviceHandle$LAYOUT;
    }

    private static final long m_ulDeviceHandle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * InputHandle_t m_ulDeviceHandle
     * }
     */
    public static final long m_ulDeviceHandle$offset() {
        return m_ulDeviceHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * InputHandle_t m_ulDeviceHandle
     * }
     */
    public static long m_ulDeviceHandle(MemorySegment struct) {
        return struct.get(m_ulDeviceHandle$LAYOUT, m_ulDeviceHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * InputHandle_t m_ulDeviceHandle
     * }
     */
    public static void m_ulDeviceHandle(MemorySegment struct, long fieldValue) {
        struct.set(m_ulDeviceHandle$LAYOUT, m_ulDeviceHandle$OFFSET, fieldValue);
    }

    private static final OfInt m_eDeviceType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eDeviceType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ESteamInputType m_eDeviceType
     * }
     */
    public static final OfInt m_eDeviceType$layout() {
        return m_eDeviceType$LAYOUT;
    }

    private static final long m_eDeviceType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ESteamInputType m_eDeviceType
     * }
     */
    public static final long m_eDeviceType$offset() {
        return m_eDeviceType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ESteamInputType m_eDeviceType
     * }
     */
    public static int m_eDeviceType(MemorySegment struct) {
        return struct.get(m_eDeviceType$LAYOUT, m_eDeviceType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ESteamInputType m_eDeviceType
     * }
     */
    public static void m_eDeviceType(MemorySegment struct, int fieldValue) {
        struct.set(m_eDeviceType$LAYOUT, m_eDeviceType$OFFSET, fieldValue);
    }

    private static final OfInt m_nOldGamepadSlot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nOldGamepadSlot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nOldGamepadSlot
     * }
     */
    public static final OfInt m_nOldGamepadSlot$layout() {
        return m_nOldGamepadSlot$LAYOUT;
    }

    private static final long m_nOldGamepadSlot$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nOldGamepadSlot
     * }
     */
    public static final long m_nOldGamepadSlot$offset() {
        return m_nOldGamepadSlot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nOldGamepadSlot
     * }
     */
    public static int m_nOldGamepadSlot(MemorySegment struct) {
        return struct.get(m_nOldGamepadSlot$LAYOUT, m_nOldGamepadSlot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nOldGamepadSlot
     * }
     */
    public static void m_nOldGamepadSlot(MemorySegment struct, int fieldValue) {
        struct.set(m_nOldGamepadSlot$LAYOUT, m_nOldGamepadSlot$OFFSET, fieldValue);
    }

    private static final OfInt m_nNewGamepadSlot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nNewGamepadSlot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nNewGamepadSlot
     * }
     */
    public static final OfInt m_nNewGamepadSlot$layout() {
        return m_nNewGamepadSlot$LAYOUT;
    }

    private static final long m_nNewGamepadSlot$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nNewGamepadSlot
     * }
     */
    public static final long m_nNewGamepadSlot$offset() {
        return m_nNewGamepadSlot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nNewGamepadSlot
     * }
     */
    public static int m_nNewGamepadSlot(MemorySegment struct) {
        return struct.get(m_nNewGamepadSlot$LAYOUT, m_nNewGamepadSlot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nNewGamepadSlot
     * }
     */
    public static void m_nNewGamepadSlot(MemorySegment struct, int fieldValue) {
        struct.set(m_nNewGamepadSlot$LAYOUT, m_nNewGamepadSlot$OFFSET, fieldValue);
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

