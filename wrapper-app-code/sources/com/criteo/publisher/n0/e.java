package com.criteo.publisher.n0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.criteo.publisher.a.a;

/* compiled from: AppLifecycleUtil */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final a f2887a;

    /* renamed from: b  reason: collision with root package name */
    private final com.criteo.publisher.e f2888b;

    /* renamed from: c  reason: collision with root package name */
    private int f2889c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f2890d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2891e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2892f = false;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public e(a aVar, com.criteo.publisher.e eVar) {
        this.f2887a = aVar;
        this.f2888b = eVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f2892f) {
            this.f2892f = true;
            this.f2887a.d();
        }
    }

    public void onActivityStarted(Activity activity) {
        this.f2889c++;
    }

    public void onActivityResumed(Activity activity) {
        if (this.f2890d == 0 && !this.f2891e) {
            this.f2887a.b();
        }
        this.f2891e = false;
        this.f2890d++;
    }

    public void onActivityPaused(Activity activity) {
        this.f2891e = true;
        this.f2890d--;
    }

    public void onActivityStopped(Activity activity) {
        if (this.f2889c == 1) {
            if (this.f2891e && this.f2890d == 0) {
                this.f2887a.c();
            }
            this.f2887a.a();
            this.f2888b.c();
        }
        this.f2891e = false;
        this.f2889c--;
    }
}
