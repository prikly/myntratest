package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C0378fa;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e5  reason: case insensitive filesystem */
public class C0348e5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final Cd f5709b;

    /* renamed from: c  reason: collision with root package name */
    private final ProtobufStateStorage<C0725td> f5710c;

    /* renamed from: d  reason: collision with root package name */
    private final A f5711d;

    /* renamed from: e  reason: collision with root package name */
    private final C0759v f5712e;

    /* renamed from: f  reason: collision with root package name */
    private final C0807x f5713f;

    public C0348e5(L3 l3, Cd cd) {
        this(l3, cd, C0378fa.b.a(C0725td.class).a(l3.g()), new A(l3.g()), new C0759v(), new C0807x(l3.g()));
    }

    public boolean a(C0293c0 c0Var) {
        C0725td tdVar;
        L3 a2 = a();
        a2.e().toString();
        if (!a2.x().k() || !a2.A()) {
            return false;
        }
        C0725td tdVar2 = (C0725td) this.f5710c.read();
        List<Bd> list = tdVar2.f6832a;
        C0855z zVar = tdVar2.f6833b;
        C0855z a3 = this.f5711d.a();
        List<String> list2 = tdVar2.f6834c;
        List<String> a4 = this.f5713f.a();
        List<Bd> a5 = this.f5709b.a(a().g(), list);
        if (a5 != null || !A2.a((Object) zVar, (Object) a3) || !C0267b.a((Collection<?>) list2, (Collection<?>) a4)) {
            if (a5 != null) {
                list = a5;
            }
            tdVar = new C0725td(list, a3, a4);
        } else {
            tdVar = null;
        }
        if (tdVar != null) {
            a2.r().e(C0293c0.a(c0Var, tdVar.f6832a, tdVar.f6833b, this.f5712e, tdVar.f6834c));
            this.f5710c.save(tdVar);
            return false;
        } else if (!a2.E()) {
            return false;
        } else {
            a2.r().e(C0293c0.a(c0Var, tdVar2.f6832a, tdVar2.f6833b, this.f5712e, tdVar2.f6834c));
            return false;
        }
    }

    C0348e5(L3 l3, Cd cd, ProtobufStateStorage<C0725td> protobufStateStorage, A a2, C0759v vVar, C0807x xVar) {
        super(l3);
        this.f5709b = cd;
        this.f5710c = protobufStateStorage;
        this.f5711d = a2;
        this.f5712e = vVar;
        this.f5713f = xVar;
    }
}
