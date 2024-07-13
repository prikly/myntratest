package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.applovin.impl.sdk.utils.a> f15178a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f15179b = new WeakReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f15180c = new WeakReference<>((Object) null);

    public a(Context context) {
        v.f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f15179b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f15180c = this.f15179b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f15179b.get();
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.f15178a.add(aVar);
    }

    public Activity b() {
        return (Activity) this.f15180c.get();
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.f15178a.remove(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a onActivityCreated : new ArrayList(this.f15178a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (com.applovin.impl.sdk.utils.a onActivityDestroyed : new ArrayList(this.f15178a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f15180c = new WeakReference<>((Object) null);
        for (com.applovin.impl.sdk.utils.a onActivityPaused : new ArrayList(this.f15178a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f15179b = weakReference;
        this.f15180c = weakReference;
        for (com.applovin.impl.sdk.utils.a onActivityResumed : new ArrayList(this.f15178a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (com.applovin.impl.sdk.utils.a onActivitySaveInstanceState : new ArrayList(this.f15178a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (com.applovin.impl.sdk.utils.a onActivityStarted : new ArrayList(this.f15178a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (com.applovin.impl.sdk.utils.a onActivityStopped : new ArrayList(this.f15178a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
