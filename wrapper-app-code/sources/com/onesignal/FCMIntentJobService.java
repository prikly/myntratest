package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.NotificationBundleProcessor;

public class FCMIntentJobService extends JobIntentService {
    public static final String BUNDLE_EXTRA = "Bundle:Parcelable:Extras";
    private static final int JOB_ID = 123890;

    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z) {
        super.setInterruptIfStopped(z);
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            OneSignal.initWithContext(this);
            NotificationBundleProcessor.processBundleFromReceiver(this, extras, new NotificationBundleProcessor.ProcessBundleReceiverCallback() {
                public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                }
            });
        }
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, FCMIntentJobService.class, (int) JOB_ID, intent, false);
    }
}
