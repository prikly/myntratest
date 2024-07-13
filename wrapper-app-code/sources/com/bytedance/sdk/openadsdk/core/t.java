package com.bytedance.sdk.openadsdk.core;

import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: SingleAppData */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static t f1538a;

    /* renamed from: b  reason: collision with root package name */
    private c f1539b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1540c = true;

    /* renamed from: d  reason: collision with root package name */
    private n f1541d;

    /* renamed from: e  reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f1542e;

    /* renamed from: f  reason: collision with root package name */
    private com.com.bytedance.overseas.sdk.a.c f1543f;

    /* renamed from: g  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f1544g;

    /* renamed from: h  reason: collision with root package name */
    private TTAppOpenAd.AppOpenAdInteractionListener f1545h;
    private boolean i = false;

    private t() {
    }

    public static t a() {
        if (f1538a == null) {
            f1538a = new t();
        }
        return f1538a;
    }

    public void a(boolean z) {
        this.f1540c = z;
    }

    public boolean b() {
        return this.f1540c;
    }

    public n c() {
        return this.f1541d;
    }

    public void a(n nVar) {
        this.f1541d = nVar;
    }

    public TTRewardVideoAd.RewardAdInteractionListener d() {
        return this.f1542e;
    }

    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener e() {
        return this.f1544g;
    }

    public TTAppOpenAd.AppOpenAdInteractionListener f() {
        return this.f1545h;
    }

    public void a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f1544g = fullScreenVideoAdInteractionListener;
    }

    public void a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f1542e = rewardAdInteractionListener;
    }

    public void a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f1545h = appOpenAdInteractionListener;
    }

    public com.com.bytedance.overseas.sdk.a.c g() {
        return this.f1543f;
    }

    public void a(com.com.bytedance.overseas.sdk.a.c cVar) {
        this.f1543f = cVar;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void h() {
        this.f1539b = null;
        this.f1541d = null;
        this.f1542e = null;
        this.f1544g = null;
        this.f1545h = null;
        this.f1543f = null;
        this.i = false;
        this.f1540c = true;
    }
}
