package com.yandex.metrica.impl.ob;

class E2 implements C0564mm<C0315cm> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Throwable f3906a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f3907b;

    E2(D2 d2, Throwable th, String str) {
        this.f3906a = th;
        this.f3907b = str;
    }

    public void b(Object obj) {
        C0315cm cmVar = (C0315cm) obj;
        if (cmVar.isEnabled()) {
            cmVar.e(this.f3906a, this.f3907b);
        }
    }
}
