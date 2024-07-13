package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class BidMachineActivityManager {
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static WeakReference<Activity> weakTopActivity;

    BidMachineActivityManager() {
    }

    static void initialize(Context context) {
        if (isInitialized.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleCallbacks());
                }
            } catch (Throwable th) {
                Logger.log(th);
            }
        }
    }

    static Activity getTopActivity() {
        WeakReference<Activity> weakReference = weakTopActivity;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    static void setTopActivity(Activity activity) {
        weakTopActivity = new WeakReference<>(activity);
    }

    private static class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private LifecycleCallbacks() {
        }

        public void onActivityStarted(Activity activity) {
            BidMachineActivityManager.setTopActivity(activity);
        }

        public void onActivityResumed(Activity activity) {
            BidMachineActivityManager.setTopActivity(activity);
            Utils.onBackgroundThread($$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU.INSTANCE);
        }

        public void onActivityPaused(Activity activity) {
            Utils.onBackgroundThread($$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs.INSTANCE);
        }
    }
}
