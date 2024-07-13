package com.yandex.metrica.impl.ob;

public class R4 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0276b8 f4849b;

    /* renamed from: c  reason: collision with root package name */
    private final C0390fm f4850c;

    public R4(L3 l3) {
        this(l3, l3.x(), C0390fm.c());
    }

    public boolean a(C0293c0 c0Var) {
        L3 a2 = a();
        if (this.f4849b.k() || this.f4849b.l()) {
            return false;
        }
        if (a2.m().P()) {
            this.f4850c.b();
        }
        a().j().a();
        return false;
    }

    R4(L3 l3, C0276b8 b8Var, C0390fm fmVar) {
        super(l3);
        this.f4849b = b8Var;
        this.f4850c = fmVar;
    }
}
