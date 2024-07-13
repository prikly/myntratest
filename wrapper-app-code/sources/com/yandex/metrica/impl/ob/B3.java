package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0687s;
import java.util.HashMap;

class B3 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, C0687s> f3730a = new HashMap<>();

    B3() {
    }

    public synchronized C0687s a(I3 i3, C0315cm cmVar, C0302c9 c9Var) {
        C0687s sVar;
        sVar = this.f3730a.get(i3.toString());
        if (sVar == null) {
            C0687s.a f2 = c9Var.f();
            sVar = new C0687s(f2.f6766a, f2.f6767b, cmVar);
            this.f3730a.put(i3.toString(), sVar);
        }
        return sVar;
    }
}
