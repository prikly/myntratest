package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class I9 implements ProtobufConverter<C0305cc, If.k.a.b> {

    /* renamed from: a  reason: collision with root package name */
    private final H9 f4132a;

    public I9() {
        this(new H9());
    }

    /* renamed from: a */
    public If.k.a.b fromModel(C0305cc ccVar) {
        If.k.a.b bVar = new If.k.a.b();
        Qc qc = ccVar.f5614a;
        bVar.f4196a = qc.f4823a;
        bVar.f4197b = qc.f4824b;
        C0255ac acVar = ccVar.f5615b;
        if (acVar != null) {
            bVar.f4198c = this.f4132a.fromModel(acVar);
        }
        return bVar;
    }

    I9(H9 h9) {
        this.f4132a = h9;
    }

    /* renamed from: a */
    public C0305cc toModel(If.k.a.b bVar) {
        If.k.a.b.C0049a aVar = bVar.f4198c;
        return new C0305cc(new Qc(bVar.f4196a, bVar.f4197b), aVar != null ? this.f4132a.toModel(aVar) : null);
    }
}
