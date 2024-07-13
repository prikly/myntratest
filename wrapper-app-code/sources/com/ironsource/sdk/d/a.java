package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.sdk.utils.SDKUtils;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private c f9424a;

    public a(c cVar) {
        this.f9424a = cVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f9424a.d(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f9424a.e(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
