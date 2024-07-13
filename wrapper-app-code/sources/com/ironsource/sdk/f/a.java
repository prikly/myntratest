package com.ironsource.sdk.f;

import com.ironsource.mediationsdk.model.c;
import com.ironsource.mediationsdk.model.d;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.utils.b;
import com.ironsource.mediationsdk.utils.j;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.g.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private d f9487a;

    /* renamed from: b  reason: collision with root package name */
    private p f9488b;

    /* renamed from: c  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.p f9489c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9490d;

    /* renamed from: e  reason: collision with root package name */
    private u f9491e;

    /* renamed from: f  reason: collision with root package name */
    private b f9492f;

    /* renamed from: g  reason: collision with root package name */
    private c f9493g;

    /* renamed from: h  reason: collision with root package name */
    private j f9494h;
    private com.ironsource.mediationsdk.model.b i;

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    public static class C0089a {

        /* renamed from: a  reason: collision with root package name */
        public String f9495a;

        /* renamed from: b  reason: collision with root package name */
        public String f9496b;

        /* renamed from: c  reason: collision with root package name */
        public String f9497c;

        public static C0089a a(d.e eVar) {
            String str;
            C0089a aVar = new C0089a();
            if (eVar == d.e.RewardedVideo) {
                aVar.f9495a = "showRewardedVideo";
                aVar.f9496b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == d.e.Interstitial) {
                aVar.f9495a = "showInterstitial";
                aVar.f9496b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == d.e.OfferWall) {
                    aVar.f9495a = "showOfferWall";
                    aVar.f9496b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f9497c = str;
            return aVar;
        }
    }

    public a() {
        this.f9487a = new com.ironsource.mediationsdk.model.d();
    }

    public a(com.ironsource.mediationsdk.model.d dVar, p pVar, com.ironsource.mediationsdk.utils.p pVar2, boolean z, u uVar, b bVar, c cVar, j jVar, com.ironsource.mediationsdk.model.b bVar2) {
        this.f9487a = dVar;
        this.f9488b = pVar;
        this.f9489c = pVar2;
        this.f9490d = z;
        this.f9491e = uVar;
        this.f9492f = bVar;
        this.f9493g = cVar;
        this.f9494h = jVar;
        this.i = bVar2;
    }

    public com.ironsource.mediationsdk.model.d a() {
        return this.f9487a;
    }

    public p b() {
        return this.f9488b;
    }

    public com.ironsource.mediationsdk.utils.p c() {
        return this.f9489c;
    }

    public boolean d() {
        return this.f9490d;
    }

    public u e() {
        return this.f9491e;
    }

    public b f() {
        return this.f9492f;
    }

    public c g() {
        return this.f9493g;
    }

    public j h() {
        return this.f9494h;
    }

    public com.ironsource.mediationsdk.model.b i() {
        return this.i;
    }
}
