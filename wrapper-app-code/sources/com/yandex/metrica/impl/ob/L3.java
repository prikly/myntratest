package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.C0274b6;
import com.yandex.metrica.impl.ob.C0687s;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.K3;
import com.yandex.metrica.impl.ob.Lg;
import java.util.ArrayList;
import java.util.List;

public class L3 implements Lg.d, P3, S3, C0628pb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4463a;

    /* renamed from: b  reason: collision with root package name */
    private final I3 f4464b;

    /* renamed from: c  reason: collision with root package name */
    private final C0302c9 f4465c;

    /* renamed from: d  reason: collision with root package name */
    private final C0352e9 f4466d;

    /* renamed from: e  reason: collision with root package name */
    private final C0252a9 f4467e;

    /* renamed from: f  reason: collision with root package name */
    private final S1 f4468f;

    /* renamed from: g  reason: collision with root package name */
    private final L7 f4469g;

    /* renamed from: h  reason: collision with root package name */
    private final L4 f4470h;
    private final I4 i;
    private final C0687s j;
    private final B3 k;
    private final C0274b6 l;
    private final Z3 m;
    private final M5 n;
    private final C0315cm o;
    private final Sl p;
    /* access modifiers changed from: private */
    public final C0247a4 q;
    private final K3.b r;
    private final C0603ob s;
    private final C0528lb t;
    private final C0652qb u;
    private final H v;
    private final C0810x2 w;
    private final I1 x = F0.g().k();
    private final C0276b8 y;
    private final C0424h6 z;

    class a implements C0274b6.a {
        a() {
        }

        public void a(C0293c0 c0Var, C0299c6 c6Var) {
            L3.this.q.a(c0Var, c6Var);
        }
    }

    L3(Context context, I3 i3, B3 b3, C0810x2 x2Var, M3 m3) {
        this.f4463a = context.getApplicationContext();
        this.f4464b = i3;
        this.k = b3;
        this.w = x2Var;
        C0276b8 e2 = m3.e();
        this.y = e2;
        Z3 a2 = m3.a(this);
        this.m = a2;
        C0315cm b2 = m3.c().b();
        this.o = b2;
        Sl a3 = m3.c().a();
        this.p = a3;
        C0302c9 a4 = m3.d().a();
        this.f4465c = a4;
        this.f4467e = m3.d().b();
        this.f4466d = F0.g().s();
        C0687s a5 = b3.a(i3, b2, a4);
        this.j = a5;
        this.n = m3.a();
        L7 b4 = m3.b(this);
        this.f4469g = b4;
        S1<L3> e3 = m3.e(this);
        this.f4468f = e3;
        this.r = m3.d(this);
        C0652qb a6 = m3.a(b4, a2);
        this.u = a6;
        C0528lb a7 = m3.a(b4);
        this.t = a7;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a6);
        arrayList.add(a7);
        this.s = m3.a((List<C0553mb>) arrayList, (C0628pb) this);
        z();
        C0274b6 a8 = m3.a(this, e2, new a());
        this.l = a8;
        if (a3.isEnabled()) {
            a3.fi("Read app environment for component %s. Value: %s", i3.toString(), a5.a().f6766a);
        }
        C0424h6 b5 = m3.b();
        this.z = b5;
        this.q = m3.a(a4, e2, a8, b4, a5, b5, e3);
        I4 c2 = m3.c(this);
        this.i = c2;
        this.f4470h = m3.a(this, c2);
        this.v = m3.a(a4);
        b4.e();
    }

    private void z() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer j2 = this.f4465c.j();
        if (j2 == null) {
            j2 = Integer.valueOf(this.y.c());
        }
        if (j2.intValue() < libraryApiLevel) {
            this.r.a(new Id(new Jd(this.f4463a, this.f4464b.a()))).a();
            this.y.b(libraryApiLevel);
        }
    }

    public boolean A() {
        Lg m2 = m();
        return m2.R() && m2.x() && this.w.b(this.q.a(), m2.K(), "need to check permissions");
    }

    public boolean B() {
        return this.q.d() && m().x();
    }

    public boolean C() {
        return this.q.c() && m().O() && m().x();
    }

    public void D() {
        this.m.e();
    }

    public boolean E() {
        Lg m2 = m();
        return m2.R() && this.w.b(this.q.a(), m2.L(), "should force send permissions");
    }

    public boolean F() {
        return !(((C0357ee) this.x.b()).f5746d && this.m.d().N());
    }

    public void G() {
    }

    public synchronized void a(C0411gi giVar, C0635pi piVar) {
    }

    public void b(C0293c0 c0Var) {
        boolean z2;
        this.j.a(c0Var.b());
        C0687s.a a2 = this.j.a();
        B3 b3 = this.k;
        C0302c9 c9Var = this.f4465c;
        synchronized (b3) {
            if (a2.f6767b > c9Var.f().f6767b) {
                c9Var.a(a2).d();
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2 && this.o.isEnabled()) {
            this.o.fi("Save new app environment for %s. Value: %s", this.f4464b, a2.f6766a);
        }
    }

    public synchronized void c() {
        this.f4468f.d();
    }

    public H d() {
        return this.v;
    }

    public I3 e() {
        return this.f4464b;
    }

    public C0302c9 f() {
        return this.f4465c;
    }

    public Context g() {
        return this.f4463a;
    }

    public String h() {
        return this.f4465c.n();
    }

    public L7 i() {
        return this.f4469g;
    }

    public M5 j() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public I4 k() {
        return this.i;
    }

    public C0603ob l() {
        return this.s;
    }

    public Lg m() {
        return (Lg) this.m.b();
    }

    @Deprecated
    public final Jd n() {
        return new Jd(this.f4463a, this.f4464b.a());
    }

    public C0252a9 o() {
        return this.f4467e;
    }

    public String p() {
        return this.f4465c.m();
    }

    public C0315cm q() {
        return this.o;
    }

    public C0247a4 r() {
        return this.q;
    }

    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MANUAL;
    }

    public C0352e9 t() {
        return this.f4466d;
    }

    public C0424h6 u() {
        return this.z;
    }

    public C0274b6 v() {
        return this.l;
    }

    public C0635pi w() {
        return this.m.d();
    }

    public C0276b8 x() {
        return this.y;
    }

    public void y() {
        this.q.b();
    }

    public void a(C0293c0 c0Var) {
        if (this.o.isEnabled()) {
            C0315cm cmVar = this.o;
            cmVar.getClass();
            if (C0856z0.c(c0Var.o())) {
                StringBuilder sb = new StringBuilder("Event received on service");
                sb.append(": ");
                sb.append(c0Var.g());
                if (C0856z0.e(c0Var.o()) && !TextUtils.isEmpty(c0Var.q())) {
                    sb.append(" with value ");
                    sb.append(c0Var.q());
                }
                cmVar.i(sb.toString());
            }
        }
        String a2 = this.f4464b.a();
        if (!TextUtils.isEmpty(a2) && !"-1".equals(a2)) {
            this.f4470h.a(c0Var);
        }
    }

    public void b() {
        this.j.b();
        B3 b3 = this.k;
        C0687s.a a2 = this.j.a();
        C0302c9 c9Var = this.f4465c;
        synchronized (b3) {
            c9Var.a(a2).d();
        }
    }

    public void b(String str) {
        this.f4465c.i(str).d();
    }

    public synchronized void a(D3.a aVar) {
        Z3 z3 = this.m;
        synchronized (z3) {
            z3.a(aVar);
        }
        if (Boolean.TRUE.equals(aVar.k)) {
            this.o.setEnabled();
        } else {
            if (Boolean.FALSE.equals(aVar.k)) {
                this.o.setDisabled();
            }
        }
    }

    public synchronized void a(C0635pi piVar) {
        this.m.a(piVar);
        this.f4469g.b(piVar);
        this.s.c();
    }

    public void a(String str) {
        this.f4465c.j(str).d();
    }
}
