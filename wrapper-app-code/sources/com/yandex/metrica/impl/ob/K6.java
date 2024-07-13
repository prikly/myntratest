package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

public class K6 implements ProtobufConverter<C0814x6, C0358ef> {

    /* renamed from: a  reason: collision with root package name */
    private final J6 f4417a;

    /* renamed from: b  reason: collision with root package name */
    private final L6 f4418b;

    public K6() {
        this(new J6(new V6()), new L6());
    }

    /* renamed from: a */
    public C0358ef fromModel(C0814x6 x6Var) {
        C0358ef efVar = new C0358ef();
        efVar.f5748a = this.f4417a.fromModel(x6Var.f7083a);
        String str = x6Var.f7084b;
        if (str != null) {
            efVar.f5749b = str;
        }
        efVar.f5750c = this.f4418b.a(x6Var.f7085c);
        return efVar;
    }

    public Object toModel(Object obj) {
        C0358ef efVar = (C0358ef) obj;
        throw new UnsupportedOperationException();
    }

    K6(J6 j6, L6 l6) {
        this.f4417a = j6;
        this.f4418b = l6;
    }
}
