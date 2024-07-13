package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private p f15364a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15365b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f15366c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private boolean f15367d;

    /* renamed from: e  reason: collision with root package name */
    private final n f15368e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<a> f15369f;

    /* renamed from: g  reason: collision with root package name */
    private long f15370g;

    public interface a {
        void onAdRefresh();
    }

    public d(n nVar, a aVar) {
        this.f15369f = new WeakReference<>(aVar);
        this.f15368e = nVar;
    }

    private void i() {
        synchronized (this.f15365b) {
            if (this.f15364a != null) {
                this.f15364a.b();
            } else {
                this.f15368e.D();
                if (v.a()) {
                    this.f15368e.D().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f15366c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.f15365b) {
            if (this.f15364a != null) {
                this.f15364a.c();
            } else {
                this.f15366c.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        synchronized (this.f15365b) {
            this.f15364a = null;
            if (!((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
                this.f15368e.am().unregisterReceiver(this);
            }
        }
    }

    private void l() {
        if (((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.q)).booleanValue()) {
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r4 = this;
            com.applovin.impl.sdk.n r0 = r4.f15368e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.a.q
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r4.f15365b
            monitor-enter(r0)
            boolean r1 = r4.f15367d     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.n r1 = r4.f15368e     // Catch:{ all -> 0x0062 }
            r1.D()     // Catch:{ all -> 0x0062 }
            boolean r1 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.n r1 = r4.f15368e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.v r1 = r1.D()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.b(r2, r3)     // Catch:{ all -> 0x0062 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0031:
            com.applovin.impl.sdk.n r1 = r4.f15368e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.SessionTracker r1 = r1.ag()     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.isApplicationPaused()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.n r1 = r4.f15368e     // Catch:{ all -> 0x0062 }
            r1.D()     // Catch:{ all -> 0x0062 }
            boolean r1 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.n r1 = r4.f15368e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.v r1 = r1.D()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.b(r2, r3)     // Catch:{ all -> 0x0062 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0057:
            com.applovin.impl.sdk.utils.p r1 = r4.f15364a     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0060
            com.applovin.impl.sdk.utils.p r1 = r4.f15364a     // Catch:{ all -> 0x0062 }
            r1.c()     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0065
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.d.m():void");
    }

    public void a(long j) {
        synchronized (this.f15365b) {
            c();
            this.f15370g = j;
            this.f15364a = p.a(j, this.f15368e, new Runnable() {
                public void run() {
                    d.this.k();
                    a aVar = (a) d.this.f15369f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.r)).booleanValue()) {
                this.f15368e.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                this.f15368e.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                this.f15368e.am().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f15368e.am().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.q)).booleanValue() && (this.f15368e.ah().b() || this.f15368e.ag().isApplicationPaused())) {
                this.f15364a.b();
            }
            if (this.f15366c.compareAndSet(true, false) && ((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.s)).booleanValue()) {
                this.f15368e.D();
                if (v.a()) {
                    this.f15368e.D().b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f15364a.b();
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f15365b) {
            z = this.f15364a != null;
        }
        return z;
    }

    public long b() {
        long a2;
        synchronized (this.f15365b) {
            a2 = this.f15364a != null ? this.f15364a.a() : -1;
        }
        return a2;
    }

    public void c() {
        synchronized (this.f15365b) {
            if (this.f15364a != null) {
                this.f15364a.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.f15365b) {
            i();
            this.f15367d = true;
        }
    }

    public void e() {
        synchronized (this.f15365b) {
            j();
            this.f15367d = false;
        }
    }

    public boolean f() {
        return this.f15367d;
    }

    public void g() {
        if (((Boolean) this.f15368e.a(com.applovin.impl.sdk.c.a.p)).booleanValue()) {
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r0 = (com.applovin.impl.sdk.d.a) r9.f15369f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r9 = this;
            com.applovin.impl.sdk.n r0 = r9.f15368e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.a.p
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r9.f15365b
            monitor-enter(r0)
            boolean r1 = r9.f15367d     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            r1.D()     // Catch:{ all -> 0x0097 }
            boolean r1 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.v r1 = r1.D()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.b(r2, r3)     // Catch:{ all -> 0x0097 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0031:
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.t r1 = r1.ah()     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            r1.D()     // Catch:{ all -> 0x0097 }
            boolean r1 = com.applovin.impl.sdk.v.a()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.v r1 = r1.D()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.b(r2, r3)     // Catch:{ all -> 0x0097 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0057:
            com.applovin.impl.sdk.utils.p r1 = r9.f15364a     // Catch:{ all -> 0x0097 }
            r2 = 0
            if (r1 == 0) goto L_0x0086
            long r3 = r9.f15370g     // Catch:{ all -> 0x0097 }
            long r5 = r9.b()     // Catch:{ all -> 0x0097 }
            long r3 = r3 - r5
            com.applovin.impl.sdk.n r1 = r9.f15368e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.c.b<java.lang.Long> r5 = com.applovin.impl.sdk.c.a.o     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r1.a(r5)     // Catch:{ all -> 0x0097 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0097 }
            long r5 = r1.longValue()     // Catch:{ all -> 0x0097 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0081
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0081
            r9.c()     // Catch:{ all -> 0x0097 }
            r1 = 1
            r2 = 1
            goto L_0x0086
        L_0x0081:
            com.applovin.impl.sdk.utils.p r1 = r9.f15364a     // Catch:{ all -> 0x0097 }
            r1.c()     // Catch:{ all -> 0x0097 }
        L_0x0086:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x009a
            java.lang.ref.WeakReference<com.applovin.impl.sdk.d$a> r0 = r9.f15369f
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.d.a) r0
            if (r0 == 0) goto L_0x009a
            r0.onAdRefresh()
            goto L_0x009a
        L_0x0097:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r1
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.d.h():void");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            g();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }
}
