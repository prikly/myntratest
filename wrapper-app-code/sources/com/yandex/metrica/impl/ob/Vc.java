package com.yandex.metrica.impl.ob;

public class Vc {

    /* renamed from: a  reason: collision with root package name */
    private final C0772vc f5227a;

    /* renamed from: b  reason: collision with root package name */
    private final Xj f5228b;

    /* renamed from: c  reason: collision with root package name */
    private final H2 f5229c;

    /* renamed from: d  reason: collision with root package name */
    private final C0653qc f5230d;

    /* renamed from: e  reason: collision with root package name */
    private final C0352e9 f5231e;

    public Vc(C0772vc vcVar, H2 h2, C0352e9 e9Var) {
        this(vcVar, F0.g().v(), h2, e9Var, F0.g().i());
    }

    private void a() {
        boolean g2 = this.f5231e.g();
        this.f5227a.a(g2);
        this.f5229c.a(g2);
        this.f5228b.a(g2);
        this.f5230d.c();
    }

    public void b(Object obj) {
        this.f5227a.b(obj);
        this.f5228b.b();
    }

    public Vc(C0772vc vcVar, Xj xj, H2 h2, C0352e9 e9Var, C0653qc qcVar) {
        this.f5227a = vcVar;
        this.f5228b = xj;
        this.f5229c = h2;
        this.f5231e = e9Var;
        this.f5230d = qcVar;
        qcVar.a((C0579nc) xj);
        a();
    }

    public void a(Object obj) {
        this.f5227a.a(obj);
        this.f5228b.a();
    }

    public void a(boolean z) {
        this.f5227a.a(z);
        this.f5228b.a(z);
        this.f5229c.a(z);
        this.f5231e.d(z);
    }

    public void a(C0635pi piVar) {
        this.f5230d.a(piVar);
        this.f5229c.a(piVar);
        this.f5228b.a(piVar);
    }
}
