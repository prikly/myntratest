package com.yandex.metrica.impl.ob;

import android.os.Bundle;

public class O4 extends M4 {
    public O4(F3 f3) {
        super(f3);
    }

    public boolean a(C0293c0 c0Var, C0571n4 n4Var) {
        Bundle l = c0Var.l();
        a().a(l != null ? (V0) l.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null);
        return false;
    }
}
