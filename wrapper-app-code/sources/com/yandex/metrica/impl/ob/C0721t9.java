package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.t9  reason: case insensitive filesystem */
public class C0721t9 implements ProtobufConverter<C0442i, If.b> {
    /* renamed from: a */
    public C0442i toModel(If.b bVar) {
        return new C0442i(bVar.f4151a, bVar.f4152b);
    }

    public Object fromModel(Object obj) {
        C0442i iVar = (C0442i) obj;
        If.b bVar = new If.b();
        bVar.f4151a = iVar.f5952a;
        bVar.f4152b = iVar.f5953b;
        return bVar;
    }
}
