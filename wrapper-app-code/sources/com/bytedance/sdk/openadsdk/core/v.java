package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.q;
import com.bytedance.sdk.component.utils.w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.common.b;
import com.bytedance.sdk.openadsdk.core.a.c;
import com.bytedance.sdk.openadsdk.core.a.d;
import com.bytedance.sdk.openadsdk.core.a.e;
import com.bytedance.sdk.openadsdk.core.a.f;
import com.bytedance.sdk.openadsdk.core.e.a;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.t;
import com.bytedance.sdk.openadsdk.utils.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTAdNativeImpl */
public class v implements TTAdNative {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f1554a = m.f();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f1555b;

    public v(Context context) {
        this.f1555b = context;
    }

    /* access modifiers changed from: private */
    public Context a() {
        if (this.f1555b == null) {
            this.f1555b = m.a();
        }
        return this.f1555b;
    }

    public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        c cVar = new c(feedAdListener);
        final c cVar2 = cVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        a(new g("loadFeedAd") {
            public void run() {
                if (!v.this.a((b) cVar2)) {
                    try {
                        v.this.c(adSlot2);
                        try {
                            Method a2 = w.a("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, TTAdNative.FeedAdListener.class);
                            if (a2 != null) {
                                a2.invoke((Object) null, new Object[]{v.this.a(), adSlot2, cVar2});
                            }
                        } catch (Throwable th) {
                            l.b("TTAdNativeImpl", "feed component maybe not exist, pls check1", th);
                        }
                    } catch (Exception unused) {
                        l.b("Ad Slot not Valid, please check");
                        feedAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, cVar, adSlot);
    }

    public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        adSlot.setDurationSlotType(adSlot.getNativeAdType());
        e eVar = new e(nativeAdListener);
        final e eVar2 = eVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.NativeAdListener nativeAdListener2 = nativeAdListener;
        a(new g("loadNativeAd") {
            public void run() {
                if (!v.this.a((b) eVar2)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    try {
                        v.this.b(adSlot2);
                        n b2 = v.this.f1554a;
                        AdSlot adSlot = adSlot2;
                        b2.a(adSlot, (o) null, adSlot.getNativeAdType(), new n.a() {
                            public void a(int i, String str) {
                                eVar2.onError(i, str);
                            }

                            public void a(a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                                if (aVar.b() == null || aVar.b().isEmpty()) {
                                    eVar2.onError(-3, g.a(-3));
                                    bVar.a(-3);
                                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                                    return;
                                }
                                List<com.bytedance.sdk.openadsdk.core.e.n> b2 = aVar.b();
                                ArrayList arrayList = new ArrayList(b2.size());
                                for (com.bytedance.sdk.openadsdk.core.e.n next : b2) {
                                    if (next.ao()) {
                                        arrayList.add(new com.bytedance.sdk.openadsdk.core.f.a(v.this.a(), next, adSlot2.getNativeAdType()) {
                                        });
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                                        com.bytedance.sdk.openadsdk.b.e.a(b2.get(0), u.b(adSlot2.getNativeAdType()), System.currentTimeMillis() - currentTimeMillis);
                                    } else {
                                        com.bytedance.sdk.openadsdk.b.e.b(v.this.a(), b2.get(0), u.b(adSlot2.getDurationSlotType()), currentTimeMillis);
                                    }
                                    eVar2.onNativeAdLoad(arrayList);
                                    return;
                                }
                                eVar2.onError(-4, g.a(-4));
                                bVar.a(-4);
                                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                            }
                        });
                    } catch (Exception unused) {
                        l.b("Ad Slot not Valid, please check");
                        nativeAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, eVar, adSlot);
    }

    public void loadRewardVideoAd(final AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final com.bytedance.sdk.openadsdk.core.a.g gVar = new com.bytedance.sdk.openadsdk.core.a.g(rewardVideoAdListener);
        a(new g("loadRewardVideoAd") {
            public void run() {
                if (!v.this.a((b) gVar)) {
                    try {
                        Method a2 = w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, TTAdNative.RewardVideoAdListener.class);
                        if (a2 != null) {
                            a2.invoke((Object) null, new Object[]{v.this.a(), adSlot, gVar});
                        }
                    } catch (Throwable th) {
                        l.b("TTAdNativeImpl", "reward component maybe not exist, pls check1", th);
                    }
                }
            }
        }, gVar, adSlot);
    }

    public void loadFullScreenVideoAd(final AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final d dVar = new d(fullScreenVideoAdListener);
        a(new g("loadFullScreenVideoAd") {
            public void run() {
                if (!v.this.a((b) dVar)) {
                    try {
                        Method a2 = w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, TTAdNative.FullScreenVideoAdListener.class);
                        if (a2 != null) {
                            a2.invoke((Object) null, new Object[]{v.this.a(), adSlot, dVar});
                        }
                    } catch (Throwable th) {
                        l.b("TTAdNativeImpl", "reward component maybe not exist, pls check2", th);
                    }
                }
            }
        }, dVar, adSlot);
    }

    public void loadBannerExpressAd(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        final f fVar = new f(nativeExpressAdListener);
        a(new g("loadBannerExpressAd") {
            public void run() {
                if (!v.this.a((b) fVar)) {
                    adSlot.setNativeAdType(1);
                    adSlot.setDurationSlotType(1);
                    com.bytedance.sdk.openadsdk.core.nativeexpress.d.a(v.this.a()).a(adSlot, 1, fVar, 5000);
                }
            }
        }, fVar, adSlot);
    }

    public void loadAppOpenAd(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        com.bytedance.sdk.openadsdk.core.a.b bVar = new com.bytedance.sdk.openadsdk.core.a.b(appOpenAdListener);
        final com.bytedance.sdk.openadsdk.core.a.b bVar2 = bVar;
        final AdSlot adSlot2 = adSlot;
        final int i2 = i;
        a(new g("loadSplashAd b") {
            public void run() {
                Method a2;
                try {
                    if (!v.this.a((b) bVar2) && (a2 = w.a("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, TTAdNative.AppOpenAdListener.class, Integer.TYPE)) != null) {
                        a2.invoke((Object) null, new Object[]{v.this.a(), adSlot2, bVar2, Integer.valueOf(i2)});
                    }
                } catch (Throwable th) {
                    l.c("TTAdNativeImpl", "open component maybe not exist, please check", th);
                }
            }
        }, bVar, adSlot);
    }

    private void a(AdSlot adSlot) {
        boolean z = true;
        q.a(adSlot.getImgAcceptedWidth() > 0, "Image material size must be set");
        if (adSlot.getImgAcceptedHeight() <= 0) {
            z = false;
        }
        q.a(z, "Image material size must be set");
    }

    /* access modifiers changed from: private */
    public void b(AdSlot adSlot) {
        a(adSlot);
        q.a(adSlot.getNativeAdType() > 0, "Must set the type of requesting native ads, currently supports TYPE_BANNER and TYPE_INTERACTION_AD");
    }

    /* access modifiers changed from: private */
    public void c(AdSlot adSlot) {
        a(adSlot);
        q.a(adSlot.getNativeAdType() == 0, "Request the type of non-native ad, please do not call the setNativeAdType() method");
    }

    /* access modifiers changed from: private */
    public boolean a(b bVar) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    private void a(final g gVar, final b bVar, final AdSlot adSlot) {
        AnonymousClass7 r0 = new Runnable() {
            public void run() {
                int e2 = k.e();
                if (e2 == 0 || e2 == 2) {
                    l.e("TTAdNativeImpl", "please exec TTAdSdk.init before load ad");
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.b.e.a(adSlot);
                k.c().post(gVar);
            }
        };
        if (t.a()) {
            com.bytedance.sdk.component.f.e.a().execute(r0);
        } else {
            r0.run();
        }
    }
}
