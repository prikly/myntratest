package com.onesignal;

import org.json.JSONObject;

public class OSSMSSubscriptionState implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private static final String SMS_NUMBER = "smsNumber";
    private static final String SMS_USER_ID = "smsUserId";
    private static final String SUBSCRIBED = "isSubscribed";
    private OSObservable<Object, OSSMSSubscriptionState> observable = new OSObservable<>(CHANGED_KEY, false);
    private String smsNumber;
    private String smsUserId;

    OSSMSSubscriptionState(boolean z) {
        if (z) {
            this.smsUserId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_ID_LAST, (String) null);
            this.smsNumber = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_NUMBER_LAST, (String) null);
            return;
        }
        this.smsUserId = OneSignal.getSMSId();
        this.smsNumber = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId();
    }

    /* access modifiers changed from: package-private */
    public void clearSMSAndId() {
        boolean z = (this.smsUserId == null && this.smsNumber == null) ? false : true;
        this.smsUserId = null;
        this.smsNumber = null;
        if (z) {
            this.observable.notifyChange(this);
        }
    }

    public String getSmsUserId() {
        return this.smsUserId;
    }

    /* access modifiers changed from: package-private */
    public void setSMSUserId(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.smsUserId) : this.smsUserId == null) {
            z = false;
        }
        this.smsUserId = str;
        if (z) {
            this.observable.notifyChange(this);
        }
    }

    public String getSMSNumber() {
        return this.smsNumber;
    }

    /* access modifiers changed from: package-private */
    public void setSMSNumber(String str) {
        boolean z = !str.equals(this.smsNumber);
        this.smsNumber = str;
        if (z) {
            this.observable.notifyChange(this);
        }
    }

    public boolean isSubscribed() {
        return (this.smsUserId == null || this.smsNumber == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_ID_LAST, this.smsUserId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_NUMBER_LAST, this.smsNumber);
    }

    /* access modifiers changed from: package-private */
    public boolean compare(OSSMSSubscriptionState oSSMSSubscriptionState) {
        String str = this.smsUserId;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = oSSMSSubscriptionState.smsUserId;
        if (str3 == null) {
            str3 = str2;
        }
        if (str.equals(str3)) {
            String str4 = this.smsNumber;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = oSSMSSubscriptionState.smsNumber;
            if (str5 != null) {
                str2 = str5;
            }
            return !str4.equals(str2);
        }
    }

    public OSObservable<Object, OSSMSSubscriptionState> getObservable() {
        return this.observable;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.smsUserId != null) {
                jSONObject.put(SMS_USER_ID, this.smsUserId);
            } else {
                jSONObject.put(SMS_USER_ID, JSONObject.NULL);
            }
            if (this.smsNumber != null) {
                jSONObject.put(SMS_NUMBER, this.smsNumber);
            } else {
                jSONObject.put(SMS_NUMBER, JSONObject.NULL);
            }
            jSONObject.put(SUBSCRIBED, isSubscribed());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
