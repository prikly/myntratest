package com.criteo.publisher.f0;

import java.util.List;

/* compiled from: BoundedSendingQueue */
class j<T> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k<T> f2462a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2463b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final a0<T> f2464c;

    j(k<T> kVar, a0<T> a0Var) {
        this.f2462a = kVar;
        this.f2464c = a0Var;
    }

    public boolean a(T t) {
        boolean a2;
        synchronized (this.f2463b) {
            if (a() >= this.f2464c.c()) {
                this.f2462a.a(1);
            }
            a2 = this.f2462a.a(t);
        }
        return a2;
    }

    public List<T> a(int i) {
        List<T> a2;
        synchronized (this.f2463b) {
            a2 = this.f2462a.a(i);
        }
        return a2;
    }

    public int a() {
        return this.f2462a.a();
    }
}
