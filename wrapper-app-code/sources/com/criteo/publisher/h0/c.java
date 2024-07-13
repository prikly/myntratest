package com.criteo.publisher.h0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.s;
import java.util.List;

/* compiled from: HeaderBidding */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final g f2531a = h.b(c.class);

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f2532b;

    /* renamed from: c  reason: collision with root package name */
    private final com.criteo.publisher.i0.c f2533c;

    public c(List<d> list, com.criteo.publisher.i0.c cVar) {
        this.f2532b = list;
        this.f2533c = cVar;
    }

    public void a(Object obj, Bid bid) {
        s sVar;
        this.f2531a.a(a.a(bid));
        if (obj != null) {
            for (d next : this.f2532b) {
                if (next.b(obj)) {
                    this.f2533c.a(next.a());
                    if (bid == null) {
                        sVar = null;
                    } else {
                        sVar = bid.b();
                    }
                    next.a(obj);
                    if (sVar == null) {
                        this.f2531a.a(a.a(next.a()));
                        return;
                    } else {
                        next.a(obj, bid.c(), sVar);
                        return;
                    }
                }
            }
        }
        this.f2531a.a(a.a(obj));
    }
}
