package com.yandex.metrica.impl.ob;

public class Dm {

    /* renamed from: a  reason: collision with root package name */
    private final Zl<Em, Cm> f3890a;

    /* renamed from: b  reason: collision with root package name */
    private final Zl<C0244a1, Cm> f3891b;

    public Dm() {
        this(new Am(), new Fm(), new C0830xm());
    }

    public Cm a(Em em) {
        return this.f3890a.a(em);
    }

    public Dm(Cm cm, Cm cm2, Cm cm3) {
        Zl<Em, Cm> zl = new Zl<>(cm);
        this.f3890a = zl;
        zl.a(Em.NONE, cm);
        zl.a(Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, cm2);
        zl.a(Em.AES_VALUE_ENCRYPTION, cm3);
        Zl<C0244a1, Cm> zl2 = new Zl<>(cm);
        this.f3891b = zl2;
        zl2.a(C0244a1.EVENT_TYPE_IDENTITY, cm3);
    }

    public Cm a(C0293c0 c0Var) {
        return this.f3891b.a(C0244a1.a(c0Var.o()));
    }
}
