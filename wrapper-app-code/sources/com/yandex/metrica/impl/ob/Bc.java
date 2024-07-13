package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.H0;
import java.util.Arrays;
import java.util.List;

public class Bc implements J0 {

    /* renamed from: a  reason: collision with root package name */
    private Pc f3756a;

    /* renamed from: b  reason: collision with root package name */
    private Cc f3757b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Ec<?>> f3758c;

    /* renamed from: d  reason: collision with root package name */
    private final C0629pc<Xb> f3759d;

    /* renamed from: e  reason: collision with root package name */
    private final C0629pc<Xb> f3760e;

    /* renamed from: f  reason: collision with root package name */
    private final C0629pc<Xb> f3761f;

    /* renamed from: g  reason: collision with root package name */
    private final C0629pc<C0305cc> f3762g;

    /* renamed from: h  reason: collision with root package name */
    private final H0 f3763h;
    private boolean i;

    public Bc(Cc cc, Pc pc) {
        this(cc, pc, F0.g().s());
    }

    public void a() {
        if (this.i) {
            for (Ec<?> c2 : this.f3758c) {
                c2.c();
            }
        }
    }

    public Location b() {
        if (this.i) {
            return this.f3756a.a();
        }
        return null;
    }

    public void c() {
        if (this.i) {
            this.f3763h.c();
            for (Ec<?> a2 : this.f3758c) {
                a2.a();
            }
        }
    }

    public void d() {
        this.f3763h.d();
        for (Ec<?> b2 : this.f3758c) {
            b2.b();
        }
    }

    private Bc(Cc cc, Pc pc, C0352e9 e9Var) {
        this(cc, pc, new C0380fc(cc, e9Var), new C0504kc(cc, e9Var), new Lc(cc), new C0355ec(cc, e9Var, pc), new H0.c());
    }

    Bc(Cc cc, Pc pc, Pb pb, Pb pb2, Lc lc, C0355ec ecVar, H0.c cVar) {
        Xb xb;
        Xb xb2;
        Xb xb3;
        this.f3757b = cc;
        C0554mc mcVar = cc.f3819c;
        C0305cc ccVar = null;
        if (mcVar != null) {
            this.i = mcVar.f6216g;
            Xb xb4 = mcVar.n;
            xb3 = mcVar.o;
            xb2 = mcVar.p;
            Xb xb5 = xb4;
            ccVar = mcVar.q;
            xb = xb5;
        } else {
            xb = null;
            xb3 = null;
            xb2 = null;
        }
        this.f3756a = pc;
        Ec<Xb> a2 = pb.a(pc, xb3);
        Ec<Xb> a3 = pb2.a(pc, xb);
        Ec<Xb> a4 = lc.a(pc, xb2);
        Ec<C0305cc> a5 = ecVar.a(ccVar);
        this.f3758c = Arrays.asList(new Ec[]{a2, a3, a4, a5});
        this.f3759d = a3;
        this.f3760e = a2;
        this.f3761f = a4;
        this.f3762g = a5;
        H0 a6 = cVar.a(this.f3757b.f3817a.f4925b, this, this.f3756a.b());
        this.f3763h = a6;
        this.f3756a.b().a(a6);
    }

    public void a(C0635pi piVar) {
        this.f3756a.a(piVar);
    }

    public void a(C0554mc mcVar) {
        this.i = mcVar != null && mcVar.f6216g;
        this.f3756a.a(mcVar);
        C0305cc ccVar = null;
        ((Ec) this.f3759d).a(mcVar == null ? null : mcVar.n);
        ((Ec) this.f3760e).a(mcVar == null ? null : mcVar.o);
        ((Ec) this.f3761f).a(mcVar == null ? null : mcVar.p);
        C0629pc<C0305cc> pcVar = this.f3762g;
        if (mcVar != null) {
            ccVar = mcVar.q;
        }
        ((Ec) pcVar).a(ccVar);
        a();
    }
}
