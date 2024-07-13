package com.criteo.publisher.l0.d;

import com.criteo.publisher.n0.q;

/* compiled from: TcfStrategyResolver */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final q f2616a;

    public h(q qVar) {
        this.f2616a = qVar;
    }

    /* access modifiers changed from: package-private */
    public g a() {
        f fVar = new f(this.f2616a);
        if (fVar.d()) {
            return fVar;
        }
        e eVar = new e(this.f2616a);
        if (eVar.d()) {
            return eVar;
        }
        return null;
    }
}
