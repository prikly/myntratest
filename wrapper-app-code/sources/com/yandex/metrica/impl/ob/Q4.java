package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.D3;

public class Q4 extends M4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0690s2 f4813b;

    /* renamed from: c  reason: collision with root package name */
    private final Vc f4814c;

    public Q4(F3 f3, C0690s2 s2Var, Vc vc) {
        super(f3);
        this.f4813b = s2Var;
        this.f4814c = vc;
    }

    public boolean a(C0293c0 c0Var, C0571n4 n4Var) {
        D3.a a2 = n4Var.b().a();
        this.f4813b.a(a2.l);
        Boolean bool = a2.f3854e;
        Boolean bool2 = a2.p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f4814c.a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f4814c.a(false);
        }
        return false;
    }
}
