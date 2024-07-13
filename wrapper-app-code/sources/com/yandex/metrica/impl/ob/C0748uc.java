package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.uc  reason: case insensitive filesystem */
class C0748uc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0772vc f6884a;

    C0748uc(C0772vc vcVar) {
        this.f6884a = vcVar;
    }

    public void run() {
        if (this.f6884a.f6981e != null) {
            this.f6884a.f6981e.a();
        }
        C0772vc.b(this.f6884a);
    }
}
