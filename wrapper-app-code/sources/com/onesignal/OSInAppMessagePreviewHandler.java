package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u001c\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\bH\u0003¨\u0006\u0012"}, d2 = {"Lcom/onesignal/OSInAppMessagePreviewHandler;", "", "()V", "inAppPreviewPushUUID", "", "payload", "Lorg/json/JSONObject;", "notificationOpened", "", "activity", "Landroid/app/Activity;", "jsonData", "notificationReceived", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "shouldDisplayNotification", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSInAppMessagePreviewHandler.kt */
public final class OSInAppMessagePreviewHandler {
    public static final OSInAppMessagePreviewHandler INSTANCE = new OSInAppMessagePreviewHandler();

    private OSInAppMessagePreviewHandler() {
    }

    public static final boolean notificationReceived(Context context, Bundle bundle) {
        JSONObject bundleAsJSONObject = NotificationBundleProcessor.bundleAsJSONObject(bundle);
        Intrinsics.checkNotNullExpressionValue(bundleAsJSONObject, "NotificationBundleProces…undleAsJSONObject(bundle)");
        String inAppPreviewPushUUID = inAppPreviewPushUUID(bundleAsJSONObject);
        if (inAppPreviewPushUUID == null) {
            return false;
        }
        if (OneSignal.isAppActive()) {
            OneSignal.getInAppMessageController().displayPreviewMessage(inAppPreviewPushUUID);
            return true;
        } else if (!INSTANCE.shouldDisplayNotification()) {
            return true;
        } else {
            GenerateNotification.displayIAMPreviewNotification(new OSNotificationGenerationJob(context, bundleAsJSONObject));
            return true;
        }
    }

    public static final boolean notificationOpened(Activity activity, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(jSONObject, "jsonData");
        String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
        if (inAppPreviewPushUUID == null) {
            return false;
        }
        OneSignal.openDestinationActivity(activity, new JSONArray().put(jSONObject));
        OneSignal.getInAppMessageController().displayPreviewMessage(inAppPreviewPushUUID);
        return true;
    }

    public static final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Intrinsics.checkNotNullParameter(jSONObject, "payload");
        try {
            JSONObject customJSONObject = NotificationBundleProcessor.getCustomJSONObject(jSONObject);
            Intrinsics.checkNotNullExpressionValue(customJSONObject, "NotificationBundleProces…CustomJSONObject(payload)");
            if (customJSONObject.has(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean shouldDisplayNotification() {
        return Build.VERSION.SDK_INT > 18;
    }
}
