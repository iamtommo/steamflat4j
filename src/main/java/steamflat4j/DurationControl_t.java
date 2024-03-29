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
 * struct DurationControl_t {
 *     EResult m_eResult;
 *     AppId_t m_appid;
 *     bool m_bApplicable;
 *     int32 m_csecsLast5h;
 *     EDurationControlProgress m_progress;
 *     EDurationControlNotification m_notification;
 *     int32 m_csecsToday;
 *     int32 m_csecsRemaining;
 * }
 * }
 */
public class DurationControl_t {

    DurationControl_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_INT.withName("m_eResult"),
        SteamFlat.C_INT.withName("m_appid"),
        SteamFlat.C_BOOL.withName("m_bApplicable"),
        MemoryLayout.paddingLayout(3),
        SteamFlat.C_INT.withName("m_csecsLast5h"),
        SteamFlat.C_INT.withName("m_progress"),
        SteamFlat.C_INT.withName("m_notification"),
        SteamFlat.C_INT.withName("m_csecsToday"),
        SteamFlat.C_INT.withName("m_csecsRemaining")
    ).withName("DurationControl_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt m_eResult$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eResult"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static final OfInt m_eResult$layout() {
        return m_eResult$LAYOUT;
    }

    private static final long m_eResult$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static final long m_eResult$offset() {
        return m_eResult$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static int m_eResult(MemorySegment struct) {
        return struct.get(m_eResult$LAYOUT, m_eResult$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EResult m_eResult
     * }
     */
    public static void m_eResult(MemorySegment struct, int fieldValue) {
        struct.set(m_eResult$LAYOUT, m_eResult$OFFSET, fieldValue);
    }

    private static final OfInt m_appid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_appid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AppId_t m_appid
     * }
     */
    public static final OfInt m_appid$layout() {
        return m_appid$LAYOUT;
    }

    private static final long m_appid$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AppId_t m_appid
     * }
     */
    public static final long m_appid$offset() {
        return m_appid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AppId_t m_appid
     * }
     */
    public static int m_appid(MemorySegment struct) {
        return struct.get(m_appid$LAYOUT, m_appid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AppId_t m_appid
     * }
     */
    public static void m_appid(MemorySegment struct, int fieldValue) {
        struct.set(m_appid$LAYOUT, m_appid$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bApplicable$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bApplicable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bApplicable
     * }
     */
    public static final OfBoolean m_bApplicable$layout() {
        return m_bApplicable$LAYOUT;
    }

    private static final long m_bApplicable$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bApplicable
     * }
     */
    public static final long m_bApplicable$offset() {
        return m_bApplicable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bApplicable
     * }
     */
    public static boolean m_bApplicable(MemorySegment struct) {
        return struct.get(m_bApplicable$LAYOUT, m_bApplicable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bApplicable
     * }
     */
    public static void m_bApplicable(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bApplicable$LAYOUT, m_bApplicable$OFFSET, fieldValue);
    }

    private static final OfInt m_csecsLast5h$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_csecsLast5h"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_csecsLast5h
     * }
     */
    public static final OfInt m_csecsLast5h$layout() {
        return m_csecsLast5h$LAYOUT;
    }

    private static final long m_csecsLast5h$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_csecsLast5h
     * }
     */
    public static final long m_csecsLast5h$offset() {
        return m_csecsLast5h$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_csecsLast5h
     * }
     */
    public static int m_csecsLast5h(MemorySegment struct) {
        return struct.get(m_csecsLast5h$LAYOUT, m_csecsLast5h$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_csecsLast5h
     * }
     */
    public static void m_csecsLast5h(MemorySegment struct, int fieldValue) {
        struct.set(m_csecsLast5h$LAYOUT, m_csecsLast5h$OFFSET, fieldValue);
    }

    private static final OfInt m_progress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_progress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EDurationControlProgress m_progress
     * }
     */
    public static final OfInt m_progress$layout() {
        return m_progress$LAYOUT;
    }

    private static final long m_progress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EDurationControlProgress m_progress
     * }
     */
    public static final long m_progress$offset() {
        return m_progress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EDurationControlProgress m_progress
     * }
     */
    public static int m_progress(MemorySegment struct) {
        return struct.get(m_progress$LAYOUT, m_progress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EDurationControlProgress m_progress
     * }
     */
    public static void m_progress(MemorySegment struct, int fieldValue) {
        struct.set(m_progress$LAYOUT, m_progress$OFFSET, fieldValue);
    }

    private static final OfInt m_notification$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_notification"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EDurationControlNotification m_notification
     * }
     */
    public static final OfInt m_notification$layout() {
        return m_notification$LAYOUT;
    }

    private static final long m_notification$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EDurationControlNotification m_notification
     * }
     */
    public static final long m_notification$offset() {
        return m_notification$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EDurationControlNotification m_notification
     * }
     */
    public static int m_notification(MemorySegment struct) {
        return struct.get(m_notification$LAYOUT, m_notification$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EDurationControlNotification m_notification
     * }
     */
    public static void m_notification(MemorySegment struct, int fieldValue) {
        struct.set(m_notification$LAYOUT, m_notification$OFFSET, fieldValue);
    }

    private static final OfInt m_csecsToday$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_csecsToday"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_csecsToday
     * }
     */
    public static final OfInt m_csecsToday$layout() {
        return m_csecsToday$LAYOUT;
    }

    private static final long m_csecsToday$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_csecsToday
     * }
     */
    public static final long m_csecsToday$offset() {
        return m_csecsToday$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_csecsToday
     * }
     */
    public static int m_csecsToday(MemorySegment struct) {
        return struct.get(m_csecsToday$LAYOUT, m_csecsToday$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_csecsToday
     * }
     */
    public static void m_csecsToday(MemorySegment struct, int fieldValue) {
        struct.set(m_csecsToday$LAYOUT, m_csecsToday$OFFSET, fieldValue);
    }

    private static final OfInt m_csecsRemaining$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_csecsRemaining"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_csecsRemaining
     * }
     */
    public static final OfInt m_csecsRemaining$layout() {
        return m_csecsRemaining$LAYOUT;
    }

    private static final long m_csecsRemaining$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_csecsRemaining
     * }
     */
    public static final long m_csecsRemaining$offset() {
        return m_csecsRemaining$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_csecsRemaining
     * }
     */
    public static int m_csecsRemaining(MemorySegment struct) {
        return struct.get(m_csecsRemaining$LAYOUT, m_csecsRemaining$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_csecsRemaining
     * }
     */
    public static void m_csecsRemaining(MemorySegment struct, int fieldValue) {
        struct.set(m_csecsRemaining$LAYOUT, m_csecsRemaining$OFFSET, fieldValue);
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

