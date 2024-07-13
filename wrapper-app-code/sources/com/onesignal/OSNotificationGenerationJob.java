package com.onesignal;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

public class OSNotificationGenerationJob {
    private Context context;
    private boolean isNotificationToDisplay;
    private JSONObject jsonPayload;
    private OSNotification notification;
    private Integer orgFlags;
    private Uri orgSound;
    private CharSequence overriddenBodyFromExtender;
    private Integer overriddenFlags;
    private Uri overriddenSound;
    private CharSequence overriddenTitleFromExtender;
    private boolean restoring;
    private Long shownTimeStamp;

    OSNotificationGenerationJob(Context context2) {
        this.context = context2;
    }

    OSNotificationGenerationJob(Context context2, JSONObject jSONObject) {
        this(context2, new OSNotification(jSONObject), jSONObject);
    }

    OSNotificationGenerationJob(Context context2, OSNotification oSNotification, JSONObject jSONObject) {
        this.context = context2;
        this.jsonPayload = jSONObject;
        setNotification(oSNotification);
    }

    /* access modifiers changed from: package-private */
    public CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getTitle();
    }

    /* access modifiers changed from: package-private */
    public CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        return this.notification.getBody();
    }

    /* access modifiers changed from: package-private */
    public JSONObject getAdditionalData() {
        return this.notification.getAdditionalData() != null ? this.notification.getAdditionalData() : new JSONObject();
    }

    /* access modifiers changed from: package-private */
    public boolean isNotificationToDisplay() {
        return this.isNotificationToDisplay;
    }

    /* access modifiers changed from: package-private */
    public void setIsNotificationToDisplay(boolean z) {
        this.isNotificationToDisplay = z;
    }

    /* access modifiers changed from: package-private */
    public boolean hasExtender() {
        return this.notification.getNotificationExtender() != null;
    }

    /* access modifiers changed from: package-private */
    public String getApiNotificationId() {
        return OneSignal.getNotificationIdFromFCMJson(this.jsonPayload);
    }

    /* access modifiers changed from: package-private */
    public Integer getAndroidId() {
        return Integer.valueOf(this.notification.getAndroidNotificationId());
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public void setNotification(OSNotification oSNotification) {
        if (oSNotification != null && !oSNotification.hasNotificationId()) {
            OSNotification oSNotification2 = this.notification;
            if (oSNotification2 == null || !oSNotification2.hasNotificationId()) {
                oSNotification.setAndroidNotificationId(new SecureRandom().nextInt());
            } else {
                oSNotification.setAndroidNotificationId(this.notification.getAndroidNotificationId());
            }
        }
        this.notification = oSNotification;
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    public void setJsonPayload(JSONObject jSONObject) {
        this.jsonPayload = jSONObject;
    }

    public boolean isRestoring() {
        return this.restoring;
    }

    public void setRestoring(boolean z) {
        this.restoring = z;
    }

    public Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    public void setShownTimeStamp(Long l) {
        this.shownTimeStamp = l;
    }

    public CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    public void setOverriddenBodyFromExtender(CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    public void setOverriddenTitleFromExtender(CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    public void setOverriddenSound(Uri uri) {
        this.overriddenSound = uri;
    }

    public Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    public void setOverriddenFlags(Integer num) {
        this.overriddenFlags = num;
    }

    public Integer getOrgFlags() {
        return this.orgFlags;
    }

    public void setOrgFlags(Integer num) {
        this.orgFlags = num;
    }

    public Uri getOrgSound() {
        return this.orgSound;
    }

    public void setOrgSound(Uri uri) {
        this.orgSound = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.jsonPayload + ", isRestoring=" + this.restoring + ", isNotificationToDisplay=" + this.isNotificationToDisplay + ", shownTimeStamp=" + this.shownTimeStamp + ", overriddenBodyFromExtender=" + this.overriddenBodyFromExtender + ", overriddenTitleFromExtender=" + this.overriddenTitleFromExtender + ", overriddenSound=" + this.overriddenSound + ", overriddenFlags=" + this.overriddenFlags + ", orgFlags=" + this.orgFlags + ", orgSound=" + this.orgSound + ", notification=" + this.notification + '}';
    }
}
