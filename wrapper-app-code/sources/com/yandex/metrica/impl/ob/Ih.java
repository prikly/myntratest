package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

public class Ih {

    /* renamed from: a  reason: collision with root package name */
    private long f4269a;

    /* renamed from: b  reason: collision with root package name */
    private long f4270b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeProvider f4271c;

    /* renamed from: d  reason: collision with root package name */
    private final C0415gm f4272d;

    Ih() {
        this(new SystemTimeProvider(), new C0415gm());
    }

    /* access modifiers changed from: package-private */
    public synchronized double a() {
        return (double) this.f4272d.b(this.f4270b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public synchronized double b() {
        return (double) this.f4272d.b(this.f4269a, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public synchronized void c() {
        this.f4270b = this.f4271c.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public synchronized void d() {
        this.f4269a = this.f4271c.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public synchronized void e() {
        this.f4270b = 0;
    }

    Ih(TimeProvider timeProvider, C0415gm gmVar) {
        this.f4271c = timeProvider;
        this.f4272d = gmVar;
    }
}
