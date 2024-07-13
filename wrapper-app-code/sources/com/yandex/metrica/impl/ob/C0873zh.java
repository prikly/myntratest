package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.zh  reason: case insensitive filesystem */
class C0873zh {

    /* renamed from: a  reason: collision with root package name */
    private final String f7229a;

    /* renamed from: b  reason: collision with root package name */
    private final C0810x2 f7230b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeProvider f7231c;

    /* renamed from: d  reason: collision with root package name */
    private final C0825xh f7232d;

    C0873zh(String str, C0801wh whVar) {
        this(str, new C0810x2(), new SystemTimeProvider(), new C0825xh(whVar));
    }

    /* access modifiers changed from: package-private */
    public void a(Gh gh, int i, C0336di diVar) {
        this.f7232d.a(diVar.f5689g);
        C0810x2 x2Var = this.f7230b;
        long a2 = this.f7232d.a(i);
        long j = diVar.f5689g;
        if (x2Var.b(a2, j, "report " + this.f7229a)) {
            ((Jh) gh).a(this.f7229a, Integer.valueOf(i));
            this.f7232d.a(i, this.f7231c.currentTimeSeconds());
        }
    }

    C0873zh(String str, C0810x2 x2Var, TimeProvider timeProvider, C0825xh xhVar) {
        this.f7229a = str;
        this.f7230b = x2Var;
        this.f7231c = timeProvider;
        this.f7232d = xhVar;
    }
}
