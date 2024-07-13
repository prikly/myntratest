package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.TimeProvider;

public class Ob implements Gc {

    /* renamed from: a  reason: collision with root package name */
    private final TimeProvider f4647a;

    /* renamed from: b  reason: collision with root package name */
    private final C0405gc f4648b;

    Ob(C0405gc gcVar, TimeProvider timeProvider) {
        this.f4648b = gcVar;
        this.f4647a = timeProvider;
    }

    public void a() {
        this.f4648b.a(this.f4647a.currentTimeSeconds());
    }
}
