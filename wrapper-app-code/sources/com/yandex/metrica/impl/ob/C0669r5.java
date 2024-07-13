package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.r5  reason: case insensitive filesystem */
public class C0669r5 extends X4 {
    public C0669r5(L3 l3) {
        super(l3);
    }

    public boolean a(C0293c0 c0Var) {
        String p = a().p();
        String m = c0Var.m();
        a().b(m);
        if (TextUtils.equals(p, m)) {
            return false;
        }
        a().a(J.s());
        return false;
    }
}
