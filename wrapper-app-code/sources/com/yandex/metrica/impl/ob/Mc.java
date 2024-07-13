package com.yandex.metrica.impl.ob;

import android.location.Location;

class Mc {

    /* renamed from: a  reason: collision with root package name */
    private final Bc f4547a;

    /* renamed from: b  reason: collision with root package name */
    private final C0430hc f4548b;

    /* renamed from: c  reason: collision with root package name */
    private final Sc f4549c;

    /* renamed from: d  reason: collision with root package name */
    private final Rb f4550d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Mc(com.yandex.metrica.impl.ob.Nc r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Oc r0 = new com.yandex.metrica.impl.ob.Oc
            com.yandex.metrica.impl.ob.Sb r1 = r10.f4601a
            android.content.Context r1 = r1.f4924a
            r0.<init>(r1)
            com.yandex.metrica.impl.ob.Sc r1 = new com.yandex.metrica.impl.ob.Sc
            com.yandex.metrica.impl.ob.Sb r2 = r10.f4601a
            android.content.Context r3 = r2.f4924a
            com.yandex.metrica.impl.ob.pi r4 = r10.f4602b
            com.yandex.metrica.impl.ob.mc r5 = r10.f4603c
            com.yandex.metrica.impl.ob.U7 r6 = r10.f4604d
            com.yandex.metrica.impl.ob.T7 r7 = r10.f4605e
            com.yandex.metrica.core.api.executors.IHandlerExecutor r8 = r2.f4925b
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.yandex.metrica.impl.ob.Rb r2 = new com.yandex.metrica.impl.ob.Rb
            com.yandex.metrica.impl.ob.mc r3 = r10.f4603c
            com.yandex.metrica.impl.ob.U7 r4 = r10.f4604d
            com.yandex.metrica.impl.ob.T7 r5 = r10.f4605e
            r2.<init>(r3, r4, r5)
            r9.<init>(r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Mc.<init>(com.yandex.metrica.impl.ob.Nc):void");
    }

    public void a() {
        this.f4549c.a();
    }

    public Location b() {
        return this.f4547a.b();
    }

    public void c() {
        this.f4547a.a();
        this.f4548b.b();
    }

    public void d() {
        this.f4547a.c();
        this.f4548b.d();
    }

    public void e() {
        this.f4547a.d();
        this.f4548b.e();
    }

    private Mc(Nc nc, Oc oc, Sc sc, Rb rb) {
        this(nc, oc, Cc.a(nc, sc, rb, oc.a()), sc, rb);
    }

    public void a(C0635pi piVar) {
        this.f4549c.a(piVar);
        this.f4547a.a(piVar);
    }

    public void a(C0554mc mcVar) {
        this.f4549c.a(mcVar);
        this.f4550d.a(mcVar);
        this.f4547a.a(mcVar);
        this.f4548b.a(mcVar);
    }

    private Mc(Nc nc, Oc oc, Cc cc, Sc sc, Rb rb) {
        this(nc, oc, cc, new Pc(nc.f4601a.f4924a, nc.f4603c, sc, rb, nc.f4602b.d()), sc, rb);
    }

    private Mc(Nc nc, Oc oc, Cc cc, Pc pc, Sc sc, Rb rb) {
        this(nc, new Bc(cc, pc), new C0430hc(C0455ic.a(nc, sc, rb, oc.c(), oc.b())), sc, rb);
    }

    Mc(Nc nc, Bc bc, C0430hc hcVar, Sc sc, Rb rb) {
        this.f4547a = bc;
        this.f4548b = hcVar;
        this.f4549c = sc;
        this.f4550d = rb;
    }
}
