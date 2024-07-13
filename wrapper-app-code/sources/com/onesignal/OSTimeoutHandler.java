package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OneSignal;

class OSTimeoutHandler extends HandlerThread {
    private static final Object SYNC_LOCK = new Object();
    private static final String TAG = OSTimeoutHandler.class.getCanonicalName();
    private static OSTimeoutHandler timeoutHandler;
    private final Handler mHandler = new Handler(getLooper());

    static OSTimeoutHandler getTimeoutHandler() {
        if (timeoutHandler == null) {
            synchronized (SYNC_LOCK) {
                if (timeoutHandler == null) {
                    timeoutHandler = new OSTimeoutHandler();
                }
            }
        }
        return timeoutHandler;
    }

    private OSTimeoutHandler() {
        super(TAG);
        start();
    }

    /* access modifiers changed from: package-private */
    public void startTimeout(long j, Runnable runnable) {
        synchronized (SYNC_LOCK) {
            destroyTimeout(runnable);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, "Running startTimeout with timeout: " + j + " and runnable: " + runnable.toString());
            this.mHandler.postDelayed(runnable, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void destroyTimeout(Runnable runnable) {
        synchronized (SYNC_LOCK) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, "Running destroyTimeout with runnable: " + runnable.toString());
            this.mHandler.removeCallbacks(runnable);
        }
    }
}
