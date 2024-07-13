package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.b6  reason: case insensitive filesystem */
public class C0274b6 {

    /* renamed from: a  reason: collision with root package name */
    private final L3 f5506a;

    /* renamed from: b  reason: collision with root package name */
    private final C0249a6 f5507b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5508c;

    /* renamed from: d  reason: collision with root package name */
    private final A0 f5509d;

    /* renamed from: e  reason: collision with root package name */
    private final U5<W5> f5510e;

    /* renamed from: f  reason: collision with root package name */
    private final U5<W5> f5511f;

    /* renamed from: g  reason: collision with root package name */
    private V5 f5512g;

    /* renamed from: h  reason: collision with root package name */
    private b f5513h;

    /* renamed from: com.yandex.metrica.impl.ob.b6$a */
    public interface a {
        void a(C0293c0 c0Var, C0299c6 c6Var);
    }

    /* renamed from: com.yandex.metrica.impl.ob.b6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C0274b6(L3 l3, C0249a6 a6Var, a aVar) {
        this(l3, a6Var, aVar, new T5(l3, a6Var), new S5(l3, a6Var), new A0(l3.g()));
    }

    private void e(C0293c0 c0Var) {
        if (this.f5513h == null) {
            V5 b2 = ((R5) this.f5510e).b();
            if (a(b2, c0Var)) {
                this.f5512g = b2;
                this.f5513h = b.FOREGROUND;
                return;
            }
            V5 b3 = ((R5) this.f5511f).b();
            if (a(b3, c0Var)) {
                this.f5512g = b3;
                this.f5513h = b.BACKGROUND;
                return;
            }
            this.f5512g = null;
            this.f5513h = b.EMPTY;
        }
    }

    public synchronized long a() {
        V5 v5;
        v5 = this.f5512g;
        return v5 == null ? 10000000000L : v5.c() - 1;
    }

    public C0299c6 b(C0293c0 c0Var) {
        return a(c(c0Var), c0Var.e());
    }

    public synchronized V5 c(C0293c0 c0Var) {
        e(c0Var);
        b bVar = this.f5513h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2 && !a(this.f5512g, c0Var)) {
            this.f5513h = bVar2;
            this.f5512g = null;
        }
        int ordinal = this.f5513h.ordinal();
        if (ordinal == 1) {
            this.f5512g.c(c0Var.e());
            return this.f5512g;
        } else if (ordinal != 2) {
            this.f5513h = b.BACKGROUND;
            long e2 = c0Var.e();
            V5 a2 = ((R5) this.f5511f).a(new W5(e2, c0Var.f()));
            if (this.f5506a.x().k()) {
                this.f5508c.a(C0293c0.a(c0Var, this.f5509d), a(a2, c0Var.e()));
            } else if (c0Var.o() == C0244a1.EVENT_TYPE_FIRST_ACTIVATION.b()) {
                this.f5508c.a(c0Var, a(a2, e2));
                this.f5508c.a(C0293c0.a(c0Var, this.f5509d), a(a2, e2));
            }
            this.f5512g = a2;
            return a2;
        } else {
            return this.f5512g;
        }
    }

    public synchronized void d(C0293c0 c0Var) {
        e(c0Var);
        int ordinal = this.f5513h.ordinal();
        if (ordinal == 0) {
            this.f5512g = a(c0Var);
        } else if (ordinal == 1) {
            b(this.f5512g, c0Var);
            this.f5512g = a(c0Var);
        } else if (ordinal == 2) {
            if (a(this.f5512g, c0Var)) {
                this.f5512g.c(c0Var.e());
            } else {
                this.f5512g = a(c0Var);
            }
        }
    }

    public C0299c6 f(C0293c0 c0Var) {
        V5 v5;
        boolean z;
        if (this.f5513h == null) {
            v5 = ((R5) this.f5510e).b();
            boolean z2 = false;
            if (v5 == null) {
                z = false;
            } else {
                z = v5.b(c0Var.e());
            }
            if (z) {
                v5 = ((R5) this.f5511f).b();
                if (v5 != null) {
                    z2 = v5.b(c0Var.e());
                }
                if (z2) {
                    v5 = null;
                }
            }
        } else {
            v5 = this.f5512g;
        }
        if (v5 != null) {
            return new C0299c6().c(v5.c()).a(v5.e()).b(v5.d()).a(v5.f());
        }
        long f2 = c0Var.f();
        long a2 = this.f5507b.a();
        L7 i = this.f5506a.i();
        C0374f6 f6Var = C0374f6.BACKGROUND;
        i.a(a2, f6Var, f2);
        return new C0299c6().c(a2).a(f6Var).a(0).b(0);
    }

    public synchronized void g(C0293c0 c0Var) {
        c(c0Var).a(false);
        b bVar = this.f5513h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2) {
            b(this.f5512g, c0Var);
        }
        this.f5513h = bVar2;
    }

    private V5 a(C0293c0 c0Var) {
        long e2 = c0Var.e();
        V5 a2 = ((R5) this.f5510e).a(new W5(e2, c0Var.f()));
        this.f5513h = b.FOREGROUND;
        this.f5506a.l().c();
        this.f5508c.a(C0293c0.a(c0Var, this.f5509d), a(a2, e2));
        return a2;
    }

    private void b(V5 v5, C0293c0 c0Var) {
        if (v5.h()) {
            this.f5508c.a(C0293c0.a(c0Var), new C0299c6().c(v5.c()).a(v5.f()).a(v5.e()).b(v5.b()));
            v5.a(false);
        }
        v5.i();
    }

    public C0274b6(L3 l3, C0249a6 a6Var, a aVar, U5<W5> u5, U5<W5> u52, A0 a0) {
        this.f5513h = null;
        this.f5506a = l3;
        this.f5508c = aVar;
        this.f5510e = u5;
        this.f5511f = u52;
        this.f5507b = a6Var;
        this.f5509d = a0;
    }

    private boolean a(V5 v5, C0293c0 c0Var) {
        if (v5 == null) {
            return false;
        }
        if (v5.b(c0Var.e())) {
            return true;
        }
        b(v5, c0Var);
        return false;
    }

    private C0299c6 a(V5 v5, long j) {
        return new C0299c6().c(v5.c()).a(v5.e()).b(v5.a(j)).a(v5.f());
    }
}
