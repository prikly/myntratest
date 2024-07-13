package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class J9 implements ProtobufConverter<Zh, If.j> {
    /* renamed from: a */
    public Zh toModel(If.j jVar) {
        return new Zh(jVar.f4179a);
    }

    public Object fromModel(Object obj) {
        If.j jVar = new If.j();
        jVar.f4179a = ((Zh) obj).f5425a;
        return jVar;
    }
}
