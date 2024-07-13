package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationBundleProcessor;

public class FCMIntentService extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(final Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            OneSignal.initWithContext(this);
            NotificationBundleProcessor.processBundleFromReceiver(this, extras, new NotificationBundleProcessor.ProcessBundleReceiverCallback() {
                public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                    FCMBroadcastReceiver.completeWakefulIntent(intent);
                }
            });
        }
    }
}
