package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7669a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f7670b;

    /* renamed from: c  reason: collision with root package name */
    private a f7671c;

    public interface a {
        void a(boolean z);
    }

    private void a(boolean z) {
        if (this.f7670b != z) {
            this.f7670b = z;
            if (this.f7669a) {
                b(z);
                a aVar = this.f7671c;
                if (aVar != null) {
                    aVar.a(z);
                }
            }
        }
    }

    private boolean a() {
        return (b().importance == 100) || d();
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f7671c = aVar;
    }

    /* access modifiers changed from: package-private */
    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* access modifiers changed from: protected */
    public void b(boolean z) {
    }

    public boolean c() {
        return this.f7670b;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    public void e() {
        this.f7669a = true;
        boolean a2 = a();
        this.f7670b = a2;
        b(a2);
    }

    public void f() {
        this.f7669a = false;
        this.f7671c = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(true);
    }

    public void onActivityStopped(Activity activity) {
        a(a());
    }
}
