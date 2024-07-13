package com.iab.omid.library.amazon.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private static b f7548a = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f7549b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7550c;

    /* renamed from: d  reason: collision with root package name */
    private a f7551d;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return f7548a;
    }

    private void a(boolean z) {
        if (this.f7550c != z) {
            this.f7550c = z;
            if (this.f7549b) {
                e();
                a aVar = this.f7551d;
                if (aVar != null) {
                    aVar.a(!z);
                }
            }
        }
    }

    private void e() {
        boolean z = !this.f7550c;
        for (com.iab.omid.library.amazon.adsession.a adSessionStatePublisher : a.a().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f7551d = aVar;
    }

    public void b() {
        this.f7549b = true;
        this.f7550c = false;
        e();
    }

    public void c() {
        this.f7549b = false;
        this.f7550c = false;
        this.f7551d = null;
    }

    /* access modifiers changed from: package-private */
    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
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
        a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e2;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = d().importance != 100;
            boolean z3 = true;
            for (com.iab.omid.library.amazon.adsession.a next : a.a().c()) {
                if (next.f() && (e2 = next.e()) != null && e2.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            a(z);
        }
    }
}
