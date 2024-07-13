package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.impl.ob.C0687s;

@Deprecated
public class Md extends Kd {
    private static final Rd A = new Rd("BG_SESSION_ID_", (String) null);
    private static final Rd B = new Rd("BG_SESSION_SLEEP_START_", (String) null);
    private static final Rd C = new Rd("BG_SESSION_COUNTER_ID_", (String) null);
    private static final Rd D = new Rd("BG_SESSION_INIT_TIME_", (String) null);
    private static final Rd E = new Rd("IDENTITY_SEND_TIME_", (String) null);
    private static final Rd F = new Rd("USER_INFO_", (String) null);
    private static final Rd G = new Rd("REFERRER_", (String) null);
    @Deprecated
    public static final Rd H = new Rd("APP_ENVIRONMENT", (String) null);
    @Deprecated
    public static final Rd I = new Rd("APP_ENVIRONMENT_REVISION", (String) null);
    private static final Rd J = new Rd("APP_ENVIRONMENT_", (String) null);
    private static final Rd K = new Rd("APP_ENVIRONMENT_REVISION_", (String) null);
    private static final Rd u = new Rd("SESSION_SLEEP_START_", (String) null);
    private static final Rd v = new Rd("SESSION_ID_", (String) null);
    private static final Rd w = new Rd("SESSION_COUNTER_ID_", (String) null);
    private static final Rd x = new Rd("SESSION_INIT_TIME_", (String) null);
    private static final Rd y = new Rd("SESSION_ALIVE_TIME_", (String) null);
    private static final Rd z = new Rd("SESSION_IS_ALIVE_REPORT_NEEDED_", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private Rd f4551f = new Rd(u.b(), c());

    /* renamed from: g  reason: collision with root package name */
    private Rd f4552g = new Rd(v.b(), c());

    /* renamed from: h  reason: collision with root package name */
    private Rd f4553h = new Rd(w.b(), c());
    private Rd i = new Rd(x.b(), c());
    private Rd j = new Rd(y.b(), c());
    private Rd k = new Rd(z.b(), c());
    private Rd l = new Rd(A.b(), c());
    private Rd m = new Rd(B.b(), c());
    private Rd n = new Rd(C.b(), c());
    private Rd o = new Rd(D.b(), c());
    private Rd p = new Rd(E.b(), c());
    private Rd q = new Rd(F.b(), c());
    private Rd r = new Rd(G.b(), c());
    private Rd s = new Rd(J.b(), c());
    private Rd t = new Rd(K.b(), c());

    public Md(Context context, String str) {
        super(context, str);
        a(-1);
        c(0);
        b(0);
    }

    public long a(long j2) {
        return this.f4434b.getLong(this.o.a(), j2);
    }

    public long b(long j2) {
        return this.f4434b.getLong(this.n.a(), j2);
    }

    public long c(long j2) {
        return this.f4434b.getLong(this.l.a(), j2);
    }

    public long d(long j2) {
        return this.f4434b.getLong(this.m.a(), j2);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_boundentrypreferences";
    }

    public long e(long j2) {
        return this.f4434b.getLong(this.i.a(), j2);
    }

    public long f(long j2) {
        return this.f4434b.getLong(this.f4553h.a(), j2);
    }

    public long g(long j2) {
        return this.f4434b.getLong(this.f4552g.a(), j2);
    }

    public long h(long j2) {
        return this.f4434b.getLong(this.f4551f.a(), j2);
    }

    public long i(long j2) {
        return this.f4434b.getLong(this.p.a(), j2);
    }

    private void c(int i2) {
        C0267b.a(this.f4434b, this.f4551f.a(), i2);
    }

    public Boolean a(boolean z2) {
        return Boolean.valueOf(this.f4434b.getBoolean(this.k.a(), z2));
    }

    public String b(String str) {
        return this.f4434b.getString(this.q.a(), (String) null);
    }

    public C0687s.a f() {
        synchronized (this) {
            if (!this.f4434b.contains(this.s.a()) || !this.f4434b.contains(this.t.a())) {
                return null;
            }
            C0687s.a aVar = new C0687s.a(this.f4434b.getString(this.s.a(), JsonUtils.EMPTY_JSON), this.f4434b.getLong(this.t.a(), 0));
            return aVar;
        }
    }

    public boolean g() {
        return this.f4434b.contains(this.i.a()) || this.f4434b.contains(this.j.a()) || this.f4434b.contains(this.k.a()) || this.f4434b.contains(this.f4551f.a()) || this.f4434b.contains(this.f4552g.a()) || this.f4434b.contains(this.f4553h.a()) || this.f4434b.contains(this.o.a()) || this.f4434b.contains(this.m.a()) || this.f4434b.contains(this.l.a()) || this.f4434b.contains(this.n.a()) || this.f4434b.contains(this.s.a()) || this.f4434b.contains(this.q.a()) || this.f4434b.contains(this.r.a()) || this.f4434b.contains(this.p.a());
    }

    public void h() {
        this.f4434b.edit().remove(this.o.a()).remove(this.n.a()).remove(this.l.a()).remove(this.m.a()).remove(this.i.a()).remove(this.f4553h.a()).remove(this.f4552g.a()).remove(this.f4551f.a()).remove(this.k.a()).remove(this.j.a()).remove(this.q.a()).remove(this.s.a()).remove(this.t.a()).remove(this.r.a()).remove(this.p.a()).apply();
    }

    public Md i() {
        return (Md) a(this.r.a());
    }

    private void b(int i2) {
        C0267b.a(this.f4434b, this.f4553h.a(), i2);
    }

    public Md a(C0687s.a aVar) {
        synchronized (this) {
            a(this.s.a(), aVar.f6766a);
            a(this.t.a(), Long.valueOf(aVar.f6767b));
        }
        return this;
    }

    private void a(int i2) {
        C0267b.a(this.f4434b, this.j.a(), i2);
    }
}
