package com.criteo.publisher.k0;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.h;
import com.criteo.publisher.i;
import com.criteo.publisher.model.n;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.p;
import com.criteo.publisher.model.r;
import com.criteo.publisher.model.s;
import com.criteo.publisher.x;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: CdbCall */
class c extends x {

    /* renamed from: c  reason: collision with root package name */
    private final g f2575c;

    /* renamed from: d  reason: collision with root package name */
    private final p f2576d;

    /* renamed from: e  reason: collision with root package name */
    private final i f2577e;

    /* renamed from: f  reason: collision with root package name */
    private final List<n> f2578f;

    /* renamed from: g  reason: collision with root package name */
    private final ContextData f2579g;

    /* renamed from: h  reason: collision with root package name */
    private final h f2580h;

    c(g gVar, p pVar, i iVar, List<n> list, ContextData contextData, h hVar) {
        this.f2575c = gVar;
        this.f2576d = pVar;
        this.f2577e = iVar;
        this.f2578f = list;
        this.f2579g = contextData;
        this.f2580h = hVar;
    }

    public void a() throws ExecutionException, InterruptedException {
        o a2 = this.f2576d.a(this.f2578f, this.f2579g);
        String str = this.f2576d.a().get();
        this.f2580h.a(a2);
        try {
            r a3 = this.f2575c.a(a2, str);
            a(a3);
            this.f2580h.a(a2, a3);
        } catch (Exception e2) {
            this.f2580h.a(a2, e2);
        }
    }

    private void a(r rVar) {
        long a2 = this.f2577e.a();
        for (s a3 : rVar.b()) {
            a3.a(a2);
        }
    }
}
