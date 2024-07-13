package com.appodeal.ads.context;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Function1<Activity, Unit> f16347a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Activity, Unit> f16348b;

    public h(d dVar, e eVar) {
        Intrinsics.checkNotNullParameter(dVar, "onTopActivityUpdated");
        Intrinsics.checkNotNullParameter(eVar, "onActivityDestroyed");
        this.f16347a = dVar;
        this.f16348b = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16348b.invoke(activity);
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16347a.invoke(null);
    }

    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16347a.invoke(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
