package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public final class B9 implements ProtobufConverter<C0784w0, If.g> {
    /* renamed from: a */
    public C0784w0 toModel(If.g gVar) {
        return new C0784w0(gVar.f4165a);
    }

    public Object fromModel(Object obj) {
        If.g gVar = new If.g();
        gVar.f4165a = ((C0784w0) obj).a();
        return gVar;
    }
}
