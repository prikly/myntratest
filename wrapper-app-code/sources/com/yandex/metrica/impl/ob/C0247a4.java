package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.M3;

/* renamed from: com.yandex.metrica.impl.ob.a4  reason: case insensitive filesystem */
public class C0247a4 {

    /* renamed from: a  reason: collision with root package name */
    private final C0302c9 f5456a;

    /* renamed from: b  reason: collision with root package name */
    private final C0276b8 f5457b;

    /* renamed from: c  reason: collision with root package name */
    private C0274b6 f5458c;

    /* renamed from: d  reason: collision with root package name */
    private L7 f5459d;

    /* renamed from: e  reason: collision with root package name */
    private final Dm f5460e;

    /* renamed from: f  reason: collision with root package name */
    private final C0424h6 f5461f;

    /* renamed from: g  reason: collision with root package name */
    private final C0687s f5462g;

    /* renamed from: h  reason: collision with root package name */
    private final O3 f5463h;
    private a i;
    private final TimeProvider j;
    private final int k;
    private long l;
    private long m;
    private int n;

    /* renamed from: com.yandex.metrica.impl.ob.a4$a */
    public interface a {
    }

    public C0247a4(C0302c9 c9Var, C0276b8 b8Var, C0274b6 b6Var, L7 l7, C0687s sVar, Dm dm, C0424h6 h6Var, int i2, a aVar, O3 o3, TimeProvider timeProvider) {
        this.f5456a = c9Var;
        this.f5457b = b8Var;
        this.f5458c = b6Var;
        this.f5459d = l7;
        this.f5462g = sVar;
        this.f5460e = dm;
        this.f5461f = h6Var;
        this.k = i2;
        this.f5463h = o3;
        this.j = timeProvider;
        this.i = aVar;
        this.l = c9Var.b(0);
        this.m = c9Var.l();
        this.n = c9Var.i();
    }

    public void a(C0293c0 c0Var) {
        this.f5458c.c(c0Var);
    }

    public void b(C0293c0 c0Var) {
        a(c0Var, this.f5458c.b(c0Var));
    }

    public void c(C0293c0 c0Var) {
        a(c0Var, this.f5458c.b(c0Var));
        int i2 = this.k;
        this.n = i2;
        this.f5456a.a(i2).d();
    }

    public void d(C0293c0 c0Var) {
        a(c0Var, this.f5458c.b(c0Var));
        long currentTimeSeconds = this.j.currentTimeSeconds();
        this.l = currentTimeSeconds;
        this.f5456a.c(currentTimeSeconds).d();
    }

    public void e(C0293c0 c0Var) {
        a(c0Var, this.f5458c.b(c0Var));
        long currentTimeSeconds = this.j.currentTimeSeconds();
        this.m = currentTimeSeconds;
        this.f5456a.e(currentTimeSeconds).d();
    }

    public void f(C0293c0 c0Var) {
        a(c0Var, this.f5458c.f(c0Var));
    }

    public void a(C0293c0 c0Var, C0299c6 c6Var) {
        if (TextUtils.isEmpty(c0Var.p())) {
            c0Var.e(this.f5456a.n());
        }
        c0Var.i().putAll(this.f5461f.a());
        c0Var.d(this.f5456a.m());
        c0Var.a(Integer.valueOf(this.f5457b.e()));
        C0299c6 c6Var2 = c6Var;
        this.f5459d.a(this.f5460e.a(c0Var).a(c0Var), c0Var.o(), c6Var2, this.f5462g.a(), this.f5463h);
        ((M3.a) this.i).f4531a.g();
    }

    public void b() {
        int i2 = this.k;
        this.n = i2;
        this.f5456a.a(i2).d();
    }

    public boolean c() {
        return this.n < this.k;
    }

    public boolean d() {
        return this.j.currentTimeSeconds() - this.l > Y5.f5366a;
    }

    public long a() {
        return this.m;
    }
}
