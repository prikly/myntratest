package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class Q9 implements ProtobufConverter<C0261ai, If.n> {
    public Object fromModel(Object obj) {
        C0261ai aiVar = (C0261ai) obj;
        If.n nVar = new If.n();
        nVar.f4210a = aiVar.f5487a;
        nVar.f4211b = aiVar.f5488b;
        return nVar;
    }

    public Object toModel(Object obj) {
        If.n nVar = (If.n) obj;
        return new C0261ai(nVar.f4210a, nVar.f4211b);
    }
}
