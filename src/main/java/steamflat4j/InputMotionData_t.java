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
 * struct InputMotionData_t {
 *     float rotQuatX;
 *     float rotQuatY;
 *     float rotQuatZ;
 *     float rotQuatW;
 *     float posAccelX;
 *     float posAccelY;
 *     float posAccelZ;
 *     float rotVelX;
 *     float rotVelY;
 *     float rotVelZ;
 * }
 * }
 */
public class InputMotionData_t {

    InputMotionData_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_FLOAT.withName("rotQuatX"),
        SteamFlat.C_FLOAT.withName("rotQuatY"),
        SteamFlat.C_FLOAT.withName("rotQuatZ"),
        SteamFlat.C_FLOAT.withName("rotQuatW"),
        SteamFlat.C_FLOAT.withName("posAccelX"),
        SteamFlat.C_FLOAT.withName("posAccelY"),
        SteamFlat.C_FLOAT.withName("posAccelZ"),
        SteamFlat.C_FLOAT.withName("rotVelX"),
        SteamFlat.C_FLOAT.withName("rotVelY"),
        SteamFlat.C_FLOAT.withName("rotVelZ")
    ).withName("InputMotionData_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat rotQuatX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotQuatX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotQuatX
     * }
     */
    public static final OfFloat rotQuatX$layout() {
        return rotQuatX$LAYOUT;
    }

    private static final long rotQuatX$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotQuatX
     * }
     */
    public static final long rotQuatX$offset() {
        return rotQuatX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotQuatX
     * }
     */
    public static float rotQuatX(MemorySegment struct) {
        return struct.get(rotQuatX$LAYOUT, rotQuatX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotQuatX
     * }
     */
    public static void rotQuatX(MemorySegment struct, float fieldValue) {
        struct.set(rotQuatX$LAYOUT, rotQuatX$OFFSET, fieldValue);
    }

    private static final OfFloat rotQuatY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotQuatY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotQuatY
     * }
     */
    public static final OfFloat rotQuatY$layout() {
        return rotQuatY$LAYOUT;
    }

    private static final long rotQuatY$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotQuatY
     * }
     */
    public static final long rotQuatY$offset() {
        return rotQuatY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotQuatY
     * }
     */
    public static float rotQuatY(MemorySegment struct) {
        return struct.get(rotQuatY$LAYOUT, rotQuatY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotQuatY
     * }
     */
    public static void rotQuatY(MemorySegment struct, float fieldValue) {
        struct.set(rotQuatY$LAYOUT, rotQuatY$OFFSET, fieldValue);
    }

    private static final OfFloat rotQuatZ$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotQuatZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotQuatZ
     * }
     */
    public static final OfFloat rotQuatZ$layout() {
        return rotQuatZ$LAYOUT;
    }

    private static final long rotQuatZ$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotQuatZ
     * }
     */
    public static final long rotQuatZ$offset() {
        return rotQuatZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotQuatZ
     * }
     */
    public static float rotQuatZ(MemorySegment struct) {
        return struct.get(rotQuatZ$LAYOUT, rotQuatZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotQuatZ
     * }
     */
    public static void rotQuatZ(MemorySegment struct, float fieldValue) {
        struct.set(rotQuatZ$LAYOUT, rotQuatZ$OFFSET, fieldValue);
    }

    private static final OfFloat rotQuatW$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotQuatW"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotQuatW
     * }
     */
    public static final OfFloat rotQuatW$layout() {
        return rotQuatW$LAYOUT;
    }

    private static final long rotQuatW$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotQuatW
     * }
     */
    public static final long rotQuatW$offset() {
        return rotQuatW$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotQuatW
     * }
     */
    public static float rotQuatW(MemorySegment struct) {
        return struct.get(rotQuatW$LAYOUT, rotQuatW$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotQuatW
     * }
     */
    public static void rotQuatW(MemorySegment struct, float fieldValue) {
        struct.set(rotQuatW$LAYOUT, rotQuatW$OFFSET, fieldValue);
    }

    private static final OfFloat posAccelX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("posAccelX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float posAccelX
     * }
     */
    public static final OfFloat posAccelX$layout() {
        return posAccelX$LAYOUT;
    }

    private static final long posAccelX$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float posAccelX
     * }
     */
    public static final long posAccelX$offset() {
        return posAccelX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float posAccelX
     * }
     */
    public static float posAccelX(MemorySegment struct) {
        return struct.get(posAccelX$LAYOUT, posAccelX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float posAccelX
     * }
     */
    public static void posAccelX(MemorySegment struct, float fieldValue) {
        struct.set(posAccelX$LAYOUT, posAccelX$OFFSET, fieldValue);
    }

    private static final OfFloat posAccelY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("posAccelY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float posAccelY
     * }
     */
    public static final OfFloat posAccelY$layout() {
        return posAccelY$LAYOUT;
    }

    private static final long posAccelY$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float posAccelY
     * }
     */
    public static final long posAccelY$offset() {
        return posAccelY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float posAccelY
     * }
     */
    public static float posAccelY(MemorySegment struct) {
        return struct.get(posAccelY$LAYOUT, posAccelY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float posAccelY
     * }
     */
    public static void posAccelY(MemorySegment struct, float fieldValue) {
        struct.set(posAccelY$LAYOUT, posAccelY$OFFSET, fieldValue);
    }

    private static final OfFloat posAccelZ$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("posAccelZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float posAccelZ
     * }
     */
    public static final OfFloat posAccelZ$layout() {
        return posAccelZ$LAYOUT;
    }

    private static final long posAccelZ$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float posAccelZ
     * }
     */
    public static final long posAccelZ$offset() {
        return posAccelZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float posAccelZ
     * }
     */
    public static float posAccelZ(MemorySegment struct) {
        return struct.get(posAccelZ$LAYOUT, posAccelZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float posAccelZ
     * }
     */
    public static void posAccelZ(MemorySegment struct, float fieldValue) {
        struct.set(posAccelZ$LAYOUT, posAccelZ$OFFSET, fieldValue);
    }

    private static final OfFloat rotVelX$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotVelX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotVelX
     * }
     */
    public static final OfFloat rotVelX$layout() {
        return rotVelX$LAYOUT;
    }

    private static final long rotVelX$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotVelX
     * }
     */
    public static final long rotVelX$offset() {
        return rotVelX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotVelX
     * }
     */
    public static float rotVelX(MemorySegment struct) {
        return struct.get(rotVelX$LAYOUT, rotVelX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotVelX
     * }
     */
    public static void rotVelX(MemorySegment struct, float fieldValue) {
        struct.set(rotVelX$LAYOUT, rotVelX$OFFSET, fieldValue);
    }

    private static final OfFloat rotVelY$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotVelY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotVelY
     * }
     */
    public static final OfFloat rotVelY$layout() {
        return rotVelY$LAYOUT;
    }

    private static final long rotVelY$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotVelY
     * }
     */
    public static final long rotVelY$offset() {
        return rotVelY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotVelY
     * }
     */
    public static float rotVelY(MemorySegment struct) {
        return struct.get(rotVelY$LAYOUT, rotVelY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotVelY
     * }
     */
    public static void rotVelY(MemorySegment struct, float fieldValue) {
        struct.set(rotVelY$LAYOUT, rotVelY$OFFSET, fieldValue);
    }

    private static final OfFloat rotVelZ$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotVelZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float rotVelZ
     * }
     */
    public static final OfFloat rotVelZ$layout() {
        return rotVelZ$LAYOUT;
    }

    private static final long rotVelZ$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float rotVelZ
     * }
     */
    public static final long rotVelZ$offset() {
        return rotVelZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float rotVelZ
     * }
     */
    public static float rotVelZ(MemorySegment struct) {
        return struct.get(rotVelZ$LAYOUT, rotVelZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float rotVelZ
     * }
     */
    public static void rotVelZ(MemorySegment struct, float fieldValue) {
        struct.set(rotVelZ$LAYOUT, rotVelZ$OFFSET, fieldValue);
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

