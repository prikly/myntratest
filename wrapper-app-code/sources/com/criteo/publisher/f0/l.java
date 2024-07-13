package com.criteo.publisher.f0;

import com.criteo.publisher.f0.l;
import com.criteo.publisher.f0.n;
import com.criteo.publisher.f0.r;
import com.criteo.publisher.i;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.q;
import com.criteo.publisher.model.s;
import com.criteo.publisher.model.t;
import com.criteo.publisher.x;
import java.io.InterruptedIOException;
import java.util.concurrent.Executor;

/* compiled from: CsmBidLifecycleListener */
public class l implements com.criteo.publisher.c0.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r f2465a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final x f2466b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i f2467c;

    /* renamed from: d  reason: collision with root package name */
    private final t f2468d;

    /* renamed from: e  reason: collision with root package name */
    private final com.criteo.publisher.l0.a f2469e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f2470f;

    public l(r rVar, x xVar, i iVar, t tVar, com.criteo.publisher.l0.a aVar, Executor executor) {
        this.f2465a = rVar;
        this.f2466b = xVar;
        this.f2467c = iVar;
        this.f2468d = tVar;
        this.f2469e = aVar;
        this.f2470f = executor;
    }

    public void a() {
        if (!b()) {
            this.f2470f.execute(new a());
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class a extends x {
        a() {
        }

        public void a() {
            l.this.f2466b.a(l.this.f2465a);
        }
    }

    public void a(o oVar) {
        if (!b()) {
            this.f2470f.execute(new b(oVar));
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class b extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f2472c;

        b(o oVar) {
            this.f2472c = oVar;
        }

        public void a() {
            long a2 = l.this.f2467c.a();
            l lVar = l.this;
            o oVar = this.f2472c;
            lVar.a(oVar, (r.a) new r.a(a2) {
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = r2;
                }

                public final void a(n.a aVar) {
                    l.b.a(o.this, this.f$1, aVar);
                }
            });
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void a(o oVar, long j, n.a aVar) {
            aVar.b(oVar.b());
            aVar.b(Long.valueOf(j));
            aVar.a(Integer.valueOf(oVar.c()));
        }
    }

    public void a(o oVar, com.criteo.publisher.model.r rVar) {
        if (!b()) {
            this.f2470f.execute(new c(oVar, rVar));
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class c extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f2474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.criteo.publisher.model.r f2475d;

        c(o oVar, com.criteo.publisher.model.r rVar) {
            this.f2474c = oVar;
            this.f2475d = rVar;
        }

        public void a() {
            long a2 = l.this.f2467c.a();
            for (q a3 : this.f2474c.f()) {
                String a4 = a3.a();
                s a5 = this.f2475d.a(a4);
                boolean z = a5 == null;
                boolean z2 = a5 != null && !a5.o();
                l.this.f2465a.a(a4, (r.a) new r.a(z, a2, z2, a5) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ s f$3;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r4;
                        this.f$3 = r5;
                    }

                    public final void a(n.a aVar) {
                        l.c.a(this.f$0, this.f$1, this.f$2, this.f$3, aVar);
                    }
                });
                if (z || z2) {
                    l.this.f2466b.a(l.this.f2465a, a4);
                }
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void a(boolean z, long j, boolean z2, s sVar, n.a aVar) {
            if (z) {
                aVar.a(Long.valueOf(j));
                aVar.c(true);
            } else if (z2) {
                aVar.c(true);
            } else {
                aVar.a(Long.valueOf(j));
                aVar.b(sVar.l());
            }
        }
    }

    public void a(o oVar, Exception exc) {
        if (!b()) {
            this.f2470f.execute(new d(exc, oVar));
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class d extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Exception f2477c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f2478d;

        d(Exception exc, o oVar) {
            this.f2477c = exc;
            this.f2478d = oVar;
        }

        public void a() {
            if (this.f2477c instanceof InterruptedIOException) {
                l.this.c(this.f2478d);
            } else {
                l.this.b(this.f2478d);
            }
            for (q a2 : this.f2478d.f()) {
                l.this.f2466b.a(l.this.f2465a, a2.a());
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(o oVar) {
        a(oVar, (r.a) $$Lambda$l$nQdlprxLcb16GX8Ipp8ilMgY.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void c(o oVar) {
        a(oVar, (r.a) $$Lambda$l$njMW6tLZ_RGqdkLKJ76alC27Gw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(n.a aVar) {
        aVar.b(true);
        aVar.c(true);
    }

    public void a(com.criteo.publisher.model.n nVar, s sVar) {
        if (!b()) {
            this.f2470f.execute(new e(sVar));
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class e extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f2480c;

        e(s sVar) {
            this.f2480c = sVar;
        }

        public void a() {
            String f2 = this.f2480c.f();
            if (f2 != null) {
                l.this.f2465a.a(f2, (r.a) new r.a(!this.f2480c.a(l.this.f2467c), l.this.f2467c.a()) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ long f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void a(n.a aVar) {
                        l.e.a(this.f$0, this.f$1, aVar);
                    }
                });
                l.this.f2466b.a(l.this.f2465a, f2);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void a(boolean z, long j, n.a aVar) {
            if (z) {
                aVar.c(Long.valueOf(j));
            }
            aVar.c(true);
        }
    }

    public void a(s sVar) {
        if (!b()) {
            this.f2470f.execute(new f(sVar));
        }
    }

    /* compiled from: CsmBidLifecycleListener */
    class f extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f2482c;

        f(s sVar) {
            this.f2482c = sVar;
        }

        public void a() {
            String f2 = this.f2482c.f();
            if (f2 != null && this.f2482c.o()) {
                l.this.f2465a.a(f2, (r.a) $$Lambda$l$f$gQAJyVH5SqLWjF0HwAyc0LByDjw.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(o oVar, r.a aVar) {
        for (q a2 : oVar.f()) {
            this.f2465a.a(a2.a(), aVar);
        }
    }

    private boolean b() {
        return !this.f2468d.g() || !this.f2469e.b();
    }
}
