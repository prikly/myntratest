package com.onesignal;

import com.onesignal.language.LanguageContext;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageDummyController extends OSInAppMessageController {
    /* access modifiers changed from: package-private */
    public void addTriggers(Map<String, Object> map) {
    }

    /* access modifiers changed from: package-private */
    public void cleanCachedInAppMessages() {
    }

    /* access modifiers changed from: package-private */
    public void displayPreviewMessage(String str) {
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageInternal getCurrentDisplayedInAppMessage() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public Object getTriggerValue(String str) {
        return null;
    }

    public void initRedisplayData() {
    }

    /* access modifiers changed from: package-private */
    public void initWithCachedInAppMessages() {
    }

    /* access modifiers changed from: package-private */
    public boolean isInAppMessageShowing() {
        return false;
    }

    public void messageTriggerConditionChanged() {
    }

    public void messageWasDismissed(OSInAppMessageInternal oSInAppMessageInternal) {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnMessage(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnPreview(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void receivedInAppMessageJson(JSONArray jSONArray) throws JSONException {
    }

    /* access modifiers changed from: package-private */
    public void removeTriggersForKeys(Collection<String> collection) {
    }

    /* access modifiers changed from: package-private */
    public void setInAppMessagingEnabled(boolean z) {
    }

    OSInAppMessageDummyController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        super(oneSignalDbHelper, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
    }
}
