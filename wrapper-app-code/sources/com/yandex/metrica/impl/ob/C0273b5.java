package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.b5  reason: case insensitive filesystem */
public class C0273b5 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final M5 f5505b;

    public C0273b5(L3 l3) {
        this(l3, l3.j());
    }

    public boolean a(C0293c0 c0Var) {
        if (TextUtils.isEmpty(c0Var.g())) {
            return false;
        }
        c0Var.a(this.f5505b.a(c0Var.g()));
        return false;
    }

    C0273b5(L3 l3, M5 m5) {
        super(l3);
        this.f5505b = m5;
    }
}
