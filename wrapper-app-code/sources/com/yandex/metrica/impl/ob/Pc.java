package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.HashMap;
import java.util.Map;

class Pc {

    /* renamed from: a  reason: collision with root package name */
    private c f4760a;

    /* renamed from: b  reason: collision with root package name */
    private a f4761b;

    /* renamed from: c  reason: collision with root package name */
    private b f4762c;

    /* renamed from: d  reason: collision with root package name */
    private Context f4763d;

    /* renamed from: e  reason: collision with root package name */
    private C0554mc f4764e;

    /* renamed from: f  reason: collision with root package name */
    private Rc f4765f;

    /* renamed from: g  reason: collision with root package name */
    private Sc f4766g;

    /* renamed from: h  reason: collision with root package name */
    private Rb f4767h;
    private final C0820xc i;
    private Yb j;
    private Map<String, C0844yc> k;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public Pc(Context context, C0554mc mcVar, Sc sc, Rb rb, Ph ph) {
        this(context, mcVar, new c(), new C0820xc(ph), new a(), new b(), sc, rb);
    }

    public void a(Location location) {
        String provider = location.getProvider();
        C0844yc ycVar = this.k.get(provider);
        if (ycVar == null) {
            if (this.f4765f == null) {
                c cVar = this.f4760a;
                Context context = this.f4763d;
                cVar.getClass();
                this.f4765f = new Rc((V<Location>) null, C0477ja.a(context).f(), new Vb(context), new SystemTimeProvider(), F0.g().c(), F0.g().b());
            }
            if (this.j == null) {
                a aVar = this.f4761b;
                Rc rc = this.f4765f;
                C0820xc xcVar = this.i;
                aVar.getClass();
                this.j = new Yb(rc, xcVar);
            }
            b bVar = this.f4762c;
            C0554mc mcVar = this.f4764e;
            Yb yb = this.j;
            Sc sc = this.f4766g;
            Rb rb = this.f4767h;
            bVar.getClass();
            ycVar = new C0844yc(mcVar, yb, (Location) null, 0, new C0810x2(), sc, rb);
            this.k.put(provider, ycVar);
        } else {
            ycVar.a(this.f4764e);
        }
        ycVar.a(location);
    }

    public C0820xc b() {
        return this.i;
    }

    Pc(Context context, C0554mc mcVar, c cVar, C0820xc xcVar, a aVar, b bVar, Sc sc, Rb rb) {
        this.k = new HashMap();
        this.f4763d = context;
        this.f4764e = mcVar;
        this.f4760a = cVar;
        this.i = xcVar;
        this.f4761b = aVar;
        this.f4762c = bVar;
        this.f4766g = sc;
        this.f4767h = rb;
    }

    public Location a() {
        return (Location) this.i.a();
    }

    public void a(C0554mc mcVar) {
        this.f4764e = mcVar;
    }

    public void a(C0635pi piVar) {
        if (piVar.d() != null) {
            this.i.c(piVar.d());
        }
    }
}
