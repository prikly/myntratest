package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.t0  reason: case insensitive filesystem */
public abstract class C0712t0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Zl<C0736u0, Integer> f6804a;

    public C0712t0() {
        Zl<C0736u0, Integer> zl = new Zl<>(0);
        zl.a(C0736u0.UNDEFINED, 0);
        zl.a(C0736u0.APP, 1);
        zl.a(C0736u0.SATELLITE, 2);
        zl.a(C0736u0.RETAIL, 3);
        this.f6804a = zl;
    }

    /* access modifiers changed from: protected */
    public final Zl<C0736u0, Integer> a() {
        return this.f6804a;
    }

    public abstract boolean a(T t, T t2);
}
