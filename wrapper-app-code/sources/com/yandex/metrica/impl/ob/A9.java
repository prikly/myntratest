package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class A9 implements ProtobufConverter<C0674ra, If.f> {

    /* renamed from: a  reason: collision with root package name */
    private final C0865z9 f3694a;

    public A9() {
        this(new C0865z9());
    }

    /* renamed from: a */
    public If.f fromModel(C0674ra raVar) {
        If.f fVar = new If.f();
        fVar.f4162a = a(raVar.f6692a);
        fVar.f4163b = a(raVar.f6693b);
        fVar.f4164c = a(raVar.f6694c);
        return fVar;
    }

    public Object toModel(Object obj) {
        If.f fVar = (If.f) obj;
        return new C0674ra(a(fVar.f4162a), a(fVar.f4163b), a(fVar.f4164c));
    }

    A9(C0865z9 z9Var) {
        this.f3694a = z9Var;
    }

    public C0674ra a(If.f fVar) {
        return new C0674ra(a(fVar.f4162a), a(fVar.f4163b), a(fVar.f4164c));
    }

    private If.e a(C0651qa qaVar) {
        if (qaVar == null) {
            return null;
        }
        this.f3694a.getClass();
        If.e eVar = new If.e();
        eVar.f4160a = qaVar.f6553a;
        eVar.f4161b = qaVar.f6554b;
        return eVar;
    }

    private C0651qa a(If.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f3694a.toModel(eVar);
    }
}
