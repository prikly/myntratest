package com.criteo.publisher.c0;

import com.criteo.publisher.model.n;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositeBidLifecycleListener */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f2363a = new ArrayList();

    public void a(a aVar) {
        this.f2363a.add(aVar);
    }

    public void a() {
        for (a a2 : this.f2363a) {
            a2.a();
        }
    }

    public void a(o oVar) {
        for (a a2 : this.f2363a) {
            a2.a(oVar);
        }
    }

    public void a(o oVar, r rVar) {
        for (a a2 : this.f2363a) {
            a2.a(oVar, rVar);
        }
    }

    public void a(o oVar, Exception exc) {
        for (a a2 : this.f2363a) {
            a2.a(oVar, exc);
        }
    }

    public void a(n nVar, s sVar) {
        for (a a2 : this.f2363a) {
            a2.a(nVar, sVar);
        }
    }

    public void a(s sVar) {
        for (a a2 : this.f2363a) {
            a2.a(sVar);
        }
    }
}
