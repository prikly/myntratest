package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0704sg;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ug  reason: case insensitive filesystem */
public class C0752ug implements C0704sg.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C0309cg> f6913a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6914b;

    /* renamed from: c  reason: collision with root package name */
    private C0334dg f6915c;

    public C0752ug() {
        this(F0.g().m());
    }

    public synchronized void a(C0334dg dgVar) {
        this.f6915c = dgVar;
        this.f6914b = true;
        for (C0309cg a2 : this.f6913a) {
            a2.a(this.f6915c);
        }
        this.f6913a.clear();
    }

    C0752ug(C0704sg sgVar) {
        this.f6913a = new HashSet();
        sgVar.a((C0728tg) new C0848yg(this));
        sgVar.b();
    }

    public synchronized void a(C0309cg cgVar) {
        this.f6913a.add(cgVar);
        if (this.f6914b) {
            cgVar.a(this.f6915c);
            this.f6913a.remove(cgVar);
        }
    }
}
