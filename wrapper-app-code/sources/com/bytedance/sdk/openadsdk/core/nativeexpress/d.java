package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bykv.vk.openvk.component.video.api.e.a;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.b;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.g;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExpressAdLoadManager */
public class d {
    private static Set<d> j = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public AdSlot f1443a;

    /* renamed from: b  reason: collision with root package name */
    private final n f1444b = m.f();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Context f1445c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TTAdNative.NativeExpressAdListener f1446d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f1447e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.e.n> f1448f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.e.n> f1449g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public a f1450h;
    /* access modifiers changed from: private */
    public int i = 5;
    private ScheduledFuture<?> k = null;
    private ScheduledFuture<?> l = null;
    private ScheduledFuture<?> m = null;
    /* access modifiers changed from: private */
    public long n = 0;

    /* compiled from: ExpressAdLoadManager */
    public interface a {
        void a();

        void a(List<com.bytedance.sdk.openadsdk.core.e.n> list);
    }

    private d(Context context) {
        if (context != null) {
            this.f1445c = context.getApplicationContext();
        } else {
            this.f1445c = m.a();
        }
        j.add(this);
    }

    public static d a(Context context) {
        return new d(context);
    }

    public void a(AdSlot adSlot, int i2, TTAdNative.NativeExpressAdListener nativeExpressAdListener, int i3) {
        a(adSlot, i2, nativeExpressAdListener, (a) null, i3);
    }

    public void a(AdSlot adSlot, int i2, TTAdNative.NativeExpressAdListener nativeExpressAdListener, a aVar, int i3) {
        this.n = System.currentTimeMillis();
        if (this.f1447e.get()) {
            l.e("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.i = i2;
        this.f1447e.set(true);
        this.f1443a = adSlot;
        this.f1446d = nativeExpressAdListener;
        this.f1450h = aVar;
        a(adSlot, nativeExpressAdListener);
    }

    private void a(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        if (adSlot != null) {
            o oVar = new o();
            oVar.f1146f = 2;
            this.f1444b.a(adSlot, oVar, this.i, new n.a() {
                public void a(int i, String str) {
                    d.this.a(i, str);
                }

                public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, b bVar) {
                    if (aVar.b() == null || aVar.b().isEmpty()) {
                        d.this.a(-3, g.a(-3));
                        bVar.a(-3);
                        b.a(bVar);
                        return;
                    }
                    List unused = d.this.f1448f = aVar.b();
                    List unused2 = d.this.f1449g = aVar.b();
                    d.this.a(adSlot);
                    d dVar = d.this;
                    dVar.a(dVar.n);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f1448f;
        if (list != null) {
            for (com.bytedance.sdk.openadsdk.core.e.n next : list) {
                if (next.ao() && next.P() != null && !next.P().isEmpty()) {
                    for (k next2 : next.P()) {
                        if (!TextUtils.isEmpty(next2.a())) {
                            com.bytedance.sdk.openadsdk.i.d.a().c().a(new com.bytedance.sdk.openadsdk.i.a(next2.a(), next2.g()), com.bytedance.sdk.openadsdk.i.a.a.b(), next2.b(), next2.c(), (String) null);
                        }
                    }
                }
                if (!(!com.bytedance.sdk.openadsdk.core.e.n.c(next) || next.J() == null || next.J().i() == null)) {
                    if (m.h().b(String.valueOf(u.f(next))) && m.h().G()) {
                        c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(next.aD()).a(), next);
                        a2.a("material_meta", next);
                        a2.a("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, (a.C0222a) null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(final long j2) {
        if (this.f1447e.getAndSet(false)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (d.this.f1449g == null || d.this.f1449g.size() <= 0) {
                        if (d.this.f1446d != null) {
                            d.this.f1446d.onError(108, g.a(108));
                            d.this.a(108);
                        }
                        if (d.this.f1450h != null) {
                            d.this.f1450h.a();
                        }
                    } else {
                        if (d.this.f1446d != null) {
                            ArrayList arrayList = new ArrayList(d.this.f1449g.size());
                            for (com.bytedance.sdk.openadsdk.core.e.n a2 : d.this.f1449g) {
                                arrayList.add(d.this.a(a2));
                            }
                            if (!arrayList.isEmpty()) {
                                if (!TextUtils.isEmpty(d.this.f1443a.getBidAdm())) {
                                    e.a((com.bytedance.sdk.openadsdk.core.e.n) d.this.f1449g.get(0), u.b(d.this.i), System.currentTimeMillis() - d.this.n);
                                } else {
                                    e.b(d.this.f1445c, (com.bytedance.sdk.openadsdk.core.e.n) d.this.f1449g.get(0), u.b(d.this.f1443a.getDurationSlotType()), j2);
                                }
                                d.this.f1446d.onNativeExpressAdLoad(arrayList);
                            } else {
                                d.this.f1446d.onError(103, g.a(103));
                                d.this.a(103);
                            }
                        }
                        if (d.this.f1450h != null) {
                            d.this.f1450h.a(d.this.f1449g);
                        }
                    }
                    d.this.a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f1448f;
        com.bytedance.sdk.openadsdk.h.a.b e2 = com.bytedance.sdk.openadsdk.h.a.b.b().a(this.i).c(this.f1443a.getCodeId()).e((list == null || list.size() <= 0) ? "" : u.h(this.f1448f.get(0)));
        e2.b(i2).f(g.a(i2));
        com.bytedance.sdk.openadsdk.h.b.a().b(e2);
    }

    /* access modifiers changed from: private */
    public void a(int i2, String str) {
        if (this.f1447e.getAndSet(false)) {
            TTAdNative.NativeExpressAdListener nativeExpressAdListener = this.f1446d;
            if (nativeExpressAdListener != null) {
                nativeExpressAdListener.onError(i2, str);
            }
            a aVar = this.f1450h;
            if (aVar != null) {
                aVar.a();
            }
            a();
        }
    }

    /* access modifiers changed from: private */
    public TTNativeExpressAd a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (this.i != 1) {
            return null;
        }
        if (nVar.J() != null) {
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.b(this.f1445c, nVar, this.f1443a);
        }
        return new com.bytedance.sdk.openadsdk.core.bannerexpress.a(this.f1445c, nVar, this.f1443a);
    }

    /* access modifiers changed from: private */
    public void a() {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f1448f;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.e.n> list2 = this.f1449g;
        if (list2 != null) {
            list2.clear();
        }
        a(true);
        b(true);
        c(true);
        b();
    }

    private void a(boolean z) {
        try {
            if (this.l != null && !this.l.isCancelled()) {
                boolean cancel = this.l.cancel(z);
                l.e("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    private void b(boolean z) {
        try {
            if (this.m != null && !this.m.isCancelled()) {
                boolean cancel = this.m.cancel(z);
                l.b("ExpressAdLoadManager", "CheckValidDoneFutureTask-->cancel.....success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    private void c(boolean z) {
        try {
            if (this.k != null && !this.k.isCancelled()) {
                boolean cancel = this.k.cancel(z);
                l.e("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    private void b() {
        j.remove(this);
    }
}
