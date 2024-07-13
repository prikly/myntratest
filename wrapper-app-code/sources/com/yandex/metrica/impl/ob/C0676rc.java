package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.rc  reason: case insensitive filesystem */
class C0676rc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0772vc f6695a;

    C0676rc(C0772vc vcVar) {
        this.f6695a = vcVar;
    }

    public void run() {
        try {
            if (this.f6695a.f6981e != null) {
                this.f6695a.f6981e.c();
            }
        } catch (Throwable unused) {
        }
    }
}
