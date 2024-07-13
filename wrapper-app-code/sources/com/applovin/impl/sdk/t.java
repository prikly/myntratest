package com.applovin.impl.sdk;

import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.c.b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class t {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f15777a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f15778b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f15779c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f15780d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f15781e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f15782f;

    /* renamed from: g  reason: collision with root package name */
    private Object f15783g;

    t(n nVar) {
        this.f15777a = nVar;
    }

    public void a(final Object obj) {
        if (!c.a(obj) && this.f15778b.compareAndSet(false, true)) {
            this.f15783g = obj;
            this.f15779c = System.currentTimeMillis();
            this.f15777a.D();
            if (v.a()) {
                v D = this.f15777a.D();
                D.b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f15779c);
            }
            this.f15777a.am().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f15777a.a(b.co)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (t.this.f15778b.get() && System.currentTimeMillis() - t.this.f15779c >= longValue) {
                            t.this.f15777a.D();
                            if (v.a()) {
                                t.this.f15777a.D().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            t.this.b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    public void a(boolean z) {
        synchronized (this.f15780d) {
            this.f15781e.set(z);
            if (z) {
                this.f15782f = System.currentTimeMillis();
                this.f15777a.D();
                if (v.a()) {
                    v D = this.f15777a.D();
                    D.b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f15782f);
                }
                final long longValue = ((Long) this.f15777a.a(b.cn)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                        public void run() {
                            if (t.this.a() && System.currentTimeMillis() - t.this.f15782f >= longValue) {
                                t.this.f15777a.D();
                                if (v.a()) {
                                    t.this.f15777a.D().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                t.this.f15781e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f15782f = 0;
                this.f15777a.D();
                if (v.a()) {
                    v D2 = this.f15777a.D();
                    D2.b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public boolean a() {
        return this.f15781e.get();
    }

    public void b(Object obj) {
        if (!c.a(obj) && this.f15778b.compareAndSet(true, false)) {
            this.f15783g = null;
            this.f15777a.D();
            if (v.a()) {
                v D = this.f15777a.D();
                D.b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f15777a.am().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public boolean b() {
        return this.f15778b.get();
    }

    public Object c() {
        return this.f15783g;
    }
}
