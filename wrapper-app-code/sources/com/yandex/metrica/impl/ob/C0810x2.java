package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.x2  reason: case insensitive filesystem */
public class C0810x2 {

    /* renamed from: a  reason: collision with root package name */
    private final TimeProvider f7080a;

    public C0810x2() {
        this(new SystemTimeProvider());
    }

    private boolean a(long j, long j2, long j3) {
        return j < j2 || j - j2 >= j3;
    }

    public boolean a(long j, long j2, String str) {
        return a(this.f7080a.currentTimeMillis(), j, j2);
    }

    public boolean b(long j, long j2, String str) {
        return a(this.f7080a.currentTimeSeconds(), j, j2);
    }

    C0810x2(TimeProvider timeProvider) {
        this.f7080a = timeProvider;
    }
}
