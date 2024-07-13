package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.rg  reason: case insensitive filesystem */
class C0680rg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0776vg f6720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f6721b;

    C0680rg(C0657qg qgVar, C0776vg vgVar, Throwable th) {
        this.f6720a = vgVar;
        this.f6721b = th;
    }

    public void run() {
        this.f6720a.a(this.f6721b);
    }
}
