package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class U9 implements ProtobufConverter<C0311ci, If.p> {
    /* renamed from: a */
    public If.p fromModel(C0311ci ciVar) {
        If.p pVar = new If.p();
        pVar.f4222a = ciVar.f5638a;
        pVar.f4223b = ciVar.f5639b;
        pVar.f4224c = ciVar.f5640c;
        pVar.f4225d = ciVar.f5641d;
        return pVar;
    }

    /* renamed from: a */
    public C0311ci toModel(If.p pVar) {
        return new C0311ci(pVar.f4222a, pVar.f4223b, pVar.f4224c, pVar.f4225d);
    }
}
