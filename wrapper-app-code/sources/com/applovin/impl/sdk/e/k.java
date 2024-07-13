package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.i;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

public class k extends h {

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinAdLoadListener f15455e;

    public k(d dVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", nVar);
    }

    public k(d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, n nVar) {
        super(dVar, str, nVar);
        this.f15455e = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    public a a(JSONObject jSONObject) {
        return new p(jSONObject, this.f15446a, h(), this.f15455e, this.f15418b);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        this.f15455e.failedToReceiveAd(i);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return i.g(this.f15418b);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return i.h(this.f15418b);
    }
}
