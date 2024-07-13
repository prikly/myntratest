package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateSynchronizer;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSecondaryChannelSynchronizer extends UserStateSynchronizer {
    /* access modifiers changed from: package-private */
    public abstract void fireUpdateFailure();

    /* access modifiers changed from: package-private */
    public abstract void fireUpdateSuccess(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract String getAuthHashKey();

    /* access modifiers changed from: protected */
    public abstract String getChannelKey();

    /* access modifiers changed from: protected */
    public abstract int getDeviceType();

    /* access modifiers changed from: package-private */
    public String getExternalId(boolean z) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String getId();

    /* access modifiers changed from: package-private */
    public boolean getSubscribed() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public UserStateSynchronizer.GetTagsResult getTags(boolean z) {
        return null;
    }

    public boolean getUserSubscribePreference() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract void logoutChannel();

    /* access modifiers changed from: protected */
    public abstract UserState newUserState(String str, boolean z);

    public void setPermission(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public void setSubscription(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public abstract void updateIdDependents(String str);

    /* access modifiers changed from: package-private */
    public void updateState(JSONObject jSONObject) {
    }

    UserStateSecondaryChannelSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    /* access modifiers changed from: protected */
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    /* access modifiers changed from: package-private */
    public void refresh() {
        scheduleSyncToServer();
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncToServer() {
        if (!(getId() == null && getRegistrationId() == null) && OneSignal.getUserId() != null) {
            getNetworkHandlerThread(0).runNewJobDelayed();
        }
    }

    /* access modifiers changed from: protected */
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
        try {
            jSONObject.put(OSOutcomeConstants.DEVICE_TYPE, getDeviceType());
            jSONObject.putOpt("device_player_id", OneSignal.getUserId());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            fireUpdateFailure();
        }
    }

    /* access modifiers changed from: protected */
    public void onSuccessfulSync(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(getChannelKey(), jSONObject.get("identifier"));
                if (jSONObject.has(getAuthHashKey())) {
                    jSONObject2.put(getAuthHashKey(), jSONObject.get(getAuthHashKey()));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            fireUpdateSuccess(jSONObject2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChannelId(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.onesignal.UserState r0 = r6.getUserStateForModification()
            com.onesignal.ImmutableJSONObject r1 = r0.getSyncValues()
            java.lang.String r2 = "identifier"
            java.lang.String r3 = r1.optString(r2)
            boolean r3 = r7.equals(r3)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r6.getAuthHashKey()
            java.lang.String r3 = r1.optString(r3)
            if (r8 != 0) goto L_0x0022
            r5 = r4
            goto L_0x0023
        L_0x0022:
            r5 = r8
        L_0x0023:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r6.getChannelKey()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r7 = r6.getAuthHashKey()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0046:
            r6.fireUpdateSuccess(r0)
            return
        L_0x004a:
            r3 = 0
            java.lang.String r1 = r1.optString(r2, r3)
            if (r1 != 0) goto L_0x0054
            r6.setNewSession()
        L_0x0054:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f }
            r5.<init>()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r7)     // Catch:{ JSONException -> 0x007f }
            if (r8 == 0) goto L_0x0065
            java.lang.String r2 = r6.getAuthHashKey()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r8)     // Catch:{ JSONException -> 0x007f }
        L_0x0065:
            if (r8 != 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            boolean r7 = r1.equals(r7)     // Catch:{ JSONException -> 0x007f }
            if (r7 != 0) goto L_0x0078
            r6.saveChannelId(r4)     // Catch:{ JSONException -> 0x007f }
            r6.resetCurrentState()     // Catch:{ JSONException -> 0x007f }
            r6.setNewSession()     // Catch:{ JSONException -> 0x007f }
        L_0x0078:
            r0.generateJsonDiffFromIntoSyncValued(r5, r3)     // Catch:{ JSONException -> 0x007f }
            r6.scheduleSyncToServer()     // Catch:{ JSONException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.UserStateSecondaryChannelSynchronizer.setChannelId(java.lang.String, java.lang.String):void");
    }
}
