package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

class ActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    public static ActivityLifecycleHandler activityLifecycleHandler;
    private static ComponentCallbacks configuration;
    private static ActivityLifecycleListener instance;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    ActivityLifecycleListener() {
    }

    static void registerActivityLifecycleCallbacks(Application application) {
        if (instance == null) {
            ActivityLifecycleListener activityLifecycleListener = new ActivityLifecycleListener();
            instance = activityLifecycleListener;
            application.registerActivityLifecycleCallbacks(activityLifecycleListener);
        }
        if (activityLifecycleHandler == null) {
            activityLifecycleHandler = new ActivityLifecycleHandler(new OSFocusHandler());
        }
        if (configuration == null) {
            AnonymousClass1 r0 = new ComponentCallbacks() {
                public void onLowMemory() {
                }

                public void onConfigurationChanged(Configuration configuration) {
                    ActivityLifecycleListener.activityLifecycleHandler.onConfigurationChanged(configuration, ActivityLifecycleListener.activityLifecycleHandler.getCurActivity());
                }
            };
            configuration = r0;
            application.registerComponentCallbacks(r0);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityCreated(activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityStarted(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityResumed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityPaused(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityStopped(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler2 = activityLifecycleHandler;
        if (activityLifecycleHandler2 != null) {
            activityLifecycleHandler2.onActivityDestroyed(activity);
        }
    }

    public static ActivityLifecycleHandler getActivityLifecycleHandler() {
        return activityLifecycleHandler;
    }
}
