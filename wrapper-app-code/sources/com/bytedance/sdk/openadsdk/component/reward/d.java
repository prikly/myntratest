package com.bytedance.sdk.openadsdk.component.reward;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bykv.vk.openvk.component.video.api.f.b;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.h;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.component.reward.b;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.video.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FullScreenVideoLoadManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f686a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f687b;

    /* renamed from: c  reason: collision with root package name */
    private final n f688c = m.f();

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f689d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<a> f690e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public g f691f;

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f692g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (d.this.f691f == null) {
                    d dVar = d.this;
                    g unused = dVar.f691f = new a("fsv net connect task", dVar.f690e);
                }
                h.a().post(d.this.f691f);
            }
        }
    };

    public static d a(Context context) {
        if (f686a == null) {
            synchronized (d.class) {
                if (f686a == null) {
                    f686a = new d(context);
                }
            }
        }
        return f686a;
    }

    private d(Context context) {
        this.f687b = context == null ? m.a() : context.getApplicationContext();
        c();
    }

    public void a() {
        try {
            b.a(this.f687b).a();
        } catch (Throwable unused) {
        }
    }

    public void b() {
        AdSlot b2 = b.a(this.f687b).b();
        if (b2 != null && !TextUtils.isEmpty(b2.getCodeId()) && b.a(this.f687b).c(b2.getCodeId()) == null) {
            b(b2);
        }
    }

    public void a(AdSlot adSlot) {
        b.a(this.f687b).b(adSlot);
    }

    public void a(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        l.b("FullScreenVideoLoadManager", "load full screen video: " + String.valueOf(adSlot));
        l.b("bidding", "load full video: BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
        b.a(this.f687b).a(adSlot);
        a(adSlot, false, fullScreenVideoAdListener);
    }

    public void b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            l.b("FullScreenVideoLoadManager", "preload full screen video: " + String.valueOf(adSlot));
            a(adSlot, true, (TTAdNative.FullScreenVideoAdListener) null);
            return;
        }
        l.b("bidding", "preload not request bidding ：BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
    }

    private void a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            a(adSlot, true, fullScreenVideoAdListener, currentTimeMillis);
            return;
        }
        com.bytedance.sdk.openadsdk.core.e.n c2 = b.a(this.f687b).c(adSlot.getCodeId());
        if (c2 != null) {
            k kVar = new k(this.f687b, c2, adSlot);
            if (!p.i(c2)) {
                kVar.a(b.a(this.f687b).a(c2));
            }
            e.a(c2);
            if (fullScreenVideoAdListener != null) {
                fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                if (!p.i(c2)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final com.bykv.vk.openvk.component.video.api.c.b J = c2.J();
                        c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(c2.aD()).b(), c2);
                        a2.a("material_meta", c2);
                        a2.a("ad_slot", adSlot);
                        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
                        final com.bytedance.sdk.openadsdk.core.e.n nVar = c2;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                            public void a(c cVar, int i) {
                                if (fullScreenVideoAdListener2 != null) {
                                    e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onFullScreenVideoCached");
                                }
                            }

                            public void a(c cVar, int i, String str) {
                                l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail");
                                if (fullScreenVideoAdListener2 != null && J.s()) {
                                    e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail and exec onFullScreenVideoCached");
                                }
                            }
                        });
                    } else {
                        e.b(this.f687b, c2, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            }
            final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener3 = fullScreenVideoAdListener;
            final com.bytedance.sdk.openadsdk.core.e.n nVar2 = c2;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            com.bytedance.sdk.openadsdk.core.video.b.a.a().a(c2, (a.C0009a) new a.C0009a() {
                public void a(boolean z) {
                    if (fullScreenVideoAdListener3 != null && p.i(nVar2)) {
                        e.b(d.this.f687b, nVar2, u.b(adSlot3.getDurationSlotType()), j2);
                        fullScreenVideoAdListener3.onFullScreenVideoCached();
                    }
                }
            });
            l.b("FullScreenVideoLoadManager", "get cache data success");
            l.b("bidding", "full video get cache data success");
            return;
        }
        a(adSlot, false, fullScreenVideoAdListener, currentTimeMillis);
    }

    private void a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener, long j) {
        l.b("bidding", "full video doNetwork , get new materials:BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        o oVar = new o();
        oVar.f1143c = z ? 2 : 1;
        if (m.h().h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f1146f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f688c.a(adSlot, oVar, 8, new n.a() {
            public void a(int i, String str) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(i, str);
                }
            }

            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    l.b("FullScreenVideoLoadManager", "get material data success isPreload=" + z2);
                    final com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                    try {
                        if (nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
                            com.bytedance.sdk.openadsdk.i.b bVar2 = new com.bytedance.sdk.openadsdk.i.b(true);
                            bVar2.a(adSlot2.getCodeId());
                            bVar2.a(8);
                            bVar2.c(nVar.Y());
                            bVar2.d(nVar.ac());
                            bVar2.b(u.h(nVar));
                            com.bytedance.sdk.openadsdk.d.a.a(nVar.M()).a((com.bytedance.sdk.component.d.n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final k kVar = new k(d.this.f687b, nVar, adSlot2);
                    if (!z2 && fullScreenVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            e.a(nVar, "fullscreen_interstitial_ad", System.currentTimeMillis() - currentTimeMillis);
                        }
                        fullScreenVideoAdListener2.onFullScreenVideoAdLoad(kVar);
                    }
                    com.bytedance.sdk.openadsdk.core.video.b.a.a().a(nVar, (a.C0009a) new a.C0009a() {
                        public void a(boolean z) {
                            com.bytedance.sdk.openadsdk.core.e.n nVar;
                            if (!z2 && fullScreenVideoAdListener2 != null && (nVar = nVar) != null && p.i(nVar)) {
                                e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                fullScreenVideoAdListener2.onFullScreenVideoCached();
                            }
                        }
                    });
                    if (z2 && !p.i(nVar) && m.h().n(adSlot2.getCodeId()).f1235d == 1 && !com.bytedance.sdk.component.utils.o.d(d.this.f687b)) {
                        d.this.a(new a(nVar, adSlot2));
                    } else if (p.i(nVar)) {
                        b.a(d.this.f687b).a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
                        if (J != null) {
                            c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(nVar.aD()).b(), nVar);
                            a2.a("material_meta", nVar);
                            a2.a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                            com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                                public void a(c cVar, int i) {
                                    l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadSuccess");
                                    if (!z2) {
                                        if (fullScreenVideoAdListener2 != null) {
                                            e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                            fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        }
                                        l.c("FullScreenVideoLoadManager", "FullScreenLog: onFullScreenVideoCached");
                                        return;
                                    }
                                    b.a(d.this.f687b).a(adSlot2, nVar);
                                    l.c("FullScreenVideoLoadManager", "FullScreenLog:  ad json save");
                                }

                                public void a(c cVar, int i, String str) {
                                    l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail");
                                    if (fullScreenVideoAdListener2 != null && J.s()) {
                                        e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail and exec onFullScreenVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        b.a(d.this.f687b).a(nVar, (b.a<Object>) new b.a<Object>() {
                            public void a(boolean z, Object obj) {
                                l.b("FullScreenVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    kVar.a(b.a(d.this.f687b).a(nVar));
                                }
                                if (!z2) {
                                    e.a(nVar);
                                    if (z && fullScreenVideoAdListener2 != null) {
                                        e.b(d.this.f687b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    }
                                } else if (z) {
                                    b.a(d.this.f687b).a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(-3, com.bytedance.sdk.openadsdk.core.g.a(-3));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                }
            }
        });
    }

    public void a(String str) {
        b.a(this.f687b).a(str);
    }

    public AdSlot b(String str) {
        return b.a(this.f687b).b(str);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar != null) {
            if (this.f690e.size() >= 1) {
                this.f690e.remove(0);
            }
            this.f690e.add(aVar);
        }
    }

    private void c() {
        if (!this.f689d.get()) {
            this.f689d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f687b.registerReceiver(this.f692g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    private void d() {
        if (this.f689d.get()) {
            this.f689d.set(false);
            try {
                this.f687b.unregisterReceiver(this.f692g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f691f != null) {
            try {
                h.a().removeCallbacks(this.f691f);
            } catch (Exception unused) {
            }
            this.f691f = null;
        }
        d();
    }

    /* compiled from: FullScreenVideoLoadManager */
    private static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.e.n f719a;

        /* renamed from: b  reason: collision with root package name */
        AdSlot f720b;

        a(com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.f719a = nVar;
            this.f720b = adSlot;
        }

        public void run() {
            if (this.f719a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    b.a(m.a()).a(this.f719a, (b.a<Object>) new b.a<Object>() {
                        public void a(boolean z, Object obj) {
                            if (z) {
                                b.a(m.a()).a(a.this.f720b, a.this.f719a);
                                l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                                return;
                            }
                            l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail ");
                        }
                    });
                } else if (this.f719a.J() != null) {
                    c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(this.f719a.aD()).b(), this.f719a);
                    a2.a("material_meta", this.f719a);
                    a2.a("ad_slot", this.f720b);
                    l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                    com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                        public void a(c cVar, int i) {
                            b.a(m.a()).a(a.this.f720b, a.this.f719a);
                            l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        }

                        public void a(c cVar, int i, String str) {
                            l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail with net change ");
                        }
                    });
                }
            }
        }
    }
}
