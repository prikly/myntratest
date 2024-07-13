package com.yandex.metrica.impl.ob;

import com.yandex.metrica.b;

/* renamed from: com.yandex.metrica.impl.ob.e2  reason: case insensitive filesystem */
public class C0345e2 {

    /* renamed from: a  reason: collision with root package name */
    private C0295c2 f5699a = new C0295c2(0, 0, 0, 0.0f, (b) null);

    public synchronized void a(C0295c2 c2Var) {
        if (c2Var != null) {
            this.f5699a = c2Var;
        }
    }

    public synchronized C0295c2 a() {
        return this.f5699a;
    }
}
