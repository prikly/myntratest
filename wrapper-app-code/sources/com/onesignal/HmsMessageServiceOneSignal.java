package com.onesignal;

import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;

public class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.onesignal.HmsMessageServiceOneSignal] */
    public void onNewToken(String str, Bundle bundle) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "HmsMessageServiceOneSignal onNewToken refresh token:" + str);
        OneSignalHmsEventBridge.onNewToken(this, str, bundle);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.onesignal.HmsMessageServiceOneSignal] */
    @Deprecated
    public void onNewToken(String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "HmsMessageServiceOneSignal onNewToken refresh token:" + str);
        OneSignalHmsEventBridge.onNewToken(this, str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, com.onesignal.HmsMessageServiceOneSignal] */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        OneSignalHmsEventBridge.onMessageReceived(this, remoteMessage);
    }
}
