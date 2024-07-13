package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.a5  reason: case insensitive filesystem */
public class C0248a5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0276b8 f5464b;

    public C0248a5(L3 l3) {
        this(l3, l3.x());
    }

    public boolean a(C0293c0 c0Var) {
        L3 a2 = a();
        if (this.f5464b.k()) {
            return false;
        }
        if (!this.f5464b.l()) {
            a2.r().a(C0293c0.b(c0Var));
        }
        this.f5464b.a(true);
        return false;
    }

    C0248a5(L3 l3, C0276b8 b8Var) {
        super(l3);
        this.f5464b = b8Var;
    }
}
