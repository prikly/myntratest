package com.yandex.metrica.impl.ob;

import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.impl.ob.C0475j8;
import java.util.HashMap;
import java.util.List;

public class P7 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, List<String>> f4751a;

    public P7() {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        this.f4751a = hashMap;
        hashMap.put("reports", C0475j8.d.f6049a);
        hashMap.put(Constants.SESSIONS, C0475j8.e.f6051a);
        hashMap.put("preferences", C0475j8.c.f6048a);
        hashMap.put("binary_data", C0475j8.b.f6047a);
    }

    public HashMap<String, List<String>> a() {
        return this.f4751a;
    }
}
