package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.h.b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActivityLifecycleListener */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2185a = false;

    /* renamed from: b  reason: collision with root package name */
    public static long f2186b;

    /* renamed from: c  reason: collision with root package name */
    public static long f2187c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f2188d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f2189e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public HashSet<Integer> f2190f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0016a f2191g = new C0016a();

    /* renamed from: h  reason: collision with root package name */
    private volatile CopyOnWriteArrayList<com.bytedance.sdk.component.adexpress.a> f2192h = new CopyOnWriteArrayList<>();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f2188d.incrementAndGet() > 0) {
            this.f2189e.set(false);
        }
    }

    public void onActivityResumed(final Activity activity) {
        e.a(new g("AppConfig_onActivityResume") {
            public void run() {
                k.c().removeMessages(1001);
                if (activity != null) {
                    a.this.f2190f.add(Integer.valueOf(activity.hashCode()));
                    com.bytedance.sdk.component.e.c.a.b((Context) activity);
                }
            }
        }, 5);
        if (!f2185a) {
            f2186b = System.currentTimeMillis();
            f2185a = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        e.a(new g("AppConfig_onActivityResume") {
            public void run() {
                Handler c2 = k.c();
                Message obtain = Message.obtain(c2, a.this.f2191g);
                obtain.what = 1001;
                c2.sendMessageDelayed(obtain, 30000);
            }
        }, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityLifecycleListener */
    static class C0016a implements Runnable {
        C0016a() {
        }

        public void run() {
            e.b().execute(new g("reportPvFromBackGround") {
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f2188d.decrementAndGet() == 0) {
            this.f2189e.set(true);
        }
        b();
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f2190f.remove(Integer.valueOf(activity.hashCode()));
        }
        if (this.f2192h != null && this.f2192h.size() > 0) {
            Iterator<com.bytedance.sdk.component.adexpress.a> it = this.f2192h.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.adexpress.a next = it.next();
                if (next != null) {
                    next.a(activity);
                }
            }
        }
    }

    public void a(com.bytedance.sdk.component.adexpress.a aVar) {
        this.f2192h.add(new WeakReference(aVar).get());
    }

    public boolean b(com.bytedance.sdk.component.adexpress.a aVar) {
        return this.f2192h.remove(new WeakReference(aVar).get());
    }

    public boolean a() {
        return this.f2189e.get();
    }

    private void b() {
        e.b((g) new g("reportSdkUseTime") {
            public void run() {
                if (a.this.a()) {
                    a.f2185a = false;
                    a.f2187c = System.currentTimeMillis();
                    b.a().a(a.f2186b / 1000, a.f2187c / 1000, k.f1350b.get() ^ true ? 1 : 0);
                    k.f1350b.set(false);
                }
            }
        });
    }
}
