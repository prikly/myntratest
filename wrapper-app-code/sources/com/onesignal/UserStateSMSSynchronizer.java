package com.onesignal;

import com.onesignal.OneSignalStateSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class UserStateSMSSynchronizer extends UserStateSecondaryChannelSynchronizer {
    /* access modifiers changed from: protected */
    public String getAuthHashKey() {
        return "sms_auth_hash";
    }

    /* access modifiers changed from: protected */
    public String getChannelKey() {
        return "sms_number";
    }

    /* access modifiers changed from: protected */
    public int getDeviceType() {
        return 14;
    }

    UserStateSMSSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.SMS);
    }

    /* access modifiers changed from: protected */
    public UserState newUserState(String str, boolean z) {
        return new UserStateSMS(str, z);
    }

    /* access modifiers changed from: protected */
    public String getId() {
        return OneSignal.getSMSId();
    }

    /* access modifiers changed from: package-private */
    public void saveChannelId(String str) {
        OneSignal.saveSMSId(str);
    }

    /* access modifiers changed from: package-private */
    public void logoutChannel() {
        saveChannelId("");
        resetCurrentState();
        getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("sms_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        getToSyncUserState().removeFromSyncValues((List<String>) arrayList);
        getToSyncUserState().persistState();
        OneSignal.getSMSSubscriptionState().clearSMSAndId();
    }

    /* access modifiers changed from: package-private */
    public void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireSMSUpdateSuccess(jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void fireUpdateFailure() {
        OneSignal.fireSMSUpdateFailure();
    }

    /* access modifiers changed from: package-private */
    public void updateIdDependents(String str) {
        OneSignal.updateSMSIdDependents(str);
    }
}
