package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

public class S5 extends R5 {
    S5(L3 l3, C0249a6 a6Var) {
        this(l3, a6Var, new C0349e6(l3.f(), "background"), C0609oh.a(), new SystemTimeProvider());
    }

    S5(L3 l3, C0249a6 a6Var, C0349e6 e6Var, M0 m0, SystemTimeProvider systemTimeProvider) {
        super(l3, a6Var, e6Var, Z5.a(C0374f6.BACKGROUND).a(3600).a(), m0, systemTimeProvider);
    }
}
