package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0433hf;

public class M6 implements ProtobufConverter<C0862z6, C0433hf> {

    /* renamed from: a  reason: collision with root package name */
    private final S6 f4539a;

    public M6() {
        this(new S6());
    }

    /* renamed from: a */
    public C0433hf fromModel(C0862z6 z6Var) {
        C0433hf a2 = this.f4539a.fromModel(z6Var.f7215a);
        a2.f5927g = 1;
        C0433hf.a aVar = new C0433hf.a();
        a2.f5928h = aVar;
        aVar.f5929a = z6Var.f7216b;
        return a2;
    }

    public Object toModel(Object obj) {
        C0433hf hfVar = (C0433hf) obj;
        throw new UnsupportedOperationException();
    }

    M6(S6 s6) {
        this.f4539a = s6;
    }
}
