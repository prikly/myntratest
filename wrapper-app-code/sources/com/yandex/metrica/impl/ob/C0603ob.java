package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.ob  reason: case insensitive filesystem */
public class C0603ob {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0553mb> f6392a;

    /* renamed from: b  reason: collision with root package name */
    private final C0628pb f6393b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6394c = new AtomicBoolean(true);

    public C0603ob(List<C0553mb> list, C0628pb pbVar) {
        this.f6392a = list;
        this.f6393b = pbVar;
    }

    public void a() {
        this.f6394c.set(false);
    }

    public void b() {
        this.f6394c.set(true);
    }

    public void c() {
        if (!this.f6394c.get()) {
            return;
        }
        if (this.f6392a.isEmpty()) {
            ((L3) this.f6393b).c();
            return;
        }
        boolean z = false;
        for (C0553mb a2 : this.f6392a) {
            z |= a2.a();
        }
        if (z) {
            ((L3) this.f6393b).c();
        }
    }
}
