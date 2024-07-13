package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class Z9 implements ProtobufConverter<C0730ti, If.s> {
    /* renamed from: a */
    public C0730ti toModel(If.s sVar) {
        return new C0730ti(sVar.f4235a);
    }

    public Object fromModel(Object obj) {
        If.s sVar = new If.s();
        sVar.f4235a = ((C0730ti) obj).f6847a;
        return sVar;
    }
}
