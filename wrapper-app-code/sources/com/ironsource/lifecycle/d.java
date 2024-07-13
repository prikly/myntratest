package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.environment.e.c;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    static AtomicBoolean f8098a = new AtomicBoolean(false);
    private static d j = new d();

    /* renamed from: b  reason: collision with root package name */
    int f8099b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f8100c = 0;

    /* renamed from: d  reason: collision with root package name */
    boolean f8101d = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f8102e = true;

    /* renamed from: f  reason: collision with root package name */
    int f8103f = e.f8112a;
    /* access modifiers changed from: package-private */

    /* renamed from: g  reason: collision with root package name */
    public List<c> f8104g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    Runnable f8105h = new Runnable() {
        public final void run() {
            d.a(d.this);
            d.this.c();
        }
    };
    private String i = "IronsourceLifecycleManager";
    private b.a k = new b.a() {
        public final void a(Activity activity) {
            d dVar = d.this;
            dVar.f8099b++;
            if (dVar.f8099b == 1 && dVar.f8102e) {
                c.f8074a.c(new Runnable() {
                    public final void run() {
                        for (c a2 : d.this.f8104g) {
                            a2.a();
                        }
                    }
                });
                dVar.f8102e = false;
                dVar.f8103f = e.f8113b;
            }
        }

        public final void b(Activity activity) {
            d dVar = d.this;
            dVar.f8100c++;
            if (dVar.f8100c != 1) {
                return;
            }
            if (dVar.f8101d) {
                c.f8074a.c(new Runnable() {
                    public final void run() {
                        Iterator it = d.this.f8104g.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                });
                dVar.f8101d = false;
                dVar.f8103f = e.f8114c;
                return;
            }
            c cVar = c.f8074a;
            c.b(dVar.f8105h);
        }
    };

    public static d a() {
        return j;
    }

    static /* synthetic */ void a(d dVar) {
        if (dVar.f8100c == 0) {
            dVar.f8101d = true;
            c.f8074a.c(new Runnable() {
                public final void run() {
                    Iterator it = d.this.f8104g.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            dVar.f8103f = e.f8115d;
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.f8099b == 0 && this.f8101d) {
            c.f8074a.c(new Runnable() {
                public final void run() {
                    for (c b2 : d.this.f8104g) {
                        b2.b();
                    }
                }
            });
            this.f8102e = true;
            this.f8103f = e.f8116e;
        }
    }

    public final void a(c cVar) {
        if (IronsourceLifecycleProvider.a() && !this.f8104g.contains(cVar)) {
            this.f8104g.add(cVar);
        }
    }

    public final boolean b() {
        return this.f8103f == e.f8116e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b.b(activity);
        b a2 = b.a(activity);
        if (a2 != null) {
            a2.f8097a = this.k;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i2 = this.f8100c - 1;
        this.f8100c = i2;
        if (i2 == 0) {
            c cVar = c.f8074a;
            c.a(this.f8105h, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f8099b--;
        c();
    }
}
