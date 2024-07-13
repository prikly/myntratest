package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0775vf;

public abstract class Ne<T> extends Se {

    /* renamed from: f  reason: collision with root package name */
    private final T f4609f;

    Ne(int i, String str, T t, Kn<String> kn, Ke ke) {
        super(i, str, kn, ke);
        this.f4609f = t;
    }

    public void a(C0258af afVar) {
        C0775vf.a a2;
        if (e() && (a2 = b().a(afVar, afVar.a(d(), c()), this)) != null) {
            a(a2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(C0775vf.a aVar);

    public T f() {
        return this.f4609f;
    }
}
