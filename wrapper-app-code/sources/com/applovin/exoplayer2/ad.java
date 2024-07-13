package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.d;
import com.applovin.exoplayer2.h.g;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.x;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.j.k;
import com.applovin.exoplayer2.k.b;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.q;

final class ad {

    /* renamed from: a  reason: collision with root package name */
    public final n f11048a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11049b;

    /* renamed from: c  reason: collision with root package name */
    public final x[] f11050c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11051d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11052e;

    /* renamed from: f  reason: collision with root package name */
    public ae f11053f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11054g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f11055h;
    private final as[] i;
    private final j j;
    private final ah k;
    private ad l;
    private com.applovin.exoplayer2.h.ad m = com.applovin.exoplayer2.h.ad.f12752a;
    private k n;
    private long o;

    public ad(as[] asVarArr, long j2, j jVar, b bVar, ah ahVar, ae aeVar, k kVar) {
        this.i = asVarArr;
        this.o = j2;
        this.j = jVar;
        this.k = ahVar;
        this.f11049b = aeVar.f11056a.f12829a;
        this.f11053f = aeVar;
        this.n = kVar;
        this.f11050c = new x[asVarArr.length];
        this.f11055h = new boolean[asVarArr.length];
        this.f11048a = a(aeVar.f11056a, ahVar, bVar, aeVar.f11057b, aeVar.f11059d);
    }

    private static n a(p.a aVar, ah ahVar, b bVar, long j2, long j3) {
        n a2 = ahVar.a(aVar, bVar, j2);
        return j3 != -9223372036854775807L ? new d(a2, true, 0, j3) : a2;
    }

    private static void a(ah ahVar, n nVar) {
        try {
            if (nVar instanceof d) {
                nVar = ((d) nVar).f12761a;
            }
            ahVar.a(nVar);
        } catch (RuntimeException e2) {
            q.c("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    private void a(x[] xVarArr) {
        int i2 = 0;
        while (true) {
            as[] asVarArr = this.i;
            if (i2 < asVarArr.length) {
                if (asVarArr[i2].a() == -2) {
                    xVarArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void b(x[] xVarArr) {
        int i2 = 0;
        while (true) {
            as[] asVarArr = this.i;
            if (i2 < asVarArr.length) {
                if (asVarArr[i2].a() == -2 && this.n.a(i2)) {
                    xVarArr[i2] = new g();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void k() {
        if (m()) {
            for (int i2 = 0; i2 < this.n.f13311a; i2++) {
                boolean a2 = this.n.a(i2);
                com.applovin.exoplayer2.j.d dVar = this.n.f13313c[i2];
                if (a2 && dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    private void l() {
        if (m()) {
            for (int i2 = 0; i2 < this.n.f13311a; i2++) {
                boolean a2 = this.n.a(i2);
                com.applovin.exoplayer2.j.d dVar = this.n.f13313c[i2];
                if (a2 && dVar != null) {
                    dVar.b();
                }
            }
        }
    }

    private boolean m() {
        return this.l == null;
    }

    public long a() {
        return this.o;
    }

    public long a(long j2) {
        return j2 + a();
    }

    public long a(k kVar, long j2, boolean z) {
        return a(kVar, j2, z, new boolean[this.i.length]);
    }

    public long a(k kVar, long j2, boolean z, boolean[] zArr) {
        k kVar2 = kVar;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= kVar2.f13311a) {
                break;
            }
            boolean[] zArr2 = this.f11055h;
            if (z || !kVar.a(this.n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        a(this.f11050c);
        l();
        this.n = kVar2;
        k();
        long a2 = this.f11048a.a(kVar2.f13313c, this.f11055h, this.f11050c, zArr, j2);
        b(this.f11050c);
        this.f11052e = false;
        int i3 = 0;
        while (true) {
            x[] xVarArr = this.f11050c;
            if (i3 >= xVarArr.length) {
                return a2;
            }
            if (xVarArr[i3] != null) {
                a.b(kVar.a(i3));
                if (this.i[i3].a() != -2) {
                    this.f11052e = true;
                }
            } else {
                a.b(kVar2.f13313c[i3] == null);
            }
            i3++;
        }
    }

    public void a(float f2, ba baVar) throws p {
        this.f11051d = true;
        this.m = this.f11048a.b();
        k b2 = b(f2, baVar);
        long j2 = this.f11053f.f11057b;
        if (this.f11053f.f11060e != -9223372036854775807L && j2 >= this.f11053f.f11060e) {
            j2 = Math.max(0, this.f11053f.f11060e - 1);
        }
        long a2 = a(b2, j2, false);
        this.o += this.f11053f.f11057b - a2;
        this.f11053f = this.f11053f.a(a2);
    }

    public void a(ad adVar) {
        if (adVar != this.l) {
            l();
            this.l = adVar;
            k();
        }
    }

    public long b() {
        return this.f11053f.f11057b + this.o;
    }

    public long b(long j2) {
        return j2 - a();
    }

    public k b(float f2, ba baVar) throws p {
        k a2 = this.j.a(this.i, h(), this.f11053f.f11056a, baVar);
        for (com.applovin.exoplayer2.j.d dVar : a2.f13313c) {
            if (dVar != null) {
                dVar.a(f2);
            }
        }
        return a2;
    }

    public void c(long j2) {
        this.o = j2;
    }

    public boolean c() {
        return this.f11051d && (!this.f11052e || this.f11048a.d() == Long.MIN_VALUE);
    }

    public long d() {
        if (!this.f11051d) {
            return this.f11053f.f11057b;
        }
        long d2 = this.f11052e ? this.f11048a.d() : Long.MIN_VALUE;
        return d2 == Long.MIN_VALUE ? this.f11053f.f11060e : d2;
    }

    public void d(long j2) {
        a.b(m());
        if (this.f11051d) {
            this.f11048a.a(b(j2));
        }
    }

    public long e() {
        if (!this.f11051d) {
            return 0;
        }
        return this.f11048a.e();
    }

    public void e(long j2) {
        a.b(m());
        this.f11048a.c(b(j2));
    }

    public void f() {
        l();
        a(this.k, this.f11048a);
    }

    public ad g() {
        return this.l;
    }

    public com.applovin.exoplayer2.h.ad h() {
        return this.m;
    }

    public k i() {
        return this.n;
    }

    public void j() {
        if (this.f11048a instanceof d) {
            ((d) this.f11048a).a(0, this.f11053f.f11059d == -9223372036854775807L ? Long.MIN_VALUE : this.f11053f.f11059d);
        }
    }
}
