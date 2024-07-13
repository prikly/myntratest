package com.criteo.publisher.c0;

import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.logging.n;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.s;

/* compiled from: LoggingBidLifecycleListener */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g f2364a = h.b(c.class);

    /* renamed from: b  reason: collision with root package name */
    private final n f2365b;

    public c(n nVar) {
        this.f2365b = nVar;
    }

    public void a() {
        this.f2364a.a("onSdkInitialized", new Object[0]);
        this.f2365b.a();
    }

    public void a(o oVar) {
        this.f2364a.a("onCdbCallStarted: %s", oVar);
    }

    public void a(o oVar, r rVar) {
        this.f2364a.a("onCdbCallFinished: %s", rVar);
    }

    public void a(o oVar, Exception exc) {
        this.f2364a.a("onCdbCallFailed", (Throwable) exc);
    }

    public void a(com.criteo.publisher.model.n nVar, s sVar) {
        this.f2364a.a("onBidConsumed: %s", sVar);
    }

    public void a(s sVar) {
        this.f2364a.a("onBidCached: %s", sVar);
    }
}
