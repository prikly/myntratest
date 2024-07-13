package com.applovin.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.applovin.exoplayer2.a.a;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.j.k;
import com.applovin.exoplayer2.k.b;
import java.util.List;

final class af {

    /* renamed from: a  reason: collision with root package name */
    private final ba.a f11064a = new ba.a();

    /* renamed from: b  reason: collision with root package name */
    private final ba.c f11065b = new ba.c();

    /* renamed from: c  reason: collision with root package name */
    private final a f11066c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f11067d;

    /* renamed from: e  reason: collision with root package name */
    private long f11068e;

    /* renamed from: f  reason: collision with root package name */
    private int f11069f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11070g;

    /* renamed from: h  reason: collision with root package name */
    private ad f11071h;
    private ad i;
    private ad j;
    private int k;
    private Object l;
    private long m;

    public af(a aVar, Handler handler) {
        this.f11066c = aVar;
        this.f11067d = handler;
    }

    private long a(ba baVar, Object obj) {
        ad adVar;
        int c2;
        int i2 = baVar.a(obj, this.f11064a).f11364c;
        Object obj2 = this.l;
        if (obj2 != null && (c2 = baVar.c(obj2)) != -1 && baVar.a(c2, this.f11064a).f11364c == i2) {
            return this.m;
        }
        ad adVar2 = this.f11071h;
        while (true) {
            if (adVar == null) {
                adVar = this.f11071h;
                while (adVar != null) {
                    int c3 = baVar.c(adVar.f11049b);
                    if (c3 == -1 || baVar.a(c3, this.f11064a).f11364c != i2) {
                        adVar = adVar.g();
                    }
                }
                long j2 = this.f11068e;
                this.f11068e = 1 + j2;
                if (this.f11071h == null) {
                    this.l = obj;
                    this.m = j2;
                }
                return j2;
            } else if (adVar.f11049b.equals(obj)) {
                break;
            } else {
                adVar2 = adVar.g();
            }
        }
        return adVar.f11053f.f11056a.f12832d;
    }

    private long a(ba baVar, Object obj, int i2) {
        baVar.a(obj, this.f11064a);
        long a2 = this.f11064a.a(i2);
        return a2 == Long.MIN_VALUE ? this.f11064a.f11365d : a2 + this.f11064a.f(i2);
    }

    private ae a(al alVar) {
        return a(alVar.f11096a, alVar.f11097b, alVar.f11098c, alVar.s);
    }

    private ae a(ba baVar, ad adVar, long j2) {
        long j3;
        ba baVar2 = baVar;
        ae aeVar = adVar.f11053f;
        long a2 = (adVar.a() + aeVar.f11060e) - j2;
        if (aeVar.f11062g) {
            long j4 = 0;
            int a3 = baVar.a(baVar2.c(aeVar.f11056a.f12829a), this.f11064a, this.f11065b, this.f11069f, this.f11070g);
            if (a3 == -1) {
                return null;
            }
            int i2 = baVar2.a(a3, this.f11064a, true).f11364c;
            Object obj = this.f11064a.f11363b;
            long j5 = aeVar.f11056a.f12832d;
            if (baVar2.a(i2, this.f11065b).p == a3) {
                Pair<Object, Long> a4 = baVar.a(this.f11065b, this.f11064a, i2, -9223372036854775807L, Math.max(0, a2));
                if (a4 == null) {
                    return null;
                }
                obj = a4.first;
                long longValue = ((Long) a4.second).longValue();
                ad g2 = adVar.g();
                if (g2 == null || !g2.f11049b.equals(obj)) {
                    j5 = this.f11068e;
                    this.f11068e = 1 + j5;
                } else {
                    j5 = g2.f11053f.f11056a.f12832d;
                }
                j3 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return a(baVar, a(baVar, obj, j3, j5, this.f11064a), j4, j3);
        }
        p.a aVar = aeVar.f11056a;
        baVar2.a(aVar.f12829a, this.f11064a);
        if (aVar.a()) {
            int i3 = aVar.f12830b;
            int d2 = this.f11064a.d(i3);
            if (d2 == -1) {
                return null;
            }
            int a5 = this.f11064a.a(i3, aVar.f12831c);
            if (a5 < d2) {
                return a(baVar, aVar.f12829a, i3, a5, aeVar.f11058c, aVar.f12832d);
            }
            long j6 = aeVar.f11058c;
            if (j6 == -9223372036854775807L) {
                ba.c cVar = this.f11065b;
                ba.a aVar2 = this.f11064a;
                Pair<Object, Long> a6 = baVar.a(cVar, aVar2, aVar2.f11364c, -9223372036854775807L, Math.max(0, a2));
                if (a6 == null) {
                    return null;
                }
                j6 = ((Long) a6.second).longValue();
            }
            return a(baVar, aVar.f12829a, Math.max(a(baVar2, aVar.f12829a, aVar.f12830b), j6), aeVar.f11058c, aVar.f12832d);
        }
        int b2 = this.f11064a.b(aVar.f12833e);
        if (b2 == this.f11064a.d(aVar.f12833e)) {
            return a(baVar, aVar.f12829a, a(baVar2, aVar.f12829a, aVar.f12833e), aeVar.f11060e, aVar.f12832d);
        }
        return a(baVar, aVar.f12829a, aVar.f12833e, b2, aeVar.f11060e, aVar.f12832d);
    }

    private ae a(ba baVar, p.a aVar, long j2, long j3) {
        p.a aVar2 = aVar;
        ba baVar2 = baVar;
        baVar.a(aVar2.f12829a, this.f11064a);
        boolean a2 = aVar.a();
        Object obj = aVar2.f12829a;
        if (a2) {
            return a(baVar, obj, aVar2.f12830b, aVar2.f12831c, j2, aVar2.f12832d);
        }
        return a(baVar, obj, j3, j2, aVar2.f12832d);
    }

    private ae a(ba baVar, Object obj, int i2, int i3, long j2, long j3) {
        int i4 = i3;
        p.a aVar = new p.a(obj, i2, i4, j3);
        long b2 = baVar.a(aVar.f12829a, this.f11064a).b(aVar.f12830b, aVar.f12831c);
        long f2 = i4 == this.f11064a.b(i2) ? this.f11064a.f() : 0;
        return new ae(aVar, (b2 == -9223372036854775807L || f2 < b2) ? f2 : Math.max(0, b2 - 1), j2, -9223372036854775807L, b2, this.f11064a.e(aVar.f12830b), false, false, false);
    }

    private ae a(ba baVar, Object obj, long j2, long j3, long j4) {
        ba baVar2 = baVar;
        Object obj2 = obj;
        long j5 = j2;
        baVar2.a(obj2, this.f11064a);
        int b2 = this.f11064a.b(j5);
        p.a aVar = new p.a(obj2, j4, b2);
        boolean a2 = a(aVar);
        boolean a3 = a(baVar2, aVar);
        boolean a4 = a(baVar2, aVar, a2);
        boolean z = b2 != -1 && this.f11064a.e(b2);
        long a5 = b2 != -1 ? this.f11064a.a(b2) : -9223372036854775807L;
        long j6 = (a5 == -9223372036854775807L || a5 == Long.MIN_VALUE) ? this.f11064a.f11365d : a5;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0, j6 - 1);
        }
        return new ae(aVar, j5, j3, a5, j6, z, a2, a3, a4);
    }

    private static p.a a(ba baVar, Object obj, long j2, long j3, ba.a aVar) {
        baVar.a(obj, aVar);
        int a2 = aVar.a(j2);
        if (a2 == -1) {
            return new p.a(obj, j3, aVar.b(j2));
        }
        return new p.a(obj, a2, aVar.b(a2), j3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(s.a aVar, p.a aVar2) {
        this.f11066c.a((List<p.a>) aVar.a(), aVar2);
    }

    private boolean a(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    private boolean a(ae aeVar, ae aeVar2) {
        return aeVar.f11057b == aeVar2.f11057b && aeVar.f11056a.equals(aeVar2.f11056a);
    }

    private boolean a(ba baVar) {
        ad adVar = this.f11071h;
        if (adVar == null) {
            return true;
        }
        int c2 = baVar.c(adVar.f11049b);
        while (true) {
            c2 = baVar.a(c2, this.f11064a, this.f11065b, this.f11069f, this.f11070g);
            while (adVar.g() != null && !adVar.f11053f.f11062g) {
                adVar = adVar.g();
            }
            ad g2 = adVar.g();
            if (c2 == -1 || g2 == null || baVar.c(g2.f11049b) != c2) {
                boolean a2 = a(adVar);
                adVar.f11053f = a(baVar, adVar.f11053f);
            } else {
                adVar = g2;
            }
        }
        boolean a22 = a(adVar);
        adVar.f11053f = a(baVar, adVar.f11053f);
        return !a22;
    }

    private boolean a(ba baVar, p.a aVar) {
        if (!a(aVar)) {
            return false;
        }
        return baVar.a(baVar.a(aVar.f12829a, this.f11064a).f11364c, this.f11065b).q == baVar.c(aVar.f12829a);
    }

    private boolean a(ba baVar, p.a aVar, boolean z) {
        int c2 = baVar.c(aVar.f12829a);
        if (!baVar.a(baVar.a(c2, this.f11064a).f11364c, this.f11065b).j) {
            return baVar.b(c2, this.f11064a, this.f11065b, this.f11069f, this.f11070g) && z;
        }
    }

    private boolean a(p.a aVar) {
        return !aVar.a() && aVar.f12833e == -1;
    }

    private void h() {
        if (this.f11066c != null) {
            s.a i2 = s.i();
            for (ad adVar = this.f11071h; adVar != null; adVar = adVar.g()) {
                i2.a(adVar.f11053f.f11056a);
            }
            ad adVar2 = this.i;
            this.f11067d.post(new Runnable(i2, adVar2 == null ? null : adVar2.f11053f.f11056a) {
                public final /* synthetic */ s.a f$1;
                public final /* synthetic */ p.a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    af.this.a(this.f$1, this.f$2);
                }
            });
        }
    }

    public ad a(as[] asVarArr, j jVar, b bVar, ah ahVar, ae aeVar, k kVar) {
        ae aeVar2 = aeVar;
        ad adVar = this.j;
        ad adVar2 = new ad(asVarArr, adVar == null ? (!aeVar2.f11056a.a() || aeVar2.f11058c == -9223372036854775807L) ? 0 : aeVar2.f11058c : (adVar.a() + this.j.f11053f.f11060e) - aeVar2.f11057b, jVar, bVar, ahVar, aeVar, kVar);
        ad adVar3 = this.j;
        if (adVar3 != null) {
            adVar3.a(adVar2);
        } else {
            this.f11071h = adVar2;
            this.i = adVar2;
        }
        this.l = null;
        this.j = adVar2;
        this.k++;
        h();
        return adVar2;
    }

    public ae a(long j2, al alVar) {
        return this.j == null ? a(alVar) : a(alVar.f11096a, this.j, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.ae a(com.applovin.exoplayer2.ba r19, com.applovin.exoplayer2.ae r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.exoplayer2.h.p$a r3 = r2.f11056a
            boolean r12 = r0.a((com.applovin.exoplayer2.h.p.a) r3)
            boolean r13 = r0.a((com.applovin.exoplayer2.ba) r1, (com.applovin.exoplayer2.h.p.a) r3)
            boolean r14 = r0.a((com.applovin.exoplayer2.ba) r1, (com.applovin.exoplayer2.h.p.a) r3, (boolean) r12)
            com.applovin.exoplayer2.h.p$a r4 = r2.f11056a
            java.lang.Object r4 = r4.f12829a
            com.applovin.exoplayer2.ba$a r5 = r0.f11064a
            r1.a((java.lang.Object) r4, (com.applovin.exoplayer2.ba.a) r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.f12833e
            if (r1 != r4) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            com.applovin.exoplayer2.ba$a r1 = r0.f11064a
            int r7 = r3.f12833e
            long r7 = r1.a((int) r7)
            goto L_0x0038
        L_0x0037:
            r7 = r5
        L_0x0038:
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x004a
            com.applovin.exoplayer2.ba$a r1 = r0.f11064a
            int r5 = r3.f12830b
            int r6 = r3.f12831c
            long r5 = r1.b(r5, r6)
        L_0x0048:
            r9 = r5
            goto L_0x005e
        L_0x004a:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0057
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r9 = r7
            goto L_0x005e
        L_0x0057:
            com.applovin.exoplayer2.ba$a r1 = r0.f11064a
            long r5 = r1.a()
            goto L_0x0048
        L_0x005e:
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x006e
            com.applovin.exoplayer2.ba$a r1 = r0.f11064a
            int r4 = r3.f12830b
            boolean r1 = r1.e(r4)
            r11 = r1
            goto L_0x0081
        L_0x006e:
            int r1 = r3.f12833e
            if (r1 == r4) goto L_0x007f
            com.applovin.exoplayer2.ba$a r1 = r0.f11064a
            int r4 = r3.f12833e
            boolean r1 = r1.e(r4)
            if (r1 == 0) goto L_0x007f
            r1 = 1
            r11 = 1
            goto L_0x0081
        L_0x007f:
            r1 = 0
            r11 = 0
        L_0x0081:
            com.applovin.exoplayer2.ae r15 = new com.applovin.exoplayer2.ae
            long r4 = r2.f11057b
            long r1 = r2.f11058c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.af.a(com.applovin.exoplayer2.ba, com.applovin.exoplayer2.ae):com.applovin.exoplayer2.ae");
    }

    public p.a a(ba baVar, Object obj, long j2) {
        return a(baVar, obj, j2, a(baVar, obj), this.f11064a);
    }

    public void a(long j2) {
        ad adVar = this.j;
        if (adVar != null) {
            adVar.d(j2);
        }
    }

    public boolean a() {
        ad adVar = this.j;
        return adVar == null || (!adVar.f11053f.i && this.j.c() && this.j.f11053f.f11060e != -9223372036854775807L && this.k < 100);
    }

    public boolean a(ad adVar) {
        boolean z = false;
        com.applovin.exoplayer2.l.a.b(adVar != null);
        if (adVar.equals(this.j)) {
            return false;
        }
        this.j = adVar;
        while (adVar.g() != null) {
            adVar = adVar.g();
            if (adVar == this.i) {
                this.i = this.f11071h;
                z = true;
            }
            adVar.f();
            this.k--;
        }
        this.j.a((ad) null);
        h();
        return z;
    }

    public boolean a(ba baVar, int i2) {
        this.f11069f = i2;
        return a(baVar);
    }

    public boolean a(ba baVar, long j2, long j3) {
        ae aeVar;
        ad adVar = this.f11071h;
        ad adVar2 = null;
        while (adVar != null) {
            ae aeVar2 = adVar.f11053f;
            if (adVar2 == null) {
                aeVar = a(baVar, aeVar2);
            } else {
                ae a2 = a(baVar, adVar2, j2);
                if (a2 == null) {
                    return !a(adVar2);
                }
                if (!a(aeVar2, a2)) {
                    return !a(adVar2);
                }
                aeVar = a2;
            }
            adVar.f11053f = aeVar.b(aeVar2.f11058c);
            if (!a(aeVar2.f11060e, aeVar.f11060e)) {
                adVar.j();
                return !a(adVar) && !(adVar == this.i && !adVar.f11053f.f11061f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((aeVar.f11060e > -9223372036854775807L ? 1 : (aeVar.f11060e == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.a(aeVar.f11060e)) ? 1 : (j3 == ((aeVar.f11060e > -9223372036854775807L ? 1 : (aeVar.f11060e == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.a(aeVar.f11060e)) ? 0 : -1)) >= 0));
            }
            adVar2 = adVar;
            adVar = adVar.g();
        }
        return true;
    }

    public boolean a(ba baVar, boolean z) {
        this.f11070g = z;
        return a(baVar);
    }

    public boolean a(n nVar) {
        ad adVar = this.j;
        return adVar != null && adVar.f11048a == nVar;
    }

    public ad b() {
        return this.j;
    }

    public ad c() {
        return this.f11071h;
    }

    public ad d() {
        return this.i;
    }

    public ad e() {
        ad adVar = this.i;
        com.applovin.exoplayer2.l.a.b((adVar == null || adVar.g() == null) ? false : true);
        this.i = this.i.g();
        h();
        return this.i;
    }

    public ad f() {
        ad adVar = this.f11071h;
        if (adVar == null) {
            return null;
        }
        if (adVar == this.i) {
            this.i = adVar.g();
        }
        this.f11071h.f();
        int i2 = this.k - 1;
        this.k = i2;
        if (i2 == 0) {
            this.j = null;
            this.l = this.f11071h.f11049b;
            this.m = this.f11071h.f11053f.f11056a.f12832d;
        }
        this.f11071h = this.f11071h.g();
        h();
        return this.f11071h;
    }

    public void g() {
        if (this.k != 0) {
            ad adVar = (ad) com.applovin.exoplayer2.l.a.a(this.f11071h);
            this.l = adVar.f11049b;
            this.m = adVar.f11053f.f11056a.f12832d;
            while (adVar != null) {
                adVar.f();
                adVar = adVar.g();
            }
            this.f11071h = null;
            this.j = null;
            this.i = null;
            this.k = 0;
            h();
        }
    }
}
