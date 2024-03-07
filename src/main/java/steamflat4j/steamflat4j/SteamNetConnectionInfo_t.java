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
 * struct SteamNetConnectionInfo_t {
 *     SteamNetworkingIdentity m_identityRemote;
 *     int64 m_nUserData;
 *     HSteamListenSocket m_hListenSocket;
 *     SteamNetworkingIPAddr m_addrRemote;
 *     uint16 m__pad1;
 *     SteamNetworkingPOPID m_idPOPRemote;
 *     SteamNetworkingPOPID m_idPOPRelay;
 *     ESteamNetworkingConnectionState m_eState;
 *     int m_eEndReason;
 *     char m_szEndDebug[128];
 *     char m_szConnectionDescription[128];
 *     int m_nFlags;
 *     uint32 reserved[63];
 * }
 * }
 */
public class SteamNetConnectionInfo_t {

    SteamNetConnectionInfo_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamNetworkingIdentity.layout().withName("m_identityRemote"),
        SteamFlat4j.C_LONG_LONG.withName("m_nUserData"),
        SteamFlat4j.C_INT.withName("m_hListenSocket"),
        SteamNetworkingIPAddr.layout().withName("m_addrRemote"),
        SteamFlat4j.C_SHORT.withName("m__pad1"),
        SteamFlat4j.C_INT.withName("m_idPOPRemote"),
        SteamFlat4j.C_INT.withName("m_idPOPRelay"),
        SteamFlat4j.C_INT.withName("m_eState"),
        SteamFlat4j.C_INT.withName("m_eEndReason"),
        MemoryLayout.sequenceLayout(128, SteamFlat4j.C_CHAR).withName("m_szEndDebug"),
        MemoryLayout.sequenceLayout(128, SteamFlat4j.C_CHAR).withName("m_szConnectionDescription"),
        SteamFlat4j.C_INT.withName("m_nFlags"),
        MemoryLayout.sequenceLayout(63, SteamFlat4j.C_INT).withName("reserved")
    ).withName("SteamNetConnectionInfo_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout m_identityRemote$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("m_identityRemote"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityRemote
     * }
     */
    public static final GroupLayout m_identityRemote$layout() {
        return m_identityRemote$LAYOUT;
    }

    private static final long m_identityRemote$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityRemote
     * }
     */
    public static final long m_identityRemote$offset() {
        return m_identityRemote$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityRemote
     * }
     */
    public static MemorySegment m_identityRemote(MemorySegment struct) {
        return struct.asSlice(m_identityRemote$OFFSET, m_identityRemote$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingIdentity m_identityRemote
     * }
     */
    public static void m_identityRemote(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_identityRemote$OFFSET, m_identityRemote$LAYOUT.byteSize());
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

    private static final long m_nUserData$OFFSET = 136;

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

    private static final OfInt m_hListenSocket$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_hListenSocket"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSteamListenSocket m_hListenSocket
     * }
     */
    public static final OfInt m_hListenSocket$layout() {
        return m_hListenSocket$LAYOUT;
    }

    private static final long m_hListenSocket$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSteamListenSocket m_hListenSocket
     * }
     */
    public static final long m_hListenSocket$offset() {
        return m_hListenSocket$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSteamListenSocket m_hListenSocket
     * }
     */
    public static int m_hListenSocket(MemorySegment struct) {
        return struct.get(m_hListenSocket$LAYOUT, m_hListenSocket$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSteamListenSocket m_hListenSocket
     * }
     */
    public static void m_hListenSocket(MemorySegment struct, int fieldValue) {
        struct.set(m_hListenSocket$LAYOUT, m_hListenSocket$OFFSET, fieldValue);
    }

    private static final GroupLayout m_addrRemote$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("m_addrRemote"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingIPAddr m_addrRemote
     * }
     */
    public static final GroupLayout m_addrRemote$layout() {
        return m_addrRemote$LAYOUT;
    }

    private static final long m_addrRemote$OFFSET = 148;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingIPAddr m_addrRemote
     * }
     */
    public static final long m_addrRemote$offset() {
        return m_addrRemote$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingIPAddr m_addrRemote
     * }
     */
    public static MemorySegment m_addrRemote(MemorySegment struct) {
        return struct.asSlice(m_addrRemote$OFFSET, m_addrRemote$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingIPAddr m_addrRemote
     * }
     */
    public static void m_addrRemote(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_addrRemote$OFFSET, m_addrRemote$LAYOUT.byteSize());
    }

    private static final OfShort m__pad1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("m__pad1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16 m__pad1
     * }
     */
    public static final OfShort m__pad1$layout() {
        return m__pad1$LAYOUT;
    }

    private static final long m__pad1$OFFSET = 166;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16 m__pad1
     * }
     */
    public static final long m__pad1$offset() {
        return m__pad1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16 m__pad1
     * }
     */
    public static short m__pad1(MemorySegment struct) {
        return struct.get(m__pad1$LAYOUT, m__pad1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16 m__pad1
     * }
     */
    public static void m__pad1(MemorySegment struct, short fieldValue) {
        struct.set(m__pad1$LAYOUT, m__pad1$OFFSET, fieldValue);
    }

    private static final OfInt m_idPOPRemote$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_idPOPRemote"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRemote
     * }
     */
    public static final OfInt m_idPOPRemote$layout() {
        return m_idPOPRemote$LAYOUT;
    }

    private static final long m_idPOPRemote$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRemote
     * }
     */
    public static final long m_idPOPRemote$offset() {
        return m_idPOPRemote$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRemote
     * }
     */
    public static int m_idPOPRemote(MemorySegment struct) {
        return struct.get(m_idPOPRemote$LAYOUT, m_idPOPRemote$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRemote
     * }
     */
    public static void m_idPOPRemote(MemorySegment struct, int fieldValue) {
        struct.set(m_idPOPRemote$LAYOUT, m_idPOPRemote$OFFSET, fieldValue);
    }

    private static final OfInt m_idPOPRelay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_idPOPRelay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRelay
     * }
     */
    public static final OfInt m_idPOPRelay$layout() {
        return m_idPOPRelay$LAYOUT;
    }

    private static final long m_idPOPRelay$OFFSET = 172;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRelay
     * }
     */
    public static final long m_idPOPRelay$offset() {
        return m_idPOPRelay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRelay
     * }
     */
    public static int m_idPOPRelay(MemorySegment struct) {
        return struct.get(m_idPOPRelay$LAYOUT, m_idPOPRelay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SteamNetworkingPOPID m_idPOPRelay
     * }
     */
    public static void m_idPOPRelay(MemorySegment struct, int fieldValue) {
        struct.set(m_idPOPRelay$LAYOUT, m_idPOPRelay$OFFSET, fieldValue);
    }

    private static final OfInt m_eState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ESteamNetworkingConnectionState m_eState
     * }
     */
    public static final OfInt m_eState$layout() {
        return m_eState$LAYOUT;
    }

    private static final long m_eState$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ESteamNetworkingConnectionState m_eState
     * }
     */
    public static final long m_eState$offset() {
        return m_eState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ESteamNetworkingConnectionState m_eState
     * }
     */
    public static int m_eState(MemorySegment struct) {
        return struct.get(m_eState$LAYOUT, m_eState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ESteamNetworkingConnectionState m_eState
     * }
     */
    public static void m_eState(MemorySegment struct, int fieldValue) {
        struct.set(m_eState$LAYOUT, m_eState$OFFSET, fieldValue);
    }

    private static final OfInt m_eEndReason$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eEndReason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int m_eEndReason
     * }
     */
    public static final OfInt m_eEndReason$layout() {
        return m_eEndReason$LAYOUT;
    }

    private static final long m_eEndReason$OFFSET = 180;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int m_eEndReason
     * }
     */
    public static final long m_eEndReason$offset() {
        return m_eEndReason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int m_eEndReason
     * }
     */
    public static int m_eEndReason(MemorySegment struct) {
        return struct.get(m_eEndReason$LAYOUT, m_eEndReason$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int m_eEndReason
     * }
     */
    public static void m_eEndReason(MemorySegment struct, int fieldValue) {
        struct.set(m_eEndReason$LAYOUT, m_eEndReason$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_szEndDebug$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_szEndDebug"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static final SequenceLayout m_szEndDebug$layout() {
        return m_szEndDebug$LAYOUT;
    }

    private static final long m_szEndDebug$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static final long m_szEndDebug$offset() {
        return m_szEndDebug$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static MemorySegment m_szEndDebug(MemorySegment struct) {
        return struct.asSlice(m_szEndDebug$OFFSET, m_szEndDebug$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static void m_szEndDebug(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_szEndDebug$OFFSET, m_szEndDebug$LAYOUT.byteSize());
    }

    private static long[] m_szEndDebug$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static long[] m_szEndDebug$dimensions() {
        return m_szEndDebug$DIMS;
    }
    private static final VarHandle m_szEndDebug$ELEM_HANDLE = m_szEndDebug$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static byte m_szEndDebug(MemorySegment struct, long index0) {
        return (byte)m_szEndDebug$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_szEndDebug[128]
     * }
     */
    public static void m_szEndDebug(MemorySegment struct, long index0, byte fieldValue) {
        m_szEndDebug$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout m_szConnectionDescription$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_szConnectionDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static final SequenceLayout m_szConnectionDescription$layout() {
        return m_szConnectionDescription$LAYOUT;
    }

    private static final long m_szConnectionDescription$OFFSET = 312;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static final long m_szConnectionDescription$offset() {
        return m_szConnectionDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static MemorySegment m_szConnectionDescription(MemorySegment struct) {
        return struct.asSlice(m_szConnectionDescription$OFFSET, m_szConnectionDescription$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static void m_szConnectionDescription(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_szConnectionDescription$OFFSET, m_szConnectionDescription$LAYOUT.byteSize());
    }

    private static long[] m_szConnectionDescription$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static long[] m_szConnectionDescription$dimensions() {
        return m_szConnectionDescription$DIMS;
    }
    private static final VarHandle m_szConnectionDescription$ELEM_HANDLE = m_szConnectionDescription$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static byte m_szConnectionDescription(MemorySegment struct, long index0) {
        return (byte)m_szConnectionDescription$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_szConnectionDescription[128]
     * }
     */
    public static void m_szConnectionDescription(MemorySegment struct, long index0, byte fieldValue) {
        m_szConnectionDescription$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

    private static final long m_nFlags$OFFSET = 440;

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

    private static final SequenceLayout reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static final SequenceLayout reserved$layout() {
        return reserved$LAYOUT;
    }

    private static final long reserved$OFFSET = 444;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static final long reserved$offset() {
        return reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static MemorySegment reserved(MemorySegment struct) {
        return struct.asSlice(reserved$OFFSET, reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static void reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, reserved$OFFSET, reserved$LAYOUT.byteSize());
    }

    private static long[] reserved$DIMS = { 63 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static long[] reserved$dimensions() {
        return reserved$DIMS;
    }
    private static final VarHandle reserved$ELEM_HANDLE = reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static int reserved(MemorySegment struct, long index0) {
        return (int)reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint32 reserved[63]
     * }
     */
    public static void reserved(MemorySegment struct, long index0, int fieldValue) {
        reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

