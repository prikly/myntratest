package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

public class J6 implements ProtobufConverter<C0790w6, C0333df> {

    /* renamed from: a  reason: collision with root package name */
    private V6 f4313a;

    public J6(V6 v6) {
        this.f4313a = v6;
    }

    /* renamed from: a */
    public C0333df fromModel(C0790w6 w6Var) {
        C0333df dfVar = new C0333df();
        E6 e6 = w6Var.f7020a;
        if (e6 != null) {
            dfVar.f5661a = this.f4313a.fromModel(e6);
        }
        dfVar.f5662b = new C0507kf[w6Var.f7021b.size()];
        int i = 0;
        for (E6 a2 : w6Var.f7021b) {
            dfVar.f5662b[i] = this.f4313a.fromModel(a2);
            i++;
        }
        String str = w6Var.f7022c;
        if (str != null) {
            dfVar.f5663c = str;
        }
        return dfVar;
    }

    public Object toModel(Object obj) {
        C0333df dfVar = (C0333df) obj;
        throw new UnsupportedOperationException();
    }
}
