package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\nJ\b\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/onesignal/NotificationPermissionController;", "Lcom/onesignal/PermissionsActivity$PermissionCallback;", "()V", "ANDROID_PERMISSION_STRING", "", "PERMISSION_TYPE", "awaitingForReturnFromSystemSettings", "", "callbacks", "", "Lcom/onesignal/OneSignal$PromptForPushNotificationPermissionResponseHandler;", "supportsNativePrompt", "getSupportsNativePrompt", "()Z", "fireCallBacks", "", "accepted", "notificationsEnabled", "onAccept", "onAppForegrounded", "onReject", "fallbackToSettings", "prompt", "callback", "showFallbackAlertDialog", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: NotificationPermissionController.kt */
public final class NotificationPermissionController implements PermissionsActivity.PermissionCallback {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final NotificationPermissionController INSTANCE;
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    /* access modifiers changed from: private */
    public static boolean awaitingForReturnFromSystemSettings;
    private static final Set<OneSignal.PromptForPushNotificationPermissionResponseHandler> callbacks = new HashSet();
    private static final boolean supportsNativePrompt = (Build.VERSION.SDK_INT > 32 && OSUtils.getTargetSdkVersion(OneSignal.appContext) > 32);

    static {
        NotificationPermissionController notificationPermissionController = new NotificationPermissionController();
        INSTANCE = notificationPermissionController;
        PermissionsActivity.registerAsCallback(PERMISSION_TYPE, notificationPermissionController);
    }

    private NotificationPermissionController() {
    }

    public final boolean getSupportsNativePrompt() {
        return supportsNativePrompt;
    }

    public final void prompt(boolean z, OneSignal.PromptForPushNotificationPermissionResponseHandler promptForPushNotificationPermissionResponseHandler) {
        if (promptForPushNotificationPermissionResponseHandler != null) {
            callbacks.add(promptForPushNotificationPermissionResponseHandler);
        }
        if (notificationsEnabled()) {
            fireCallBacks(true);
        } else if (supportsNativePrompt) {
            PermissionsActivity.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, getClass());
        } else if (z) {
            showFallbackAlertDialog();
        } else {
            fireCallBacks(false);
        }
    }

    public void onAccept() {
        OneSignal.refreshNotificationPermissionState();
        fireCallBacks(true);
    }

    public void onReject(boolean z) {
        if (!(z ? showFallbackAlertDialog() : false)) {
            fireCallBacks(false);
        }
    }

    private final boolean showFallbackAlertDialog() {
        Activity currentActivity = OneSignal.getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(currentActivity, "OneSignal.getCurrentActivity() ?: return false");
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = currentActivity.getString(R.string.notification_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = currentActivity.getString(R.string.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.str…mission_settings_message)");
        alertDialogPrepromptForAndroidSettings.show(currentActivity, string, string2, new NotificationPermissionController$showFallbackAlertDialog$1(currentActivity));
        return true;
    }

    /* access modifiers changed from: private */
    public final void fireCallBacks(boolean z) {
        for (OneSignal.PromptForPushNotificationPermissionResponseHandler response : callbacks) {
            response.response(z);
        }
        callbacks.clear();
    }

    public final void onAppForegrounded() {
        if (awaitingForReturnFromSystemSettings) {
            awaitingForReturnFromSystemSettings = false;
            fireCallBacks(notificationsEnabled());
        }
    }

    private final boolean notificationsEnabled() {
        return OSUtils.areNotificationsEnabled(OneSignal.appContext);
    }
}
