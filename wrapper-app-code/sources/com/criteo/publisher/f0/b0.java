package com.criteo.publisher.f0;

import com.criteo.publisher.s;

/* compiled from: SendingQueueFactory */
public class b0<T> implements s.a<k<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final z<T> f2418a;

    /* renamed from: b  reason: collision with root package name */
    private final a0<T> f2419b;

    public b0(z<T> zVar, a0<T> a0Var) {
        this.f2418a = zVar;
        this.f2419b = a0Var;
    }

    /* renamed from: b */
    public k<T> a() {
        return new j(new e0(this.f2418a, this.f2419b), this.f2419b);
    }
}
