package com.appsgeyser.sdk.push;

import android.content.Context;
import android.util.Log;
import com.onesignal.OneSignal;

public class OneSignalCreator {
    public static void init(Context context, String str, boolean z) {
        Log.w("TEST_TAG", "OnesignalCreator.init,  oneSignalAppId = " + str + "; isPushNotificationsActive = " + z);
        Log.d("OneSignalCreator", "OneSignalCreator.init()");
        if (str != null && !str.isEmpty()) {
            Log.d("OneSignalCreator", "oneSignalAppId : " + str);
            OneSignal.initWithContext(context.getApplicationContext());
            OneSignal.setAppId(str);
            if (z) {
                OneSignal.disablePush(false);
                return;
            }
            Log.d("OneSignalCreator", "disable onesignal push notifications");
            OneSignal.disablePush(true);
        }
    }
}
