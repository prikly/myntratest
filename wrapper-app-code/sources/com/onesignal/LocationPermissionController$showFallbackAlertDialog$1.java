package com.onesignal;

import android.app.Activity;
import com.onesignal.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.OneSignal;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/onesignal/LocationPermissionController$showFallbackAlertDialog$1", "Lcom/onesignal/AlertDialogPrepromptForAndroidSettings$Callback;", "onAccept", "", "onDecline", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: LocationPermissionController.kt */
public final class LocationPermissionController$showFallbackAlertDialog$1 implements AlertDialogPrepromptForAndroidSettings.Callback {
    final /* synthetic */ Activity $activity;

    LocationPermissionController$showFallbackAlertDialog$1(Activity activity) {
        this.$activity = activity;
    }

    public void onAccept() {
        NavigateToAndroidSettingsForLocation.INSTANCE.show(this.$activity);
        LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
    }

    public void onDecline() {
        LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
    }
}
