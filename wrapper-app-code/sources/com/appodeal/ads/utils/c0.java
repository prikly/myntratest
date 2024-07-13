package com.appodeal.ads.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.app.a;

public abstract class c0 implements a {
    public abstract void a(Activity activity, AppState appState);

    public abstract void a(Configuration configuration);

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, AppState.Created);
    }

    public final void onActivityDestroyed(Activity activity) {
        a(activity, AppState.Destroyed);
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, AppState.Paused);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, AppState.Resumed);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, AppState.Started);
    }

    public final void onActivityStopped(Activity activity) {
        a(activity, AppState.Stopped);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        a(configuration);
    }

    public final void onLowMemory() {
    }
}
