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
 * struct FriendsIsFollowing_t {
 *     EResult m_eResult;
 *     CSteamID m_steamID;
 *     bool m_bIsFollowing;
 * }
 * }
 */
public class FriendsIsFollowing_t {

    FriendsIsFollowing_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_INT.withName("m_eResult"),
        MemoryLayout.paddingLayout(4),
        SteamFlat4j.C_LONG_LONG.withName("m_steamID"),
        SteamFlat4j.C_BOOL.withName("m_bIsFollowing"),
        MemoryLayout.paddingLayout(7)
    ).withName("FriendsIsFollowing_t");

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

    private static final OfLong m_steamID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_steamID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_steamID
     * }
     */
    public static final OfLong m_steamID$layout() {
        return m_steamID$LAYOUT;
    }

    private static final long m_steamID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_steamID
     * }
     */
    public static final long m_steamID$offset() {
        return m_steamID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_steamID
     * }
     */
    public static long m_steamID(MemorySegment struct) {
        return struct.get(m_steamID$LAYOUT, m_steamID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_steamID
     * }
     */
    public static void m_steamID(MemorySegment struct, long fieldValue) {
        struct.set(m_steamID$LAYOUT, m_steamID$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bIsFollowing$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bIsFollowing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bIsFollowing
     * }
     */
    public static final OfBoolean m_bIsFollowing$layout() {
        return m_bIsFollowing$LAYOUT;
    }

    private static final long m_bIsFollowing$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bIsFollowing
     * }
     */
    public static final long m_bIsFollowing$offset() {
        return m_bIsFollowing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bIsFollowing
     * }
     */
    public static boolean m_bIsFollowing(MemorySegment struct) {
        return struct.get(m_bIsFollowing$LAYOUT, m_bIsFollowing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bIsFollowing
     * }
     */
    public static void m_bIsFollowing(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bIsFollowing$LAYOUT, m_bIsFollowing$OFFSET, fieldValue);
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

