package com.criteo.publisher.f0;

import com.criteo.publisher.k0.g;
import com.criteo.publisher.model.t;
import java.util.concurrent.Executor;

/* compiled from: MetricSendingQueueConsumer */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final u f2499a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2500b;

    /* renamed from: c  reason: collision with root package name */
    private final com.criteo.publisher.n0.g f2501c;

    /* renamed from: d  reason: collision with root package name */
    private final t f2502d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2503e;

    public w(u uVar, g gVar, com.criteo.publisher.n0.g gVar2, t tVar, Executor executor) {
        this.f2499a = uVar;
        this.f2500b = gVar;
        this.f2501c = gVar2;
        this.f2502d = tVar;
        this.f2503e = executor;
    }

    public void a() {
        if (this.f2502d.g()) {
            this.f2503e.execute(new y(this.f2499a, this.f2500b, this.f2501c));
        }
    }
}
