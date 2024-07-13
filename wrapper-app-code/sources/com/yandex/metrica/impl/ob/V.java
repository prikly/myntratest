package com.yandex.metrica.impl.ob;

public abstract class V<T> {

    /* renamed from: a  reason: collision with root package name */
    private V<T> f5198a;

    public V(V<T> v) {
        this.f5198a = v;
    }

    public void a(T t) {
        b(t);
        V<T> v = this.f5198a;
        if (v != null) {
            v.a(t);
        }
    }

    public abstract void b(T t);
}
