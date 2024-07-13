package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.k.aa;
import com.applovin.exoplayer2.l.ai;

public final class l extends e<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final p f12810a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12811b;

    /* renamed from: c  reason: collision with root package name */
    private final ba.c f12812c;

    /* renamed from: d  reason: collision with root package name */
    private final ba.a f12813d;

    /* renamed from: e  reason: collision with root package name */
    private a f12814e;

    /* renamed from: f  reason: collision with root package name */
    private k f12815f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12816g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12817h;
    private boolean i;

    private static final class a extends h {

        /* renamed from: d  reason: collision with root package name */
        public static final Object f12818d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private final Object f12819e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final Object f12820f;

        private a(ba baVar, Object obj, Object obj2) {
            super(baVar);
            this.f12819e = obj;
            this.f12820f = obj2;
        }

        public static a a(ab abVar) {
            return new a(new b(abVar), ba.c.f11373a, f12818d);
        }

        public static a a(ba baVar, Object obj, Object obj2) {
            return new a(baVar, obj, obj2);
        }

        public ba.a a(int i, ba.a aVar, boolean z) {
            this.f12788c.a(i, aVar, z);
            if (ai.a(aVar.f11363b, this.f12820f) && z) {
                aVar.f11363b = f12818d;
            }
            return aVar;
        }

        public ba.c a(int i, ba.c cVar, long j) {
            this.f12788c.a(i, cVar, j);
            if (ai.a(cVar.f11374b, this.f12819e)) {
                cVar.f11374b = ba.c.f11373a;
            }
            return cVar;
        }

        public a a(ba baVar) {
            return new a(baVar, this.f12819e, this.f12820f);
        }

        public Object a(int i) {
            Object a2 = this.f12788c.a(i);
            return ai.a(a2, this.f12820f) ? f12818d : a2;
        }

        public int c(Object obj) {
            Object obj2;
            ba baVar = this.f12788c;
            if (f12818d.equals(obj) && (obj2 = this.f12820f) != null) {
                obj = obj2;
            }
            return baVar.c(obj);
        }
    }

    public static final class b extends ba {

        /* renamed from: c  reason: collision with root package name */
        private final ab f12821c;

        public b(ab abVar) {
            this.f12821c = abVar;
        }

        public ba.a a(int i, ba.a aVar, boolean z) {
            Object obj = null;
            Integer num = z ? 0 : null;
            if (z) {
                obj = a.f12818d;
            }
            aVar.a(num, obj, 0, -9223372036854775807L, 0, com.applovin.exoplayer2.h.a.a.f12723a, true);
            return aVar;
        }

        public ba.c a(int i, ba.c cVar, long j) {
            ba.c cVar2 = cVar;
            cVar.a(ba.c.f11373a, this.f12821c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (ab.e) null, 0, -9223372036854775807L, 0, 0, 0);
            ba.c cVar3 = cVar;
            cVar3.m = true;
            return cVar3;
        }

        public Object a(int i) {
            return a.f12818d;
        }

        public int b() {
            return 1;
        }

        public int c() {
            return 1;
        }

        public int c(Object obj) {
            return obj == a.f12818d ? 0 : -1;
        }
    }

    public l(p pVar, boolean z) {
        this.f12810a = pVar;
        this.f12811b = z && pVar.i();
        this.f12812c = new ba.c();
        this.f12813d = new ba.a();
        ba h2 = pVar.h();
        if (h2 != null) {
            this.f12814e = a.a(h2, (Object) null, (Object) null);
            this.i = true;
            return;
        }
        this.f12814e = a.a(pVar.g());
    }

    private Object a(Object obj) {
        return (this.f12814e.f12820f == null || !obj.equals(a.f12818d)) ? obj : this.f12814e.f12820f;
    }

    private void a(long j) {
        k kVar = this.f12815f;
        int c2 = this.f12814e.c(kVar.f12802a.f12829a);
        if (c2 != -1) {
            long j2 = this.f12814e.a(c2, this.f12813d).f11365d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            kVar.d(j);
        }
    }

    private Object b(Object obj) {
        return (this.f12814e.f12820f == null || !this.f12814e.f12820f.equals(obj)) ? obj : a.f12818d;
    }

    /* renamed from: a */
    public k b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j) {
        k kVar = new k(aVar, bVar, j);
        kVar.a(this.f12810a);
        if (this.f12817h) {
            kVar.a(aVar.a(a(aVar.f12829a)));
        } else {
            this.f12815f = kVar;
            if (!this.f12816g) {
                this.f12816g = true;
                a(null, this.f12810a);
            }
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    public p.a a(Void voidR, p.a aVar) {
        return aVar.a(b(aVar.f12829a));
    }

    public void a(n nVar) {
        ((k) nVar).i();
        if (nVar == this.f12815f) {
            this.f12815f = null;
        }
    }

    public void a(aa aaVar) {
        super.a(aaVar);
        if (!this.f12811b) {
            this.f12816g = true;
            a(null, this.f12810a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Void r13, com.applovin.exoplayer2.h.p r14, com.applovin.exoplayer2.ba r15) {
        /*
            r12 = this;
            boolean r13 = r12.f12817h
            if (r13 == 0) goto L_0x0019
            com.applovin.exoplayer2.h.l$a r13 = r12.f12814e
            com.applovin.exoplayer2.h.l$a r13 = r13.a((com.applovin.exoplayer2.ba) r15)
            r12.f12814e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f12815f
            if (r13 == 0) goto L_0x00b0
            long r13 = r13.h()
            r12.a((long) r13)
            goto L_0x00b0
        L_0x0019:
            boolean r13 = r15.d()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.i
            if (r13 == 0) goto L_0x002a
            com.applovin.exoplayer2.h.l$a r13 = r12.f12814e
            com.applovin.exoplayer2.h.l$a r13 = r13.a((com.applovin.exoplayer2.ba) r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = com.applovin.exoplayer2.ba.c.f11373a
            java.lang.Object r14 = com.applovin.exoplayer2.h.l.a.f12818d
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.h.l.a.a((com.applovin.exoplayer2.ba) r15, (java.lang.Object) r13, (java.lang.Object) r14)
        L_0x0032:
            r12.f12814e = r13
            goto L_0x00b0
        L_0x0036:
            com.applovin.exoplayer2.ba$c r13 = r12.f12812c
            r14 = 0
            r15.a((int) r14, (com.applovin.exoplayer2.ba.c) r13)
            com.applovin.exoplayer2.ba$c r13 = r12.f12812c
            long r0 = r13.b()
            com.applovin.exoplayer2.ba$c r13 = r12.f12812c
            java.lang.Object r13 = r13.f11374b
            com.applovin.exoplayer2.h.k r2 = r12.f12815f
            if (r2 == 0) goto L_0x0074
            long r2 = r2.g()
            com.applovin.exoplayer2.h.l$a r4 = r12.f12814e
            com.applovin.exoplayer2.h.k r5 = r12.f12815f
            com.applovin.exoplayer2.h.p$a r5 = r5.f12802a
            java.lang.Object r5 = r5.f12829a
            com.applovin.exoplayer2.ba$a r6 = r12.f12813d
            r4.a((java.lang.Object) r5, (com.applovin.exoplayer2.ba.a) r6)
            com.applovin.exoplayer2.ba$a r4 = r12.f12813d
            long r4 = r4.c()
            long r4 = r4 + r2
            com.applovin.exoplayer2.h.l$a r2 = r12.f12814e
            com.applovin.exoplayer2.ba$c r3 = r12.f12812c
            com.applovin.exoplayer2.ba$c r14 = r2.a((int) r14, (com.applovin.exoplayer2.ba.c) r3)
            long r2 = r14.b()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            com.applovin.exoplayer2.ba$c r7 = r12.f12812c
            com.applovin.exoplayer2.ba$a r8 = r12.f12813d
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.i
            if (r14 == 0) goto L_0x0094
            com.applovin.exoplayer2.h.l$a r13 = r12.f12814e
            com.applovin.exoplayer2.h.l$a r13 = r13.a((com.applovin.exoplayer2.ba) r15)
            goto L_0x0098
        L_0x0094:
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.h.l.a.a((com.applovin.exoplayer2.ba) r15, (java.lang.Object) r13, (java.lang.Object) r0)
        L_0x0098:
            r12.f12814e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f12815f
            if (r13 == 0) goto L_0x00b0
            r12.a((long) r1)
            com.applovin.exoplayer2.h.p$a r14 = r13.f12802a
            com.applovin.exoplayer2.h.p$a r13 = r13.f12802a
            java.lang.Object r13 = r13.f12829a
            java.lang.Object r13 = r12.a((java.lang.Object) r13)
            com.applovin.exoplayer2.h.p$a r13 = r14.a(r13)
            goto L_0x00b1
        L_0x00b0:
            r13 = 0
        L_0x00b1:
            r14 = 1
            r12.i = r14
            r12.f12817h = r14
            com.applovin.exoplayer2.h.l$a r14 = r12.f12814e
            r12.a((com.applovin.exoplayer2.ba) r14)
            if (r13 == 0) goto L_0x00c8
            com.applovin.exoplayer2.h.k r14 = r12.f12815f
            java.lang.Object r14 = com.applovin.exoplayer2.l.a.b(r14)
            com.applovin.exoplayer2.h.k r14 = (com.applovin.exoplayer2.h.k) r14
            r14.a((com.applovin.exoplayer2.h.p.a) r13)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.l.a(java.lang.Void, com.applovin.exoplayer2.h.p, com.applovin.exoplayer2.ba):void");
    }

    public void c() {
        this.f12817h = false;
        this.f12816g = false;
        super.c();
    }

    public void e() {
    }

    public ba f() {
        return this.f12814e;
    }

    public ab g() {
        return this.f12810a.g();
    }
}
