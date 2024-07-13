package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.c5  reason: case insensitive filesystem */
public class C0298c5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0276b8 f5592b;

    public C0298c5(L3 l3) {
        super(l3);
        this.f5592b = l3.x();
    }

    public boolean a(C0293c0 c0Var) {
        L3 a2 = a();
        a2.e().toString();
        if (!this.f5592b.k() || !a2.B()) {
            return false;
        }
        a2.r().d(C0293c0.a(c0Var, a2));
        return false;
    }
}
