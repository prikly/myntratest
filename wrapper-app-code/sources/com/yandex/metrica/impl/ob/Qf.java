package com.yandex.metrica.impl.ob;

public class Qf implements Kn<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final Sf f4826a;

    public Qf(Sf sf) {
        this.f4826a = sf;
    }

    public In a(Object obj) {
        Void voidR = (Void) obj;
        this.f4826a.getClass();
        if (R2.h()) {
            return In.a(this);
        }
        return In.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    public In a() {
        this.f4826a.getClass();
        if (R2.h()) {
            return In.a(this);
        }
        return In.a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
