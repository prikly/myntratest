package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;

public class F4<T, C extends P3> {

    /* renamed from: a  reason: collision with root package name */
    private final K4<T> f3998a;

    protected interface a<T> {
        boolean a(T t, C0293c0 c0Var);
    }

    protected F4(K4<T> k4, C c2) {
        this.f3998a = k4;
    }

    /* access modifiers changed from: protected */
    public boolean a(C0293c0 c0Var, a<T> aVar) {
        for (Object a2 : this.f3998a.a(c0Var.o()).a()) {
            if (aVar.a(a2, c0Var)) {
                return true;
            }
        }
        return false;
    }
}
