package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\u0010"}, d2 = {"Lcom/onesignal/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "()V", "onMessage", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", "error", "onUnregistered", "registrationId", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ADMMessageHandlerJob.kt */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        NotificationBundleProcessor.processBundleFromReceiver(context, extras, new ADMMessageHandlerJob$onMessage$bundleReceiverCallback$1(extras, context));
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "ADM registration ID: " + str);
        PushRegistratorADM.fireCallback(str);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "ADM:onUnregistered: " + str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.Log(log_level, "ADM:onRegistrationError: " + str);
        if (Intrinsics.areEqual((Object) "INVALID_SENDER", (Object) str)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback((String) null);
    }
}
