package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class K9 implements ProtobufConverter<C0554mc, If.k.a> {

    /* renamed from: a  reason: collision with root package name */
    private final G9 f4427a;

    /* renamed from: b  reason: collision with root package name */
    private final I9 f4428b;

    public K9() {
        this(new G9(), new I9());
    }

    /* renamed from: a */
    public If.k.a fromModel(C0554mc mcVar) {
        If.k.a aVar = new If.k.a();
        aVar.f4183a = mcVar.f6210a;
        aVar.f4184b = mcVar.f6211b;
        aVar.f4185c = mcVar.f6212c;
        aVar.f4186d = mcVar.f6213d;
        aVar.f4187e = mcVar.f6214e;
        aVar.f4188f = mcVar.f6215f;
        aVar.f4189g = mcVar.f6216g;
        aVar.j = mcVar.f6217h;
        aVar.f4190h = mcVar.i;
        aVar.i = mcVar.j;
        aVar.p = mcVar.k;
        aVar.q = mcVar.l;
        Xb xb = mcVar.m;
        if (xb != null) {
            aVar.k = this.f4427a.fromModel(xb);
        }
        Xb xb2 = mcVar.n;
        if (xb2 != null) {
            aVar.l = this.f4427a.fromModel(xb2);
        }
        Xb xb3 = mcVar.o;
        if (xb3 != null) {
            aVar.m = this.f4427a.fromModel(xb3);
        }
        Xb xb4 = mcVar.p;
        if (xb4 != null) {
            aVar.n = this.f4427a.fromModel(xb4);
        }
        C0305cc ccVar = mcVar.q;
        if (ccVar != null) {
            aVar.o = this.f4428b.fromModel(ccVar);
        }
        return aVar;
    }

    K9(G9 g9, I9 i9) {
        this.f4427a = g9;
        this.f4428b = i9;
    }

    /* renamed from: a */
    public C0554mc toModel(If.k.a aVar) {
        If.k.a aVar2 = aVar;
        If.k.a.C0047a aVar3 = aVar2.k;
        C0305cc ccVar = null;
        Xb a2 = aVar3 != null ? this.f4427a.toModel(aVar3) : null;
        If.k.a.C0047a aVar4 = aVar2.l;
        Xb a3 = aVar4 != null ? this.f4427a.toModel(aVar4) : null;
        If.k.a.C0047a aVar5 = aVar2.m;
        Xb a4 = aVar5 != null ? this.f4427a.toModel(aVar5) : null;
        If.k.a.C0047a aVar6 = aVar2.n;
        Xb a5 = aVar6 != null ? this.f4427a.toModel(aVar6) : null;
        If.k.a.b bVar = aVar2.o;
        if (bVar != null) {
            ccVar = this.f4428b.toModel(bVar);
        }
        return new C0554mc(aVar2.f4183a, aVar2.f4184b, aVar2.f4185c, aVar2.f4186d, aVar2.f4187e, aVar2.f4188f, aVar2.f4189g, aVar2.j, aVar2.f4190h, aVar2.i, aVar2.p, aVar2.q, a2, a3, a4, a5, ccVar);
    }
}
