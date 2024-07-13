package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

public class c extends h {

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f15624e;

    public c(d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, n nVar) {
        super(dVar, str, nVar);
        this.f15624e = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    public a a(JSONObject jSONObject) {
        return new d(jSONObject, this.f15624e, this.f15418b);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        super.a(i);
        this.f15624e.onNativeAdLoadFailed(i);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return i.i(this.f15418b);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return i.j(this.f15418b);
    }
}
