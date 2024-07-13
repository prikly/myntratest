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
import com.bytedance.sdk.openadsdk.component.reward.g;
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

/* compiled from: RewardVideoLoadManager */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f747a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f748b;

    /* renamed from: c  reason: collision with root package name */
    private final n f749c = m.f();

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f750d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<a> f751e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public g f752f;

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f753g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (i.this.f752f == null) {
                    i iVar = i.this;
                    g unused = iVar.f752f = new a("net connect task", iVar.f751e);
                }
                h.a().post(i.this.f752f);
            }
        }
    };

    public static i a(Context context) {
        if (f747a == null) {
            synchronized (i.class) {
                if (f747a == null) {
                    f747a = new i(context);
                }
            }
        }
        return f747a;
    }

    private i(Context context) {
        this.f748b = context == null ? m.a() : context.getApplicationContext();
        c();
    }

    public void a() {
        AdSlot b2 = g.a(this.f748b).b();
        if (b2 != null && !TextUtils.isEmpty(b2.getCodeId()) && g.a(this.f748b).c(b2.getCodeId()) == null) {
            b(b2);
        }
    }

    public void a(AdSlot adSlot) {
        g.a(this.f748b).b(adSlot);
    }

    public void b() {
        try {
            g.a(this.f748b).a();
        } catch (Throwable unused) {
        }
    }

    public void a(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        l.b("RewardVideoLoadManager", "load reward vide: " + String.valueOf(adSlot));
        l.b("bidding", "load reward vide: BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
        g.a(this.f748b).a(adSlot);
        a(adSlot, false, rewardVideoAdListener);
    }

    public void b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            l.b("RewardVideoLoadManager", "preload reward video: " + String.valueOf(adSlot));
            a(adSlot, true, (TTAdNative.RewardVideoAdListener) null);
            return;
        }
        l.b("bidding", "preload not request bidding：BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
    }

    private void a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            a(adSlot, true, rewardVideoAdListener, currentTimeMillis);
            return;
        }
        com.bytedance.sdk.openadsdk.core.e.n c2 = g.a(this.f748b).c(adSlot.getCodeId());
        if (c2 != null) {
            l lVar = new l(this.f748b, c2, adSlot);
            if (!p.i(c2)) {
                lVar.a(g.a(this.f748b).a(c2));
            }
            e.a(c2);
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                if (!p.i(c2)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final com.bykv.vk.openvk.component.video.api.c.b J = c2.J();
                        c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(c2.aD()).b(), c2);
                        a2.a("material_meta", c2);
                        a2.a("ad_slot", adSlot);
                        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
                        final com.bytedance.sdk.openadsdk.core.e.n nVar = c2;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                            public void a(c cVar, int i) {
                                if (rewardVideoAdListener2 != null) {
                                    e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onRewardVideoCached");
                                }
                            }

                            public void a(c cVar, int i, String str) {
                                l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                                if (rewardVideoAdListener2 != null && J.s()) {
                                    e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail and exec onRewardVideoCached");
                                }
                            }
                        });
                    } else {
                        e.b(this.f748b, c2, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            }
            final TTAdNative.RewardVideoAdListener rewardVideoAdListener3 = rewardVideoAdListener;
            final com.bytedance.sdk.openadsdk.core.e.n nVar2 = c2;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            com.bytedance.sdk.openadsdk.core.video.b.a.a().a(c2, (a.C0009a) new a.C0009a() {
                public void a(boolean z) {
                    if (rewardVideoAdListener3 != null && p.i(nVar2)) {
                        e.b(i.this.f748b, nVar2, u.b(adSlot3.getDurationSlotType()), j2);
                        rewardVideoAdListener3.onRewardVideoCached();
                    }
                }
            });
            l.b("RewardVideoLoadManager", "get cache data success");
            l.b("bidding", "reward video get cache data success");
            return;
        }
        a(adSlot, false, rewardVideoAdListener, currentTimeMillis);
    }

    private void a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener, long j) {
        l.b("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + b.a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        o oVar = new o();
        oVar.f1142b = z ? 2 : 1;
        if (m.h().h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f1146f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f749c.a(adSlot, oVar, 7, new n.a() {
            public void a(int i, String str) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(i, str);
                }
            }

            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    l.b("RewardVideoLoadManager", "get material data success isPreload=" + z2);
                    final com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                    try {
                        if (nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
                            com.bytedance.sdk.openadsdk.i.b bVar2 = new com.bytedance.sdk.openadsdk.i.b(true);
                            bVar2.a(adSlot2.getCodeId());
                            bVar2.a(7);
                            bVar2.c(nVar.Y());
                            bVar2.d(nVar.ac());
                            bVar2.b(u.h(nVar));
                            com.bytedance.sdk.openadsdk.d.a.a(nVar.M()).a((com.bytedance.sdk.component.d.n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final l lVar = new l(i.this.f748b, nVar, adSlot2);
                    if (!z2 && rewardVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            e.a(nVar, "rewarded_video", System.currentTimeMillis() - currentTimeMillis);
                        }
                        rewardVideoAdListener2.onRewardVideoAdLoad(lVar);
                    }
                    com.bytedance.sdk.openadsdk.core.video.b.a.a().a(nVar, (a.C0009a) new a.C0009a() {
                        public void a(boolean z) {
                            com.bytedance.sdk.openadsdk.core.e.n nVar;
                            if (!z2 && rewardVideoAdListener2 != null && (nVar = nVar) != null && p.i(nVar)) {
                                e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                rewardVideoAdListener2.onRewardVideoCached();
                            }
                        }
                    });
                    if (z2 && !p.i(nVar) && m.h().n(adSlot2.getCodeId()).f1235d == 1 && !com.bytedance.sdk.component.utils.o.d(i.this.f748b)) {
                        i.this.a(new a(nVar, adSlot2));
                    } else if (p.i(nVar)) {
                        g.a(i.this.f748b).a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final com.bykv.vk.openvk.component.video.api.c.b J = nVar.J();
                        if (J != null) {
                            c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(nVar.aD()).b(), nVar);
                            a2.a("material_meta", nVar);
                            a2.a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                                public void a(c cVar, int i) {
                                    l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                    if (z2) {
                                        g.a(i.this.f748b).a(adSlot2, nVar);
                                        l.c("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                    } else if (rewardVideoAdListener2 != null) {
                                        e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        l.c("RewardVideoLoadManager", "RewardVideoLog: onRewardVideoCached");
                                    }
                                }

                                public void a(c cVar, int i, String str) {
                                    l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                    if (rewardVideoAdListener2 != null && J.s()) {
                                        e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        l.c("RewardVideoLoadManager", "RewardVideoLog:  onVideoPreloadFail and exec onRewardVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        g.a(i.this.f748b).a(nVar, (g.a<Object>) new g.a<Object>() {
                            public void a(boolean z, Object obj) {
                                l.b("RewardVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    lVar.a(g.a(i.this.f748b).a(nVar));
                                }
                                if (!z2) {
                                    e.a(nVar);
                                    if (z && rewardVideoAdListener2 != null) {
                                        e.b(i.this.f748b, nVar, u.b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                    }
                                } else if (z) {
                                    g.a(i.this.f748b).a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(-3, com.bytedance.sdk.openadsdk.core.g.a(-3));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                }
            }
        });
    }

    public void a(String str) {
        g.a(this.f748b).a(str);
    }

    public AdSlot b(String str) {
        return g.a(this.f748b).b(str);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar != null) {
            if (this.f751e.size() >= 1) {
                this.f751e.remove(0);
            }
            this.f751e.add(aVar);
        }
    }

    private void c() {
        if (!this.f750d.get()) {
            this.f750d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f748b.registerReceiver(this.f753g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    private void d() {
        if (this.f750d.get()) {
            this.f750d.set(false);
            try {
                this.f748b.unregisterReceiver(this.f753g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f752f != null) {
            try {
                h.a().removeCallbacks(this.f752f);
            } catch (Exception unused) {
            }
            this.f752f = null;
        }
        d();
    }

    /* compiled from: RewardVideoLoadManager */
    public static class a extends com.bytedance.sdk.component.f.g {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.e.n f780a;

        /* renamed from: b  reason: collision with root package name */
        AdSlot f781b;

        a(com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
            super("Reward Task");
            this.f780a = nVar;
            this.f781b = adSlot;
        }

        public void run() {
            if (this.f780a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    g.a(m.a()).a(this.f780a, (g.a<Object>) new g.a<Object>() {
                        public void a(boolean z, Object obj) {
                            if (z) {
                                l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                                g.a(m.a()).a(a.this.f781b, a.this.f780a);
                                return;
                            }
                            l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                } else if (this.f780a.J() != null) {
                    c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(this.f780a.aD()).b(), this.f780a);
                    a2.a("material_meta", this.f780a);
                    a2.a("ad_slot", this.f781b);
                    com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, new com.bykv.vk.openvk.component.video.api.e.b() {
                        public void a(c cVar, int i) {
                            l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                            g.a(m.a()).a(a.this.f781b, a.this.f780a);
                        }

                        public void a(c cVar, int i, String str) {
                            l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                }
            }
        }
    }
}
