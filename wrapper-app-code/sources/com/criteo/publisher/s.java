package com.criteo.publisher;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.criteo.publisher.advancednative.ImageLoader;
import com.criteo.publisher.advancednative.RendererHelper;
import com.criteo.publisher.advancednative.f;
import com.criteo.publisher.advancednative.h;
import com.criteo.publisher.advancednative.i;
import com.criteo.publisher.advancednative.o;
import com.criteo.publisher.advancednative.q;
import com.criteo.publisher.e0.d;
import com.criteo.publisher.f0.a0;
import com.criteo.publisher.f0.b0;
import com.criteo.publisher.f0.l;
import com.criteo.publisher.f0.r;
import com.criteo.publisher.f0.u;
import com.criteo.publisher.f0.v;
import com.criteo.publisher.f0.w;
import com.criteo.publisher.f0.z;
import com.criteo.publisher.k0.g;
import com.criteo.publisher.logging.j;
import com.criteo.publisher.logging.l;
import com.criteo.publisher.logging.n;
import com.criteo.publisher.model.p;
import com.criteo.publisher.model.t;
import com.criteo.publisher.model.u;
import com.criteo.publisher.model.x;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.c;
import com.criteo.publisher.n0.e;
import com.criteo.publisher.n0.k;
import com.criteo.publisher.n0.m;
import com.criteo.publisher.s;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* compiled from: DependencyProvider */
public class s {

    /* renamed from: d  reason: collision with root package name */
    protected static s f2916d;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Object> f2917a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private Application f2918b;

    /* renamed from: c  reason: collision with root package name */
    private String f2919c;

    /* compiled from: DependencyProvider */
    public interface a<T> {
        T a();
    }

    protected s() {
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            if (f2916d == null) {
                f2916d = new s();
            }
            sVar = f2916d;
        }
        return sVar;
    }

    public void a(Application application) {
        this.f2918b = application;
        a();
    }

    public void a(String str) {
        this.f2919c = str;
        b();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        try {
            c().a();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void a() {
        if (this.f2918b == null) {
            throw new q("Application reference is required");
        }
    }

    private void b() {
        if (com.criteo.publisher.n0.s.a((CharSequence) this.f2919c)) {
            throw new q("Criteo Publisher Id is required");
        }
    }

    public Application h0() {
        a();
        return this.f2918b;
    }

    public Context v0() {
        return h0().getApplicationContext();
    }

    public String x0() {
        b();
        return this.f2919c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ g M() {
        return new g(m0(), H0());
    }

    public g S0() {
        return (g) a(g.class, new a() {
            public final Object a() {
                return s.this.M();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b g() {
        return new b(v0(), h1(), d1());
    }

    public b d0() {
        return (b) a(b.class, new a() {
            public final Object a() {
                return s.this.g();
            }
        });
    }

    public b.f d1() {
        return (b.f) a(b.f.class, $$Lambda$8ZjxTxX1GyqWafpUJMGnT9oLaKk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ c h() {
        return new c(v0(), A0());
    }

    public c e0() {
        return (c) a(c.class, new a() {
            public final Object a() {
                return s.this.h();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ k w() {
        return new k(v0());
    }

    public k A0() {
        return (k) a(k.class, new a() {
            public final Object a() {
                return s.this.w();
            }
        });
    }

    public Executor h1() {
        return (Executor) a(ThreadPoolExecutor.class, new d());
    }

    public ScheduledExecutorService e1() {
        return (ScheduledExecutorService) a(ScheduledExecutorService.class, $$Lambda$S13P7s06haLcYyF5gJwjIbzDzMs.INSTANCE);
    }

    public com.criteo.publisher.e0.c c1() {
        return (com.criteo.publisher.e0.c) a(com.criteo.publisher.e0.c.class, $$Lambda$NrTtTT899C2gM4uo0ZvSWDcUge0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ t o() {
        return new t(g1(), H0());
    }

    public t q0() {
        return (t) a(t.class, new a() {
            public final Object a() {
                return s.this.o();
            }
        });
    }

    public i p0() {
        return (i) a(i.class, $$Lambda$SsIlMVEh9NAYjOat7cN8vUa6_8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.l0.c Z() {
        return new com.criteo.publisher.l0.c(v0());
    }

    public com.criteo.publisher.l0.c l1() {
        return (com.criteo.publisher.l0.c) a(com.criteo.publisher.l0.c.class, new a() {
            public final Object a() {
                return s.this.Z();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ e l() {
        return new e(new com.criteo.publisher.d0.a(A0()), q0(), p0(), c0(), l0(), I0(), j0(), O0(), a1(), s0());
    }

    public e k0() {
        return (e) a(e.class, new a() {
            public final Object a() {
                return s.this.l();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ u v() {
        return new u(v0(), c1());
    }

    public u z0() {
        return (u) a(u.class, new a() {
            public final Object a() {
                return s.this.v();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.model.g f() {
        return new com.criteo.publisher.model.g(A0(), F0());
    }

    public com.criteo.publisher.model.g c0() {
        return (com.criteo.publisher.model.g) a(com.criteo.publisher.model.g.class, new a() {
            public final Object a() {
                return s.this.f();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.a.a i() {
        return new com.criteo.publisher.a.a(v0(), d0(), p0(), S0(), l1(), z0(), h1());
    }

    public com.criteo.publisher.a.a f0() {
        return (com.criteo.publisher.a.a) a(com.criteo.publisher.a.a.class, new a() {
            public final Object a() {
                return s.this.i();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ e j() {
        return new e(f0(), k0());
    }

    public e g0() {
        return (e) a(e.class, new a() {
            public final Object a() {
                return s.this.j();
            }
        });
    }

    public com.criteo.publisher.n0.g m0() {
        return (com.criteo.publisher.n0.g) a(com.criteo.publisher.n0.g.class, $$Lambda$moOTksrh3pVP2CBY8LhRS9RXw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ p n() {
        return new p(v0(), x0(), z0(), d0(), l1(), j1(), m0(), F0(), w0(), k1());
    }

    public p n0() {
        return (p) a(p.class, new a() {
            public final Object a() {
                return s.this.n();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.c0.d Y() {
        return new com.criteo.publisher.c0.d(p0());
    }

    public com.criteo.publisher.c0.d j1() {
        return (com.criteo.publisher.c0.d) a(com.criteo.publisher.c0.d.class, new a() {
            public final Object a() {
                return s.this.Y();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ x O() {
        return new x(v0(), x0(), m0(), F0(), d0());
    }

    public x V0() {
        return (x) a(x.class, new a() {
            public final Object a() {
                return s.this.O();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.k0.b m() {
        return new com.criteo.publisher.k0.b(n0(), V0(), p0(), S0(), h1());
    }

    public com.criteo.publisher.k0.b l0() {
        return (com.criteo.publisher.k0.b) a(com.criteo.publisher.k0.b.class, new a() {
            public final Object a() {
                return s.this.m();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.k0.e D() {
        return new com.criteo.publisher.k0.e(S0(), n0(), p0(), h1(), e1(), q0());
    }

    public com.criteo.publisher.k0.e I0() {
        return (com.criteo.publisher.k0.e) a(com.criteo.publisher.k0.e.class, new a() {
            public final Object a() {
                return s.this.D();
            }
        });
    }

    public com.criteo.publisher.c0.a j0() {
        return (com.criteo.publisher.c0.a) a(com.criteo.publisher.c0.a.class, new a() {
            public final Object a() {
                return s.this.k();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.c0.a k() {
        com.criteo.publisher.c0.b bVar = new com.criteo.publisher.c0.b();
        bVar.a((com.criteo.publisher.c0.a) new com.criteo.publisher.c0.c(a1()));
        if (Build.VERSION.SDK_INT >= 17) {
            bVar.a((com.criteo.publisher.c0.a) new l(L0(), P0(), p0(), q0(), s0(), h1()));
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.advancednative.l K() {
        return new com.criteo.publisher.advancednative.l(m1(), new i(S0(), h1(), c1()), o0(), new f(U0(), i1(), c1()), b0(), b1());
    }

    public com.criteo.publisher.advancednative.l Q0() {
        return (com.criteo.publisher.advancednative.l) a(com.criteo.publisher.advancednative.l.class, new a() {
            public final Object a() {
                return s.this.K();
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ q a0() {
        return new q(new o());
    }

    public q m1() {
        return (q) a(q.class, $$Lambda$s$yR2_9hKMFM3YQqzNRwlCyNgQTw.INSTANCE);
    }

    public com.criteo.publisher.advancednative.e o0() {
        return (com.criteo.publisher.advancednative.e) a(com.criteo.publisher.advancednative.e.class, $$Lambda$WnlEGEyMdvvPQomtgtP1k26vUc4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.b0.b N() {
        return new com.criteo.publisher.b0.b(v0());
    }

    public com.criteo.publisher.b0.b U0() {
        return (com.criteo.publisher.b0.b) a(com.criteo.publisher.b0.b.class, new a() {
            public final Object a() {
                return s.this.N();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.advancednative.b e() {
        return new com.criteo.publisher.advancednative.b(m0(), e0());
    }

    public com.criteo.publisher.advancednative.b b0() {
        return (com.criteo.publisher.advancednative.b) a(com.criteo.publisher.advancednative.b.class, new a() {
            public final Object a() {
                return s.this.e();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Picasso L() {
        return new Picasso.Builder(v0()).build();
    }

    public Picasso R0() {
        return (Picasso) a(Picasso.class, new a() {
            public final Object a() {
                return s.this.L();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImageLoader u() {
        return new com.criteo.publisher.advancednative.g(R0(), i0());
    }

    public ImageLoader y0() {
        return (ImageLoader) a(ImageLoader.class, new a() {
            public final Object a() {
                return s.this.u();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ h z() {
        return new h(y0());
    }

    public h D0() {
        return (h) a(h.class, new a() {
            public final Object a() {
                return s.this.z();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RendererHelper U() {
        return new RendererHelper(D0(), c1());
    }

    public RendererHelper b1() {
        return (RendererHelper) a(RendererHelper.class, new a() {
            public final Object a() {
                return s.this.U();
            }
        });
    }

    public com.criteo.publisher.e0.a i0() {
        return (com.criteo.publisher.e0.a) a(com.criteo.publisher.e0.a.class, $$Lambda$2yKR28BC8QuBINxy9Jm2OejaU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SharedPreferences W() {
        return v0().getSharedPreferences("com.criteo.publisher.sdkSharedPreferences", 0);
    }

    public SharedPreferences g1() {
        return (SharedPreferences) a(SharedPreferences.class, new a() {
            public final Object a() {
                return s.this.W();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.i0.c A() {
        return new com.criteo.publisher.i0.c(g1(), E0());
    }

    public com.criteo.publisher.i0.c F0() {
        return (com.criteo.publisher.i0.c) a(com.criteo.publisher.i0.c.class, new a() {
            public final Object a() {
                return s.this.A();
            }
        });
    }

    public com.criteo.publisher.i0.b E0() {
        return (com.criteo.publisher.i0.b) a(com.criteo.publisher.i0.b.class, $$Lambda$LJ__joS73orG6Xal7XNNpDa73UA.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public <T> T a(Class<T> cls, a<T> aVar) {
        ConcurrentMap<Class<?>, Object> concurrentMap = this.f2917a;
        Objects.requireNonNull(aVar);
        return m.a(concurrentMap, cls, new Function0() {
            public final Object invoke() {
                return s.a.this.a();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ j s() {
        return new j(k0(), p0(), c1());
    }

    public j u0() {
        return (j) a(j.class, new a() {
            public final Object a() {
                return s.this.s();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.h0.c y() {
        return new com.criteo.publisher.h0.c(Arrays.asList(new com.criteo.publisher.h0.d[]{new com.criteo.publisher.h0.e(), new com.criteo.publisher.h0.b(e0(), A0()), new com.criteo.publisher.h0.f()}), F0());
    }

    public com.criteo.publisher.h0.c C0() {
        return (com.criteo.publisher.h0.c) a(com.criteo.publisher.h0.c.class, new a() {
            public final Object a() {
                return s.this.y();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.j0.a B() {
        return new com.criteo.publisher.j0.a(v0(), i1());
    }

    public com.criteo.publisher.j0.a G0() {
        return (com.criteo.publisher.j0.a) a(com.criteo.publisher.j0.a.class, new a() {
            public final Object a() {
                return s.this.B();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.a0.b X() {
        return new com.criteo.publisher.a0.b(v0());
    }

    public com.criteo.publisher.a0.b i1() {
        return (com.criteo.publisher.a0.b) a(com.criteo.publisher.a0.b.class, new a() {
            public final Object a() {
                return s.this.X();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ w I() {
        return new w(M0(), S0(), m0(), q0(), h1());
    }

    public w O0() {
        return (w) a(w.class, new a() {
            public final Object a() {
                return s.this.I();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.f0.x J() {
        return new com.criteo.publisher.f0.x(M0());
    }

    public com.criteo.publisher.f0.x P0() {
        return (com.criteo.publisher.f0.x) a(com.criteo.publisher.f0.x.class, new a() {
            public final Object a() {
                return s.this.J();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.f0.u G() {
        return new u.a(a(N0()));
    }

    public com.criteo.publisher.f0.u M0() {
        return (com.criteo.publisher.f0.u) a(com.criteo.publisher.f0.u.class, new a() {
            public final Object a() {
                return s.this.G();
            }
        });
    }

    private <T> com.criteo.publisher.f0.k<T> a(a0<T> a0Var) {
        return new b0(new z(v0(), H0(), a0Var), a0Var).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ v H() {
        return new v(m0());
    }

    public v N0() {
        return (v) a(v.class, new a() {
            public final Object a() {
                return s.this.H();
            }
        });
    }

    public r L0() {
        return (r) a(r.class, new com.criteo.publisher.f0.s(v0(), K0(), m0()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.f0.q F() {
        return new com.criteo.publisher.f0.q(H0());
    }

    public com.criteo.publisher.f0.q K0() {
        return (com.criteo.publisher.f0.q) a(com.criteo.publisher.f0.q.class, new a() {
            public final Object a() {
                return s.this.F();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.n0.l C() {
        return new com.criteo.publisher.n0.l(B0());
    }

    public com.criteo.publisher.n0.l H0() {
        return (com.criteo.publisher.n0.l) a(com.criteo.publisher.n0.l.class, new a() {
            public final Object a() {
                return s.this.C();
            }
        });
    }

    public Gson B0() {
        return (Gson) a(Gson.class, $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.logging.h E() {
        return new com.criteo.publisher.logging.h(Arrays.asList(new com.criteo.publisher.g0.a[]{new com.criteo.publisher.g0.a("ConsoleHandler", new Function0() {
            public final Object invoke() {
                return s.this.t0();
            }
        }), new com.criteo.publisher.g0.a("RemoteHandler", new Function0() {
            public final Object invoke() {
                return s.this.W0();
            }
        })}));
    }

    public com.criteo.publisher.logging.h J0() {
        return (com.criteo.publisher.logging.h) a(com.criteo.publisher.logging.h.class, new a() {
            public final Object a() {
                return s.this.E();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.logging.c r() {
        return new com.criteo.publisher.logging.c(m0());
    }

    public com.criteo.publisher.logging.c t0() {
        return (com.criteo.publisher.logging.c) a(com.criteo.publisher.logging.c.class, new a() {
            public final Object a() {
                return s.this.r();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.context.b t() {
        return new com.criteo.publisher.context.b(v0(), r0(), e0(), f1());
    }

    public com.criteo.publisher.context.b w0() {
        return (com.criteo.publisher.context.b) a(com.criteo.publisher.context.b.class, new a() {
            public final Object a() {
                return s.this.t();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.context.a p() {
        return new com.criteo.publisher.context.a(v0());
    }

    public com.criteo.publisher.context.a r0() {
        return (com.criteo.publisher.context.a) a(com.criteo.publisher.context.a.class, new a() {
            public final Object a() {
                return s.this.p();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ z V() {
        return new z(p0(), j1());
    }

    public z f1() {
        return (z) a(z.class, new a() {
            public final Object a() {
                return s.this.V();
            }
        });
    }

    public com.criteo.publisher.context.d k1() {
        return (com.criteo.publisher.context.d) a(com.criteo.publisher.context.d.class, $$Lambda$PXRbrM5kYcbLI6WrWwr8YqzxutI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.logging.l R() {
        return new l.a(a(Z0()));
    }

    public com.criteo.publisher.logging.l Y0() {
        return (com.criteo.publisher.logging.l) a(com.criteo.publisher.logging.l.class, new a() {
            public final Object a() {
                return s.this.R();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.logging.m S() {
        return new com.criteo.publisher.logging.m(m0());
    }

    public com.criteo.publisher.logging.m Z0() {
        return (com.criteo.publisher.logging.m) a(com.criteo.publisher.logging.m.class, new a() {
            public final Object a() {
                return s.this.S();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.logging.k Q() {
        return new com.criteo.publisher.logging.k(m0(), v0(), d0(), f1(), F0(), p0(), T0());
    }

    public com.criteo.publisher.logging.k X0() {
        return (com.criteo.publisher.logging.k) a(com.criteo.publisher.logging.k.class, new a() {
            public final Object a() {
                return s.this.Q();
            }
        });
    }

    public com.criteo.publisher.logging.i T0() {
        return (com.criteo.publisher.logging.i) a(com.criteo.publisher.logging.i.class, $$Lambda$HCplnjlTIZGtwZOaw4LF45lghNc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ j P() {
        return new j(X0(), Y0(), q0(), h1(), s0());
    }

    public j W0() {
        return (j) a(j.class, new a() {
            public final Object a() {
                return s.this.P();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ n T() {
        return new n(Y0(), S0(), m0(), d0(), h1());
    }

    public n a1() {
        return (n) a(n.class, new a() {
            public final Object a() {
                return s.this.T();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com.criteo.publisher.l0.a q() {
        return new com.criteo.publisher.l0.a(g1());
    }

    public com.criteo.publisher.l0.a s0() {
        return (com.criteo.publisher.l0.a) a(com.criteo.publisher.l0.a.class, new a() {
            public final Object a() {
                return s.this.q();
            }
        });
    }
}
