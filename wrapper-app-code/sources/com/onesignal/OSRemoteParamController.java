package com.onesignal;

import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.data.OSTrackerFactory;

class OSRemoteParamController {
    private OneSignalRemoteParams.Params remoteParams = null;

    OSRemoteParamController() {
    }

    /* access modifiers changed from: package-private */
    public void saveRemoteParams(OneSignalRemoteParams.Params params, OSTrackerFactory oSTrackerFactory, OSSharedPreferences oSSharedPreferences, OSLogger oSLogger) {
        this.remoteParams = params;
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_FIREBASE_TRACKING_ENABLED, params.firebaseAnalytics);
        saveRestoreTTLFilter(params.restoreTTLFilter);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLEAR_GROUP_SUMMARY_CLICK, params.clearGroupOnSummaryClick);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, oSSharedPreferences.getOutcomesV2KeyName(), params.influenceParams.outcomesV2ServiceEnabled);
        saveReceiveReceiptEnabled(params.receiveReceiptEnabled);
        oSLogger.debug("OneSignal saveInfluenceParams: " + params.influenceParams.toString());
        oSTrackerFactory.saveInfluenceParams(params.influenceParams);
        if (params.disableGMSMissingPrompt != null) {
            saveGMSMissingPromptDisable(params.disableGMSMissingPrompt.booleanValue());
        }
        if (params.unsubscribeWhenNotificationsDisabled != null) {
            saveUnsubscribeWhenNotificationsAreDisabled(params.unsubscribeWhenNotificationsDisabled.booleanValue());
        }
        if (params.locationShared != null) {
            OneSignal.startLocationShared(params.locationShared.booleanValue());
        }
        if (params.requiresUserPrivacyConsent != null) {
            savePrivacyConsentRequired(params.requiresUserPrivacyConsent.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isRemoteParamsCallDone() {
        return this.remoteParams != null;
    }

    /* access modifiers changed from: package-private */
    public OneSignalRemoteParams.Params getRemoteParams() {
        return this.remoteParams;
    }

    /* access modifiers changed from: package-private */
    public boolean hasDisableGMSMissingPromptKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return (params == null || params.disableGMSMissingPrompt == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean hasLocationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return (params == null || params.locationShared == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean hasPrivacyConsentKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return (params == null || params.requiresUserPrivacyConsent == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean hasUnsubscribeNotificationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return (params == null || params.unsubscribeWhenNotificationsDisabled == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void clearRemoteParams() {
        this.remoteParams = null;
    }

    private void saveRestoreTTLFilter(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RESTORE_TTL_FILTER, this.remoteParams.restoreTTLFilter);
    }

    /* access modifiers changed from: package-private */
    public boolean isRestoreTTLFilterActive() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RESTORE_TTL_FILTER, true);
    }

    private void saveReceiveReceiptEnabled(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RECEIVE_RECEIPTS_ENABLED, z);
    }

    /* access modifiers changed from: package-private */
    public boolean isReceiveReceiptEnabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_RECEIVE_RECEIPTS_ENABLED, false);
    }

    /* access modifiers changed from: package-private */
    public boolean getFirebaseAnalyticsEnabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_FIREBASE_TRACKING_ENABLED, false);
    }

    /* access modifiers changed from: package-private */
    public boolean getClearGroupSummaryClick() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLEAR_GROUP_SUMMARY_CLICK, true);
    }

    /* access modifiers changed from: package-private */
    public boolean unsubscribeWhenNotificationsAreDisabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED, true);
    }

    /* access modifiers changed from: package-private */
    public void saveUnsubscribeWhenNotificationsAreDisabled(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED, z);
    }

    /* access modifiers changed from: package-private */
    public boolean isGMSMissingPromptDisable() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISABLE_GMS_MISSING_PROMPT, false);
    }

    /* access modifiers changed from: package-private */
    public void saveGMSMissingPromptDisable(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISABLE_GMS_MISSING_PROMPT, z);
    }

    /* access modifiers changed from: package-private */
    public boolean isLocationShared() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LOCATION_SHARED, true);
    }

    /* access modifiers changed from: package-private */
    public void saveLocationShared(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LOCATION_SHARED, z);
    }

    /* access modifiers changed from: package-private */
    public boolean isPrivacyConsentRequired() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT, false);
    }

    /* access modifiers changed from: package-private */
    public void savePrivacyConsentRequired(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT, z);
    }

    /* access modifiers changed from: package-private */
    public boolean getSavedUserConsentStatus() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_USER_PROVIDED_CONSENT, false);
    }

    /* access modifiers changed from: package-private */
    public void saveUserConsentStatus(boolean z) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_ONESIGNAL_USER_PROVIDED_CONSENT, z);
    }
}
