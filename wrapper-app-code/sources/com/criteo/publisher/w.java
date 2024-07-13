package com.criteo.publisher;

import com.criteo.publisher.c0.a;
import com.criteo.publisher.model.n;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LiveCdbCallListener */
public class w extends h {

    /* renamed from: d  reason: collision with root package name */
    private d f2920d;

    /* renamed from: e  reason: collision with root package name */
    private final e f2921e;

    /* renamed from: f  reason: collision with root package name */
    private final n f2922f;

    /* renamed from: g  reason: collision with root package name */
    private final a f2923g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f2924h = new AtomicBoolean(false);

    public w(d dVar, a aVar, e eVar, n nVar, com.criteo.publisher.l0.a aVar2) {
        super(aVar, eVar, aVar2);
        this.f2920d = dVar;
        this.f2923g = aVar;
        this.f2921e = eVar;
        this.f2922f = nVar;
    }

    public void a(o oVar, r rVar) {
        super.a(oVar, rVar);
        if (rVar.b().size() > 1) {
            com.criteo.publisher.n0.o.a((Throwable) new IllegalStateException("During a live request, only one bid will be fetched at a time."));
        }
        if (this.f2924h.compareAndSet(false, true)) {
            if (rVar.b().size() == 1) {
                a(rVar.b().get(0));
            } else {
                this.f2920d.a();
            }
            this.f2920d = null;
            return;
        }
        this.f2921e.b(rVar.b());
    }

    private void a(s sVar) {
        if (this.f2921e.c(sVar)) {
            this.f2921e.b((List<s>) Collections.singletonList(sVar));
            this.f2920d.a();
        } else if (sVar.o()) {
            this.f2920d.a(sVar);
            this.f2923g.a(this.f2922f, sVar);
        } else {
            this.f2920d.a();
        }
    }

    public void a(o oVar, Exception exc) {
        super.a(oVar, exc);
        a();
    }

    public void a() {
        if (this.f2924h.compareAndSet(false, true)) {
            this.f2921e.a(this.f2922f, this.f2920d);
            this.f2920d = null;
        }
    }
}
