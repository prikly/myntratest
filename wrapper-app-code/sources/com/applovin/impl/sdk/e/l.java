package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Map;

public class l extends k {

    /* renamed from: e  reason: collision with root package name */
    private final c f15456e;

    public l(c cVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super(d.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", nVar);
        this.f15456e = cVar;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f15456e.a());
        map.put("adtoken_prefix", this.f15456e.c());
        return map;
    }

    /* access modifiers changed from: protected */
    public b h() {
        return b.REGULAR_AD_TOKEN;
    }
}
