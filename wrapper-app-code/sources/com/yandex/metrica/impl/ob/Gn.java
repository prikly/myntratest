package com.yandex.metrica.impl.ob;

public class Gn<T> implements Kn<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4060a;

    public Gn(String str) {
        this.f4060a = str;
    }

    public In a(T t) {
        if (t != null) {
            return In.a(this);
        }
        return In.a(this, this.f4060a + " is null.");
    }
}
