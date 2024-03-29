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
 * struct GameRichPresenceJoinRequested_t {
 *     CSteamID m_steamIDFriend;
 *     char m_rgchConnect[256];
 * }
 * }
 */
public class GameRichPresenceJoinRequested_t {

    GameRichPresenceJoinRequested_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_steamIDFriend"),
        MemoryLayout.sequenceLayout(256, SteamFlat.C_CHAR).withName("m_rgchConnect")
    ).withName("GameRichPresenceJoinRequested_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_steamIDFriend$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_steamIDFriend"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDFriend
     * }
     */
    public static final OfLong m_steamIDFriend$layout() {
        return m_steamIDFriend$LAYOUT;
    }

    private static final long m_steamIDFriend$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDFriend
     * }
     */
    public static final long m_steamIDFriend$offset() {
        return m_steamIDFriend$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDFriend
     * }
     */
    public static long m_steamIDFriend(MemorySegment struct) {
        return struct.get(m_steamIDFriend$LAYOUT, m_steamIDFriend$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSteamID m_steamIDFriend
     * }
     */
    public static void m_steamIDFriend(MemorySegment struct, long fieldValue) {
        struct.set(m_steamIDFriend$LAYOUT, m_steamIDFriend$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_rgchConnect$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchConnect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static final SequenceLayout m_rgchConnect$layout() {
        return m_rgchConnect$LAYOUT;
    }

    private static final long m_rgchConnect$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static final long m_rgchConnect$offset() {
        return m_rgchConnect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static MemorySegment m_rgchConnect(MemorySegment struct) {
        return struct.asSlice(m_rgchConnect$OFFSET, m_rgchConnect$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static void m_rgchConnect(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchConnect$OFFSET, m_rgchConnect$LAYOUT.byteSize());
    }

    private static long[] m_rgchConnect$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static long[] m_rgchConnect$dimensions() {
        return m_rgchConnect$DIMS;
    }
    private static final VarHandle m_rgchConnect$ELEM_HANDLE = m_rgchConnect$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static byte m_rgchConnect(MemorySegment struct, long index0) {
        return (byte)m_rgchConnect$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchConnect[256]
     * }
     */
    public static void m_rgchConnect(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchConnect$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

