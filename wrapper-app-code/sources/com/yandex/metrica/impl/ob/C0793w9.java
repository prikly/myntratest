package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.w9  reason: case insensitive filesystem */
public class C0793w9 implements ProtobufConverter<Ph, If.c> {
    /* renamed from: a */
    public If.c fromModel(Ph ph) {
        If.c cVar = new If.c();
        cVar.f4153a = ph.f4783a;
        cVar.f4154b = ph.f4784b;
        cVar.f4155c = ph.f4785c;
        cVar.f4156d = ph.f4786d;
        return cVar;
    }

    /* renamed from: a */
    public Ph toModel(If.c cVar) {
        return new Ph(cVar.f4153a, cVar.f4154b, cVar.f4155c, cVar.f4156d);
    }
}
