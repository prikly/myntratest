package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ValidationException;

public class Hn<T> implements Kn<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Kn<T> f4124a;

    public Hn(Kn<T> kn) {
        this.f4124a = kn;
    }

    public In a(T t) {
        In a2 = this.f4124a.a(t);
        if (a2.b()) {
            return a2;
        }
        throw new ValidationException(a2.a());
    }
}
