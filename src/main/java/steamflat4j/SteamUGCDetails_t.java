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
 * struct SteamUGCDetails_t {
 *     PublishedFileId_t m_nPublishedFileId;
 *     EResult m_eResult;
 *     EWorkshopFileType m_eFileType;
 *     AppId_t m_nCreatorAppID;
 *     AppId_t m_nConsumerAppID;
 *     char m_rgchTitle[129];
 *     char m_rgchDescription[8000];
 *     uint64 m_ulSteamIDOwner;
 *     uint32 m_rtimeCreated;
 *     uint32 m_rtimeUpdated;
 *     uint32 m_rtimeAddedToUserList;
 *     ERemoteStoragePublishedFileVisibility m_eVisibility;
 *     bool m_bBanned;
 *     bool m_bAcceptedForUse;
 *     bool m_bTagsTruncated;
 *     char m_rgchTags[1025];
 *     UGCHandle_t m_hFile;
 *     UGCHandle_t m_hPreviewFile;
 *     char m_pchFileName[260];
 *     int32 m_nFileSize;
 *     int32 m_nPreviewFileSize;
 *     char m_rgchURL[256];
 *     uint32 m_unVotesUp;
 *     uint32 m_unVotesDown;
 *     float m_flScore;
 *     uint32 m_unNumChildren;
 * }
 * }
 */
public class SteamUGCDetails_t {

    SteamUGCDetails_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SteamFlat.C_LONG_LONG.withName("m_nPublishedFileId"),
        SteamFlat.C_INT.withName("m_eResult"),
        SteamFlat.C_INT.withName("m_eFileType"),
        SteamFlat.C_INT.withName("m_nCreatorAppID"),
        SteamFlat.C_INT.withName("m_nConsumerAppID"),
        MemoryLayout.sequenceLayout(129, SteamFlat.C_CHAR).withName("m_rgchTitle"),
        MemoryLayout.sequenceLayout(8000, SteamFlat.C_CHAR).withName("m_rgchDescription"),
        MemoryLayout.paddingLayout(7),
        SteamFlat.C_LONG_LONG.withName("m_ulSteamIDOwner"),
        SteamFlat.C_INT.withName("m_rtimeCreated"),
        SteamFlat.C_INT.withName("m_rtimeUpdated"),
        SteamFlat.C_INT.withName("m_rtimeAddedToUserList"),
        SteamFlat.C_INT.withName("m_eVisibility"),
        SteamFlat.C_BOOL.withName("m_bBanned"),
        SteamFlat.C_BOOL.withName("m_bAcceptedForUse"),
        SteamFlat.C_BOOL.withName("m_bTagsTruncated"),
        MemoryLayout.sequenceLayout(1025, SteamFlat.C_CHAR).withName("m_rgchTags"),
        MemoryLayout.paddingLayout(4),
        SteamFlat.C_LONG_LONG.withName("m_hFile"),
        SteamFlat.C_LONG_LONG.withName("m_hPreviewFile"),
        MemoryLayout.sequenceLayout(260, SteamFlat.C_CHAR).withName("m_pchFileName"),
        SteamFlat.C_INT.withName("m_nFileSize"),
        SteamFlat.C_INT.withName("m_nPreviewFileSize"),
        MemoryLayout.sequenceLayout(256, SteamFlat.C_CHAR).withName("m_rgchURL"),
        SteamFlat.C_INT.withName("m_unVotesUp"),
        SteamFlat.C_INT.withName("m_unVotesDown"),
        SteamFlat.C_FLOAT.withName("m_flScore"),
        SteamFlat.C_INT.withName("m_unNumChildren"),
        MemoryLayout.paddingLayout(4)
    ).withName("SteamUGCDetails_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong m_nPublishedFileId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_nPublishedFileId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PublishedFileId_t m_nPublishedFileId
     * }
     */
    public static final OfLong m_nPublishedFileId$layout() {
        return m_nPublishedFileId$LAYOUT;
    }

    private static final long m_nPublishedFileId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PublishedFileId_t m_nPublishedFileId
     * }
     */
    public static final long m_nPublishedFileId$offset() {
        return m_nPublishedFileId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PublishedFileId_t m_nPublishedFileId
     * }
     */
    public static long m_nPublishedFileId(MemorySegment struct) {
        return struct.get(m_nPublishedFileId$LAYOUT, m_nPublishedFileId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PublishedFileId_t m_nPublishedFileId
     * }
     */
    public static void m_nPublishedFileId(MemorySegment struct, long fieldValue) {
        struct.set(m_nPublishedFileId$LAYOUT, m_nPublishedFileId$OFFSET, fieldValue);
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

    private static final long m_eResult$OFFSET = 8;

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

    private static final OfInt m_eFileType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eFileType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EWorkshopFileType m_eFileType
     * }
     */
    public static final OfInt m_eFileType$layout() {
        return m_eFileType$LAYOUT;
    }

    private static final long m_eFileType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EWorkshopFileType m_eFileType
     * }
     */
    public static final long m_eFileType$offset() {
        return m_eFileType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EWorkshopFileType m_eFileType
     * }
     */
    public static int m_eFileType(MemorySegment struct) {
        return struct.get(m_eFileType$LAYOUT, m_eFileType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EWorkshopFileType m_eFileType
     * }
     */
    public static void m_eFileType(MemorySegment struct, int fieldValue) {
        struct.set(m_eFileType$LAYOUT, m_eFileType$OFFSET, fieldValue);
    }

    private static final OfInt m_nCreatorAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nCreatorAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AppId_t m_nCreatorAppID
     * }
     */
    public static final OfInt m_nCreatorAppID$layout() {
        return m_nCreatorAppID$LAYOUT;
    }

    private static final long m_nCreatorAppID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AppId_t m_nCreatorAppID
     * }
     */
    public static final long m_nCreatorAppID$offset() {
        return m_nCreatorAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AppId_t m_nCreatorAppID
     * }
     */
    public static int m_nCreatorAppID(MemorySegment struct) {
        return struct.get(m_nCreatorAppID$LAYOUT, m_nCreatorAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AppId_t m_nCreatorAppID
     * }
     */
    public static void m_nCreatorAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_nCreatorAppID$LAYOUT, m_nCreatorAppID$OFFSET, fieldValue);
    }

    private static final OfInt m_nConsumerAppID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nConsumerAppID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AppId_t m_nConsumerAppID
     * }
     */
    public static final OfInt m_nConsumerAppID$layout() {
        return m_nConsumerAppID$LAYOUT;
    }

    private static final long m_nConsumerAppID$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AppId_t m_nConsumerAppID
     * }
     */
    public static final long m_nConsumerAppID$offset() {
        return m_nConsumerAppID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AppId_t m_nConsumerAppID
     * }
     */
    public static int m_nConsumerAppID(MemorySegment struct) {
        return struct.get(m_nConsumerAppID$LAYOUT, m_nConsumerAppID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AppId_t m_nConsumerAppID
     * }
     */
    public static void m_nConsumerAppID(MemorySegment struct, int fieldValue) {
        struct.set(m_nConsumerAppID$LAYOUT, m_nConsumerAppID$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_rgchTitle$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static final SequenceLayout m_rgchTitle$layout() {
        return m_rgchTitle$LAYOUT;
    }

    private static final long m_rgchTitle$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static final long m_rgchTitle$offset() {
        return m_rgchTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static MemorySegment m_rgchTitle(MemorySegment struct) {
        return struct.asSlice(m_rgchTitle$OFFSET, m_rgchTitle$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static void m_rgchTitle(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchTitle$OFFSET, m_rgchTitle$LAYOUT.byteSize());
    }

    private static long[] m_rgchTitle$DIMS = { 129 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static long[] m_rgchTitle$dimensions() {
        return m_rgchTitle$DIMS;
    }
    private static final VarHandle m_rgchTitle$ELEM_HANDLE = m_rgchTitle$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static byte m_rgchTitle(MemorySegment struct, long index0) {
        return (byte)m_rgchTitle$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchTitle[129]
     * }
     */
    public static void m_rgchTitle(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchTitle$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout m_rgchDescription$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static final SequenceLayout m_rgchDescription$layout() {
        return m_rgchDescription$LAYOUT;
    }

    private static final long m_rgchDescription$OFFSET = 153;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static final long m_rgchDescription$offset() {
        return m_rgchDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static MemorySegment m_rgchDescription(MemorySegment struct) {
        return struct.asSlice(m_rgchDescription$OFFSET, m_rgchDescription$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static void m_rgchDescription(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchDescription$OFFSET, m_rgchDescription$LAYOUT.byteSize());
    }

    private static long[] m_rgchDescription$DIMS = { 8000 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static long[] m_rgchDescription$dimensions() {
        return m_rgchDescription$DIMS;
    }
    private static final VarHandle m_rgchDescription$ELEM_HANDLE = m_rgchDescription$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static byte m_rgchDescription(MemorySegment struct, long index0) {
        return (byte)m_rgchDescription$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchDescription[8000]
     * }
     */
    public static void m_rgchDescription(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchDescription$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong m_ulSteamIDOwner$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_ulSteamIDOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDOwner
     * }
     */
    public static final OfLong m_ulSteamIDOwner$layout() {
        return m_ulSteamIDOwner$LAYOUT;
    }

    private static final long m_ulSteamIDOwner$OFFSET = 8160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDOwner
     * }
     */
    public static final long m_ulSteamIDOwner$offset() {
        return m_ulSteamIDOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDOwner
     * }
     */
    public static long m_ulSteamIDOwner(MemorySegment struct) {
        return struct.get(m_ulSteamIDOwner$LAYOUT, m_ulSteamIDOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64 m_ulSteamIDOwner
     * }
     */
    public static void m_ulSteamIDOwner(MemorySegment struct, long fieldValue) {
        struct.set(m_ulSteamIDOwner$LAYOUT, m_ulSteamIDOwner$OFFSET, fieldValue);
    }

    private static final OfInt m_rtimeCreated$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_rtimeCreated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_rtimeCreated
     * }
     */
    public static final OfInt m_rtimeCreated$layout() {
        return m_rtimeCreated$LAYOUT;
    }

    private static final long m_rtimeCreated$OFFSET = 8168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_rtimeCreated
     * }
     */
    public static final long m_rtimeCreated$offset() {
        return m_rtimeCreated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeCreated
     * }
     */
    public static int m_rtimeCreated(MemorySegment struct) {
        return struct.get(m_rtimeCreated$LAYOUT, m_rtimeCreated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeCreated
     * }
     */
    public static void m_rtimeCreated(MemorySegment struct, int fieldValue) {
        struct.set(m_rtimeCreated$LAYOUT, m_rtimeCreated$OFFSET, fieldValue);
    }

    private static final OfInt m_rtimeUpdated$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_rtimeUpdated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_rtimeUpdated
     * }
     */
    public static final OfInt m_rtimeUpdated$layout() {
        return m_rtimeUpdated$LAYOUT;
    }

    private static final long m_rtimeUpdated$OFFSET = 8172;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_rtimeUpdated
     * }
     */
    public static final long m_rtimeUpdated$offset() {
        return m_rtimeUpdated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeUpdated
     * }
     */
    public static int m_rtimeUpdated(MemorySegment struct) {
        return struct.get(m_rtimeUpdated$LAYOUT, m_rtimeUpdated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeUpdated
     * }
     */
    public static void m_rtimeUpdated(MemorySegment struct, int fieldValue) {
        struct.set(m_rtimeUpdated$LAYOUT, m_rtimeUpdated$OFFSET, fieldValue);
    }

    private static final OfInt m_rtimeAddedToUserList$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_rtimeAddedToUserList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_rtimeAddedToUserList
     * }
     */
    public static final OfInt m_rtimeAddedToUserList$layout() {
        return m_rtimeAddedToUserList$LAYOUT;
    }

    private static final long m_rtimeAddedToUserList$OFFSET = 8176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_rtimeAddedToUserList
     * }
     */
    public static final long m_rtimeAddedToUserList$offset() {
        return m_rtimeAddedToUserList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeAddedToUserList
     * }
     */
    public static int m_rtimeAddedToUserList(MemorySegment struct) {
        return struct.get(m_rtimeAddedToUserList$LAYOUT, m_rtimeAddedToUserList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_rtimeAddedToUserList
     * }
     */
    public static void m_rtimeAddedToUserList(MemorySegment struct, int fieldValue) {
        struct.set(m_rtimeAddedToUserList$LAYOUT, m_rtimeAddedToUserList$OFFSET, fieldValue);
    }

    private static final OfInt m_eVisibility$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_eVisibility"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ERemoteStoragePublishedFileVisibility m_eVisibility
     * }
     */
    public static final OfInt m_eVisibility$layout() {
        return m_eVisibility$LAYOUT;
    }

    private static final long m_eVisibility$OFFSET = 8180;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ERemoteStoragePublishedFileVisibility m_eVisibility
     * }
     */
    public static final long m_eVisibility$offset() {
        return m_eVisibility$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ERemoteStoragePublishedFileVisibility m_eVisibility
     * }
     */
    public static int m_eVisibility(MemorySegment struct) {
        return struct.get(m_eVisibility$LAYOUT, m_eVisibility$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ERemoteStoragePublishedFileVisibility m_eVisibility
     * }
     */
    public static void m_eVisibility(MemorySegment struct, int fieldValue) {
        struct.set(m_eVisibility$LAYOUT, m_eVisibility$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bBanned$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bBanned"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bBanned
     * }
     */
    public static final OfBoolean m_bBanned$layout() {
        return m_bBanned$LAYOUT;
    }

    private static final long m_bBanned$OFFSET = 8184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bBanned
     * }
     */
    public static final long m_bBanned$offset() {
        return m_bBanned$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bBanned
     * }
     */
    public static boolean m_bBanned(MemorySegment struct) {
        return struct.get(m_bBanned$LAYOUT, m_bBanned$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bBanned
     * }
     */
    public static void m_bBanned(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bBanned$LAYOUT, m_bBanned$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bAcceptedForUse$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bAcceptedForUse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bAcceptedForUse
     * }
     */
    public static final OfBoolean m_bAcceptedForUse$layout() {
        return m_bAcceptedForUse$LAYOUT;
    }

    private static final long m_bAcceptedForUse$OFFSET = 8185;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bAcceptedForUse
     * }
     */
    public static final long m_bAcceptedForUse$offset() {
        return m_bAcceptedForUse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bAcceptedForUse
     * }
     */
    public static boolean m_bAcceptedForUse(MemorySegment struct) {
        return struct.get(m_bAcceptedForUse$LAYOUT, m_bAcceptedForUse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bAcceptedForUse
     * }
     */
    public static void m_bAcceptedForUse(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bAcceptedForUse$LAYOUT, m_bAcceptedForUse$OFFSET, fieldValue);
    }

    private static final OfBoolean m_bTagsTruncated$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("m_bTagsTruncated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool m_bTagsTruncated
     * }
     */
    public static final OfBoolean m_bTagsTruncated$layout() {
        return m_bTagsTruncated$LAYOUT;
    }

    private static final long m_bTagsTruncated$OFFSET = 8186;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool m_bTagsTruncated
     * }
     */
    public static final long m_bTagsTruncated$offset() {
        return m_bTagsTruncated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool m_bTagsTruncated
     * }
     */
    public static boolean m_bTagsTruncated(MemorySegment struct) {
        return struct.get(m_bTagsTruncated$LAYOUT, m_bTagsTruncated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool m_bTagsTruncated
     * }
     */
    public static void m_bTagsTruncated(MemorySegment struct, boolean fieldValue) {
        struct.set(m_bTagsTruncated$LAYOUT, m_bTagsTruncated$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_rgchTags$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchTags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static final SequenceLayout m_rgchTags$layout() {
        return m_rgchTags$LAYOUT;
    }

    private static final long m_rgchTags$OFFSET = 8187;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static final long m_rgchTags$offset() {
        return m_rgchTags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static MemorySegment m_rgchTags(MemorySegment struct) {
        return struct.asSlice(m_rgchTags$OFFSET, m_rgchTags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static void m_rgchTags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchTags$OFFSET, m_rgchTags$LAYOUT.byteSize());
    }

    private static long[] m_rgchTags$DIMS = { 1025 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static long[] m_rgchTags$dimensions() {
        return m_rgchTags$DIMS;
    }
    private static final VarHandle m_rgchTags$ELEM_HANDLE = m_rgchTags$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static byte m_rgchTags(MemorySegment struct, long index0) {
        return (byte)m_rgchTags$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchTags[1025]
     * }
     */
    public static void m_rgchTags(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchTags$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong m_hFile$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_hFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hFile
     * }
     */
    public static final OfLong m_hFile$layout() {
        return m_hFile$LAYOUT;
    }

    private static final long m_hFile$OFFSET = 9216;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hFile
     * }
     */
    public static final long m_hFile$offset() {
        return m_hFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hFile
     * }
     */
    public static long m_hFile(MemorySegment struct) {
        return struct.get(m_hFile$LAYOUT, m_hFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hFile
     * }
     */
    public static void m_hFile(MemorySegment struct, long fieldValue) {
        struct.set(m_hFile$LAYOUT, m_hFile$OFFSET, fieldValue);
    }

    private static final OfLong m_hPreviewFile$LAYOUT = (OfLong)$LAYOUT.select(groupElement("m_hPreviewFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hPreviewFile
     * }
     */
    public static final OfLong m_hPreviewFile$layout() {
        return m_hPreviewFile$LAYOUT;
    }

    private static final long m_hPreviewFile$OFFSET = 9224;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hPreviewFile
     * }
     */
    public static final long m_hPreviewFile$offset() {
        return m_hPreviewFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hPreviewFile
     * }
     */
    public static long m_hPreviewFile(MemorySegment struct) {
        return struct.get(m_hPreviewFile$LAYOUT, m_hPreviewFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UGCHandle_t m_hPreviewFile
     * }
     */
    public static void m_hPreviewFile(MemorySegment struct, long fieldValue) {
        struct.set(m_hPreviewFile$LAYOUT, m_hPreviewFile$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_pchFileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_pchFileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static final SequenceLayout m_pchFileName$layout() {
        return m_pchFileName$LAYOUT;
    }

    private static final long m_pchFileName$OFFSET = 9232;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static final long m_pchFileName$offset() {
        return m_pchFileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static MemorySegment m_pchFileName(MemorySegment struct) {
        return struct.asSlice(m_pchFileName$OFFSET, m_pchFileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static void m_pchFileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_pchFileName$OFFSET, m_pchFileName$LAYOUT.byteSize());
    }

    private static long[] m_pchFileName$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static long[] m_pchFileName$dimensions() {
        return m_pchFileName$DIMS;
    }
    private static final VarHandle m_pchFileName$ELEM_HANDLE = m_pchFileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static byte m_pchFileName(MemorySegment struct, long index0) {
        return (byte)m_pchFileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_pchFileName[260]
     * }
     */
    public static void m_pchFileName(MemorySegment struct, long index0, byte fieldValue) {
        m_pchFileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt m_nFileSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_nFileSize
     * }
     */
    public static final OfInt m_nFileSize$layout() {
        return m_nFileSize$LAYOUT;
    }

    private static final long m_nFileSize$OFFSET = 9492;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_nFileSize
     * }
     */
    public static final long m_nFileSize$offset() {
        return m_nFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_nFileSize
     * }
     */
    public static int m_nFileSize(MemorySegment struct) {
        return struct.get(m_nFileSize$LAYOUT, m_nFileSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_nFileSize
     * }
     */
    public static void m_nFileSize(MemorySegment struct, int fieldValue) {
        struct.set(m_nFileSize$LAYOUT, m_nFileSize$OFFSET, fieldValue);
    }

    private static final OfInt m_nPreviewFileSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_nPreviewFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32 m_nPreviewFileSize
     * }
     */
    public static final OfInt m_nPreviewFileSize$layout() {
        return m_nPreviewFileSize$LAYOUT;
    }

    private static final long m_nPreviewFileSize$OFFSET = 9496;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32 m_nPreviewFileSize
     * }
     */
    public static final long m_nPreviewFileSize$offset() {
        return m_nPreviewFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32 m_nPreviewFileSize
     * }
     */
    public static int m_nPreviewFileSize(MemorySegment struct) {
        return struct.get(m_nPreviewFileSize$LAYOUT, m_nPreviewFileSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32 m_nPreviewFileSize
     * }
     */
    public static void m_nPreviewFileSize(MemorySegment struct, int fieldValue) {
        struct.set(m_nPreviewFileSize$LAYOUT, m_nPreviewFileSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout m_rgchURL$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("m_rgchURL"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static final SequenceLayout m_rgchURL$layout() {
        return m_rgchURL$LAYOUT;
    }

    private static final long m_rgchURL$OFFSET = 9500;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static final long m_rgchURL$offset() {
        return m_rgchURL$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static MemorySegment m_rgchURL(MemorySegment struct) {
        return struct.asSlice(m_rgchURL$OFFSET, m_rgchURL$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static void m_rgchURL(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, m_rgchURL$OFFSET, m_rgchURL$LAYOUT.byteSize());
    }

    private static long[] m_rgchURL$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static long[] m_rgchURL$dimensions() {
        return m_rgchURL$DIMS;
    }
    private static final VarHandle m_rgchURL$ELEM_HANDLE = m_rgchURL$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static byte m_rgchURL(MemorySegment struct, long index0) {
        return (byte)m_rgchURL$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char m_rgchURL[256]
     * }
     */
    public static void m_rgchURL(MemorySegment struct, long index0, byte fieldValue) {
        m_rgchURL$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt m_unVotesUp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unVotesUp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unVotesUp
     * }
     */
    public static final OfInt m_unVotesUp$layout() {
        return m_unVotesUp$LAYOUT;
    }

    private static final long m_unVotesUp$OFFSET = 9756;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unVotesUp
     * }
     */
    public static final long m_unVotesUp$offset() {
        return m_unVotesUp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unVotesUp
     * }
     */
    public static int m_unVotesUp(MemorySegment struct) {
        return struct.get(m_unVotesUp$LAYOUT, m_unVotesUp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unVotesUp
     * }
     */
    public static void m_unVotesUp(MemorySegment struct, int fieldValue) {
        struct.set(m_unVotesUp$LAYOUT, m_unVotesUp$OFFSET, fieldValue);
    }

    private static final OfInt m_unVotesDown$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unVotesDown"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unVotesDown
     * }
     */
    public static final OfInt m_unVotesDown$layout() {
        return m_unVotesDown$LAYOUT;
    }

    private static final long m_unVotesDown$OFFSET = 9760;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unVotesDown
     * }
     */
    public static final long m_unVotesDown$offset() {
        return m_unVotesDown$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unVotesDown
     * }
     */
    public static int m_unVotesDown(MemorySegment struct) {
        return struct.get(m_unVotesDown$LAYOUT, m_unVotesDown$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unVotesDown
     * }
     */
    public static void m_unVotesDown(MemorySegment struct, int fieldValue) {
        struct.set(m_unVotesDown$LAYOUT, m_unVotesDown$OFFSET, fieldValue);
    }

    private static final OfFloat m_flScore$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("m_flScore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float m_flScore
     * }
     */
    public static final OfFloat m_flScore$layout() {
        return m_flScore$LAYOUT;
    }

    private static final long m_flScore$OFFSET = 9764;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float m_flScore
     * }
     */
    public static final long m_flScore$offset() {
        return m_flScore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float m_flScore
     * }
     */
    public static float m_flScore(MemorySegment struct) {
        return struct.get(m_flScore$LAYOUT, m_flScore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float m_flScore
     * }
     */
    public static void m_flScore(MemorySegment struct, float fieldValue) {
        struct.set(m_flScore$LAYOUT, m_flScore$OFFSET, fieldValue);
    }

    private static final OfInt m_unNumChildren$LAYOUT = (OfInt)$LAYOUT.select(groupElement("m_unNumChildren"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32 m_unNumChildren
     * }
     */
    public static final OfInt m_unNumChildren$layout() {
        return m_unNumChildren$LAYOUT;
    }

    private static final long m_unNumChildren$OFFSET = 9768;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32 m_unNumChildren
     * }
     */
    public static final long m_unNumChildren$offset() {
        return m_unNumChildren$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32 m_unNumChildren
     * }
     */
    public static int m_unNumChildren(MemorySegment struct) {
        return struct.get(m_unNumChildren$LAYOUT, m_unNumChildren$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32 m_unNumChildren
     * }
     */
    public static void m_unNumChildren(MemorySegment struct, int fieldValue) {
        struct.set(m_unNumChildren$LAYOUT, m_unNumChildren$OFFSET, fieldValue);
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

