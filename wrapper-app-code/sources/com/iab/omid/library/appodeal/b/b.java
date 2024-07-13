package com.iab.omid.library.appodeal.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private static b f7769a = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f7770b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7771c;

    /* renamed from: d  reason: collision with root package name */
    private a f7772d;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return f7769a;
    }

    private void a(boolean z) {
        if (this.f7771c != z) {
            this.f7771c = z;
            if (this.f7770b) {
                e();
                a aVar = this.f7772d;
                if (aVar != null) {
                    aVar.a(!z);
                }
            }
        }
    }

    private void e() {
        boolean z = !this.f7771c;
        for (com.iab.omid.library.appodeal.adsession.a adSessionStatePublisher : a.a().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f7772d = aVar;
    }

    public void b() {
        this.f7770b = true;
        this.f7771c = false;
        e();
    }

    public void c() {
        this.f7770b = false;
        this.f7771c = false;
        this.f7772d = null;
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
        View d2;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = d().importance != 100;
            boolean z3 = true;
            for (com.iab.omid.library.appodeal.adsession.a next : a.a().c()) {
                if (next.e() && (d2 = next.d()) != null && d2.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            a(z);
        }
    }

    public void onActivityResumed(Activity activity) {
        a(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
