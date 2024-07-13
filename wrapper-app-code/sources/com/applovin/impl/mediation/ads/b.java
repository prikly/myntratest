package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.a.e;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.y;
import com.applovin.impl.sdk.z;

public class b implements z.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f14540a;

    /* renamed from: b  reason: collision with root package name */
    private final d f14541b;

    /* renamed from: c  reason: collision with root package name */
    private final z f14542c;

    /* renamed from: d  reason: collision with root package name */
    private final y f14543d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0141a f14544e;

    public b(d dVar, ViewGroup viewGroup, a.C0141a aVar, n nVar) {
        this.f14540a = nVar;
        this.f14541b = dVar;
        this.f14544e = aVar;
        this.f14543d = new y(viewGroup, nVar);
        z zVar = new z(viewGroup, nVar, this);
        this.f14542c = zVar;
        zVar.a((e) this.f14541b);
        nVar.D();
        if (v.a()) {
            v D = nVar.D();
            D.b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    private void a(long j) {
        if (this.f14541b.F().compareAndSet(false, true)) {
            this.f14540a.D();
            if (v.a()) {
                this.f14540a.D().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f14540a.H().processViewabilityAdImpressionPostback(this.f14541b, j, this.f14544e);
        }
    }

    public void a() {
        this.f14542c.a();
    }

    public void b() {
        this.f14540a.D();
        if (v.a()) {
            this.f14540a.D().b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f14541b.E().compareAndSet(false, true)) {
            this.f14540a.D();
            if (v.a()) {
                this.f14540a.D().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f14541b.getNativeAd().isExpired()) {
                v.i("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f14541b.G();
            }
            this.f14540a.H().processRawAdImpressionPostback(this.f14541b, this.f14544e);
        }
    }

    public d c() {
        return this.f14541b;
    }

    public void onLogVisibilityImpression() {
        a(this.f14543d.a(this.f14541b));
    }
}
