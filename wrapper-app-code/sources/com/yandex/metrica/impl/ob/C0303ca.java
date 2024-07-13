package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.ca  reason: case insensitive filesystem */
public class C0303ca implements ProtobufConverter<C0439hl, If.v> {

    /* renamed from: a  reason: collision with root package name */
    private final C0278ba f5610a;

    public C0303ca() {
        this(new C0278ba());
    }

    /* renamed from: a */
    public If.v fromModel(C0439hl hlVar) {
        If.v vVar = new If.v();
        vVar.f4240a = hlVar.f5943a;
        vVar.f4241b = hlVar.f5944b;
        vVar.f4242c = hlVar.f5945c;
        vVar.f4243d = hlVar.f5946d;
        vVar.i = hlVar.f5947e;
        vVar.j = hlVar.f5948f;
        vVar.k = hlVar.f5949g;
        vVar.l = hlVar.f5950h;
        vVar.n = hlVar.i;
        vVar.o = hlVar.j;
        vVar.f4244e = hlVar.k;
        vVar.f4245f = hlVar.l;
        vVar.f4246g = hlVar.m;
        vVar.f4247h = hlVar.n;
        vVar.p = hlVar.o;
        vVar.m = this.f5610a.fromModel(hlVar.p);
        return vVar;
    }

    C0303ca(C0278ba baVar) {
        this.f5610a = baVar;
    }

    /* renamed from: a */
    public C0439hl toModel(If.v vVar) {
        If.v vVar2 = vVar;
        boolean z = vVar2.f4240a;
        return new C0439hl(z, vVar2.f4241b, vVar2.f4242c, vVar2.f4243d, vVar2.i, vVar2.j, vVar2.k, vVar2.l, vVar2.n, vVar2.o, vVar2.f4244e, vVar2.f4245f, vVar2.f4246g, vVar2.f4247h, vVar2.p, this.f5610a.toModel(vVar2.m));
    }
}
