package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.en  reason: case insensitive filesystem */
public class C0366en<T> implements C0391fn<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C0391fn<T> f5770a;

    public C0366en(C0391fn<T> fnVar, T t) {
        this.f5770a = fnVar;
    }

    public T a(T t) {
        return t != this.f5770a.a(t) ? "<truncated data was not sent, see METRIKALIB-4568>" : t;
    }
}
