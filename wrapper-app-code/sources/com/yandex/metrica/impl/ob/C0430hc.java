package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0604oc;
import com.yandex.metrica.impl.ob.H0;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.hc  reason: case insensitive filesystem */
public class C0430hc {

    /* renamed from: a  reason: collision with root package name */
    private final C0455ic f5909a;

    /* renamed from: b  reason: collision with root package name */
    private final C0479jc f5910b;

    /* renamed from: c  reason: collision with root package name */
    private final SystemTimeProvider f5911c;

    /* renamed from: d  reason: collision with root package name */
    private C0554mc f5912d;

    /* renamed from: e  reason: collision with root package name */
    private final E f5913e;

    /* renamed from: f  reason: collision with root package name */
    private final H2 f5914f;

    /* renamed from: g  reason: collision with root package name */
    private final Xc f5915g;

    /* renamed from: h  reason: collision with root package name */
    private final C0783w f5916h;
    private boolean i;
    private final Runnable j;

    /* renamed from: com.yandex.metrica.impl.ob.hc$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0430hc.this.b();
            C0430hc.this.c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.hc$b */
    class b implements C0779vj {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0529lc f5918a;

        b(C0430hc hcVar, C0529lc lcVar) {
            this.f5918a = lcVar;
        }

        public void a(Collection<C0755uj> collection) {
            this.f5918a.a(Tl.a(collection));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0430hc(com.yandex.metrica.impl.ob.C0455ic r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Xc r0 = new com.yandex.metrica.impl.ob.Xc
            com.yandex.metrica.impl.ob.Sb r1 = r4.f5981a
            android.content.Context r1 = r1.f4924a
            com.yandex.metrica.impl.ob.mc r2 = r4.f5985e
            if (r2 != 0) goto L_0x000c
            r2 = 0
            goto L_0x000e
        L_0x000c:
            com.yandex.metrica.impl.ob.Xb r2 = r2.m
        L_0x000e:
            r0.<init>((android.content.Context) r1, (com.yandex.metrica.impl.ob.Xb) r2)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0430hc.<init>(com.yandex.metrica.impl.ob.ic):void");
    }

    /* access modifiers changed from: private */
    public void c() {
        C0554mc mcVar = this.f5912d;
        if (mcVar != null) {
            long j2 = mcVar.f6217h;
            if (j2 > 0) {
                this.f5909a.f5981a.f4925b.executeDelayed(this.j, j2);
            }
        }
    }

    public void b() {
        C0529lc lcVar = new C0529lc();
        lcVar.b(this.f5911c.currentTimeMillis());
        lcVar.a(this.f5911c.elapsedRealtime());
        this.f5915g.b();
        lcVar.b(F2.a((Collection) this.f5914f.a().a()));
        this.f5909a.f5982b.a((C0779vj) new b(this, lcVar));
        lcVar.a(this.f5913e.b());
        lcVar.a(C0604oc.a.a(this.f5916h.c()));
        this.f5910b.a(lcVar);
        this.f5909a.f5983c.a();
        this.f5909a.f5984d.a();
    }

    public void d() {
        a();
    }

    public void e() {
        this.f5909a.f5981a.f4925b.remove(this.j);
    }

    private void a() {
        C0554mc mcVar = this.f5912d;
        boolean z = mcVar != null && mcVar.i;
        if (this.i != z) {
            this.i = z;
            if (z) {
                c();
            } else {
                this.f5909a.f5981a.f4925b.remove(this.j);
            }
        }
    }

    private C0430hc(C0455ic icVar, Xc xc) {
        this(icVar, new C0479jc(icVar.f5981a.f4924a), new SystemTimeProvider(), F0.g().c(), F0.g().b(), H2.a(icVar.f5981a.f4924a), xc, new H0.c());
    }

    C0430hc(C0455ic icVar, C0479jc jcVar, SystemTimeProvider systemTimeProvider, E e2, C0783w wVar, H2 h2, Xc xc, H0.c cVar) {
        this.j = new a();
        this.f5909a = icVar;
        this.f5910b = jcVar;
        this.f5911c = systemTimeProvider;
        this.f5912d = icVar.f5985e;
        this.f5913e = e2;
        this.f5916h = wVar;
        this.f5914f = h2;
        this.f5915g = xc;
        h2.a().a(cVar.a(icVar.f5981a.f4925b, xc, h2.a()));
    }

    public void a(C0554mc mcVar) {
        Xb xb;
        this.f5912d = mcVar;
        Xc xc = this.f5915g;
        if (mcVar == null) {
            xb = null;
        } else {
            xb = mcVar.m;
        }
        xc.a(xb);
        a();
    }
}
