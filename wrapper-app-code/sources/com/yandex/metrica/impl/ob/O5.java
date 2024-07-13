package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

class O5 implements ProtobufConverter<N5, Af> {
    O5() {
    }

    /* renamed from: a */
    public Af fromModel(N5 n5) {
        Af af = new Af();
        af.f3704d = new int[n5.b().size()];
        int i = 0;
        for (Integer intValue : n5.b()) {
            af.f3704d[i] = intValue.intValue();
            i++;
        }
        af.f3703c = n5.c();
        af.f3702b = n5.d();
        af.f3701a = n5.e();
        return af;
    }

    /* renamed from: a */
    public N5 toModel(Af af) {
        return new N5(af.f3701a, af.f3702b, af.f3703c, A2.a(af.f3704d));
    }
}
