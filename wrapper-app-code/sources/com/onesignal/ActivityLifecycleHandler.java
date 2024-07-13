package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ActivityLifecycleHandler implements OSSystemConditionController.OSSystemConditionHandler {
    private static final String FOCUS_LOST_WORKER_TAG = "FOCUS_LOST_WORKER_TAG";
    private static final int SYNC_AFTER_BG_DELAY_MS = 2000;
    private static final Map<String, ActivityAvailableListener> sActivityAvailableListeners = new ConcurrentHashMap();
    private static final Map<String, KeyboardListener> sKeyboardListeners = new ConcurrentHashMap();
    private static final Map<String, OSSystemConditionController.OSSystemConditionObserver> sSystemConditionObservers = new ConcurrentHashMap();
    private Activity curActivity = null;
    private final OSFocusHandler focusHandler;
    private boolean nextResumeIsFirstActivity = false;

    /* access modifiers changed from: package-private */
    public void onActivityCreated(Activity activity) {
    }

    static abstract class ActivityAvailableListener {
        /* access modifiers changed from: package-private */
        public void available(Activity activity) {
        }

        /* access modifiers changed from: package-private */
        public void lostFocus() {
        }

        /* access modifiers changed from: package-private */
        public void stopped(Activity activity) {
        }

        ActivityAvailableListener() {
        }
    }

    public ActivityLifecycleHandler(OSFocusHandler oSFocusHandler) {
        this.focusHandler = oSFocusHandler;
    }

    /* access modifiers changed from: package-private */
    public void onConfigurationChanged(Configuration configuration, Activity activity) {
        Activity activity2 = this.curActivity;
        if (activity2 != null && OSUtils.hasConfigChangeFlag(activity2, 128)) {
            logOrientationChange(configuration.orientation, activity);
            onOrientationChanged(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityStarted(Activity activity) {
        this.focusHandler.startOnStartFocusWork();
    }

    /* access modifiers changed from: package-private */
    public void onActivityResumed(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "onActivityResumed: " + activity);
        setCurActivity(activity);
        logCurActivity();
        handleFocus();
    }

    /* access modifiers changed from: package-private */
    public void onActivityPaused(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "onActivityPaused: " + activity);
        if (activity == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        logCurActivity();
    }

    /* access modifiers changed from: package-private */
    public void onActivityStopped(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "onActivityStopped: " + activity);
        if (activity == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).stopped(activity);
        }
        logCurActivity();
        if (this.curActivity == null) {
            this.focusHandler.startOnStopFocusWork();
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityDestroyed(Activity activity) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "onActivityDestroyed: " + activity);
        sKeyboardListeners.clear();
        if (activity == this.curActivity) {
            this.curActivity = null;
            handleLostFocus();
        }
        logCurActivity();
    }

    private void logCurActivity() {
        String str;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("curActivity is NOW: ");
        if (this.curActivity != null) {
            str = "" + this.curActivity.getClass().getName() + ":" + this.curActivity;
        } else {
            str = "null";
        }
        sb.append(str);
        OneSignal.Log(log_level, sb.toString());
    }

    private void logOrientationChange(int i, Activity activity) {
        if (i == 2) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level, "Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity);
        } else if (i == 1) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level2, "Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity);
        }
    }

    private void onOrientationChanged(Activity activity) {
        handleLostFocus();
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).stopped(activity);
        }
        for (Map.Entry<String, ActivityAvailableListener> value2 : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value2.getValue()).available(this.curActivity);
        }
        ViewTreeObserver viewTreeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry next : sSystemConditionObservers.entrySet()) {
            KeyboardListener keyboardListener = new KeyboardListener(this, (OSSystemConditionController.OSSystemConditionObserver) next.getValue(), (String) next.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(keyboardListener);
            sKeyboardListeners.put((String) next.getKey(), keyboardListener);
        }
        handleFocus();
    }

    private void handleLostFocus() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.focusHandler;
        if (oSFocusHandler == null) {
            return;
        }
        if (!oSFocusHandler.hasBackgrounded() || this.focusHandler.hasCompleted()) {
            OneSignal.getFocusTimeController().appStopped();
            this.focusHandler.startOnLostFocusWorker(FOCUS_LOST_WORKER_TAG, 2000, OneSignal.appContext);
        }
    }

    private void handleFocus() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.nextResumeIsFirstActivity);
        if (this.focusHandler.hasBackgrounded() || this.nextResumeIsFirstActivity) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler reset background state, call app focus");
            this.nextResumeIsFirstActivity = false;
            this.focusHandler.startOnFocusWork();
            return;
        }
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler cancel background lost focus worker");
        this.focusHandler.cancelOnLostFocusWorker(FOCUS_LOST_WORKER_TAG, OneSignal.appContext);
    }

    /* access modifiers changed from: package-private */
    public void addSystemConditionObserver(String str, OSSystemConditionController.OSSystemConditionObserver oSSystemConditionObserver) {
        Activity activity = this.curActivity;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            KeyboardListener keyboardListener = new KeyboardListener(this, oSSystemConditionObserver, str);
            viewTreeObserver.addOnGlobalLayoutListener(keyboardListener);
            sKeyboardListeners.put(str, keyboardListener);
        }
        sSystemConditionObservers.put(str, oSSystemConditionObserver);
    }

    public void removeSystemConditionObserver(String str, KeyboardListener keyboardListener) {
        Activity activity = this.curActivity;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT < 16) {
                viewTreeObserver.removeGlobalOnLayoutListener(keyboardListener);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(keyboardListener);
            }
        }
        sKeyboardListeners.remove(str);
        sSystemConditionObservers.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void addActivityAvailableListener(String str, ActivityAvailableListener activityAvailableListener) {
        sActivityAvailableListeners.put(str, activityAvailableListener);
        Activity activity = this.curActivity;
        if (activity != null) {
            activityAvailableListener.available(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void removeActivityAvailableListener(String str) {
        sActivityAvailableListeners.remove(str);
    }

    public Activity getCurActivity() {
        return this.curActivity;
    }

    public void setCurActivity(Activity activity) {
        this.curActivity = activity;
        for (Map.Entry<String, ActivityAvailableListener> value : sActivityAvailableListeners.entrySet()) {
            ((ActivityAvailableListener) value.getValue()).available(this.curActivity);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : sSystemConditionObservers.entrySet()) {
                KeyboardListener keyboardListener = new KeyboardListener(this, (OSSystemConditionController.OSSystemConditionObserver) next.getValue(), (String) next.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(keyboardListener);
                sKeyboardListeners.put((String) next.getKey(), keyboardListener);
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextResumeIsFirstActivity(boolean z) {
        this.nextResumeIsFirstActivity = z;
    }

    static class KeyboardListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private final String key;
        private final OSSystemConditionController.OSSystemConditionObserver observer;
        private final OSSystemConditionController.OSSystemConditionHandler systemConditionListener;

        private KeyboardListener(OSSystemConditionController.OSSystemConditionHandler oSSystemConditionHandler, OSSystemConditionController.OSSystemConditionObserver oSSystemConditionObserver, String str) {
            this.systemConditionListener = oSSystemConditionHandler;
            this.observer = oSSystemConditionObserver;
            this.key = str;
        }

        public void onGlobalLayout() {
            if (!OSViewUtils.isKeyboardUp(new WeakReference(OneSignal.getCurrentActivity()))) {
                this.systemConditionListener.removeSystemConditionObserver(this.key, this);
                this.observer.systemConditionChanged();
            }
        }
    }
}
