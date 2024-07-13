package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class j extends k {

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f15454e;

    public j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super(d.a(a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", nVar);
        this.f15454e = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    /* access modifiers changed from: protected */
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(1);
        List<String> list = this.f15454e;
        map.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return map;
    }

    /* access modifiers changed from: protected */
    public b h() {
        return b.APPLOVIN_MULTIZONE;
    }
}
