package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C0635pi;
import com.yandex.metrica.impl.ob.C0783w;
import com.yandex.metrica.impl.ob.E;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.qc  reason: case insensitive filesystem */
public class C0653qc implements E.c, C0783w.b {

    /* renamed from: a  reason: collision with root package name */
    private List<C0604oc> f6557a;

    /* renamed from: b  reason: collision with root package name */
    private final E f6558b;

    /* renamed from: c  reason: collision with root package name */
    private final C0772vc f6559c;

    /* renamed from: d  reason: collision with root package name */
    private final C0783w f6560d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C0554mc f6561e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<C0579nc> f6562f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f6563g;

    public C0653qc(Context context) {
        this(F0.g().c(), C0772vc.a(context), new C0635pi.b(context), F0.g().b());
    }

    private void d() {
        C0554mc a2 = a();
        if (!A2.a((Object) this.f6561e, (Object) a2)) {
            this.f6559c.a(a2);
            this.f6561e = a2;
            C0554mc mcVar = this.f6561e;
            for (C0579nc a3 : this.f6562f) {
                a3.a(mcVar);
            }
        }
    }

    public synchronized void a(C0579nc ncVar) {
        this.f6562f.add(ncVar);
    }

    public void b() {
        synchronized (this.f6563g) {
            this.f6558b.a((E.c) this);
            this.f6560d.a((C0783w.b) this);
        }
    }

    public synchronized void c() {
        d();
    }

    public synchronized void a(C0635pi piVar) {
        this.f6557a = piVar.w();
        this.f6561e = a();
        this.f6559c.a(piVar, this.f6561e);
        C0554mc mcVar = this.f6561e;
        for (C0579nc a2 : this.f6562f) {
            a2.a(mcVar);
        }
    }

    C0653qc(E e2, C0772vc vcVar, C0635pi.b bVar, C0783w wVar) {
        this.f6562f = new HashSet();
        this.f6563g = new Object();
        this.f6558b = e2;
        this.f6559c = vcVar;
        this.f6560d = wVar;
        this.f6557a = bVar.a().w();
    }

    public synchronized void a(C0783w.a aVar) {
        d();
    }

    public synchronized void a(E.b.a aVar) {
        d();
    }

    private C0554mc a() {
        C0783w.a c2 = this.f6560d.c();
        E.b.a b2 = this.f6558b.b();
        for (C0604oc next : this.f6557a) {
            if (next.f6396b.f3699a.contains(b2) && next.f6396b.f3700b.contains(c2)) {
                return next.f6395a;
            }
        }
        return null;
    }
}
