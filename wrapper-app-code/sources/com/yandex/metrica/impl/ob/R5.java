package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.X5;
import java.util.concurrent.TimeUnit;

public abstract class R5 implements U5<W5> {

    /* renamed from: a  reason: collision with root package name */
    private final L3 f4851a;

    /* renamed from: b  reason: collision with root package name */
    private final C0249a6 f4852b;

    /* renamed from: c  reason: collision with root package name */
    private final C0349e6 f4853c;

    /* renamed from: d  reason: collision with root package name */
    private final Z5 f4854d;

    /* renamed from: e  reason: collision with root package name */
    private final M0 f4855e;

    /* renamed from: f  reason: collision with root package name */
    private final SystemTimeProvider f4856f;

    public R5(L3 l3, C0249a6 a6Var, C0349e6 e6Var, Z5 z5, M0 m0, SystemTimeProvider systemTimeProvider) {
        this.f4851a = l3;
        this.f4852b = a6Var;
        this.f4853c = e6Var;
        this.f4854d = z5;
        this.f4855e = m0;
        this.f4856f = systemTimeProvider;
    }

    public V5 a(Object obj) {
        W5 w5 = (W5) obj;
        if (this.f4853c.h()) {
            this.f4855e.reportEvent("create session with non-empty storage");
        }
        L3 l3 = this.f4851a;
        C0349e6 e6Var = this.f4853c;
        long a2 = this.f4852b.a();
        C0349e6 d2 = this.f4853c.d(a2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d2.e(timeUnit.toSeconds(w5.f5249a)).a(w5.f5249a).c(0).a(true).b();
        this.f4851a.i().a(a2, this.f4854d.b(), timeUnit.toSeconds(w5.f5250b));
        return new V5(l3, e6Var, a(), new SystemTimeProvider());
    }

    public final V5 b() {
        if (this.f4853c.h()) {
            return new V5(this.f4851a, this.f4853c, a(), this.f4856f);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public X5 a() {
        X5.b d2 = new X5.b(this.f4854d).a(this.f4853c.i()).b(this.f4853c.e()).a(this.f4853c.c()).c(this.f4853c.f()).d(this.f4853c.g());
        d2.f5304a = this.f4853c.d();
        return new X5(d2);
    }
}
