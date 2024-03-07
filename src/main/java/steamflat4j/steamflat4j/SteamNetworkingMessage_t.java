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
 * struct SteamNetworkingMessage_t {
 *     void *m_pData;
 *     int m_cbSize;
 *     HSteamNetConnection m_conn;
 *     SteamNetworkingIdentity m_identityPeer;
 *     int64 m_nConnUserData;
 *     SteamNetworkingMicroseconds m_usecTimeReceived;
 *     int64 m_nMessageNumber;
 *     void (*m_pfnFreeData)(SteamNetworkingMessage_t *);
 *     void (*m_pfnRelease)(SteamNetworkingMessage_t *);
 *     int m_nChannel;
 *     int m_nFlags;
 *     int64 m_nUserData;
 *     uint16 m_idxLane;
 *     uint16 _pad1__;
 * }
 * }
 */
public class SteamNetworkingMessage_t {

    SteamNetworkingMessage_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat4j.C_POINTER.withName("m_pData"),
        SteamFlat4j.C_INT.withName("m_cbSize"),
        SteamFlat4j.C_INT.withName("m_conn"),
        SteamNetworkingIdentity.layout().withName("m_identityPeer"),
        SteamFlat4j.C_LONG_LONG.withName("m_nConnUserData"),
        SteamFlat4j.C_LONG_LONG.withName("m_usecTimeReceived"),
        SteamFlat4j.C_LONG_LONG.withName("m_nMessageNumber"),
        SteamFlat4j.C_POINTER.withName("m_pfnFreeData"),
        SteamFlat4j.C_POINTER.withName("m_pfnRelease"),
        SteamFlat4j.C_INT.withName("m_nChannel"),
        SteamFlat4j.C_INT.withName("m_nFlags"),
        SteamFlat4j.C_LONG_LONG.withName("m_nUserData"),
        SteamFlat4j.C_SHORT.withName("m_idxLane"),
        SteamFlat4j.C_SHORT.withName("_pad1__"),
        MemoryLayout.paddingLayout(4)
    ).withName("SteamNetworkingMessage_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout m_pData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("m_pData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *m_pData
     * }
     */
    public static final AddressLayout m_pData$layout() {
        return m_pData$LAYOUT;
    }

    private static final long m_pData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *m_pData
     * }
     */
    public static final long m_pData$offset() {
        return m_pData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *m_pData
     * }
     */
    public static MemorySegment m_pData(MemorySegment struct) {
        return struct.get(m_pData$LAYOUT, m_pData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *m_pData
     * }
     */
    public static void m_pData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(m_pData$LAYOUT, m_pData$OFFSET, fieldValue);
    }

    private static final OfInt m_cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static final OfInt m_cbSize$layout() {
        return m_cbSize$LAYOUT;
    }

    private static final long m_cbSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static final long m_cbSize$offset() {
        return m_cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static int m_cbSize(MemorySegment struct) {
        return struct.get(m_cbSize$LAYOUT, m_cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_cbSize
     * }
     */
    public static void m_cbSize(MemorySegment struct, int fieldValue) {
        struct.set(m_cbSize$LAYOUT, m_cbSize$OFFSET, fieldValue);
    }

    private static final OfInt m_conn$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_conn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSteamNetConnection m_conn
     * }
     */
    public static final OfInt m_conn$layout() {
        return m_conn$LAYOUT;
    }

    private static final long m_conn$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSteamNetConnection m_conn
     * }
     */
    public static final long m_conn$offset() {
        return m_conn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSteamNetConnection m_conn
     * }
     */
    public static int m_conn(MemorySegment struct) {
        return struct.get(m_conn$LAYOUT, m_conn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSteamNetConnection m_conn
     * }
     */
    public static void m_conn(MemorySegment struct, int fieldValue) {
        struct.set(m_conn$LAYOUT, m_conn$OFFSET, fieldValue);
    }

    private static final GroupLayout m_identityPeer$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("m_identityPeer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityPeer
     * }
     */
    public static final GroupLayout m_identityPeer$layout() {
        return m_identityPeer$LAYOUT;
    }

    private static final long m_identityPeer$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityPeer
     * }
     */
    public static final long m_identityPeer$offset() {
        return m_identityPeer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityPeer
     * }
     */
    public static MemorySegment m_identityPeer(MemorySegment struct) {
        return struct.asSlice(m_identityPeer$OFFSET, m_identityPeer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityPeer
     * }
     */
    public static void m_identityPeer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_identityPeer$OFFSET, m_identityPeer$LAYOUT.byteSize());
    }

    private static final OfLong m_nConnUserData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_nConnUserData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64 m_nConnUserData
     * }
     */
    public static final OfLong m_nConnUserData$layout() {
        return m_nConnUserData$LAYOUT;
    }

    private static final long m_nConnUserData$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64 m_nConnUserData
     * }
     */
    public static final long m_nConnUserData$offset() {
        return m_nConnUserData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64 m_nConnUserData
     * }
     */
    public static long m_nConnUserData(MemorySegment struct) {
        return struct.get(m_nConnUserData$LAYOUT, m_nConnUserData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64 m_nConnUserData
     * }
     */
    public static void m_nConnUserData(MemorySegment struct, long fieldValue) {
        struct.set(m_nConnUserData$LAYOUT, m_nConnUserData$OFFSET, fieldValue);
    }

    private static final OfLong m_usecTimeReceived$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_usecTimeReceived"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingMicroseconds m_usecTimeReceived
     * }
     */
    public static final OfLong m_usecTimeReceived$layout() {
        return m_usecTimeReceived$LAYOUT;
    }

    private static final long m_usecTimeReceived$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingMicroseconds m_usecTimeReceived
     * }
     */
    public static final long m_usecTimeReceived$offset() {
        return m_usecTimeReceived$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingMicroseconds m_usecTimeReceived
     * }
     */
    public static long m_usecTimeReceived(MemorySegment struct) {
        return struct.get(m_usecTimeReceived$LAYOUT, m_usecTimeReceived$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingMicroseconds m_usecTimeReceived
     * }
     */
    public static void m_usecTimeReceived(MemorySegment struct, long fieldValue) {
        struct.set(m_usecTimeReceived$LAYOUT, m_usecTimeReceived$OFFSET, fieldValue);
    }

    private static final OfLong m_nMessageNumber$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_nMessageNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64 m_nMessageNumber
     * }
     */
    public static final OfLong m_nMessageNumber$layout() {
        return m_nMessageNumber$LAYOUT;
    }

    private static final long m_nMessageNumber$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64 m_nMessageNumber
     * }
     */
    public static final long m_nMessageNumber$offset() {
        return m_nMessageNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64 m_nMessageNumber
     * }
     */
    public static long m_nMessageNumber(MemorySegment struct) {
        return struct.get(m_nMessageNumber$LAYOUT, m_nMessageNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64 m_nMessageNumber
     * }
     */
    public static void m_nMessageNumber(MemorySegment struct, long fieldValue) {
        struct.set(m_nMessageNumber$LAYOUT, m_nMessageNumber$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*m_pfnFreeData)(SteamNetworkingMessage_t *)
     * }
     */
    public static class m_pfnFreeData {

        m_pfnFreeData() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            SteamFlat4j.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = SteamFlat4j.upcallHandle(m_pfnFreeData.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(m_pfnFreeData.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout m_pfnFreeData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("m_pfnFreeData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*m_pfnFreeData)(SteamNetworkingMessage_t *)
     * }
     */
    public static final AddressLayout m_pfnFreeData$layout() {
        return m_pfnFreeData$LAYOUT;
    }

    private static final long m_pfnFreeData$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*m_pfnFreeData)(SteamNetworkingMessage_t *)
     * }
     */
    public static final long m_pfnFreeData$offset() {
        return m_pfnFreeData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*m_pfnFreeData)(SteamNetworkingMessage_t *)
     * }
     */
    public static MemorySegment m_pfnFreeData(MemorySegment struct) {
        return struct.get(m_pfnFreeData$LAYOUT, m_pfnFreeData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*m_pfnFreeData)(SteamNetworkingMessage_t *)
     * }
     */
    public static void m_pfnFreeData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(m_pfnFreeData$LAYOUT, m_pfnFreeData$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*m_pfnRelease)(SteamNetworkingMessage_t *)
     * }
     */
    public static class m_pfnRelease {

        m_pfnRelease() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            SteamFlat4j.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = SteamFlat4j.upcallHandle(m_pfnRelease.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(m_pfnRelease.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout m_pfnRelease$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("m_pfnRelease"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*m_pfnRelease)(SteamNetworkingMessage_t *)
     * }
     */
    public static final AddressLayout m_pfnRelease$layout() {
        return m_pfnRelease$LAYOUT;
    }

    private static final long m_pfnRelease$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*m_pfnRelease)(SteamNetworkingMessage_t *)
     * }
     */
    public static final long m_pfnRelease$offset() {
        return m_pfnRelease$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*m_pfnRelease)(SteamNetworkingMessage_t *)
     * }
     */
    public static MemorySegment m_pfnRelease(MemorySegment struct) {
        return struct.get(m_pfnRelease$LAYOUT, m_pfnRelease$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*m_pfnRelease)(SteamNetworkingMessage_t *)
     * }
     */
    public static void m_pfnRelease(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(m_pfnRelease$LAYOUT, m_pfnRelease$OFFSET, fieldValue);
    }

    private static final OfInt m_nChannel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nChannel
     * }
     */
    public static final OfInt m_nChannel$layout() {
        return m_nChannel$LAYOUT;
    }

    private static final long m_nChannel$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nChannel
     * }
     */
    public static final long m_nChannel$offset() {
        return m_nChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nChannel
     * }
     */
    public static int m_nChannel(MemorySegment struct) {
        return struct.get(m_nChannel$LAYOUT, m_nChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nChannel
     * }
     */
    public static void m_nChannel(MemorySegment struct, int fieldValue) {
        struct.set(m_nChannel$LAYOUT, m_nChannel$OFFSET, fieldValue);
    }

    private static final OfInt m_nFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_nFlags
     * }
     */
    public static final OfInt m_nFlags$layout() {
        return m_nFlags$LAYOUT;
    }

    private static final long m_nFlags$OFFSET = 196;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_nFlags
     * }
     */
    public static final long m_nFlags$offset() {
        return m_nFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_nFlags
     * }
     */
    public static int m_nFlags(MemorySegment struct) {
        return struct.get(m_nFlags$LAYOUT, m_nFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_nFlags
     * }
     */
    public static void m_nFlags(MemorySegment struct, int fieldValue) {
        struct.set(m_nFlags$LAYOUT, m_nFlags$OFFSET, fieldValue);
    }

    private static final OfLong m_nUserData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_nUserData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64 m_nUserData
     * }
     */
    public static final OfLong m_nUserData$layout() {
        return m_nUserData$LAYOUT;
    }

    private static final long m_nUserData$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64 m_nUserData
     * }
     */
    public static final long m_nUserData$offset() {
        return m_nUserData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64 m_nUserData
     * }
     */
    public static long m_nUserData(MemorySegment struct) {
        return struct.get(m_nUserData$LAYOUT, m_nUserData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64 m_nUserData
     * }
     */
    public static void m_nUserData(MemorySegment struct, long fieldValue) {
        struct.set(m_nUserData$LAYOUT, m_nUserData$OFFSET, fieldValue);
    }

    private static final OfShort m_idxLane$LAYOUT = (OfShort)$LAYOUT.select(groupElement("m_idxLane"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16 m_idxLane
     * }
     */
    public static final OfShort m_idxLane$layout() {
        return m_idxLane$LAYOUT;
    }

    private static final long m_idxLane$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16 m_idxLane
     * }
     */
    public static final long m_idxLane$offset() {
        return m_idxLane$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16 m_idxLane
     * }
     */
    public static short m_idxLane(MemorySegment struct) {
        return struct.get(m_idxLane$LAYOUT, m_idxLane$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16 m_idxLane
     * }
     */
    public static void m_idxLane(MemorySegment struct, short fieldValue) {
        struct.set(m_idxLane$LAYOUT, m_idxLane$OFFSET, fieldValue);
    }

    private static final OfShort _pad1__$LAYOUT = (OfShort)$LAYOUT.select(groupElement("_pad1__"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16 _pad1__
     * }
     */
    public static final OfShort _pad1__$layout() {
        return _pad1__$LAYOUT;
    }

    private static final long _pad1__$OFFSET = 210;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16 _pad1__
     * }
     */
    public static final long _pad1__$offset() {
        return _pad1__$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16 _pad1__
     * }
     */
    public static short _pad1__(MemorySegment struct) {
        return struct.get(_pad1__$LAYOUT, _pad1__$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16 _pad1__
     * }
     */
    public static void _pad1__(MemorySegment struct, short fieldValue) {
        struct.set(_pad1__$LAYOUT, _pad1__$OFFSET, fieldValue);
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

