package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class W9 implements ProtobufConverter<C0336di, If.q> {
    /* renamed from: a */
    public If.q fromModel(C0336di diVar) {
        If.q qVar = new If.q();
        qVar.f4226a = diVar.f5683a;
        qVar.f4227b = diVar.f5684b;
        qVar.f4229d = C0267b.a(diVar.f5685c);
        qVar.f4228c = C0267b.a(diVar.f5686d);
        qVar.f4230e = diVar.f5687e;
        qVar.f4231f = diVar.f5688f;
        qVar.f4232g = diVar.f5689g;
        qVar.f4233h = diVar.f5690h;
        qVar.i = diVar.i;
        qVar.j = diVar.j;
        return qVar;
    }

    /* renamed from: a */
    public C0336di toModel(If.q qVar) {
        If.q qVar2 = qVar;
        return new C0336di(qVar2.f4226a, qVar2.f4227b, C0267b.a(qVar2.f4229d), C0267b.a(qVar2.f4228c), qVar2.f4230e, qVar2.f4231f, qVar2.f4232g, qVar2.f4233h, qVar2.i, qVar2.j);
    }
}
