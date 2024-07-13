package com.bytedance.sdk.openadsdk.component.b;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bykv.vk.openvk.component.video.api.e.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.b;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.g;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FeedAdManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f531a;

    /* renamed from: b  reason: collision with root package name */
    private final n f532b = m.f();

    public static a a() {
        if (f531a == null) {
            synchronized (a.class) {
                if (f531a == null) {
                    f531a = new a();
                }
            }
        }
        return f531a;
    }

    private a() {
    }

    public void a(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        final Context context2 = context;
        final AdSlot adSlot2 = adSlot;
        this.f532b.a(adSlot, new o(), 5, new n.a() {
            public void a(int i, String str) {
                feedAdListener2.onError(i, str);
            }

            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, b bVar) {
                if (aVar.b() == null || aVar.b().isEmpty()) {
                    feedAdListener2.onError(-3, g.a(-3));
                    bVar.a(-3);
                    b.a(bVar);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.core.e.n> b2 = aVar.b();
                ArrayList arrayList = new ArrayList(b2.size());
                for (com.bytedance.sdk.openadsdk.core.e.n next : b2) {
                    if (com.bytedance.sdk.openadsdk.core.e.n.c(next)) {
                        arrayList.add(new b(context2, next, 5, adSlot2));
                    } else if (next.ao()) {
                        arrayList.add(new b(context2, next, 5, adSlot2));
                    }
                    if (!(!com.bytedance.sdk.openadsdk.core.e.n.c(next) || next.J() == null || next.J().i() == null)) {
                        if (m.h().b(String.valueOf(u.f(next))) && m.h().G()) {
                            if (next.J() != null) {
                                next.J().f(1);
                            }
                            if (next.aF() != null) {
                                next.aF().f(1);
                            }
                            c a2 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(next.aD()).a(), next);
                            a2.a("material_meta", next);
                            a2.a("ad_slot", adSlot2);
                            com.bytedance.sdk.openadsdk.core.video.d.a.a(a2, (a.C0222a) null);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AdSlot adSlot = adSlot2;
                    if (adSlot == null) {
                        e.b(context2, b2.get(0), u.b(5), currentTimeMillis);
                    } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        e.a(b2.get(0), "embeded_ad", System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        e.b(context2, b2.get(0), u.b(adSlot2.getDurationSlotType()), currentTimeMillis);
                    }
                    feedAdListener2.onFeedAdLoad(arrayList);
                    if (bVar.e() != null && !bVar.e().isEmpty()) {
                        b.a(bVar);
                        return;
                    }
                    return;
                }
                feedAdListener2.onError(-4, g.a(-4));
                bVar.a(-4);
                b.a(bVar);
            }
        });
    }
}
