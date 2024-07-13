package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class d extends e implements b.a {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f14440c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f14441d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private b f14442e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<a> f14443f = new WeakReference<>((Object) null);

    public interface a {
        void onAdExpired(d dVar);
    }

    private d(d dVar, g gVar) {
        super(dVar.aa(), dVar.Q(), dVar.P(), gVar, dVar.f14445b);
    }

    public d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        super(map, jSONObject, jSONObject2, (g) null, nVar);
    }

    private void a(boolean z) {
        b bVar = this.f14442e;
        if (bVar != null) {
            bVar.a();
            this.f14442e = null;
        }
        if (z) {
            this.f14443f.clear();
        }
    }

    public String A() {
        return BundleUtils.getString("template", "", ab());
    }

    public boolean B() {
        return b("inacc", (Boolean) this.f14445b.a(com.applovin.impl.sdk.c.a.W)).booleanValue();
    }

    public long C() {
        long b2 = b("ad_expiration_ms", -1);
        return b2 >= 0 ? b2 : a("ad_expiration_ms", ((Long) this.f14445b.a(com.applovin.impl.sdk.c.a.D)).longValue());
    }

    public boolean D() {
        return this.f14429a == null;
    }

    public AtomicBoolean E() {
        return this.f14440c;
    }

    public AtomicBoolean F() {
        return this.f14441d;
    }

    public void G() {
        a(true);
    }

    public a a(g gVar) {
        return new d(this, gVar);
    }

    public void a(a aVar) {
        if (!this.f14440c.get() && this.f14442e == null) {
            b bVar = new b(this.f14445b, this);
            this.f14442e = bVar;
            bVar.a((a) this);
            this.f14443f = new WeakReference<>(aVar);
        }
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f14429a.a(maxNativeAdView);
    }

    public void onAdExpired() {
        if (getNativeAd() != null) {
            getNativeAd().setExpired();
        }
        a(false);
        a aVar = (a) this.f14443f.get();
        if (aVar != null) {
            aVar.onAdExpired(this);
            this.f14443f.clear();
        }
    }

    public MaxNativeAdView z() {
        return this.f14429a.c();
    }
}
