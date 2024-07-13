package com.amazon.aps.shared.util;

import android.util.Log;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApsAsyncUtil {
    private static ApsAsyncUtil INSTANCE;
    /* access modifiers changed from: private */
    public static final String TAG = ApsAsyncUtil.class.getSimpleName();
    /* access modifiers changed from: private */
    public final ExecutorService executorService = Executors.newFixedThreadPool(1);
    /* access modifiers changed from: private */
    public boolean shutdownInProgress = false;

    public interface ApsExecutionListener {
        void onExecutionCompleted(ApsResult apsResult);
    }

    private ApsAsyncUtil() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    boolean unused = ApsAsyncUtil.this.shutdownInProgress = true;
                    Log.d(ApsAsyncUtil.TAG, "App is shutting down, terminating the thread executor");
                    ApsAsyncUtil.this.executorService.shutdown();
                } catch (RuntimeException e2) {
                    Log.e(ApsAsyncUtil.TAG, "Error in stopping the executor", e2);
                }
            }
        });
    }

    public static ApsAsyncUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApsAsyncUtil();
        }
        return INSTANCE;
    }

    public synchronized void runAsyncAndCallback(Runnable runnable, ApsExecutionListener apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(runnable);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new Runnable(runnable, apsExecutionListener) {
                    public final /* synthetic */ Runnable f$0;
                    public final /* synthetic */ ApsAsyncUtil.ApsExecutionListener f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ApsAsyncUtil.lambda$runAsyncAndCallback$0(this.f$0, this.f$1);
                    }
                });
            }
        } catch (RuntimeException e2) {
            Log.e(TAG, "Error running the thread", e2);
        }
        return;
    }

    static /* synthetic */ void lambda$runAsyncAndCallback$0(Runnable runnable, ApsExecutionListener apsExecutionListener) {
        ApsResult apsResult = ApsResult.FAILURE;
        try {
            runnable.run();
            ApsResult apsResult2 = ApsResult.SUCCESS;
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult2);
            }
        } catch (Exception e2) {
            Log.e(TAG, "Error running the thread", e2);
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult);
            }
        } catch (Throwable th) {
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult);
            }
            throw th;
        }
    }
}
