package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.b.a;
import com.bytedance.sdk.openadsdk.component.a;
import com.bytedance.sdk.openadsdk.component.d.b;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.r;
import com.bytedance.sdk.openadsdk.core.g;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTAppOpenAdLoadManager */
public class c implements x.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f546a = 0;

    /* renamed from: b  reason: collision with root package name */
    private AdSlot f547b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f548c;

    /* renamed from: d  reason: collision with root package name */
    private final n<a> f549d;

    /* renamed from: e  reason: collision with root package name */
    private TTAdNative.AppOpenAdListener f550e;

    /* renamed from: f  reason: collision with root package name */
    private x f551f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f552g;

    /* renamed from: h  reason: collision with root package name */
    private int f553h;
    /* access modifiers changed from: private */
    public volatile int i = 0;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private r k;

    public c(Context context) {
        if (context != null) {
            this.f548c = context.getApplicationContext();
        } else {
            this.f548c = m.a();
        }
        this.f549d = m.f();
        this.f552g = a.a(this.f548c);
    }

    public static c a(Context context) {
        return new c(context);
    }

    public void a(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i2) {
        if (appOpenAdListener != null) {
            if (i2 <= 0) {
                l.b("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
                i2 = IronSourceConstants.BN_AUCTION_REQUEST;
            }
            this.f547b = adSlot;
            this.f550e = appOpenAdListener;
            this.f546a = a(adSlot);
            this.f553h = i2;
            x xVar = new x(k.c().getLooper(), this);
            this.f551f = xVar;
            xVar.sendEmptyMessageDelayed(1, (long) i2);
            b(this.f547b);
            c(this.f547b);
        }
    }

    private void b(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = new r();
        this.k = rVar;
        rVar.a(currentTimeMillis);
        this.i = 1;
        o oVar = new o();
        oVar.f1147g = currentTimeMillis;
        oVar.i = this.k;
        oVar.f1144d = 1;
        this.f549d.a(adSlot, oVar, 3, new n.a() {
            public void a(int i, String str) {
                int unused = c.this.i = 3;
                l.b("TTAppOpenAdLoadManager", "try load app open ad from network fail");
                c.this.a(new b(2, 100, i, str));
            }

            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                int unused = c.this.i = 2;
                l.b("TTAppOpenAdLoadManager", "try load app open ad from network success");
                if (aVar == null || aVar.b() == null || aVar.b().size() == 0) {
                    int unused2 = c.this.i = 3;
                    c.this.a(new b(2, 100, 20001, g.a(20001)));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                    c.this.a(nVar, adSlot);
                } else {
                    c.this.a(nVar);
                }
            }
        });
    }

    private void c(AdSlot adSlot) {
        e.a(new com.bytedance.sdk.component.f.g("tryGetAppOpenAdFromCache") {
            public void run() {
                if (!c.this.f552g.e(c.this.f546a)) {
                    return;
                }
                if (c.this.f552g.b(c.this.f546a) || c.this.f552g.d(c.this.f546a)) {
                    com.bytedance.sdk.openadsdk.core.e.n f2 = c.this.f552g.f(c.this.f546a);
                    c.this.f552g.g(c.this.f546a);
                    if (f2 == null) {
                        l.b("TTAppOpenAdLoadManager", "Cached material resolution failed");
                        return;
                    }
                    l.b("TTAppOpenAdLoadManager", "Cached material resolution success");
                    if (com.bytedance.sdk.openadsdk.core.e.n.c(f2)) {
                        if (!TextUtils.isEmpty(c.this.f552g.a(f2)) || Build.VERSION.SDK_INT < 23) {
                            c.this.a(new b(1, 101, f2));
                            return;
                        }
                        l.b("TTAppOpenAdLoadManager", "Video cache path not found");
                        com.bytedance.sdk.openadsdk.component.c.a.b(f2);
                    } else if (c.this.f552g.b(f2)) {
                        c.this.a(new b(1, 101, f2));
                    } else {
                        l.b("TTAppOpenAdLoadManager", "Image cache path not found");
                        com.bytedance.sdk.openadsdk.component.c.a.b(f2);
                    }
                } else {
                    c.this.f552g.g(c.this.f546a);
                }
            }
        }, 10);
    }

    /* access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
        this.f552g.a(nVar, adSlot, this.k, (a.c) new a.c() {
            public void a() {
                int unused = c.this.i = 4;
                c.this.a(new b(1, 100, nVar));
            }

            public void a(int i, String str) {
                int unused = c.this.i = 5;
                c.this.a(new b(2, 100, 10003, g.a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f552g.a(nVar, this.k, (a.b) new a.b() {
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                int unused = c.this.i = 4;
                c.this.a(new b(1, 100, nVar));
            }

            public void a() {
                int unused = c.this.i = 5;
                c.this.a(new b(2, 100, 10003, g.a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        int a2 = bVar.a();
        int b2 = bVar.b();
        if (this.j.get()) {
            if (a2 == 1 && b2 == 100) {
                a.a(m.a()).a(new com.bytedance.sdk.openadsdk.component.d.a(this.f546a, bVar.c()));
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), 1, this.k);
            }
        } else if (a2 == 1) {
            b bVar2 = new b(this.f548c, bVar.c(), b2 == 101);
            TTAdNative.AppOpenAdListener appOpenAdListener = this.f550e;
            if (appOpenAdListener != null) {
                appOpenAdListener.onAppOpenAdLoaded(bVar2);
            }
            this.j.set(true);
            if (b2 == 101) {
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), System.currentTimeMillis() - this.k.a());
            } else if (b2 == 100) {
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), 0, this.k);
                this.f552g.a(this.f547b);
            }
        } else if (a2 == 2 || a2 == 3) {
            TTAdNative.AppOpenAdListener appOpenAdListener2 = this.f550e;
            if (appOpenAdListener2 != null) {
                appOpenAdListener2.onError(bVar.d(), bVar.e());
            }
            this.j.set(true);
            if (a2 == 3) {
                com.bytedance.sdk.openadsdk.component.c.a.a(this.i, this.f553h);
            }
        }
    }

    public int a(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            a(new b(2, 102, 40006, g.a(40006)));
            return 0;
        }
    }

    public void a(Message message) {
        if (message.what == 1 && !this.j.get()) {
            a(new b(3, 102, 10002, g.a(10002)));
        }
    }
}
