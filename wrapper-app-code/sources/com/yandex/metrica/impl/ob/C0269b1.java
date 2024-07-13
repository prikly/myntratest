package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.b1  reason: case insensitive filesystem */
class C0269b1 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f5498a;

    /* renamed from: b  reason: collision with root package name */
    private final B f5499b;

    /* renamed from: c  reason: collision with root package name */
    private final C0294c1 f5500c;

    C0269b1(Handler handler, B b2) {
        this.f5498a = handler;
        this.f5499b = b2;
        this.f5500c = new C0294c1(handler, b2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f5498a.removeCallbacks(this.f5500c, this.f5499b.f3721b.b().a());
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a(this.f5498a, this.f5499b, this.f5500c);
    }

    static void a(Handler handler, B b2, Runnable runnable) {
        handler.removeCallbacks(runnable, b2.f3721b.b().a());
        String a2 = b2.f3721b.b().a();
        long uptimeMillis = SystemClock.uptimeMillis();
        Integer l = b2.f3721b.b().l();
        if (l == null) {
            l = 10;
        }
        handler.postAtTime(runnable, a2, uptimeMillis + ((long) (l.intValue() * 500)));
    }
}
