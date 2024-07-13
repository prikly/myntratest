package com.yandex.metrica.impl.ob;

import com.appodeal.ads.AppodealNetworks;
import com.yandex.metrica.impl.ob.C0723tb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ib {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, C0723tb.a> f4135a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("google", C0723tb.a.GOOGLE);
        hashMap.put("huawei", C0723tb.a.HMS);
        hashMap.put(AppodealNetworks.YANDEX, C0723tb.a.YANDEX);
        f4135a = Collections.unmodifiableMap(hashMap);
    }
}
