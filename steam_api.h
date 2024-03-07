#include <stdint.h>;
#include <stdbool.h>;
typedef uint64_t uint64_gameid;
typedef uint64_t CGameID;
typedef uint64_t uint64_steamid;
typedef uint64_t CSteamID;
typedef enum ESteamIPType ESteamIPType;
typedef enum EUniverse EUniverse;
typedef enum EResult EResult;
typedef enum EVoiceResult EVoiceResult;
typedef enum EDenyReason EDenyReason;
typedef enum EBeginAuthSessionResult EBeginAuthSessionResult;
typedef enum EAuthSessionResponse EAuthSessionResponse;
typedef enum EUserHasLicenseForAppResult EUserHasLicenseForAppResult;
typedef enum EAccountType EAccountType;
typedef enum EChatEntryType EChatEntryType;
typedef enum EChatRoomEnterResponse EChatRoomEnterResponse;
typedef enum EChatSteamIDInstanceFlags EChatSteamIDInstanceFlags;
typedef enum ENotificationPosition ENotificationPosition;
typedef enum EBroadcastUploadResult EBroadcastUploadResult;
typedef enum EMarketNotAllowedReasonFlags EMarketNotAllowedReasonFlags;
typedef enum EDurationControlProgress EDurationControlProgress;
typedef enum EDurationControlNotification EDurationControlNotification;
typedef enum EDurationControlOnlineState EDurationControlOnlineState;
typedef enum EGameSearchErrorCode_t EGameSearchErrorCode_t;
typedef enum EPlayerResult_t EPlayerResult_t;
typedef enum ESteamIPv6ConnectivityProtocol ESteamIPv6ConnectivityProtocol;
typedef enum ESteamIPv6ConnectivityState ESteamIPv6ConnectivityState;
typedef enum EFriendRelationship EFriendRelationship;
typedef enum EPersonaState EPersonaState;
typedef enum EFriendFlags EFriendFlags;
typedef enum EUserRestriction EUserRestriction;
typedef enum EOverlayToStoreFlag EOverlayToStoreFlag;
typedef enum EActivateGameOverlayToWebPageMode EActivateGameOverlayToWebPageMode;
typedef enum ECommunityProfileItemType ECommunityProfileItemType;
typedef enum ECommunityProfileItemProperty ECommunityProfileItemProperty;
typedef enum EPersonaChange EPersonaChange;
typedef enum ESteamAPICallFailure ESteamAPICallFailure;
typedef enum EGamepadTextInputMode EGamepadTextInputMode;
typedef enum EGamepadTextInputLineMode EGamepadTextInputLineMode;
typedef enum EFloatingGamepadTextInputMode EFloatingGamepadTextInputMode;
typedef enum ETextFilteringContext ETextFilteringContext;
typedef enum ECheckFileSignature ECheckFileSignature;
typedef enum EMatchMakingServerResponse EMatchMakingServerResponse;
typedef enum ELobbyType ELobbyType;
typedef enum ELobbyComparison ELobbyComparison;
typedef enum ELobbyDistanceFilter ELobbyDistanceFilter;
typedef enum EChatMemberStateChange EChatMemberStateChange;
typedef enum ESteamPartyBeaconLocationType ESteamPartyBeaconLocationType;
typedef enum ESteamPartyBeaconLocationData ESteamPartyBeaconLocationData;
typedef enum ERemoteStoragePlatform ERemoteStoragePlatform;
typedef enum ERemoteStoragePublishedFileVisibility ERemoteStoragePublishedFileVisibility;
typedef enum EWorkshopFileType EWorkshopFileType;
typedef enum EWorkshopVote EWorkshopVote;
typedef enum EWorkshopFileAction EWorkshopFileAction;
typedef enum EWorkshopEnumerationType EWorkshopEnumerationType;
typedef enum EWorkshopVideoProvider EWorkshopVideoProvider;
typedef enum EUGCReadAction EUGCReadAction;
typedef enum ERemoteStorageLocalFileChange ERemoteStorageLocalFileChange;
typedef enum ERemoteStorageFilePathType ERemoteStorageFilePathType;
typedef enum ELeaderboardDataRequest ELeaderboardDataRequest;
typedef enum ELeaderboardSortMethod ELeaderboardSortMethod;
typedef enum ELeaderboardDisplayType ELeaderboardDisplayType;
typedef enum ELeaderboardUploadScoreMethod ELeaderboardUploadScoreMethod;
typedef enum EP2PSessionError EP2PSessionError;
typedef enum EP2PSend EP2PSend;
typedef enum ESNetSocketState ESNetSocketState;
typedef enum ESNetSocketConnectionType ESNetSocketConnectionType;
typedef enum EVRScreenshotType EVRScreenshotType;
typedef enum AudioPlayback_Status AudioPlayback_Status;
typedef enum EHTTPMethod EHTTPMethod;
typedef enum EHTTPStatusCode EHTTPStatusCode;
typedef enum EInputSourceMode EInputSourceMode;
typedef enum EInputActionOrigin EInputActionOrigin;
typedef enum EXboxOrigin EXboxOrigin;
typedef enum ESteamControllerPad ESteamControllerPad;
typedef enum EControllerHapticLocation EControllerHapticLocation;
typedef enum EControllerHapticType EControllerHapticType;
typedef enum ESteamInputType ESteamInputType;
typedef enum ESteamInputConfigurationEnableType ESteamInputConfigurationEnableType;
typedef enum ESteamInputLEDFlag ESteamInputLEDFlag;
typedef enum ESteamInputGlyphSize ESteamInputGlyphSize;
typedef enum ESteamInputGlyphStyle ESteamInputGlyphStyle;
typedef enum ESteamInputActionEventType ESteamInputActionEventType;
typedef enum EControllerActionOrigin EControllerActionOrigin;
typedef enum ESteamControllerLEDFlag ESteamControllerLEDFlag;
typedef enum EUGCMatchingUGCType EUGCMatchingUGCType;
typedef enum EUserUGCList EUserUGCList;
typedef enum EUserUGCListSortOrder EUserUGCListSortOrder;
typedef enum EUGCQuery EUGCQuery;
typedef enum EItemUpdateStatus EItemUpdateStatus;
typedef enum EItemState EItemState;
typedef enum EItemStatistic EItemStatistic;
typedef enum EItemPreviewType EItemPreviewType;
typedef enum EUGCContentDescriptorID EUGCContentDescriptorID;
typedef enum ESteamItemFlags ESteamItemFlags;
typedef enum ETimelineGameMode ETimelineGameMode;
typedef enum EParentalFeature EParentalFeature;
typedef enum ESteamDeviceFormFactor ESteamDeviceFormFactor;
typedef enum ESteamNetworkingAvailability ESteamNetworkingAvailability;
typedef enum ESteamNetworkingIdentityType ESteamNetworkingIdentityType;
typedef enum ESteamNetworkingFakeIPType ESteamNetworkingFakeIPType;
typedef enum ESteamNetworkingConnectionState ESteamNetworkingConnectionState;
typedef enum ESteamNetConnectionEnd ESteamNetConnectionEnd;
typedef enum ESteamNetworkingConfigScope ESteamNetworkingConfigScope;
typedef enum ESteamNetworkingConfigDataType ESteamNetworkingConfigDataType;
typedef enum ESteamNetworkingConfigValue ESteamNetworkingConfigValue;
typedef enum ESteamNetworkingGetConfigValueResult ESteamNetworkingGetConfigValueResult;
typedef enum ESteamNetworkingSocketsDebugOutputType ESteamNetworkingSocketsDebugOutputType;
typedef enum ESteamAPIInitResult ESteamAPIInitResult;
typedef enum EServerMode EServerMode;


enum ESteamIPType {
	k_ESteamIPTypeIPv4 = 0,
	k_ESteamIPTypeIPv6 = 1,
};
enum EUniverse {
	k_EUniverseInvalid = 0,
	k_EUniversePublic = 1,
	k_EUniverseBeta = 2,
	k_EUniverseInternal = 3,
	k_EUniverseDev = 4,
	k_EUniverseMax = 5,
};
enum EResult {
	k_EResultNone = 0,
	k_EResultOK = 1,
	k_EResultFail = 2,
	k_EResultNoConnection = 3,
	k_EResultInvalidPassword = 5,
	k_EResultLoggedInElsewhere = 6,
	k_EResultInvalidProtocolVer = 7,
	k_EResultInvalidParam = 8,
	k_EResultFileNotFound = 9,
	k_EResultBusy = 10,
	k_EResultInvalidState = 11,
	k_EResultInvalidName = 12,
	k_EResultInvalidEmail = 13,
	k_EResultDuplicateName = 14,
	k_EResultAccessDenied = 15,
	k_EResultTimeout = 16,
	k_EResultBanned = 17,
	k_EResultAccountNotFound = 18,
	k_EResultInvalidSteamID = 19,
	k_EResultServiceUnavailable = 20,
	k_EResultNotLoggedOn = 21,
	k_EResultPending = 22,
	k_EResultEncryptionFailure = 23,
	k_EResultInsufficientPrivilege = 24,
	k_EResultLimitExceeded = 25,
	k_EResultRevoked = 26,
	k_EResultExpired = 27,
	k_EResultAlreadyRedeemed = 28,
	k_EResultDuplicateRequest = 29,
	k_EResultAlreadyOwned = 30,
	k_EResultIPNotFound = 31,
	k_EResultPersistFailed = 32,
	k_EResultLockingFailed = 33,
	k_EResultLogonSessionReplaced = 34,
	k_EResultConnectFailed = 35,
	k_EResultHandshakeFailed = 36,
	k_EResultIOFailure = 37,
	k_EResultRemoteDisconnect = 38,
	k_EResultShoppingCartNotFound = 39,
	k_EResultBlocked = 40,
	k_EResultIgnored = 41,
	k_EResultNoMatch = 42,
	k_EResultAccountDisabled = 43,
	k_EResultServiceReadOnly = 44,
	k_EResultAccountNotFeatured = 45,
	k_EResultAdministratorOK = 46,
	k_EResultContentVersion = 47,
	k_EResultTryAnotherCM = 48,
	k_EResultPasswordRequiredToKickSession = 49,
	k_EResultAlreadyLoggedInElsewhere = 50,
	k_EResultSuspended = 51,
	k_EResultCancelled = 52,
	k_EResultDataCorruption = 53,
	k_EResultDiskFull = 54,
	k_EResultRemoteCallFailed = 55,
	k_EResultPasswordUnset = 56,
	k_EResultExternalAccountUnlinked = 57,
	k_EResultPSNTicketInvalid = 58,
	k_EResultExternalAccountAlreadyLinked = 59,
	k_EResultRemoteFileConflict = 60,
	k_EResultIllegalPassword = 61,
	k_EResultSameAsPreviousValue = 62,
	k_EResultAccountLogonDenied = 63,
	k_EResultCannotUseOldPassword = 64,
	k_EResultInvalidLoginAuthCode = 65,
	k_EResultAccountLogonDeniedNoMail = 66,
	k_EResultHardwareNotCapableOfIPT = 67,
	k_EResultIPTInitError = 68,
	k_EResultParentalControlRestricted = 69,
	k_EResultFacebookQueryError = 70,
	k_EResultExpiredLoginAuthCode = 71,
	k_EResultIPLoginRestrictionFailed = 72,
	k_EResultAccountLockedDown = 73,
	k_EResultAccountLogonDeniedVerifiedEmailRequired = 74,
	k_EResultNoMatchingURL = 75,
	k_EResultBadResponse = 76,
	k_EResultRequirePasswordReEntry = 77,
	k_EResultValueOutOfRange = 78,
	k_EResultUnexpectedError = 79,
	k_EResultDisabled = 80,
	k_EResultInvalidCEGSubmission = 81,
	k_EResultRestrictedDevice = 82,
	k_EResultRegionLocked = 83,
	k_EResultRateLimitExceeded = 84,
	k_EResultAccountLoginDeniedNeedTwoFactor = 85,
	k_EResultItemDeleted = 86,
	k_EResultAccountLoginDeniedThrottle = 87,
	k_EResultTwoFactorCodeMismatch = 88,
	k_EResultTwoFactorActivationCodeMismatch = 89,
	k_EResultAccountAssociatedToMultiplePartners = 90,
	k_EResultNotModified = 91,
	k_EResultNoMobileDevice = 92,
	k_EResultTimeNotSynced = 93,
	k_EResultSmsCodeFailed = 94,
	k_EResultAccountLimitExceeded = 95,
	k_EResultAccountActivityLimitExceeded = 96,
	k_EResultPhoneActivityLimitExceeded = 97,
	k_EResultRefundToWallet = 98,
	k_EResultEmailSendFailure = 99,
	k_EResultNotSettled = 100,
	k_EResultNeedCaptcha = 101,
	k_EResultGSLTDenied = 102,
	k_EResultGSOwnerDenied = 103,
	k_EResultInvalidItemType = 104,
	k_EResultIPBanned = 105,
	k_EResultGSLTExpired = 106,
	k_EResultInsufficientFunds = 107,
	k_EResultTooManyPending = 108,
	k_EResultNoSiteLicensesFound = 109,
	k_EResultWGNetworkSendExceeded = 110,
	k_EResultAccountNotFriends = 111,
	k_EResultLimitedUserAccount = 112,
	k_EResultCantRemoveItem = 113,
	k_EResultAccountDeleted = 114,
	k_EResultExistingUserCancelledLicense = 115,
	k_EResultCommunityCooldown = 116,
	k_EResultNoLauncherSpecified = 117,
	k_EResultMustAgreeToSSA = 118,
	k_EResultLauncherMigrated = 119,
	k_EResultSteamRealmMismatch = 120,
	k_EResultInvalidSignature = 121,
	k_EResultParseFailure = 122,
	k_EResultNoVerifiedPhone = 123,
	k_EResultInsufficientBattery = 124,
	k_EResultChargerRequired = 125,
	k_EResultCachedCredentialInvalid = 126,
	K_EResultPhoneNumberIsVOIP = 127,
	k_EResultNotSupported = 128,
	k_EResultFamilySizeLimitExceeded = 129,
};
enum EVoiceResult {
	k_EVoiceResultOK = 0,
	k_EVoiceResultNotInitialized = 1,
	k_EVoiceResultNotRecording = 2,
	k_EVoiceResultNoData = 3,
	k_EVoiceResultBufferTooSmall = 4,
	k_EVoiceResultDataCorrupted = 5,
	k_EVoiceResultRestricted = 6,
	k_EVoiceResultUnsupportedCodec = 7,
	k_EVoiceResultReceiverOutOfDate = 8,
	k_EVoiceResultReceiverDidNotAnswer = 9,
};
enum EDenyReason {
	k_EDenyInvalid = 0,
	k_EDenyInvalidVersion = 1,
	k_EDenyGeneric = 2,
	k_EDenyNotLoggedOn = 3,
	k_EDenyNoLicense = 4,
	k_EDenyCheater = 5,
	k_EDenyLoggedInElseWhere = 6,
	k_EDenyUnknownText = 7,
	k_EDenyIncompatibleAnticheat = 8,
	k_EDenyMemoryCorruption = 9,
	k_EDenyIncompatibleSoftware = 10,
	k_EDenySteamConnectionLost = 11,
	k_EDenySteamConnectionError = 12,
	k_EDenySteamResponseTimedOut = 13,
	k_EDenySteamValidationStalled = 14,
	k_EDenySteamOwnerLeftGuestUser = 15,
};
enum EBeginAuthSessionResult {
	k_EBeginAuthSessionResultOK = 0,
	k_EBeginAuthSessionResultInvalidTicket = 1,
	k_EBeginAuthSessionResultDuplicateRequest = 2,
	k_EBeginAuthSessionResultInvalidVersion = 3,
	k_EBeginAuthSessionResultGameMismatch = 4,
	k_EBeginAuthSessionResultExpiredTicket = 5,
};
enum EAuthSessionResponse {
	k_EAuthSessionResponseOK = 0,
	k_EAuthSessionResponseUserNotConnectedToSteam = 1,
	k_EAuthSessionResponseNoLicenseOrExpired = 2,
	k_EAuthSessionResponseVACBanned = 3,
	k_EAuthSessionResponseLoggedInElseWhere = 4,
	k_EAuthSessionResponseVACCheckTimedOut = 5,
	k_EAuthSessionResponseAuthTicketCanceled = 6,
	k_EAuthSessionResponseAuthTicketInvalidAlreadyUsed = 7,
	k_EAuthSessionResponseAuthTicketInvalid = 8,
	k_EAuthSessionResponsePublisherIssuedBan = 9,
	k_EAuthSessionResponseAuthTicketNetworkIdentityFailure = 10,
};
enum EUserHasLicenseForAppResult {
	k_EUserHasLicenseResultHasLicense = 0,
	k_EUserHasLicenseResultDoesNotHaveLicense = 1,
	k_EUserHasLicenseResultNoAuth = 2,
};
enum EAccountType {
	k_EAccountTypeInvalid = 0,
	k_EAccountTypeIndividual = 1,
	k_EAccountTypeMultiseat = 2,
	k_EAccountTypeGameServer = 3,
	k_EAccountTypeAnonGameServer = 4,
	k_EAccountTypePending = 5,
	k_EAccountTypeContentServer = 6,
	k_EAccountTypeClan = 7,
	k_EAccountTypeChat = 8,
	k_EAccountTypeConsoleUser = 9,
	k_EAccountTypeAnonUser = 10,
	k_EAccountTypeMax = 11,
};
enum EChatEntryType {
	k_EChatEntryTypeInvalid = 0,
	k_EChatEntryTypeChatMsg = 1,
	k_EChatEntryTypeTyping = 2,
	k_EChatEntryTypeInviteGame = 3,
	k_EChatEntryTypeEmote = 4,
	k_EChatEntryTypeLeftConversation = 6,
	k_EChatEntryTypeEntered = 7,
	k_EChatEntryTypeWasKicked = 8,
	k_EChatEntryTypeWasBanned = 9,
	k_EChatEntryTypeDisconnected = 10,
	k_EChatEntryTypeHistoricalChat = 11,
	k_EChatEntryTypeLinkBlocked = 14,
};
enum EChatRoomEnterResponse {
	k_EChatRoomEnterResponseSuccess = 1,
	k_EChatRoomEnterResponseDoesntExist = 2,
	k_EChatRoomEnterResponseNotAllowed = 3,
	k_EChatRoomEnterResponseFull = 4,
	k_EChatRoomEnterResponseError = 5,
	k_EChatRoomEnterResponseBanned = 6,
	k_EChatRoomEnterResponseLimited = 7,
	k_EChatRoomEnterResponseClanDisabled = 8,
	k_EChatRoomEnterResponseCommunityBan = 9,
	k_EChatRoomEnterResponseMemberBlockedYou = 10,
	k_EChatRoomEnterResponseYouBlockedMember = 11,
	k_EChatRoomEnterResponseRatelimitExceeded = 15,
};
enum EChatSteamIDInstanceFlags {
	k_EChatAccountInstanceMask = 4095,
	k_EChatInstanceFlagClan = 524288,
	k_EChatInstanceFlagLobby = 262144,
	k_EChatInstanceFlagMMSLobby = 131072,
};
enum ENotificationPosition {
	k_EPositionInvalid = -1,
	k_EPositionTopLeft = 0,
	k_EPositionTopRight = 1,
	k_EPositionBottomLeft = 2,
	k_EPositionBottomRight = 3,
};
enum EBroadcastUploadResult {
	k_EBroadcastUploadResultNone = 0,
	k_EBroadcastUploadResultOK = 1,
	k_EBroadcastUploadResultInitFailed = 2,
	k_EBroadcastUploadResultFrameFailed = 3,
	k_EBroadcastUploadResultTimeout = 4,
	k_EBroadcastUploadResultBandwidthExceeded = 5,
	k_EBroadcastUploadResultLowFPS = 6,
	k_EBroadcastUploadResultMissingKeyFrames = 7,
	k_EBroadcastUploadResultNoConnection = 8,
	k_EBroadcastUploadResultRelayFailed = 9,
	k_EBroadcastUploadResultSettingsChanged = 10,
	k_EBroadcastUploadResultMissingAudio = 11,
	k_EBroadcastUploadResultTooFarBehind = 12,
	k_EBroadcastUploadResultTranscodeBehind = 13,
	k_EBroadcastUploadResultNotAllowedToPlay = 14,
	k_EBroadcastUploadResultBusy = 15,
	k_EBroadcastUploadResultBanned = 16,
	k_EBroadcastUploadResultAlreadyActive = 17,
	k_EBroadcastUploadResultForcedOff = 18,
	k_EBroadcastUploadResultAudioBehind = 19,
	k_EBroadcastUploadResultShutdown = 20,
	k_EBroadcastUploadResultDisconnect = 21,
	k_EBroadcastUploadResultVideoInitFailed = 22,
	k_EBroadcastUploadResultAudioInitFailed = 23,
};
enum EMarketNotAllowedReasonFlags {
	k_EMarketNotAllowedReason_None = 0,
	k_EMarketNotAllowedReason_TemporaryFailure = 1,
	k_EMarketNotAllowedReason_AccountDisabled = 2,
	k_EMarketNotAllowedReason_AccountLockedDown = 4,
	k_EMarketNotAllowedReason_AccountLimited = 8,
	k_EMarketNotAllowedReason_TradeBanned = 16,
	k_EMarketNotAllowedReason_AccountNotTrusted = 32,
	k_EMarketNotAllowedReason_SteamGuardNotEnabled = 64,
	k_EMarketNotAllowedReason_SteamGuardOnlyRecentlyEnabled = 128,
	k_EMarketNotAllowedReason_RecentPasswordReset = 256,
	k_EMarketNotAllowedReason_NewPaymentMethod = 512,
	k_EMarketNotAllowedReason_InvalidCookie = 1024,
	k_EMarketNotAllowedReason_UsingNewDevice = 2048,
	k_EMarketNotAllowedReason_RecentSelfRefund = 4096,
	k_EMarketNotAllowedReason_NewPaymentMethodCannotBeVerified = 8192,
	k_EMarketNotAllowedReason_NoRecentPurchases = 16384,
	k_EMarketNotAllowedReason_AcceptedWalletGift = 32768,
};
enum EDurationControlProgress {
	k_EDurationControlProgress_Full = 0,
	k_EDurationControlProgress_Half = 1,
	k_EDurationControlProgress_None = 2,
	k_EDurationControl_ExitSoon_3h = 3,
	k_EDurationControl_ExitSoon_5h = 4,
	k_EDurationControl_ExitSoon_Night = 5,
};
enum EDurationControlNotification {
	k_EDurationControlNotification_None = 0,
	k_EDurationControlNotification_1Hour = 1,
	k_EDurationControlNotification_3Hours = 2,
	k_EDurationControlNotification_HalfProgress = 3,
	k_EDurationControlNotification_NoProgress = 4,
	k_EDurationControlNotification_ExitSoon_3h = 5,
	k_EDurationControlNotification_ExitSoon_5h = 6,
	k_EDurationControlNotification_ExitSoon_Night = 7,
};
enum EDurationControlOnlineState {
	k_EDurationControlOnlineState_Invalid = 0,
	k_EDurationControlOnlineState_Offline = 1,
	k_EDurationControlOnlineState_Online = 2,
	k_EDurationControlOnlineState_OnlineHighPri = 3,
};
enum EGameSearchErrorCode_t {
	k_EGameSearchErrorCode_OK = 1,
	k_EGameSearchErrorCode_Failed_Search_Already_In_Progress = 2,
	k_EGameSearchErrorCode_Failed_No_Search_In_Progress = 3,
	k_EGameSearchErrorCode_Failed_Not_Lobby_Leader = 4,
	k_EGameSearchErrorCode_Failed_No_Host_Available = 5,
	k_EGameSearchErrorCode_Failed_Search_Params_Invalid = 6,
	k_EGameSearchErrorCode_Failed_Offline = 7,
	k_EGameSearchErrorCode_Failed_NotAuthorized = 8,
	k_EGameSearchErrorCode_Failed_Unknown_Error = 9,
};
enum EPlayerResult_t {
	k_EPlayerResultFailedToConnect = 1,
	k_EPlayerResultAbandoned = 2,
	k_EPlayerResultKicked = 3,
	k_EPlayerResultIncomplete = 4,
	k_EPlayerResultCompleted = 5,
};
enum ESteamIPv6ConnectivityProtocol {
	k_ESteamIPv6ConnectivityProtocol_Invalid = 0,
	k_ESteamIPv6ConnectivityProtocol_HTTP = 1,
	k_ESteamIPv6ConnectivityProtocol_UDP = 2,
};
enum ESteamIPv6ConnectivityState {
	k_ESteamIPv6ConnectivityState_Unknown = 0,
	k_ESteamIPv6ConnectivityState_Good = 1,
	k_ESteamIPv6ConnectivityState_Bad = 2,
};
enum EFriendRelationship {
	k_EFriendRelationshipNone = 0,
	k_EFriendRelationshipBlocked = 1,
	k_EFriendRelationshipRequestRecipient = 2,
	k_EFriendRelationshipFriend = 3,
	k_EFriendRelationshipRequestInitiator = 4,
	k_EFriendRelationshipIgnored = 5,
	k_EFriendRelationshipIgnoredFriend = 6,
	k_EFriendRelationshipSuggested_DEPRECATED = 7,
	k_EFriendRelationshipMax = 8,
};
enum EPersonaState {
	k_EPersonaStateOffline = 0,
	k_EPersonaStateOnline = 1,
	k_EPersonaStateBusy = 2,
	k_EPersonaStateAway = 3,
	k_EPersonaStateSnooze = 4,
	k_EPersonaStateLookingToTrade = 5,
	k_EPersonaStateLookingToPlay = 6,
	k_EPersonaStateInvisible = 7,
	k_EPersonaStateMax = 8,
};
enum EFriendFlags {
	k_EFriendFlagNone = 0,
	k_EFriendFlagBlocked = 1,
	k_EFriendFlagFriendshipRequested = 2,
	k_EFriendFlagImmediate = 4,
	k_EFriendFlagClanMember = 8,
	k_EFriendFlagOnGameServer = 16,
	k_EFriendFlagRequestingFriendship = 128,
	k_EFriendFlagRequestingInfo = 256,
	k_EFriendFlagIgnored = 512,
	k_EFriendFlagIgnoredFriend = 1024,
	k_EFriendFlagChatMember = 4096,
	k_EFriendFlagAll = 65535,
};
enum EUserRestriction {
	k_nUserRestrictionNone = 0,
	k_nUserRestrictionUnknown = 1,
	k_nUserRestrictionAnyChat = 2,
	k_nUserRestrictionVoiceChat = 4,
	k_nUserRestrictionGroupChat = 8,
	k_nUserRestrictionRating = 16,
	k_nUserRestrictionGameInvites = 32,
	k_nUserRestrictionTrading = 64,
};
enum EOverlayToStoreFlag {
	k_EOverlayToStoreFlag_None = 0,
	k_EOverlayToStoreFlag_AddToCart = 1,
	k_EOverlayToStoreFlag_AddToCartAndShow = 2,
};
enum EActivateGameOverlayToWebPageMode {
	k_EActivateGameOverlayToWebPageMode_Default = 0,
	k_EActivateGameOverlayToWebPageMode_Modal = 1,
};
enum ECommunityProfileItemType {
	k_ECommunityProfileItemType_AnimatedAvatar = 0,
	k_ECommunityProfileItemType_AvatarFrame = 1,
	k_ECommunityProfileItemType_ProfileModifier = 2,
	k_ECommunityProfileItemType_ProfileBackground = 3,
	k_ECommunityProfileItemType_MiniProfileBackground = 4,
};
enum ECommunityProfileItemProperty {
	k_ECommunityProfileItemProperty_ImageSmall = 0,
	k_ECommunityProfileItemProperty_ImageLarge = 1,
	k_ECommunityProfileItemProperty_InternalName = 2,
	k_ECommunityProfileItemProperty_Title = 3,
	k_ECommunityProfileItemProperty_Description = 4,
	k_ECommunityProfileItemProperty_AppID = 5,
	k_ECommunityProfileItemProperty_TypeID = 6,
	k_ECommunityProfileItemProperty_Class = 7,
	k_ECommunityProfileItemProperty_MovieWebM = 8,
	k_ECommunityProfileItemProperty_MovieMP4 = 9,
	k_ECommunityProfileItemProperty_MovieWebMSmall = 10,
	k_ECommunityProfileItemProperty_MovieMP4Small = 11,
};
enum EPersonaChange {
	k_EPersonaChangeName = 1,
	k_EPersonaChangeStatus = 2,
	k_EPersonaChangeComeOnline = 4,
	k_EPersonaChangeGoneOffline = 8,
	k_EPersonaChangeGamePlayed = 16,
	k_EPersonaChangeGameServer = 32,
	k_EPersonaChangeAvatar = 64,
	k_EPersonaChangeJoinedSource = 128,
	k_EPersonaChangeLeftSource = 256,
	k_EPersonaChangeRelationshipChanged = 512,
	k_EPersonaChangeNameFirstSet = 1024,
	k_EPersonaChangeBroadcast = 2048,
	k_EPersonaChangeNickname = 4096,
	k_EPersonaChangeSteamLevel = 8192,
	k_EPersonaChangeRichPresence = 16384,
};
enum ESteamAPICallFailure {
	k_ESteamAPICallFailureNone = -1,
	k_ESteamAPICallFailureSteamGone = 0,
	k_ESteamAPICallFailureNetworkFailure = 1,
	k_ESteamAPICallFailureInvalidHandle = 2,
	k_ESteamAPICallFailureMismatchedCallback = 3,
};
enum EGamepadTextInputMode {
	k_EGamepadTextInputModeNormal = 0,
	k_EGamepadTextInputModePassword = 1,
};
enum EGamepadTextInputLineMode {
	k_EGamepadTextInputLineModeSingleLine = 0,
	k_EGamepadTextInputLineModeMultipleLines = 1,
};
enum EFloatingGamepadTextInputMode {
	k_EFloatingGamepadTextInputModeModeSingleLine = 0,
	k_EFloatingGamepadTextInputModeModeMultipleLines = 1,
	k_EFloatingGamepadTextInputModeModeEmail = 2,
	k_EFloatingGamepadTextInputModeModeNumeric = 3,
};
enum ETextFilteringContext {
	k_ETextFilteringContextUnknown = 0,
	k_ETextFilteringContextGameContent = 1,
	k_ETextFilteringContextChat = 2,
	k_ETextFilteringContextName = 3,
};
enum ECheckFileSignature {
	k_ECheckFileSignatureInvalidSignature = 0,
	k_ECheckFileSignatureValidSignature = 1,
	k_ECheckFileSignatureFileNotFound = 2,
	k_ECheckFileSignatureNoSignaturesFoundForThisApp = 3,
	k_ECheckFileSignatureNoSignaturesFoundForThisFile = 4,
};
enum EMatchMakingServerResponse {
	eServerResponded = 0,
	eServerFailedToRespond = 1,
	eNoServersListedOnMasterServer = 2,
};
enum ELobbyType {
	k_ELobbyTypePrivate = 0,
	k_ELobbyTypeFriendsOnly = 1,
	k_ELobbyTypePublic = 2,
	k_ELobbyTypeInvisible = 3,
	k_ELobbyTypePrivateUnique = 4,
};
enum ELobbyComparison {
	k_ELobbyComparisonEqualToOrLessThan = -2,
	k_ELobbyComparisonLessThan = -1,
	k_ELobbyComparisonEqual = 0,
	k_ELobbyComparisonGreaterThan = 1,
	k_ELobbyComparisonEqualToOrGreaterThan = 2,
	k_ELobbyComparisonNotEqual = 3,
};
enum ELobbyDistanceFilter {
	k_ELobbyDistanceFilterClose = 0,
	k_ELobbyDistanceFilterDefault = 1,
	k_ELobbyDistanceFilterFar = 2,
	k_ELobbyDistanceFilterWorldwide = 3,
};
enum EChatMemberStateChange {
	k_EChatMemberStateChangeEntered = 1,
	k_EChatMemberStateChangeLeft = 2,
	k_EChatMemberStateChangeDisconnected = 4,
	k_EChatMemberStateChangeKicked = 8,
	k_EChatMemberStateChangeBanned = 16,
};
enum ESteamPartyBeaconLocationType {
	k_ESteamPartyBeaconLocationType_Invalid = 0,
	k_ESteamPartyBeaconLocationType_ChatGroup = 1,
	k_ESteamPartyBeaconLocationType_Max = 2,
};
enum ESteamPartyBeaconLocationData {
	k_ESteamPartyBeaconLocationDataInvalid = 0,
	k_ESteamPartyBeaconLocationDataName = 1,
	k_ESteamPartyBeaconLocationDataIconURLSmall = 2,
	k_ESteamPartyBeaconLocationDataIconURLMedium = 3,
	k_ESteamPartyBeaconLocationDataIconURLLarge = 4,
};
enum ERemoteStoragePlatform {
	k_ERemoteStoragePlatformNone = 0,
	k_ERemoteStoragePlatformWindows = 1,
	k_ERemoteStoragePlatformOSX = 2,
	k_ERemoteStoragePlatformPS3 = 4,
	k_ERemoteStoragePlatformLinux = 8,
	k_ERemoteStoragePlatformSwitch = 16,
	k_ERemoteStoragePlatformAndroid = 32,
	k_ERemoteStoragePlatformIOS = 64,
	k_ERemoteStoragePlatformAll = -1,
};
enum ERemoteStoragePublishedFileVisibility {
	k_ERemoteStoragePublishedFileVisibilityPublic = 0,
	k_ERemoteStoragePublishedFileVisibilityFriendsOnly = 1,
	k_ERemoteStoragePublishedFileVisibilityPrivate = 2,
	k_ERemoteStoragePublishedFileVisibilityUnlisted = 3,
};
enum EWorkshopFileType {
	k_EWorkshopFileTypeFirst = 0,
	k_EWorkshopFileTypeCommunity = 0,
	k_EWorkshopFileTypeMicrotransaction = 1,
	k_EWorkshopFileTypeCollection = 2,
	k_EWorkshopFileTypeArt = 3,
	k_EWorkshopFileTypeVideo = 4,
	k_EWorkshopFileTypeScreenshot = 5,
	k_EWorkshopFileTypeGame = 6,
	k_EWorkshopFileTypeSoftware = 7,
	k_EWorkshopFileTypeConcept = 8,
	k_EWorkshopFileTypeWebGuide = 9,
	k_EWorkshopFileTypeIntegratedGuide = 10,
	k_EWorkshopFileTypeMerch = 11,
	k_EWorkshopFileTypeControllerBinding = 12,
	k_EWorkshopFileTypeSteamworksAccessInvite = 13,
	k_EWorkshopFileTypeSteamVideo = 14,
	k_EWorkshopFileTypeGameManagedItem = 15,
	k_EWorkshopFileTypeClip = 16,
	k_EWorkshopFileTypeMax = 17,
};
enum EWorkshopVote {
	k_EWorkshopVoteUnvoted = 0,
	k_EWorkshopVoteFor = 1,
	k_EWorkshopVoteAgainst = 2,
	k_EWorkshopVoteLater = 3,
};
enum EWorkshopFileAction {
	k_EWorkshopFileActionPlayed = 0,
	k_EWorkshopFileActionCompleted = 1,
};
enum EWorkshopEnumerationType {
	k_EWorkshopEnumerationTypeRankedByVote = 0,
	k_EWorkshopEnumerationTypeRecent = 1,
	k_EWorkshopEnumerationTypeTrending = 2,
	k_EWorkshopEnumerationTypeFavoritesOfFriends = 3,
	k_EWorkshopEnumerationTypeVotedByFriends = 4,
	k_EWorkshopEnumerationTypeContentByFriends = 5,
	k_EWorkshopEnumerationTypeRecentFromFollowedUsers = 6,
};
enum EWorkshopVideoProvider {
	k_EWorkshopVideoProviderNone = 0,
	k_EWorkshopVideoProviderYoutube = 1,
};
enum EUGCReadAction {
	k_EUGCRead_ContinueReadingUntilFinished = 0,
	k_EUGCRead_ContinueReading = 1,
	k_EUGCRead_Close = 2,
};
enum ERemoteStorageLocalFileChange {
	k_ERemoteStorageLocalFileChange_Invalid = 0,
	k_ERemoteStorageLocalFileChange_FileUpdated = 1,
	k_ERemoteStorageLocalFileChange_FileDeleted = 2,
};
enum ERemoteStorageFilePathType {
	k_ERemoteStorageFilePathType_Invalid = 0,
	k_ERemoteStorageFilePathType_Absolute = 1,
	k_ERemoteStorageFilePathType_APIFilename = 2,
};
enum ELeaderboardDataRequest {
	k_ELeaderboardDataRequestGlobal = 0,
	k_ELeaderboardDataRequestGlobalAroundUser = 1,
	k_ELeaderboardDataRequestFriends = 2,
	k_ELeaderboardDataRequestUsers = 3,
};
enum ELeaderboardSortMethod {
	k_ELeaderboardSortMethodNone = 0,
	k_ELeaderboardSortMethodAscending = 1,
	k_ELeaderboardSortMethodDescending = 2,
};
enum ELeaderboardDisplayType {
	k_ELeaderboardDisplayTypeNone = 0,
	k_ELeaderboardDisplayTypeNumeric = 1,
	k_ELeaderboardDisplayTypeTimeSeconds = 2,
	k_ELeaderboardDisplayTypeTimeMilliSeconds = 3,
};
enum ELeaderboardUploadScoreMethod {
	k_ELeaderboardUploadScoreMethodNone = 0,
	k_ELeaderboardUploadScoreMethodKeepBest = 1,
	k_ELeaderboardUploadScoreMethodForceUpdate = 2,
};
enum EP2PSessionError {
	k_EP2PSessionErrorNone = 0,
	k_EP2PSessionErrorNoRightsToApp = 2,
	k_EP2PSessionErrorTimeout = 4,
	k_EP2PSessionErrorNotRunningApp_DELETED = 1,
	k_EP2PSessionErrorDestinationNotLoggedIn_DELETED = 3,
	k_EP2PSessionErrorMax = 5,
};
enum EP2PSend {
	k_EP2PSendUnreliable = 0,
	k_EP2PSendUnreliableNoDelay = 1,
	k_EP2PSendReliable = 2,
	k_EP2PSendReliableWithBuffering = 3,
};
enum ESNetSocketState {
	k_ESNetSocketStateInvalid = 0,
	k_ESNetSocketStateConnected = 1,
	k_ESNetSocketStateInitiated = 10,
	k_ESNetSocketStateLocalCandidatesFound = 11,
	k_ESNetSocketStateReceivedRemoteCandidates = 12,
	k_ESNetSocketStateChallengeHandshake = 15,
	k_ESNetSocketStateDisconnecting = 21,
	k_ESNetSocketStateLocalDisconnect = 22,
	k_ESNetSocketStateTimeoutDuringConnect = 23,
	k_ESNetSocketStateRemoteEndDisconnected = 24,
	k_ESNetSocketStateConnectionBroken = 25,
};
enum ESNetSocketConnectionType {
	k_ESNetSocketConnectionTypeNotConnected = 0,
	k_ESNetSocketConnectionTypeUDP = 1,
	k_ESNetSocketConnectionTypeUDPRelay = 2,
};
enum EVRScreenshotType {
	k_EVRScreenshotType_None = 0,
	k_EVRScreenshotType_Mono = 1,
	k_EVRScreenshotType_Stereo = 2,
	k_EVRScreenshotType_MonoCubemap = 3,
	k_EVRScreenshotType_MonoPanorama = 4,
	k_EVRScreenshotType_StereoPanorama = 5,
};
enum AudioPlayback_Status {
	AudioPlayback_Undefined = 0,
	AudioPlayback_Playing = 1,
	AudioPlayback_Paused = 2,
	AudioPlayback_Idle = 3,
};
enum EHTTPMethod {
	k_EHTTPMethodInvalid = 0,
	k_EHTTPMethodGET = 1,
	k_EHTTPMethodHEAD = 2,
	k_EHTTPMethodPOST = 3,
	k_EHTTPMethodPUT = 4,
	k_EHTTPMethodDELETE = 5,
	k_EHTTPMethodOPTIONS = 6,
	k_EHTTPMethodPATCH = 7,
};
enum EHTTPStatusCode {
	k_EHTTPStatusCodeInvalid = 0,
	k_EHTTPStatusCode100Continue = 100,
	k_EHTTPStatusCode101SwitchingProtocols = 101,
	k_EHTTPStatusCode200OK = 200,
	k_EHTTPStatusCode201Created = 201,
	k_EHTTPStatusCode202Accepted = 202,
	k_EHTTPStatusCode203NonAuthoritative = 203,
	k_EHTTPStatusCode204NoContent = 204,
	k_EHTTPStatusCode205ResetContent = 205,
	k_EHTTPStatusCode206PartialContent = 206,
	k_EHTTPStatusCode300MultipleChoices = 300,
	k_EHTTPStatusCode301MovedPermanently = 301,
	k_EHTTPStatusCode302Found = 302,
	k_EHTTPStatusCode303SeeOther = 303,
	k_EHTTPStatusCode304NotModified = 304,
	k_EHTTPStatusCode305UseProxy = 305,
	k_EHTTPStatusCode307TemporaryRedirect = 307,
	k_EHTTPStatusCode308PermanentRedirect = 308,
	k_EHTTPStatusCode400BadRequest = 400,
	k_EHTTPStatusCode401Unauthorized = 401,
	k_EHTTPStatusCode402PaymentRequired = 402,
	k_EHTTPStatusCode403Forbidden = 403,
	k_EHTTPStatusCode404NotFound = 404,
	k_EHTTPStatusCode405MethodNotAllowed = 405,
	k_EHTTPStatusCode406NotAcceptable = 406,
	k_EHTTPStatusCode407ProxyAuthRequired = 407,
	k_EHTTPStatusCode408RequestTimeout = 408,
	k_EHTTPStatusCode409Conflict = 409,
	k_EHTTPStatusCode410Gone = 410,
	k_EHTTPStatusCode411LengthRequired = 411,
	k_EHTTPStatusCode412PreconditionFailed = 412,
	k_EHTTPStatusCode413RequestEntityTooLarge = 413,
	k_EHTTPStatusCode414RequestURITooLong = 414,
	k_EHTTPStatusCode415UnsupportedMediaType = 415,
	k_EHTTPStatusCode416RequestedRangeNotSatisfiable = 416,
	k_EHTTPStatusCode417ExpectationFailed = 417,
	k_EHTTPStatusCode4xxUnknown = 418,
	k_EHTTPStatusCode429TooManyRequests = 429,
	k_EHTTPStatusCode444ConnectionClosed = 444,
	k_EHTTPStatusCode500InternalServerError = 500,
	k_EHTTPStatusCode501NotImplemented = 501,
	k_EHTTPStatusCode502BadGateway = 502,
	k_EHTTPStatusCode503ServiceUnavailable = 503,
	k_EHTTPStatusCode504GatewayTimeout = 504,
	k_EHTTPStatusCode505HTTPVersionNotSupported = 505,
	k_EHTTPStatusCode5xxUnknown = 599,
};
enum EInputSourceMode {
	k_EInputSourceMode_None = 0,
	k_EInputSourceMode_Dpad = 1,
	k_EInputSourceMode_Buttons = 2,
	k_EInputSourceMode_FourButtons = 3,
	k_EInputSourceMode_AbsoluteMouse = 4,
	k_EInputSourceMode_RelativeMouse = 5,
	k_EInputSourceMode_JoystickMove = 6,
	k_EInputSourceMode_JoystickMouse = 7,
	k_EInputSourceMode_JoystickCamera = 8,
	k_EInputSourceMode_ScrollWheel = 9,
	k_EInputSourceMode_Trigger = 10,
	k_EInputSourceMode_TouchMenu = 11,
	k_EInputSourceMode_MouseJoystick = 12,
	k_EInputSourceMode_MouseRegion = 13,
	k_EInputSourceMode_RadialMenu = 14,
	k_EInputSourceMode_SingleButton = 15,
	k_EInputSourceMode_Switches = 16,
};
enum EInputActionOrigin {
	k_EInputActionOrigin_None = 0,
	k_EInputActionOrigin_SteamController_A = 1,
	k_EInputActionOrigin_SteamController_B = 2,
	k_EInputActionOrigin_SteamController_X = 3,
	k_EInputActionOrigin_SteamController_Y = 4,
	k_EInputActionOrigin_SteamController_LeftBumper = 5,
	k_EInputActionOrigin_SteamController_RightBumper = 6,
	k_EInputActionOrigin_SteamController_LeftGrip = 7,
	k_EInputActionOrigin_SteamController_RightGrip = 8,
	k_EInputActionOrigin_SteamController_Start = 9,
	k_EInputActionOrigin_SteamController_Back = 10,
	k_EInputActionOrigin_SteamController_LeftPad_Touch = 11,
	k_EInputActionOrigin_SteamController_LeftPad_Swipe = 12,
	k_EInputActionOrigin_SteamController_LeftPad_Click = 13,
	k_EInputActionOrigin_SteamController_LeftPad_DPadNorth = 14,
	k_EInputActionOrigin_SteamController_LeftPad_DPadSouth = 15,
	k_EInputActionOrigin_SteamController_LeftPad_DPadWest = 16,
	k_EInputActionOrigin_SteamController_LeftPad_DPadEast = 17,
	k_EInputActionOrigin_SteamController_RightPad_Touch = 18,
	k_EInputActionOrigin_SteamController_RightPad_Swipe = 19,
	k_EInputActionOrigin_SteamController_RightPad_Click = 20,
	k_EInputActionOrigin_SteamController_RightPad_DPadNorth = 21,
	k_EInputActionOrigin_SteamController_RightPad_DPadSouth = 22,
	k_EInputActionOrigin_SteamController_RightPad_DPadWest = 23,
	k_EInputActionOrigin_SteamController_RightPad_DPadEast = 24,
	k_EInputActionOrigin_SteamController_LeftTrigger_Pull = 25,
	k_EInputActionOrigin_SteamController_LeftTrigger_Click = 26,
	k_EInputActionOrigin_SteamController_RightTrigger_Pull = 27,
	k_EInputActionOrigin_SteamController_RightTrigger_Click = 28,
	k_EInputActionOrigin_SteamController_LeftStick_Move = 29,
	k_EInputActionOrigin_SteamController_LeftStick_Click = 30,
	k_EInputActionOrigin_SteamController_LeftStick_DPadNorth = 31,
	k_EInputActionOrigin_SteamController_LeftStick_DPadSouth = 32,
	k_EInputActionOrigin_SteamController_LeftStick_DPadWest = 33,
	k_EInputActionOrigin_SteamController_LeftStick_DPadEast = 34,
	k_EInputActionOrigin_SteamController_Gyro_Move = 35,
	k_EInputActionOrigin_SteamController_Gyro_Pitch = 36,
	k_EInputActionOrigin_SteamController_Gyro_Yaw = 37,
	k_EInputActionOrigin_SteamController_Gyro_Roll = 38,
	k_EInputActionOrigin_SteamController_Reserved0 = 39,
	k_EInputActionOrigin_SteamController_Reserved1 = 40,
	k_EInputActionOrigin_SteamController_Reserved2 = 41,
	k_EInputActionOrigin_SteamController_Reserved3 = 42,
	k_EInputActionOrigin_SteamController_Reserved4 = 43,
	k_EInputActionOrigin_SteamController_Reserved5 = 44,
	k_EInputActionOrigin_SteamController_Reserved6 = 45,
	k_EInputActionOrigin_SteamController_Reserved7 = 46,
	k_EInputActionOrigin_SteamController_Reserved8 = 47,
	k_EInputActionOrigin_SteamController_Reserved9 = 48,
	k_EInputActionOrigin_SteamController_Reserved10 = 49,
	k_EInputActionOrigin_PS4_X = 50,
	k_EInputActionOrigin_PS4_Circle = 51,
	k_EInputActionOrigin_PS4_Triangle = 52,
	k_EInputActionOrigin_PS4_Square = 53,
	k_EInputActionOrigin_PS4_LeftBumper = 54,
	k_EInputActionOrigin_PS4_RightBumper = 55,
	k_EInputActionOrigin_PS4_Options = 56,
	k_EInputActionOrigin_PS4_Share = 57,
	k_EInputActionOrigin_PS4_LeftPad_Touch = 58,
	k_EInputActionOrigin_PS4_LeftPad_Swipe = 59,
	k_EInputActionOrigin_PS4_LeftPad_Click = 60,
	k_EInputActionOrigin_PS4_LeftPad_DPadNorth = 61,
	k_EInputActionOrigin_PS4_LeftPad_DPadSouth = 62,
	k_EInputActionOrigin_PS4_LeftPad_DPadWest = 63,
	k_EInputActionOrigin_PS4_LeftPad_DPadEast = 64,
	k_EInputActionOrigin_PS4_RightPad_Touch = 65,
	k_EInputActionOrigin_PS4_RightPad_Swipe = 66,
	k_EInputActionOrigin_PS4_RightPad_Click = 67,
	k_EInputActionOrigin_PS4_RightPad_DPadNorth = 68,
	k_EInputActionOrigin_PS4_RightPad_DPadSouth = 69,
	k_EInputActionOrigin_PS4_RightPad_DPadWest = 70,
	k_EInputActionOrigin_PS4_RightPad_DPadEast = 71,
	k_EInputActionOrigin_PS4_CenterPad_Touch = 72,
	k_EInputActionOrigin_PS4_CenterPad_Swipe = 73,
	k_EInputActionOrigin_PS4_CenterPad_Click = 74,
	k_EInputActionOrigin_PS4_CenterPad_DPadNorth = 75,
	k_EInputActionOrigin_PS4_CenterPad_DPadSouth = 76,
	k_EInputActionOrigin_PS4_CenterPad_DPadWest = 77,
	k_EInputActionOrigin_PS4_CenterPad_DPadEast = 78,
	k_EInputActionOrigin_PS4_LeftTrigger_Pull = 79,
	k_EInputActionOrigin_PS4_LeftTrigger_Click = 80,
	k_EInputActionOrigin_PS4_RightTrigger_Pull = 81,
	k_EInputActionOrigin_PS4_RightTrigger_Click = 82,
	k_EInputActionOrigin_PS4_LeftStick_Move = 83,
	k_EInputActionOrigin_PS4_LeftStick_Click = 84,
	k_EInputActionOrigin_PS4_LeftStick_DPadNorth = 85,
	k_EInputActionOrigin_PS4_LeftStick_DPadSouth = 86,
	k_EInputActionOrigin_PS4_LeftStick_DPadWest = 87,
	k_EInputActionOrigin_PS4_LeftStick_DPadEast = 88,
	k_EInputActionOrigin_PS4_RightStick_Move = 89,
	k_EInputActionOrigin_PS4_RightStick_Click = 90,
	k_EInputActionOrigin_PS4_RightStick_DPadNorth = 91,
	k_EInputActionOrigin_PS4_RightStick_DPadSouth = 92,
	k_EInputActionOrigin_PS4_RightStick_DPadWest = 93,
	k_EInputActionOrigin_PS4_RightStick_DPadEast = 94,
	k_EInputActionOrigin_PS4_DPad_North = 95,
	k_EInputActionOrigin_PS4_DPad_South = 96,
	k_EInputActionOrigin_PS4_DPad_West = 97,
	k_EInputActionOrigin_PS4_DPad_East = 98,
	k_EInputActionOrigin_PS4_Gyro_Move = 99,
	k_EInputActionOrigin_PS4_Gyro_Pitch = 100,
	k_EInputActionOrigin_PS4_Gyro_Yaw = 101,
	k_EInputActionOrigin_PS4_Gyro_Roll = 102,
	k_EInputActionOrigin_PS4_DPad_Move = 103,
	k_EInputActionOrigin_PS4_Reserved1 = 104,
	k_EInputActionOrigin_PS4_Reserved2 = 105,
	k_EInputActionOrigin_PS4_Reserved3 = 106,
	k_EInputActionOrigin_PS4_Reserved4 = 107,
	k_EInputActionOrigin_PS4_Reserved5 = 108,
	k_EInputActionOrigin_PS4_Reserved6 = 109,
	k_EInputActionOrigin_PS4_Reserved7 = 110,
	k_EInputActionOrigin_PS4_Reserved8 = 111,
	k_EInputActionOrigin_PS4_Reserved9 = 112,
	k_EInputActionOrigin_PS4_Reserved10 = 113,
	k_EInputActionOrigin_XBoxOne_A = 114,
	k_EInputActionOrigin_XBoxOne_B = 115,
	k_EInputActionOrigin_XBoxOne_X = 116,
	k_EInputActionOrigin_XBoxOne_Y = 117,
	k_EInputActionOrigin_XBoxOne_LeftBumper = 118,
	k_EInputActionOrigin_XBoxOne_RightBumper = 119,
	k_EInputActionOrigin_XBoxOne_Menu = 120,
	k_EInputActionOrigin_XBoxOne_View = 121,
	k_EInputActionOrigin_XBoxOne_LeftTrigger_Pull = 122,
	k_EInputActionOrigin_XBoxOne_LeftTrigger_Click = 123,
	k_EInputActionOrigin_XBoxOne_RightTrigger_Pull = 124,
	k_EInputActionOrigin_XBoxOne_RightTrigger_Click = 125,
	k_EInputActionOrigin_XBoxOne_LeftStick_Move = 126,
	k_EInputActionOrigin_XBoxOne_LeftStick_Click = 127,
	k_EInputActionOrigin_XBoxOne_LeftStick_DPadNorth = 128,
	k_EInputActionOrigin_XBoxOne_LeftStick_DPadSouth = 129,
	k_EInputActionOrigin_XBoxOne_LeftStick_DPadWest = 130,
	k_EInputActionOrigin_XBoxOne_LeftStick_DPadEast = 131,
	k_EInputActionOrigin_XBoxOne_RightStick_Move = 132,
	k_EInputActionOrigin_XBoxOne_RightStick_Click = 133,
	k_EInputActionOrigin_XBoxOne_RightStick_DPadNorth = 134,
	k_EInputActionOrigin_XBoxOne_RightStick_DPadSouth = 135,
	k_EInputActionOrigin_XBoxOne_RightStick_DPadWest = 136,
	k_EInputActionOrigin_XBoxOne_RightStick_DPadEast = 137,
	k_EInputActionOrigin_XBoxOne_DPad_North = 138,
	k_EInputActionOrigin_XBoxOne_DPad_South = 139,
	k_EInputActionOrigin_XBoxOne_DPad_West = 140,
	k_EInputActionOrigin_XBoxOne_DPad_East = 141,
	k_EInputActionOrigin_XBoxOne_DPad_Move = 142,
	k_EInputActionOrigin_XBoxOne_LeftGrip_Lower = 143,
	k_EInputActionOrigin_XBoxOne_LeftGrip_Upper = 144,
	k_EInputActionOrigin_XBoxOne_RightGrip_Lower = 145,
	k_EInputActionOrigin_XBoxOne_RightGrip_Upper = 146,
	k_EInputActionOrigin_XBoxOne_Share = 147,
	k_EInputActionOrigin_XBoxOne_Reserved6 = 148,
	k_EInputActionOrigin_XBoxOne_Reserved7 = 149,
	k_EInputActionOrigin_XBoxOne_Reserved8 = 150,
	k_EInputActionOrigin_XBoxOne_Reserved9 = 151,
	k_EInputActionOrigin_XBoxOne_Reserved10 = 152,
	k_EInputActionOrigin_XBox360_A = 153,
	k_EInputActionOrigin_XBox360_B = 154,
	k_EInputActionOrigin_XBox360_X = 155,
	k_EInputActionOrigin_XBox360_Y = 156,
	k_EInputActionOrigin_XBox360_LeftBumper = 157,
	k_EInputActionOrigin_XBox360_RightBumper = 158,
	k_EInputActionOrigin_XBox360_Start = 159,
	k_EInputActionOrigin_XBox360_Back = 160,
	k_EInputActionOrigin_XBox360_LeftTrigger_Pull = 161,
	k_EInputActionOrigin_XBox360_LeftTrigger_Click = 162,
	k_EInputActionOrigin_XBox360_RightTrigger_Pull = 163,
	k_EInputActionOrigin_XBox360_RightTrigger_Click = 164,
	k_EInputActionOrigin_XBox360_LeftStick_Move = 165,
	k_EInputActionOrigin_XBox360_LeftStick_Click = 166,
	k_EInputActionOrigin_XBox360_LeftStick_DPadNorth = 167,
	k_EInputActionOrigin_XBox360_LeftStick_DPadSouth = 168,
	k_EInputActionOrigin_XBox360_LeftStick_DPadWest = 169,
	k_EInputActionOrigin_XBox360_LeftStick_DPadEast = 170,
	k_EInputActionOrigin_XBox360_RightStick_Move = 171,
	k_EInputActionOrigin_XBox360_RightStick_Click = 172,
	k_EInputActionOrigin_XBox360_RightStick_DPadNorth = 173,
	k_EInputActionOrigin_XBox360_RightStick_DPadSouth = 174,
	k_EInputActionOrigin_XBox360_RightStick_DPadWest = 175,
	k_EInputActionOrigin_XBox360_RightStick_DPadEast = 176,
	k_EInputActionOrigin_XBox360_DPad_North = 177,
	k_EInputActionOrigin_XBox360_DPad_South = 178,
	k_EInputActionOrigin_XBox360_DPad_West = 179,
	k_EInputActionOrigin_XBox360_DPad_East = 180,
	k_EInputActionOrigin_XBox360_DPad_Move = 181,
	k_EInputActionOrigin_XBox360_Reserved1 = 182,
	k_EInputActionOrigin_XBox360_Reserved2 = 183,
	k_EInputActionOrigin_XBox360_Reserved3 = 184,
	k_EInputActionOrigin_XBox360_Reserved4 = 185,
	k_EInputActionOrigin_XBox360_Reserved5 = 186,
	k_EInputActionOrigin_XBox360_Reserved6 = 187,
	k_EInputActionOrigin_XBox360_Reserved7 = 188,
	k_EInputActionOrigin_XBox360_Reserved8 = 189,
	k_EInputActionOrigin_XBox360_Reserved9 = 190,
	k_EInputActionOrigin_XBox360_Reserved10 = 191,
	k_EInputActionOrigin_Switch_A = 192,
	k_EInputActionOrigin_Switch_B = 193,
	k_EInputActionOrigin_Switch_X = 194,
	k_EInputActionOrigin_Switch_Y = 195,
	k_EInputActionOrigin_Switch_LeftBumper = 196,
	k_EInputActionOrigin_Switch_RightBumper = 197,
	k_EInputActionOrigin_Switch_Plus = 198,
	k_EInputActionOrigin_Switch_Minus = 199,
	k_EInputActionOrigin_Switch_Capture = 200,
	k_EInputActionOrigin_Switch_LeftTrigger_Pull = 201,
	k_EInputActionOrigin_Switch_LeftTrigger_Click = 202,
	k_EInputActionOrigin_Switch_RightTrigger_Pull = 203,
	k_EInputActionOrigin_Switch_RightTrigger_Click = 204,
	k_EInputActionOrigin_Switch_LeftStick_Move = 205,
	k_EInputActionOrigin_Switch_LeftStick_Click = 206,
	k_EInputActionOrigin_Switch_LeftStick_DPadNorth = 207,
	k_EInputActionOrigin_Switch_LeftStick_DPadSouth = 208,
	k_EInputActionOrigin_Switch_LeftStick_DPadWest = 209,
	k_EInputActionOrigin_Switch_LeftStick_DPadEast = 210,
	k_EInputActionOrigin_Switch_RightStick_Move = 211,
	k_EInputActionOrigin_Switch_RightStick_Click = 212,
	k_EInputActionOrigin_Switch_RightStick_DPadNorth = 213,
	k_EInputActionOrigin_Switch_RightStick_DPadSouth = 214,
	k_EInputActionOrigin_Switch_RightStick_DPadWest = 215,
	k_EInputActionOrigin_Switch_RightStick_DPadEast = 216,
	k_EInputActionOrigin_Switch_DPad_North = 217,
	k_EInputActionOrigin_Switch_DPad_South = 218,
	k_EInputActionOrigin_Switch_DPad_West = 219,
	k_EInputActionOrigin_Switch_DPad_East = 220,
	k_EInputActionOrigin_Switch_ProGyro_Move = 221,
	k_EInputActionOrigin_Switch_ProGyro_Pitch = 222,
	k_EInputActionOrigin_Switch_ProGyro_Yaw = 223,
	k_EInputActionOrigin_Switch_ProGyro_Roll = 224,
	k_EInputActionOrigin_Switch_DPad_Move = 225,
	k_EInputActionOrigin_Switch_Reserved1 = 226,
	k_EInputActionOrigin_Switch_Reserved2 = 227,
	k_EInputActionOrigin_Switch_Reserved3 = 228,
	k_EInputActionOrigin_Switch_Reserved4 = 229,
	k_EInputActionOrigin_Switch_Reserved5 = 230,
	k_EInputActionOrigin_Switch_Reserved6 = 231,
	k_EInputActionOrigin_Switch_Reserved7 = 232,
	k_EInputActionOrigin_Switch_Reserved8 = 233,
	k_EInputActionOrigin_Switch_Reserved9 = 234,
	k_EInputActionOrigin_Switch_Reserved10 = 235,
	k_EInputActionOrigin_Switch_RightGyro_Move = 236,
	k_EInputActionOrigin_Switch_RightGyro_Pitch = 237,
	k_EInputActionOrigin_Switch_RightGyro_Yaw = 238,
	k_EInputActionOrigin_Switch_RightGyro_Roll = 239,
	k_EInputActionOrigin_Switch_LeftGyro_Move = 240,
	k_EInputActionOrigin_Switch_LeftGyro_Pitch = 241,
	k_EInputActionOrigin_Switch_LeftGyro_Yaw = 242,
	k_EInputActionOrigin_Switch_LeftGyro_Roll = 243,
	k_EInputActionOrigin_Switch_LeftGrip_Lower = 244,
	k_EInputActionOrigin_Switch_LeftGrip_Upper = 245,
	k_EInputActionOrigin_Switch_RightGrip_Lower = 246,
	k_EInputActionOrigin_Switch_RightGrip_Upper = 247,
	k_EInputActionOrigin_Switch_JoyConButton_N = 248,
	k_EInputActionOrigin_Switch_JoyConButton_E = 249,
	k_EInputActionOrigin_Switch_JoyConButton_S = 250,
	k_EInputActionOrigin_Switch_JoyConButton_W = 251,
	k_EInputActionOrigin_Switch_Reserved15 = 252,
	k_EInputActionOrigin_Switch_Reserved16 = 253,
	k_EInputActionOrigin_Switch_Reserved17 = 254,
	k_EInputActionOrigin_Switch_Reserved18 = 255,
	k_EInputActionOrigin_Switch_Reserved19 = 256,
	k_EInputActionOrigin_Switch_Reserved20 = 257,
	k_EInputActionOrigin_PS5_X = 258,
	k_EInputActionOrigin_PS5_Circle = 259,
	k_EInputActionOrigin_PS5_Triangle = 260,
	k_EInputActionOrigin_PS5_Square = 261,
	k_EInputActionOrigin_PS5_LeftBumper = 262,
	k_EInputActionOrigin_PS5_RightBumper = 263,
	k_EInputActionOrigin_PS5_Option = 264,
	k_EInputActionOrigin_PS5_Create = 265,
	k_EInputActionOrigin_PS5_Mute = 266,
	k_EInputActionOrigin_PS5_LeftPad_Touch = 267,
	k_EInputActionOrigin_PS5_LeftPad_Swipe = 268,
	k_EInputActionOrigin_PS5_LeftPad_Click = 269,
	k_EInputActionOrigin_PS5_LeftPad_DPadNorth = 270,
	k_EInputActionOrigin_PS5_LeftPad_DPadSouth = 271,
	k_EInputActionOrigin_PS5_LeftPad_DPadWest = 272,
	k_EInputActionOrigin_PS5_LeftPad_DPadEast = 273,
	k_EInputActionOrigin_PS5_RightPad_Touch = 274,
	k_EInputActionOrigin_PS5_RightPad_Swipe = 275,
	k_EInputActionOrigin_PS5_RightPad_Click = 276,
	k_EInputActionOrigin_PS5_RightPad_DPadNorth = 277,
	k_EInputActionOrigin_PS5_RightPad_DPadSouth = 278,
	k_EInputActionOrigin_PS5_RightPad_DPadWest = 279,
	k_EInputActionOrigin_PS5_RightPad_DPadEast = 280,
	k_EInputActionOrigin_PS5_CenterPad_Touch = 281,
	k_EInputActionOrigin_PS5_CenterPad_Swipe = 282,
	k_EInputActionOrigin_PS5_CenterPad_Click = 283,
	k_EInputActionOrigin_PS5_CenterPad_DPadNorth = 284,
	k_EInputActionOrigin_PS5_CenterPad_DPadSouth = 285,
	k_EInputActionOrigin_PS5_CenterPad_DPadWest = 286,
	k_EInputActionOrigin_PS5_CenterPad_DPadEast = 287,
	k_EInputActionOrigin_PS5_LeftTrigger_Pull = 288,
	k_EInputActionOrigin_PS5_LeftTrigger_Click = 289,
	k_EInputActionOrigin_PS5_RightTrigger_Pull = 290,
	k_EInputActionOrigin_PS5_RightTrigger_Click = 291,
	k_EInputActionOrigin_PS5_LeftStick_Move = 292,
	k_EInputActionOrigin_PS5_LeftStick_Click = 293,
	k_EInputActionOrigin_PS5_LeftStick_DPadNorth = 294,
	k_EInputActionOrigin_PS5_LeftStick_DPadSouth = 295,
	k_EInputActionOrigin_PS5_LeftStick_DPadWest = 296,
	k_EInputActionOrigin_PS5_LeftStick_DPadEast = 297,
	k_EInputActionOrigin_PS5_RightStick_Move = 298,
	k_EInputActionOrigin_PS5_RightStick_Click = 299,
	k_EInputActionOrigin_PS5_RightStick_DPadNorth = 300,
	k_EInputActionOrigin_PS5_RightStick_DPadSouth = 301,
	k_EInputActionOrigin_PS5_RightStick_DPadWest = 302,
	k_EInputActionOrigin_PS5_RightStick_DPadEast = 303,
	k_EInputActionOrigin_PS5_DPad_North = 304,
	k_EInputActionOrigin_PS5_DPad_South = 305,
	k_EInputActionOrigin_PS5_DPad_West = 306,
	k_EInputActionOrigin_PS5_DPad_East = 307,
	k_EInputActionOrigin_PS5_Gyro_Move = 308,
	k_EInputActionOrigin_PS5_Gyro_Pitch = 309,
	k_EInputActionOrigin_PS5_Gyro_Yaw = 310,
	k_EInputActionOrigin_PS5_Gyro_Roll = 311,
	k_EInputActionOrigin_PS5_DPad_Move = 312,
	k_EInputActionOrigin_PS5_LeftGrip = 313,
	k_EInputActionOrigin_PS5_RightGrip = 314,
	k_EInputActionOrigin_PS5_LeftFn = 315,
	k_EInputActionOrigin_PS5_RightFn = 316,
	k_EInputActionOrigin_PS5_Reserved5 = 317,
	k_EInputActionOrigin_PS5_Reserved6 = 318,
	k_EInputActionOrigin_PS5_Reserved7 = 319,
	k_EInputActionOrigin_PS5_Reserved8 = 320,
	k_EInputActionOrigin_PS5_Reserved9 = 321,
	k_EInputActionOrigin_PS5_Reserved10 = 322,
	k_EInputActionOrigin_PS5_Reserved11 = 323,
	k_EInputActionOrigin_PS5_Reserved12 = 324,
	k_EInputActionOrigin_PS5_Reserved13 = 325,
	k_EInputActionOrigin_PS5_Reserved14 = 326,
	k_EInputActionOrigin_PS5_Reserved15 = 327,
	k_EInputActionOrigin_PS5_Reserved16 = 328,
	k_EInputActionOrigin_PS5_Reserved17 = 329,
	k_EInputActionOrigin_PS5_Reserved18 = 330,
	k_EInputActionOrigin_PS5_Reserved19 = 331,
	k_EInputActionOrigin_PS5_Reserved20 = 332,
	k_EInputActionOrigin_SteamDeck_A = 333,
	k_EInputActionOrigin_SteamDeck_B = 334,
	k_EInputActionOrigin_SteamDeck_X = 335,
	k_EInputActionOrigin_SteamDeck_Y = 336,
	k_EInputActionOrigin_SteamDeck_L1 = 337,
	k_EInputActionOrigin_SteamDeck_R1 = 338,
	k_EInputActionOrigin_SteamDeck_Menu = 339,
	k_EInputActionOrigin_SteamDeck_View = 340,
	k_EInputActionOrigin_SteamDeck_LeftPad_Touch = 341,
	k_EInputActionOrigin_SteamDeck_LeftPad_Swipe = 342,
	k_EInputActionOrigin_SteamDeck_LeftPad_Click = 343,
	k_EInputActionOrigin_SteamDeck_LeftPad_DPadNorth = 344,
	k_EInputActionOrigin_SteamDeck_LeftPad_DPadSouth = 345,
	k_EInputActionOrigin_SteamDeck_LeftPad_DPadWest = 346,
	k_EInputActionOrigin_SteamDeck_LeftPad_DPadEast = 347,
	k_EInputActionOrigin_SteamDeck_RightPad_Touch = 348,
	k_EInputActionOrigin_SteamDeck_RightPad_Swipe = 349,
	k_EInputActionOrigin_SteamDeck_RightPad_Click = 350,
	k_EInputActionOrigin_SteamDeck_RightPad_DPadNorth = 351,
	k_EInputActionOrigin_SteamDeck_RightPad_DPadSouth = 352,
	k_EInputActionOrigin_SteamDeck_RightPad_DPadWest = 353,
	k_EInputActionOrigin_SteamDeck_RightPad_DPadEast = 354,
	k_EInputActionOrigin_SteamDeck_L2_SoftPull = 355,
	k_EInputActionOrigin_SteamDeck_L2 = 356,
	k_EInputActionOrigin_SteamDeck_R2_SoftPull = 357,
	k_EInputActionOrigin_SteamDeck_R2 = 358,
	k_EInputActionOrigin_SteamDeck_LeftStick_Move = 359,
	k_EInputActionOrigin_SteamDeck_L3 = 360,
	k_EInputActionOrigin_SteamDeck_LeftStick_DPadNorth = 361,
	k_EInputActionOrigin_SteamDeck_LeftStick_DPadSouth = 362,
	k_EInputActionOrigin_SteamDeck_LeftStick_DPadWest = 363,
	k_EInputActionOrigin_SteamDeck_LeftStick_DPadEast = 364,
	k_EInputActionOrigin_SteamDeck_LeftStick_Touch = 365,
	k_EInputActionOrigin_SteamDeck_RightStick_Move = 366,
	k_EInputActionOrigin_SteamDeck_R3 = 367,
	k_EInputActionOrigin_SteamDeck_RightStick_DPadNorth = 368,
	k_EInputActionOrigin_SteamDeck_RightStick_DPadSouth = 369,
	k_EInputActionOrigin_SteamDeck_RightStick_DPadWest = 370,
	k_EInputActionOrigin_SteamDeck_RightStick_DPadEast = 371,
	k_EInputActionOrigin_SteamDeck_RightStick_Touch = 372,
	k_EInputActionOrigin_SteamDeck_L4 = 373,
	k_EInputActionOrigin_SteamDeck_R4 = 374,
	k_EInputActionOrigin_SteamDeck_L5 = 375,
	k_EInputActionOrigin_SteamDeck_R5 = 376,
	k_EInputActionOrigin_SteamDeck_DPad_Move = 377,
	k_EInputActionOrigin_SteamDeck_DPad_North = 378,
	k_EInputActionOrigin_SteamDeck_DPad_South = 379,
	k_EInputActionOrigin_SteamDeck_DPad_West = 380,
	k_EInputActionOrigin_SteamDeck_DPad_East = 381,
	k_EInputActionOrigin_SteamDeck_Gyro_Move = 382,
	k_EInputActionOrigin_SteamDeck_Gyro_Pitch = 383,
	k_EInputActionOrigin_SteamDeck_Gyro_Yaw = 384,
	k_EInputActionOrigin_SteamDeck_Gyro_Roll = 385,
	k_EInputActionOrigin_SteamDeck_Reserved1 = 386,
	k_EInputActionOrigin_SteamDeck_Reserved2 = 387,
	k_EInputActionOrigin_SteamDeck_Reserved3 = 388,
	k_EInputActionOrigin_SteamDeck_Reserved4 = 389,
	k_EInputActionOrigin_SteamDeck_Reserved5 = 390,
	k_EInputActionOrigin_SteamDeck_Reserved6 = 391,
	k_EInputActionOrigin_SteamDeck_Reserved7 = 392,
	k_EInputActionOrigin_SteamDeck_Reserved8 = 393,
	k_EInputActionOrigin_SteamDeck_Reserved9 = 394,
	k_EInputActionOrigin_SteamDeck_Reserved10 = 395,
	k_EInputActionOrigin_SteamDeck_Reserved11 = 396,
	k_EInputActionOrigin_SteamDeck_Reserved12 = 397,
	k_EInputActionOrigin_SteamDeck_Reserved13 = 398,
	k_EInputActionOrigin_SteamDeck_Reserved14 = 399,
	k_EInputActionOrigin_SteamDeck_Reserved15 = 400,
	k_EInputActionOrigin_SteamDeck_Reserved16 = 401,
	k_EInputActionOrigin_SteamDeck_Reserved17 = 402,
	k_EInputActionOrigin_SteamDeck_Reserved18 = 403,
	k_EInputActionOrigin_SteamDeck_Reserved19 = 404,
	k_EInputActionOrigin_SteamDeck_Reserved20 = 405,
	k_EInputActionOrigin_Count = 406,
	k_EInputActionOrigin_MaximumPossibleValue = 32767,
};
enum EXboxOrigin {
	k_EXboxOrigin_A = 0,
	k_EXboxOrigin_B = 1,
	k_EXboxOrigin_X = 2,
	k_EXboxOrigin_Y = 3,
	k_EXboxOrigin_LeftBumper = 4,
	k_EXboxOrigin_RightBumper = 5,
	k_EXboxOrigin_Menu = 6,
	k_EXboxOrigin_View = 7,
	k_EXboxOrigin_LeftTrigger_Pull = 8,
	k_EXboxOrigin_LeftTrigger_Click = 9,
	k_EXboxOrigin_RightTrigger_Pull = 10,
	k_EXboxOrigin_RightTrigger_Click = 11,
	k_EXboxOrigin_LeftStick_Move = 12,
	k_EXboxOrigin_LeftStick_Click = 13,
	k_EXboxOrigin_LeftStick_DPadNorth = 14,
	k_EXboxOrigin_LeftStick_DPadSouth = 15,
	k_EXboxOrigin_LeftStick_DPadWest = 16,
	k_EXboxOrigin_LeftStick_DPadEast = 17,
	k_EXboxOrigin_RightStick_Move = 18,
	k_EXboxOrigin_RightStick_Click = 19,
	k_EXboxOrigin_RightStick_DPadNorth = 20,
	k_EXboxOrigin_RightStick_DPadSouth = 21,
	k_EXboxOrigin_RightStick_DPadWest = 22,
	k_EXboxOrigin_RightStick_DPadEast = 23,
	k_EXboxOrigin_DPad_North = 24,
	k_EXboxOrigin_DPad_South = 25,
	k_EXboxOrigin_DPad_West = 26,
	k_EXboxOrigin_DPad_East = 27,
	k_EXboxOrigin_Count = 28,
};
enum ESteamControllerPad {
	k_ESteamControllerPad_Left = 0,
	k_ESteamControllerPad_Right = 1,
};
enum EControllerHapticLocation {
	k_EControllerHapticLocation_Left = 1,
	k_EControllerHapticLocation_Right = 2,
	k_EControllerHapticLocation_Both = 3,
};
enum EControllerHapticType {
	k_EControllerHapticType_Off = 0,
	k_EControllerHapticType_Tick = 1,
	k_EControllerHapticType_Click = 2,
};
enum ESteamInputType {
	k_ESteamInputType_Unknown = 0,
	k_ESteamInputType_SteamController = 1,
	k_ESteamInputType_XBox360Controller = 2,
	k_ESteamInputType_XBoxOneController = 3,
	k_ESteamInputType_GenericGamepad = 4,
	k_ESteamInputType_PS4Controller = 5,
	k_ESteamInputType_AppleMFiController = 6,
	k_ESteamInputType_AndroidController = 7,
	k_ESteamInputType_SwitchJoyConPair = 8,
	k_ESteamInputType_SwitchJoyConSingle = 9,
	k_ESteamInputType_SwitchProController = 10,
	k_ESteamInputType_MobileTouch = 11,
	k_ESteamInputType_PS3Controller = 12,
	k_ESteamInputType_PS5Controller = 13,
	k_ESteamInputType_SteamDeckController = 14,
	k_ESteamInputType_Count = 15,
	k_ESteamInputType_MaximumPossibleValue = 255,
};
enum ESteamInputConfigurationEnableType {
	k_ESteamInputConfigurationEnableType_None = 0,
	k_ESteamInputConfigurationEnableType_Playstation = 1,
	k_ESteamInputConfigurationEnableType_Xbox = 2,
	k_ESteamInputConfigurationEnableType_Generic = 4,
	k_ESteamInputConfigurationEnableType_Switch = 8,
};
enum ESteamInputLEDFlag {
	k_ESteamInputLEDFlag_SetColor = 0,
	k_ESteamInputLEDFlag_RestoreUserDefault = 1,
};
enum ESteamInputGlyphSize {
	k_ESteamInputGlyphSize_Small = 0,
	k_ESteamInputGlyphSize_Medium = 1,
	k_ESteamInputGlyphSize_Large = 2,
	k_ESteamInputGlyphSize_Count = 3,
};
enum ESteamInputGlyphStyle {
	ESteamInputGlyphStyle_Knockout = 0,
	ESteamInputGlyphStyle_Light = 1,
	ESteamInputGlyphStyle_Dark = 2,
	ESteamInputGlyphStyle_NeutralColorABXY = 16,
	ESteamInputGlyphStyle_SolidABXY = 32,
};
enum ESteamInputActionEventType {
	ESteamInputActionEventType_DigitalAction = 0,
	ESteamInputActionEventType_AnalogAction = 1,
};
enum EControllerActionOrigin {
	k_EControllerActionOrigin_None = 0,
	k_EControllerActionOrigin_A = 1,
	k_EControllerActionOrigin_B = 2,
	k_EControllerActionOrigin_X = 3,
	k_EControllerActionOrigin_Y = 4,
	k_EControllerActionOrigin_LeftBumper = 5,
	k_EControllerActionOrigin_RightBumper = 6,
	k_EControllerActionOrigin_LeftGrip = 7,
	k_EControllerActionOrigin_RightGrip = 8,
	k_EControllerActionOrigin_Start = 9,
	k_EControllerActionOrigin_Back = 10,
	k_EControllerActionOrigin_LeftPad_Touch = 11,
	k_EControllerActionOrigin_LeftPad_Swipe = 12,
	k_EControllerActionOrigin_LeftPad_Click = 13,
	k_EControllerActionOrigin_LeftPad_DPadNorth = 14,
	k_EControllerActionOrigin_LeftPad_DPadSouth = 15,
	k_EControllerActionOrigin_LeftPad_DPadWest = 16,
	k_EControllerActionOrigin_LeftPad_DPadEast = 17,
	k_EControllerActionOrigin_RightPad_Touch = 18,
	k_EControllerActionOrigin_RightPad_Swipe = 19,
	k_EControllerActionOrigin_RightPad_Click = 20,
	k_EControllerActionOrigin_RightPad_DPadNorth = 21,
	k_EControllerActionOrigin_RightPad_DPadSouth = 22,
	k_EControllerActionOrigin_RightPad_DPadWest = 23,
	k_EControllerActionOrigin_RightPad_DPadEast = 24,
	k_EControllerActionOrigin_LeftTrigger_Pull = 25,
	k_EControllerActionOrigin_LeftTrigger_Click = 26,
	k_EControllerActionOrigin_RightTrigger_Pull = 27,
	k_EControllerActionOrigin_RightTrigger_Click = 28,
	k_EControllerActionOrigin_LeftStick_Move = 29,
	k_EControllerActionOrigin_LeftStick_Click = 30,
	k_EControllerActionOrigin_LeftStick_DPadNorth = 31,
	k_EControllerActionOrigin_LeftStick_DPadSouth = 32,
	k_EControllerActionOrigin_LeftStick_DPadWest = 33,
	k_EControllerActionOrigin_LeftStick_DPadEast = 34,
	k_EControllerActionOrigin_Gyro_Move = 35,
	k_EControllerActionOrigin_Gyro_Pitch = 36,
	k_EControllerActionOrigin_Gyro_Yaw = 37,
	k_EControllerActionOrigin_Gyro_Roll = 38,
	k_EControllerActionOrigin_PS4_X = 39,
	k_EControllerActionOrigin_PS4_Circle = 40,
	k_EControllerActionOrigin_PS4_Triangle = 41,
	k_EControllerActionOrigin_PS4_Square = 42,
	k_EControllerActionOrigin_PS4_LeftBumper = 43,
	k_EControllerActionOrigin_PS4_RightBumper = 44,
	k_EControllerActionOrigin_PS4_Options = 45,
	k_EControllerActionOrigin_PS4_Share = 46,
	k_EControllerActionOrigin_PS4_LeftPad_Touch = 47,
	k_EControllerActionOrigin_PS4_LeftPad_Swipe = 48,
	k_EControllerActionOrigin_PS4_LeftPad_Click = 49,
	k_EControllerActionOrigin_PS4_LeftPad_DPadNorth = 50,
	k_EControllerActionOrigin_PS4_LeftPad_DPadSouth = 51,
	k_EControllerActionOrigin_PS4_LeftPad_DPadWest = 52,
	k_EControllerActionOrigin_PS4_LeftPad_DPadEast = 53,
	k_EControllerActionOrigin_PS4_RightPad_Touch = 54,
	k_EControllerActionOrigin_PS4_RightPad_Swipe = 55,
	k_EControllerActionOrigin_PS4_RightPad_Click = 56,
	k_EControllerActionOrigin_PS4_RightPad_DPadNorth = 57,
	k_EControllerActionOrigin_PS4_RightPad_DPadSouth = 58,
	k_EControllerActionOrigin_PS4_RightPad_DPadWest = 59,
	k_EControllerActionOrigin_PS4_RightPad_DPadEast = 60,
	k_EControllerActionOrigin_PS4_CenterPad_Touch = 61,
	k_EControllerActionOrigin_PS4_CenterPad_Swipe = 62,
	k_EControllerActionOrigin_PS4_CenterPad_Click = 63,
	k_EControllerActionOrigin_PS4_CenterPad_DPadNorth = 64,
	k_EControllerActionOrigin_PS4_CenterPad_DPadSouth = 65,
	k_EControllerActionOrigin_PS4_CenterPad_DPadWest = 66,
	k_EControllerActionOrigin_PS4_CenterPad_DPadEast = 67,
	k_EControllerActionOrigin_PS4_LeftTrigger_Pull = 68,
	k_EControllerActionOrigin_PS4_LeftTrigger_Click = 69,
	k_EControllerActionOrigin_PS4_RightTrigger_Pull = 70,
	k_EControllerActionOrigin_PS4_RightTrigger_Click = 71,
	k_EControllerActionOrigin_PS4_LeftStick_Move = 72,
	k_EControllerActionOrigin_PS4_LeftStick_Click = 73,
	k_EControllerActionOrigin_PS4_LeftStick_DPadNorth = 74,
	k_EControllerActionOrigin_PS4_LeftStick_DPadSouth = 75,
	k_EControllerActionOrigin_PS4_LeftStick_DPadWest = 76,
	k_EControllerActionOrigin_PS4_LeftStick_DPadEast = 77,
	k_EControllerActionOrigin_PS4_RightStick_Move = 78,
	k_EControllerActionOrigin_PS4_RightStick_Click = 79,
	k_EControllerActionOrigin_PS4_RightStick_DPadNorth = 80,
	k_EControllerActionOrigin_PS4_RightStick_DPadSouth = 81,
	k_EControllerActionOrigin_PS4_RightStick_DPadWest = 82,
	k_EControllerActionOrigin_PS4_RightStick_DPadEast = 83,
	k_EControllerActionOrigin_PS4_DPad_North = 84,
	k_EControllerActionOrigin_PS4_DPad_South = 85,
	k_EControllerActionOrigin_PS4_DPad_West = 86,
	k_EControllerActionOrigin_PS4_DPad_East = 87,
	k_EControllerActionOrigin_PS4_Gyro_Move = 88,
	k_EControllerActionOrigin_PS4_Gyro_Pitch = 89,
	k_EControllerActionOrigin_PS4_Gyro_Yaw = 90,
	k_EControllerActionOrigin_PS4_Gyro_Roll = 91,
	k_EControllerActionOrigin_XBoxOne_A = 92,
	k_EControllerActionOrigin_XBoxOne_B = 93,
	k_EControllerActionOrigin_XBoxOne_X = 94,
	k_EControllerActionOrigin_XBoxOne_Y = 95,
	k_EControllerActionOrigin_XBoxOne_LeftBumper = 96,
	k_EControllerActionOrigin_XBoxOne_RightBumper = 97,
	k_EControllerActionOrigin_XBoxOne_Menu = 98,
	k_EControllerActionOrigin_XBoxOne_View = 99,
	k_EControllerActionOrigin_XBoxOne_LeftTrigger_Pull = 100,
	k_EControllerActionOrigin_XBoxOne_LeftTrigger_Click = 101,
	k_EControllerActionOrigin_XBoxOne_RightTrigger_Pull = 102,
	k_EControllerActionOrigin_XBoxOne_RightTrigger_Click = 103,
	k_EControllerActionOrigin_XBoxOne_LeftStick_Move = 104,
	k_EControllerActionOrigin_XBoxOne_LeftStick_Click = 105,
	k_EControllerActionOrigin_XBoxOne_LeftStick_DPadNorth = 106,
	k_EControllerActionOrigin_XBoxOne_LeftStick_DPadSouth = 107,
	k_EControllerActionOrigin_XBoxOne_LeftStick_DPadWest = 108,
	k_EControllerActionOrigin_XBoxOne_LeftStick_DPadEast = 109,
	k_EControllerActionOrigin_XBoxOne_RightStick_Move = 110,
	k_EControllerActionOrigin_XBoxOne_RightStick_Click = 111,
	k_EControllerActionOrigin_XBoxOne_RightStick_DPadNorth = 112,
	k_EControllerActionOrigin_XBoxOne_RightStick_DPadSouth = 113,
	k_EControllerActionOrigin_XBoxOne_RightStick_DPadWest = 114,
	k_EControllerActionOrigin_XBoxOne_RightStick_DPadEast = 115,
	k_EControllerActionOrigin_XBoxOne_DPad_North = 116,
	k_EControllerActionOrigin_XBoxOne_DPad_South = 117,
	k_EControllerActionOrigin_XBoxOne_DPad_West = 118,
	k_EControllerActionOrigin_XBoxOne_DPad_East = 119,
	k_EControllerActionOrigin_XBox360_A = 120,
	k_EControllerActionOrigin_XBox360_B = 121,
	k_EControllerActionOrigin_XBox360_X = 122,
	k_EControllerActionOrigin_XBox360_Y = 123,
	k_EControllerActionOrigin_XBox360_LeftBumper = 124,
	k_EControllerActionOrigin_XBox360_RightBumper = 125,
	k_EControllerActionOrigin_XBox360_Start = 126,
	k_EControllerActionOrigin_XBox360_Back = 127,
	k_EControllerActionOrigin_XBox360_LeftTrigger_Pull = 128,
	k_EControllerActionOrigin_XBox360_LeftTrigger_Click = 129,
	k_EControllerActionOrigin_XBox360_RightTrigger_Pull = 130,
	k_EControllerActionOrigin_XBox360_RightTrigger_Click = 131,
	k_EControllerActionOrigin_XBox360_LeftStick_Move = 132,
	k_EControllerActionOrigin_XBox360_LeftStick_Click = 133,
	k_EControllerActionOrigin_XBox360_LeftStick_DPadNorth = 134,
	k_EControllerActionOrigin_XBox360_LeftStick_DPadSouth = 135,
	k_EControllerActionOrigin_XBox360_LeftStick_DPadWest = 136,
	k_EControllerActionOrigin_XBox360_LeftStick_DPadEast = 137,
	k_EControllerActionOrigin_XBox360_RightStick_Move = 138,
	k_EControllerActionOrigin_XBox360_RightStick_Click = 139,
	k_EControllerActionOrigin_XBox360_RightStick_DPadNorth = 140,
	k_EControllerActionOrigin_XBox360_RightStick_DPadSouth = 141,
	k_EControllerActionOrigin_XBox360_RightStick_DPadWest = 142,
	k_EControllerActionOrigin_XBox360_RightStick_DPadEast = 143,
	k_EControllerActionOrigin_XBox360_DPad_North = 144,
	k_EControllerActionOrigin_XBox360_DPad_South = 145,
	k_EControllerActionOrigin_XBox360_DPad_West = 146,
	k_EControllerActionOrigin_XBox360_DPad_East = 147,
	k_EControllerActionOrigin_SteamV2_A = 148,
	k_EControllerActionOrigin_SteamV2_B = 149,
	k_EControllerActionOrigin_SteamV2_X = 150,
	k_EControllerActionOrigin_SteamV2_Y = 151,
	k_EControllerActionOrigin_SteamV2_LeftBumper = 152,
	k_EControllerActionOrigin_SteamV2_RightBumper = 153,
	k_EControllerActionOrigin_SteamV2_LeftGrip_Lower = 154,
	k_EControllerActionOrigin_SteamV2_LeftGrip_Upper = 155,
	k_EControllerActionOrigin_SteamV2_RightGrip_Lower = 156,
	k_EControllerActionOrigin_SteamV2_RightGrip_Upper = 157,
	k_EControllerActionOrigin_SteamV2_LeftBumper_Pressure = 158,
	k_EControllerActionOrigin_SteamV2_RightBumper_Pressure = 159,
	k_EControllerActionOrigin_SteamV2_LeftGrip_Pressure = 160,
	k_EControllerActionOrigin_SteamV2_RightGrip_Pressure = 161,
	k_EControllerActionOrigin_SteamV2_LeftGrip_Upper_Pressure = 162,
	k_EControllerActionOrigin_SteamV2_RightGrip_Upper_Pressure = 163,
	k_EControllerActionOrigin_SteamV2_Start = 164,
	k_EControllerActionOrigin_SteamV2_Back = 165,
	k_EControllerActionOrigin_SteamV2_LeftPad_Touch = 166,
	k_EControllerActionOrigin_SteamV2_LeftPad_Swipe = 167,
	k_EControllerActionOrigin_SteamV2_LeftPad_Click = 168,
	k_EControllerActionOrigin_SteamV2_LeftPad_Pressure = 169,
	k_EControllerActionOrigin_SteamV2_LeftPad_DPadNorth = 170,
	k_EControllerActionOrigin_SteamV2_LeftPad_DPadSouth = 171,
	k_EControllerActionOrigin_SteamV2_LeftPad_DPadWest = 172,
	k_EControllerActionOrigin_SteamV2_LeftPad_DPadEast = 173,
	k_EControllerActionOrigin_SteamV2_RightPad_Touch = 174,
	k_EControllerActionOrigin_SteamV2_RightPad_Swipe = 175,
	k_EControllerActionOrigin_SteamV2_RightPad_Click = 176,
	k_EControllerActionOrigin_SteamV2_RightPad_Pressure = 177,
	k_EControllerActionOrigin_SteamV2_RightPad_DPadNorth = 178,
	k_EControllerActionOrigin_SteamV2_RightPad_DPadSouth = 179,
	k_EControllerActionOrigin_SteamV2_RightPad_DPadWest = 180,
	k_EControllerActionOrigin_SteamV2_RightPad_DPadEast = 181,
	k_EControllerActionOrigin_SteamV2_LeftTrigger_Pull = 182,
	k_EControllerActionOrigin_SteamV2_LeftTrigger_Click = 183,
	k_EControllerActionOrigin_SteamV2_RightTrigger_Pull = 184,
	k_EControllerActionOrigin_SteamV2_RightTrigger_Click = 185,
	k_EControllerActionOrigin_SteamV2_LeftStick_Move = 186,
	k_EControllerActionOrigin_SteamV2_LeftStick_Click = 187,
	k_EControllerActionOrigin_SteamV2_LeftStick_DPadNorth = 188,
	k_EControllerActionOrigin_SteamV2_LeftStick_DPadSouth = 189,
	k_EControllerActionOrigin_SteamV2_LeftStick_DPadWest = 190,
	k_EControllerActionOrigin_SteamV2_LeftStick_DPadEast = 191,
	k_EControllerActionOrigin_SteamV2_Gyro_Move = 192,
	k_EControllerActionOrigin_SteamV2_Gyro_Pitch = 193,
	k_EControllerActionOrigin_SteamV2_Gyro_Yaw = 194,
	k_EControllerActionOrigin_SteamV2_Gyro_Roll = 195,
	k_EControllerActionOrigin_Switch_A = 196,
	k_EControllerActionOrigin_Switch_B = 197,
	k_EControllerActionOrigin_Switch_X = 198,
	k_EControllerActionOrigin_Switch_Y = 199,
	k_EControllerActionOrigin_Switch_LeftBumper = 200,
	k_EControllerActionOrigin_Switch_RightBumper = 201,
	k_EControllerActionOrigin_Switch_Plus = 202,
	k_EControllerActionOrigin_Switch_Minus = 203,
	k_EControllerActionOrigin_Switch_Capture = 204,
	k_EControllerActionOrigin_Switch_LeftTrigger_Pull = 205,
	k_EControllerActionOrigin_Switch_LeftTrigger_Click = 206,
	k_EControllerActionOrigin_Switch_RightTrigger_Pull = 207,
	k_EControllerActionOrigin_Switch_RightTrigger_Click = 208,
	k_EControllerActionOrigin_Switch_LeftStick_Move = 209,
	k_EControllerActionOrigin_Switch_LeftStick_Click = 210,
	k_EControllerActionOrigin_Switch_LeftStick_DPadNorth = 211,
	k_EControllerActionOrigin_Switch_LeftStick_DPadSouth = 212,
	k_EControllerActionOrigin_Switch_LeftStick_DPadWest = 213,
	k_EControllerActionOrigin_Switch_LeftStick_DPadEast = 214,
	k_EControllerActionOrigin_Switch_RightStick_Move = 215,
	k_EControllerActionOrigin_Switch_RightStick_Click = 216,
	k_EControllerActionOrigin_Switch_RightStick_DPadNorth = 217,
	k_EControllerActionOrigin_Switch_RightStick_DPadSouth = 218,
	k_EControllerActionOrigin_Switch_RightStick_DPadWest = 219,
	k_EControllerActionOrigin_Switch_RightStick_DPadEast = 220,
	k_EControllerActionOrigin_Switch_DPad_North = 221,
	k_EControllerActionOrigin_Switch_DPad_South = 222,
	k_EControllerActionOrigin_Switch_DPad_West = 223,
	k_EControllerActionOrigin_Switch_DPad_East = 224,
	k_EControllerActionOrigin_Switch_ProGyro_Move = 225,
	k_EControllerActionOrigin_Switch_ProGyro_Pitch = 226,
	k_EControllerActionOrigin_Switch_ProGyro_Yaw = 227,
	k_EControllerActionOrigin_Switch_ProGyro_Roll = 228,
	k_EControllerActionOrigin_Switch_RightGyro_Move = 229,
	k_EControllerActionOrigin_Switch_RightGyro_Pitch = 230,
	k_EControllerActionOrigin_Switch_RightGyro_Yaw = 231,
	k_EControllerActionOrigin_Switch_RightGyro_Roll = 232,
	k_EControllerActionOrigin_Switch_LeftGyro_Move = 233,
	k_EControllerActionOrigin_Switch_LeftGyro_Pitch = 234,
	k_EControllerActionOrigin_Switch_LeftGyro_Yaw = 235,
	k_EControllerActionOrigin_Switch_LeftGyro_Roll = 236,
	k_EControllerActionOrigin_Switch_LeftGrip_Lower = 237,
	k_EControllerActionOrigin_Switch_LeftGrip_Upper = 238,
	k_EControllerActionOrigin_Switch_RightGrip_Lower = 239,
	k_EControllerActionOrigin_Switch_RightGrip_Upper = 240,
	k_EControllerActionOrigin_PS4_DPad_Move = 241,
	k_EControllerActionOrigin_XBoxOne_DPad_Move = 242,
	k_EControllerActionOrigin_XBox360_DPad_Move = 243,
	k_EControllerActionOrigin_Switch_DPad_Move = 244,
	k_EControllerActionOrigin_PS5_X = 245,
	k_EControllerActionOrigin_PS5_Circle = 246,
	k_EControllerActionOrigin_PS5_Triangle = 247,
	k_EControllerActionOrigin_PS5_Square = 248,
	k_EControllerActionOrigin_PS5_LeftBumper = 249,
	k_EControllerActionOrigin_PS5_RightBumper = 250,
	k_EControllerActionOrigin_PS5_Option = 251,
	k_EControllerActionOrigin_PS5_Create = 252,
	k_EControllerActionOrigin_PS5_Mute = 253,
	k_EControllerActionOrigin_PS5_LeftPad_Touch = 254,
	k_EControllerActionOrigin_PS5_LeftPad_Swipe = 255,
	k_EControllerActionOrigin_PS5_LeftPad_Click = 256,
	k_EControllerActionOrigin_PS5_LeftPad_DPadNorth = 257,
	k_EControllerActionOrigin_PS5_LeftPad_DPadSouth = 258,
	k_EControllerActionOrigin_PS5_LeftPad_DPadWest = 259,
	k_EControllerActionOrigin_PS5_LeftPad_DPadEast = 260,
	k_EControllerActionOrigin_PS5_RightPad_Touch = 261,
	k_EControllerActionOrigin_PS5_RightPad_Swipe = 262,
	k_EControllerActionOrigin_PS5_RightPad_Click = 263,
	k_EControllerActionOrigin_PS5_RightPad_DPadNorth = 264,
	k_EControllerActionOrigin_PS5_RightPad_DPadSouth = 265,
	k_EControllerActionOrigin_PS5_RightPad_DPadWest = 266,
	k_EControllerActionOrigin_PS5_RightPad_DPadEast = 267,
	k_EControllerActionOrigin_PS5_CenterPad_Touch = 268,
	k_EControllerActionOrigin_PS5_CenterPad_Swipe = 269,
	k_EControllerActionOrigin_PS5_CenterPad_Click = 270,
	k_EControllerActionOrigin_PS5_CenterPad_DPadNorth = 271,
	k_EControllerActionOrigin_PS5_CenterPad_DPadSouth = 272,
	k_EControllerActionOrigin_PS5_CenterPad_DPadWest = 273,
	k_EControllerActionOrigin_PS5_CenterPad_DPadEast = 274,
	k_EControllerActionOrigin_PS5_LeftTrigger_Pull = 275,
	k_EControllerActionOrigin_PS5_LeftTrigger_Click = 276,
	k_EControllerActionOrigin_PS5_RightTrigger_Pull = 277,
	k_EControllerActionOrigin_PS5_RightTrigger_Click = 278,
	k_EControllerActionOrigin_PS5_LeftStick_Move = 279,
	k_EControllerActionOrigin_PS5_LeftStick_Click = 280,
	k_EControllerActionOrigin_PS5_LeftStick_DPadNorth = 281,
	k_EControllerActionOrigin_PS5_LeftStick_DPadSouth = 282,
	k_EControllerActionOrigin_PS5_LeftStick_DPadWest = 283,
	k_EControllerActionOrigin_PS5_LeftStick_DPadEast = 284,
	k_EControllerActionOrigin_PS5_RightStick_Move = 285,
	k_EControllerActionOrigin_PS5_RightStick_Click = 286,
	k_EControllerActionOrigin_PS5_RightStick_DPadNorth = 287,
	k_EControllerActionOrigin_PS5_RightStick_DPadSouth = 288,
	k_EControllerActionOrigin_PS5_RightStick_DPadWest = 289,
	k_EControllerActionOrigin_PS5_RightStick_DPadEast = 290,
	k_EControllerActionOrigin_PS5_DPad_Move = 291,
	k_EControllerActionOrigin_PS5_DPad_North = 292,
	k_EControllerActionOrigin_PS5_DPad_South = 293,
	k_EControllerActionOrigin_PS5_DPad_West = 294,
	k_EControllerActionOrigin_PS5_DPad_East = 295,
	k_EControllerActionOrigin_PS5_Gyro_Move = 296,
	k_EControllerActionOrigin_PS5_Gyro_Pitch = 297,
	k_EControllerActionOrigin_PS5_Gyro_Yaw = 298,
	k_EControllerActionOrigin_PS5_Gyro_Roll = 299,
	k_EControllerActionOrigin_XBoxOne_LeftGrip_Lower = 300,
	k_EControllerActionOrigin_XBoxOne_LeftGrip_Upper = 301,
	k_EControllerActionOrigin_XBoxOne_RightGrip_Lower = 302,
	k_EControllerActionOrigin_XBoxOne_RightGrip_Upper = 303,
	k_EControllerActionOrigin_XBoxOne_Share = 304,
	k_EControllerActionOrigin_SteamDeck_A = 305,
	k_EControllerActionOrigin_SteamDeck_B = 306,
	k_EControllerActionOrigin_SteamDeck_X = 307,
	k_EControllerActionOrigin_SteamDeck_Y = 308,
	k_EControllerActionOrigin_SteamDeck_L1 = 309,
	k_EControllerActionOrigin_SteamDeck_R1 = 310,
	k_EControllerActionOrigin_SteamDeck_Menu = 311,
	k_EControllerActionOrigin_SteamDeck_View = 312,
	k_EControllerActionOrigin_SteamDeck_LeftPad_Touch = 313,
	k_EControllerActionOrigin_SteamDeck_LeftPad_Swipe = 314,
	k_EControllerActionOrigin_SteamDeck_LeftPad_Click = 315,
	k_EControllerActionOrigin_SteamDeck_LeftPad_DPadNorth = 316,
	k_EControllerActionOrigin_SteamDeck_LeftPad_DPadSouth = 317,
	k_EControllerActionOrigin_SteamDeck_LeftPad_DPadWest = 318,
	k_EControllerActionOrigin_SteamDeck_LeftPad_DPadEast = 319,
	k_EControllerActionOrigin_SteamDeck_RightPad_Touch = 320,
	k_EControllerActionOrigin_SteamDeck_RightPad_Swipe = 321,
	k_EControllerActionOrigin_SteamDeck_RightPad_Click = 322,
	k_EControllerActionOrigin_SteamDeck_RightPad_DPadNorth = 323,
	k_EControllerActionOrigin_SteamDeck_RightPad_DPadSouth = 324,
	k_EControllerActionOrigin_SteamDeck_RightPad_DPadWest = 325,
	k_EControllerActionOrigin_SteamDeck_RightPad_DPadEast = 326,
	k_EControllerActionOrigin_SteamDeck_L2_SoftPull = 327,
	k_EControllerActionOrigin_SteamDeck_L2 = 328,
	k_EControllerActionOrigin_SteamDeck_R2_SoftPull = 329,
	k_EControllerActionOrigin_SteamDeck_R2 = 330,
	k_EControllerActionOrigin_SteamDeck_LeftStick_Move = 331,
	k_EControllerActionOrigin_SteamDeck_L3 = 332,
	k_EControllerActionOrigin_SteamDeck_LeftStick_DPadNorth = 333,
	k_EControllerActionOrigin_SteamDeck_LeftStick_DPadSouth = 334,
	k_EControllerActionOrigin_SteamDeck_LeftStick_DPadWest = 335,
	k_EControllerActionOrigin_SteamDeck_LeftStick_DPadEast = 336,
	k_EControllerActionOrigin_SteamDeck_LeftStick_Touch = 337,
	k_EControllerActionOrigin_SteamDeck_RightStick_Move = 338,
	k_EControllerActionOrigin_SteamDeck_R3 = 339,
	k_EControllerActionOrigin_SteamDeck_RightStick_DPadNorth = 340,
	k_EControllerActionOrigin_SteamDeck_RightStick_DPadSouth = 341,
	k_EControllerActionOrigin_SteamDeck_RightStick_DPadWest = 342,
	k_EControllerActionOrigin_SteamDeck_RightStick_DPadEast = 343,
	k_EControllerActionOrigin_SteamDeck_RightStick_Touch = 344,
	k_EControllerActionOrigin_SteamDeck_L4 = 345,
	k_EControllerActionOrigin_SteamDeck_R4 = 346,
	k_EControllerActionOrigin_SteamDeck_L5 = 347,
	k_EControllerActionOrigin_SteamDeck_R5 = 348,
	k_EControllerActionOrigin_SteamDeck_DPad_Move = 349,
	k_EControllerActionOrigin_SteamDeck_DPad_North = 350,
	k_EControllerActionOrigin_SteamDeck_DPad_South = 351,
	k_EControllerActionOrigin_SteamDeck_DPad_West = 352,
	k_EControllerActionOrigin_SteamDeck_DPad_East = 353,
	k_EControllerActionOrigin_SteamDeck_Gyro_Move = 354,
	k_EControllerActionOrigin_SteamDeck_Gyro_Pitch = 355,
	k_EControllerActionOrigin_SteamDeck_Gyro_Yaw = 356,
	k_EControllerActionOrigin_SteamDeck_Gyro_Roll = 357,
	k_EControllerActionOrigin_SteamDeck_Reserved1 = 358,
	k_EControllerActionOrigin_SteamDeck_Reserved2 = 359,
	k_EControllerActionOrigin_SteamDeck_Reserved3 = 360,
	k_EControllerActionOrigin_SteamDeck_Reserved4 = 361,
	k_EControllerActionOrigin_SteamDeck_Reserved5 = 362,
	k_EControllerActionOrigin_SteamDeck_Reserved6 = 363,
	k_EControllerActionOrigin_SteamDeck_Reserved7 = 364,
	k_EControllerActionOrigin_SteamDeck_Reserved8 = 365,
	k_EControllerActionOrigin_SteamDeck_Reserved9 = 366,
	k_EControllerActionOrigin_SteamDeck_Reserved10 = 367,
	k_EControllerActionOrigin_SteamDeck_Reserved11 = 368,
	k_EControllerActionOrigin_SteamDeck_Reserved12 = 369,
	k_EControllerActionOrigin_SteamDeck_Reserved13 = 370,
	k_EControllerActionOrigin_SteamDeck_Reserved14 = 371,
	k_EControllerActionOrigin_SteamDeck_Reserved15 = 372,
	k_EControllerActionOrigin_SteamDeck_Reserved16 = 373,
	k_EControllerActionOrigin_SteamDeck_Reserved17 = 374,
	k_EControllerActionOrigin_SteamDeck_Reserved18 = 375,
	k_EControllerActionOrigin_SteamDeck_Reserved19 = 376,
	k_EControllerActionOrigin_SteamDeck_Reserved20 = 377,
	k_EControllerActionOrigin_Switch_JoyConButton_N = 378,
	k_EControllerActionOrigin_Switch_JoyConButton_E = 379,
	k_EControllerActionOrigin_Switch_JoyConButton_S = 380,
	k_EControllerActionOrigin_Switch_JoyConButton_W = 381,
	k_EControllerActionOrigin_PS5_LeftGrip = 382,
	k_EControllerActionOrigin_PS5_RightGrip = 383,
	k_EControllerActionOrigin_PS5_LeftFn = 384,
	k_EControllerActionOrigin_PS5_RightFn = 385,
	k_EControllerActionOrigin_Count = 386,
	k_EControllerActionOrigin_MaximumPossibleValue = 32767,
};
enum ESteamControllerLEDFlag {
	k_ESteamControllerLEDFlag_SetColor = 0,
	k_ESteamControllerLEDFlag_RestoreUserDefault = 1,
};
enum EUGCMatchingUGCType {
	k_EUGCMatchingUGCType_Items = 0,
	k_EUGCMatchingUGCType_Items_Mtx = 1,
	k_EUGCMatchingUGCType_Items_ReadyToUse = 2,
	k_EUGCMatchingUGCType_Collections = 3,
	k_EUGCMatchingUGCType_Artwork = 4,
	k_EUGCMatchingUGCType_Videos = 5,
	k_EUGCMatchingUGCType_Screenshots = 6,
	k_EUGCMatchingUGCType_AllGuides = 7,
	k_EUGCMatchingUGCType_WebGuides = 8,
	k_EUGCMatchingUGCType_IntegratedGuides = 9,
	k_EUGCMatchingUGCType_UsableInGame = 10,
	k_EUGCMatchingUGCType_ControllerBindings = 11,
	k_EUGCMatchingUGCType_GameManagedItems = 12,
	k_EUGCMatchingUGCType_All = -1,
};
enum EUserUGCList {
	k_EUserUGCList_Published = 0,
	k_EUserUGCList_VotedOn = 1,
	k_EUserUGCList_VotedUp = 2,
	k_EUserUGCList_VotedDown = 3,
	k_EUserUGCList_WillVoteLater = 4,
	k_EUserUGCList_Favorited = 5,
	k_EUserUGCList_Subscribed = 6,
	k_EUserUGCList_UsedOrPlayed = 7,
	k_EUserUGCList_Followed = 8,
};
enum EUserUGCListSortOrder {
	k_EUserUGCListSortOrder_CreationOrderDesc = 0,
	k_EUserUGCListSortOrder_CreationOrderAsc = 1,
	k_EUserUGCListSortOrder_TitleAsc = 2,
	k_EUserUGCListSortOrder_LastUpdatedDesc = 3,
	k_EUserUGCListSortOrder_SubscriptionDateDesc = 4,
	k_EUserUGCListSortOrder_VoteScoreDesc = 5,
	k_EUserUGCListSortOrder_ForModeration = 6,
};
enum EUGCQuery {
	k_EUGCQuery_RankedByVote = 0,
	k_EUGCQuery_RankedByPublicationDate = 1,
	k_EUGCQuery_AcceptedForGameRankedByAcceptanceDate = 2,
	k_EUGCQuery_RankedByTrend = 3,
	k_EUGCQuery_FavoritedByFriendsRankedByPublicationDate = 4,
	k_EUGCQuery_CreatedByFriendsRankedByPublicationDate = 5,
	k_EUGCQuery_RankedByNumTimesReported = 6,
	k_EUGCQuery_CreatedByFollowedUsersRankedByPublicationDate = 7,
	k_EUGCQuery_NotYetRated = 8,
	k_EUGCQuery_RankedByTotalVotesAsc = 9,
	k_EUGCQuery_RankedByVotesUp = 10,
	k_EUGCQuery_RankedByTextSearch = 11,
	k_EUGCQuery_RankedByTotalUniqueSubscriptions = 12,
	k_EUGCQuery_RankedByPlaytimeTrend = 13,
	k_EUGCQuery_RankedByTotalPlaytime = 14,
	k_EUGCQuery_RankedByAveragePlaytimeTrend = 15,
	k_EUGCQuery_RankedByLifetimeAveragePlaytime = 16,
	k_EUGCQuery_RankedByPlaytimeSessionsTrend = 17,
	k_EUGCQuery_RankedByLifetimePlaytimeSessions = 18,
	k_EUGCQuery_RankedByLastUpdatedDate = 19,
};
enum EItemUpdateStatus {
	k_EItemUpdateStatusInvalid = 0,
	k_EItemUpdateStatusPreparingConfig = 1,
	k_EItemUpdateStatusPreparingContent = 2,
	k_EItemUpdateStatusUploadingContent = 3,
	k_EItemUpdateStatusUploadingPreviewFile = 4,
	k_EItemUpdateStatusCommittingChanges = 5,
};
enum EItemState {
	k_EItemStateNone = 0,
	k_EItemStateSubscribed = 1,
	k_EItemStateLegacyItem = 2,
	k_EItemStateInstalled = 4,
	k_EItemStateNeedsUpdate = 8,
	k_EItemStateDownloading = 16,
	k_EItemStateDownloadPending = 32,
	k_EItemStateDisabledLocally = 64,
};
enum EItemStatistic {
	k_EItemStatistic_NumSubscriptions = 0,
	k_EItemStatistic_NumFavorites = 1,
	k_EItemStatistic_NumFollowers = 2,
	k_EItemStatistic_NumUniqueSubscriptions = 3,
	k_EItemStatistic_NumUniqueFavorites = 4,
	k_EItemStatistic_NumUniqueFollowers = 5,
	k_EItemStatistic_NumUniqueWebsiteViews = 6,
	k_EItemStatistic_ReportScore = 7,
	k_EItemStatistic_NumSecondsPlayed = 8,
	k_EItemStatistic_NumPlaytimeSessions = 9,
	k_EItemStatistic_NumComments = 10,
	k_EItemStatistic_NumSecondsPlayedDuringTimePeriod = 11,
	k_EItemStatistic_NumPlaytimeSessionsDuringTimePeriod = 12,
};
enum EItemPreviewType {
	k_EItemPreviewType_Image = 0,
	k_EItemPreviewType_YouTubeVideo = 1,
	k_EItemPreviewType_Sketchfab = 2,
	k_EItemPreviewType_EnvironmentMap_HorizontalCross = 3,
	k_EItemPreviewType_EnvironmentMap_LatLong = 4,
	k_EItemPreviewType_Clip = 5,
	k_EItemPreviewType_ReservedMax = 255,
};
enum EUGCContentDescriptorID {
	k_EUGCContentDescriptor_NudityOrSexualContent = 1,
	k_EUGCContentDescriptor_FrequentViolenceOrGore = 2,
	k_EUGCContentDescriptor_AdultOnlySexualContent = 3,
	k_EUGCContentDescriptor_GratuitousSexualContent = 4,
	k_EUGCContentDescriptor_AnyMatureContent = 5,
};
enum ESteamItemFlags {
	k_ESteamItemNoTrade = 1,
	k_ESteamItemRemoved = 256,
	k_ESteamItemConsumed = 512,
};
enum ETimelineGameMode {
	k_ETimelineGameMode_Invalid = 0,
	k_ETimelineGameMode_Playing = 1,
	k_ETimelineGameMode_Staging = 2,
	k_ETimelineGameMode_Menus = 3,
	k_ETimelineGameMode_LoadingScreen = 4,
	k_ETimelineGameMode_Max = 5,
};
enum EParentalFeature {
	k_EFeatureInvalid = 0,
	k_EFeatureStore = 1,
	k_EFeatureCommunity = 2,
	k_EFeatureProfile = 3,
	k_EFeatureFriends = 4,
	k_EFeatureNews = 5,
	k_EFeatureTrading = 6,
	k_EFeatureSettings = 7,
	k_EFeatureConsole = 8,
	k_EFeatureBrowser = 9,
	k_EFeatureParentalSetup = 10,
	k_EFeatureLibrary = 11,
	k_EFeatureTest = 12,
	k_EFeatureSiteLicense = 13,
	k_EFeatureKioskMode_Deprecated = 14,
	k_EFeatureMax = 15,
};
enum ESteamDeviceFormFactor {
	k_ESteamDeviceFormFactorUnknown = 0,
	k_ESteamDeviceFormFactorPhone = 1,
	k_ESteamDeviceFormFactorTablet = 2,
	k_ESteamDeviceFormFactorComputer = 3,
	k_ESteamDeviceFormFactorTV = 4,
	k_ESteamDeviceFormFactorVRHeadset = 5,
};
enum ESteamNetworkingAvailability {
	k_ESteamNetworkingAvailability_CannotTry = -102,
	k_ESteamNetworkingAvailability_Failed = -101,
	k_ESteamNetworkingAvailability_Previously = -100,
	k_ESteamNetworkingAvailability_Retrying = -10,
	k_ESteamNetworkingAvailability_NeverTried = 1,
	k_ESteamNetworkingAvailability_Waiting = 2,
	k_ESteamNetworkingAvailability_Attempting = 3,
	k_ESteamNetworkingAvailability_Current = 100,
	k_ESteamNetworkingAvailability_Unknown = 0,
	k_ESteamNetworkingAvailability__Force32bit = 2147483647,
};
enum ESteamNetworkingIdentityType {
	k_ESteamNetworkingIdentityType_Invalid = 0,
	k_ESteamNetworkingIdentityType_SteamID = 16,
	k_ESteamNetworkingIdentityType_XboxPairwiseID = 17,
	k_ESteamNetworkingIdentityType_SonyPSN = 18,
	k_ESteamNetworkingIdentityType_GoogleStadia = 19,
	k_ESteamNetworkingIdentityType_IPAddress = 1,
	k_ESteamNetworkingIdentityType_GenericString = 2,
	k_ESteamNetworkingIdentityType_GenericBytes = 3,
	k_ESteamNetworkingIdentityType_UnknownType = 4,
	k_ESteamNetworkingIdentityType__Force32bit = 2147483647,
};
enum ESteamNetworkingFakeIPType {
	k_ESteamNetworkingFakeIPType_Invalid = 0,
	k_ESteamNetworkingFakeIPType_NotFake = 1,
	k_ESteamNetworkingFakeIPType_GlobalIPv4 = 2,
	k_ESteamNetworkingFakeIPType_LocalIPv4 = 3,
	k_ESteamNetworkingFakeIPType__Force32Bit = 2147483647,
};
enum ESteamNetworkingConnectionState {
	k_ESteamNetworkingConnectionState_None = 0,
	k_ESteamNetworkingConnectionState_Connecting = 1,
	k_ESteamNetworkingConnectionState_FindingRoute = 2,
	k_ESteamNetworkingConnectionState_Connected = 3,
	k_ESteamNetworkingConnectionState_ClosedByPeer = 4,
	k_ESteamNetworkingConnectionState_ProblemDetectedLocally = 5,
	k_ESteamNetworkingConnectionState_FinWait = -1,
	k_ESteamNetworkingConnectionState_Linger = -2,
	k_ESteamNetworkingConnectionState_Dead = -3,
	k_ESteamNetworkingConnectionState__Force32Bit = 2147483647,
};
enum ESteamNetConnectionEnd {
	k_ESteamNetConnectionEnd_Invalid = 0,
	k_ESteamNetConnectionEnd_App_Min = 1000,
	k_ESteamNetConnectionEnd_App_Generic = 1000,
	k_ESteamNetConnectionEnd_App_Max = 1999,
	k_ESteamNetConnectionEnd_AppException_Min = 2000,
	k_ESteamNetConnectionEnd_AppException_Generic = 2000,
	k_ESteamNetConnectionEnd_AppException_Max = 2999,
	k_ESteamNetConnectionEnd_Local_Min = 3000,
	k_ESteamNetConnectionEnd_Local_OfflineMode = 3001,
	k_ESteamNetConnectionEnd_Local_ManyRelayConnectivity = 3002,
	k_ESteamNetConnectionEnd_Local_HostedServerPrimaryRelay = 3003,
	k_ESteamNetConnectionEnd_Local_NetworkConfig = 3004,
	k_ESteamNetConnectionEnd_Local_Rights = 3005,
	k_ESteamNetConnectionEnd_Local_P2P_ICE_NoPublicAddresses = 3006,
	k_ESteamNetConnectionEnd_Local_Max = 3999,
	k_ESteamNetConnectionEnd_Remote_Min = 4000,
	k_ESteamNetConnectionEnd_Remote_Timeout = 4001,
	k_ESteamNetConnectionEnd_Remote_BadCrypt = 4002,
	k_ESteamNetConnectionEnd_Remote_BadCert = 4003,
	k_ESteamNetConnectionEnd_Remote_BadProtocolVersion = 4006,
	k_ESteamNetConnectionEnd_Remote_P2P_ICE_NoPublicAddresses = 4007,
	k_ESteamNetConnectionEnd_Remote_Max = 4999,
	k_ESteamNetConnectionEnd_Misc_Min = 5000,
	k_ESteamNetConnectionEnd_Misc_Generic = 5001,
	k_ESteamNetConnectionEnd_Misc_InternalError = 5002,
	k_ESteamNetConnectionEnd_Misc_Timeout = 5003,
	k_ESteamNetConnectionEnd_Misc_SteamConnectivity = 5005,
	k_ESteamNetConnectionEnd_Misc_NoRelaySessionsToClient = 5006,
	k_ESteamNetConnectionEnd_Misc_P2P_Rendezvous = 5008,
	k_ESteamNetConnectionEnd_Misc_P2P_NAT_Firewall = 5009,
	k_ESteamNetConnectionEnd_Misc_PeerSentNoConnection = 5010,
	k_ESteamNetConnectionEnd_Misc_Max = 5999,
	k_ESteamNetConnectionEnd__Force32Bit = 2147483647,
};
enum ESteamNetworkingConfigScope {
	k_ESteamNetworkingConfig_Global = 1,
	k_ESteamNetworkingConfig_SocketsInterface = 2,
	k_ESteamNetworkingConfig_ListenSocket = 3,
	k_ESteamNetworkingConfig_Connection = 4,
	k_ESteamNetworkingConfigScope__Force32Bit = 2147483647,
};
enum ESteamNetworkingConfigDataType {
	k_ESteamNetworkingConfig_Int32 = 1,
	k_ESteamNetworkingConfig_Int64 = 2,
	k_ESteamNetworkingConfig_Float = 3,
	k_ESteamNetworkingConfig_String = 4,
	k_ESteamNetworkingConfig_Ptr = 5,
	k_ESteamNetworkingConfigDataType__Force32Bit = 2147483647,
};
enum ESteamNetworkingConfigValue {
	k_ESteamNetworkingConfig_Invalid = 0,
	k_ESteamNetworkingConfig_TimeoutInitial = 24,
	k_ESteamNetworkingConfig_TimeoutConnected = 25,
	k_ESteamNetworkingConfig_SendBufferSize = 9,
	k_ESteamNetworkingConfig_RecvBufferSize = 47,
	k_ESteamNetworkingConfig_RecvBufferMessages = 48,
	k_ESteamNetworkingConfig_RecvMaxMessageSize = 49,
	k_ESteamNetworkingConfig_RecvMaxSegmentsPerPacket = 50,
	k_ESteamNetworkingConfig_ConnectionUserData = 40,
	k_ESteamNetworkingConfig_SendRateMin = 10,
	k_ESteamNetworkingConfig_SendRateMax = 11,
	k_ESteamNetworkingConfig_NagleTime = 12,
	k_ESteamNetworkingConfig_IP_AllowWithoutAuth = 23,
	k_ESteamNetworkingConfig_MTU_PacketSize = 32,
	k_ESteamNetworkingConfig_MTU_DataSize = 33,
	k_ESteamNetworkingConfig_Unencrypted = 34,
	k_ESteamNetworkingConfig_SymmetricConnect = 37,
	k_ESteamNetworkingConfig_LocalVirtualPort = 38,
	k_ESteamNetworkingConfig_DualWifi_Enable = 39,
	k_ESteamNetworkingConfig_EnableDiagnosticsUI = 46,
	k_ESteamNetworkingConfig_FakePacketLoss_Send = 2,
	k_ESteamNetworkingConfig_FakePacketLoss_Recv = 3,
	k_ESteamNetworkingConfig_FakePacketLag_Send = 4,
	k_ESteamNetworkingConfig_FakePacketLag_Recv = 5,
	k_ESteamNetworkingConfig_FakePacketReorder_Send = 6,
	k_ESteamNetworkingConfig_FakePacketReorder_Recv = 7,
	k_ESteamNetworkingConfig_FakePacketReorder_Time = 8,
	k_ESteamNetworkingConfig_FakePacketDup_Send = 26,
	k_ESteamNetworkingConfig_FakePacketDup_Recv = 27,
	k_ESteamNetworkingConfig_FakePacketDup_TimeMax = 28,
	k_ESteamNetworkingConfig_PacketTraceMaxBytes = 41,
	k_ESteamNetworkingConfig_FakeRateLimit_Send_Rate = 42,
	k_ESteamNetworkingConfig_FakeRateLimit_Send_Burst = 43,
	k_ESteamNetworkingConfig_FakeRateLimit_Recv_Rate = 44,
	k_ESteamNetworkingConfig_FakeRateLimit_Recv_Burst = 45,
	k_ESteamNetworkingConfig_OutOfOrderCorrectionWindowMicroseconds = 51,
	k_ESteamNetworkingConfig_Callback_ConnectionStatusChanged = 201,
	k_ESteamNetworkingConfig_Callback_AuthStatusChanged = 202,
	k_ESteamNetworkingConfig_Callback_RelayNetworkStatusChanged = 203,
	k_ESteamNetworkingConfig_Callback_MessagesSessionRequest = 204,
	k_ESteamNetworkingConfig_Callback_MessagesSessionFailed = 205,
	k_ESteamNetworkingConfig_Callback_CreateConnectionSignaling = 206,
	k_ESteamNetworkingConfig_Callback_FakeIPResult = 207,
	k_ESteamNetworkingConfig_P2P_STUN_ServerList = 103,
	k_ESteamNetworkingConfig_P2P_Transport_ICE_Enable = 104,
	k_ESteamNetworkingConfig_P2P_Transport_ICE_Penalty = 105,
	k_ESteamNetworkingConfig_P2P_Transport_SDR_Penalty = 106,
	k_ESteamNetworkingConfig_P2P_TURN_ServerList = 107,
	k_ESteamNetworkingConfig_P2P_TURN_UserList = 108,
	k_ESteamNetworkingConfig_P2P_TURN_PassList = 109,
	k_ESteamNetworkingConfig_P2P_Transport_ICE_Implementation = 110,
	k_ESteamNetworkingConfig_SDRClient_ConsecutitivePingTimeoutsFailInitial = 19,
	k_ESteamNetworkingConfig_SDRClient_ConsecutitivePingTimeoutsFail = 20,
	k_ESteamNetworkingConfig_SDRClient_MinPingsBeforePingAccurate = 21,
	k_ESteamNetworkingConfig_SDRClient_SingleSocket = 22,
	k_ESteamNetworkingConfig_SDRClient_ForceRelayCluster = 29,
	k_ESteamNetworkingConfig_SDRClient_DevTicket = 30,
	k_ESteamNetworkingConfig_SDRClient_ForceProxyAddr = 31,
	k_ESteamNetworkingConfig_SDRClient_FakeClusterPing = 36,
	k_ESteamNetworkingConfig_SDRClient_LimitPingProbesToNearestN = 60,
	k_ESteamNetworkingConfig_LogLevel_AckRTT = 13,
	k_ESteamNetworkingConfig_LogLevel_PacketDecode = 14,
	k_ESteamNetworkingConfig_LogLevel_Message = 15,
	k_ESteamNetworkingConfig_LogLevel_PacketGaps = 16,
	k_ESteamNetworkingConfig_LogLevel_P2PRendezvous = 17,
	k_ESteamNetworkingConfig_LogLevel_SDRRelayPings = 18,
	k_ESteamNetworkingConfig_ECN = 999,
	k_ESteamNetworkingConfig_DELETED_EnumerateDevVars = 35,
	k_ESteamNetworkingConfigValue__Force32Bit = 2147483647,
};
enum ESteamNetworkingGetConfigValueResult {
	k_ESteamNetworkingGetConfigValue_BadValue = -1,
	k_ESteamNetworkingGetConfigValue_BadScopeObj = -2,
	k_ESteamNetworkingGetConfigValue_BufferTooSmall = -3,
	k_ESteamNetworkingGetConfigValue_OK = 1,
	k_ESteamNetworkingGetConfigValue_OKInherited = 2,
	k_ESteamNetworkingGetConfigValueResult__Force32Bit = 2147483647,
};
enum ESteamNetworkingSocketsDebugOutputType {
	k_ESteamNetworkingSocketsDebugOutputType_None = 0,
	k_ESteamNetworkingSocketsDebugOutputType_Bug = 1,
	k_ESteamNetworkingSocketsDebugOutputType_Error = 2,
	k_ESteamNetworkingSocketsDebugOutputType_Important = 3,
	k_ESteamNetworkingSocketsDebugOutputType_Warning = 4,
	k_ESteamNetworkingSocketsDebugOutputType_Msg = 5,
	k_ESteamNetworkingSocketsDebugOutputType_Verbose = 6,
	k_ESteamNetworkingSocketsDebugOutputType_Debug = 7,
	k_ESteamNetworkingSocketsDebugOutputType_Everything = 8,
	k_ESteamNetworkingSocketsDebugOutputType__Force32Bit = 2147483647,
};
enum ESteamAPIInitResult {
	k_ESteamAPIInitResult_OK = 0,
	k_ESteamAPIInitResult_FailedGeneric = 1,
	k_ESteamAPIInitResult_NoSteamClient = 2,
	k_ESteamAPIInitResult_VersionMismatch = 3,
};
enum EServerMode {
	eServerModeInvalid = 0,
	eServerModeNoAuthentication = 1,
	eServerModeAuthentication = 2,
	eServerModeAuthenticationAndSecure = 3,
};


struct SteamIPAddress_t;
struct FriendGameInfo_t;
struct MatchMakingKeyValuePair_t;
struct servernetadr_t;
struct gameserveritem_t;
struct SteamPartyBeaconLocation_t;
struct SteamParamStringArray_t;
struct LeaderboardEntry_t;
struct P2PSessionState_t;
struct InputAnalogActionData_t;
struct InputDigitalActionData_t;
struct InputMotionData_t;
struct SteamInputActionEvent_t;
struct SteamUGCDetails_t;
struct SteamItemDetails_t;
struct SteamNetworkingIPAddr;
struct SteamNetworkingIdentity;
struct SteamNetConnectionInfo_t;
struct SteamNetConnectionRealTimeStatus_t;
struct SteamNetConnectionRealTimeLaneStatus_t;
struct SteamNetworkingMessage_t;
struct SteamNetworkPingLocation_t;
struct SteamNetworkingConfigValue_t;
struct SteamDatagramHostedAddress;
struct SteamDatagramGameCoordinatorServerLogin;


typedef struct SteamIPAddress_t SteamIPAddress_t;
typedef struct FriendGameInfo_t FriendGameInfo_t;
typedef struct MatchMakingKeyValuePair_t MatchMakingKeyValuePair_t;
typedef struct servernetadr_t servernetadr_t;
typedef struct gameserveritem_t gameserveritem_t;
typedef struct SteamPartyBeaconLocation_t SteamPartyBeaconLocation_t;
typedef struct SteamParamStringArray_t SteamParamStringArray_t;
typedef struct LeaderboardEntry_t LeaderboardEntry_t;
typedef struct P2PSessionState_t P2PSessionState_t;
typedef struct InputAnalogActionData_t InputAnalogActionData_t;
typedef struct InputDigitalActionData_t InputDigitalActionData_t;
typedef struct InputMotionData_t InputMotionData_t;
typedef struct SteamInputActionEvent_t SteamInputActionEvent_t;
typedef struct SteamUGCDetails_t SteamUGCDetails_t;
typedef struct SteamItemDetails_t SteamItemDetails_t;
typedef struct SteamNetworkingIPAddr SteamNetworkingIPAddr;
typedef struct SteamNetworkingIdentity SteamNetworkingIdentity;
typedef struct SteamNetConnectionInfo_t SteamNetConnectionInfo_t;
typedef struct SteamNetConnectionRealTimeStatus_t SteamNetConnectionRealTimeStatus_t;
typedef struct SteamNetConnectionRealTimeLaneStatus_t SteamNetConnectionRealTimeLaneStatus_t;
typedef struct SteamNetworkingMessage_t SteamNetworkingMessage_t;
typedef struct SteamNetworkPingLocation_t SteamNetworkPingLocation_t;
typedef struct SteamNetworkingConfigValue_t SteamNetworkingConfigValue_t;
typedef struct SteamDatagramHostedAddress SteamDatagramHostedAddress;
typedef struct SteamDatagramGameCoordinatorServerLogin SteamDatagramGameCoordinatorServerLogin;


typedef struct SteamServersConnected_t SteamServersConnected_t;
typedef struct SteamServerConnectFailure_t SteamServerConnectFailure_t;
typedef struct SteamServersDisconnected_t SteamServersDisconnected_t;
typedef struct ClientGameServerDeny_t ClientGameServerDeny_t;
typedef struct IPCFailure_t IPCFailure_t;
typedef struct LicensesUpdated_t LicensesUpdated_t;
typedef struct ValidateAuthTicketResponse_t ValidateAuthTicketResponse_t;
typedef struct MicroTxnAuthorizationResponse_t MicroTxnAuthorizationResponse_t;
typedef struct EncryptedAppTicketResponse_t EncryptedAppTicketResponse_t;
typedef struct GetAuthSessionTicketResponse_t GetAuthSessionTicketResponse_t;
typedef struct GameWebCallback_t GameWebCallback_t;
typedef struct StoreAuthURLResponse_t StoreAuthURLResponse_t;
typedef struct MarketEligibilityResponse_t MarketEligibilityResponse_t;
typedef struct DurationControl_t DurationControl_t;
typedef struct GetTicketForWebApiResponse_t GetTicketForWebApiResponse_t;
typedef struct PersonaStateChange_t PersonaStateChange_t;
typedef struct GameOverlayActivated_t GameOverlayActivated_t;
typedef struct GameServerChangeRequested_t GameServerChangeRequested_t;
typedef struct GameLobbyJoinRequested_t GameLobbyJoinRequested_t;
typedef struct AvatarImageLoaded_t AvatarImageLoaded_t;
typedef struct ClanOfficerListResponse_t ClanOfficerListResponse_t;
typedef struct FriendRichPresenceUpdate_t FriendRichPresenceUpdate_t;
typedef struct GameRichPresenceJoinRequested_t GameRichPresenceJoinRequested_t;
typedef struct GameConnectedClanChatMsg_t GameConnectedClanChatMsg_t;
typedef struct GameConnectedChatJoin_t GameConnectedChatJoin_t;
typedef struct GameConnectedChatLeave_t GameConnectedChatLeave_t;
typedef struct DownloadClanActivityCountsResult_t DownloadClanActivityCountsResult_t;
typedef struct JoinClanChatRoomCompletionResult_t JoinClanChatRoomCompletionResult_t;
typedef struct GameConnectedFriendChatMsg_t GameConnectedFriendChatMsg_t;
typedef struct FriendsGetFollowerCount_t FriendsGetFollowerCount_t;
typedef struct FriendsIsFollowing_t FriendsIsFollowing_t;
typedef struct FriendsEnumerateFollowingList_t FriendsEnumerateFollowingList_t;
typedef struct SetPersonaNameResponse_t SetPersonaNameResponse_t;
typedef struct UnreadChatMessagesChanged_t UnreadChatMessagesChanged_t;
typedef struct OverlayBrowserProtocolNavigation_t OverlayBrowserProtocolNavigation_t;
typedef struct EquippedProfileItemsChanged_t EquippedProfileItemsChanged_t;
typedef struct EquippedProfileItems_t EquippedProfileItems_t;
typedef struct IPCountry_t IPCountry_t;
typedef struct LowBatteryPower_t LowBatteryPower_t;
typedef struct SteamAPICallCompleted_t SteamAPICallCompleted_t;
typedef struct SteamShutdown_t SteamShutdown_t;
typedef struct CheckFileSignature_t CheckFileSignature_t;
typedef struct GamepadTextInputDismissed_t GamepadTextInputDismissed_t;
typedef struct AppResumingFromSuspend_t AppResumingFromSuspend_t;
typedef struct FloatingGamepadTextInputDismissed_t FloatingGamepadTextInputDismissed_t;
typedef struct FilterTextDictionaryChanged_t FilterTextDictionaryChanged_t;
typedef struct FavoritesListChanged_t FavoritesListChanged_t;
typedef struct LobbyInvite_t LobbyInvite_t;
typedef struct LobbyEnter_t LobbyEnter_t;
typedef struct LobbyDataUpdate_t LobbyDataUpdate_t;
typedef struct LobbyChatUpdate_t LobbyChatUpdate_t;
typedef struct LobbyChatMsg_t LobbyChatMsg_t;
typedef struct LobbyGameCreated_t LobbyGameCreated_t;
typedef struct LobbyMatchList_t LobbyMatchList_t;
typedef struct LobbyKicked_t LobbyKicked_t;
typedef struct LobbyCreated_t LobbyCreated_t;
typedef struct PSNGameBootInviteResult_t PSNGameBootInviteResult_t;
typedef struct FavoritesListAccountsUpdated_t FavoritesListAccountsUpdated_t;
typedef struct SearchForGameProgressCallback_t SearchForGameProgressCallback_t;
typedef struct SearchForGameResultCallback_t SearchForGameResultCallback_t;
typedef struct RequestPlayersForGameProgressCallback_t RequestPlayersForGameProgressCallback_t;
typedef struct RequestPlayersForGameResultCallback_t RequestPlayersForGameResultCallback_t;
typedef struct RequestPlayersForGameFinalResultCallback_t RequestPlayersForGameFinalResultCallback_t;
typedef struct SubmitPlayerResultResultCallback_t SubmitPlayerResultResultCallback_t;
typedef struct EndGameResultCallback_t EndGameResultCallback_t;
typedef struct JoinPartyCallback_t JoinPartyCallback_t;
typedef struct CreateBeaconCallback_t CreateBeaconCallback_t;
typedef struct ReservationNotificationCallback_t ReservationNotificationCallback_t;
typedef struct ChangeNumOpenSlotsCallback_t ChangeNumOpenSlotsCallback_t;
typedef struct AvailableBeaconLocationsUpdated_t AvailableBeaconLocationsUpdated_t;
typedef struct ActiveBeaconsUpdated_t ActiveBeaconsUpdated_t;
typedef struct RemoteStorageFileShareResult_t RemoteStorageFileShareResult_t;
typedef struct RemoteStoragePublishFileResult_t RemoteStoragePublishFileResult_t;
typedef struct RemoteStorageDeletePublishedFileResult_t RemoteStorageDeletePublishedFileResult_t;
typedef struct RemoteStorageEnumerateUserPublishedFilesResult_t RemoteStorageEnumerateUserPublishedFilesResult_t;
typedef struct RemoteStorageSubscribePublishedFileResult_t RemoteStorageSubscribePublishedFileResult_t;
typedef struct RemoteStorageEnumerateUserSubscribedFilesResult_t RemoteStorageEnumerateUserSubscribedFilesResult_t;
typedef struct RemoteStorageUnsubscribePublishedFileResult_t RemoteStorageUnsubscribePublishedFileResult_t;
typedef struct RemoteStorageUpdatePublishedFileResult_t RemoteStorageUpdatePublishedFileResult_t;
typedef struct RemoteStorageDownloadUGCResult_t RemoteStorageDownloadUGCResult_t;
typedef struct RemoteStorageGetPublishedFileDetailsResult_t RemoteStorageGetPublishedFileDetailsResult_t;
typedef struct RemoteStorageEnumerateWorkshopFilesResult_t RemoteStorageEnumerateWorkshopFilesResult_t;
typedef struct RemoteStorageGetPublishedItemVoteDetailsResult_t RemoteStorageGetPublishedItemVoteDetailsResult_t;
typedef struct RemoteStoragePublishedFileSubscribed_t RemoteStoragePublishedFileSubscribed_t;
typedef struct RemoteStoragePublishedFileUnsubscribed_t RemoteStoragePublishedFileUnsubscribed_t;
typedef struct RemoteStoragePublishedFileDeleted_t RemoteStoragePublishedFileDeleted_t;
typedef struct RemoteStorageUpdateUserPublishedItemVoteResult_t RemoteStorageUpdateUserPublishedItemVoteResult_t;
typedef struct RemoteStorageUserVoteDetails_t RemoteStorageUserVoteDetails_t;
typedef struct RemoteStorageEnumerateUserSharedWorkshopFilesResult_t RemoteStorageEnumerateUserSharedWorkshopFilesResult_t;
typedef struct RemoteStorageSetUserPublishedFileActionResult_t RemoteStorageSetUserPublishedFileActionResult_t;
typedef struct RemoteStorageEnumeratePublishedFilesByUserActionResult_t RemoteStorageEnumeratePublishedFilesByUserActionResult_t;
typedef struct RemoteStoragePublishFileProgress_t RemoteStoragePublishFileProgress_t;
typedef struct RemoteStoragePublishedFileUpdated_t RemoteStoragePublishedFileUpdated_t;
typedef struct RemoteStorageFileWriteAsyncComplete_t RemoteStorageFileWriteAsyncComplete_t;
typedef struct RemoteStorageFileReadAsyncComplete_t RemoteStorageFileReadAsyncComplete_t;
typedef struct RemoteStorageLocalFileChange_t RemoteStorageLocalFileChange_t;
typedef struct UserStatsReceived_t UserStatsReceived_t;
typedef struct UserStatsStored_t UserStatsStored_t;
typedef struct UserAchievementStored_t UserAchievementStored_t;
typedef struct LeaderboardFindResult_t LeaderboardFindResult_t;
typedef struct LeaderboardScoresDownloaded_t LeaderboardScoresDownloaded_t;
typedef struct LeaderboardScoreUploaded_t LeaderboardScoreUploaded_t;
typedef struct NumberOfCurrentPlayers_t NumberOfCurrentPlayers_t;
typedef struct UserStatsUnloaded_t UserStatsUnloaded_t;
typedef struct UserAchievementIconFetched_t UserAchievementIconFetched_t;
typedef struct GlobalAchievementPercentagesReady_t GlobalAchievementPercentagesReady_t;
typedef struct LeaderboardUGCSet_t LeaderboardUGCSet_t;
typedef struct PS3TrophiesInstalled_t PS3TrophiesInstalled_t;
typedef struct GlobalStatsReceived_t GlobalStatsReceived_t;
typedef struct DlcInstalled_t DlcInstalled_t;
typedef struct NewUrlLaunchParameters_t NewUrlLaunchParameters_t;
typedef struct AppProofOfPurchaseKeyResponse_t AppProofOfPurchaseKeyResponse_t;
typedef struct FileDetailsResult_t FileDetailsResult_t;
typedef struct TimedTrialStatus_t TimedTrialStatus_t;
typedef struct P2PSessionRequest_t P2PSessionRequest_t;
typedef struct P2PSessionConnectFail_t P2PSessionConnectFail_t;
typedef struct SocketStatusCallback_t SocketStatusCallback_t;
typedef struct ScreenshotReady_t ScreenshotReady_t;
typedef struct ScreenshotRequested_t ScreenshotRequested_t;
typedef struct PlaybackStatusHasChanged_t PlaybackStatusHasChanged_t;
typedef struct VolumeHasChanged_t VolumeHasChanged_t;
typedef struct MusicPlayerRemoteWillActivate_t MusicPlayerRemoteWillActivate_t;
typedef struct MusicPlayerRemoteWillDeactivate_t MusicPlayerRemoteWillDeactivate_t;
typedef struct MusicPlayerRemoteToFront_t MusicPlayerRemoteToFront_t;
typedef struct MusicPlayerWillQuit_t MusicPlayerWillQuit_t;
typedef struct MusicPlayerWantsPlay_t MusicPlayerWantsPlay_t;
typedef struct MusicPlayerWantsPause_t MusicPlayerWantsPause_t;
typedef struct MusicPlayerWantsPlayPrevious_t MusicPlayerWantsPlayPrevious_t;
typedef struct MusicPlayerWantsPlayNext_t MusicPlayerWantsPlayNext_t;
typedef struct MusicPlayerWantsShuffled_t MusicPlayerWantsShuffled_t;
typedef struct MusicPlayerWantsLooped_t MusicPlayerWantsLooped_t;
typedef struct MusicPlayerWantsVolume_t MusicPlayerWantsVolume_t;
typedef struct MusicPlayerSelectsQueueEntry_t MusicPlayerSelectsQueueEntry_t;
typedef struct MusicPlayerSelectsPlaylistEntry_t MusicPlayerSelectsPlaylistEntry_t;
typedef struct MusicPlayerWantsPlayingRepeatStatus_t MusicPlayerWantsPlayingRepeatStatus_t;
typedef struct HTTPRequestCompleted_t HTTPRequestCompleted_t;
typedef struct HTTPRequestHeadersReceived_t HTTPRequestHeadersReceived_t;
typedef struct HTTPRequestDataReceived_t HTTPRequestDataReceived_t;
typedef struct SteamInputDeviceConnected_t SteamInputDeviceConnected_t;
typedef struct SteamInputDeviceDisconnected_t SteamInputDeviceDisconnected_t;
typedef struct SteamInputConfigurationLoaded_t SteamInputConfigurationLoaded_t;
typedef struct SteamInputGamepadSlotChange_t SteamInputGamepadSlotChange_t;
typedef struct SteamUGCQueryCompleted_t SteamUGCQueryCompleted_t;
typedef struct SteamUGCRequestUGCDetailsResult_t SteamUGCRequestUGCDetailsResult_t;
typedef struct CreateItemResult_t CreateItemResult_t;
typedef struct SubmitItemUpdateResult_t SubmitItemUpdateResult_t;
typedef struct ItemInstalled_t ItemInstalled_t;
typedef struct DownloadItemResult_t DownloadItemResult_t;
typedef struct UserFavoriteItemsListChanged_t UserFavoriteItemsListChanged_t;
typedef struct SetUserItemVoteResult_t SetUserItemVoteResult_t;
typedef struct GetUserItemVoteResult_t GetUserItemVoteResult_t;
typedef struct StartPlaytimeTrackingResult_t StartPlaytimeTrackingResult_t;
typedef struct StopPlaytimeTrackingResult_t StopPlaytimeTrackingResult_t;
typedef struct AddUGCDependencyResult_t AddUGCDependencyResult_t;
typedef struct RemoveUGCDependencyResult_t RemoveUGCDependencyResult_t;
typedef struct AddAppDependencyResult_t AddAppDependencyResult_t;
typedef struct RemoveAppDependencyResult_t RemoveAppDependencyResult_t;
typedef struct GetAppDependenciesResult_t GetAppDependenciesResult_t;
typedef struct DeleteItemResult_t DeleteItemResult_t;
typedef struct UserSubscribedItemsListChanged_t UserSubscribedItemsListChanged_t;
typedef struct WorkshopEULAStatus_t WorkshopEULAStatus_t;
typedef struct HTML_BrowserReady_t HTML_BrowserReady_t;
typedef struct HTML_NeedsPaint_t HTML_NeedsPaint_t;
typedef struct HTML_StartRequest_t HTML_StartRequest_t;
typedef struct HTML_CloseBrowser_t HTML_CloseBrowser_t;
typedef struct HTML_URLChanged_t HTML_URLChanged_t;
typedef struct HTML_FinishedRequest_t HTML_FinishedRequest_t;
typedef struct HTML_OpenLinkInNewTab_t HTML_OpenLinkInNewTab_t;
typedef struct HTML_ChangedTitle_t HTML_ChangedTitle_t;
typedef struct HTML_SearchResults_t HTML_SearchResults_t;
typedef struct HTML_CanGoBackAndForward_t HTML_CanGoBackAndForward_t;
typedef struct HTML_HorizontalScroll_t HTML_HorizontalScroll_t;
typedef struct HTML_VerticalScroll_t HTML_VerticalScroll_t;
typedef struct HTML_LinkAtPosition_t HTML_LinkAtPosition_t;
typedef struct HTML_JSAlert_t HTML_JSAlert_t;
typedef struct HTML_JSConfirm_t HTML_JSConfirm_t;
typedef struct HTML_FileOpenDialog_t HTML_FileOpenDialog_t;
typedef struct HTML_NewWindow_t HTML_NewWindow_t;
typedef struct HTML_SetCursor_t HTML_SetCursor_t;
typedef struct HTML_StatusText_t HTML_StatusText_t;
typedef struct HTML_ShowToolTip_t HTML_ShowToolTip_t;
typedef struct HTML_UpdateToolTip_t HTML_UpdateToolTip_t;
typedef struct HTML_HideToolTip_t HTML_HideToolTip_t;
typedef struct HTML_BrowserRestarted_t HTML_BrowserRestarted_t;
typedef struct SteamInventoryResultReady_t SteamInventoryResultReady_t;
typedef struct SteamInventoryFullUpdate_t SteamInventoryFullUpdate_t;
typedef struct SteamInventoryDefinitionUpdate_t SteamInventoryDefinitionUpdate_t;
typedef struct SteamInventoryEligiblePromoItemDefIDs_t SteamInventoryEligiblePromoItemDefIDs_t;
typedef struct SteamInventoryStartPurchaseResult_t SteamInventoryStartPurchaseResult_t;
typedef struct SteamInventoryRequestPricesResult_t SteamInventoryRequestPricesResult_t;
typedef struct GetVideoURLResult_t GetVideoURLResult_t;
typedef struct GetOPFSettingsResult_t GetOPFSettingsResult_t;
typedef struct SteamParentalSettingsChanged_t SteamParentalSettingsChanged_t;
typedef struct SteamRemotePlaySessionConnected_t SteamRemotePlaySessionConnected_t;
typedef struct SteamRemotePlaySessionDisconnected_t SteamRemotePlaySessionDisconnected_t;
typedef struct SteamRemotePlayTogetherGuestInvite_t SteamRemotePlayTogetherGuestInvite_t;
typedef struct SteamNetworkingMessagesSessionRequest_t SteamNetworkingMessagesSessionRequest_t;
typedef struct SteamNetworkingMessagesSessionFailed_t SteamNetworkingMessagesSessionFailed_t;
typedef struct SteamNetConnectionStatusChangedCallback_t SteamNetConnectionStatusChangedCallback_t;
typedef struct SteamNetAuthenticationStatus_t SteamNetAuthenticationStatus_t;
typedef struct SteamRelayNetworkStatus_t SteamRelayNetworkStatus_t;
typedef struct GSClientApprove_t GSClientApprove_t;
typedef struct GSClientDeny_t GSClientDeny_t;
typedef struct GSClientKick_t GSClientKick_t;
typedef struct GSClientAchievementStatus_t GSClientAchievementStatus_t;
typedef struct GSPolicyResponse_t GSPolicyResponse_t;
typedef struct GSGameplayStats_t GSGameplayStats_t;
typedef struct GSClientGroupStatus_t GSClientGroupStatus_t;
typedef struct GSReputation_t GSReputation_t;
typedef struct AssociateWithClanResult_t AssociateWithClanResult_t;
typedef struct ComputeNewPlayerCompatibilityResult_t ComputeNewPlayerCompatibilityResult_t;
typedef struct GSStatsReceived_t GSStatsReceived_t;
typedef struct GSStatsStored_t GSStatsStored_t;
typedef struct GSStatsUnloaded_t GSStatsUnloaded_t;
typedef struct SteamNetworkingFakeIPResult_t SteamNetworkingFakeIPResult_t;


typedef unsigned char uint8;
typedef signed char int8;
typedef short int16;
typedef unsigned short uint16;
typedef int int32;
typedef unsigned int uint32;
typedef long long int64;
typedef unsigned long long uint64;
typedef long long lint64;
typedef unsigned long long ulint64;
typedef long long intp;
typedef unsigned long long uintp;
typedef unsigned int AppId_t;
typedef unsigned int DepotId_t;
typedef unsigned int RTime32;
typedef unsigned long long SteamAPICall_t;
typedef unsigned int AccountID_t;
typedef unsigned long long PartyBeaconID_t;
typedef unsigned int HAuthTicket;
typedef (*PFNPreMinidumpCallback) (void *);
typedef int HSteamPipe;
typedef int HSteamUser;
typedef char SteamErrMsg[1024];
typedef short FriendsGroupID_t;
typedef void * HServerListRequest;
typedef int HServerQuery;
typedef unsigned long long UGCHandle_t;
typedef unsigned long long PublishedFileUpdateHandle_t;
typedef unsigned long long PublishedFileId_t;
typedef unsigned long long UGCFileWriteStreamHandle_t;
typedef unsigned long long SteamLeaderboard_t;
typedef unsigned long long SteamLeaderboardEntries_t;
typedef unsigned int SNetSocket_t;
typedef unsigned int SNetListenSocket_t;
typedef unsigned int ScreenshotHandle;
typedef unsigned int HTTPRequestHandle;
typedef unsigned int HTTPCookieContainerHandle;
typedef unsigned long long InputHandle_t;
typedef unsigned long long InputActionSetHandle_t;
typedef unsigned long long InputDigitalActionHandle_t;
typedef unsigned long long InputAnalogActionHandle_t;
typedef (*SteamInputActionEventCallbackPointer) (SteamInputActionEvent_t *);
typedef unsigned long long ControllerHandle_t;
typedef unsigned long long ControllerActionSetHandle_t;
typedef unsigned long long ControllerDigitalActionHandle_t;
typedef unsigned long long ControllerAnalogActionHandle_t;
typedef unsigned long long UGCQueryHandle_t;
typedef unsigned long long UGCUpdateHandle_t;
typedef unsigned int HHTMLBrowser;
typedef unsigned long long SteamItemInstanceID_t;
typedef int SteamItemDef_t;
typedef int SteamInventoryResult_t;
typedef unsigned long long SteamInventoryUpdateHandle_t;
typedef unsigned int RemotePlaySessionID_t;
typedef (*FnSteamNetConnectionStatusChanged) (SteamNetConnectionStatusChangedCallback_t *);
typedef (*FnSteamNetAuthenticationStatusChanged) (SteamNetAuthenticationStatus_t *);
typedef (*FnSteamRelayNetworkStatusChanged) (SteamRelayNetworkStatus_t *);
typedef (*FnSteamNetworkingMessagesSessionRequest) (SteamNetworkingMessagesSessionRequest_t *);
typedef (*FnSteamNetworkingMessagesSessionFailed) (SteamNetworkingMessagesSessionFailed_t *);
typedef (*FnSteamNetworkingFakeIPResult) (SteamNetworkingFakeIPResult_t *);
typedef unsigned int HSteamNetConnection;
typedef unsigned int HSteamListenSocket;
typedef unsigned int HSteamNetPollGroup;
typedef char SteamNetworkingErrMsg[1024];
typedef unsigned int SteamNetworkingPOPID;
typedef long long SteamNetworkingMicroseconds;
typedef (*FSteamNetworkingSocketsDebugOutput) (ESteamNetworkingSocketsDebugOutputType, const char *);


typedef enum EFailureType EFailureType;


enum EFailureType {
	k_EFailureFlushedCallbackQueue = 0,
	k_EFailurePipeFail = 1,
};


typedef enum PlayerAcceptState_t PlayerAcceptState_t;


enum PlayerAcceptState_t {
	k_EStateUnknown = 0,
	k_EStatePlayerAccepted = 1,
	k_EStatePlayerDeclined = 2,
};


struct SteamIPAddress_t {
	uint8 m_rgubIPv6[16];
	ESteamIPType m_eType;
};
struct FriendGameInfo_t {
	CGameID m_gameID;
	uint32 m_unGameIP;
	uint16 m_usGamePort;
	uint16 m_usQueryPort;
	CSteamID m_steamIDLobby;
};
struct MatchMakingKeyValuePair_t {
	char m_szKey[256];
	char m_szValue[256];
};
struct servernetadr_t {
	uint16 m_usConnectionPort;
	uint16 m_usQueryPort;
	uint32 m_unIP;
};
struct gameserveritem_t {
	servernetadr_t m_NetAdr;
	int m_nPing;
	bool m_bHadSuccessfulResponse;
	bool m_bDoNotRefresh;
	char m_szGameDir[32];
	char m_szMap[32];
	char m_szGameDescription[64];
	uint32 m_nAppID;
	int m_nPlayers;
	int m_nMaxPlayers;
	int m_nBotPlayers;
	bool m_bPassword;
	bool m_bSecure;
	uint32 m_ulTimeLastPlayed;
	int m_nServerVersion;
	char m_szServerName[64];
	char m_szGameTags[128];
	CSteamID m_steamID;
};
struct SteamPartyBeaconLocation_t {
	ESteamPartyBeaconLocationType m_eType;
	uint64 m_ulLocationID;
};
struct SteamParamStringArray_t {
	const char ** m_ppStrings;
	int32 m_nNumStrings;
};
struct LeaderboardEntry_t {
	CSteamID m_steamIDUser;
	int32 m_nGlobalRank;
	int32 m_nScore;
	int32 m_cDetails;
	UGCHandle_t m_hUGC;
};
struct P2PSessionState_t {
	uint8 m_bConnectionActive;
	uint8 m_bConnecting;
	uint8 m_eP2PSessionError;
	uint8 m_bUsingRelay;
	int32 m_nBytesQueuedForSend;
	int32 m_nPacketsQueuedForSend;
	uint32 m_nRemoteIP;
	uint16 m_nRemotePort;
};
struct InputAnalogActionData_t {
	EInputSourceMode eMode;
	float x;
	float y;
	bool bActive;
};
struct InputDigitalActionData_t {
	bool bState;
	bool bActive;
};
struct InputMotionData_t {
	float rotQuatX;
	float rotQuatY;
	float rotQuatZ;
	float rotQuatW;
	float posAccelX;
	float posAccelY;
	float posAccelZ;
	float rotVelX;
	float rotVelY;
	float rotVelZ;
};
struct SteamInputActionEvent_t {
	InputHandle_t controllerHandle;
	ESteamInputActionEventType eEventType;
//	AnalogAction_t analogAction;
};
struct SteamUGCDetails_t {
	PublishedFileId_t m_nPublishedFileId;
	EResult m_eResult;
	EWorkshopFileType m_eFileType;
	AppId_t m_nCreatorAppID;
	AppId_t m_nConsumerAppID;
	char m_rgchTitle[129];
	char m_rgchDescription[8000];
	uint64 m_ulSteamIDOwner;
	uint32 m_rtimeCreated;
	uint32 m_rtimeUpdated;
	uint32 m_rtimeAddedToUserList;
	ERemoteStoragePublishedFileVisibility m_eVisibility;
	bool m_bBanned;
	bool m_bAcceptedForUse;
	bool m_bTagsTruncated;
	char m_rgchTags[1025];
	UGCHandle_t m_hFile;
	UGCHandle_t m_hPreviewFile;
	char m_pchFileName[260];
	int32 m_nFileSize;
	int32 m_nPreviewFileSize;
	char m_rgchURL[256];
	uint32 m_unVotesUp;
	uint32 m_unVotesDown;
	float m_flScore;
	uint32 m_unNumChildren;
};
struct SteamItemDetails_t {
	SteamItemInstanceID_t m_itemId;
	SteamItemDef_t m_iDefinition;
	uint16 m_unQuantity;
	uint16 m_unFlags;
};
struct SteamNetworkingIPAddr {
	uint8 m_ipv6[16];
	uint16 m_port;
};
struct SteamNetworkingIdentity {
	ESteamNetworkingIdentityType m_eType;
	int m_cbSize;
	char m_szUnknownRawString[128];
};
struct SteamNetConnectionInfo_t {
	SteamNetworkingIdentity m_identityRemote;
	int64 m_nUserData;
	HSteamListenSocket m_hListenSocket;
	SteamNetworkingIPAddr m_addrRemote;
	uint16 m__pad1;
	SteamNetworkingPOPID m_idPOPRemote;
	SteamNetworkingPOPID m_idPOPRelay;
	ESteamNetworkingConnectionState m_eState;
	int m_eEndReason;
	char m_szEndDebug[128];
	char m_szConnectionDescription[128];
	int m_nFlags;
	uint32 reserved[63];
};
struct SteamNetConnectionRealTimeStatus_t {
	ESteamNetworkingConnectionState m_eState;
	int m_nPing;
	float m_flConnectionQualityLocal;
	float m_flConnectionQualityRemote;
	float m_flOutPacketsPerSec;
	float m_flOutBytesPerSec;
	float m_flInPacketsPerSec;
	float m_flInBytesPerSec;
	int m_nSendRateBytesPerSecond;
	int m_cbPendingUnreliable;
	int m_cbPendingReliable;
	int m_cbSentUnackedReliable;
	SteamNetworkingMicroseconds m_usecQueueTime;
	uint32 reserved[16];
};
struct SteamNetConnectionRealTimeLaneStatus_t {
	int m_cbPendingUnreliable;
	int m_cbPendingReliable;
	int m_cbSentUnackedReliable;
	int _reservePad1;
	SteamNetworkingMicroseconds m_usecQueueTime;
	uint32 reserved[10];
};
struct SteamNetworkingMessage_t {
	void * m_pData;
	int m_cbSize;
	HSteamNetConnection m_conn;
	SteamNetworkingIdentity m_identityPeer;
	int64 m_nConnUserData;
	SteamNetworkingMicroseconds m_usecTimeReceived;
	int64 m_nMessageNumber;
	void (*m_pfnFreeData) (SteamNetworkingMessage_t *);
	void (*m_pfnRelease) (SteamNetworkingMessage_t *);
	int m_nChannel;
	int m_nFlags;
	int64 m_nUserData;
	uint16 m_idxLane;
	uint16 _pad1__;
};
struct SteamNetworkPingLocation_t {
	uint8 m_data[512];
};
struct SteamNetworkingConfigValue_t {
	ESteamNetworkingConfigValue m_eValue;
	ESteamNetworkingConfigDataType m_eDataType;
	int64_t m_int64;
};
struct SteamDatagramHostedAddress {
	int m_cbSize;
	char m_data[128];
};
struct SteamDatagramGameCoordinatorServerLogin {
	SteamNetworkingIdentity m_identity;
	SteamDatagramHostedAddress m_routing;
	AppId_t m_nAppID;
	RTime32 m_rtime;
	int m_cbAppData;
	char m_appData[2048];
};


struct SteamServersConnected_t {
};
struct SteamServerConnectFailure_t {
	EResult m_eResult;
	bool m_bStillRetrying;
};
struct SteamServersDisconnected_t {
	EResult m_eResult;
};
struct ClientGameServerDeny_t {
	uint32 m_uAppID;
	uint32 m_unGameServerIP;
	uint16 m_usGameServerPort;
	uint16 m_bSecure;
	uint32 m_uReason;
};
struct IPCFailure_t {
	uint8 m_eFailureType;
};
struct LicensesUpdated_t {
};
struct ValidateAuthTicketResponse_t {
	CSteamID m_SteamID;
	EAuthSessionResponse m_eAuthSessionResponse;
	CSteamID m_OwnerSteamID;
};
struct MicroTxnAuthorizationResponse_t {
	uint32 m_unAppID;
	uint64 m_ulOrderID;
	uint8 m_bAuthorized;
};
struct EncryptedAppTicketResponse_t {
	EResult m_eResult;
};
struct GetAuthSessionTicketResponse_t {
	HAuthTicket m_hAuthTicket;
	EResult m_eResult;
};
struct GameWebCallback_t {
	char m_szURL[256];
};
struct StoreAuthURLResponse_t {
	char m_szURL[512];
};
struct MarketEligibilityResponse_t {
	bool m_bAllowed;
	EMarketNotAllowedReasonFlags m_eNotAllowedReason;
	RTime32 m_rtAllowedAtTime;
	int m_cdaySteamGuardRequiredDays;
	int m_cdayNewDeviceCooldown;
};
struct DurationControl_t {
	EResult m_eResult;
	AppId_t m_appid;
	bool m_bApplicable;
	int32 m_csecsLast5h;
	EDurationControlProgress m_progress;
	EDurationControlNotification m_notification;
	int32 m_csecsToday;
	int32 m_csecsRemaining;
};
struct GetTicketForWebApiResponse_t {
	HAuthTicket m_hAuthTicket;
	EResult m_eResult;
	int m_cubTicket;
	uint8 m_rgubTicket[2560];
};
struct PersonaStateChange_t {
	uint64 m_ulSteamID;
	int m_nChangeFlags;
};
struct GameOverlayActivated_t {
	uint8 m_bActive;
	bool m_bUserInitiated;
	AppId_t m_nAppID;
	uint32 m_dwOverlayPID;
};
struct GameServerChangeRequested_t {
	char m_rgchServer[64];
	char m_rgchPassword[64];
};
struct GameLobbyJoinRequested_t {
	CSteamID m_steamIDLobby;
	CSteamID m_steamIDFriend;
};
struct AvatarImageLoaded_t {
	CSteamID m_steamID;
	int m_iImage;
	int m_iWide;
	int m_iTall;
};
struct ClanOfficerListResponse_t {
	CSteamID m_steamIDClan;
	int m_cOfficers;
	uint8 m_bSuccess;
};
struct FriendRichPresenceUpdate_t {
	CSteamID m_steamIDFriend;
	AppId_t m_nAppID;
};
struct GameRichPresenceJoinRequested_t {
	CSteamID m_steamIDFriend;
	char m_rgchConnect[256];
};
struct GameConnectedClanChatMsg_t {
	CSteamID m_steamIDClanChat;
	CSteamID m_steamIDUser;
	int m_iMessageID;
};
struct GameConnectedChatJoin_t {
	CSteamID m_steamIDClanChat;
	CSteamID m_steamIDUser;
};
struct GameConnectedChatLeave_t {
	CSteamID m_steamIDClanChat;
	CSteamID m_steamIDUser;
	bool m_bKicked;
	bool m_bDropped;
};
struct DownloadClanActivityCountsResult_t {
	bool m_bSuccess;
};
struct JoinClanChatRoomCompletionResult_t {
	CSteamID m_steamIDClanChat;
	EChatRoomEnterResponse m_eChatRoomEnterResponse;
};
struct GameConnectedFriendChatMsg_t {
	CSteamID m_steamIDUser;
	int m_iMessageID;
};
struct FriendsGetFollowerCount_t {
	EResult m_eResult;
	CSteamID m_steamID;
	int m_nCount;
};
struct FriendsIsFollowing_t {
	EResult m_eResult;
	CSteamID m_steamID;
	bool m_bIsFollowing;
};
struct FriendsEnumerateFollowingList_t {
	EResult m_eResult;
	CSteamID m_rgSteamID[50];
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
};
struct SetPersonaNameResponse_t {
	bool m_bSuccess;
	bool m_bLocalSuccess;
	EResult m_result;
};
struct UnreadChatMessagesChanged_t {
};
struct OverlayBrowserProtocolNavigation_t {
	char rgchURI[1024];
};
struct EquippedProfileItemsChanged_t {
	CSteamID m_steamID;
};
struct EquippedProfileItems_t {
	EResult m_eResult;
	CSteamID m_steamID;
	bool m_bHasAnimatedAvatar;
	bool m_bHasAvatarFrame;
	bool m_bHasProfileModifier;
	bool m_bHasProfileBackground;
	bool m_bHasMiniProfileBackground;
};
struct IPCountry_t {
};
struct LowBatteryPower_t {
	uint8 m_nMinutesBatteryLeft;
};
struct SteamAPICallCompleted_t {
	SteamAPICall_t m_hAsyncCall;
	int m_iCallback;
	uint32 m_cubParam;
};
struct SteamShutdown_t {
};
struct CheckFileSignature_t {
	ECheckFileSignature m_eCheckFileSignature;
};
struct GamepadTextInputDismissed_t {
	bool m_bSubmitted;
	uint32 m_unSubmittedText;
	AppId_t m_unAppID;
};
struct AppResumingFromSuspend_t {
};
struct FloatingGamepadTextInputDismissed_t {
};
struct FilterTextDictionaryChanged_t {
	int m_eLanguage;
};
struct FavoritesListChanged_t {
	uint32 m_nIP;
	uint32 m_nQueryPort;
	uint32 m_nConnPort;
	uint32 m_nAppID;
	uint32 m_nFlags;
	bool m_bAdd;
	AccountID_t m_unAccountId;
};
struct LobbyInvite_t {
	uint64 m_ulSteamIDUser;
	uint64 m_ulSteamIDLobby;
	uint64 m_ulGameID;
};
struct LobbyEnter_t {
	uint64 m_ulSteamIDLobby;
	uint32 m_rgfChatPermissions;
	bool m_bLocked;
	uint32 m_EChatRoomEnterResponse;
};
struct LobbyDataUpdate_t {
	uint64 m_ulSteamIDLobby;
	uint64 m_ulSteamIDMember;
	uint8 m_bSuccess;
};
struct LobbyChatUpdate_t {
	uint64 m_ulSteamIDLobby;
	uint64 m_ulSteamIDUserChanged;
	uint64 m_ulSteamIDMakingChange;
	uint32 m_rgfChatMemberStateChange;
};
struct LobbyChatMsg_t {
	uint64 m_ulSteamIDLobby;
	uint64 m_ulSteamIDUser;
	uint8 m_eChatEntryType;
	uint32 m_iChatID;
};
struct LobbyGameCreated_t {
	uint64 m_ulSteamIDLobby;
	uint64 m_ulSteamIDGameServer;
	uint32 m_unIP;
	uint16 m_usPort;
};
struct LobbyMatchList_t {
	uint32 m_nLobbiesMatching;
};
struct LobbyKicked_t {
	uint64 m_ulSteamIDLobby;
	uint64 m_ulSteamIDAdmin;
	uint8 m_bKickedDueToDisconnect;
};
struct LobbyCreated_t {
	EResult m_eResult;
	uint64 m_ulSteamIDLobby;
};
struct PSNGameBootInviteResult_t {
	bool m_bGameBootInviteExists;
	CSteamID m_steamIDLobby;
};
struct FavoritesListAccountsUpdated_t {
	EResult m_eResult;
};
struct SearchForGameProgressCallback_t {
	uint64 m_ullSearchID;
	EResult m_eResult;
	CSteamID m_lobbyID;
	CSteamID m_steamIDEndedSearch;
	int32 m_nSecondsRemainingEstimate;
	int32 m_cPlayersSearching;
};
struct SearchForGameResultCallback_t {
	uint64 m_ullSearchID;
	EResult m_eResult;
	int32 m_nCountPlayersInGame;
	int32 m_nCountAcceptedGame;
	CSteamID m_steamIDHost;
	bool m_bFinalCallback;
};
struct RequestPlayersForGameProgressCallback_t {
	EResult m_eResult;
	uint64 m_ullSearchID;
};
struct RequestPlayersForGameResultCallback_t {
	EResult m_eResult;
	uint64 m_ullSearchID;
	CSteamID m_SteamIDPlayerFound;
	CSteamID m_SteamIDLobby;
	PlayerAcceptState_t m_ePlayerAcceptState;
	int32 m_nPlayerIndex;
	int32 m_nTotalPlayersFound;
	int32 m_nTotalPlayersAcceptedGame;
	int32 m_nSuggestedTeamIndex;
	uint64 m_ullUniqueGameID;
};
struct RequestPlayersForGameFinalResultCallback_t {
	EResult m_eResult;
	uint64 m_ullSearchID;
	uint64 m_ullUniqueGameID;
};
struct SubmitPlayerResultResultCallback_t {
	EResult m_eResult;
	uint64 ullUniqueGameID;
	CSteamID steamIDPlayer;
};
struct EndGameResultCallback_t {
	EResult m_eResult;
	uint64 ullUniqueGameID;
};
struct JoinPartyCallback_t {
	EResult m_eResult;
	PartyBeaconID_t m_ulBeaconID;
	CSteamID m_SteamIDBeaconOwner;
	char m_rgchConnectString[256];
};
struct CreateBeaconCallback_t {
	EResult m_eResult;
	PartyBeaconID_t m_ulBeaconID;
};
struct ReservationNotificationCallback_t {
	PartyBeaconID_t m_ulBeaconID;
	CSteamID m_steamIDJoiner;
};
struct ChangeNumOpenSlotsCallback_t {
	EResult m_eResult;
};
struct AvailableBeaconLocationsUpdated_t {
};
struct ActiveBeaconsUpdated_t {
};
struct RemoteStorageFileShareResult_t {
	EResult m_eResult;
	UGCHandle_t m_hFile;
	char m_rgchFilename[260];
};
struct RemoteStoragePublishFileResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	bool m_bUserNeedsToAcceptWorkshopLegalAgreement;
};
struct RemoteStorageDeletePublishedFileResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
};
struct RemoteStorageEnumerateUserPublishedFilesResult_t {
	EResult m_eResult;
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
	PublishedFileId_t m_rgPublishedFileId[50];
};
struct RemoteStorageSubscribePublishedFileResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
};
struct RemoteStorageEnumerateUserSubscribedFilesResult_t {
	EResult m_eResult;
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
	PublishedFileId_t m_rgPublishedFileId[50];
	uint32 m_rgRTimeSubscribed[50];
};
struct RemoteStorageUnsubscribePublishedFileResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
};
struct RemoteStorageUpdatePublishedFileResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	bool m_bUserNeedsToAcceptWorkshopLegalAgreement;
};
struct RemoteStorageDownloadUGCResult_t {
	EResult m_eResult;
	UGCHandle_t m_hFile;
	AppId_t m_nAppID;
	int32 m_nSizeInBytes;
	char m_pchFileName[260];
	uint64 m_ulSteamIDOwner;
};
struct RemoteStorageGetPublishedFileDetailsResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nCreatorAppID;
	AppId_t m_nConsumerAppID;
	char m_rgchTitle[129];
	char m_rgchDescription[8000];
	UGCHandle_t m_hFile;
	UGCHandle_t m_hPreviewFile;
	uint64 m_ulSteamIDOwner;
	uint32 m_rtimeCreated;
	uint32 m_rtimeUpdated;
	ERemoteStoragePublishedFileVisibility m_eVisibility;
	bool m_bBanned;
	char m_rgchTags[1025];
	bool m_bTagsTruncated;
	char m_pchFileName[260];
	int32 m_nFileSize;
	int32 m_nPreviewFileSize;
	char m_rgchURL[256];
	EWorkshopFileType m_eFileType;
	bool m_bAcceptedForUse;
};
struct RemoteStorageEnumerateWorkshopFilesResult_t {
	EResult m_eResult;
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
	PublishedFileId_t m_rgPublishedFileId[50];
	float m_rgScore[50];
	AppId_t m_nAppId;
	uint32 m_unStartIndex;
};
struct RemoteStorageGetPublishedItemVoteDetailsResult_t {
	EResult m_eResult;
	PublishedFileId_t m_unPublishedFileId;
	int32 m_nVotesFor;
	int32 m_nVotesAgainst;
	int32 m_nReports;
	float m_fScore;
};
struct RemoteStoragePublishedFileSubscribed_t {
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
};
struct RemoteStoragePublishedFileUnsubscribed_t {
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
};
struct RemoteStoragePublishedFileDeleted_t {
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
};
struct RemoteStorageUpdateUserPublishedItemVoteResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
};
struct RemoteStorageUserVoteDetails_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	EWorkshopVote m_eVote;
};
struct RemoteStorageEnumerateUserSharedWorkshopFilesResult_t {
	EResult m_eResult;
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
	PublishedFileId_t m_rgPublishedFileId[50];
};
struct RemoteStorageSetUserPublishedFileActionResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	EWorkshopFileAction m_eAction;
};
struct RemoteStorageEnumeratePublishedFilesByUserActionResult_t {
	EResult m_eResult;
	EWorkshopFileAction m_eAction;
	int32 m_nResultsReturned;
	int32 m_nTotalResultCount;
	PublishedFileId_t m_rgPublishedFileId[50];
	uint32 m_rgRTimeUpdated[50];
};
struct RemoteStoragePublishFileProgress_t {
	double m_dPercentFile;
	bool m_bPreview;
};
struct RemoteStoragePublishedFileUpdated_t {
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
	uint64 m_ulUnused;
};
struct RemoteStorageFileWriteAsyncComplete_t {
	EResult m_eResult;
};
struct RemoteStorageFileReadAsyncComplete_t {
	SteamAPICall_t m_hFileReadAsync;
	EResult m_eResult;
	uint32 m_nOffset;
	uint32 m_cubRead;
};
struct RemoteStorageLocalFileChange_t {
};
struct UserStatsReceived_t {
	uint64 m_nGameID;
	EResult m_eResult;
	CSteamID m_steamIDUser;
};
struct UserStatsStored_t {
	uint64 m_nGameID;
	EResult m_eResult;
};
struct UserAchievementStored_t {
	uint64 m_nGameID;
	bool m_bGroupAchievement;
	char m_rgchAchievementName[128];
	uint32 m_nCurProgress;
	uint32 m_nMaxProgress;
};
struct LeaderboardFindResult_t {
	SteamLeaderboard_t m_hSteamLeaderboard;
	uint8 m_bLeaderboardFound;
};
struct LeaderboardScoresDownloaded_t {
	SteamLeaderboard_t m_hSteamLeaderboard;
	SteamLeaderboardEntries_t m_hSteamLeaderboardEntries;
	int m_cEntryCount;
};
struct LeaderboardScoreUploaded_t {
	uint8 m_bSuccess;
	SteamLeaderboard_t m_hSteamLeaderboard;
	int32 m_nScore;
	uint8 m_bScoreChanged;
	int m_nGlobalRankNew;
	int m_nGlobalRankPrevious;
};
struct NumberOfCurrentPlayers_t {
	uint8 m_bSuccess;
	int32 m_cPlayers;
};
struct UserStatsUnloaded_t {
	CSteamID m_steamIDUser;
};
struct UserAchievementIconFetched_t {
	CGameID m_nGameID;
	char m_rgchAchievementName[128];
	bool m_bAchieved;
	int m_nIconHandle;
};
struct GlobalAchievementPercentagesReady_t {
	uint64 m_nGameID;
	EResult m_eResult;
};
struct LeaderboardUGCSet_t {
	EResult m_eResult;
	SteamLeaderboard_t m_hSteamLeaderboard;
};
struct PS3TrophiesInstalled_t {
	uint64 m_nGameID;
	EResult m_eResult;
	uint64 m_ulRequiredDiskSpace;
};
struct GlobalStatsReceived_t {
	uint64 m_nGameID;
	EResult m_eResult;
};
struct DlcInstalled_t {
	AppId_t m_nAppID;
};
struct NewUrlLaunchParameters_t {
};
struct AppProofOfPurchaseKeyResponse_t {
	EResult m_eResult;
	uint32 m_nAppID;
	uint32 m_cchKeyLength;
	char m_rgchKey[240];
};
struct FileDetailsResult_t {
	EResult m_eResult;
	uint64 m_ulFileSize;
	uint8 m_FileSHA[20];
	uint32 m_unFlags;
};
struct TimedTrialStatus_t {
	AppId_t m_unAppID;
	bool m_bIsOffline;
	uint32 m_unSecondsAllowed;
	uint32 m_unSecondsPlayed;
};
struct P2PSessionRequest_t {
	CSteamID m_steamIDRemote;
};
struct P2PSessionConnectFail_t {
	CSteamID m_steamIDRemote;
	uint8 m_eP2PSessionError;
};
struct SocketStatusCallback_t {
	SNetSocket_t m_hSocket;
	SNetListenSocket_t m_hListenSocket;
	CSteamID m_steamIDRemote;
	int m_eSNetSocketState;
};
struct ScreenshotReady_t {
	ScreenshotHandle m_hLocal;
	EResult m_eResult;
};
struct ScreenshotRequested_t {
};
struct PlaybackStatusHasChanged_t {
};
struct VolumeHasChanged_t {
	float m_flNewVolume;
};
struct MusicPlayerRemoteWillActivate_t {
};
struct MusicPlayerRemoteWillDeactivate_t {
};
struct MusicPlayerRemoteToFront_t {
};
struct MusicPlayerWillQuit_t {
};
struct MusicPlayerWantsPlay_t {
};
struct MusicPlayerWantsPause_t {
};
struct MusicPlayerWantsPlayPrevious_t {
};
struct MusicPlayerWantsPlayNext_t {
};
struct MusicPlayerWantsShuffled_t {
	bool m_bShuffled;
};
struct MusicPlayerWantsLooped_t {
	bool m_bLooped;
};
struct MusicPlayerWantsVolume_t {
	float m_flNewVolume;
};
struct MusicPlayerSelectsQueueEntry_t {
	int nID;
};
struct MusicPlayerSelectsPlaylistEntry_t {
	int nID;
};
struct MusicPlayerWantsPlayingRepeatStatus_t {
	int m_nPlayingRepeatStatus;
};
struct HTTPRequestCompleted_t {
	HTTPRequestHandle m_hRequest;
	uint64 m_ulContextValue;
	bool m_bRequestSuccessful;
	EHTTPStatusCode m_eStatusCode;
	uint32 m_unBodySize;
};
struct HTTPRequestHeadersReceived_t {
	HTTPRequestHandle m_hRequest;
	uint64 m_ulContextValue;
};
struct HTTPRequestDataReceived_t {
	HTTPRequestHandle m_hRequest;
	uint64 m_ulContextValue;
	uint32 m_cOffset;
	uint32 m_cBytesReceived;
};
struct SteamInputDeviceConnected_t {
	InputHandle_t m_ulConnectedDeviceHandle;
};
struct SteamInputDeviceDisconnected_t {
	InputHandle_t m_ulDisconnectedDeviceHandle;
};
struct SteamInputConfigurationLoaded_t {
	AppId_t m_unAppID;
	InputHandle_t m_ulDeviceHandle;
	CSteamID m_ulMappingCreator;
	uint32 m_unMajorRevision;
	uint32 m_unMinorRevision;
	bool m_bUsesSteamInputAPI;
	bool m_bUsesGamepadAPI;
};
struct SteamInputGamepadSlotChange_t {
	AppId_t m_unAppID;
	InputHandle_t m_ulDeviceHandle;
	ESteamInputType m_eDeviceType;
	int m_nOldGamepadSlot;
	int m_nNewGamepadSlot;
};
struct SteamUGCQueryCompleted_t {
	UGCQueryHandle_t m_handle;
	EResult m_eResult;
	uint32 m_unNumResultsReturned;
	uint32 m_unTotalMatchingResults;
	bool m_bCachedData;
	char m_rgchNextCursor[256];
};
struct SteamUGCRequestUGCDetailsResult_t {
	SteamUGCDetails_t m_details;
	bool m_bCachedData;
};
struct CreateItemResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	bool m_bUserNeedsToAcceptWorkshopLegalAgreement;
};
struct SubmitItemUpdateResult_t {
	EResult m_eResult;
	bool m_bUserNeedsToAcceptWorkshopLegalAgreement;
	PublishedFileId_t m_nPublishedFileId;
};
struct ItemInstalled_t {
	AppId_t m_unAppID;
	PublishedFileId_t m_nPublishedFileId;
};
struct DownloadItemResult_t {
	AppId_t m_unAppID;
	PublishedFileId_t m_nPublishedFileId;
	EResult m_eResult;
};
struct UserFavoriteItemsListChanged_t {
	PublishedFileId_t m_nPublishedFileId;
	EResult m_eResult;
	bool m_bWasAddRequest;
};
struct SetUserItemVoteResult_t {
	PublishedFileId_t m_nPublishedFileId;
	EResult m_eResult;
	bool m_bVoteUp;
};
struct GetUserItemVoteResult_t {
	PublishedFileId_t m_nPublishedFileId;
	EResult m_eResult;
	bool m_bVotedUp;
	bool m_bVotedDown;
	bool m_bVoteSkipped;
};
struct StartPlaytimeTrackingResult_t {
	EResult m_eResult;
};
struct StopPlaytimeTrackingResult_t {
	EResult m_eResult;
};
struct AddUGCDependencyResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	PublishedFileId_t m_nChildPublishedFileId;
};
struct RemoveUGCDependencyResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	PublishedFileId_t m_nChildPublishedFileId;
};
struct AddAppDependencyResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
};
struct RemoveAppDependencyResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_nAppID;
};
struct GetAppDependenciesResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
	AppId_t m_rgAppIDs[32];
	uint32 m_nNumAppDependencies;
	uint32 m_nTotalNumAppDependencies;
};
struct DeleteItemResult_t {
	EResult m_eResult;
	PublishedFileId_t m_nPublishedFileId;
};
struct UserSubscribedItemsListChanged_t {
	AppId_t m_nAppID;
};
struct WorkshopEULAStatus_t {
	EResult m_eResult;
	AppId_t m_nAppID;
	uint32 m_unVersion;
	RTime32 m_rtAction;
	bool m_bAccepted;
	bool m_bNeedsAction;
};
struct HTML_BrowserReady_t {
	HHTMLBrowser unBrowserHandle;
};
struct HTML_NeedsPaint_t {
	HHTMLBrowser unBrowserHandle;
	const char * pBGRA;
	uint32 unWide;
	uint32 unTall;
	uint32 unUpdateX;
	uint32 unUpdateY;
	uint32 unUpdateWide;
	uint32 unUpdateTall;
	uint32 unScrollX;
	uint32 unScrollY;
	float flPageScale;
	uint32 unPageSerial;
};
struct HTML_StartRequest_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchURL;
	const char * pchTarget;
	const char * pchPostData;
	bool bIsRedirect;
};
struct HTML_CloseBrowser_t {
	HHTMLBrowser unBrowserHandle;
};
struct HTML_URLChanged_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchURL;
	const char * pchPostData;
	bool bIsRedirect;
	const char * pchPageTitle;
	bool bNewNavigation;
};
struct HTML_FinishedRequest_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchURL;
	const char * pchPageTitle;
};
struct HTML_OpenLinkInNewTab_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchURL;
};
struct HTML_ChangedTitle_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchTitle;
};
struct HTML_SearchResults_t {
	HHTMLBrowser unBrowserHandle;
	uint32 unResults;
	uint32 unCurrentMatch;
};
struct HTML_CanGoBackAndForward_t {
	HHTMLBrowser unBrowserHandle;
	bool bCanGoBack;
	bool bCanGoForward;
};
struct HTML_HorizontalScroll_t {
	HHTMLBrowser unBrowserHandle;
	uint32 unScrollMax;
	uint32 unScrollCurrent;
	float flPageScale;
	bool bVisible;
	uint32 unPageSize;
};
struct HTML_VerticalScroll_t {
	HHTMLBrowser unBrowserHandle;
	uint32 unScrollMax;
	uint32 unScrollCurrent;
	float flPageScale;
	bool bVisible;
	uint32 unPageSize;
};
struct HTML_LinkAtPosition_t {
	HHTMLBrowser unBrowserHandle;
	uint32 x;
	uint32 y;
	const char * pchURL;
	bool bInput;
	bool bLiveLink;
};
struct HTML_JSAlert_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchMessage;
};
struct HTML_JSConfirm_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchMessage;
};
struct HTML_FileOpenDialog_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchTitle;
	const char * pchInitialFile;
};
struct HTML_NewWindow_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchURL;
	uint32 unX;
	uint32 unY;
	uint32 unWide;
	uint32 unTall;
	HHTMLBrowser unNewWindow_BrowserHandle_IGNORE;
};
struct HTML_SetCursor_t {
	HHTMLBrowser unBrowserHandle;
	uint32 eMouseCursor;
};
struct HTML_StatusText_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchMsg;
};
struct HTML_ShowToolTip_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchMsg;
};
struct HTML_UpdateToolTip_t {
	HHTMLBrowser unBrowserHandle;
	const char * pchMsg;
};
struct HTML_HideToolTip_t {
	HHTMLBrowser unBrowserHandle;
};
struct HTML_BrowserRestarted_t {
	HHTMLBrowser unBrowserHandle;
	HHTMLBrowser unOldBrowserHandle;
};
struct SteamInventoryResultReady_t {
	SteamInventoryResult_t m_handle;
	EResult m_result;
};
struct SteamInventoryFullUpdate_t {
	SteamInventoryResult_t m_handle;
};
struct SteamInventoryDefinitionUpdate_t {
};
struct SteamInventoryEligiblePromoItemDefIDs_t {
	EResult m_result;
	CSteamID m_steamID;
	int m_numEligiblePromoItemDefs;
	bool m_bCachedData;
};
struct SteamInventoryStartPurchaseResult_t {
	EResult m_result;
	uint64 m_ulOrderID;
	uint64 m_ulTransID;
};
struct SteamInventoryRequestPricesResult_t {
	EResult m_result;
	char m_rgchCurrency[4];
};
struct GetVideoURLResult_t {
	EResult m_eResult;
	AppId_t m_unVideoAppID;
	char m_rgchURL[256];
};
struct GetOPFSettingsResult_t {
	EResult m_eResult;
	AppId_t m_unVideoAppID;
};
struct SteamParentalSettingsChanged_t {
};
struct SteamRemotePlaySessionConnected_t {
	RemotePlaySessionID_t m_unSessionID;
};
struct SteamRemotePlaySessionDisconnected_t {
	RemotePlaySessionID_t m_unSessionID;
};
struct SteamRemotePlayTogetherGuestInvite_t {
	char m_szConnectURL[1024];
};
struct SteamNetworkingMessagesSessionRequest_t {
	SteamNetworkingIdentity m_identityRemote;
};
struct SteamNetworkingMessagesSessionFailed_t {
	SteamNetConnectionInfo_t m_info;
};
struct SteamNetConnectionStatusChangedCallback_t {
	HSteamNetConnection m_hConn;
	SteamNetConnectionInfo_t m_info;
	ESteamNetworkingConnectionState m_eOldState;
};
struct SteamNetAuthenticationStatus_t {
	ESteamNetworkingAvailability m_eAvail;
	char m_debugMsg[256];
};
struct SteamRelayNetworkStatus_t {
	ESteamNetworkingAvailability m_eAvail;
	int m_bPingMeasurementInProgress;
	ESteamNetworkingAvailability m_eAvailNetworkConfig;
	ESteamNetworkingAvailability m_eAvailAnyRelay;
	char m_debugMsg[256];
};
struct GSClientApprove_t {
	CSteamID m_SteamID;
	CSteamID m_OwnerSteamID;
};
struct GSClientDeny_t {
	CSteamID m_SteamID;
	EDenyReason m_eDenyReason;
	char m_rgchOptionalText[128];
};
struct GSClientKick_t {
	CSteamID m_SteamID;
	EDenyReason m_eDenyReason;
};
struct GSClientAchievementStatus_t {
	uint64 m_SteamID;
	char m_pchAchievement[128];
	bool m_bUnlocked;
};
struct GSPolicyResponse_t {
	uint8 m_bSecure;
};
struct GSGameplayStats_t {
	EResult m_eResult;
	int32 m_nRank;
	uint32 m_unTotalConnects;
	uint32 m_unTotalMinutesPlayed;
};
struct GSClientGroupStatus_t {
	CSteamID m_SteamIDUser;
	CSteamID m_SteamIDGroup;
	bool m_bMember;
	bool m_bOfficer;
};
struct GSReputation_t {
	EResult m_eResult;
	uint32 m_unReputationScore;
	bool m_bBanned;
	uint32 m_unBannedIP;
	uint16 m_usBannedPort;
	uint64 m_ulBannedGameID;
	uint32 m_unBanExpires;
};
struct AssociateWithClanResult_t {
	EResult m_eResult;
};
struct ComputeNewPlayerCompatibilityResult_t {
	EResult m_eResult;
	int m_cPlayersThatDontLikeCandidate;
	int m_cPlayersThatCandidateDoesntLike;
	int m_cClanPlayersThatDontLikeCandidate;
	CSteamID m_SteamIDCandidate;
};
struct GSStatsReceived_t {
	EResult m_eResult;
	CSteamID m_steamIDUser;
};
struct GSStatsStored_t {
	EResult m_eResult;
	CSteamID m_steamIDUser;
};
struct GSStatsUnloaded_t {
	CSteamID m_steamIDUser;
};
struct SteamNetworkingFakeIPResult_t {
	EResult m_eResult;
	SteamNetworkingIdentity m_identity;
	uint32 m_unIP;
	uint16 m_unPorts[8];
};


typedef void* ISteamClient;
typedef void* ISteamUser;
typedef void* ISteamFriends;
typedef void* ISteamUtils;
typedef void* ISteamMatchmaking;
typedef void* ISteamMatchmakingServerListResponse;
typedef void* ISteamMatchmakingPingResponse;
typedef void* ISteamMatchmakingPlayersResponse;
typedef void* ISteamMatchmakingRulesResponse;
typedef void* ISteamMatchmakingServers;
typedef void* ISteamGameSearch;
typedef void* ISteamParties;
typedef void* ISteamRemoteStorage;
typedef void* ISteamUserStats;
typedef void* ISteamApps;
typedef void* ISteamNetworking;
typedef void* ISteamScreenshots;
typedef void* ISteamMusic;
typedef void* ISteamMusicRemote;
typedef void* ISteamHTTP;
typedef void* ISteamInput;
typedef void* ISteamController;
typedef void* ISteamUGC;
typedef void* ISteamHTMLSurface;
typedef void* ISteamInventory;
typedef void* ISteamParentalSettings;
typedef void* ISteamRemotePlay;
typedef void* ISteamNetworkingMessages;
typedef void* ISteamNetworkingSockets;
typedef void* ISteamNetworkingUtils;
typedef void* ISteamGameServer;
typedef void* ISteamGameServerStats;
typedef void* ISteamNetworkingFakeUDPPort;


bool SteamAPI_SteamIPAddress_t_IsSet(void);


void SteamAPI_MatchMakingKeyValuePair_t_Construct(void);


void SteamAPI_servernetadr_t_Construct(void);
void SteamAPI_servernetadr_t_Init(unsigned int ip, uint16 usQueryPort, uint16 usConnectionPort);
uint16 SteamAPI_servernetadr_t_GetQueryPort(void);
void SteamAPI_servernetadr_t_SetQueryPort(uint16 usPort);
uint16 SteamAPI_servernetadr_t_GetConnectionPort(void);
void SteamAPI_servernetadr_t_SetConnectionPort(uint16 usPort);
uint32 SteamAPI_servernetadr_t_GetIP(void);
void SteamAPI_servernetadr_t_SetIP(uint32 unIP);
const char * SteamAPI_servernetadr_t_GetConnectionAddressString(void);
const char * SteamAPI_servernetadr_t_GetQueryAddressString(void);
bool SteamAPI_servernetadr_t_IsLessThan(const servernetadr_t * netadr);
void SteamAPI_servernetadr_t_Assign(const servernetadr_t * that);


void SteamAPI_gameserveritem_t_Construct(void);
const char * SteamAPI_gameserveritem_t_GetName(void);
void SteamAPI_gameserveritem_t_SetName(const char * pName);


void SteamAPI_SteamNetworkingIPAddr_Clear(void);
bool SteamAPI_SteamNetworkingIPAddr_IsIPv6AllZeros(void);
void SteamAPI_SteamNetworkingIPAddr_SetIPv6(const uint8 * ipv6, uint16 nPort);
void SteamAPI_SteamNetworkingIPAddr_SetIPv4(uint32 nIP, uint16 nPort);
bool SteamAPI_SteamNetworkingIPAddr_IsIPv4(void);
uint32 SteamAPI_SteamNetworkingIPAddr_GetIPv4(void);
void SteamAPI_SteamNetworkingIPAddr_SetIPv6LocalHost(uint16 nPort);
bool SteamAPI_SteamNetworkingIPAddr_IsLocalHost(void);
void SteamAPI_SteamNetworkingIPAddr_ToString(char * buf, uint32 cbBuf, bool bWithPort);
bool SteamAPI_SteamNetworkingIPAddr_ParseString(const char * pszStr);
bool SteamAPI_SteamNetworkingIPAddr_IsEqualTo(const SteamNetworkingIPAddr * x);
ESteamNetworkingFakeIPType SteamAPI_SteamNetworkingIPAddr_GetFakeIPType(void);
bool SteamAPI_SteamNetworkingIPAddr_IsFakeIP(void);


void SteamAPI_SteamNetworkingIdentity_Clear(void);
bool SteamAPI_SteamNetworkingIdentity_IsInvalid(void);
void SteamAPI_SteamNetworkingIdentity_SetSteamID(uint64_steamid steamID);
uint64_steamid SteamAPI_SteamNetworkingIdentity_GetSteamID(void);
void SteamAPI_SteamNetworkingIdentity_SetSteamID64(uint64 steamID);
uint64 SteamAPI_SteamNetworkingIdentity_GetSteamID64(void);
bool SteamAPI_SteamNetworkingIdentity_SetXboxPairwiseID(const char * pszString);
const char * SteamAPI_SteamNetworkingIdentity_GetXboxPairwiseID(void);
void SteamAPI_SteamNetworkingIdentity_SetPSNID(uint64 id);
uint64 SteamAPI_SteamNetworkingIdentity_GetPSNID(void);
void SteamAPI_SteamNetworkingIdentity_SetStadiaID(uint64 id);
uint64 SteamAPI_SteamNetworkingIdentity_GetStadiaID(void);
void SteamAPI_SteamNetworkingIdentity_SetIPAddr(const SteamNetworkingIPAddr * addr);
const SteamNetworkingIPAddr * SteamAPI_SteamNetworkingIdentity_GetIPAddr(void);
void SteamAPI_SteamNetworkingIdentity_SetIPv4Addr(uint32 nIPv4, uint16 nPort);
uint32 SteamAPI_SteamNetworkingIdentity_GetIPv4(void);
ESteamNetworkingFakeIPType SteamAPI_SteamNetworkingIdentity_GetFakeIPType(void);
bool SteamAPI_SteamNetworkingIdentity_IsFakeIP(void);
void SteamAPI_SteamNetworkingIdentity_SetLocalHost(void);
bool SteamAPI_SteamNetworkingIdentity_IsLocalHost(void);
bool SteamAPI_SteamNetworkingIdentity_SetGenericString(const char * pszString);
const char * SteamAPI_SteamNetworkingIdentity_GetGenericString(void);
bool SteamAPI_SteamNetworkingIdentity_SetGenericBytes(const void * data, uint32 cbLen);
const uint8 * SteamAPI_SteamNetworkingIdentity_GetGenericBytes(int * cbLen);
bool SteamAPI_SteamNetworkingIdentity_IsEqualTo(const SteamNetworkingIdentity * x);
void SteamAPI_SteamNetworkingIdentity_ToString(char * buf, uint32 cbBuf);
bool SteamAPI_SteamNetworkingIdentity_ParseString(const char * pszStr);


void SteamAPI_SteamNetworkingMessage_t_Release(void);


void SteamAPI_SteamNetworkingConfigValue_t_SetInt32(ESteamNetworkingConfigValue eVal, int32_t data);
void SteamAPI_SteamNetworkingConfigValue_t_SetInt64(ESteamNetworkingConfigValue eVal, int64_t data);
void SteamAPI_SteamNetworkingConfigValue_t_SetFloat(ESteamNetworkingConfigValue eVal, float data);
void SteamAPI_SteamNetworkingConfigValue_t_SetPtr(ESteamNetworkingConfigValue eVal, void * data);
void SteamAPI_SteamNetworkingConfigValue_t_SetString(ESteamNetworkingConfigValue eVal, const char * data);


void SteamAPI_SteamDatagramHostedAddress_Clear(void);
SteamNetworkingPOPID SteamAPI_SteamDatagramHostedAddress_GetPopID(void);
void SteamAPI_SteamDatagramHostedAddress_SetDevAddress(uint32 nIP, uint16 nPort, SteamNetworkingPOPID popid);


typedef enum EHTMLMouseButton EHTMLMouseButton;
typedef enum EMouseCursor EMouseCursor;
typedef enum EHTMLKeyModifiers EHTMLKeyModifiers;


enum EHTMLMouseButton {
	eHTMLMouseButton_Left = 0,
	eHTMLMouseButton_Right = 1,
	eHTMLMouseButton_Middle = 2,
};
enum EMouseCursor {
	dc_user = 0,
	dc_none = 1,
	dc_arrow = 2,
	dc_ibeam = 3,
	dc_hourglass = 4,
	dc_waitarrow = 5,
	dc_crosshair = 6,
	dc_up = 7,
	dc_sizenw = 8,
	dc_sizese = 9,
	dc_sizene = 10,
	dc_sizesw = 11,
	dc_sizew = 12,
	dc_sizee = 13,
	dc_sizen = 14,
	dc_sizes = 15,
	dc_sizewe = 16,
	dc_sizens = 17,
	dc_sizeall = 18,
	dc_no = 19,
	dc_hand = 20,
	dc_blank = 21,
	dc_middle_pan = 22,
	dc_north_pan = 23,
	dc_north_east_pan = 24,
	dc_east_pan = 25,
	dc_south_east_pan = 26,
	dc_south_pan = 27,
	dc_south_west_pan = 28,
	dc_west_pan = 29,
	dc_north_west_pan = 30,
	dc_alias = 31,
	dc_cell = 32,
	dc_colresize = 33,
	dc_copycur = 34,
	dc_verticaltext = 35,
	dc_rowresize = 36,
	dc_zoomin = 37,
	dc_zoomout = 38,
	dc_help = 39,
	dc_custom = 40,
	dc_last = 41,
};
enum EHTMLKeyModifiers {
	k_eHTMLKeyModifier_None = 0,
	k_eHTMLKeyModifier_AltDown = 1,
	k_eHTMLKeyModifier_CtrlDown = 2,
	k_eHTMLKeyModifier_ShiftDown = 4,
};


HSteamPipe SteamAPI_ISteamClient_CreateSteamPipe(void);
bool SteamAPI_ISteamClient_BReleaseSteamPipe(HSteamPipe hSteamPipe);
HSteamUser SteamAPI_ISteamClient_ConnectToGlobalUser(HSteamPipe hSteamPipe);
HSteamUser SteamAPI_ISteamClient_CreateLocalUser(HSteamPipe * phSteamPipe, EAccountType eAccountType);
void SteamAPI_ISteamClient_ReleaseUser(HSteamPipe hSteamPipe, HSteamUser hUser);
ISteamUser * SteamAPI_ISteamClient_GetISteamUser(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamGameServer * SteamAPI_ISteamClient_GetISteamGameServer(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
void SteamAPI_ISteamClient_SetLocalIPBinding(const SteamIPAddress_t * unIP, uint16 usPort);
ISteamFriends * SteamAPI_ISteamClient_GetISteamFriends(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamUtils * SteamAPI_ISteamClient_GetISteamUtils(HSteamPipe hSteamPipe, const char * pchVersion);
ISteamMatchmaking * SteamAPI_ISteamClient_GetISteamMatchmaking(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamMatchmakingServers * SteamAPI_ISteamClient_GetISteamMatchmakingServers(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
void * SteamAPI_ISteamClient_GetISteamGenericInterface(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamUserStats * SteamAPI_ISteamClient_GetISteamUserStats(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamGameServerStats * SteamAPI_ISteamClient_GetISteamGameServerStats(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamApps * SteamAPI_ISteamClient_GetISteamApps(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamNetworking * SteamAPI_ISteamClient_GetISteamNetworking(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamRemoteStorage * SteamAPI_ISteamClient_GetISteamRemoteStorage(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamScreenshots * SteamAPI_ISteamClient_GetISteamScreenshots(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamGameSearch * SteamAPI_ISteamClient_GetISteamGameSearch(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
uint32 SteamAPI_ISteamClient_GetIPCCallCount(void);
//void SteamAPI_ISteamClient_SetWarningMessageHook(SteamAPIWarningMessageHook_t pFunction);
bool SteamAPI_ISteamClient_BShutdownIfAllPipesClosed(void);
ISteamHTTP * SteamAPI_ISteamClient_GetISteamHTTP(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamController * SteamAPI_ISteamClient_GetISteamController(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamUGC * SteamAPI_ISteamClient_GetISteamUGC(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamMusic * SteamAPI_ISteamClient_GetISteamMusic(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamMusicRemote * SteamAPI_ISteamClient_GetISteamMusicRemote(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamHTMLSurface * SteamAPI_ISteamClient_GetISteamHTMLSurface(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamInventory * SteamAPI_ISteamClient_GetISteamInventory(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamParentalSettings * SteamAPI_ISteamClient_GetISteamParentalSettings(HSteamUser hSteamuser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamInput * SteamAPI_ISteamClient_GetISteamInput(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamParties * SteamAPI_ISteamClient_GetISteamParties(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);
ISteamRemotePlay * SteamAPI_ISteamClient_GetISteamRemotePlay(HSteamUser hSteamUser, HSteamPipe hSteamPipe, const char * pchVersion);


HSteamUser SteamAPI_ISteamUser_GetHSteamUser(void);
bool SteamAPI_ISteamUser_BLoggedOn(void);
uint64_steamid SteamAPI_ISteamUser_GetSteamID(void);
int SteamAPI_ISteamUser_InitiateGameConnection_DEPRECATED(void * pAuthBlob, int cbMaxAuthBlob, uint64_steamid steamIDGameServer, uint32 unIPServer, uint16 usPortServer, bool bSecure);
void SteamAPI_ISteamUser_TerminateGameConnection_DEPRECATED(uint32 unIPServer, uint16 usPortServer);
void SteamAPI_ISteamUser_TrackAppUsageEvent(uint64_gameid gameID, int eAppUsageEvent, const char * pchExtraInfo);
bool SteamAPI_ISteamUser_GetUserDataFolder(char * pchBuffer, int cubBuffer);
void SteamAPI_ISteamUser_StartVoiceRecording(void);
void SteamAPI_ISteamUser_StopVoiceRecording(void);
EVoiceResult SteamAPI_ISteamUser_GetAvailableVoice(uint32 * pcbCompressed, uint32 * pcbUncompressed_Deprecated, uint32 nUncompressedVoiceDesiredSampleRate_Deprecated);
EVoiceResult SteamAPI_ISteamUser_GetVoice(bool bWantCompressed, void * pDestBuffer, uint32 cbDestBufferSize, uint32 * nBytesWritten, bool bWantUncompressed_Deprecated, void * pUncompressedDestBuffer_Deprecated, uint32 cbUncompressedDestBufferSize_Deprecated, uint32 * nUncompressBytesWritten_Deprecated, uint32 nUncompressedVoiceDesiredSampleRate_Deprecated);
EVoiceResult SteamAPI_ISteamUser_DecompressVoice(const void * pCompressed, uint32 cbCompressed, void * pDestBuffer, uint32 cbDestBufferSize, uint32 * nBytesWritten, uint32 nDesiredSampleRate);
uint32 SteamAPI_ISteamUser_GetVoiceOptimalSampleRate(void);
HAuthTicket SteamAPI_ISteamUser_GetAuthSessionTicket(void * pTicket, int cbMaxTicket, uint32 * pcbTicket, const SteamNetworkingIdentity * pSteamNetworkingIdentity);
HAuthTicket SteamAPI_ISteamUser_GetAuthTicketForWebApi(const char * pchIdentity);
EBeginAuthSessionResult SteamAPI_ISteamUser_BeginAuthSession(const void * pAuthTicket, int cbAuthTicket, uint64_steamid steamID);
void SteamAPI_ISteamUser_EndAuthSession(uint64_steamid steamID);
void SteamAPI_ISteamUser_CancelAuthTicket(HAuthTicket hAuthTicket);
EUserHasLicenseForAppResult SteamAPI_ISteamUser_UserHasLicenseForApp(uint64_steamid steamID, AppId_t appID);
bool SteamAPI_ISteamUser_BIsBehindNAT(void);
void SteamAPI_ISteamUser_AdvertiseGame(uint64_steamid steamIDGameServer, uint32 unIPServer, uint16 usPortServer);
SteamAPICall_t SteamAPI_ISteamUser_RequestEncryptedAppTicket(void * pDataToInclude, int cbDataToInclude);
bool SteamAPI_ISteamUser_GetEncryptedAppTicket(void * pTicket, int cbMaxTicket, uint32 * pcbTicket);
int SteamAPI_ISteamUser_GetGameBadgeLevel(int nSeries, bool bFoil);
int SteamAPI_ISteamUser_GetPlayerSteamLevel(void);
SteamAPICall_t SteamAPI_ISteamUser_RequestStoreAuthURL(const char * pchRedirectURL);
bool SteamAPI_ISteamUser_BIsPhoneVerified(void);
bool SteamAPI_ISteamUser_BIsTwoFactorEnabled(void);
bool SteamAPI_ISteamUser_BIsPhoneIdentifying(void);
bool SteamAPI_ISteamUser_BIsPhoneRequiringVerification(void);
SteamAPICall_t SteamAPI_ISteamUser_GetMarketEligibility(void);
SteamAPICall_t SteamAPI_ISteamUser_GetDurationControl(void);
bool SteamAPI_ISteamUser_BSetDurationControlOnlineState(EDurationControlOnlineState eNewState);


const char * SteamAPI_ISteamFriends_GetPersonaName(void);
SteamAPICall_t SteamAPI_ISteamFriends_SetPersonaName(const char * pchPersonaName);
EPersonaState SteamAPI_ISteamFriends_GetPersonaState(void);
int SteamAPI_ISteamFriends_GetFriendCount(int iFriendFlags);
uint64_steamid SteamAPI_ISteamFriends_GetFriendByIndex(int iFriend, int iFriendFlags);
EFriendRelationship SteamAPI_ISteamFriends_GetFriendRelationship(uint64_steamid steamIDFriend);
EPersonaState SteamAPI_ISteamFriends_GetFriendPersonaState(uint64_steamid steamIDFriend);
const char * SteamAPI_ISteamFriends_GetFriendPersonaName(uint64_steamid steamIDFriend);
bool SteamAPI_ISteamFriends_GetFriendGamePlayed(uint64_steamid steamIDFriend, FriendGameInfo_t * pFriendGameInfo);
const char * SteamAPI_ISteamFriends_GetFriendPersonaNameHistory(uint64_steamid steamIDFriend, int iPersonaName);
int SteamAPI_ISteamFriends_GetFriendSteamLevel(uint64_steamid steamIDFriend);
const char * SteamAPI_ISteamFriends_GetPlayerNickname(uint64_steamid steamIDPlayer);
int SteamAPI_ISteamFriends_GetFriendsGroupCount(void);
FriendsGroupID_t SteamAPI_ISteamFriends_GetFriendsGroupIDByIndex(int iFG);
const char * SteamAPI_ISteamFriends_GetFriendsGroupName(FriendsGroupID_t friendsGroupID);
int SteamAPI_ISteamFriends_GetFriendsGroupMembersCount(FriendsGroupID_t friendsGroupID);
void SteamAPI_ISteamFriends_GetFriendsGroupMembersList(FriendsGroupID_t friendsGroupID, CSteamID * pOutSteamIDMembers, int nMembersCount);
bool SteamAPI_ISteamFriends_HasFriend(uint64_steamid steamIDFriend, int iFriendFlags);
int SteamAPI_ISteamFriends_GetClanCount(void);
uint64_steamid SteamAPI_ISteamFriends_GetClanByIndex(int iClan);
const char * SteamAPI_ISteamFriends_GetClanName(uint64_steamid steamIDClan);
const char * SteamAPI_ISteamFriends_GetClanTag(uint64_steamid steamIDClan);
bool SteamAPI_ISteamFriends_GetClanActivityCounts(uint64_steamid steamIDClan, int * pnOnline, int * pnInGame, int * pnChatting);
SteamAPICall_t SteamAPI_ISteamFriends_DownloadClanActivityCounts(CSteamID * psteamIDClans, int cClansToRequest);
int SteamAPI_ISteamFriends_GetFriendCountFromSource(uint64_steamid steamIDSource);
uint64_steamid SteamAPI_ISteamFriends_GetFriendFromSourceByIndex(uint64_steamid steamIDSource, int iFriend);
bool SteamAPI_ISteamFriends_IsUserInSource(uint64_steamid steamIDUser, uint64_steamid steamIDSource);
void SteamAPI_ISteamFriends_SetInGameVoiceSpeaking(uint64_steamid steamIDUser, bool bSpeaking);
void SteamAPI_ISteamFriends_ActivateGameOverlay(const char * pchDialog);
void SteamAPI_ISteamFriends_ActivateGameOverlayToUser(const char * pchDialog, uint64_steamid steamID);
void SteamAPI_ISteamFriends_ActivateGameOverlayToWebPage(const char * pchURL, EActivateGameOverlayToWebPageMode eMode);
void SteamAPI_ISteamFriends_ActivateGameOverlayToStore(AppId_t nAppID, EOverlayToStoreFlag eFlag);
void SteamAPI_ISteamFriends_SetPlayedWith(uint64_steamid steamIDUserPlayedWith);
void SteamAPI_ISteamFriends_ActivateGameOverlayInviteDialog(uint64_steamid steamIDLobby);
int SteamAPI_ISteamFriends_GetSmallFriendAvatar(uint64_steamid steamIDFriend);
int SteamAPI_ISteamFriends_GetMediumFriendAvatar(uint64_steamid steamIDFriend);
int SteamAPI_ISteamFriends_GetLargeFriendAvatar(uint64_steamid steamIDFriend);
bool SteamAPI_ISteamFriends_RequestUserInformation(uint64_steamid steamIDUser, bool bRequireNameOnly);
SteamAPICall_t SteamAPI_ISteamFriends_RequestClanOfficerList(uint64_steamid steamIDClan);
uint64_steamid SteamAPI_ISteamFriends_GetClanOwner(uint64_steamid steamIDClan);
int SteamAPI_ISteamFriends_GetClanOfficerCount(uint64_steamid steamIDClan);
uint64_steamid SteamAPI_ISteamFriends_GetClanOfficerByIndex(uint64_steamid steamIDClan, int iOfficer);
uint32 SteamAPI_ISteamFriends_GetUserRestrictions(void);
bool SteamAPI_ISteamFriends_SetRichPresence(const char * pchKey, const char * pchValue);
void SteamAPI_ISteamFriends_ClearRichPresence(void);
const char * SteamAPI_ISteamFriends_GetFriendRichPresence(uint64_steamid steamIDFriend, const char * pchKey);
int SteamAPI_ISteamFriends_GetFriendRichPresenceKeyCount(uint64_steamid steamIDFriend);
const char * SteamAPI_ISteamFriends_GetFriendRichPresenceKeyByIndex(uint64_steamid steamIDFriend, int iKey);
void SteamAPI_ISteamFriends_RequestFriendRichPresence(uint64_steamid steamIDFriend);
bool SteamAPI_ISteamFriends_InviteUserToGame(uint64_steamid steamIDFriend, const char * pchConnectString);
int SteamAPI_ISteamFriends_GetCoplayFriendCount(void);
uint64_steamid SteamAPI_ISteamFriends_GetCoplayFriend(int iCoplayFriend);
int SteamAPI_ISteamFriends_GetFriendCoplayTime(uint64_steamid steamIDFriend);
AppId_t SteamAPI_ISteamFriends_GetFriendCoplayGame(uint64_steamid steamIDFriend);
SteamAPICall_t SteamAPI_ISteamFriends_JoinClanChatRoom(uint64_steamid steamIDClan);
bool SteamAPI_ISteamFriends_LeaveClanChatRoom(uint64_steamid steamIDClan);
int SteamAPI_ISteamFriends_GetClanChatMemberCount(uint64_steamid steamIDClan);
uint64_steamid SteamAPI_ISteamFriends_GetChatMemberByIndex(uint64_steamid steamIDClan, int iUser);
bool SteamAPI_ISteamFriends_SendClanChatMessage(uint64_steamid steamIDClanChat, const char * pchText);
int SteamAPI_ISteamFriends_GetClanChatMessage(uint64_steamid steamIDClanChat, int iMessage, void * prgchText, int cchTextMax, EChatEntryType * peChatEntryType, CSteamID * psteamidChatter);
bool SteamAPI_ISteamFriends_IsClanChatAdmin(uint64_steamid steamIDClanChat, uint64_steamid steamIDUser);
bool SteamAPI_ISteamFriends_IsClanChatWindowOpenInSteam(uint64_steamid steamIDClanChat);
bool SteamAPI_ISteamFriends_OpenClanChatWindowInSteam(uint64_steamid steamIDClanChat);
bool SteamAPI_ISteamFriends_CloseClanChatWindowInSteam(uint64_steamid steamIDClanChat);
bool SteamAPI_ISteamFriends_SetListenForFriendsMessages(bool bInterceptEnabled);
bool SteamAPI_ISteamFriends_ReplyToFriendMessage(uint64_steamid steamIDFriend, const char * pchMsgToSend);
int SteamAPI_ISteamFriends_GetFriendMessage(uint64_steamid steamIDFriend, int iMessageID, void * pvData, int cubData, EChatEntryType * peChatEntryType);
SteamAPICall_t SteamAPI_ISteamFriends_GetFollowerCount(uint64_steamid steamID);
SteamAPICall_t SteamAPI_ISteamFriends_IsFollowing(uint64_steamid steamID);
SteamAPICall_t SteamAPI_ISteamFriends_EnumerateFollowingList(uint32 unStartIndex);
bool SteamAPI_ISteamFriends_IsClanPublic(uint64_steamid steamIDClan);
bool SteamAPI_ISteamFriends_IsClanOfficialGameGroup(uint64_steamid steamIDClan);
int SteamAPI_ISteamFriends_GetNumChatsWithUnreadPriorityMessages(void);
void SteamAPI_ISteamFriends_ActivateGameOverlayRemotePlayTogetherInviteDialog(uint64_steamid steamIDLobby);
bool SteamAPI_ISteamFriends_RegisterProtocolInOverlayBrowser(const char * pchProtocol);
void SteamAPI_ISteamFriends_ActivateGameOverlayInviteDialogConnectString(const char * pchConnectString);
SteamAPICall_t SteamAPI_ISteamFriends_RequestEquippedProfileItems(uint64_steamid steamID);
bool SteamAPI_ISteamFriends_BHasEquippedProfileItem(uint64_steamid steamID, ECommunityProfileItemType itemType);
const char * SteamAPI_ISteamFriends_GetProfileItemPropertyString(uint64_steamid steamID, ECommunityProfileItemType itemType, ECommunityProfileItemProperty prop);
uint32 SteamAPI_ISteamFriends_GetProfileItemPropertyUint(uint64_steamid steamID, ECommunityProfileItemType itemType, ECommunityProfileItemProperty prop);


uint32 SteamAPI_ISteamUtils_GetSecondsSinceAppActive(void);
uint32 SteamAPI_ISteamUtils_GetSecondsSinceComputerActive(void);
EUniverse SteamAPI_ISteamUtils_GetConnectedUniverse(void);
uint32 SteamAPI_ISteamUtils_GetServerRealTime(void);
const char * SteamAPI_ISteamUtils_GetIPCountry(void);
bool SteamAPI_ISteamUtils_GetImageSize(int iImage, uint32 * pnWidth, uint32 * pnHeight);
bool SteamAPI_ISteamUtils_GetImageRGBA(int iImage, uint8 * pubDest, int nDestBufferSize);
uint8 SteamAPI_ISteamUtils_GetCurrentBatteryPower(void);
uint32 SteamAPI_ISteamUtils_GetAppID(void);
void SteamAPI_ISteamUtils_SetOverlayNotificationPosition(ENotificationPosition eNotificationPosition);
bool SteamAPI_ISteamUtils_IsAPICallCompleted(SteamAPICall_t hSteamAPICall, bool * pbFailed);
ESteamAPICallFailure SteamAPI_ISteamUtils_GetAPICallFailureReason(SteamAPICall_t hSteamAPICall);
bool SteamAPI_ISteamUtils_GetAPICallResult(SteamAPICall_t hSteamAPICall, void * pCallback, int cubCallback, int iCallbackExpected, bool * pbFailed);
uint32 SteamAPI_ISteamUtils_GetIPCCallCount(void);
//void SteamAPI_ISteamUtils_SetWarningMessageHook(SteamAPIWarningMessageHook_t pFunction);
bool SteamAPI_ISteamUtils_IsOverlayEnabled(void);
bool SteamAPI_ISteamUtils_BOverlayNeedsPresent(void);
SteamAPICall_t SteamAPI_ISteamUtils_CheckFileSignature(const char * szFileName);
bool SteamAPI_ISteamUtils_ShowGamepadTextInput(EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, const char * pchDescription, uint32 unCharMax, const char * pchExistingText);
uint32 SteamAPI_ISteamUtils_GetEnteredGamepadTextLength(void);
bool SteamAPI_ISteamUtils_GetEnteredGamepadTextInput(char * pchText, uint32 cchText);
const char * SteamAPI_ISteamUtils_GetSteamUILanguage(void);
bool SteamAPI_ISteamUtils_IsSteamRunningInVR(void);
void SteamAPI_ISteamUtils_SetOverlayNotificationInset(int nHorizontalInset, int nVerticalInset);
bool SteamAPI_ISteamUtils_IsSteamInBigPictureMode(void);
void SteamAPI_ISteamUtils_StartVRDashboard(void);
bool SteamAPI_ISteamUtils_IsVRHeadsetStreamingEnabled(void);
void SteamAPI_ISteamUtils_SetVRHeadsetStreamingEnabled(bool bEnabled);
bool SteamAPI_ISteamUtils_IsSteamChinaLauncher(void);
bool SteamAPI_ISteamUtils_InitFilterText(uint32 unFilterOptions);
int SteamAPI_ISteamUtils_FilterText(ETextFilteringContext eContext, uint64_steamid sourceSteamID, const char * pchInputMessage, char * pchOutFilteredText, uint32 nByteSizeOutFilteredText);
ESteamIPv6ConnectivityState SteamAPI_ISteamUtils_GetIPv6ConnectivityState(ESteamIPv6ConnectivityProtocol eProtocol);
bool SteamAPI_ISteamUtils_IsSteamRunningOnSteamDeck(void);
bool SteamAPI_ISteamUtils_ShowFloatingGamepadTextInput(EFloatingGamepadTextInputMode eKeyboardMode, int nTextFieldXPosition, int nTextFieldYPosition, int nTextFieldWidth, int nTextFieldHeight);
void SteamAPI_ISteamUtils_SetGameLauncherMode(bool bLauncherMode);
bool SteamAPI_ISteamUtils_DismissFloatingGamepadTextInput(void);
bool SteamAPI_ISteamUtils_DismissGamepadTextInput(void);


int SteamAPI_ISteamMatchmaking_GetFavoriteGameCount(void);
bool SteamAPI_ISteamMatchmaking_GetFavoriteGame(int iGame, AppId_t * pnAppID, uint32 * pnIP, uint16 * pnConnPort, uint16 * pnQueryPort, uint32 * punFlags, uint32 * pRTime32LastPlayedOnServer);
int SteamAPI_ISteamMatchmaking_AddFavoriteGame(AppId_t nAppID, uint32 nIP, uint16 nConnPort, uint16 nQueryPort, uint32 unFlags, uint32 rTime32LastPlayedOnServer);
bool SteamAPI_ISteamMatchmaking_RemoveFavoriteGame(AppId_t nAppID, uint32 nIP, uint16 nConnPort, uint16 nQueryPort, uint32 unFlags);
SteamAPICall_t SteamAPI_ISteamMatchmaking_RequestLobbyList(void);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListStringFilter(const char * pchKeyToMatch, const char * pchValueToMatch, ELobbyComparison eComparisonType);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListNumericalFilter(const char * pchKeyToMatch, int nValueToMatch, ELobbyComparison eComparisonType);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListNearValueFilter(const char * pchKeyToMatch, int nValueToBeCloseTo);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListFilterSlotsAvailable(int nSlotsAvailable);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListDistanceFilter(ELobbyDistanceFilter eLobbyDistanceFilter);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListResultCountFilter(int cMaxResults);
void SteamAPI_ISteamMatchmaking_AddRequestLobbyListCompatibleMembersFilter(uint64_steamid steamIDLobby);
uint64_steamid SteamAPI_ISteamMatchmaking_GetLobbyByIndex(int iLobby);
SteamAPICall_t SteamAPI_ISteamMatchmaking_CreateLobby(ELobbyType eLobbyType, int cMaxMembers);
SteamAPICall_t SteamAPI_ISteamMatchmaking_JoinLobby(uint64_steamid steamIDLobby);
void SteamAPI_ISteamMatchmaking_LeaveLobby(uint64_steamid steamIDLobby);
bool SteamAPI_ISteamMatchmaking_InviteUserToLobby(uint64_steamid steamIDLobby, uint64_steamid steamIDInvitee);
int SteamAPI_ISteamMatchmaking_GetNumLobbyMembers(uint64_steamid steamIDLobby);
uint64_steamid SteamAPI_ISteamMatchmaking_GetLobbyMemberByIndex(uint64_steamid steamIDLobby, int iMember);
const char * SteamAPI_ISteamMatchmaking_GetLobbyData(uint64_steamid steamIDLobby, const char * pchKey);
bool SteamAPI_ISteamMatchmaking_SetLobbyData(uint64_steamid steamIDLobby, const char * pchKey, const char * pchValue);
int SteamAPI_ISteamMatchmaking_GetLobbyDataCount(uint64_steamid steamIDLobby);
bool SteamAPI_ISteamMatchmaking_GetLobbyDataByIndex(uint64_steamid steamIDLobby, int iLobbyData, char * pchKey, int cchKeyBufferSize, char * pchValue, int cchValueBufferSize);
bool SteamAPI_ISteamMatchmaking_DeleteLobbyData(uint64_steamid steamIDLobby, const char * pchKey);
const char * SteamAPI_ISteamMatchmaking_GetLobbyMemberData(uint64_steamid steamIDLobby, uint64_steamid steamIDUser, const char * pchKey);
void SteamAPI_ISteamMatchmaking_SetLobbyMemberData(uint64_steamid steamIDLobby, const char * pchKey, const char * pchValue);
bool SteamAPI_ISteamMatchmaking_SendLobbyChatMsg(uint64_steamid steamIDLobby, const void * pvMsgBody, int cubMsgBody);
int SteamAPI_ISteamMatchmaking_GetLobbyChatEntry(uint64_steamid steamIDLobby, int iChatID, CSteamID * pSteamIDUser, void * pvData, int cubData, EChatEntryType * peChatEntryType);
bool SteamAPI_ISteamMatchmaking_RequestLobbyData(uint64_steamid steamIDLobby);
void SteamAPI_ISteamMatchmaking_SetLobbyGameServer(uint64_steamid steamIDLobby, uint32 unGameServerIP, uint16 unGameServerPort, uint64_steamid steamID);
bool SteamAPI_ISteamMatchmaking_GetLobbyGameServer(uint64_steamid steamIDLobby, uint32 * punGameServerIP, uint16 * punGameServerPort, CSteamID * psteamIDGameServer);
bool SteamAPI_ISteamMatchmaking_SetLobbyMemberLimit(uint64_steamid steamIDLobby, int cMaxMembers);
int SteamAPI_ISteamMatchmaking_GetLobbyMemberLimit(uint64_steamid steamIDLobby);
bool SteamAPI_ISteamMatchmaking_SetLobbyType(uint64_steamid steamIDLobby, ELobbyType eLobbyType);
bool SteamAPI_ISteamMatchmaking_SetLobbyJoinable(uint64_steamid steamIDLobby, bool bLobbyJoinable);
uint64_steamid SteamAPI_ISteamMatchmaking_GetLobbyOwner(uint64_steamid steamIDLobby);
bool SteamAPI_ISteamMatchmaking_SetLobbyOwner(uint64_steamid steamIDLobby, uint64_steamid steamIDNewOwner);
bool SteamAPI_ISteamMatchmaking_SetLinkedLobby(uint64_steamid steamIDLobby, uint64_steamid steamIDLobbyDependent);


void SteamAPI_ISteamMatchmakingServerListResponse_ServerResponded(HServerListRequest hRequest, int iServer);
void SteamAPI_ISteamMatchmakingServerListResponse_ServerFailedToRespond(HServerListRequest hRequest, int iServer);
void SteamAPI_ISteamMatchmakingServerListResponse_RefreshComplete(HServerListRequest hRequest, EMatchMakingServerResponse response);


void SteamAPI_ISteamMatchmakingPingResponse_ServerResponded(gameserveritem_t * server);
void SteamAPI_ISteamMatchmakingPingResponse_ServerFailedToRespond(void);


void SteamAPI_ISteamMatchmakingPlayersResponse_AddPlayerToList(const char * pchName, int nScore, float flTimePlayed);
void SteamAPI_ISteamMatchmakingPlayersResponse_PlayersFailedToRespond(void);
void SteamAPI_ISteamMatchmakingPlayersResponse_PlayersRefreshComplete(void);


void SteamAPI_ISteamMatchmakingRulesResponse_RulesResponded(const char * pchRule, const char * pchValue);
void SteamAPI_ISteamMatchmakingRulesResponse_RulesFailedToRespond(void);
void SteamAPI_ISteamMatchmakingRulesResponse_RulesRefreshComplete(void);


HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestInternetServerList(AppId_t iApp, MatchMakingKeyValuePair_t ** ppchFilters, uint32 nFilters, ISteamMatchmakingServerListResponse * pRequestServersResponse);
HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestLANServerList(AppId_t iApp, ISteamMatchmakingServerListResponse * pRequestServersResponse);
HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestFriendsServerList(AppId_t iApp, MatchMakingKeyValuePair_t ** ppchFilters, uint32 nFilters, ISteamMatchmakingServerListResponse * pRequestServersResponse);
HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestFavoritesServerList(AppId_t iApp, MatchMakingKeyValuePair_t ** ppchFilters, uint32 nFilters, ISteamMatchmakingServerListResponse * pRequestServersResponse);
HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestHistoryServerList(AppId_t iApp, MatchMakingKeyValuePair_t ** ppchFilters, uint32 nFilters, ISteamMatchmakingServerListResponse * pRequestServersResponse);
HServerListRequest SteamAPI_ISteamMatchmakingServers_RequestSpectatorServerList(AppId_t iApp, MatchMakingKeyValuePair_t ** ppchFilters, uint32 nFilters, ISteamMatchmakingServerListResponse * pRequestServersResponse);
void SteamAPI_ISteamMatchmakingServers_ReleaseRequest(HServerListRequest hServerListRequest);
gameserveritem_t * SteamAPI_ISteamMatchmakingServers_GetServerDetails(HServerListRequest hRequest, int iServer);
void SteamAPI_ISteamMatchmakingServers_CancelQuery(HServerListRequest hRequest);
void SteamAPI_ISteamMatchmakingServers_RefreshQuery(HServerListRequest hRequest);
bool SteamAPI_ISteamMatchmakingServers_IsRefreshing(HServerListRequest hRequest);
int SteamAPI_ISteamMatchmakingServers_GetServerCount(HServerListRequest hRequest);
void SteamAPI_ISteamMatchmakingServers_RefreshServer(HServerListRequest hRequest, int iServer);
HServerQuery SteamAPI_ISteamMatchmakingServers_PingServer(uint32 unIP, uint16 usPort, ISteamMatchmakingPingResponse * pRequestServersResponse);
HServerQuery SteamAPI_ISteamMatchmakingServers_PlayerDetails(uint32 unIP, uint16 usPort, ISteamMatchmakingPlayersResponse * pRequestServersResponse);
HServerQuery SteamAPI_ISteamMatchmakingServers_ServerRules(uint32 unIP, uint16 usPort, ISteamMatchmakingRulesResponse * pRequestServersResponse);
void SteamAPI_ISteamMatchmakingServers_CancelServerQuery(HServerQuery hServerQuery);


EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_AddGameSearchParams(const char * pchKeyToFind, const char * pchValuesToFind);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_SearchForGameWithLobby(uint64_steamid steamIDLobby, int nPlayerMin, int nPlayerMax);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_SearchForGameSolo(int nPlayerMin, int nPlayerMax);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_AcceptGame(void);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_DeclineGame(void);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_RetrieveConnectionDetails(uint64_steamid steamIDHost, char * pchConnectionDetails, int cubConnectionDetails);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_EndGameSearch(void);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_SetGameHostParams(const char * pchKey, const char * pchValue);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_SetConnectionDetails(const char * pchConnectionDetails, int cubConnectionDetails);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_RequestPlayersForGame(int nPlayerMin, int nPlayerMax, int nMaxTeamSize);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_HostConfirmGameStart(uint64 ullUniqueGameID);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_CancelRequestPlayersForGame(void);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_SubmitPlayerResult(uint64 ullUniqueGameID, uint64_steamid steamIDPlayer, EPlayerResult_t EPlayerResult);
EGameSearchErrorCode_t SteamAPI_ISteamGameSearch_EndGame(uint64 ullUniqueGameID);


uint32 SteamAPI_ISteamParties_GetNumActiveBeacons(void);
PartyBeaconID_t SteamAPI_ISteamParties_GetBeaconByIndex(uint32 unIndex);
bool SteamAPI_ISteamParties_GetBeaconDetails(PartyBeaconID_t ulBeaconID, CSteamID * pSteamIDBeaconOwner, SteamPartyBeaconLocation_t * pLocation, char * pchMetadata, int cchMetadata);
SteamAPICall_t SteamAPI_ISteamParties_JoinParty(PartyBeaconID_t ulBeaconID);
bool SteamAPI_ISteamParties_GetNumAvailableBeaconLocations(uint32 * puNumLocations);
bool SteamAPI_ISteamParties_GetAvailableBeaconLocations(SteamPartyBeaconLocation_t * pLocationList, uint32 uMaxNumLocations);
SteamAPICall_t SteamAPI_ISteamParties_CreateBeacon(uint32 unOpenSlots, SteamPartyBeaconLocation_t * pBeaconLocation, const char * pchConnectString, const char * pchMetadata);
void SteamAPI_ISteamParties_OnReservationCompleted(PartyBeaconID_t ulBeacon, uint64_steamid steamIDUser);
void SteamAPI_ISteamParties_CancelReservation(PartyBeaconID_t ulBeacon, uint64_steamid steamIDUser);
SteamAPICall_t SteamAPI_ISteamParties_ChangeNumOpenSlots(PartyBeaconID_t ulBeacon, uint32 unOpenSlots);
bool SteamAPI_ISteamParties_DestroyBeacon(PartyBeaconID_t ulBeacon);
bool SteamAPI_ISteamParties_GetBeaconLocationData(SteamPartyBeaconLocation_t BeaconLocation, ESteamPartyBeaconLocationData eData, char * pchDataStringOut, int cchDataStringOut);


bool SteamAPI_ISteamRemoteStorage_FileWrite(const char * pchFile, const void * pvData, int32 cubData);
int32 SteamAPI_ISteamRemoteStorage_FileRead(const char * pchFile, void * pvData, int32 cubDataToRead);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_FileWriteAsync(const char * pchFile, const void * pvData, uint32 cubData);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_FileReadAsync(const char * pchFile, uint32 nOffset, uint32 cubToRead);
bool SteamAPI_ISteamRemoteStorage_FileReadAsyncComplete(SteamAPICall_t hReadCall, void * pvBuffer, uint32 cubToRead);
bool SteamAPI_ISteamRemoteStorage_FileForget(const char * pchFile);
bool SteamAPI_ISteamRemoteStorage_FileDelete(const char * pchFile);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_FileShare(const char * pchFile);
bool SteamAPI_ISteamRemoteStorage_SetSyncPlatforms(const char * pchFile, ERemoteStoragePlatform eRemoteStoragePlatform);
UGCFileWriteStreamHandle_t SteamAPI_ISteamRemoteStorage_FileWriteStreamOpen(const char * pchFile);
bool SteamAPI_ISteamRemoteStorage_FileWriteStreamWriteChunk(UGCFileWriteStreamHandle_t writeHandle, const void * pvData, int32 cubData);
bool SteamAPI_ISteamRemoteStorage_FileWriteStreamClose(UGCFileWriteStreamHandle_t writeHandle);
bool SteamAPI_ISteamRemoteStorage_FileWriteStreamCancel(UGCFileWriteStreamHandle_t writeHandle);
bool SteamAPI_ISteamRemoteStorage_FileExists(const char * pchFile);
bool SteamAPI_ISteamRemoteStorage_FilePersisted(const char * pchFile);
int32 SteamAPI_ISteamRemoteStorage_GetFileSize(const char * pchFile);
int64 SteamAPI_ISteamRemoteStorage_GetFileTimestamp(const char * pchFile);
ERemoteStoragePlatform SteamAPI_ISteamRemoteStorage_GetSyncPlatforms(const char * pchFile);
int32 SteamAPI_ISteamRemoteStorage_GetFileCount(void);
const char * SteamAPI_ISteamRemoteStorage_GetFileNameAndSize(int iFile, int32 * pnFileSizeInBytes);
bool SteamAPI_ISteamRemoteStorage_GetQuota(uint64 * pnTotalBytes, uint64 * puAvailableBytes);
bool SteamAPI_ISteamRemoteStorage_IsCloudEnabledForAccount(void);
bool SteamAPI_ISteamRemoteStorage_IsCloudEnabledForApp(void);
void SteamAPI_ISteamRemoteStorage_SetCloudEnabledForApp(bool bEnabled);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_UGCDownload(UGCHandle_t hContent, uint32 unPriority);
bool SteamAPI_ISteamRemoteStorage_GetUGCDownloadProgress(UGCHandle_t hContent, int32 * pnBytesDownloaded, int32 * pnBytesExpected);
bool SteamAPI_ISteamRemoteStorage_GetUGCDetails(UGCHandle_t hContent, AppId_t * pnAppID, char ** ppchName, int32 * pnFileSizeInBytes, CSteamID * pSteamIDOwner);
int32 SteamAPI_ISteamRemoteStorage_UGCRead(UGCHandle_t hContent, void * pvData, int32 cubDataToRead, uint32 cOffset, EUGCReadAction eAction);
int32 SteamAPI_ISteamRemoteStorage_GetCachedUGCCount(void);
UGCHandle_t SteamAPI_ISteamRemoteStorage_GetCachedUGCHandle(int32 iCachedContent);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_PublishWorkshopFile(const char * pchFile, const char * pchPreviewFile, AppId_t nConsumerAppId, const char * pchTitle, const char * pchDescription, ERemoteStoragePublishedFileVisibility eVisibility, SteamParamStringArray_t * pTags, EWorkshopFileType eWorkshopFileType);
PublishedFileUpdateHandle_t SteamAPI_ISteamRemoteStorage_CreatePublishedFileUpdateRequest(PublishedFileId_t unPublishedFileId);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileFile(PublishedFileUpdateHandle_t updateHandle, const char * pchFile);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFilePreviewFile(PublishedFileUpdateHandle_t updateHandle, const char * pchPreviewFile);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileTitle(PublishedFileUpdateHandle_t updateHandle, const char * pchTitle);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileDescription(PublishedFileUpdateHandle_t updateHandle, const char * pchDescription);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileVisibility(PublishedFileUpdateHandle_t updateHandle, ERemoteStoragePublishedFileVisibility eVisibility);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileTags(PublishedFileUpdateHandle_t updateHandle, SteamParamStringArray_t * pTags);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_CommitPublishedFileUpdate(PublishedFileUpdateHandle_t updateHandle);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_GetPublishedFileDetails(PublishedFileId_t unPublishedFileId, uint32 unMaxSecondsOld);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_DeletePublishedFile(PublishedFileId_t unPublishedFileId);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_EnumerateUserPublishedFiles(uint32 unStartIndex);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_SubscribePublishedFile(PublishedFileId_t unPublishedFileId);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_EnumerateUserSubscribedFiles(uint32 unStartIndex);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_UnsubscribePublishedFile(PublishedFileId_t unPublishedFileId);
bool SteamAPI_ISteamRemoteStorage_UpdatePublishedFileSetChangeDescription(PublishedFileUpdateHandle_t updateHandle, const char * pchChangeDescription);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_GetPublishedItemVoteDetails(PublishedFileId_t unPublishedFileId);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_UpdateUserPublishedItemVote(PublishedFileId_t unPublishedFileId, bool bVoteUp);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_GetUserPublishedItemVoteDetails(PublishedFileId_t unPublishedFileId);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_EnumerateUserSharedWorkshopFiles(uint64_steamid steamId, uint32 unStartIndex, SteamParamStringArray_t * pRequiredTags, SteamParamStringArray_t * pExcludedTags);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_PublishVideo(EWorkshopVideoProvider eVideoProvider, const char * pchVideoAccount, const char * pchVideoIdentifier, const char * pchPreviewFile, AppId_t nConsumerAppId, const char * pchTitle, const char * pchDescription, ERemoteStoragePublishedFileVisibility eVisibility, SteamParamStringArray_t * pTags);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_SetUserPublishedFileAction(PublishedFileId_t unPublishedFileId, EWorkshopFileAction eAction);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_EnumeratePublishedFilesByUserAction(EWorkshopFileAction eAction, uint32 unStartIndex);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_EnumeratePublishedWorkshopFiles(EWorkshopEnumerationType eEnumerationType, uint32 unStartIndex, uint32 unCount, uint32 unDays, SteamParamStringArray_t * pTags, SteamParamStringArray_t * pUserTags);
SteamAPICall_t SteamAPI_ISteamRemoteStorage_UGCDownloadToLocation(UGCHandle_t hContent, const char * pchLocation, uint32 unPriority);
int32 SteamAPI_ISteamRemoteStorage_GetLocalFileChangeCount(void);
const char * SteamAPI_ISteamRemoteStorage_GetLocalFileChange(int iFile, ERemoteStorageLocalFileChange * pEChangeType, ERemoteStorageFilePathType * pEFilePathType);
bool SteamAPI_ISteamRemoteStorage_BeginFileWriteBatch(void);
bool SteamAPI_ISteamRemoteStorage_EndFileWriteBatch(void);


bool SteamAPI_ISteamUserStats_RequestCurrentStats(void);
bool SteamAPI_ISteamUserStats_GetStatInt32(const char * pchName, int32 * pData);
bool SteamAPI_ISteamUserStats_GetStatFloat(const char * pchName, float * pData);
bool SteamAPI_ISteamUserStats_SetStatInt32(const char * pchName, int32 nData);
bool SteamAPI_ISteamUserStats_SetStatFloat(const char * pchName, float fData);
bool SteamAPI_ISteamUserStats_UpdateAvgRateStat(const char * pchName, float flCountThisSession, double dSessionLength);
bool SteamAPI_ISteamUserStats_GetAchievement(const char * pchName, bool * pbAchieved);
bool SteamAPI_ISteamUserStats_SetAchievement(const char * pchName);
bool SteamAPI_ISteamUserStats_ClearAchievement(const char * pchName);
bool SteamAPI_ISteamUserStats_GetAchievementAndUnlockTime(const char * pchName, bool * pbAchieved, uint32 * punUnlockTime);
bool SteamAPI_ISteamUserStats_StoreStats(void);
int SteamAPI_ISteamUserStats_GetAchievementIcon(const char * pchName);
const char * SteamAPI_ISteamUserStats_GetAchievementDisplayAttribute(const char * pchName, const char * pchKey);
bool SteamAPI_ISteamUserStats_IndicateAchievementProgress(const char * pchName, uint32 nCurProgress, uint32 nMaxProgress);
uint32 SteamAPI_ISteamUserStats_GetNumAchievements(void);
const char * SteamAPI_ISteamUserStats_GetAchievementName(uint32 iAchievement);
SteamAPICall_t SteamAPI_ISteamUserStats_RequestUserStats(uint64_steamid steamIDUser);
bool SteamAPI_ISteamUserStats_GetUserStatInt32(uint64_steamid steamIDUser, const char * pchName, int32 * pData);
bool SteamAPI_ISteamUserStats_GetUserStatFloat(uint64_steamid steamIDUser, const char * pchName, float * pData);
bool SteamAPI_ISteamUserStats_GetUserAchievement(uint64_steamid steamIDUser, const char * pchName, bool * pbAchieved);
bool SteamAPI_ISteamUserStats_GetUserAchievementAndUnlockTime(uint64_steamid steamIDUser, const char * pchName, bool * pbAchieved, uint32 * punUnlockTime);
bool SteamAPI_ISteamUserStats_ResetAllStats(bool bAchievementsToo);
SteamAPICall_t SteamAPI_ISteamUserStats_FindOrCreateLeaderboard(const char * pchLeaderboardName, ELeaderboardSortMethod eLeaderboardSortMethod, ELeaderboardDisplayType eLeaderboardDisplayType);
SteamAPICall_t SteamAPI_ISteamUserStats_FindLeaderboard(const char * pchLeaderboardName);
const char * SteamAPI_ISteamUserStats_GetLeaderboardName(SteamLeaderboard_t hSteamLeaderboard);
int SteamAPI_ISteamUserStats_GetLeaderboardEntryCount(SteamLeaderboard_t hSteamLeaderboard);
ELeaderboardSortMethod SteamAPI_ISteamUserStats_GetLeaderboardSortMethod(SteamLeaderboard_t hSteamLeaderboard);
ELeaderboardDisplayType SteamAPI_ISteamUserStats_GetLeaderboardDisplayType(SteamLeaderboard_t hSteamLeaderboard);
SteamAPICall_t SteamAPI_ISteamUserStats_DownloadLeaderboardEntries(SteamLeaderboard_t hSteamLeaderboard, ELeaderboardDataRequest eLeaderboardDataRequest, int nRangeStart, int nRangeEnd);
SteamAPICall_t SteamAPI_ISteamUserStats_DownloadLeaderboardEntriesForUsers(SteamLeaderboard_t hSteamLeaderboard, CSteamID * prgUsers, int cUsers);
bool SteamAPI_ISteamUserStats_GetDownloadedLeaderboardEntry(SteamLeaderboardEntries_t hSteamLeaderboardEntries, int index, LeaderboardEntry_t * pLeaderboardEntry, int32 * pDetails, int cDetailsMax);
SteamAPICall_t SteamAPI_ISteamUserStats_UploadLeaderboardScore(SteamLeaderboard_t hSteamLeaderboard, ELeaderboardUploadScoreMethod eLeaderboardUploadScoreMethod, int32 nScore, const int32 * pScoreDetails, int cScoreDetailsCount);
SteamAPICall_t SteamAPI_ISteamUserStats_AttachLeaderboardUGC(SteamLeaderboard_t hSteamLeaderboard, UGCHandle_t hUGC);
SteamAPICall_t SteamAPI_ISteamUserStats_GetNumberOfCurrentPlayers(void);
SteamAPICall_t SteamAPI_ISteamUserStats_RequestGlobalAchievementPercentages(void);
int SteamAPI_ISteamUserStats_GetMostAchievedAchievementInfo(char * pchName, uint32 unNameBufLen, float * pflPercent, bool * pbAchieved);
int SteamAPI_ISteamUserStats_GetNextMostAchievedAchievementInfo(int iIteratorPrevious, char * pchName, uint32 unNameBufLen, float * pflPercent, bool * pbAchieved);
bool SteamAPI_ISteamUserStats_GetAchievementAchievedPercent(const char * pchName, float * pflPercent);
SteamAPICall_t SteamAPI_ISteamUserStats_RequestGlobalStats(int nHistoryDays);
bool SteamAPI_ISteamUserStats_GetGlobalStatInt64(const char * pchStatName, int64 * pData);
bool SteamAPI_ISteamUserStats_GetGlobalStatDouble(const char * pchStatName, double * pData);
int32 SteamAPI_ISteamUserStats_GetGlobalStatHistoryInt64(const char * pchStatName, int64 * pData, uint32 cubData);
int32 SteamAPI_ISteamUserStats_GetGlobalStatHistoryDouble(const char * pchStatName, double * pData, uint32 cubData);
bool SteamAPI_ISteamUserStats_GetAchievementProgressLimitsInt32(const char * pchName, int32 * pnMinProgress, int32 * pnMaxProgress);
bool SteamAPI_ISteamUserStats_GetAchievementProgressLimitsFloat(const char * pchName, float * pfMinProgress, float * pfMaxProgress);


bool SteamAPI_ISteamApps_BIsSubscribed(void);
bool SteamAPI_ISteamApps_BIsLowViolence(void);
bool SteamAPI_ISteamApps_BIsCybercafe(void);
bool SteamAPI_ISteamApps_BIsVACBanned(void);
const char * SteamAPI_ISteamApps_GetCurrentGameLanguage(void);
const char * SteamAPI_ISteamApps_GetAvailableGameLanguages(void);
bool SteamAPI_ISteamApps_BIsSubscribedApp(AppId_t appID);
bool SteamAPI_ISteamApps_BIsDlcInstalled(AppId_t appID);
uint32 SteamAPI_ISteamApps_GetEarliestPurchaseUnixTime(AppId_t nAppID);
bool SteamAPI_ISteamApps_BIsSubscribedFromFreeWeekend(void);
int SteamAPI_ISteamApps_GetDLCCount(void);
bool SteamAPI_ISteamApps_BGetDLCDataByIndex(int iDLC, AppId_t * pAppID, bool * pbAvailable, char * pchName, int cchNameBufferSize);
void SteamAPI_ISteamApps_InstallDLC(AppId_t nAppID);
void SteamAPI_ISteamApps_UninstallDLC(AppId_t nAppID);
void SteamAPI_ISteamApps_RequestAppProofOfPurchaseKey(AppId_t nAppID);
bool SteamAPI_ISteamApps_GetCurrentBetaName(char * pchName, int cchNameBufferSize);
bool SteamAPI_ISteamApps_MarkContentCorrupt(bool bMissingFilesOnly);
uint32 SteamAPI_ISteamApps_GetInstalledDepots(AppId_t appID, DepotId_t * pvecDepots, uint32 cMaxDepots);
uint32 SteamAPI_ISteamApps_GetAppInstallDir(AppId_t appID, char * pchFolder, uint32 cchFolderBufferSize);
bool SteamAPI_ISteamApps_BIsAppInstalled(AppId_t appID);
uint64_steamid SteamAPI_ISteamApps_GetAppOwner(void);
const char * SteamAPI_ISteamApps_GetLaunchQueryParam(const char * pchKey);
bool SteamAPI_ISteamApps_GetDlcDownloadProgress(AppId_t nAppID, uint64 * punBytesDownloaded, uint64 * punBytesTotal);
int SteamAPI_ISteamApps_GetAppBuildId(void);
void SteamAPI_ISteamApps_RequestAllProofOfPurchaseKeys(void);
SteamAPICall_t SteamAPI_ISteamApps_GetFileDetails(const char * pszFileName);
int SteamAPI_ISteamApps_GetLaunchCommandLine(char * pszCommandLine, int cubCommandLine);
bool SteamAPI_ISteamApps_BIsSubscribedFromFamilySharing(void);
bool SteamAPI_ISteamApps_BIsTimedTrial(uint32 * punSecondsAllowed, uint32 * punSecondsPlayed);
bool SteamAPI_ISteamApps_SetDlcContext(AppId_t nAppID);


bool SteamAPI_ISteamNetworking_SendP2PPacket(uint64_steamid steamIDRemote, const void * pubData, uint32 cubData, EP2PSend eP2PSendType, int nChannel);
bool SteamAPI_ISteamNetworking_IsP2PPacketAvailable(uint32 * pcubMsgSize, int nChannel);
bool SteamAPI_ISteamNetworking_ReadP2PPacket(void * pubDest, uint32 cubDest, uint32 * pcubMsgSize, CSteamID * psteamIDRemote, int nChannel);
bool SteamAPI_ISteamNetworking_AcceptP2PSessionWithUser(uint64_steamid steamIDRemote);
bool SteamAPI_ISteamNetworking_CloseP2PSessionWithUser(uint64_steamid steamIDRemote);
bool SteamAPI_ISteamNetworking_CloseP2PChannelWithUser(uint64_steamid steamIDRemote, int nChannel);
bool SteamAPI_ISteamNetworking_GetP2PSessionState(uint64_steamid steamIDRemote, P2PSessionState_t * pConnectionState);
bool SteamAPI_ISteamNetworking_AllowP2PPacketRelay(bool bAllow);
SNetListenSocket_t SteamAPI_ISteamNetworking_CreateListenSocket(int nVirtualP2PPort, SteamIPAddress_t nIP, uint16 nPort, bool bAllowUseOfPacketRelay);
SNetSocket_t SteamAPI_ISteamNetworking_CreateP2PConnectionSocket(uint64_steamid steamIDTarget, int nVirtualPort, int nTimeoutSec, bool bAllowUseOfPacketRelay);
SNetSocket_t SteamAPI_ISteamNetworking_CreateConnectionSocket(SteamIPAddress_t nIP, uint16 nPort, int nTimeoutSec);
bool SteamAPI_ISteamNetworking_DestroySocket(SNetSocket_t hSocket, bool bNotifyRemoteEnd);
bool SteamAPI_ISteamNetworking_DestroyListenSocket(SNetListenSocket_t hSocket, bool bNotifyRemoteEnd);
bool SteamAPI_ISteamNetworking_SendDataOnSocket(SNetSocket_t hSocket, void * pubData, uint32 cubData, bool bReliable);
bool SteamAPI_ISteamNetworking_IsDataAvailableOnSocket(SNetSocket_t hSocket, uint32 * pcubMsgSize);
bool SteamAPI_ISteamNetworking_RetrieveDataFromSocket(SNetSocket_t hSocket, void * pubDest, uint32 cubDest, uint32 * pcubMsgSize);
bool SteamAPI_ISteamNetworking_IsDataAvailable(SNetListenSocket_t hListenSocket, uint32 * pcubMsgSize, SNetSocket_t * phSocket);
bool SteamAPI_ISteamNetworking_RetrieveData(SNetListenSocket_t hListenSocket, void * pubDest, uint32 cubDest, uint32 * pcubMsgSize, SNetSocket_t * phSocket);
bool SteamAPI_ISteamNetworking_GetSocketInfo(SNetSocket_t hSocket, CSteamID * pSteamIDRemote, int * peSocketStatus, SteamIPAddress_t * punIPRemote, uint16 * punPortRemote);
bool SteamAPI_ISteamNetworking_GetListenSocketInfo(SNetListenSocket_t hListenSocket, SteamIPAddress_t * pnIP, uint16 * pnPort);
ESNetSocketConnectionType SteamAPI_ISteamNetworking_GetSocketConnectionType(SNetSocket_t hSocket);
int SteamAPI_ISteamNetworking_GetMaxPacketSize(SNetSocket_t hSocket);


ScreenshotHandle SteamAPI_ISteamScreenshots_WriteScreenshot(void * pubRGB, uint32 cubRGB, int nWidth, int nHeight);
ScreenshotHandle SteamAPI_ISteamScreenshots_AddScreenshotToLibrary(const char * pchFilename, const char * pchThumbnailFilename, int nWidth, int nHeight);
void SteamAPI_ISteamScreenshots_TriggerScreenshot(void);
void SteamAPI_ISteamScreenshots_HookScreenshots(bool bHook);
bool SteamAPI_ISteamScreenshots_SetLocation(ScreenshotHandle hScreenshot, const char * pchLocation);
bool SteamAPI_ISteamScreenshots_TagUser(ScreenshotHandle hScreenshot, uint64_steamid steamID);
bool SteamAPI_ISteamScreenshots_TagPublishedFile(ScreenshotHandle hScreenshot, PublishedFileId_t unPublishedFileID);
bool SteamAPI_ISteamScreenshots_IsScreenshotsHooked(void);
ScreenshotHandle SteamAPI_ISteamScreenshots_AddVRScreenshotToLibrary(EVRScreenshotType eType, const char * pchFilename, const char * pchVRFilename);


bool SteamAPI_ISteamMusic_BIsEnabled(void);
bool SteamAPI_ISteamMusic_BIsPlaying(void);
AudioPlayback_Status SteamAPI_ISteamMusic_GetPlaybackStatus(void);
void SteamAPI_ISteamMusic_Play(void);
void SteamAPI_ISteamMusic_Pause(void);
void SteamAPI_ISteamMusic_PlayPrevious(void);
void SteamAPI_ISteamMusic_PlayNext(void);
void SteamAPI_ISteamMusic_SetVolume(float flVolume);
float SteamAPI_ISteamMusic_GetVolume(void);


bool SteamAPI_ISteamMusicRemote_RegisterSteamMusicRemote(const char * pchName);
bool SteamAPI_ISteamMusicRemote_DeregisterSteamMusicRemote(void);
bool SteamAPI_ISteamMusicRemote_BIsCurrentMusicRemote(void);
bool SteamAPI_ISteamMusicRemote_BActivationSuccess(bool bValue);
bool SteamAPI_ISteamMusicRemote_SetDisplayName(const char * pchDisplayName);
bool SteamAPI_ISteamMusicRemote_SetPNGIcon_64x64(void * pvBuffer, uint32 cbBufferLength);
bool SteamAPI_ISteamMusicRemote_EnablePlayPrevious(bool bValue);
bool SteamAPI_ISteamMusicRemote_EnablePlayNext(bool bValue);
bool SteamAPI_ISteamMusicRemote_EnableShuffled(bool bValue);
bool SteamAPI_ISteamMusicRemote_EnableLooped(bool bValue);
bool SteamAPI_ISteamMusicRemote_EnableQueue(bool bValue);
bool SteamAPI_ISteamMusicRemote_EnablePlaylists(bool bValue);
bool SteamAPI_ISteamMusicRemote_UpdatePlaybackStatus(AudioPlayback_Status nStatus);
bool SteamAPI_ISteamMusicRemote_UpdateShuffled(bool bValue);
bool SteamAPI_ISteamMusicRemote_UpdateLooped(bool bValue);
bool SteamAPI_ISteamMusicRemote_UpdateVolume(float flValue);
bool SteamAPI_ISteamMusicRemote_CurrentEntryWillChange(void);
bool SteamAPI_ISteamMusicRemote_CurrentEntryIsAvailable(bool bAvailable);
bool SteamAPI_ISteamMusicRemote_UpdateCurrentEntryText(const char * pchText);
bool SteamAPI_ISteamMusicRemote_UpdateCurrentEntryElapsedSeconds(int nValue);
bool SteamAPI_ISteamMusicRemote_UpdateCurrentEntryCoverArt(void * pvBuffer, uint32 cbBufferLength);
bool SteamAPI_ISteamMusicRemote_CurrentEntryDidChange(void);
bool SteamAPI_ISteamMusicRemote_QueueWillChange(void);
bool SteamAPI_ISteamMusicRemote_ResetQueueEntries(void);
bool SteamAPI_ISteamMusicRemote_SetQueueEntry(int nID, int nPosition, const char * pchEntryText);
bool SteamAPI_ISteamMusicRemote_SetCurrentQueueEntry(int nID);
bool SteamAPI_ISteamMusicRemote_QueueDidChange(void);
bool SteamAPI_ISteamMusicRemote_PlaylistWillChange(void);
bool SteamAPI_ISteamMusicRemote_ResetPlaylistEntries(void);
bool SteamAPI_ISteamMusicRemote_SetPlaylistEntry(int nID, int nPosition, const char * pchEntryText);
bool SteamAPI_ISteamMusicRemote_SetCurrentPlaylistEntry(int nID);
bool SteamAPI_ISteamMusicRemote_PlaylistDidChange(void);


HTTPRequestHandle SteamAPI_ISteamHTTP_CreateHTTPRequest(EHTTPMethod eHTTPRequestMethod, const char * pchAbsoluteURL);
bool SteamAPI_ISteamHTTP_SetHTTPRequestContextValue(HTTPRequestHandle hRequest, uint64 ulContextValue);
bool SteamAPI_ISteamHTTP_SetHTTPRequestNetworkActivityTimeout(HTTPRequestHandle hRequest, uint32 unTimeoutSeconds);
bool SteamAPI_ISteamHTTP_SetHTTPRequestHeaderValue(HTTPRequestHandle hRequest, const char * pchHeaderName, const char * pchHeaderValue);
bool SteamAPI_ISteamHTTP_SetHTTPRequestGetOrPostParameter(HTTPRequestHandle hRequest, const char * pchParamName, const char * pchParamValue);
bool SteamAPI_ISteamHTTP_SendHTTPRequest(HTTPRequestHandle hRequest, SteamAPICall_t * pCallHandle);
bool SteamAPI_ISteamHTTP_SendHTTPRequestAndStreamResponse(HTTPRequestHandle hRequest, SteamAPICall_t * pCallHandle);
bool SteamAPI_ISteamHTTP_DeferHTTPRequest(HTTPRequestHandle hRequest);
bool SteamAPI_ISteamHTTP_PrioritizeHTTPRequest(HTTPRequestHandle hRequest);
bool SteamAPI_ISteamHTTP_GetHTTPResponseHeaderSize(HTTPRequestHandle hRequest, const char * pchHeaderName, uint32 * unResponseHeaderSize);
bool SteamAPI_ISteamHTTP_GetHTTPResponseHeaderValue(HTTPRequestHandle hRequest, const char * pchHeaderName, uint8 * pHeaderValueBuffer, uint32 unBufferSize);
bool SteamAPI_ISteamHTTP_GetHTTPResponseBodySize(HTTPRequestHandle hRequest, uint32 * unBodySize);
bool SteamAPI_ISteamHTTP_GetHTTPResponseBodyData(HTTPRequestHandle hRequest, uint8 * pBodyDataBuffer, uint32 unBufferSize);
bool SteamAPI_ISteamHTTP_GetHTTPStreamingResponseBodyData(HTTPRequestHandle hRequest, uint32 cOffset, uint8 * pBodyDataBuffer, uint32 unBufferSize);
bool SteamAPI_ISteamHTTP_ReleaseHTTPRequest(HTTPRequestHandle hRequest);
bool SteamAPI_ISteamHTTP_GetHTTPDownloadProgressPct(HTTPRequestHandle hRequest, float * pflPercentOut);
bool SteamAPI_ISteamHTTP_SetHTTPRequestRawPostBody(HTTPRequestHandle hRequest, const char * pchContentType, uint8 * pubBody, uint32 unBodyLen);
HTTPCookieContainerHandle SteamAPI_ISteamHTTP_CreateCookieContainer(bool bAllowResponsesToModify);
bool SteamAPI_ISteamHTTP_ReleaseCookieContainer(HTTPCookieContainerHandle hCookieContainer);
bool SteamAPI_ISteamHTTP_SetCookie(HTTPCookieContainerHandle hCookieContainer, const char * pchHost, const char * pchUrl, const char * pchCookie);
bool SteamAPI_ISteamHTTP_SetHTTPRequestCookieContainer(HTTPRequestHandle hRequest, HTTPCookieContainerHandle hCookieContainer);
bool SteamAPI_ISteamHTTP_SetHTTPRequestUserAgentInfo(HTTPRequestHandle hRequest, const char * pchUserAgentInfo);
bool SteamAPI_ISteamHTTP_SetHTTPRequestRequiresVerifiedCertificate(HTTPRequestHandle hRequest, bool bRequireVerifiedCertificate);
bool SteamAPI_ISteamHTTP_SetHTTPRequestAbsoluteTimeoutMS(HTTPRequestHandle hRequest, uint32 unMilliseconds);
bool SteamAPI_ISteamHTTP_GetHTTPRequestWasTimedOut(HTTPRequestHandle hRequest, bool * pbWasTimedOut);


bool SteamAPI_ISteamInput_Init(bool bExplicitlyCallRunFrame);
bool SteamAPI_ISteamInput_Shutdown(void);
bool SteamAPI_ISteamInput_SetInputActionManifestFilePath(const char * pchInputActionManifestAbsolutePath);
void SteamAPI_ISteamInput_RunFrame(bool bReservedValue);
bool SteamAPI_ISteamInput_BWaitForData(bool bWaitForever, uint32 unTimeout);
bool SteamAPI_ISteamInput_BNewDataAvailable(void);
int SteamAPI_ISteamInput_GetConnectedControllers(InputHandle_t * handlesOut);
void SteamAPI_ISteamInput_EnableDeviceCallbacks(void);
void SteamAPI_ISteamInput_EnableActionEventCallbacks(SteamInputActionEventCallbackPointer pCallback);
InputActionSetHandle_t SteamAPI_ISteamInput_GetActionSetHandle(const char * pszActionSetName);
void SteamAPI_ISteamInput_ActivateActionSet(InputHandle_t inputHandle, InputActionSetHandle_t actionSetHandle);
InputActionSetHandle_t SteamAPI_ISteamInput_GetCurrentActionSet(InputHandle_t inputHandle);
void SteamAPI_ISteamInput_ActivateActionSetLayer(InputHandle_t inputHandle, InputActionSetHandle_t actionSetLayerHandle);
void SteamAPI_ISteamInput_DeactivateActionSetLayer(InputHandle_t inputHandle, InputActionSetHandle_t actionSetLayerHandle);
void SteamAPI_ISteamInput_DeactivateAllActionSetLayers(InputHandle_t inputHandle);
int SteamAPI_ISteamInput_GetActiveActionSetLayers(InputHandle_t inputHandle, InputActionSetHandle_t * handlesOut);
InputDigitalActionHandle_t SteamAPI_ISteamInput_GetDigitalActionHandle(const char * pszActionName);
InputDigitalActionData_t SteamAPI_ISteamInput_GetDigitalActionData(InputHandle_t inputHandle, InputDigitalActionHandle_t digitalActionHandle);
int SteamAPI_ISteamInput_GetDigitalActionOrigins(InputHandle_t inputHandle, InputActionSetHandle_t actionSetHandle, InputDigitalActionHandle_t digitalActionHandle, EInputActionOrigin * originsOut);
const char * SteamAPI_ISteamInput_GetStringForDigitalActionName(InputDigitalActionHandle_t eActionHandle);
InputAnalogActionHandle_t SteamAPI_ISteamInput_GetAnalogActionHandle(const char * pszActionName);
InputAnalogActionData_t SteamAPI_ISteamInput_GetAnalogActionData(InputHandle_t inputHandle, InputAnalogActionHandle_t analogActionHandle);
int SteamAPI_ISteamInput_GetAnalogActionOrigins(InputHandle_t inputHandle, InputActionSetHandle_t actionSetHandle, InputAnalogActionHandle_t analogActionHandle, EInputActionOrigin * originsOut);
const char * SteamAPI_ISteamInput_GetGlyphPNGForActionOrigin(EInputActionOrigin eOrigin, ESteamInputGlyphSize eSize, uint32 unFlags);
const char * SteamAPI_ISteamInput_GetGlyphSVGForActionOrigin(EInputActionOrigin eOrigin, uint32 unFlags);
const char * SteamAPI_ISteamInput_GetGlyphForActionOrigin_Legacy(EInputActionOrigin eOrigin);
const char * SteamAPI_ISteamInput_GetStringForActionOrigin(EInputActionOrigin eOrigin);
const char * SteamAPI_ISteamInput_GetStringForAnalogActionName(InputAnalogActionHandle_t eActionHandle);
void SteamAPI_ISteamInput_StopAnalogActionMomentum(InputHandle_t inputHandle, InputAnalogActionHandle_t eAction);
InputMotionData_t SteamAPI_ISteamInput_GetMotionData(InputHandle_t inputHandle);
void SteamAPI_ISteamInput_TriggerVibration(InputHandle_t inputHandle, unsigned short usLeftSpeed, unsigned short usRightSpeed);
void SteamAPI_ISteamInput_TriggerVibrationExtended(InputHandle_t inputHandle, unsigned short usLeftSpeed, unsigned short usRightSpeed, unsigned short usLeftTriggerSpeed, unsigned short usRightTriggerSpeed);
void SteamAPI_ISteamInput_TriggerSimpleHapticEvent(InputHandle_t inputHandle, EControllerHapticLocation eHapticLocation, uint8 nIntensity, char nGainDB, uint8 nOtherIntensity, char nOtherGainDB);
void SteamAPI_ISteamInput_SetLEDColor(InputHandle_t inputHandle, uint8 nColorR, uint8 nColorG, uint8 nColorB, unsigned int nFlags);
void SteamAPI_ISteamInput_Legacy_TriggerHapticPulse(InputHandle_t inputHandle, ESteamControllerPad eTargetPad, unsigned short usDurationMicroSec);
void SteamAPI_ISteamInput_Legacy_TriggerRepeatedHapticPulse(InputHandle_t inputHandle, ESteamControllerPad eTargetPad, unsigned short usDurationMicroSec, unsigned short usOffMicroSec, unsigned short unRepeat, unsigned int nFlags);
bool SteamAPI_ISteamInput_ShowBindingPanel(InputHandle_t inputHandle);
ESteamInputType SteamAPI_ISteamInput_GetInputTypeForHandle(InputHandle_t inputHandle);
InputHandle_t SteamAPI_ISteamInput_GetControllerForGamepadIndex(int nIndex);
int SteamAPI_ISteamInput_GetGamepadIndexForController(InputHandle_t ulinputHandle);
const char * SteamAPI_ISteamInput_GetStringForXboxOrigin(EXboxOrigin eOrigin);
const char * SteamAPI_ISteamInput_GetGlyphForXboxOrigin(EXboxOrigin eOrigin);
EInputActionOrigin SteamAPI_ISteamInput_GetActionOriginFromXboxOrigin(InputHandle_t inputHandle, EXboxOrigin eOrigin);
EInputActionOrigin SteamAPI_ISteamInput_TranslateActionOrigin(ESteamInputType eDestinationInputType, EInputActionOrigin eSourceOrigin);
bool SteamAPI_ISteamInput_GetDeviceBindingRevision(InputHandle_t inputHandle, int * pMajor, int * pMinor);
uint32 SteamAPI_ISteamInput_GetRemotePlaySessionID(InputHandle_t inputHandle);
uint16 SteamAPI_ISteamInput_GetSessionInputConfigurationSettings(void);
//void SteamAPI_ISteamInput_SetDualSenseTriggerEffect(InputHandle_t inputHandle, const ScePadTriggerEffectParam * pParam);


bool SteamAPI_ISteamController_Init(void);
bool SteamAPI_ISteamController_Shutdown(void);
void SteamAPI_ISteamController_RunFrame(void);
int SteamAPI_ISteamController_GetConnectedControllers(ControllerHandle_t * handlesOut);
ControllerActionSetHandle_t SteamAPI_ISteamController_GetActionSetHandle(const char * pszActionSetName);
void SteamAPI_ISteamController_ActivateActionSet(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t actionSetHandle);
ControllerActionSetHandle_t SteamAPI_ISteamController_GetCurrentActionSet(ControllerHandle_t controllerHandle);
void SteamAPI_ISteamController_ActivateActionSetLayer(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t actionSetLayerHandle);
void SteamAPI_ISteamController_DeactivateActionSetLayer(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t actionSetLayerHandle);
void SteamAPI_ISteamController_DeactivateAllActionSetLayers(ControllerHandle_t controllerHandle);
int SteamAPI_ISteamController_GetActiveActionSetLayers(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t * handlesOut);
ControllerDigitalActionHandle_t SteamAPI_ISteamController_GetDigitalActionHandle(const char * pszActionName);
InputDigitalActionData_t SteamAPI_ISteamController_GetDigitalActionData(ControllerHandle_t controllerHandle, ControllerDigitalActionHandle_t digitalActionHandle);
int SteamAPI_ISteamController_GetDigitalActionOrigins(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t actionSetHandle, ControllerDigitalActionHandle_t digitalActionHandle, EControllerActionOrigin * originsOut);
ControllerAnalogActionHandle_t SteamAPI_ISteamController_GetAnalogActionHandle(const char * pszActionName);
InputAnalogActionData_t SteamAPI_ISteamController_GetAnalogActionData(ControllerHandle_t controllerHandle, ControllerAnalogActionHandle_t analogActionHandle);
int SteamAPI_ISteamController_GetAnalogActionOrigins(ControllerHandle_t controllerHandle, ControllerActionSetHandle_t actionSetHandle, ControllerAnalogActionHandle_t analogActionHandle, EControllerActionOrigin * originsOut);
const char * SteamAPI_ISteamController_GetGlyphForActionOrigin(EControllerActionOrigin eOrigin);
const char * SteamAPI_ISteamController_GetStringForActionOrigin(EControllerActionOrigin eOrigin);
void SteamAPI_ISteamController_StopAnalogActionMomentum(ControllerHandle_t controllerHandle, ControllerAnalogActionHandle_t eAction);
InputMotionData_t SteamAPI_ISteamController_GetMotionData(ControllerHandle_t controllerHandle);
void SteamAPI_ISteamController_TriggerHapticPulse(ControllerHandle_t controllerHandle, ESteamControllerPad eTargetPad, unsigned short usDurationMicroSec);
void SteamAPI_ISteamController_TriggerRepeatedHapticPulse(ControllerHandle_t controllerHandle, ESteamControllerPad eTargetPad, unsigned short usDurationMicroSec, unsigned short usOffMicroSec, unsigned short unRepeat, unsigned int nFlags);
void SteamAPI_ISteamController_TriggerVibration(ControllerHandle_t controllerHandle, unsigned short usLeftSpeed, unsigned short usRightSpeed);
void SteamAPI_ISteamController_SetLEDColor(ControllerHandle_t controllerHandle, uint8 nColorR, uint8 nColorG, uint8 nColorB, unsigned int nFlags);
bool SteamAPI_ISteamController_ShowBindingPanel(ControllerHandle_t controllerHandle);
ESteamInputType SteamAPI_ISteamController_GetInputTypeForHandle(ControllerHandle_t controllerHandle);
ControllerHandle_t SteamAPI_ISteamController_GetControllerForGamepadIndex(int nIndex);
int SteamAPI_ISteamController_GetGamepadIndexForController(ControllerHandle_t ulControllerHandle);
const char * SteamAPI_ISteamController_GetStringForXboxOrigin(EXboxOrigin eOrigin);
const char * SteamAPI_ISteamController_GetGlyphForXboxOrigin(EXboxOrigin eOrigin);
EControllerActionOrigin SteamAPI_ISteamController_GetActionOriginFromXboxOrigin(ControllerHandle_t controllerHandle, EXboxOrigin eOrigin);
EControllerActionOrigin SteamAPI_ISteamController_TranslateActionOrigin(ESteamInputType eDestinationInputType, EControllerActionOrigin eSourceOrigin);
bool SteamAPI_ISteamController_GetControllerBindingRevision(ControllerHandle_t controllerHandle, int * pMajor, int * pMinor);


UGCQueryHandle_t SteamAPI_ISteamUGC_CreateQueryUserUGCRequest(AccountID_t unAccountID, EUserUGCList eListType, EUGCMatchingUGCType eMatchingUGCType, EUserUGCListSortOrder eSortOrder, AppId_t nCreatorAppID, AppId_t nConsumerAppID, uint32 unPage);
UGCQueryHandle_t SteamAPI_ISteamUGC_CreateQueryAllUGCRequestPage(EUGCQuery eQueryType, EUGCMatchingUGCType eMatchingeMatchingUGCTypeFileType, AppId_t nCreatorAppID, AppId_t nConsumerAppID, uint32 unPage);
UGCQueryHandle_t SteamAPI_ISteamUGC_CreateQueryAllUGCRequestCursor(EUGCQuery eQueryType, EUGCMatchingUGCType eMatchingeMatchingUGCTypeFileType, AppId_t nCreatorAppID, AppId_t nConsumerAppID, const char * pchCursor);
UGCQueryHandle_t SteamAPI_ISteamUGC_CreateQueryUGCDetailsRequest(PublishedFileId_t * pvecPublishedFileID, uint32 unNumPublishedFileIDs);
SteamAPICall_t SteamAPI_ISteamUGC_SendQueryUGCRequest(UGCQueryHandle_t handle);
bool SteamAPI_ISteamUGC_GetQueryUGCResult(UGCQueryHandle_t handle, uint32 index, SteamUGCDetails_t * pDetails);
uint32 SteamAPI_ISteamUGC_GetQueryUGCNumTags(UGCQueryHandle_t handle, uint32 index);
bool SteamAPI_ISteamUGC_GetQueryUGCTag(UGCQueryHandle_t handle, uint32 index, uint32 indexTag, char * pchValue, uint32 cchValueSize);
bool SteamAPI_ISteamUGC_GetQueryUGCTagDisplayName(UGCQueryHandle_t handle, uint32 index, uint32 indexTag, char * pchValue, uint32 cchValueSize);
bool SteamAPI_ISteamUGC_GetQueryUGCPreviewURL(UGCQueryHandle_t handle, uint32 index, char * pchURL, uint32 cchURLSize);
bool SteamAPI_ISteamUGC_GetQueryUGCMetadata(UGCQueryHandle_t handle, uint32 index, char * pchMetadata, uint32 cchMetadatasize);
bool SteamAPI_ISteamUGC_GetQueryUGCChildren(UGCQueryHandle_t handle, uint32 index, PublishedFileId_t * pvecPublishedFileID, uint32 cMaxEntries);
bool SteamAPI_ISteamUGC_GetQueryUGCStatistic(UGCQueryHandle_t handle, uint32 index, EItemStatistic eStatType, uint64 * pStatValue);
uint32 SteamAPI_ISteamUGC_GetQueryUGCNumAdditionalPreviews(UGCQueryHandle_t handle, uint32 index);
bool SteamAPI_ISteamUGC_GetQueryUGCAdditionalPreview(UGCQueryHandle_t handle, uint32 index, uint32 previewIndex, char * pchURLOrVideoID, uint32 cchURLSize, char * pchOriginalFileName, uint32 cchOriginalFileNameSize, EItemPreviewType * pPreviewType);
uint32 SteamAPI_ISteamUGC_GetQueryUGCNumKeyValueTags(UGCQueryHandle_t handle, uint32 index);
bool SteamAPI_ISteamUGC_GetQueryUGCKeyValueTag(UGCQueryHandle_t handle, uint32 index, uint32 keyValueTagIndex, char * pchKey, uint32 cchKeySize, char * pchValue, uint32 cchValueSize);
bool SteamAPI_ISteamUGC_GetQueryFirstUGCKeyValueTag(UGCQueryHandle_t handle, uint32 index, const char * pchKey, char * pchValue, uint32 cchValueSize);
uint32 SteamAPI_ISteamUGC_GetQueryUGCContentDescriptors(UGCQueryHandle_t handle, uint32 index, EUGCContentDescriptorID * pvecDescriptors, uint32 cMaxEntries);
bool SteamAPI_ISteamUGC_ReleaseQueryUGCRequest(UGCQueryHandle_t handle);
bool SteamAPI_ISteamUGC_AddRequiredTag(UGCQueryHandle_t handle, const char * pTagName);
bool SteamAPI_ISteamUGC_AddRequiredTagGroup(UGCQueryHandle_t handle, const SteamParamStringArray_t * pTagGroups);
bool SteamAPI_ISteamUGC_AddExcludedTag(UGCQueryHandle_t handle, const char * pTagName);
bool SteamAPI_ISteamUGC_SetReturnOnlyIDs(UGCQueryHandle_t handle, bool bReturnOnlyIDs);
bool SteamAPI_ISteamUGC_SetReturnKeyValueTags(UGCQueryHandle_t handle, bool bReturnKeyValueTags);
bool SteamAPI_ISteamUGC_SetReturnLongDescription(UGCQueryHandle_t handle, bool bReturnLongDescription);
bool SteamAPI_ISteamUGC_SetReturnMetadata(UGCQueryHandle_t handle, bool bReturnMetadata);
bool SteamAPI_ISteamUGC_SetReturnChildren(UGCQueryHandle_t handle, bool bReturnChildren);
bool SteamAPI_ISteamUGC_SetReturnAdditionalPreviews(UGCQueryHandle_t handle, bool bReturnAdditionalPreviews);
bool SteamAPI_ISteamUGC_SetReturnTotalOnly(UGCQueryHandle_t handle, bool bReturnTotalOnly);
bool SteamAPI_ISteamUGC_SetReturnPlaytimeStats(UGCQueryHandle_t handle, uint32 unDays);
bool SteamAPI_ISteamUGC_SetLanguage(UGCQueryHandle_t handle, const char * pchLanguage);
bool SteamAPI_ISteamUGC_SetAllowCachedResponse(UGCQueryHandle_t handle, uint32 unMaxAgeSeconds);
bool SteamAPI_ISteamUGC_SetCloudFileNameFilter(UGCQueryHandle_t handle, const char * pMatchCloudFileName);
bool SteamAPI_ISteamUGC_SetMatchAnyTag(UGCQueryHandle_t handle, bool bMatchAnyTag);
bool SteamAPI_ISteamUGC_SetSearchText(UGCQueryHandle_t handle, const char * pSearchText);
bool SteamAPI_ISteamUGC_SetRankedByTrendDays(UGCQueryHandle_t handle, uint32 unDays);
bool SteamAPI_ISteamUGC_SetTimeCreatedDateRange(UGCQueryHandle_t handle, RTime32 rtStart, RTime32 rtEnd);
bool SteamAPI_ISteamUGC_SetTimeUpdatedDateRange(UGCQueryHandle_t handle, RTime32 rtStart, RTime32 rtEnd);
bool SteamAPI_ISteamUGC_AddRequiredKeyValueTag(UGCQueryHandle_t handle, const char * pKey, const char * pValue);
SteamAPICall_t SteamAPI_ISteamUGC_RequestUGCDetails(PublishedFileId_t nPublishedFileID, uint32 unMaxAgeSeconds);
SteamAPICall_t SteamAPI_ISteamUGC_CreateItem(AppId_t nConsumerAppId, EWorkshopFileType eFileType);
UGCUpdateHandle_t SteamAPI_ISteamUGC_StartItemUpdate(AppId_t nConsumerAppId, PublishedFileId_t nPublishedFileID);
bool SteamAPI_ISteamUGC_SetItemTitle(UGCUpdateHandle_t handle, const char * pchTitle);
bool SteamAPI_ISteamUGC_SetItemDescription(UGCUpdateHandle_t handle, const char * pchDescription);
bool SteamAPI_ISteamUGC_SetItemUpdateLanguage(UGCUpdateHandle_t handle, const char * pchLanguage);
bool SteamAPI_ISteamUGC_SetItemMetadata(UGCUpdateHandle_t handle, const char * pchMetaData);
bool SteamAPI_ISteamUGC_SetItemVisibility(UGCUpdateHandle_t handle, ERemoteStoragePublishedFileVisibility eVisibility);
bool SteamAPI_ISteamUGC_SetItemTags(UGCUpdateHandle_t updateHandle, const SteamParamStringArray_t * pTags, bool bAllowAdminTags);
bool SteamAPI_ISteamUGC_SetItemContent(UGCUpdateHandle_t handle, const char * pszContentFolder);
bool SteamAPI_ISteamUGC_SetItemPreview(UGCUpdateHandle_t handle, const char * pszPreviewFile);
bool SteamAPI_ISteamUGC_SetAllowLegacyUpload(UGCUpdateHandle_t handle, bool bAllowLegacyUpload);
bool SteamAPI_ISteamUGC_RemoveAllItemKeyValueTags(UGCUpdateHandle_t handle);
bool SteamAPI_ISteamUGC_RemoveItemKeyValueTags(UGCUpdateHandle_t handle, const char * pchKey);
bool SteamAPI_ISteamUGC_AddItemKeyValueTag(UGCUpdateHandle_t handle, const char * pchKey, const char * pchValue);
bool SteamAPI_ISteamUGC_AddItemPreviewFile(UGCUpdateHandle_t handle, const char * pszPreviewFile, EItemPreviewType type);
bool SteamAPI_ISteamUGC_AddItemPreviewVideo(UGCUpdateHandle_t handle, const char * pszVideoID);
bool SteamAPI_ISteamUGC_UpdateItemPreviewFile(UGCUpdateHandle_t handle, uint32 index, const char * pszPreviewFile);
bool SteamAPI_ISteamUGC_UpdateItemPreviewVideo(UGCUpdateHandle_t handle, uint32 index, const char * pszVideoID);
bool SteamAPI_ISteamUGC_RemoveItemPreview(UGCUpdateHandle_t handle, uint32 index);
bool SteamAPI_ISteamUGC_AddContentDescriptor(UGCUpdateHandle_t handle, EUGCContentDescriptorID descid);
bool SteamAPI_ISteamUGC_RemoveContentDescriptor(UGCUpdateHandle_t handle, EUGCContentDescriptorID descid);
SteamAPICall_t SteamAPI_ISteamUGC_SubmitItemUpdate(UGCUpdateHandle_t handle, const char * pchChangeNote);
EItemUpdateStatus SteamAPI_ISteamUGC_GetItemUpdateProgress(UGCUpdateHandle_t handle, uint64 * punBytesProcessed, uint64 * punBytesTotal);
SteamAPICall_t SteamAPI_ISteamUGC_SetUserItemVote(PublishedFileId_t nPublishedFileID, bool bVoteUp);
SteamAPICall_t SteamAPI_ISteamUGC_GetUserItemVote(PublishedFileId_t nPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_AddItemToFavorites(AppId_t nAppId, PublishedFileId_t nPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_RemoveItemFromFavorites(AppId_t nAppId, PublishedFileId_t nPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_SubscribeItem(PublishedFileId_t nPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_UnsubscribeItem(PublishedFileId_t nPublishedFileID);
uint32 SteamAPI_ISteamUGC_GetNumSubscribedItems(void);
uint32 SteamAPI_ISteamUGC_GetSubscribedItems(PublishedFileId_t * pvecPublishedFileID, uint32 cMaxEntries);
uint32 SteamAPI_ISteamUGC_GetItemState(PublishedFileId_t nPublishedFileID);
bool SteamAPI_ISteamUGC_GetItemInstallInfo(PublishedFileId_t nPublishedFileID, uint64 * punSizeOnDisk, char * pchFolder, uint32 cchFolderSize, uint32 * punTimeStamp);
bool SteamAPI_ISteamUGC_GetItemDownloadInfo(PublishedFileId_t nPublishedFileID, uint64 * punBytesDownloaded, uint64 * punBytesTotal);
bool SteamAPI_ISteamUGC_DownloadItem(PublishedFileId_t nPublishedFileID, bool bHighPriority);
bool SteamAPI_ISteamUGC_BInitWorkshopForGameServer(DepotId_t unWorkshopDepotID, const char * pszFolder);
void SteamAPI_ISteamUGC_SuspendDownloads(bool bSuspend);
SteamAPICall_t SteamAPI_ISteamUGC_StartPlaytimeTracking(PublishedFileId_t * pvecPublishedFileID, uint32 unNumPublishedFileIDs);
SteamAPICall_t SteamAPI_ISteamUGC_StopPlaytimeTracking(PublishedFileId_t * pvecPublishedFileID, uint32 unNumPublishedFileIDs);
SteamAPICall_t SteamAPI_ISteamUGC_StopPlaytimeTrackingForAllItems(void);
SteamAPICall_t SteamAPI_ISteamUGC_AddDependency(PublishedFileId_t nParentPublishedFileID, PublishedFileId_t nChildPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_RemoveDependency(PublishedFileId_t nParentPublishedFileID, PublishedFileId_t nChildPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_AddAppDependency(PublishedFileId_t nPublishedFileID, AppId_t nAppID);
SteamAPICall_t SteamAPI_ISteamUGC_RemoveAppDependency(PublishedFileId_t nPublishedFileID, AppId_t nAppID);
SteamAPICall_t SteamAPI_ISteamUGC_GetAppDependencies(PublishedFileId_t nPublishedFileID);
SteamAPICall_t SteamAPI_ISteamUGC_DeleteItem(PublishedFileId_t nPublishedFileID);
bool SteamAPI_ISteamUGC_ShowWorkshopEULA(void);
SteamAPICall_t SteamAPI_ISteamUGC_GetWorkshopEULAStatus(void);
uint32 SteamAPI_ISteamUGC_GetUserContentDescriptorPreferences(EUGCContentDescriptorID * pvecDescriptors, uint32 cMaxEntries);


bool SteamAPI_ISteamHTMLSurface_Init(void);
bool SteamAPI_ISteamHTMLSurface_Shutdown(void);
SteamAPICall_t SteamAPI_ISteamHTMLSurface_CreateBrowser(const char * pchUserAgent, const char * pchUserCSS);
void SteamAPI_ISteamHTMLSurface_RemoveBrowser(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_LoadURL(HHTMLBrowser unBrowserHandle, const char * pchURL, const char * pchPostData);
void SteamAPI_ISteamHTMLSurface_SetSize(HHTMLBrowser unBrowserHandle, uint32 unWidth, uint32 unHeight);
void SteamAPI_ISteamHTMLSurface_StopLoad(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_Reload(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_GoBack(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_GoForward(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_AddHeader(HHTMLBrowser unBrowserHandle, const char * pchKey, const char * pchValue);
void SteamAPI_ISteamHTMLSurface_ExecuteJavascript(HHTMLBrowser unBrowserHandle, const char * pchScript);
void SteamAPI_ISteamHTMLSurface_MouseUp(HHTMLBrowser unBrowserHandle, EHTMLMouseButton eMouseButton);
void SteamAPI_ISteamHTMLSurface_MouseDown(HHTMLBrowser unBrowserHandle, EHTMLMouseButton eMouseButton);
void SteamAPI_ISteamHTMLSurface_MouseDoubleClick(HHTMLBrowser unBrowserHandle, EHTMLMouseButton eMouseButton);
void SteamAPI_ISteamHTMLSurface_MouseMove(HHTMLBrowser unBrowserHandle, int x, int y);
void SteamAPI_ISteamHTMLSurface_MouseWheel(HHTMLBrowser unBrowserHandle, int32 nDelta);
void SteamAPI_ISteamHTMLSurface_KeyDown(HHTMLBrowser unBrowserHandle, uint32 nNativeKeyCode, EHTMLKeyModifiers eHTMLKeyModifiers, bool bIsSystemKey);
void SteamAPI_ISteamHTMLSurface_KeyUp(HHTMLBrowser unBrowserHandle, uint32 nNativeKeyCode, EHTMLKeyModifiers eHTMLKeyModifiers);
void SteamAPI_ISteamHTMLSurface_KeyChar(HHTMLBrowser unBrowserHandle, uint32 cUnicodeChar, EHTMLKeyModifiers eHTMLKeyModifiers);
void SteamAPI_ISteamHTMLSurface_SetHorizontalScroll(HHTMLBrowser unBrowserHandle, uint32 nAbsolutePixelScroll);
void SteamAPI_ISteamHTMLSurface_SetVerticalScroll(HHTMLBrowser unBrowserHandle, uint32 nAbsolutePixelScroll);
void SteamAPI_ISteamHTMLSurface_SetKeyFocus(HHTMLBrowser unBrowserHandle, bool bHasKeyFocus);
void SteamAPI_ISteamHTMLSurface_ViewSource(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_CopyToClipboard(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_PasteFromClipboard(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_Find(HHTMLBrowser unBrowserHandle, const char * pchSearchStr, bool bCurrentlyInFind, bool bReverse);
void SteamAPI_ISteamHTMLSurface_StopFind(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_GetLinkAtPosition(HHTMLBrowser unBrowserHandle, int x, int y);
void SteamAPI_ISteamHTMLSurface_SetCookie(const char * pchHostname, const char * pchKey, const char * pchValue, const char * pchPath, RTime32 nExpires, bool bSecure, bool bHTTPOnly);
void SteamAPI_ISteamHTMLSurface_SetPageScaleFactor(HHTMLBrowser unBrowserHandle, float flZoom, int nPointX, int nPointY);
void SteamAPI_ISteamHTMLSurface_SetBackgroundMode(HHTMLBrowser unBrowserHandle, bool bBackgroundMode);
void SteamAPI_ISteamHTMLSurface_SetDPIScalingFactor(HHTMLBrowser unBrowserHandle, float flDPIScaling);
void SteamAPI_ISteamHTMLSurface_OpenDeveloperTools(HHTMLBrowser unBrowserHandle);
void SteamAPI_ISteamHTMLSurface_AllowStartRequest(HHTMLBrowser unBrowserHandle, bool bAllowed);
void SteamAPI_ISteamHTMLSurface_JSDialogResponse(HHTMLBrowser unBrowserHandle, bool bResult);
void SteamAPI_ISteamHTMLSurface_FileLoadDialogResponse(HHTMLBrowser unBrowserHandle, const char ** pchSelectedFiles);


EResult SteamAPI_ISteamInventory_GetResultStatus(SteamInventoryResult_t resultHandle);
bool SteamAPI_ISteamInventory_GetResultItems(SteamInventoryResult_t resultHandle, SteamItemDetails_t * pOutItemsArray, uint32 * punOutItemsArraySize);
bool SteamAPI_ISteamInventory_GetResultItemProperty(SteamInventoryResult_t resultHandle, uint32 unItemIndex, const char * pchPropertyName, char * pchValueBuffer, uint32 * punValueBufferSizeOut);
uint32 SteamAPI_ISteamInventory_GetResultTimestamp(SteamInventoryResult_t resultHandle);
bool SteamAPI_ISteamInventory_CheckResultSteamID(SteamInventoryResult_t resultHandle, uint64_steamid steamIDExpected);
void SteamAPI_ISteamInventory_DestroyResult(SteamInventoryResult_t resultHandle);
bool SteamAPI_ISteamInventory_GetAllItems(SteamInventoryResult_t * pResultHandle);
bool SteamAPI_ISteamInventory_GetItemsByID(SteamInventoryResult_t * pResultHandle, const SteamItemInstanceID_t * pInstanceIDs, uint32 unCountInstanceIDs);
bool SteamAPI_ISteamInventory_SerializeResult(SteamInventoryResult_t resultHandle, void * pOutBuffer, uint32 * punOutBufferSize);
bool SteamAPI_ISteamInventory_DeserializeResult(SteamInventoryResult_t * pOutResultHandle, const void * pBuffer, uint32 unBufferSize, bool bRESERVED_MUST_BE_FALSE);
bool SteamAPI_ISteamInventory_GenerateItems(SteamInventoryResult_t * pResultHandle, const SteamItemDef_t * pArrayItemDefs, const uint32 * punArrayQuantity, uint32 unArrayLength);
bool SteamAPI_ISteamInventory_GrantPromoItems(SteamInventoryResult_t * pResultHandle);
bool SteamAPI_ISteamInventory_AddPromoItem(SteamInventoryResult_t * pResultHandle, SteamItemDef_t itemDef);
bool SteamAPI_ISteamInventory_AddPromoItems(SteamInventoryResult_t * pResultHandle, const SteamItemDef_t * pArrayItemDefs, uint32 unArrayLength);
bool SteamAPI_ISteamInventory_ConsumeItem(SteamInventoryResult_t * pResultHandle, SteamItemInstanceID_t itemConsume, uint32 unQuantity);
bool SteamAPI_ISteamInventory_ExchangeItems(SteamInventoryResult_t * pResultHandle, const SteamItemDef_t * pArrayGenerate, const uint32 * punArrayGenerateQuantity, uint32 unArrayGenerateLength, const SteamItemInstanceID_t * pArrayDestroy, const uint32 * punArrayDestroyQuantity, uint32 unArrayDestroyLength);
bool SteamAPI_ISteamInventory_TransferItemQuantity(SteamInventoryResult_t * pResultHandle, SteamItemInstanceID_t itemIdSource, uint32 unQuantity, SteamItemInstanceID_t itemIdDest);
void SteamAPI_ISteamInventory_SendItemDropHeartbeat(void);
bool SteamAPI_ISteamInventory_TriggerItemDrop(SteamInventoryResult_t * pResultHandle, SteamItemDef_t dropListDefinition);
bool SteamAPI_ISteamInventory_TradeItems(SteamInventoryResult_t * pResultHandle, uint64_steamid steamIDTradePartner, const SteamItemInstanceID_t * pArrayGive, const uint32 * pArrayGiveQuantity, uint32 nArrayGiveLength, const SteamItemInstanceID_t * pArrayGet, const uint32 * pArrayGetQuantity, uint32 nArrayGetLength);
bool SteamAPI_ISteamInventory_LoadItemDefinitions(void);
bool SteamAPI_ISteamInventory_GetItemDefinitionIDs(SteamItemDef_t * pItemDefIDs, uint32 * punItemDefIDsArraySize);
bool SteamAPI_ISteamInventory_GetItemDefinitionProperty(SteamItemDef_t iDefinition, const char * pchPropertyName, char * pchValueBuffer, uint32 * punValueBufferSizeOut);
SteamAPICall_t SteamAPI_ISteamInventory_RequestEligiblePromoItemDefinitionsIDs(uint64_steamid steamID);
bool SteamAPI_ISteamInventory_GetEligiblePromoItemDefinitionIDs(uint64_steamid steamID, SteamItemDef_t * pItemDefIDs, uint32 * punItemDefIDsArraySize);
SteamAPICall_t SteamAPI_ISteamInventory_StartPurchase(const SteamItemDef_t * pArrayItemDefs, const uint32 * punArrayQuantity, uint32 unArrayLength);
SteamAPICall_t SteamAPI_ISteamInventory_RequestPrices(void);
uint32 SteamAPI_ISteamInventory_GetNumItemsWithPrices(void);
bool SteamAPI_ISteamInventory_GetItemsWithPrices(SteamItemDef_t * pArrayItemDefs, uint64 * pCurrentPrices, uint64 * pBasePrices, uint32 unArrayLength);
bool SteamAPI_ISteamInventory_GetItemPrice(SteamItemDef_t iDefinition, uint64 * pCurrentPrice, uint64 * pBasePrice);
SteamInventoryUpdateHandle_t SteamAPI_ISteamInventory_StartUpdateProperties(void);
bool SteamAPI_ISteamInventory_RemoveProperty(SteamInventoryUpdateHandle_t handle, SteamItemInstanceID_t nItemID, const char * pchPropertyName);
bool SteamAPI_ISteamInventory_SetPropertyString(SteamInventoryUpdateHandle_t handle, SteamItemInstanceID_t nItemID, const char * pchPropertyName, const char * pchPropertyValue);
bool SteamAPI_ISteamInventory_SetPropertyBool(SteamInventoryUpdateHandle_t handle, SteamItemInstanceID_t nItemID, const char * pchPropertyName, bool bValue);
bool SteamAPI_ISteamInventory_SetPropertyInt64(SteamInventoryUpdateHandle_t handle, SteamItemInstanceID_t nItemID, const char * pchPropertyName, int64 nValue);
bool SteamAPI_ISteamInventory_SetPropertyFloat(SteamInventoryUpdateHandle_t handle, SteamItemInstanceID_t nItemID, const char * pchPropertyName, float flValue);
bool SteamAPI_ISteamInventory_SubmitUpdateProperties(SteamInventoryUpdateHandle_t handle, SteamInventoryResult_t * pResultHandle);
bool SteamAPI_ISteamInventory_InspectItem(SteamInventoryResult_t * pResultHandle, const char * pchItemToken);


bool SteamAPI_ISteamParentalSettings_BIsParentalLockEnabled(void);
bool SteamAPI_ISteamParentalSettings_BIsParentalLockLocked(void);
bool SteamAPI_ISteamParentalSettings_BIsAppBlocked(AppId_t nAppID);
bool SteamAPI_ISteamParentalSettings_BIsAppInBlockList(AppId_t nAppID);
bool SteamAPI_ISteamParentalSettings_BIsFeatureBlocked(EParentalFeature eFeature);
bool SteamAPI_ISteamParentalSettings_BIsFeatureInBlockList(EParentalFeature eFeature);


uint32 SteamAPI_ISteamRemotePlay_GetSessionCount(void);
RemotePlaySessionID_t SteamAPI_ISteamRemotePlay_GetSessionID(int iSessionIndex);
uint64_steamid SteamAPI_ISteamRemotePlay_GetSessionSteamID(RemotePlaySessionID_t unSessionID);
const char * SteamAPI_ISteamRemotePlay_GetSessionClientName(RemotePlaySessionID_t unSessionID);
ESteamDeviceFormFactor SteamAPI_ISteamRemotePlay_GetSessionClientFormFactor(RemotePlaySessionID_t unSessionID);
bool SteamAPI_ISteamRemotePlay_BGetSessionClientResolution(RemotePlaySessionID_t unSessionID, int * pnResolutionX, int * pnResolutionY);
bool SteamAPI_ISteamRemotePlay_BStartRemotePlayTogether(bool bShowOverlay);
bool SteamAPI_ISteamRemotePlay_BSendRemotePlayTogetherInvite(uint64_steamid steamIDFriend);


EResult SteamAPI_ISteamNetworkingMessages_SendMessageToUser(const SteamNetworkingIdentity * identityRemote, const void * pubData, uint32 cubData, int nSendFlags, int nRemoteChannel);
int SteamAPI_ISteamNetworkingMessages_ReceiveMessagesOnChannel(int nLocalChannel, SteamNetworkingMessage_t ** ppOutMessages, int nMaxMessages);
bool SteamAPI_ISteamNetworkingMessages_AcceptSessionWithUser(const SteamNetworkingIdentity * identityRemote);
bool SteamAPI_ISteamNetworkingMessages_CloseSessionWithUser(const SteamNetworkingIdentity * identityRemote);
bool SteamAPI_ISteamNetworkingMessages_CloseChannelWithUser(const SteamNetworkingIdentity * identityRemote, int nLocalChannel);
ESteamNetworkingConnectionState SteamAPI_ISteamNetworkingMessages_GetSessionConnectionInfo(const SteamNetworkingIdentity * identityRemote, SteamNetConnectionInfo_t * pConnectionInfo, SteamNetConnectionRealTimeStatus_t * pQuickStatus);


HSteamListenSocket SteamAPI_ISteamNetworkingSockets_CreateListenSocketIP(const SteamNetworkingIPAddr * localAddress, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
HSteamNetConnection SteamAPI_ISteamNetworkingSockets_ConnectByIPAddress(const SteamNetworkingIPAddr * address, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
HSteamListenSocket SteamAPI_ISteamNetworkingSockets_CreateListenSocketP2P(int nLocalVirtualPort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
HSteamNetConnection SteamAPI_ISteamNetworkingSockets_ConnectP2P(const SteamNetworkingIdentity * identityRemote, int nRemoteVirtualPort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
EResult SteamAPI_ISteamNetworkingSockets_AcceptConnection(HSteamNetConnection hConn);
bool SteamAPI_ISteamNetworkingSockets_CloseConnection(HSteamNetConnection hPeer, int nReason, const char * pszDebug, bool bEnableLinger);
bool SteamAPI_ISteamNetworkingSockets_CloseListenSocket(HSteamListenSocket hSocket);
bool SteamAPI_ISteamNetworkingSockets_SetConnectionUserData(HSteamNetConnection hPeer, int64 nUserData);
int64 SteamAPI_ISteamNetworkingSockets_GetConnectionUserData(HSteamNetConnection hPeer);
void SteamAPI_ISteamNetworkingSockets_SetConnectionName(HSteamNetConnection hPeer, const char * pszName);
bool SteamAPI_ISteamNetworkingSockets_GetConnectionName(HSteamNetConnection hPeer, char * pszName, int nMaxLen);
EResult SteamAPI_ISteamNetworkingSockets_SendMessageToConnection(HSteamNetConnection hConn, const void * pData, uint32 cbData, int nSendFlags, int64 * pOutMessageNumber);
void SteamAPI_ISteamNetworkingSockets_SendMessages(int nMessages, SteamNetworkingMessage_t *const * pMessages, int64 * pOutMessageNumberOrResult);
EResult SteamAPI_ISteamNetworkingSockets_FlushMessagesOnConnection(HSteamNetConnection hConn);
int SteamAPI_ISteamNetworkingSockets_ReceiveMessagesOnConnection(HSteamNetConnection hConn, SteamNetworkingMessage_t ** ppOutMessages, int nMaxMessages);
bool SteamAPI_ISteamNetworkingSockets_GetConnectionInfo(HSteamNetConnection hConn, SteamNetConnectionInfo_t * pInfo);
EResult SteamAPI_ISteamNetworkingSockets_GetConnectionRealTimeStatus(HSteamNetConnection hConn, SteamNetConnectionRealTimeStatus_t * pStatus, int nLanes, SteamNetConnectionRealTimeLaneStatus_t * pLanes);
int SteamAPI_ISteamNetworkingSockets_GetDetailedConnectionStatus(HSteamNetConnection hConn, char * pszBuf, int cbBuf);
bool SteamAPI_ISteamNetworkingSockets_GetListenSocketAddress(HSteamListenSocket hSocket, SteamNetworkingIPAddr * address);
bool SteamAPI_ISteamNetworkingSockets_CreateSocketPair(HSteamNetConnection * pOutConnection1, HSteamNetConnection * pOutConnection2, bool bUseNetworkLoopback, const SteamNetworkingIdentity * pIdentity1, const SteamNetworkingIdentity * pIdentity2);
EResult SteamAPI_ISteamNetworkingSockets_ConfigureConnectionLanes(HSteamNetConnection hConn, int nNumLanes, const int * pLanePriorities, const uint16 * pLaneWeights);
bool SteamAPI_ISteamNetworkingSockets_GetIdentity(SteamNetworkingIdentity * pIdentity);
ESteamNetworkingAvailability SteamAPI_ISteamNetworkingSockets_InitAuthentication(void);
ESteamNetworkingAvailability SteamAPI_ISteamNetworkingSockets_GetAuthenticationStatus(SteamNetAuthenticationStatus_t * pDetails);
HSteamNetPollGroup SteamAPI_ISteamNetworkingSockets_CreatePollGroup(void);
bool SteamAPI_ISteamNetworkingSockets_DestroyPollGroup(HSteamNetPollGroup hPollGroup);
bool SteamAPI_ISteamNetworkingSockets_SetConnectionPollGroup(HSteamNetConnection hConn, HSteamNetPollGroup hPollGroup);
int SteamAPI_ISteamNetworkingSockets_ReceiveMessagesOnPollGroup(HSteamNetPollGroup hPollGroup, SteamNetworkingMessage_t ** ppOutMessages, int nMaxMessages);
//bool SteamAPI_ISteamNetworkingSockets_ReceivedRelayAuthTicket(const void * pvTicket, int cbTicket, SteamDatagramRelayAuthTicket * pOutParsedTicket);
//int SteamAPI_ISteamNetworkingSockets_FindRelayAuthTicketForServer(const SteamNetworkingIdentity * identityGameServer, int nRemoteVirtualPort, SteamDatagramRelayAuthTicket * pOutParsedTicket);
HSteamNetConnection SteamAPI_ISteamNetworkingSockets_ConnectToHostedDedicatedServer(const SteamNetworkingIdentity * identityTarget, int nRemoteVirtualPort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
uint16 SteamAPI_ISteamNetworkingSockets_GetHostedDedicatedServerPort(void);
SteamNetworkingPOPID SteamAPI_ISteamNetworkingSockets_GetHostedDedicatedServerPOPID(void);
EResult SteamAPI_ISteamNetworkingSockets_GetHostedDedicatedServerAddress(SteamDatagramHostedAddress * pRouting);
HSteamListenSocket SteamAPI_ISteamNetworkingSockets_CreateHostedDedicatedServerListenSocket(int nLocalVirtualPort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
EResult SteamAPI_ISteamNetworkingSockets_GetGameCoordinatorServerLogin(SteamDatagramGameCoordinatorServerLogin * pLoginInfo, int * pcbSignedBlob, void * pBlob);
//HSteamNetConnection SteamAPI_ISteamNetworkingSockets_ConnectP2PCustomSignaling(ISteamNetworkingConnectionSignaling * pSignaling, const SteamNetworkingIdentity * pPeerIdentity, int nRemoteVirtualPort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
//bool SteamAPI_ISteamNetworkingSockets_ReceivedP2PCustomSignal(const void * pMsg, int cbMsg, ISteamNetworkingSignalingRecvContext * pContext);
bool SteamAPI_ISteamNetworkingSockets_GetCertificateRequest(int * pcbBlob, void * pBlob, SteamNetworkingErrMsg * errMsg);
bool SteamAPI_ISteamNetworkingSockets_SetCertificate(const void * pCertificate, int cbCertificate, SteamNetworkingErrMsg * errMsg);
void SteamAPI_ISteamNetworkingSockets_ResetIdentity(const SteamNetworkingIdentity * pIdentity);
void SteamAPI_ISteamNetworkingSockets_RunCallbacks(void);
bool SteamAPI_ISteamNetworkingSockets_BeginAsyncRequestFakeIP(int nNumPorts);
void SteamAPI_ISteamNetworkingSockets_GetFakeIP(int idxFirstPort, SteamNetworkingFakeIPResult_t * pInfo);
HSteamListenSocket SteamAPI_ISteamNetworkingSockets_CreateListenSocketP2PFakeIP(int idxFakePort, int nOptions, const SteamNetworkingConfigValue_t * pOptions);
EResult SteamAPI_ISteamNetworkingSockets_GetRemoteFakeIPForConnection(HSteamNetConnection hConn, SteamNetworkingIPAddr * pOutAddr);
ISteamNetworkingFakeUDPPort * SteamAPI_ISteamNetworkingSockets_CreateFakeUDPPort(int idxFakeServerPort);


SteamNetworkingMessage_t * SteamAPI_ISteamNetworkingUtils_AllocateMessage(int cbAllocateBuffer);
void SteamAPI_ISteamNetworkingUtils_InitRelayNetworkAccess(void);
ESteamNetworkingAvailability SteamAPI_ISteamNetworkingUtils_GetRelayNetworkStatus(SteamRelayNetworkStatus_t * pDetails);
float SteamAPI_ISteamNetworkingUtils_GetLocalPingLocation(SteamNetworkPingLocation_t * result);
int SteamAPI_ISteamNetworkingUtils_EstimatePingTimeBetweenTwoLocations(const SteamNetworkPingLocation_t * location1, const SteamNetworkPingLocation_t * location2);
int SteamAPI_ISteamNetworkingUtils_EstimatePingTimeFromLocalHost(const SteamNetworkPingLocation_t * remoteLocation);
void SteamAPI_ISteamNetworkingUtils_ConvertPingLocationToString(const SteamNetworkPingLocation_t * location, char * pszBuf, int cchBufSize);
bool SteamAPI_ISteamNetworkingUtils_ParsePingLocationString(const char * pszString, SteamNetworkPingLocation_t * result);
bool SteamAPI_ISteamNetworkingUtils_CheckPingDataUpToDate(float flMaxAgeSeconds);
int SteamAPI_ISteamNetworkingUtils_GetPingToDataCenter(SteamNetworkingPOPID popID, SteamNetworkingPOPID * pViaRelayPoP);
int SteamAPI_ISteamNetworkingUtils_GetDirectPingToPOP(SteamNetworkingPOPID popID);
int SteamAPI_ISteamNetworkingUtils_GetPOPCount(void);
int SteamAPI_ISteamNetworkingUtils_GetPOPList(SteamNetworkingPOPID * list, int nListSz);
SteamNetworkingMicroseconds SteamAPI_ISteamNetworkingUtils_GetLocalTimestamp(void);
void SteamAPI_ISteamNetworkingUtils_SetDebugOutputFunction(ESteamNetworkingSocketsDebugOutputType eDetailLevel, FSteamNetworkingSocketsDebugOutput pfnFunc);
bool SteamAPI_ISteamNetworkingUtils_IsFakeIPv4(uint32 nIPv4);
ESteamNetworkingFakeIPType SteamAPI_ISteamNetworkingUtils_GetIPv4FakeIPType(uint32 nIPv4);
EResult SteamAPI_ISteamNetworkingUtils_GetRealIdentityForFakeIP(const SteamNetworkingIPAddr * fakeIP, SteamNetworkingIdentity * pOutRealIdentity);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalConfigValueInt32(ESteamNetworkingConfigValue eValue, int32 val);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalConfigValueFloat(ESteamNetworkingConfigValue eValue, float val);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalConfigValueString(ESteamNetworkingConfigValue eValue, const char * val);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalConfigValuePtr(ESteamNetworkingConfigValue eValue, void * val);
bool SteamAPI_ISteamNetworkingUtils_SetConnectionConfigValueInt32(HSteamNetConnection hConn, ESteamNetworkingConfigValue eValue, int32 val);
bool SteamAPI_ISteamNetworkingUtils_SetConnectionConfigValueFloat(HSteamNetConnection hConn, ESteamNetworkingConfigValue eValue, float val);
bool SteamAPI_ISteamNetworkingUtils_SetConnectionConfigValueString(HSteamNetConnection hConn, ESteamNetworkingConfigValue eValue, const char * val);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_SteamNetConnectionStatusChanged(FnSteamNetConnectionStatusChanged fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_SteamNetAuthenticationStatusChanged(FnSteamNetAuthenticationStatusChanged fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_SteamRelayNetworkStatusChanged(FnSteamRelayNetworkStatusChanged fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_FakeIPResult(FnSteamNetworkingFakeIPResult fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_MessagesSessionRequest(FnSteamNetworkingMessagesSessionRequest fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetGlobalCallback_MessagesSessionFailed(FnSteamNetworkingMessagesSessionFailed fnCallback);
bool SteamAPI_ISteamNetworkingUtils_SetConfigValue(ESteamNetworkingConfigValue eValue, ESteamNetworkingConfigScope eScopeType, intptr_t scopeObj, ESteamNetworkingConfigDataType eDataType, const void * pArg);
bool SteamAPI_ISteamNetworkingUtils_SetConfigValueStruct(const SteamNetworkingConfigValue_t * opt, ESteamNetworkingConfigScope eScopeType, intptr_t scopeObj);
ESteamNetworkingGetConfigValueResult SteamAPI_ISteamNetworkingUtils_GetConfigValue(ESteamNetworkingConfigValue eValue, ESteamNetworkingConfigScope eScopeType, intptr_t scopeObj, ESteamNetworkingConfigDataType * pOutDataType, void * pResult, size_t * cbResult);
const char * SteamAPI_ISteamNetworkingUtils_GetConfigValueInfo(ESteamNetworkingConfigValue eValue, ESteamNetworkingConfigDataType * pOutDataType, ESteamNetworkingConfigScope * pOutScope);
ESteamNetworkingConfigValue SteamAPI_ISteamNetworkingUtils_IterateGenericEditableConfigValues(ESteamNetworkingConfigValue eCurrent, bool bEnumerateDevVars);
void SteamAPI_ISteamNetworkingUtils_SteamNetworkingIPAddr_ToString(const SteamNetworkingIPAddr * addr, char * buf, uint32 cbBuf, bool bWithPort);
bool SteamAPI_ISteamNetworkingUtils_SteamNetworkingIPAddr_ParseString(SteamNetworkingIPAddr * pAddr, const char * pszStr);
ESteamNetworkingFakeIPType SteamAPI_ISteamNetworkingUtils_SteamNetworkingIPAddr_GetFakeIPType(const SteamNetworkingIPAddr * addr);
void SteamAPI_ISteamNetworkingUtils_SteamNetworkingIdentity_ToString(const SteamNetworkingIdentity * identity, char * buf, uint32 cbBuf);
bool SteamAPI_ISteamNetworkingUtils_SteamNetworkingIdentity_ParseString(SteamNetworkingIdentity * pIdentity, const char * pszStr);


void SteamAPI_ISteamGameServer_SetProduct(const char * pszProduct);
void SteamAPI_ISteamGameServer_SetGameDescription(const char * pszGameDescription);
void SteamAPI_ISteamGameServer_SetModDir(const char * pszModDir);
void SteamAPI_ISteamGameServer_SetDedicatedServer(bool bDedicated);
void SteamAPI_ISteamGameServer_LogOn(const char * pszToken);
void SteamAPI_ISteamGameServer_LogOnAnonymous(void);
void SteamAPI_ISteamGameServer_LogOff(void);
bool SteamAPI_ISteamGameServer_BLoggedOn(void);
bool SteamAPI_ISteamGameServer_BSecure(void);
uint64_steamid SteamAPI_ISteamGameServer_GetSteamID(void);
bool SteamAPI_ISteamGameServer_WasRestartRequested(void);
void SteamAPI_ISteamGameServer_SetMaxPlayerCount(int cPlayersMax);
void SteamAPI_ISteamGameServer_SetBotPlayerCount(int cBotplayers);
void SteamAPI_ISteamGameServer_SetServerName(const char * pszServerName);
void SteamAPI_ISteamGameServer_SetMapName(const char * pszMapName);
void SteamAPI_ISteamGameServer_SetPasswordProtected(bool bPasswordProtected);
void SteamAPI_ISteamGameServer_SetSpectatorPort(uint16 unSpectatorPort);
void SteamAPI_ISteamGameServer_SetSpectatorServerName(const char * pszSpectatorServerName);
void SteamAPI_ISteamGameServer_ClearAllKeyValues(void);
void SteamAPI_ISteamGameServer_SetKeyValue(const char * pKey, const char * pValue);
void SteamAPI_ISteamGameServer_SetGameTags(const char * pchGameTags);
void SteamAPI_ISteamGameServer_SetGameData(const char * pchGameData);
void SteamAPI_ISteamGameServer_SetRegion(const char * pszRegion);
void SteamAPI_ISteamGameServer_SetAdvertiseServerActive(bool bActive);
HAuthTicket SteamAPI_ISteamGameServer_GetAuthSessionTicket(void * pTicket, int cbMaxTicket, uint32 * pcbTicket, const SteamNetworkingIdentity * pSnid);
EBeginAuthSessionResult SteamAPI_ISteamGameServer_BeginAuthSession(const void * pAuthTicket, int cbAuthTicket, uint64_steamid steamID);
void SteamAPI_ISteamGameServer_EndAuthSession(uint64_steamid steamID);
void SteamAPI_ISteamGameServer_CancelAuthTicket(HAuthTicket hAuthTicket);
EUserHasLicenseForAppResult SteamAPI_ISteamGameServer_UserHasLicenseForApp(uint64_steamid steamID, AppId_t appID);
bool SteamAPI_ISteamGameServer_RequestUserGroupStatus(uint64_steamid steamIDUser, uint64_steamid steamIDGroup);
void SteamAPI_ISteamGameServer_GetGameplayStats(void);
SteamAPICall_t SteamAPI_ISteamGameServer_GetServerReputation(void);
SteamIPAddress_t SteamAPI_ISteamGameServer_GetPublicIP(void);
bool SteamAPI_ISteamGameServer_HandleIncomingPacket(const void * pData, int cbData, uint32 srcIP, uint16 srcPort);
int SteamAPI_ISteamGameServer_GetNextOutgoingPacket(void * pOut, int cbMaxOut, uint32 * pNetAdr, uint16 * pPort);
SteamAPICall_t SteamAPI_ISteamGameServer_AssociateWithClan(uint64_steamid steamIDClan);
SteamAPICall_t SteamAPI_ISteamGameServer_ComputeNewPlayerCompatibility(uint64_steamid steamIDNewPlayer);
bool SteamAPI_ISteamGameServer_SendUserConnectAndAuthenticate_DEPRECATED(uint32 unIPClient, const void * pvAuthBlob, uint32 cubAuthBlobSize, CSteamID * pSteamIDUser);
uint64_steamid SteamAPI_ISteamGameServer_CreateUnauthenticatedUserConnection(void);
void SteamAPI_ISteamGameServer_SendUserDisconnect_DEPRECATED(uint64_steamid steamIDUser);
bool SteamAPI_ISteamGameServer_BUpdateUserData(uint64_steamid steamIDUser, const char * pchPlayerName, uint32 uScore);


SteamAPICall_t SteamAPI_ISteamGameServerStats_RequestUserStats(uint64_steamid steamIDUser);
bool SteamAPI_ISteamGameServerStats_GetUserStatInt32(uint64_steamid steamIDUser, const char * pchName, int32 * pData);
bool SteamAPI_ISteamGameServerStats_GetUserStatFloat(uint64_steamid steamIDUser, const char * pchName, float * pData);
bool SteamAPI_ISteamGameServerStats_GetUserAchievement(uint64_steamid steamIDUser, const char * pchName, bool * pbAchieved);
bool SteamAPI_ISteamGameServerStats_SetUserStatInt32(uint64_steamid steamIDUser, const char * pchName, int32 nData);
bool SteamAPI_ISteamGameServerStats_SetUserStatFloat(uint64_steamid steamIDUser, const char * pchName, float fData);
bool SteamAPI_ISteamGameServerStats_UpdateUserAvgRateStat(uint64_steamid steamIDUser, const char * pchName, float flCountThisSession, double dSessionLength);
bool SteamAPI_ISteamGameServerStats_SetUserAchievement(uint64_steamid steamIDUser, const char * pchName);
bool SteamAPI_ISteamGameServerStats_ClearUserAchievement(uint64_steamid steamIDUser, const char * pchName);
SteamAPICall_t SteamAPI_ISteamGameServerStats_StoreUserStats(uint64_steamid steamIDUser);


void SteamAPI_ISteamNetworkingFakeUDPPort_DestroyFakeUDPPort(void);
EResult SteamAPI_ISteamNetworkingFakeUDPPort_SendMessageToFakeIP(const SteamNetworkingIPAddr * remoteAddress, const void * pData, uint32 cbData, int nSendFlags);
int SteamAPI_ISteamNetworkingFakeUDPPort_ReceiveMessages(SteamNetworkingMessage_t ** ppOutMessages, int nMaxMessages);
void SteamAPI_ISteamNetworkingFakeUDPPort_ScheduleCleanup(const SteamNetworkingIPAddr * remoteAddress);


ESteamAPIInitResult SteamAPI_InitFlat( SteamErrMsg *pOutErrMsg );
void SteamAPI_Shutdown();