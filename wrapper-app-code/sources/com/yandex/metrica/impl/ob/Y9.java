package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public final class Y9 implements ProtobufConverter<C0706si, If.r> {
    /* renamed from: a */
    public C0706si toModel(If.r rVar) {
        return new C0706si(rVar.f4234a);
    }

    public Object fromModel(Object obj) {
        If.r rVar = new If.r();
        rVar.f4234a = ((C0706si) obj).a();
        return rVar;
    }
}
