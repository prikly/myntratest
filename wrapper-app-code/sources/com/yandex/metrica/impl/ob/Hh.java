package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

class Hh {

    /* renamed from: a  reason: collision with root package name */
    private final C0415gm f4118a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4119b;

    /* renamed from: c  reason: collision with root package name */
    private long f4120c;

    /* renamed from: d  reason: collision with root package name */
    private long f4121d;

    /* renamed from: e  reason: collision with root package name */
    private long f4122e;

    Hh(TimeProvider timeProvider, C0415gm gmVar) {
        this.f4119b = timeProvider.currentTimeMillis();
        this.f4118a = gmVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f4120c = this.f4118a.b(this.f4119b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f4121d = this.f4118a.b(this.f4119b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f4122e = this.f4118a.b(this.f4119b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f4120c;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        return this.f4121d;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f4122e;
    }
}
