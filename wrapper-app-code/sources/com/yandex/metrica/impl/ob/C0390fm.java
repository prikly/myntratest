package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fm  reason: case insensitive filesystem */
public class C0390fm implements Q0 {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f5829a;

    /* renamed from: b  reason: collision with root package name */
    private C0352e9 f5830b;

    /* renamed from: c  reason: collision with root package name */
    private TimeProvider f5831c;

    /* renamed from: com.yandex.metrica.impl.ob.fm$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static C0390fm f5832a = new C0390fm();
    }

    public static C0390fm c() {
        return b.f5832a;
    }

    public synchronized long a() {
        return this.f5829a;
    }

    public synchronized void b() {
        this.f5830b.c(false);
        this.f5830b.d();
    }

    public synchronized void d() {
        C0352e9 s = F0.g().s();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f5830b = s;
        this.f5829a = s.b(0);
        this.f5831c = systemTimeProvider;
    }

    public synchronized boolean e() {
        return this.f5830b.a(true);
    }

    private C0390fm() {
    }

    public synchronized void a(long j, Long l) {
        this.f5829a = (j - this.f5831c.currentTimeMillis()) / 1000;
        boolean z = true;
        if (this.f5830b.a(true)) {
            if (l != null) {
                long abs = Math.abs(j - this.f5831c.currentTimeMillis());
                C0352e9 e9Var = this.f5830b;
                if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = false;
                }
                e9Var.c(z);
            } else {
                this.f5830b.c(false);
            }
        }
        this.f5830b.l(this.f5829a);
        this.f5830b.d();
    }
}
