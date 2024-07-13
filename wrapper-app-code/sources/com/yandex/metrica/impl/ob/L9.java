package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class L9 implements ProtobufConverter<C0604oc, If.k> {

    /* renamed from: a  reason: collision with root package name */
    private final K9 f4482a;

    /* renamed from: b  reason: collision with root package name */
    private final M9 f4483b;

    public L9() {
        this(new K9(), new M9());
    }

    /* renamed from: a */
    public If.k fromModel(C0604oc ocVar) {
        If.k kVar = new If.k();
        kVar.f4181a = this.f4482a.fromModel(ocVar.f6395a);
        kVar.f4182b = this.f4483b.fromModel(ocVar.f6396b);
        return kVar;
    }

    L9(K9 k9, M9 m9) {
        this.f4482a = k9;
        this.f4483b = m9;
    }

    /* renamed from: a */
    public C0604oc toModel(If.k kVar) {
        K9 k9 = this.f4482a;
        If.k.a aVar = kVar.f4181a;
        If.k.a aVar2 = new If.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C0554mc a2 = k9.toModel(aVar);
        M9 m9 = this.f4483b;
        If.k.b bVar = kVar.f4182b;
        If.k.b bVar2 = new If.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C0604oc(a2, m9.toModel(bVar));
    }
}
