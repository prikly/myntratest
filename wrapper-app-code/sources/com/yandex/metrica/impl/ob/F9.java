package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class F9 implements ProtobufConverter<Wb, If.k.a.C0047a.C0048a> {
    public Object fromModel(Object obj) {
        Wb wb = (Wb) obj;
        If.k.a.C0047a.C0048a aVar = new If.k.a.C0047a.C0048a();
        aVar.f4194a = wb.f5260a;
        aVar.f4195b = wb.f5261b;
        return aVar;
    }

    public Object toModel(Object obj) {
        If.k.a.C0047a.C0048a aVar = (If.k.a.C0047a.C0048a) obj;
        return new Wb(aVar.f4194a, aVar.f4195b);
    }
}
