package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.f0.w;
import com.criteo.publisher.k0.b;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.logging.n;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.s;
import com.criteo.publisher.model.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: BidManager */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final g f2386a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final com.criteo.publisher.d0.a f2387b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2388c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f2389d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private final t f2390e;

    /* renamed from: f  reason: collision with root package name */
    private final i f2391f;

    /* renamed from: g  reason: collision with root package name */
    private final com.criteo.publisher.model.g f2392g;

    /* renamed from: h  reason: collision with root package name */
    private final b f2393h;
    private final com.criteo.publisher.k0.e i;
    /* access modifiers changed from: private */
    public final com.criteo.publisher.c0.a j;
    private final w k;
    private final n l;
    /* access modifiers changed from: private */
    public final com.criteo.publisher.l0.a m;

    e(com.criteo.publisher.d0.a aVar, t tVar, i iVar, com.criteo.publisher.model.g gVar, b bVar, com.criteo.publisher.k0.e eVar, com.criteo.publisher.c0.a aVar2, w wVar, n nVar, com.criteo.publisher.l0.a aVar3) {
        this.f2387b = aVar;
        this.f2390e = tVar;
        this.f2391f = iVar;
        this.f2392g = gVar;
        this.f2393h = bVar;
        this.i = eVar;
        this.j = aVar2;
        this.k = wVar;
        this.l = nVar;
        this.m = aVar3;
    }

    public void a(AdUnit adUnit, ContextData contextData, d dVar) {
        if (adUnit == null) {
            dVar.a();
        } else if (this.f2390e.i()) {
            b(adUnit, contextData, dVar);
        } else {
            s a2 = a(adUnit, contextData);
            if (a2 != null) {
                dVar.a(a2);
            } else {
                dVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public s a(AdUnit adUnit, ContextData contextData) {
        com.criteo.publisher.model.n a2;
        s a3;
        if (b() || (a2 = a(adUnit)) == null) {
            return null;
        }
        synchronized (this.f2388c) {
            if (!c(a2)) {
                a(a2, contextData);
            }
            a3 = a(a2);
        }
        return a3;
    }

    private boolean c(com.criteo.publisher.model.n nVar) {
        boolean c2;
        if (a()) {
            return true;
        }
        synchronized (this.f2388c) {
            c2 = c(this.f2387b.a(nVar));
        }
        return c2;
    }

    private void b(com.criteo.publisher.model.n nVar) {
        synchronized (this.f2388c) {
            s a2 = this.f2387b.a(nVar);
            if (a2 != null && b(a2)) {
                this.f2387b.b(nVar);
                this.j.a(nVar, a2);
            }
        }
    }

    private s a(com.criteo.publisher.model.n nVar) {
        synchronized (this.f2388c) {
            s a2 = this.f2387b.a(nVar);
            if (a2 != null) {
                boolean c2 = c(a2);
                boolean b2 = b(a2);
                if (!c2) {
                    this.f2387b.b(nVar);
                    this.j.a(nVar, a2);
                }
                if (!c2 && !b2) {
                    return a2;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.criteo.publisher.model.n nVar, d dVar) {
        s a2 = a(nVar);
        if (a2 != null) {
            dVar.a(a2);
        } else {
            dVar.a();
        }
    }

    private void a(com.criteo.publisher.model.n nVar, ContextData contextData) {
        a((List<com.criteo.publisher.model.n>) Collections.singletonList(nVar), contextData);
    }

    /* access modifiers changed from: package-private */
    public void b(AdUnit adUnit, ContextData contextData, d dVar) {
        if (b()) {
            dVar.a();
            return;
        }
        com.criteo.publisher.model.n a2 = a(adUnit);
        if (a2 == null) {
            dVar.a();
            return;
        }
        synchronized (this.f2388c) {
            b(a2);
            if (c(a2)) {
                a(a2, dVar);
            } else {
                this.i.a(a2, contextData, new w(dVar, this.j, this, a2, this.m));
            }
            this.k.a();
            this.l.a();
        }
    }

    private void a(List<com.criteo.publisher.model.n> list, ContextData contextData) {
        if (!b()) {
            this.f2393h.b(list, contextData, new a());
            this.k.a();
            this.l.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List<s> list) {
        synchronized (this.f2388c) {
            for (s next : list) {
                if (!c(this.f2387b.a(this.f2387b.b(next)))) {
                    if (next.o()) {
                        if (a(next) > 0.0d && next.j() == 0) {
                            next.a(900);
                        }
                        this.f2387b.a(next);
                        this.j.a(next);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public com.criteo.publisher.model.n a(AdUnit adUnit) {
        return this.f2392g.b(adUnit);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (i2 > 0) {
            this.f2386a.a(f.a(i2));
            this.f2389d.set(this.f2391f.a() + ((long) (i2 * 1000)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(s sVar) {
        if (sVar == null) {
            return false;
        }
        if (!(sVar.j() > 0 && a(sVar) == 0.0d) || b(sVar)) {
            return false;
        }
        return true;
    }

    private boolean b(s sVar) {
        return sVar.a(this.f2391f);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f2389d.get() > this.f2391f.a();
    }

    public void c() {
        this.f2393h.a();
    }

    public void a(List<AdUnit> list) {
        this.f2393h.a(this.f2390e);
        if (this.f2390e.j()) {
            for (List<com.criteo.publisher.model.n> a2 : this.f2392g.a(list)) {
                a(a2, new ContextData());
            }
        }
    }

    private boolean b() {
        return this.f2390e.h();
    }

    private double a(s sVar) {
        if (sVar.b() == null) {
            return 0.0d;
        }
        return sVar.b().doubleValue();
    }

    /* compiled from: BidManager */
    private class a extends h {
        public a() {
            super(e.this.j, e.this, e.this.m);
        }

        public void a(o oVar, r rVar) {
            e.this.b(rVar.b());
            super.a(oVar, rVar);
        }
    }
}
