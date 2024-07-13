package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.adcolony.sdk.z0;
import java.util.Date;

class z {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10418a = true;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f10419b = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Runnable f10420c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f10421d;

    class a implements Runnable {
        a() {
        }

        public void run() {
            new h0("AdColony.heartbeat", 1).c();
            z.this.c();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.c f10423a;

        b(z0.c cVar) {
            this.f10423a = cVar;
        }

        public void run() {
            Runnable unused = z.this.f10420c = null;
            if (a.d()) {
                k b2 = a.b();
                if (this.f10423a.a() && b2.I()) {
                    b2.a();
                    e0.a a2 = new e0.a().a("Controller heartbeat timeout occurred. ");
                    e0.a a3 = a2.a("Timeout set to: " + this.f10423a.b() + " ms. ");
                    a3.a("Interval set to: " + b2.h() + " ms. ").a("Heartbeat last reply: ").a((Object) z.this.f10421d).a(e0.i);
                    z.this.a();
                } else if (b2.F()) {
                    z.this.a();
                } else {
                    z0.a(z.this.f10419b, b2.h());
                }
            }
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f10425a;

        /* synthetic */ c(f1 f1Var, a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f10425a.toString();
        }

        private c(f1 f1Var) {
            f1 m = f1Var != null ? f1Var.m("payload") : c0.b();
            this.f10425a = m;
            c0.a(m, "heartbeatLastTimestamp", f0.f10051e.format(new Date()));
        }
    }

    z() {
    }

    /* access modifiers changed from: private */
    public void c() {
        if (a.d()) {
            z0.c cVar = new z0.c(a.b().i());
            b bVar = new b(cVar);
            this.f10420c = bVar;
            z0.a((Runnable) bVar, cVar.d());
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a();
        this.f10418a = false;
        z0.a(this.f10419b, a.b().h());
    }

    /* access modifiers changed from: private */
    public void a() {
        this.f10418a = true;
        z0.c(this.f10419b);
        z0.c(this.f10420c);
        this.f10420c = null;
    }

    /* access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        if (a.d() && !this.f10418a) {
            this.f10421d = new c(h0Var.a(), (a) null);
            Runnable runnable = this.f10420c;
            if (runnable != null) {
                z0.c(runnable);
                z0.b(this.f10420c);
                return;
            }
            z0.c(this.f10419b);
            z0.a(this.f10419b, a.b().h());
        }
    }
}
