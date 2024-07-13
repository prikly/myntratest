package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationPayloadProcessorHMS {
    NotificationPayloadProcessorHMS() {
    }

    static void handleHMSNotificationOpenIntent(Activity activity, Intent intent) {
        JSONObject covertHMSOpenIntentToJson;
        OneSignal.initWithContext(activity.getApplicationContext());
        if (intent != null && (covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent)) != null) {
            handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson);
        }
    }

    private static JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!OSNotificationFormatHelper.isOneSignalIntent(intent)) {
            return null;
        }
        JSONObject bundleAsJSONObject = NotificationBundleProcessor.bundleAsJSONObject(intent.getExtras());
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    private static void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) NotificationBundleProcessor.getCustomJSONObject(jSONObject).remove(GenerateNotification.BUNDLE_KEY_ACTION_ID);
            if (str != null) {
                jSONObject.put(GenerateNotification.BUNDLE_KEY_ACTION_ID, str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void handleProcessJsonOpenData(Activity activity, JSONObject jSONObject) {
        if (!OSInAppMessagePreviewHandler.notificationOpened(activity, jSONObject)) {
            OneSignal.handleNotificationOpen(activity, new JSONArray().put(jSONObject), OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = com.onesignal.OSUtils.jsonStringToBundle(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void processDataMessageReceived(final android.content.Context r1, java.lang.String r2) {
        /*
            com.onesignal.OneSignal.initWithContext(r1)
            if (r2 != 0) goto L_0x0006
            return
        L_0x0006:
            android.os.Bundle r2 = com.onesignal.OSUtils.jsonStringToBundle(r2)
            if (r2 != 0) goto L_0x000d
            return
        L_0x000d:
            com.onesignal.NotificationPayloadProcessorHMS$1 r0 = new com.onesignal.NotificationPayloadProcessorHMS$1
            r0.<init>(r1, r2)
            com.onesignal.NotificationBundleProcessor.processBundleFromReceiver(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.NotificationPayloadProcessorHMS.processDataMessageReceived(android.content.Context, java.lang.String):void");
    }
}
