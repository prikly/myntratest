package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Sh;

public class E9 implements ProtobufConverter<Sh, If.i> {

    /* renamed from: a  reason: collision with root package name */
    private final F1 f3929a;

    public E9() {
        this(new C0535li());
    }

    /* renamed from: a */
    public If.i fromModel(Sh sh) {
        If.i iVar = new If.i();
        iVar.f4174d = sh.f4955d;
        iVar.f4173c = sh.f4954c;
        iVar.f4172b = sh.f4953b;
        iVar.f4171a = sh.f4952a;
        iVar.j = sh.f4956e;
        iVar.k = sh.f4957f;
        iVar.f4175e = sh.n;
        iVar.f4178h = sh.r;
        iVar.i = sh.s;
        iVar.r = sh.o;
        iVar.f4176f = sh.p;
        iVar.f4177g = sh.q;
        iVar.m = sh.f4959h;
        iVar.l = sh.f4958g;
        iVar.n = sh.i;
        iVar.o = sh.j;
        iVar.p = sh.l;
        iVar.u = sh.m;
        iVar.q = sh.k;
        iVar.s = sh.t;
        iVar.t = sh.u;
        iVar.v = sh.v;
        iVar.w = sh.w;
        iVar.x = this.f3929a.a(sh.x);
        return iVar;
    }

    E9(F1 f1) {
        this.f3929a = f1;
    }

    /* renamed from: a */
    public Sh toModel(If.i iVar) {
        return new Sh(new Sh.a().d(iVar.f4171a).p(iVar.i).c(iVar.f4178h).q(iVar.r).w(iVar.f4177g).v(iVar.f4176f).g(iVar.f4175e).f(iVar.f4174d).o(iVar.j).j(iVar.k).n(iVar.f4173c).m(iVar.f4172b).k(iVar.m).l(iVar.l).h(iVar.n).t(iVar.o).s(iVar.p).u(iVar.u).r(iVar.q).a(iVar.s).b(iVar.t).i(iVar.v).e(iVar.w).a(this.f3929a.a(iVar.x)));
    }
}
