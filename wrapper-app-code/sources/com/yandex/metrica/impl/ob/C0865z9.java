package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.z9  reason: case insensitive filesystem */
public class C0865z9 implements ProtobufConverter<C0651qa, If.e> {
    /* renamed from: a */
    public C0651qa toModel(If.e eVar) {
        return new C0651qa(eVar.f4160a, eVar.f4161b);
    }

    public Object fromModel(Object obj) {
        C0651qa qaVar = (C0651qa) obj;
        If.e eVar = new If.e();
        eVar.f4160a = qaVar.f6553a;
        eVar.f4161b = qaVar.f6554b;
        return eVar;
    }
}
