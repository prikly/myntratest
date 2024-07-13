package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.n5  reason: case insensitive filesystem */
public class C0572n5 extends X4 {
    public C0572n5(L3 l3) {
        super(l3);
    }

    public boolean a(C0293c0 c0Var) {
        String m = c0Var.m();
        if (TextUtils.isEmpty(m)) {
            return false;
        }
        a().b(m);
        return false;
    }
}
