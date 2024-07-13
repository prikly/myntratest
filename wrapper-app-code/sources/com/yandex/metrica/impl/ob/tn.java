package com.yandex.metrica.impl.ob;

public abstract class tn<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f6859a;

    public tn(T t) {
        this.f6859a = t;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(tn<T> tnVar);

    public boolean equals(Object obj) {
        if (obj instanceof tn) {
            try {
                return a((tn) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
