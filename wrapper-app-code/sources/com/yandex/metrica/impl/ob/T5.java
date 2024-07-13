package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

public class T5 extends R5 {
    T5(L3 l3, C0249a6 a6Var) {
        this(l3, a6Var, new C0349e6(l3.f(), "foreground"), C0609oh.a(), new SystemTimeProvider());
    }

    T5(L3 l3, C0249a6 a6Var, C0349e6 e6Var, M0 m0, SystemTimeProvider systemTimeProvider) {
        super(l3, a6Var, e6Var, Z5.a(C0374f6.FOREGROUND).a(), m0, systemTimeProvider);
    }
}
