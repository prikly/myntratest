package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.c1  reason: case insensitive filesystem */
class C0294c1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Handler> f5582a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<B> f5583b;

    C0294c1(Handler handler, B b2) {
        this.f5582a = new WeakReference<>(handler);
        this.f5583b = new WeakReference<>(b2);
    }

    public void run() {
        Handler handler = (Handler) this.f5582a.get();
        B b2 = (B) this.f5583b.get();
        if (handler != null && b2 != null && b2.e()) {
            C0269b1.a(handler, b2, this);
        }
    }
}
