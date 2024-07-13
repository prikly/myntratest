package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

public class b extends c {

    /* renamed from: e  reason: collision with root package name */
    private final c f15623e;

    public b(c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, n nVar) {
        super(d.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, nVar);
        this.f15623e = cVar;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f15623e.a());
        map.put("adtoken_prefix", this.f15623e.c());
        return map;
    }
}
