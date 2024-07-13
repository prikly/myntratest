package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.gm  reason: case insensitive filesystem */
public class C0415gm {

    /* renamed from: a  reason: collision with root package name */
    private final SystemTimeProvider f5886a;

    public C0415gm() {
        this(new SystemTimeProvider());
    }

    public long a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(this.f5886a.elapsedRealtime() - timeUnit.toMillis(j));
    }

    public long b(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0;
        }
        return this.f5886a.currentTimeSeconds() - timeUnit.toSeconds(j);
    }

    public long c(long j, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(this.f5886a.systemNanoTime() - timeUnit.toNanos(j));
    }

    public C0415gm(SystemTimeProvider systemTimeProvider) {
        this.f5886a = systemTimeProvider;
    }
}
