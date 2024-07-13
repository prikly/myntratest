package com.criteo.publisher.f0;

import com.criteo.publisher.f0.r;
import com.criteo.publisher.n0.g;
import java.util.Collection;

/* compiled from: BoundedMetricRepository */
class i extends r {

    /* renamed from: a  reason: collision with root package name */
    private final r f2460a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2461b;

    i(r rVar, g gVar) {
        this.f2460a = rVar;
        this.f2461b = gVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, r.a aVar) {
        if (b() < this.f2461b.l() || a(str)) {
            this.f2460a.a(str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, p pVar) {
        this.f2460a.a(str, pVar);
    }

    /* access modifiers changed from: package-private */
    public Collection<n> a() {
        return this.f2460a.a();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f2460a.b();
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.f2460a.a(str);
    }
}
