package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

public class Q {

    /* renamed from: a  reason: collision with root package name */
    private SystemTimeProvider f4804a;

    public Q() {
        this(new SystemTimeProvider());
    }

    public void a() {
        this.f4804a.elapsedRealtime();
    }

    Q(SystemTimeProvider systemTimeProvider) {
        this.f4804a = systemTimeProvider;
    }
}
