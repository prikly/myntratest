package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

class s extends a {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f15502a;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f15503e;

    /* renamed from: f  reason: collision with root package name */
    private final AppLovinAdLoadListener f15504f;

    /* renamed from: g  reason: collision with root package name */
    private final b f15505g;

    s(JSONObject jSONObject, JSONObject jSONObject2, b bVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskRenderAppLovinAd", nVar);
        this.f15502a = jSONObject;
        this.f15503e = jSONObject2;
        this.f15505g = bVar;
        this.f15504f = appLovinAdLoadListener;
    }

    public void run() {
        v vVar = this.f15420d;
        if (v.a()) {
            this.f15420d.b(this.f15419c, "Rendering ad...");
        }
        a aVar = new a(this.f15502a, this.f15503e, this.f15505g, this.f15418b);
        boolean booleanValue = JsonUtils.getBoolean(this.f15502a, "gs_load_immediately", false).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f15502a, "vs_load_immediately", true).booleanValue();
        d dVar = new d(aVar, this.f15418b, this.f15504f);
        dVar.a(booleanValue2);
        dVar.b(booleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.br)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.f15418b.V().a((a) dVar, aVar2);
    }
}
