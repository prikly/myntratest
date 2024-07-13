package com.appsgeyser.sdk.utils.RateApp;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.server.StatController;
import com.appsgeyser.sdk.utils.RateApp.SharedPrefsCounter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

public class RateAppManager {
    private static RateAppManager instance;
    private final String LOG_TAG = "RateAppManager";
    private Activity currentActivity;
    private boolean isPause = true;
    private final SharedPrefsCounter sharedPrefs;

    private RateAppManager(Context context) {
        this.sharedPrefs = new SharedPrefsCounter(context, new SharedPrefsCounter.OnEntriesListener() {
            public final void onComplete() {
                RateAppManager.this.launchRateMyAppProcess();
            }
        });
    }

    public static RateAppManager getInstance(Context context) {
        if (instance == null) {
            instance = new RateAppManager(context);
        }
        return instance;
    }

    public void setCurrentActivity(Activity activity) {
        Log.d("RateAppManager", "setCurrentActivity()");
        this.currentActivity = activity;
        this.isPause = false;
        this.sharedPrefs.checkNeedToShow();
    }

    public void increaseEntries() {
        this.sharedPrefs.increaseEntries();
    }

    public void setPause() {
        Log.d("RateAppManager", "setPause()");
        this.isPause = true;
    }

    /* access modifiers changed from: private */
    public void launchRateMyAppProcess() {
        StringBuilder sb = new StringBuilder();
        sb.append("Start launchRateMyAppProcess method, currentActivity == null => ");
        sb.append(this.currentActivity == null);
        Log.d("RateAppManager", sb.toString());
        Activity activity = this.currentActivity;
        if (activity != null && !this.isPause) {
            AppsgeyserSDK.isRateMyAppEnabled(activity, new AppsgeyserSDK.OnRateMyAppEnableListener() {
                public final void onRateMyAppEnableReceived(boolean z) {
                    RateAppManager.this.lambda$launchRateMyAppProcess$0$RateAppManager(z);
                }
            });
        }
    }

    public /* synthetic */ void lambda$launchRateMyAppProcess$0$RateAppManager(boolean z) {
        Log.d("RateAppManager", "isRateMyAppIsEnable = " + z);
        if (z) {
            rateApp(this.currentActivity);
        }
    }

    private void rateApp(Activity activity) {
        Log.d("RateAppManager", "Start rateApp() method");
        ReviewManager create = ReviewManagerFactory.create(activity);
        create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener(create, activity) {
            public final /* synthetic */ ReviewManager f$1;
            public final /* synthetic */ Activity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onComplete(Task task) {
                RateAppManager.this.lambda$rateApp$2$RateAppManager(this.f$1, this.f$2, task);
            }
        });
    }

    public /* synthetic */ void lambda$rateApp$2$RateAppManager(ReviewManager reviewManager, Activity activity, Task task) {
        if (task.isSuccessful()) {
            Log.d("RateAppManager", "Success get rate app task");
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() {
                public final void onComplete(Task task) {
                    RateAppManager.this.lambda$rateApp$1$RateAppManager(task);
                }
            });
            this.sharedPrefs.setShownFlag(true);
            return;
        }
        Log.e("RateAppManager", "Error while reviewManager requesting: ", task.getException());
    }

    public /* synthetic */ void lambda$rateApp$1$RateAppManager(Task task) {
        sendAnalyticsEvent();
        Log.d("RateAppManager", "App evaluation process is completed");
    }

    private void sendAnalyticsEvent() {
        StatController.getInstance().sendRequestAsyncByKey("rma_dialog_impressions");
    }
}
