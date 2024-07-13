package com.applovin.exoplayer2;

import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.j.k;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.o;
import com.applovin.exoplayer2.l.p;
import com.applovin.exoplayer2.q;
import com.applovin.exoplayer2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class r extends d {
    private av A;
    private z B;
    private boolean C;
    private an.a D;
    private ac E;
    private ac F;
    private al G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b  reason: collision with root package name */
    final k f13783b;

    /* renamed from: c  reason: collision with root package name */
    final an.a f13784c;

    /* renamed from: d  reason: collision with root package name */
    private final ar[] f13785d;

    /* renamed from: e  reason: collision with root package name */
    private final j f13786e;

    /* renamed from: f  reason: collision with root package name */
    private final o f13787f;

    /* renamed from: g  reason: collision with root package name */
    private final s.e f13788g;

    /* renamed from: h  reason: collision with root package name */
    private final s f13789h;
    private final p<an.b> i;
    private final CopyOnWriteArraySet<q.a> j;
    private final ba.a k;
    private final List<a> l;
    private final boolean m;
    private final com.applovin.exoplayer2.h.r n;
    private final com.applovin.exoplayer2.a.a o;
    private final Looper p;
    private final d q;
    private final long r;
    private final long s;
    private final com.applovin.exoplayer2.l.d t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    private static final class a implements ag {

        /* renamed from: a  reason: collision with root package name */
        private final Object f13790a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ba f13791b;

        public a(Object obj, ba baVar) {
            this.f13790a = obj;
            this.f13791b = baVar;
        }

        public Object a() {
            return this.f13790a;
        }

        public ba b() {
            return this.f13791b;
        }
    }

    /* JADX WARNING: type inference failed for: r37v0, types: [com.applovin.exoplayer2.an] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(com.applovin.exoplayer2.ar[] r19, com.applovin.exoplayer2.j.j r20, com.applovin.exoplayer2.h.r r21, com.applovin.exoplayer2.aa r22, com.applovin.exoplayer2.k.d r23, com.applovin.exoplayer2.a.a r24, boolean r25, com.applovin.exoplayer2.av r26, long r27, long r29, com.applovin.exoplayer2.z r31, long r32, boolean r34, com.applovin.exoplayer2.l.d r35, android.os.Looper r36, com.applovin.exoplayer2.an r37, com.applovin.exoplayer2.an.a r38) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r35
            r14 = r36
            r18.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Init "
            r1.append(r3)
            int r3 = java.lang.System.identityHashCode(r18)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.String r3 = "ExoPlayerLib/2.15.1"
            r1.append(r3)
            java.lang.String r3 = "] ["
            r1.append(r3)
            java.lang.String r3 = com.applovin.exoplayer2.l.ai.f13529e
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            com.applovin.exoplayer2.l.q.b(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            com.applovin.exoplayer2.l.a.b((boolean) r1)
            java.lang.Object r1 = com.applovin.exoplayer2.l.a.b(r19)
            com.applovin.exoplayer2.ar[] r1 = (com.applovin.exoplayer2.ar[]) r1
            r0.f13785d = r1
            java.lang.Object r1 = com.applovin.exoplayer2.l.a.b(r20)
            com.applovin.exoplayer2.j.j r1 = (com.applovin.exoplayer2.j.j) r1
            r0.f13786e = r1
            r1 = r21
            r0.n = r1
            r0.q = r6
            r0.o = r9
            r1 = r25
            r0.m = r1
            r10 = r26
            r0.A = r10
            r4 = r27
            r0.r = r4
            r4 = r29
            r0.s = r4
            r12 = r34
            r0.C = r12
            r0.p = r14
            r0.t = r15
            r0.u = r3
            if (r37 == 0) goto L_0x0087
            r1 = r37
            goto L_0x0088
        L_0x0087:
            r1 = r0
        L_0x0088:
            com.applovin.exoplayer2.l.p r4 = new com.applovin.exoplayer2.l.p
            com.applovin.exoplayer2.-$$Lambda$r$VAd23GQwbAzdWcODYdRLLcr6drc r5 = new com.applovin.exoplayer2.-$$Lambda$r$VAd23GQwbAzdWcODYdRLLcr6drc
            r5.<init>()
            r4.<init>(r14, r15, r5)
            r0.i = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l = r4
            com.applovin.exoplayer2.h.z$a r4 = new com.applovin.exoplayer2.h.z$a
            r4.<init>(r3)
            r0.B = r4
            com.applovin.exoplayer2.j.k r3 = new com.applovin.exoplayer2.j.k
            int r4 = r2.length
            com.applovin.exoplayer2.at[] r4 = new com.applovin.exoplayer2.at[r4]
            int r5 = r2.length
            com.applovin.exoplayer2.j.d[] r5 = new com.applovin.exoplayer2.j.d[r5]
            r7 = 0
            r3.<init>(r4, r5, r7)
            r0.f13783b = r3
            com.applovin.exoplayer2.ba$a r3 = new com.applovin.exoplayer2.ba$a
            r3.<init>()
            r0.k = r3
            com.applovin.exoplayer2.an$a$a r3 = new com.applovin.exoplayer2.an$a$a
            r3.<init>()
            r4 = 10
            int[] r4 = new int[r4]
            r4 = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19} // fill-array
            com.applovin.exoplayer2.an$a$a r3 = r3.a((int[]) r4)
            r4 = 28
            boolean r5 = r20.a()
            com.applovin.exoplayer2.an$a$a r3 = r3.a(r4, r5)
            r4 = r38
            com.applovin.exoplayer2.an$a$a r3 = r3.a((com.applovin.exoplayer2.an.a) r4)
            com.applovin.exoplayer2.an$a r3 = r3.a()
            r0.f13784c = r3
            com.applovin.exoplayer2.an$a$a r3 = new com.applovin.exoplayer2.an$a$a
            r3.<init>()
            com.applovin.exoplayer2.an$a r4 = r0.f13784c
            com.applovin.exoplayer2.an$a$a r3 = r3.a((com.applovin.exoplayer2.an.a) r4)
            r4 = 3
            com.applovin.exoplayer2.an$a$a r3 = r3.a((int) r4)
            r4 = 9
            com.applovin.exoplayer2.an$a$a r3 = r3.a((int) r4)
            com.applovin.exoplayer2.an$a r3 = r3.a()
            r0.D = r3
            com.applovin.exoplayer2.ac r3 = com.applovin.exoplayer2.ac.f11032a
            r0.E = r3
            com.applovin.exoplayer2.ac r3 = com.applovin.exoplayer2.ac.f11032a
            r0.F = r3
            r3 = -1
            r0.H = r3
            com.applovin.exoplayer2.l.o r3 = r15.a(r14, r7)
            r0.f13787f = r3
            com.applovin.exoplayer2.-$$Lambda$r$Gjt1BimvXa7pCAiT3T4ckq1YSTU r3 = new com.applovin.exoplayer2.-$$Lambda$r$Gjt1BimvXa7pCAiT3T4ckq1YSTU
            r3.<init>()
            r0.f13788g = r3
            com.applovin.exoplayer2.j.k r3 = r0.f13783b
            com.applovin.exoplayer2.al r3 = com.applovin.exoplayer2.al.a((com.applovin.exoplayer2.j.k) r3)
            r0.G = r3
            if (r9 == 0) goto L_0x0130
            r9.a((com.applovin.exoplayer2.an) r1, (android.os.Looper) r14)
            r0.a((com.applovin.exoplayer2.an.d) r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.a(r1, r9)
        L_0x0130:
            com.applovin.exoplayer2.s r13 = new com.applovin.exoplayer2.s
            r1 = r13
            com.applovin.exoplayer2.j.k r4 = r0.f13783b
            int r7 = r0.u
            boolean r8 = r0.v
            com.applovin.exoplayer2.s$e r3 = r0.f13788g
            r17 = r3
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r11 = r31
            r0 = r13
            r12 = r32
            r14 = r34
            r15 = r36
            r16 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f13789h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.r.<init>(com.applovin.exoplayer2.ar[], com.applovin.exoplayer2.j.j, com.applovin.exoplayer2.h.r, com.applovin.exoplayer2.aa, com.applovin.exoplayer2.k.d, com.applovin.exoplayer2.a.a, boolean, com.applovin.exoplayer2.av, long, long, com.applovin.exoplayer2.z, long, boolean, com.applovin.exoplayer2.l.d, android.os.Looper, com.applovin.exoplayer2.an, com.applovin.exoplayer2.an$a):void");
    }

    private int W() {
        return this.G.f11096a.d() ? this.H : this.G.f11096a.a(this.G.f11097b.f12829a, this.k).f11364c;
    }

    private void X() {
        an.a aVar = this.D;
        an.a a2 = a(this.f13784c);
        this.D = a2;
        if (!a2.equals(aVar)) {
            this.i.a(13, new p.a() {
                public final void invoke(Object obj) {
                    r.this.c((an.b) obj);
                }
            });
        }
    }

    private ba Y() {
        return new ap(this.l, this.B);
    }

    private long a(al alVar) {
        return alVar.f11096a.d() ? h.b(this.J) : alVar.f11097b.a() ? alVar.s : a(alVar.f11096a, alVar.f11097b, alVar.s);
    }

    private long a(ba baVar, p.a aVar, long j2) {
        baVar.a(aVar.f12829a, this.k);
        return j2 + this.k.c();
    }

    private Pair<Boolean, Integer> a(al alVar, al alVar2, boolean z2, int i2, boolean z3) {
        ba baVar = alVar2.f11096a;
        ba baVar2 = alVar.f11096a;
        if (baVar2.d() && baVar.d()) {
            return new Pair<>(false, -1);
        }
        int i3 = 3;
        if (baVar2.d() != baVar.d()) {
            return new Pair<>(true, 3);
        }
        if (baVar.a(baVar.a(alVar2.f11097b.f12829a, this.k).f11364c, this.f11708a).f11374b.equals(baVar2.a(baVar2.a(alVar.f11097b.f12829a, this.k).f11364c, this.f11708a).f11374b)) {
            return (!z2 || i2 != 0 || alVar2.f11097b.f12832d >= alVar.f11097b.f12832d) ? new Pair<>(false, -1) : new Pair<>(true, 0);
        }
        if (z2 && i2 == 0) {
            i3 = 1;
        } else if (z2 && i2 == 1) {
            i3 = 2;
        } else if (!z3) {
            throw new IllegalStateException();
        }
        return new Pair<>(true, Integer.valueOf(i3));
    }

    private Pair<Object, Long> a(ba baVar, int i2, long j2) {
        if (baVar.d()) {
            this.H = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.J = j2;
            this.I = 0;
            return null;
        }
        if (i2 == -1 || i2 >= baVar.b()) {
            i2 = baVar.b(this.v);
            j2 = baVar.a(i2, this.f11708a).a();
        }
        return baVar.a(this.f11708a, this.k, i2, h.b(j2));
    }

    private Pair<Object, Long> a(ba baVar, ba baVar2) {
        long N = N();
        int i2 = -1;
        if (baVar.d() || baVar2.d()) {
            boolean z2 = !baVar.d() && baVar2.d();
            if (!z2) {
                i2 = W();
            }
            if (z2) {
                N = -9223372036854775807L;
            }
            return a(baVar2, i2, N);
        }
        Pair<Object, Long> a2 = baVar.a(this.f11708a, this.k, G(), h.b(N));
        Object obj = ((Pair) ai.a(a2)).first;
        if (baVar2.c(obj) != -1) {
            return a2;
        }
        Object a3 = s.a(this.f11708a, this.k, this.u, this.v, obj, baVar, baVar2);
        if (a3 == null) {
            return a(baVar2, -1, -9223372036854775807L);
        }
        baVar2.a(a3, this.k);
        return a(baVar2, this.k.f11364c, baVar2.a(this.k.f11364c, this.f11708a).a());
    }

    private al a(int i2, int i3) {
        boolean z2 = false;
        com.applovin.exoplayer2.l.a.a(i2 >= 0 && i3 >= i2 && i3 <= this.l.size());
        int G2 = G();
        ba S = S();
        int size = this.l.size();
        this.w++;
        b(i2, i3);
        ba Y = Y();
        al a2 = a(this.G, Y, a(S, Y));
        if (a2.f11100e != 1 && a2.f11100e != 4 && i2 < i3 && i3 == size && G2 >= a2.f11096a.b()) {
            z2 = true;
        }
        if (z2) {
            a2 = a2.a(4);
        }
        this.f13789h.a(i2, i3, this.B);
        return a2;
    }

    private al a(al alVar, ba baVar, Pair<Object, Long> pair) {
        int i2;
        ba baVar2 = baVar;
        Pair<Object, Long> pair2 = pair;
        com.applovin.exoplayer2.l.a.a(baVar.d() || pair2 != null);
        ba baVar3 = alVar.f11096a;
        al a2 = alVar.a(baVar);
        if (baVar.d()) {
            p.a a3 = al.a();
            long b2 = h.b(this.J);
            al a4 = a2.a(a3, b2, b2, b2, 0, ad.f12752a, this.f13783b, com.applovin.exoplayer2.common.a.s.g()).a(a3);
            a4.q = a4.s;
            return a4;
        }
        Object obj = a2.f11097b.f12829a;
        boolean z2 = !obj.equals(((Pair) ai.a(pair)).first);
        p.a aVar = z2 ? new p.a(pair2.first) : a2.f11097b;
        long longValue = ((Long) pair2.second).longValue();
        long b3 = h.b(N());
        if (!baVar3.d()) {
            b3 -= baVar3.a(obj, this.k).c();
        }
        if (z2 || longValue < b3) {
            p.a aVar2 = aVar;
            com.applovin.exoplayer2.l.a.b(!aVar2.a());
            p.a aVar3 = aVar2;
            al a5 = a2.a(aVar3, longValue, longValue, longValue, 0, z2 ? ad.f12752a : a2.f11103h, z2 ? this.f13783b : a2.i, z2 ? com.applovin.exoplayer2.common.a.s.g() : a2.j).a(aVar3);
            a5.q = longValue;
            return a5;
        }
        if (i2 == 0) {
            int c2 = baVar2.c(a2.k.f12829a);
            if (c2 == -1 || baVar2.a(c2, this.k).f11364c != baVar2.a(aVar.f12829a, this.k).f11364c) {
                baVar2.a(aVar.f12829a, this.k);
                long j2 = aVar.a() ? this.k.b(aVar.f12830b, aVar.f12831c) : this.k.f11365d;
                a2 = a2.a(aVar, a2.s, a2.s, a2.f11099d, j2 - a2.s, a2.f11103h, a2.i, a2.j).a(aVar);
                a2.q = j2;
            }
        } else {
            p.a aVar4 = aVar;
            com.applovin.exoplayer2.l.a.b(!aVar4.a());
            long max = Math.max(0, a2.r - (longValue - b3));
            long j3 = a2.q;
            if (a2.k.equals(a2.f11097b)) {
                j3 = longValue + max;
            }
            a2 = a2.a(aVar4, longValue, longValue, longValue, max, a2.f11103h, a2.i, a2.j);
            a2.q = j2;
        }
        return a2;
    }

    private an.e a(int i2, al alVar, int i3) {
        int i4;
        Object obj;
        ab abVar;
        int i5;
        Object obj2;
        long j2;
        long j3;
        long j4;
        al alVar2 = alVar;
        ba.a aVar = new ba.a();
        if (!alVar2.f11096a.d()) {
            Object obj3 = alVar2.f11097b.f12829a;
            alVar2.f11096a.a(obj3, aVar);
            int i6 = aVar.f11364c;
            i5 = i6;
            obj = obj3;
            i4 = alVar2.f11096a.c(obj3);
            obj2 = alVar2.f11096a.a(i6, this.f11708a).f11374b;
            abVar = this.f11708a.f11376d;
        } else {
            i5 = i3;
            obj2 = null;
            abVar = null;
            obj = null;
            i4 = -1;
        }
        if (i2 == 0) {
            j4 = aVar.f11366e + aVar.f11365d;
            if (alVar2.f11097b.a()) {
                j2 = aVar.b(alVar2.f11097b.f12830b, alVar2.f11097b.f12831c);
            } else {
                if (alVar2.f11097b.f12833e != -1 && this.G.f11097b.a()) {
                    j4 = b(this.G);
                }
                j3 = j2;
                return new an.e(obj2, i5, abVar, obj, i4, h.a(j2), h.a(j3), alVar2.f11097b.f12830b, alVar2.f11097b.f12831c);
            }
        } else if (alVar2.f11097b.a()) {
            j2 = alVar2.s;
        } else {
            j4 = aVar.f11366e + alVar2.s;
            j3 = j2;
            return new an.e(obj2, i5, abVar, obj, i4, h.a(j2), h.a(j3), alVar2.f11097b.f12830b, alVar2.f11097b.f12831c);
        }
        j3 = b(alVar);
        return new an.e(obj2, i5, abVar, obj, i4, h.a(j2), h.a(j3), alVar2.f11097b.f12830b, alVar2.f11097b.f12831c);
    }

    private List<ah.c> a(int i2, List<com.applovin.exoplayer2.h.p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ah.c cVar = new ah.c(list.get(i3), this.m);
            arrayList.add(cVar);
            this.l.add(i3 + i2, new a(cVar.f11088b, cVar.f11087a.f()));
        }
        this.B = this.B.a(i2, arrayList.size());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(int i2, an.e eVar, an.e eVar2, an.b bVar) {
        bVar.e(i2);
        bVar.a(eVar, eVar2, i2);
    }

    private void a(al alVar, int i2, int i3, boolean z2, boolean z3, int i4, long j2, int i5) {
        al alVar2 = alVar;
        int i6 = i4;
        al alVar3 = this.G;
        this.G = alVar2;
        Pair<Boolean, Integer> a2 = a(alVar, alVar3, z3, i4, !alVar3.f11096a.equals(alVar2.f11096a));
        boolean booleanValue = ((Boolean) a2.first).booleanValue();
        int intValue = ((Integer) a2.second).intValue();
        ac acVar = this.E;
        ab abVar = null;
        if (booleanValue) {
            if (!alVar2.f11096a.d()) {
                abVar = alVar2.f11096a.a(alVar2.f11096a.a(alVar2.f11097b.f12829a, this.k).f11364c, this.f11708a).f11376d;
            }
            acVar = abVar != null ? abVar.f10978e : ac.f11032a;
        }
        if (!alVar3.j.equals(alVar2.j)) {
            acVar = acVar.a().a(alVar2.j).a();
        }
        boolean z4 = !acVar.equals(this.E);
        this.E = acVar;
        if (!alVar3.f11096a.equals(alVar2.f11096a)) {
            this.i.a(0, new p.a(i2) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).a(al.this.f11096a, this.f$1);
                }
            });
        }
        if (z3) {
            this.i.a(11, new p.a(i6, a(i6, alVar3, i5), c(j2)) {
                public final /* synthetic */ int f$0;
                public final /* synthetic */ an.e f$1;
                public final /* synthetic */ an.e f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void invoke(Object obj) {
                    r.a(this.f$0, this.f$1, this.f$2, (an.b) obj);
                }
            });
        }
        if (booleanValue) {
            this.i.a(1, new p.a(intValue) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).a(ab.this, this.f$1);
                }
            });
        }
        if (alVar3.f11101f != alVar2.f11101f) {
            this.i.a(10, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).b((ak) al.this.f11101f);
                }
            });
            if (alVar2.f11101f != null) {
                this.i.a(10, new p.a() {
                    public final void invoke(Object obj) {
                        ((an.b) obj).a((ak) al.this.f11101f);
                    }
                });
            }
        }
        if (alVar3.i != alVar2.i) {
            this.f13786e.a(alVar2.i.f13314d);
            this.i.a(2, new p.a(new h(alVar2.i.f13313c)) {
                public final /* synthetic */ h f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).a(al.this.f11103h, this.f$1);
                }
            });
        }
        if (z4) {
            this.i.a(14, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).a(ac.this);
                }
            });
        }
        if (alVar3.f11102g != alVar2.f11102g) {
            this.i.a(3, new p.a() {
                public final void invoke(Object obj) {
                    r.f(al.this, (an.b) obj);
                }
            });
        }
        if (!(alVar3.f11100e == alVar2.f11100e && alVar3.l == alVar2.l)) {
            this.i.a(-1, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).a(al.this.l, al.this.f11100e);
                }
            });
        }
        if (alVar3.f11100e != alVar2.f11100e) {
            this.i.a(4, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).b(al.this.f11100e);
                }
            });
        }
        if (alVar3.l != alVar2.l) {
            this.i.a(5, new p.a(i3) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).b(al.this.l, this.f$1);
                }
            });
        }
        if (alVar3.m != alVar2.m) {
            this.i.a(6, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).c(al.this.m);
                }
            });
        }
        if (c(alVar3) != c(alVar)) {
            this.i.a(7, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).d(r.c(al.this));
                }
            });
        }
        if (!alVar3.n.equals(alVar2.n)) {
            this.i.a(12, new p.a() {
                public final void invoke(Object obj) {
                    ((an.b) obj).a(al.this.n);
                }
            });
        }
        if (z2) {
            this.i.a(-1, $$Lambda$kxQdK3QrXIWx_g2EVlOVyvP3ZJw.INSTANCE);
        }
        X();
        this.i.a();
        if (alVar3.o != alVar2.o) {
            Iterator<q.a> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a(alVar2.o);
            }
        }
        if (alVar3.p != alVar2.p) {
            Iterator<q.a> it2 = this.j.iterator();
            while (it2.hasNext()) {
                it2.next().b(alVar2.p);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void c(s.d dVar) {
        long j2;
        boolean z2;
        this.w -= dVar.f13814b;
        boolean z3 = true;
        if (dVar.f13815c) {
            this.x = dVar.f13816d;
            this.y = true;
        }
        if (dVar.f13817e) {
            this.z = dVar.f13818f;
        }
        if (this.w == 0) {
            ba baVar = dVar.f13813a.f11096a;
            if (!this.G.f11096a.d() && baVar.d()) {
                this.H = -1;
                this.J = 0;
                this.I = 0;
            }
            if (!baVar.d()) {
                List<ba> a2 = ((ap) baVar).a();
                com.applovin.exoplayer2.l.a.b(a2.size() == this.l.size());
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    ba unused = this.l.get(i2).f13791b = a2.get(i2);
                }
            }
            long j3 = -9223372036854775807L;
            if (this.y) {
                if (dVar.f13813a.f11097b.equals(this.G.f11097b) && dVar.f13813a.f11099d == this.G.s) {
                    z3 = false;
                }
                if (z3) {
                    j3 = (baVar.d() || dVar.f13813a.f11097b.a()) ? dVar.f13813a.f11099d : a(baVar, dVar.f13813a.f11097b, dVar.f13813a.f11099d);
                }
                j2 = j3;
                z2 = z3;
            } else {
                j2 = -9223372036854775807L;
                z2 = false;
            }
            this.y = false;
            a(dVar.f13813a, 1, this.z, false, z2, this.x, j2, -1);
        }
    }

    private void a(List<com.applovin.exoplayer2.h.p> list, int i2, long j2, boolean z2) {
        int i3;
        long j3;
        int i4 = i2;
        int W = W();
        long I2 = I();
        boolean z3 = true;
        this.w++;
        if (!this.l.isEmpty()) {
            b(0, this.l.size());
        }
        List<ah.c> a2 = a(0, list);
        ba Y = Y();
        if (Y.d() || i4 < Y.b()) {
            long j4 = j2;
            if (z2) {
                j3 = -9223372036854775807L;
                i3 = Y.b(this.v);
            } else if (i4 == -1) {
                i3 = W;
                j3 = I2;
            } else {
                i3 = i4;
                j3 = j4;
            }
            al a3 = a(this.G, Y, a(Y, i3, j3));
            int i5 = a3.f11100e;
            if (!(i3 == -1 || a3.f11100e == 1)) {
                i5 = (Y.d() || i3 >= Y.b()) ? 4 : 2;
            }
            al a4 = a3.a(i5);
            this.f13789h.a(a2, i3, h.b(j3), this.B);
            if (this.G.f11097b.f12829a.equals(a4.f11097b.f12829a) || this.G.f11096a.d()) {
                z3 = false;
            }
            a(a4, 0, 1, false, z3, 4, a(a4), -1);
            return;
        }
        throw new y(Y, i4, j2);
    }

    private static long b(al alVar) {
        ba.c cVar = new ba.c();
        ba.a aVar = new ba.a();
        alVar.f11096a.a(alVar.f11097b.f12829a, aVar);
        return alVar.f11098c == -9223372036854775807L ? alVar.f11096a.a(aVar.f11364c, cVar).b() : aVar.c() + alVar.f11098c;
    }

    private void b(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.l.remove(i4);
        }
        this.B = this.B.b(i2, i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(s.d dVar) {
        this.f13787f.a((Runnable) new Runnable(dVar) {
            public final /* synthetic */ s.d f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                r.this.c(this.f$1);
            }
        });
    }

    private an.e c(long j2) {
        int i2;
        Object obj;
        ab abVar;
        int G2 = G();
        Object obj2 = null;
        if (!this.G.f11096a.d()) {
            Object obj3 = this.G.f11097b.f12829a;
            this.G.f11096a.a(obj3, this.k);
            i2 = this.G.f11096a.c(obj3);
            obj2 = this.G.f11096a.a(G2, this.f11708a).f11374b;
            abVar = this.f11708a.f11376d;
            obj = obj3;
        } else {
            abVar = null;
            obj = null;
            i2 = -1;
        }
        long a2 = h.a(j2);
        return new an.e(obj2, G2, abVar, obj, i2, a2, this.G.f11097b.a() ? h.a(b(this.G)) : a2, this.G.f11097b.f12830b, this.G.f11097b.f12831c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(an.b bVar) {
        bVar.a(this.D);
    }

    private static boolean c(al alVar) {
        return alVar.f11100e == 3 && alVar.l && alVar.m == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(an.b bVar) {
        bVar.a(this.E);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(al alVar, an.b bVar) {
        bVar.c(alVar.f11102g);
        bVar.b_(alVar.f11102g);
    }

    public long A() {
        return this.r;
    }

    public long B() {
        return this.s;
    }

    public long C() {
        return 3000;
    }

    public am D() {
        return this.G.n;
    }

    public void E() {
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.15.1" + "] [" + ai.f13529e + "] [" + t.a() + "]");
        if (!this.f13789h.c()) {
            this.i.b(10, $$Lambda$r$LeAHXFEhLVK4Q0t1kwqfu4RNHAc.INSTANCE);
        }
        this.i.b();
        this.f13787f.a((Object) null);
        com.applovin.exoplayer2.a.a aVar = this.o;
        if (aVar != null) {
            this.q.a(aVar);
        }
        al a2 = this.G.a(1);
        this.G = a2;
        al a3 = a2.a(a2.f11097b);
        this.G = a3;
        a3.q = a3.s;
        this.G.r = 0;
    }

    public int F() {
        return this.G.f11096a.d() ? this.I : this.G.f11096a.c(this.G.f11097b.f12829a);
    }

    public int G() {
        int W = W();
        if (W == -1) {
            return 0;
        }
        return W;
    }

    public long H() {
        if (!K()) {
            return p();
        }
        p.a aVar = this.G.f11097b;
        this.G.f11096a.a(aVar.f12829a, this.k);
        return h.a(this.k.b(aVar.f12830b, aVar.f12831c));
    }

    public long I() {
        return h.a(a(this.G));
    }

    public long J() {
        return h.a(this.G.r);
    }

    public boolean K() {
        return this.G.f11097b.a();
    }

    public int L() {
        if (K()) {
            return this.G.f11097b.f12830b;
        }
        return -1;
    }

    public int M() {
        if (K()) {
            return this.G.f11097b.f12831c;
        }
        return -1;
    }

    public long N() {
        if (!K()) {
            return I();
        }
        this.G.f11096a.a(this.G.f11097b.f12829a, this.k);
        return this.G.f11098c == -9223372036854775807L ? this.G.f11096a.a(G(), this.f11708a).a() : this.k.b() + h.a(this.G.f11098c);
    }

    public long O() {
        if (this.G.f11096a.d()) {
            return this.J;
        }
        int i2 = (this.G.k.f12832d > this.G.f11097b.f12832d ? 1 : (this.G.k.f12832d == this.G.f11097b.f12832d ? 0 : -1));
        al alVar = this.G;
        if (i2 != 0) {
            return alVar.f11096a.a(G(), this.f11708a).c();
        }
        long j2 = alVar.q;
        if (this.G.k.a()) {
            ba.a a2 = this.G.f11096a.a(this.G.k.f12829a, this.k);
            long a3 = a2.a(this.G.k.f12830b);
            j2 = a3 == Long.MIN_VALUE ? a2.f11365d : a3;
        }
        return h.a(a(this.G.f11096a, this.G.k, j2));
    }

    public ad P() {
        return this.G.f11103h;
    }

    public h Q() {
        return new h(this.G.i.f13313c);
    }

    public ac R() {
        return this.E;
    }

    public ba S() {
        return this.G.f11096a;
    }

    public com.applovin.exoplayer2.m.o T() {
        return com.applovin.exoplayer2.m.o.f13756a;
    }

    /* renamed from: U */
    public com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.i.a> V() {
        return com.applovin.exoplayer2.common.a.s.g();
    }

    public ao a(ao.b bVar) {
        return new ao(this.f13789h, bVar, this.G.f11096a, G(), this.t, this.f13789h.d());
    }

    public void a(int i2, long j2) {
        int i3 = i2;
        long j3 = j2;
        ba baVar = this.G.f11096a;
        if (i3 < 0 || (!baVar.d() && i3 >= baVar.b())) {
            throw new y(baVar, i2, j3);
        }
        int i4 = 1;
        this.w++;
        if (K()) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            s.d dVar = new s.d(this.G);
            dVar.a(1);
            this.f13788g.onPlaybackInfoUpdate(dVar);
            return;
        }
        if (t() != 1) {
            i4 = 2;
        }
        int G2 = G();
        al a2 = a(this.G.a(i4), baVar, a(baVar, i2, j3));
        this.f13789h.a(baVar, i2, h.b(j2));
        a(a2, 0, 1, true, true, 1, a(a2), G2);
    }

    public void a(SurfaceView surfaceView) {
    }

    public void a(TextureView textureView) {
    }

    public void a(an.b bVar) {
        this.i.a(bVar);
    }

    public void a(an.d dVar) {
        a((an.b) dVar);
    }

    public void a(com.applovin.exoplayer2.g.a aVar) {
        ac a2 = this.E.a().a(aVar).a();
        if (!a2.equals(this.E)) {
            this.E = a2;
            this.i.b(14, new p.a() {
                public final void invoke(Object obj) {
                    r.this.d((an.b) obj);
                }
            });
        }
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        a((List<com.applovin.exoplayer2.h.p>) Collections.singletonList(pVar));
    }

    public void a(q.a aVar) {
        this.j.add(aVar);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list) {
        a(list, true);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list, boolean z2) {
        a(list, -1, -9223372036854775807L, z2);
    }

    public void a(boolean z2) {
        a(z2, 0, 1);
    }

    public void a(boolean z2, int i2, int i3) {
        if (this.G.l != z2 || this.G.m != i2) {
            this.w++;
            al a2 = this.G.a(z2, i2);
            this.f13789h.a(z2, i2);
            a(a2, 0, i3, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void a(boolean z2, p pVar) {
        al alVar;
        if (z2) {
            alVar = a(0, this.l.size()).a((p) null);
        } else {
            al alVar2 = this.G;
            alVar = alVar2.a(alVar2.f11097b);
            alVar.q = alVar.s;
            alVar.r = 0;
        }
        al a2 = alVar.a(1);
        if (pVar != null) {
            a2 = a2.a(pVar);
        }
        al alVar3 = a2;
        this.w++;
        this.f13789h.b();
        a(alVar3, 0, 1, false, alVar3.f11096a.d() && !this.G.f11096a.d(), 4, a(alVar3), -1);
    }

    public void b(long j2) {
        this.f13789h.a(j2);
    }

    public void b(SurfaceView surfaceView) {
    }

    public void b(TextureView textureView) {
    }

    public void b(an.b bVar) {
        this.i.b(bVar);
    }

    public void b(an.d dVar) {
        b((an.b) dVar);
    }

    public void b(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            this.f13789h.a(z2);
            this.i.a(9, new p.a(z2) {
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).e(this.f$0);
                }
            });
            X();
            this.i.a();
        }
    }

    public void c(int i2) {
        if (this.u != i2) {
            this.u = i2;
            this.f13789h.a(i2);
            this.i.a(8, new p.a(i2) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((an.b) obj).d(this.f$0);
                }
            });
            X();
            this.i.a();
        }
    }

    public boolean q() {
        return this.G.p;
    }

    public Looper r() {
        return this.p;
    }

    public an.a s() {
        return this.D;
    }

    public int t() {
        return this.G.f11100e;
    }

    public int u() {
        return this.G.m;
    }

    /* renamed from: v */
    public p e() {
        return this.G.f11101f;
    }

    public void w() {
        if (this.G.f11100e == 1) {
            al a2 = this.G.a((p) null);
            al a3 = a2.a(a2.f11096a.d() ? 4 : 2);
            this.w++;
            this.f13789h.a();
            a(a3, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public boolean x() {
        return this.G.l;
    }

    public int y() {
        return this.u;
    }

    public boolean z() {
        return this.v;
    }
}
