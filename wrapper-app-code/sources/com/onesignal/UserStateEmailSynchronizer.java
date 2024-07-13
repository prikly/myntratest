package com.onesignal;

import com.google.android.gms.common.Scopes;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class UserStateEmailSynchronizer extends UserStateSecondaryChannelSynchronizer {
    /* access modifiers changed from: protected */
    public String getAuthHashKey() {
        return "email_auth_hash";
    }

    /* access modifiers changed from: protected */
    public String getChannelKey() {
        return Scopes.EMAIL;
    }

    /* access modifiers changed from: protected */
    public int getDeviceType() {
        return 11;
    }

    UserStateEmailSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    /* access modifiers changed from: protected */
    public UserState newUserState(String str, boolean z) {
        return new UserStateEmail(str, z);
    }

    /* access modifiers changed from: protected */
    public String getId() {
        return OneSignal.getEmailId();
    }

    /* access modifiers changed from: package-private */
    public void saveChannelId(String str) {
        OneSignal.saveEmailId(str);
    }

    /* access modifiers changed from: package-private */
    public void logoutChannel() {
        OneSignal.saveEmailId("");
        resetCurrentState();
        getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("email_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        getToSyncUserState().removeFromSyncValues((List<String>) arrayList);
        getToSyncUserState().persistState();
        OneSignal.getEmailSubscriptionState().clearEmailAndId();
    }

    /* access modifiers changed from: package-private */
    public void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireEmailUpdateSuccess();
    }

    /* access modifiers changed from: package-private */
    public void fireUpdateFailure() {
        OneSignal.fireEmailUpdateFailure();
    }

    /* access modifiers changed from: package-private */
    public void updateIdDependents(String str) {
        OneSignal.updateEmailIdDependents(str);
    }
}
