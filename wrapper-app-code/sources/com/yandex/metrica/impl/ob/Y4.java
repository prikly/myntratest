package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;
import java.util.Map;

public class Y4 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final IReporter f5365b;

    public Y4(L3 l3, IReporter iReporter) {
        super(l3);
        this.f5365b = iReporter;
    }

    public boolean a(C0293c0 c0Var) {
        C0670r6 a2 = C0670r6.a(c0Var.o());
        HashMap hashMap = new HashMap();
        hashMap.put("type", a2.f6686a);
        hashMap.put("delivery_method", a2.f6687b);
        this.f5365b.reportEvent("crash_saved", (Map<String, Object>) hashMap);
        return false;
    }
}
