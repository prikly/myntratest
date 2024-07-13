package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.qb  reason: case insensitive filesystem */
public class C0652qb implements C0553mb, C0578nb {

    /* renamed from: a  reason: collision with root package name */
    private final Z3 f6555a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicLong f6556b;

    public C0652qb(L7 l7, Z3 z3) {
        this.f6555a = z3;
        this.f6556b = new AtomicLong(l7.c());
        l7.a((C0578nb) this);
    }

    public boolean a() {
        return this.f6556b.get() >= ((long) ((Lg) this.f6555a.b()).I());
    }

    public void b(List<Integer> list) {
        this.f6556b.addAndGet((long) (-list.size()));
    }

    public void a(List<Integer> list) {
        this.f6556b.addAndGet((long) list.size());
    }
}
