package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;

public final class C0<T> implements ConfigProvider<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f3792a;

    public C0(T t) {
        this.f3792a = t;
    }

    public T getConfig() {
        return this.f3792a;
    }
}
