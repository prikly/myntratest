package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.x;
import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.j.k;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.o;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class s implements Handler.Callback, ah.d, ao.a, n.a, j.a, m.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    /* access modifiers changed from: private */
    public boolean H;
    private boolean I;
    private int J;
    private g K;
    private long L;
    private int M;
    private boolean N;
    private p O;
    private long P;

    /* renamed from: a  reason: collision with root package name */
    private final ar[] f13792a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<ar> f13793b;

    /* renamed from: c  reason: collision with root package name */
    private final as[] f13794c;

    /* renamed from: d  reason: collision with root package name */
    private final j f13795d;

    /* renamed from: e  reason: collision with root package name */
    private final k f13796e;

    /* renamed from: f  reason: collision with root package name */
    private final aa f13797f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f13798g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final o f13799h;
    private final HandlerThread i;
    private final Looper j;
    private final ba.c k;
    private final ba.a l;
    private final long m;
    private final boolean n;
    private final m o;
    private final ArrayList<c> p;
    private final com.applovin.exoplayer2.l.d q;
    private final e r;
    private final af s;
    private final ah t;
    private final z u;
    private final long v;
    private av w;
    private al x;
    private d y;
    private boolean z;

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<ah.c> f13801a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final z f13802b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f13803c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f13804d;

        private a(List<ah.c> list, z zVar, int i, long j) {
            this.f13801a = list;
            this.f13802b = zVar;
            this.f13803c = i;
            this.f13804d = j;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13805a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13806b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13807c;

        /* renamed from: d  reason: collision with root package name */
        public final z f13808d;
    }

    private static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final ao f13809a;

        /* renamed from: b  reason: collision with root package name */
        public int f13810b;

        /* renamed from: c  reason: collision with root package name */
        public long f13811c;

        /* renamed from: d  reason: collision with root package name */
        public Object f13812d;

        public c(ao aoVar) {
            this.f13809a = aoVar;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            if ((this.f13812d == null) != (cVar.f13812d == null)) {
                return this.f13812d != null ? -1 : 1;
            }
            if (this.f13812d == null) {
                return 0;
            }
            int i = this.f13810b - cVar.f13810b;
            return i != 0 ? i : ai.a(this.f13811c, cVar.f13811c);
        }

        public void a(int i, long j, Object obj) {
            this.f13810b = i;
            this.f13811c = j;
            this.f13812d = obj;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public al f13813a;

        /* renamed from: b  reason: collision with root package name */
        public int f13814b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13815c;

        /* renamed from: d  reason: collision with root package name */
        public int f13816d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f13817e;

        /* renamed from: f  reason: collision with root package name */
        public int f13818f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f13819g;

        public d(al alVar) {
            this.f13813a = alVar;
        }

        public void a(int i) {
            this.f13819g |= i > 0;
            this.f13814b += i;
        }

        public void a(al alVar) {
            this.f13819g |= this.f13813a != alVar;
            this.f13813a = alVar;
        }

        public void b(int i) {
            boolean z = true;
            if (!this.f13815c || this.f13816d == 5) {
                this.f13819g = true;
                this.f13815c = true;
                this.f13816d = i;
                return;
            }
            if (i != 5) {
                z = false;
            }
            com.applovin.exoplayer2.l.a.a(z);
        }

        public void c(int i) {
            this.f13819g = true;
            this.f13817e = true;
            this.f13818f = i;
        }
    }

    public interface e {
        void onPlaybackInfoUpdate(d dVar);
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final p.a f13820a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13821b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13822c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f13823d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13824e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f13825f;

        public f(p.a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f13820a = aVar;
            this.f13821b = j;
            this.f13822c = j2;
            this.f13823d = z;
            this.f13824e = z2;
            this.f13825f = z3;
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final ba f13826a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13827b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13828c;

        public g(ba baVar, int i, long j) {
            this.f13826a = baVar;
            this.f13827b = i;
            this.f13828c = j;
        }
    }

    public s(ar[] arVarArr, j jVar, k kVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, int i2, boolean z2, com.applovin.exoplayer2.a.a aVar, av avVar, z zVar, long j2, boolean z3, Looper looper, com.applovin.exoplayer2.l.d dVar2, e eVar) {
        ar[] arVarArr2 = arVarArr;
        com.applovin.exoplayer2.k.d dVar3 = dVar;
        com.applovin.exoplayer2.a.a aVar2 = aVar;
        long j3 = j2;
        com.applovin.exoplayer2.l.d dVar4 = dVar2;
        this.r = eVar;
        this.f13792a = arVarArr2;
        this.f13795d = jVar;
        this.f13796e = kVar;
        this.f13797f = aaVar;
        this.f13798g = dVar3;
        this.E = i2;
        this.F = z2;
        this.w = avVar;
        this.u = zVar;
        this.v = j3;
        this.P = j3;
        this.A = z3;
        this.q = dVar4;
        this.m = aaVar.e();
        this.n = aaVar.f();
        al a2 = al.a(kVar);
        this.x = a2;
        this.y = new d(a2);
        this.f13794c = new as[arVarArr2.length];
        for (int i3 = 0; i3 < arVarArr2.length; i3++) {
            arVarArr2[i3].a(i3);
            this.f13794c[i3] = arVarArr2[i3].b();
        }
        this.o = new m(this, dVar4);
        this.p = new ArrayList<>();
        this.f13793b = aq.b();
        this.k = new ba.c();
        this.l = new ba.a();
        jVar.a(this, dVar3);
        this.N = true;
        Handler handler = new Handler(looper);
        this.s = new af(aVar2, handler);
        this.t = new ah(this, aVar2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = this.i.getLooper();
        this.j = looper2;
        this.f13799h = dVar4.a(looper2, this);
    }

    private void A() {
        ad c2 = this.s.c();
        this.B = c2 != null && c2.f11053f.f11063h && this.A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = (r0 = r7.s.c()).g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B() {
        /*
            r7 = this;
            boolean r0 = r7.J()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.B
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            com.applovin.exoplayer2.af r0 = r7.s
            com.applovin.exoplayer2.ad r0 = r0.c()
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            com.applovin.exoplayer2.ad r0 = r0.g()
            if (r0 == 0) goto L_0x002b
            long r2 = r7.L
            long r4 = r0.b()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002b
            boolean r0 = r0.f11054g
            if (r0 == 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.B():boolean");
    }

    private boolean C() {
        ad d2 = this.s.d();
        if (!d2.f11051d) {
            return false;
        }
        int i2 = 0;
        while (true) {
            ar[] arVarArr = this.f13792a;
            if (i2 >= arVarArr.length) {
                return true;
            }
            ar arVar = arVarArr[i2];
            x xVar = d2.f11050c[i2];
            if (arVar.f() != xVar || (xVar != null && !arVar.g() && !a(arVar, d2))) {
                return false;
            }
            i2++;
        }
        return false;
    }

    private void D() {
        boolean E2 = E();
        this.D = E2;
        if (E2) {
            this.s.b().e(this.L);
        }
        G();
    }

    private boolean E() {
        if (!F()) {
            return false;
        }
        ad b2 = this.s.b();
        return this.f13797f.a(b2 == this.s.c() ? b2.b(this.L) : b2.b(this.L) - b2.f11053f.f11057b, d(b2.e()), this.o.d().f11106b);
    }

    private boolean F() {
        ad b2 = this.s.b();
        return (b2 == null || b2.e() == Long.MIN_VALUE) ? false : true;
    }

    private void G() {
        ad b2 = this.s.b();
        boolean z2 = this.D || (b2 != null && b2.f11048a.f());
        if (z2 != this.x.f11102g) {
            this.x = this.x.a(z2);
        }
    }

    private void H() throws p {
        a(new boolean[this.f13792a.length]);
    }

    private long I() {
        return d(this.x.q);
    }

    private boolean J() {
        return this.x.l && this.x.m == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean K() {
        return Boolean.valueOf(this.z);
    }

    private long a(ba baVar, Object obj, long j2) {
        baVar.a(baVar.a(obj, this.l).f11364c, this.k);
        if (this.k.f11379g == -9223372036854775807L || !this.k.e() || !this.k.j) {
            return -9223372036854775807L;
        }
        return h.b(this.k.d() - this.k.f11379g) - (j2 + this.l.c());
    }

    private long a(p.a aVar, long j2, boolean z2) throws p {
        return a(aVar, j2, this.s.c() != this.s.d(), z2);
    }

    private long a(p.a aVar, long j2, boolean z2, boolean z3) throws p {
        j();
        this.C = false;
        if (z3 || this.x.f11100e == 3) {
            b(2);
        }
        ad c2 = this.s.c();
        ad adVar = c2;
        while (adVar != null && !aVar.equals(adVar.f11053f.f11056a)) {
            adVar = adVar.g();
        }
        if (z2 || c2 != adVar || (adVar != null && adVar.a(j2) < 0)) {
            for (ar b2 : this.f13792a) {
                b(b2);
            }
            if (adVar != null) {
                while (this.s.c() != adVar) {
                    this.s.f();
                }
                this.s.a(adVar);
                adVar.c(0);
                H();
            }
        }
        af afVar = this.s;
        if (adVar != null) {
            afVar.a(adVar);
            if (!adVar.f11051d) {
                adVar.f11053f = adVar.f11053f.a(j2);
            } else if (adVar.f11052e) {
                long b3 = adVar.f11048a.b(j2);
                adVar.f11048a.a(b3 - this.m, this.n);
                j2 = b3;
            }
            b(j2);
            D();
        } else {
            afVar.g();
            b(j2);
        }
        h(false);
        this.f13799h.c(2);
        return j2;
    }

    private Pair<p.a, Long> a(ba baVar) {
        long j2 = 0;
        if (baVar.d()) {
            return Pair.create(al.a(), 0L);
        }
        ba baVar2 = baVar;
        Pair<Object, Long> a2 = baVar2.a(this.k, this.l, baVar.b(this.F), -9223372036854775807L);
        p.a a3 = this.s.a(baVar, a2.first, 0);
        long longValue = ((Long) a2.second).longValue();
        if (a3.a()) {
            baVar.a(a3.f12829a, this.l);
            if (a3.f12831c == this.l.b(a3.f12830b)) {
                j2 = this.l.f();
            }
            longValue = j2;
        }
        return Pair.create(a3, Long.valueOf(longValue));
    }

    private static Pair<Object, Long> a(ba baVar, g gVar, boolean z2, int i2, boolean z3, ba.c cVar, ba.a aVar) {
        Object a2;
        ba baVar2 = baVar;
        g gVar2 = gVar;
        ba.a aVar2 = aVar;
        ba baVar3 = gVar2.f13826a;
        if (baVar.d()) {
            return null;
        }
        ba baVar4 = baVar3.d() ? baVar2 : baVar3;
        try {
            Pair<Object, Long> a3 = baVar4.a(cVar, aVar, gVar2.f13827b, gVar2.f13828c);
            if (baVar.equals(baVar4)) {
                return a3;
            }
            if (baVar.c(a3.first) == -1) {
                ba.c cVar2 = cVar;
                if (z2 && (a2 = a(cVar, aVar, i2, z3, a3.first, baVar4, baVar)) != null) {
                    return baVar.a(cVar, aVar, baVar.a(a2, aVar2).f11364c, -9223372036854775807L);
                }
                return null;
            } else if (!baVar4.a(a3.first, aVar2).f11367f || baVar4.a(aVar2.f11364c, cVar).p != baVar4.c(a3.first)) {
                return a3;
            } else {
                return baVar.a(cVar, aVar, baVar.a(a3.first, aVar2).f11364c, gVar2.f13828c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private al a(p.a aVar, long j2, long j3, long j4, boolean z2, int i2) {
        com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> sVar;
        k kVar;
        ad adVar;
        p.a aVar2 = aVar;
        long j5 = j3;
        this.N = this.N || j2 != this.x.s || !aVar.equals(this.x.f11097b);
        A();
        ad adVar2 = this.x.f11103h;
        k kVar2 = this.x.i;
        List list = this.x.j;
        if (this.t.a()) {
            ad c2 = this.s.c();
            ad h2 = c2 == null ? ad.f12752a : c2.h();
            k i3 = c2 == null ? this.f13796e : c2.i();
            com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> a2 = a(i3.f13313c);
            if (!(c2 == null || c2.f11053f.f11058c == j5)) {
                c2.f11053f = c2.f11053f.b(j5);
            }
            adVar = h2;
            kVar = i3;
            sVar = a2;
        } else {
            if (!aVar.equals(this.x.f11097b)) {
                adVar2 = ad.f12752a;
                kVar2 = this.f13796e;
                list = com.applovin.exoplayer2.common.a.s.g();
            }
            adVar = adVar2;
            kVar = kVar2;
            sVar = list;
        }
        if (z2) {
            this.y.b(i2);
        }
        return this.x.a(aVar, j2, j3, j4, I(), adVar, kVar, sVar);
    }

    private com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> a(com.applovin.exoplayer2.j.d[] dVarArr) {
        s.a aVar = new s.a();
        boolean z2 = false;
        for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
            if (dVar != null) {
                v a2 = dVar.a(0);
                if (a2.j == null) {
                    aVar.a(new com.applovin.exoplayer2.g.a(new a.C0122a[0]));
                } else {
                    aVar.a(a2.j);
                    z2 = true;
                }
            }
        }
        return z2 ? aVar.a() : com.applovin.exoplayer2.common.a.s.g();
    }

    private static f a(ba baVar, al alVar, g gVar, af afVar, int i2, boolean z2, ba.c cVar, ba.a aVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        p.a aVar2;
        int i4;
        long j2;
        long j3;
        af afVar2;
        long j4;
        long j5;
        int i5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z8;
        boolean z9;
        ba baVar2 = baVar;
        al alVar2 = alVar;
        g gVar2 = gVar;
        boolean z10 = z2;
        ba.a aVar3 = aVar;
        if (baVar.d()) {
            return new f(al.a(), 0, -9223372036854775807L, false, true, false);
        }
        p.a aVar4 = alVar2.f11097b;
        Object obj = aVar4.f12829a;
        boolean a2 = a(alVar2, aVar3);
        long j6 = (alVar2.f11097b.a() || a2) ? alVar2.f11098c : alVar2.s;
        boolean z11 = false;
        if (gVar2 != null) {
            p.a aVar5 = aVar4;
            i3 = -1;
            Pair<Object, Long> a3 = a(baVar, gVar, true, i2, z2, cVar, aVar);
            if (a3 == null) {
                i7 = baVar2.b(z10);
                j2 = j6;
                z9 = false;
                z8 = false;
                z7 = true;
            } else {
                if (gVar2.f13828c == -9223372036854775807L) {
                    i7 = baVar2.a(a3.first, aVar3).f11364c;
                    j2 = j6;
                    z9 = false;
                } else {
                    obj = a3.first;
                    j2 = ((Long) a3.second).longValue();
                    z9 = true;
                    i7 = -1;
                }
                z8 = alVar2.f11100e == 4;
                z7 = false;
            }
            ba.c cVar2 = cVar;
            z3 = z9;
            z5 = z8;
            z4 = z7;
            i4 = i7;
            aVar2 = aVar5;
        } else {
            p.a aVar6 = aVar4;
            i3 = -1;
            if (alVar2.f11096a.d()) {
                i5 = baVar2.b(z10);
            } else if (baVar2.c(obj) == -1) {
                Object a4 = a(cVar, aVar, i2, z2, obj, alVar2.f11096a, baVar);
                if (a4 == null) {
                    i6 = baVar2.b(z10);
                    z6 = true;
                } else {
                    i6 = baVar2.a(a4, aVar3).f11364c;
                    z6 = false;
                }
                ba.c cVar3 = cVar;
                i4 = i6;
                z4 = z6;
                j4 = j6;
                aVar2 = aVar6;
                z5 = false;
                z3 = false;
            } else if (j6 == -9223372036854775807L) {
                i5 = baVar2.a(obj, aVar3).f11364c;
            } else if (a2) {
                aVar2 = aVar6;
                alVar2.f11096a.a(aVar2.f12829a, aVar3);
                if (alVar2.f11096a.a(aVar3.f11364c, cVar).p == alVar2.f11096a.c(aVar2.f12829a)) {
                    Pair<Object, Long> a5 = baVar.a(cVar, aVar, baVar2.a(obj, aVar3).f11364c, j6 + aVar.c());
                    obj = a5.first;
                    j5 = ((Long) a5.second).longValue();
                } else {
                    j5 = j6;
                }
                i4 = -1;
                z5 = false;
                z4 = false;
                z3 = true;
            } else {
                ba.c cVar4 = cVar;
                aVar2 = aVar6;
                j4 = j6;
                i4 = -1;
                z5 = false;
                z4 = false;
                z3 = false;
            }
            ba.c cVar5 = cVar;
            i4 = i5;
            j4 = j6;
            aVar2 = aVar6;
            z5 = false;
            z4 = false;
            z3 = false;
        }
        if (i4 != i3) {
            Pair<Object, Long> a6 = baVar.a(cVar, aVar, i4, -9223372036854775807L);
            obj = a6.first;
            j2 = ((Long) a6.second).longValue();
            afVar2 = afVar;
            j3 = -9223372036854775807L;
        } else {
            afVar2 = afVar;
            j3 = j2;
        }
        p.a a7 = afVar2.a(baVar2, obj, j2);
        boolean z12 = a7.f12833e == i3 || (aVar2.f12833e != i3 && a7.f12830b >= aVar2.f12833e);
        boolean equals = aVar2.f12829a.equals(obj);
        boolean z13 = equals && !aVar2.a() && !a7.a() && z12;
        baVar2.a(obj, aVar3);
        if (equals && !a2 && j6 == j3 && ((a7.a() && aVar3.e(a7.f12830b)) || (aVar2.a() && aVar3.e(aVar2.f12830b)))) {
            z11 = true;
        }
        if (z13 || z11) {
            a7 = aVar2;
        }
        if (a7.a()) {
            if (a7.equals(aVar2)) {
                j2 = alVar2.s;
            } else {
                baVar2.a(a7.f12829a, aVar3);
                j2 = a7.f12831c == aVar3.b(a7.f12830b) ? aVar.f() : 0;
            }
        }
        return new f(a7, j2, j3, z5, z4, z3);
    }

    static Object a(ba.c cVar, ba.a aVar, int i2, boolean z2, Object obj, ba baVar, ba baVar2) {
        int c2 = baVar.c(obj);
        int c3 = baVar.c();
        int i3 = c2;
        int i4 = -1;
        for (int i5 = 0; i5 < c3 && i4 == -1; i5++) {
            i3 = baVar.a(i3, aVar, cVar, i2, z2);
            if (i3 == -1) {
                break;
            }
            i4 = baVar2.c(baVar.a(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return baVar2.a(i4);
    }

    private void a(float f2) {
        for (ad c2 = this.s.c(); c2 != null; c2 = c2.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c2.i().f13313c) {
                if (dVar != null) {
                    dVar.a(f2);
                }
            }
        }
    }

    private void a(int i2, boolean z2) throws p {
        ar arVar = this.f13792a[i2];
        if (!c(arVar)) {
            ad d2 = this.s.d();
            boolean z3 = d2 == this.s.c();
            k i3 = d2.i();
            at atVar = i3.f13312b[i2];
            v[] a2 = a(i3.f13313c[i2]);
            boolean z4 = J() && this.x.f11100e == 3;
            boolean z5 = !z2 && z4;
            this.J++;
            this.f13793b.add(arVar);
            arVar.a(atVar, a2, d2.f11050c[i2], this.L, z5, z3, d2.b(), d2.a());
            arVar.a(11, new ar.a() {
                public void a() {
                    s.this.f13799h.c(2);
                }

                public void a(long j) {
                    if (j >= 2000) {
                        boolean unused = s.this.H = true;
                    }
                }
            });
            this.o.a(arVar);
            if (z4) {
                arVar.e();
            }
        }
    }

    private void a(long j2, long j3) {
        this.f13799h.d(2);
        this.f13799h.a(2, j2 + j3);
    }

    private void a(am amVar, float f2, boolean z2, boolean z3) throws p {
        if (z2) {
            if (z3) {
                this.y.a(1);
            }
            this.x = this.x.a(amVar);
        }
        a(amVar.f11106b);
        for (ar arVar : this.f13792a) {
            if (arVar != null) {
                arVar.a(f2, amVar.f11106b);
            }
        }
    }

    private void a(am amVar, boolean z2) throws p {
        a(amVar, amVar.f11106b, true, z2);
    }

    private void a(ar arVar) throws p {
        if (arVar.d_() == 2) {
            arVar.l();
        }
    }

    private void a(ar arVar, long j2) {
        arVar.i();
        if (arVar instanceof com.applovin.exoplayer2.i.m) {
            ((com.applovin.exoplayer2.i.m) arVar).c(j2);
        }
    }

    private void a(av avVar) {
        this.w = avVar;
    }

    private void a(ba baVar, ba baVar2) {
        if (!baVar.d() || !baVar2.d()) {
            for (int size = this.p.size() - 1; size >= 0; size--) {
                if (!a(this.p.get(size), baVar, baVar2, this.E, this.F, this.k, this.l)) {
                    this.p.get(size).f13809a.a(false);
                    this.p.remove(size);
                }
            }
            Collections.sort(this.p);
        }
    }

    private void a(ba baVar, p.a aVar, ba baVar2, p.a aVar2, long j2) {
        if (!baVar.d() && a(baVar, aVar)) {
            baVar.a(baVar.a(aVar.f12829a, this.l).f11364c, this.k);
            this.u.a((ab.e) ai.a(this.k.l));
            if (j2 != -9223372036854775807L) {
                this.u.a(a(baVar, aVar.f12829a, j2));
                return;
            }
            Object obj = this.k.f11374b;
            Object obj2 = null;
            if (!baVar2.d()) {
                obj2 = baVar2.a(baVar2.a(aVar2.f12829a, this.l).f11364c, this.k).f11374b;
            }
            if (!ai.a(obj2, obj)) {
                this.u.a(-9223372036854775807L);
            }
        } else if (this.o.d().f11106b != this.x.n.f11106b) {
            this.o.a(this.x.n);
        }
    }

    private static void a(ba baVar, c cVar, ba.c cVar2, ba.a aVar) {
        int i2 = baVar.a(baVar.a(cVar.f13812d, aVar).f11364c, cVar2).q;
        cVar.a(i2, aVar.f11365d != -9223372036854775807L ? aVar.f11365d - 1 : Long.MAX_VALUE, baVar.a(i2, aVar, true).f11363b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.exoplayer2.ba r25, boolean r26) throws com.applovin.exoplayer2.p {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            com.applovin.exoplayer2.al r2 = r11.x
            com.applovin.exoplayer2.s$g r3 = r11.K
            com.applovin.exoplayer2.af r4 = r11.s
            int r5 = r11.E
            boolean r6 = r11.F
            com.applovin.exoplayer2.ba$c r7 = r11.k
            com.applovin.exoplayer2.ba$a r8 = r11.l
            r1 = r25
            com.applovin.exoplayer2.s$f r7 = a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.applovin.exoplayer2.h.p$a r8 = r7.f13820a
            long r9 = r7.f13822c
            boolean r0 = r7.f13823d
            long r13 = r7.f13821b
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.h.p$a r1 = r1.f11097b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            com.applovin.exoplayer2.al r1 = r11.x
            long r1 = r1.s
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f13824e     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x0053
            com.applovin.exoplayer2.al r1 = r11.x     // Catch:{ all -> 0x0125 }
            int r1 = r1.f11100e     // Catch:{ all -> 0x0125 }
            if (r1 == r15) goto L_0x0050
            r11.b((int) r4)     // Catch:{ all -> 0x0125 }
        L_0x0050:
            r11.a((boolean) r5, (boolean) r5, (boolean) r5, (boolean) r15)     // Catch:{ all -> 0x0125 }
        L_0x0053:
            if (r16 != 0) goto L_0x006f
            com.applovin.exoplayer2.af r1 = r11.s     // Catch:{ all -> 0x0125 }
            long r3 = r11.L     // Catch:{ all -> 0x0125 }
            long r21 = r24.t()     // Catch:{ all -> 0x0125 }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = 0
            r5 = r21
            boolean r0 = r1.a((com.applovin.exoplayer2.ba) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0122 }
            if (r0 != 0) goto L_0x00a1
            r11.f((boolean) r15)     // Catch:{ all -> 0x0122 }
            goto L_0x00a1
        L_0x006f:
            r15 = 0
            r20 = 4
            boolean r1 = r25.d()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00a1
            com.applovin.exoplayer2.af r1 = r11.s     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ad r1 = r1.c()     // Catch:{ all -> 0x0122 }
        L_0x007e:
            if (r1 == 0) goto L_0x009c
            com.applovin.exoplayer2.ae r2 = r1.f11053f     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.h.p$a r2 = r2.f11056a     // Catch:{ all -> 0x0122 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0122 }
            if (r2 == 0) goto L_0x0097
            com.applovin.exoplayer2.af r2 = r11.s     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ae r3 = r1.f11053f     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ae r2 = r2.a((com.applovin.exoplayer2.ba) r12, (com.applovin.exoplayer2.ae) r3)     // Catch:{ all -> 0x0122 }
            r1.f11053f = r2     // Catch:{ all -> 0x0122 }
            r1.j()     // Catch:{ all -> 0x0122 }
        L_0x0097:
            com.applovin.exoplayer2.ad r1 = r1.g()     // Catch:{ all -> 0x0122 }
            goto L_0x007e
        L_0x009c:
            long r0 = r11.a((com.applovin.exoplayer2.h.p.a) r8, (long) r13, (boolean) r0)     // Catch:{ all -> 0x0122 }
            r13 = r0
        L_0x00a1:
            com.applovin.exoplayer2.al r0 = r11.x
            com.applovin.exoplayer2.ba r4 = r0.f11096a
            com.applovin.exoplayer2.al r0 = r11.x
            com.applovin.exoplayer2.h.p$a r5 = r0.f11097b
            boolean r0 = r7.f13825f
            if (r0 == 0) goto L_0x00af
            r6 = r13
            goto L_0x00b1
        L_0x00af:
            r6 = r18
        L_0x00b1:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c3
            com.applovin.exoplayer2.al r0 = r11.x
            long r0 = r0.f11098c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0103
        L_0x00c3:
            com.applovin.exoplayer2.al r0 = r11.x
            com.applovin.exoplayer2.h.p$a r0 = r0.f11097b
            java.lang.Object r0 = r0.f12829a
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.ba r1 = r1.f11096a
            if (r16 == 0) goto L_0x00e4
            if (r26 == 0) goto L_0x00e4
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x00e4
            com.applovin.exoplayer2.ba$a r2 = r11.l
            com.applovin.exoplayer2.ba$a r1 = r1.a((java.lang.Object) r0, (com.applovin.exoplayer2.ba.a) r2)
            boolean r1 = r1.f11367f
            if (r1 != 0) goto L_0x00e4
            r23 = 1
            goto L_0x00e6
        L_0x00e4:
            r23 = 0
        L_0x00e6:
            com.applovin.exoplayer2.al r1 = r11.x
            long r5 = r1.f11099d
            int r0 = r12.c((java.lang.Object) r0)
            r1 = -1
            if (r0 != r1) goto L_0x00f3
            r17 = 4
        L_0x00f3:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.exoplayer2.al r0 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.x = r0
        L_0x0103:
            r24.A()
            com.applovin.exoplayer2.al r0 = r11.x
            com.applovin.exoplayer2.ba r0 = r0.f11096a
            r11.a((com.applovin.exoplayer2.ba) r12, (com.applovin.exoplayer2.ba) r0)
            com.applovin.exoplayer2.al r0 = r11.x
            com.applovin.exoplayer2.al r0 = r0.a((com.applovin.exoplayer2.ba) r12)
            r11.x = r0
            boolean r0 = r25.d()
            if (r0 != 0) goto L_0x011e
            r6 = 0
            r11.K = r6
        L_0x011e:
            r11.h(r15)
            return
        L_0x0122:
            r0 = move-exception
            r6 = 0
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            r15 = 0
            r20 = 4
        L_0x0129:
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.ba r4 = r1.f11096a
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.h.p$a r5 = r1.f11097b
            boolean r1 = r7.f13825f
            if (r1 == 0) goto L_0x0137
            r18 = r13
        L_0x0137:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x014c
            com.applovin.exoplayer2.al r1 = r11.x
            long r1 = r1.f11098c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x018c
        L_0x014c:
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.h.p$a r1 = r1.f11097b
            java.lang.Object r1 = r1.f12829a
            com.applovin.exoplayer2.al r2 = r11.x
            com.applovin.exoplayer2.ba r2 = r2.f11096a
            if (r16 == 0) goto L_0x016d
            if (r26 == 0) goto L_0x016d
            boolean r3 = r2.d()
            if (r3 != 0) goto L_0x016d
            com.applovin.exoplayer2.ba$a r3 = r11.l
            com.applovin.exoplayer2.ba$a r2 = r2.a((java.lang.Object) r1, (com.applovin.exoplayer2.ba.a) r3)
            boolean r2 = r2.f11367f
            if (r2 != 0) goto L_0x016d
            r23 = 1
            goto L_0x016f
        L_0x016d:
            r23 = 0
        L_0x016f:
            com.applovin.exoplayer2.al r2 = r11.x
            long r5 = r2.f11099d
            int r1 = r12.c((java.lang.Object) r1)
            r2 = -1
            if (r1 != r2) goto L_0x017c
            r17 = 4
        L_0x017c:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.exoplayer2.al r1 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.x = r1
        L_0x018c:
            r24.A()
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.ba r1 = r1.f11096a
            r11.a((com.applovin.exoplayer2.ba) r12, (com.applovin.exoplayer2.ba) r1)
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.al r1 = r1.a((com.applovin.exoplayer2.ba) r12)
            r11.x = r1
            boolean r1 = r25.d()
            if (r1 != 0) goto L_0x01a6
            r11.K = r15
        L_0x01a6:
            r1 = 0
            r11.h(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(com.applovin.exoplayer2.ba, boolean):void");
    }

    private synchronized void a(Supplier<Boolean> supplier, long j2) {
        long a2 = this.q.a() + j2;
        boolean z2 = false;
        while (!supplier.get().booleanValue() && j2 > 0) {
            try {
                this.q.c();
                wait(j2);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            j2 = a2 - this.q.a();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    private void a(ad adVar, k kVar) {
        this.f13797f.a(this.f13792a, adVar, kVar.f13313c);
    }

    private void a(z zVar) throws p {
        this.y.a(1);
        a(this.t.a(zVar), false);
    }

    private void a(a aVar) throws p {
        this.y.a(1);
        if (aVar.f13803c != -1) {
            this.K = new g(new ap(aVar.f13801a, aVar.f13802b), aVar.f13803c, aVar.f13804d);
        }
        a(this.t.a((List<ah.c>) aVar.f13801a, aVar.f13802b), false);
    }

    private void a(a aVar, int i2) throws p {
        this.y.a(1);
        ah ahVar = this.t;
        if (i2 == -1) {
            i2 = ahVar.b();
        }
        a(ahVar.a(i2, (List<ah.c>) aVar.f13801a, aVar.f13802b), false);
    }

    private void a(b bVar) throws p {
        this.y.a(1);
        a(this.t.a(bVar.f13805a, bVar.f13806b, bVar.f13807c, bVar.f13808d), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae A[Catch:{ all -> 0x0152 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.exoplayer2.s.g r20) throws com.applovin.exoplayer2.p {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            com.applovin.exoplayer2.s$d r1 = r11.y
            r8 = 1
            r1.a((int) r8)
            com.applovin.exoplayer2.al r1 = r11.x
            com.applovin.exoplayer2.ba r1 = r1.f11096a
            int r4 = r11.E
            boolean r5 = r11.F
            com.applovin.exoplayer2.ba$c r6 = r11.k
            com.applovin.exoplayer2.ba$a r7 = r11.l
            r3 = 1
            r2 = r20
            android.util.Pair r1 = a((com.applovin.exoplayer2.ba) r1, (com.applovin.exoplayer2.s.g) r2, (boolean) r3, (int) r4, (boolean) r5, (com.applovin.exoplayer2.ba.c) r6, (com.applovin.exoplayer2.ba.a) r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004b
            com.applovin.exoplayer2.al r7 = r11.x
            com.applovin.exoplayer2.ba r7 = r7.f11096a
            android.util.Pair r7 = r11.a((com.applovin.exoplayer2.ba) r7)
            java.lang.Object r9 = r7.first
            com.applovin.exoplayer2.h.p$a r9 = (com.applovin.exoplayer2.h.p.a) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            com.applovin.exoplayer2.al r7 = r11.x
            com.applovin.exoplayer2.ba r7 = r7.f11096a
            boolean r7 = r7.d()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L_0x0047:
            r4 = r12
            r12 = r17
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f13828c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x005d
            r9 = r4
            goto L_0x005e
        L_0x005d:
            r9 = r12
        L_0x005e:
            com.applovin.exoplayer2.af r14 = r11.s
            com.applovin.exoplayer2.al r15 = r11.x
            com.applovin.exoplayer2.ba r15 = r15.f11096a
            com.applovin.exoplayer2.h.p$a r7 = r14.a((com.applovin.exoplayer2.ba) r15, (java.lang.Object) r7, (long) r12)
            boolean r14 = r7.a()
            if (r14 == 0) goto L_0x0093
            com.applovin.exoplayer2.al r4 = r11.x
            com.applovin.exoplayer2.ba r4 = r4.f11096a
            java.lang.Object r5 = r7.f12829a
            com.applovin.exoplayer2.ba$a r12 = r11.l
            r4.a((java.lang.Object) r5, (com.applovin.exoplayer2.ba.a) r12)
            com.applovin.exoplayer2.ba$a r4 = r11.l
            int r5 = r7.f12830b
            int r4 = r4.b((int) r5)
            int r5 = r7.f12831c
            if (r4 != r5) goto L_0x008d
            com.applovin.exoplayer2.ba$a r4 = r11.l
            long r4 = r4.f()
            r12 = r4
            goto L_0x008e
        L_0x008d:
            r12 = r2
        L_0x008e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto L_0x00a1
        L_0x0093:
            long r14 = r0.f13828c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x009b
            r4 = 1
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a1:
            com.applovin.exoplayer2.al r7 = r11.x     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.ba r7 = r7.f11096a     // Catch:{ all -> 0x0152 }
            boolean r7 = r7.d()     // Catch:{ all -> 0x0152 }
            if (r7 == 0) goto L_0x00ae
            r11.K = r0     // Catch:{ all -> 0x0152 }
            goto L_0x00bd
        L_0x00ae:
            r0 = 4
            if (r1 != 0) goto L_0x00c0
            com.applovin.exoplayer2.al r1 = r11.x     // Catch:{ all -> 0x0152 }
            int r1 = r1.f11100e     // Catch:{ all -> 0x0152 }
            if (r1 == r8) goto L_0x00ba
            r11.b((int) r0)     // Catch:{ all -> 0x0152 }
        L_0x00ba:
            r11.a((boolean) r6, (boolean) r8, (boolean) r6, (boolean) r8)     // Catch:{ all -> 0x0152 }
        L_0x00bd:
            r7 = r4
            goto L_0x013f
        L_0x00c0:
            com.applovin.exoplayer2.al r1 = r11.x     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.h.p$a r1 = r1.f11097b     // Catch:{ all -> 0x0152 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0152 }
            if (r1 == 0) goto L_0x0115
            com.applovin.exoplayer2.af r1 = r11.s     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.ad r1 = r1.c()     // Catch:{ all -> 0x0152 }
            if (r1 == 0) goto L_0x00e3
            boolean r7 = r1.f11051d     // Catch:{ all -> 0x0152 }
            if (r7 == 0) goto L_0x00e3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            com.applovin.exoplayer2.h.n r1 = r1.f11048a     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.av r2 = r11.w     // Catch:{ all -> 0x0152 }
            long r1 = r1.a((long) r4, (com.applovin.exoplayer2.av) r2)     // Catch:{ all -> 0x0152 }
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            long r14 = com.applovin.exoplayer2.h.a((long) r1)     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.al r3 = r11.x     // Catch:{ all -> 0x0152 }
            long r6 = r3.s     // Catch:{ all -> 0x0152 }
            long r6 = com.applovin.exoplayer2.h.a((long) r6)     // Catch:{ all -> 0x0152 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0116
            com.applovin.exoplayer2.al r3 = r11.x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f11100e     // Catch:{ all -> 0x0152 }
            r6 = 2
            if (r3 == r6) goto L_0x0102
            com.applovin.exoplayer2.al r3 = r11.x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f11100e     // Catch:{ all -> 0x0152 }
            r6 = 3
            if (r3 != r6) goto L_0x0116
        L_0x0102:
            com.applovin.exoplayer2.al r0 = r11.x     // Catch:{ all -> 0x0152 }
            long r7 = r0.s     // Catch:{ all -> 0x0152 }
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.applovin.exoplayer2.al r0 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.x = r0
            return
        L_0x0115:
            r1 = r4
        L_0x0116:
            com.applovin.exoplayer2.al r3 = r11.x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f11100e     // Catch:{ all -> 0x0152 }
            if (r3 != r0) goto L_0x011e
            r0 = 1
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            long r14 = r11.a((com.applovin.exoplayer2.h.p.a) r9, (long) r1, (boolean) r0)     // Catch:{ all -> 0x0152 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r8 = 0
        L_0x0129:
            r8 = r8 | r10
            com.applovin.exoplayer2.al r0 = r11.x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.ba r2 = r0.f11096a     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.al r0 = r11.x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.ba r4 = r0.f11096a     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.al r0 = r11.x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.h.p$a r5 = r0.f11097b     // Catch:{ all -> 0x014e }
            r1 = r19
            r3 = r9
            r6 = r12
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x014e }
            r10 = r8
            r7 = r14
        L_0x013f:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.applovin.exoplayer2.al r0 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.x = r0
            return
        L_0x014e:
            r0 = move-exception
            r10 = r8
            r7 = r14
            goto L_0x0154
        L_0x0152:
            r0 = move-exception
            r7 = r4
        L_0x0154:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            com.applovin.exoplayer2.al r1 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.x = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(com.applovin.exoplayer2.s$g):void");
    }

    private void a(IOException iOException, int i2) {
        p a2 = p.a(iOException, i2);
        ad c2 = this.s.c();
        if (c2 != null) {
            a2 = a2.a((com.applovin.exoplayer2.h.o) c2.f11053f.f11056a);
        }
        q.c("ExoPlayerImplInternal", "Playback error", a2);
        a(false, false);
        this.x = this.x.a(a2);
    }

    private void a(boolean z2, int i2, boolean z3, int i3) throws p {
        this.y.a(z3 ? 1 : 0);
        this.y.c(i3);
        this.x = this.x.a(z2, i2);
        this.C = false;
        b(z2);
        if (!J()) {
            j();
            l();
            return;
        }
        if (this.x.f11100e == 3) {
            i();
        } else if (this.x.f11100e != 2) {
            return;
        }
        this.f13799h.c(2);
    }

    private void a(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.G != z2) {
            this.G = z2;
            if (!z2) {
                for (ar arVar : this.f13792a) {
                    if (!c(arVar) && this.f13793b.remove(arVar)) {
                        arVar.n();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z2, boolean z3) {
        a(z2 || !this.G, false, true, false);
        this.y.a(z3 ? 1 : 0);
        this.f13797f.b();
        b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            r34 = this;
            r1 = r34
            com.applovin.exoplayer2.l.o r0 = r1.f13799h
            r2 = 2
            r0.d(r2)
            r2 = 0
            r1.O = r2
            r3 = 0
            r1.C = r3
            com.applovin.exoplayer2.m r0 = r1.o
            r0.b()
            r4 = 0
            r1.L = r4
            com.applovin.exoplayer2.ar[] r4 = r1.f13792a
            int r5 = r4.length
            r6 = 0
        L_0x001b:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0030
            r0 = r4[r6]
            r1.b((com.applovin.exoplayer2.ar) r0)     // Catch:{ p -> 0x0027, RuntimeException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            goto L_0x0028
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            java.lang.String r8 = "Disable failed."
            com.applovin.exoplayer2.l.q.c(r7, r8, r0)
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0030:
            if (r35 == 0) goto L_0x0050
            com.applovin.exoplayer2.ar[] r4 = r1.f13792a
            int r5 = r4.length
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x0050
            r0 = r4[r6]
            java.util.Set<com.applovin.exoplayer2.ar> r8 = r1.f13793b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x004d
            r0.n()     // Catch:{ RuntimeException -> 0x0046 }
            goto L_0x004d
        L_0x0046:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.applovin.exoplayer2.l.q.c(r7, r0, r8)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0050:
            r1.J = r3
            com.applovin.exoplayer2.al r0 = r1.x
            com.applovin.exoplayer2.h.p$a r0 = r0.f11097b
            com.applovin.exoplayer2.al r4 = r1.x
            long r4 = r4.s
            com.applovin.exoplayer2.al r6 = r1.x
            com.applovin.exoplayer2.h.p$a r6 = r6.f11097b
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0074
            com.applovin.exoplayer2.al r6 = r1.x
            com.applovin.exoplayer2.ba$a r7 = r1.l
            boolean r6 = a((com.applovin.exoplayer2.al) r6, (com.applovin.exoplayer2.ba.a) r7)
            if (r6 == 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            com.applovin.exoplayer2.al r6 = r1.x
            long r6 = r6.s
            goto L_0x0078
        L_0x0074:
            com.applovin.exoplayer2.al r6 = r1.x
            long r6 = r6.f11098c
        L_0x0078:
            if (r36 == 0) goto L_0x00ac
            r1.K = r2
            com.applovin.exoplayer2.al r0 = r1.x
            com.applovin.exoplayer2.ba r0 = r0.f11096a
            android.util.Pair r0 = r1.a((com.applovin.exoplayer2.ba) r0)
            java.lang.Object r4 = r0.first
            com.applovin.exoplayer2.h.p$a r4 = (com.applovin.exoplayer2.h.p.a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.applovin.exoplayer2.al r0 = r1.x
            com.applovin.exoplayer2.h.p$a r0 = r0.f11097b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r22 = r4
            r30 = r5
            r12 = r7
            goto L_0x00b2
        L_0x00a6:
            r22 = r4
            r30 = r5
            r12 = r7
            goto L_0x00b1
        L_0x00ac:
            r22 = r0
            r30 = r4
            r12 = r6
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            com.applovin.exoplayer2.af r4 = r1.s
            r4.g()
            r1.D = r3
            com.applovin.exoplayer2.al r3 = new com.applovin.exoplayer2.al
            com.applovin.exoplayer2.al r4 = r1.x
            com.applovin.exoplayer2.ba r10 = r4.f11096a
            com.applovin.exoplayer2.al r4 = r1.x
            int r4 = r4.f11100e
            if (r38 == 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            com.applovin.exoplayer2.al r2 = r1.x
            com.applovin.exoplayer2.p r2 = r2.f11101f
        L_0x00ca:
            r17 = r2
            r18 = 0
            if (r0 == 0) goto L_0x00d3
            com.applovin.exoplayer2.h.ad r2 = com.applovin.exoplayer2.h.ad.f12752a
            goto L_0x00d7
        L_0x00d3:
            com.applovin.exoplayer2.al r2 = r1.x
            com.applovin.exoplayer2.h.ad r2 = r2.f11103h
        L_0x00d7:
            r19 = r2
            if (r0 == 0) goto L_0x00de
            com.applovin.exoplayer2.j.k r2 = r1.f13796e
            goto L_0x00e2
        L_0x00de:
            com.applovin.exoplayer2.al r2 = r1.x
            com.applovin.exoplayer2.j.k r2 = r2.i
        L_0x00e2:
            r20 = r2
            if (r0 == 0) goto L_0x00eb
            com.applovin.exoplayer2.common.a.s r0 = com.applovin.exoplayer2.common.a.s.g()
            goto L_0x00ef
        L_0x00eb:
            com.applovin.exoplayer2.al r0 = r1.x
            java.util.List<com.applovin.exoplayer2.g.a> r0 = r0.j
        L_0x00ef:
            r21 = r0
            com.applovin.exoplayer2.al r0 = r1.x
            boolean r0 = r0.l
            r23 = r0
            com.applovin.exoplayer2.al r0 = r1.x
            int r0 = r0.m
            r24 = r0
            com.applovin.exoplayer2.al r0 = r1.x
            com.applovin.exoplayer2.am r0 = r0.n
            r25 = r0
            r28 = 0
            boolean r0 = r1.I
            r32 = r0
            r33 = 0
            r9 = r3
            r11 = r22
            r14 = r30
            r16 = r4
            r26 = r30
            r9.<init>(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r33)
            r1.x = r3
            if (r37 == 0) goto L_0x0120
            com.applovin.exoplayer2.ah r0 = r1.t
            r0.c()
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(boolean, boolean, boolean, boolean):void");
    }

    private void a(boolean[] zArr) throws p {
        ad d2 = this.s.d();
        k i2 = d2.i();
        for (int i3 = 0; i3 < this.f13792a.length; i3++) {
            if (!i2.a(i3) && this.f13793b.remove(this.f13792a[i3])) {
                this.f13792a[i3].n();
            }
        }
        for (int i4 = 0; i4 < this.f13792a.length; i4++) {
            if (i2.a(i4)) {
                a(i4, zArr[i4]);
            }
        }
        d2.f11054g = true;
    }

    private static boolean a(al alVar, ba.a aVar) {
        p.a aVar2 = alVar.f11097b;
        ba baVar = alVar.f11096a;
        return baVar.d() || baVar.a(aVar2.f12829a, aVar).f11367f;
    }

    private boolean a(ar arVar, ad adVar) {
        ad g2 = adVar.g();
        return adVar.f11053f.f11061f && g2.f11051d && ((arVar instanceof com.applovin.exoplayer2.i.m) || arVar.h() >= g2.b());
    }

    private boolean a(ba baVar, p.a aVar) {
        if (aVar.a() || baVar.d()) {
            return false;
        }
        baVar.a(baVar.a(aVar.f12829a, this.l).f11364c, this.k);
        return this.k.e() && this.k.j && this.k.f11379g != -9223372036854775807L;
    }

    private static boolean a(c cVar, ba baVar, ba baVar2, int i2, boolean z2, ba.c cVar2, ba.a aVar) {
        c cVar3 = cVar;
        ba baVar3 = baVar;
        ba baVar4 = baVar2;
        ba.c cVar4 = cVar2;
        ba.a aVar2 = aVar;
        if (cVar3.f13812d == null) {
            Pair<Object, Long> a2 = a(baVar, new g(cVar3.f13809a.a(), cVar3.f13809a.g(), cVar3.f13809a.f() == Long.MIN_VALUE ? -9223372036854775807L : h.b(cVar3.f13809a.f())), false, i2, z2, cVar2, aVar);
            if (a2 == null) {
                return false;
            }
            cVar.a(baVar3.c(a2.first), ((Long) a2.second).longValue(), a2.first);
            if (cVar3.f13809a.f() == Long.MIN_VALUE) {
                a(baVar3, cVar, cVar4, aVar2);
            }
            return true;
        }
        int c2 = baVar3.c(cVar3.f13812d);
        if (c2 == -1) {
            return false;
        }
        if (cVar3.f13809a.f() == Long.MIN_VALUE) {
            a(baVar3, cVar, cVar4, aVar2);
            return true;
        }
        cVar3.f13810b = c2;
        baVar4.a(cVar3.f13812d, aVar2);
        if (aVar2.f11367f && baVar4.a(aVar2.f11364c, cVar4).p == baVar4.c(cVar3.f13812d)) {
            Pair<Object, Long> a3 = baVar.a(cVar2, aVar, baVar3.a(cVar3.f13812d, aVar2).f11364c, cVar3.f13811c + aVar.c());
            cVar.a(baVar3.c(a3.first), ((Long) a3.second).longValue(), a3.first);
        }
        return true;
    }

    private static v[] a(com.applovin.exoplayer2.j.d dVar) {
        int e2 = dVar != null ? dVar.e() : 0;
        v[] vVarArr = new v[e2];
        for (int i2 = 0; i2 < e2; i2++) {
            vVarArr[i2] = dVar.a(i2);
        }
        return vVarArr;
    }

    private void b(int i2) {
        if (this.x.f11100e != i2) {
            this.x = this.x.a(i2);
        }
    }

    private void b(int i2, int i3, z zVar) throws p {
        this.y.a(1);
        a(this.t.a(i2, i3, zVar), false);
    }

    private void b(long j2) throws p {
        ad c2 = this.s.c();
        if (c2 != null) {
            j2 = c2.a(j2);
        }
        this.L = j2;
        this.o.a(j2);
        for (ar arVar : this.f13792a) {
            if (c(arVar)) {
                arVar.a(this.L);
            }
        }
        r();
    }

    private void b(am amVar) throws p {
        this.o.a(amVar);
        a(this.o.d(), true);
    }

    private void b(ao aoVar) throws p {
        if (aoVar.f() == -9223372036854775807L) {
            c(aoVar);
        } else if (this.x.f11096a.d()) {
            this.p.add(new c(aoVar));
        } else {
            c cVar = new c(aoVar);
            if (a(cVar, this.x.f11096a, this.x.f11096a, this.E, this.F, this.k, this.l)) {
                this.p.add(cVar);
                Collections.sort(this.p);
                return;
            }
            aoVar.a(false);
        }
    }

    private void b(ar arVar) throws p {
        if (c(arVar)) {
            this.o.b(arVar);
            a(arVar);
            arVar.m();
            this.J--;
        }
    }

    private void b(boolean z2) {
        for (ad c2 = this.s.c(); c2 != null; c2 = c2.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c2.i().f13313c) {
                if (dVar != null) {
                    dVar.a(z2);
                }
            }
        }
    }

    private boolean b(long j2, long j3) {
        if (this.I && this.H) {
            return false;
        }
        a(j2, j3);
        return true;
    }

    private void c(int i2) throws p {
        this.E = i2;
        if (!this.s.a(this.x.f11096a, i2)) {
            f(true);
        }
        h(false);
    }

    private void c(long j2) {
        for (ar arVar : this.f13792a) {
            if (arVar.f() != null) {
                a(arVar, j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r3 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r3.f13810b > r0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r3.f13810b != r0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.f13811c <= r8) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 <= 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r1 >= r7.p.size()) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r3 = r7.p.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r3 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r3.f13812d == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r3.f13810b < r0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r3.f13810b != r0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r3.f13811c > r8) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r1 >= r7.p.size()) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r3 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r3.f13812d == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r3.f13810b != r0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r3.f13811c <= r8) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r3.f13811c > r10) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        c(r3.f13809a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r3.f13809a.h() != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3.f13809a.j() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r7.p.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r1 >= r7.p.size()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r3 = r7.p.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d2, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r7.p.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r7.M = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r1 > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r3 = r7.p.get(r1 - 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(long r8, long r10) throws com.applovin.exoplayer2.p {
        /*
            r7 = this;
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r0 = r7.p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ed
            com.applovin.exoplayer2.al r0 = r7.x
            com.applovin.exoplayer2.h.p$a r0 = r0.f11097b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ed
        L_0x0014:
            boolean r0 = r7.N
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.N = r0
        L_0x001e:
            com.applovin.exoplayer2.al r0 = r7.x
            com.applovin.exoplayer2.ba r0 = r0.f11096a
            com.applovin.exoplayer2.al r1 = r7.x
            com.applovin.exoplayer2.h.p$a r1 = r1.f11097b
            java.lang.Object r1 = r1.f12829a
            int r0 = r0.c((java.lang.Object) r1)
            int r1 = r7.M
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r2 = r7.p
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0046
        L_0x003b:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.s.c) r3
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            if (r3 == 0) goto L_0x005c
            int r4 = r3.f13810b
            if (r4 > r0) goto L_0x0057
            int r4 = r3.f13810b
            if (r4 != r0) goto L_0x005c
            long r3 = r3.f13811c
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x005c
        L_0x0057:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0046
            goto L_0x003b
        L_0x005c:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x006d
        L_0x0064:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            java.lang.Object r3 = r3.get(r1)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.s.c) r3
            goto L_0x006e
        L_0x006d:
            r3 = r2
        L_0x006e:
            if (r3 == 0) goto L_0x008d
            java.lang.Object r4 = r3.f13812d
            if (r4 == 0) goto L_0x008d
            int r4 = r3.f13810b
            if (r4 < r0) goto L_0x0082
            int r4 = r3.f13810b
            if (r4 != r0) goto L_0x008d
            long r4 = r3.f13811c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x008d
        L_0x0082:
            int r1 = r1 + 1
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x006d
            goto L_0x0064
        L_0x008d:
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.f13812d
            if (r4 == 0) goto L_0x00eb
            int r4 = r3.f13810b
            if (r4 != r0) goto L_0x00eb
            long r4 = r3.f13811c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00eb
            long r4 = r3.f13811c
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            com.applovin.exoplayer2.ao r4 = r3.f13809a     // Catch:{ all -> 0x00d4 }
            r7.c((com.applovin.exoplayer2.ao) r4)     // Catch:{ all -> 0x00d4 }
            com.applovin.exoplayer2.ao r4 = r3.f13809a
            boolean r4 = r4.h()
            if (r4 != 0) goto L_0x00bc
            com.applovin.exoplayer2.ao r3 = r3.f13809a
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00bc:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            r3.remove(r1)
        L_0x00c1:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00d2
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.p
            java.lang.Object r3 = r3.get(r1)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.s.c) r3
            goto L_0x008d
        L_0x00d2:
            r3 = r2
            goto L_0x008d
        L_0x00d4:
            r8 = move-exception
            com.applovin.exoplayer2.ao r9 = r3.f13809a
            boolean r9 = r9.h()
            if (r9 != 0) goto L_0x00e5
            com.applovin.exoplayer2.ao r9 = r3.f13809a
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x00ea
        L_0x00e5:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r9 = r7.p
            r9.remove(r1)
        L_0x00ea:
            throw r8
        L_0x00eb:
            r7.M = r1
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.c(long, long):void");
    }

    private void c(ao aoVar) throws p {
        if (aoVar.e() == this.j) {
            e(aoVar);
            if (this.x.f11100e == 3 || this.x.f11100e == 2) {
                this.f13799h.c(2);
                return;
            }
            return;
        }
        this.f13799h.a(15, (Object) aoVar).a();
    }

    private void c(n nVar) throws p {
        if (this.s.a(nVar)) {
            ad b2 = this.s.b();
            b2.a(this.o.d().f11106b, this.x.f11096a);
            a(b2.h(), b2.i());
            if (b2 == this.s.c()) {
                b(b2.f11053f.f11057b);
                H();
                this.x = a(this.x.f11097b, b2.f11053f.f11057b, this.x.f11098c, b2.f11053f.f11057b, false, 5);
            }
            D();
        }
    }

    private void c(boolean z2) throws p {
        this.A = z2;
        A();
        if (this.B && this.s.d() != this.s.c()) {
            f(true);
            h(false);
        }
    }

    private static boolean c(ar arVar) {
        return arVar.d_() != 0;
    }

    private long d(long j2) {
        ad b2 = this.s.b();
        if (b2 == null) {
            return 0;
        }
        return Math.max(0, j2 - b2.b(this.L));
    }

    private void d(ao aoVar) {
        Looper e2 = aoVar.e();
        if (!e2.getThread().isAlive()) {
            q.c("TAG", "Trying to send message on a dead thread.");
            aoVar.a(false);
            return;
        }
        this.q.a(e2, (Handler.Callback) null).a((Runnable) new Runnable(aoVar) {
            public final /* synthetic */ ao f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                s.this.f(this.f$1);
            }
        });
    }

    private void d(n nVar) {
        if (this.s.a(nVar)) {
            this.s.a(this.L);
            D();
        }
    }

    private void d(boolean z2) {
        if (z2 != this.I) {
            this.I = z2;
            int i2 = this.x.f11100e;
            if (z2 || i2 == 4 || i2 == 1) {
                this.x = this.x.b(z2);
            } else {
                this.f13799h.c(2);
            }
        }
    }

    private void e(ao aoVar) throws p {
        if (!aoVar.j()) {
            try {
                aoVar.b().a(aoVar.c(), aoVar.d());
            } finally {
                aoVar.a(true);
            }
        }
    }

    private void e(boolean z2) throws p {
        this.F = z2;
        if (!this.s.a(this.x.f11096a, z2)) {
            f(true);
        }
        h(false);
    }

    private void f() {
        this.y.a(this.x);
        if (this.y.f13819g) {
            this.r.onPlaybackInfoUpdate(this.y);
            this.y = new d(this.x);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(ao aoVar) {
        try {
            e(aoVar);
        } catch (p e2) {
            q.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void f(boolean z2) throws p {
        p.a aVar = this.s.c().f11053f.f11056a;
        long a2 = a(aVar, this.x.s, true, false);
        if (a2 != this.x.s) {
            this.x = a(aVar, a2, this.x.f11098c, this.x.f11099d, z2, 5);
        }
    }

    private void g() {
        this.y.a(1);
        a(false, false, false, true);
        this.f13797f.a();
        b(this.x.f11096a.d() ? 4 : 2);
        this.t.a(this.f13798g.a());
        this.f13799h.c(2);
    }

    private boolean g(boolean z2) {
        if (this.J == 0) {
            return s();
        }
        if (!z2) {
            return false;
        }
        if (!this.x.f11102g) {
            return true;
        }
        long b2 = a(this.x.f11096a, this.s.c().f11053f.f11056a) ? this.u.b() : -9223372036854775807L;
        ad b3 = this.s.b();
        return (b3.c() && b3.f11053f.i) || (b3.f11053f.f11056a.a() && !b3.f11051d) || this.f13797f.a(I(), this.o.d().f11106b, this.C, b2);
    }

    private void h() throws p {
        a(this.t.d(), true);
    }

    private void h(boolean z2) {
        ad b2 = this.s.b();
        p.a aVar = b2 == null ? this.x.f11097b : b2.f11053f.f11056a;
        boolean z3 = !this.x.k.equals(aVar);
        if (z3) {
            this.x = this.x.a(aVar);
        }
        al alVar = this.x;
        alVar.q = b2 == null ? alVar.s : b2.d();
        this.x.r = I();
        if ((z3 || z2) && b2 != null && b2.f11051d) {
            a(b2.h(), b2.i());
        }
    }

    private void i() throws p {
        this.C = false;
        this.o.a();
        for (ar arVar : this.f13792a) {
            if (c(arVar)) {
                arVar.e();
            }
        }
    }

    private void j() throws p {
        this.o.b();
        for (ar arVar : this.f13792a) {
            if (c(arVar)) {
                a(arVar);
            }
        }
    }

    private void k() throws p {
        f(true);
    }

    private void l() throws p {
        ad c2 = this.s.c();
        if (c2 != null) {
            long c3 = c2.f11051d ? c2.f11048a.c() : -9223372036854775807L;
            if (c3 != -9223372036854775807L) {
                b(c3);
                if (c3 != this.x.s) {
                    this.x = a(this.x.f11097b, c3, this.x.f11098c, c3, true, 5);
                }
            } else {
                long a2 = this.o.a(c2 != this.s.d());
                this.L = a2;
                long b2 = c2.b(a2);
                c(this.x.s, b2);
                this.x.s = b2;
            }
            this.x.q = this.s.b().d();
            this.x.r = I();
            if (this.x.l && this.x.f11100e == 3 && a(this.x.f11096a, this.x.f11097b) && this.x.n.f11106b == 1.0f) {
                float a3 = this.u.a(o(), I());
                if (this.o.d().f11106b != a3) {
                    this.o.a(this.x.n.a(a3));
                    a(this.x.n, this.o.d().f11106b, false, false);
                }
            }
        }
    }

    private void m() {
        for (ad c2 = this.s.c(); c2 != null; c2 = c2.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c2.i().f13313c) {
                if (dVar != null) {
                    dVar.h();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n() throws com.applovin.exoplayer2.p, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            com.applovin.exoplayer2.l.d r1 = r0.q
            long r1 = r1.b()
            r16.u()
            com.applovin.exoplayer2.al r3 = r0.x
            int r3 = r3.f11100e
            r5 = 1
            if (r3 == r5) goto L_0x01db
            com.applovin.exoplayer2.al r3 = r0.x
            int r3 = r3.f11100e
            r6 = 4
            if (r3 != r6) goto L_0x001b
            goto L_0x01db
        L_0x001b:
            com.applovin.exoplayer2.af r3 = r0.s
            com.applovin.exoplayer2.ad r3 = r3.c()
            r7 = 10
            if (r3 != 0) goto L_0x0029
            r0.a((long) r1, (long) r7)
            return
        L_0x0029:
            java.lang.String r9 = "doSomeWork"
            com.applovin.exoplayer2.l.ah.a(r9)
            r16.l()
            boolean r9 = r3.f11051d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00a9
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            com.applovin.exoplayer2.h.n r9 = r3.f11048a
            com.applovin.exoplayer2.al r15 = r0.x
            long r10 = r15.s
            long r7 = r0.m
            long r10 = r10 - r7
            boolean r7 = r0.n
            r9.a((long) r10, (boolean) r7)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x004f:
            com.applovin.exoplayer2.ar[] r10 = r0.f13792a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b0
            r10 = r10[r7]
            boolean r11 = c((com.applovin.exoplayer2.ar) r10)
            if (r11 != 0) goto L_0x005d
            goto L_0x00a5
        L_0x005d:
            long r4 = r0.L
            r10.a((long) r4, (long) r13)
            if (r8 == 0) goto L_0x006c
            boolean r4 = r10.A()
            if (r4 == 0) goto L_0x006c
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            com.applovin.exoplayer2.h.x[] r4 = r3.f11050c
            r4 = r4[r7]
            com.applovin.exoplayer2.h.x r5 = r10.f()
            if (r4 == r5) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 != 0) goto L_0x0084
            boolean r5 = r10.g()
            if (r5 == 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r4 != 0) goto L_0x0098
            if (r5 != 0) goto L_0x0098
            boolean r4 = r10.z()
            if (r4 != 0) goto L_0x0098
            boolean r4 = r10.A()
            if (r4 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r4 = 0
            goto L_0x0099
        L_0x0098:
            r4 = 1
        L_0x0099:
            if (r9 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            if (r4 != 0) goto L_0x00a5
            r10.k()
        L_0x00a5:
            int r7 = r7 + 1
            r5 = 1
            goto L_0x004f
        L_0x00a9:
            com.applovin.exoplayer2.h.n r4 = r3.f11048a
            r4.e_()
            r8 = 1
            r9 = 1
        L_0x00b0:
            com.applovin.exoplayer2.ae r4 = r3.f11053f
            long r4 = r4.f11060e
            if (r8 == 0) goto L_0x00cd
            boolean r7 = r3.f11051d
            if (r7 == 0) goto L_0x00cd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x00cb
            com.applovin.exoplayer2.al r7 = r0.x
            long r7 = r7.s
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x00cd
        L_0x00cb:
            r4 = 1
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            if (r4 == 0) goto L_0x00de
            boolean r5 = r0.B
            if (r5 == 0) goto L_0x00de
            r0.B = r12
            com.applovin.exoplayer2.al r5 = r0.x
            int r5 = r5.m
            r7 = 5
            r0.a((boolean) r12, (int) r5, (boolean) r12, (int) r7)
        L_0x00de:
            r5 = 3
            if (r4 == 0) goto L_0x00ee
            com.applovin.exoplayer2.ae r4 = r3.f11053f
            boolean r4 = r4.i
            if (r4 == 0) goto L_0x00ee
            r0.b((int) r6)
        L_0x00ea:
            r16.j()
            goto L_0x0135
        L_0x00ee:
            com.applovin.exoplayer2.al r4 = r0.x
            int r4 = r4.f11100e
            r7 = 2
            if (r4 != r7) goto L_0x010b
            boolean r4 = r0.g(r9)
            if (r4 == 0) goto L_0x010b
            r0.b((int) r5)
            r4 = 0
            r0.O = r4
            boolean r4 = r16.J()
            if (r4 == 0) goto L_0x0135
            r16.i()
            goto L_0x0135
        L_0x010b:
            com.applovin.exoplayer2.al r4 = r0.x
            int r4 = r4.f11100e
            if (r4 != r5) goto L_0x0135
            int r4 = r0.J
            if (r4 != 0) goto L_0x011c
            boolean r4 = r16.s()
            if (r4 == 0) goto L_0x011e
            goto L_0x0135
        L_0x011c:
            if (r9 != 0) goto L_0x0135
        L_0x011e:
            boolean r4 = r16.J()
            r0.C = r4
            r4 = 2
            r0.b((int) r4)
            boolean r4 = r0.C
            if (r4 == 0) goto L_0x00ea
            r16.m()
            com.applovin.exoplayer2.z r4 = r0.u
            r4.a()
            goto L_0x00ea
        L_0x0135:
            com.applovin.exoplayer2.al r4 = r0.x
            int r4 = r4.f11100e
            r7 = 2
            if (r4 != r7) goto L_0x0182
            r4 = 0
        L_0x013d:
            com.applovin.exoplayer2.ar[] r7 = r0.f13792a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0162
            r7 = r7[r4]
            boolean r7 = c((com.applovin.exoplayer2.ar) r7)
            if (r7 == 0) goto L_0x015f
            com.applovin.exoplayer2.ar[] r7 = r0.f13792a
            r7 = r7[r4]
            com.applovin.exoplayer2.h.x r7 = r7.f()
            com.applovin.exoplayer2.h.x[] r8 = r3.f11050c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x015f
            com.applovin.exoplayer2.ar[] r7 = r0.f13792a
            r7 = r7[r4]
            r7.k()
        L_0x015f:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0162:
            com.applovin.exoplayer2.al r3 = r0.x
            boolean r3 = r3.f11102g
            if (r3 != 0) goto L_0x0182
            com.applovin.exoplayer2.al r3 = r0.x
            long r3 = r3.r
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0182
            boolean r3 = r16.F()
            if (r3 != 0) goto L_0x017a
            goto L_0x0182
        L_0x017a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x0182:
            boolean r3 = r0.I
            com.applovin.exoplayer2.al r4 = r0.x
            boolean r4 = r4.o
            if (r3 == r4) goto L_0x0194
            com.applovin.exoplayer2.al r3 = r0.x
            boolean r4 = r0.I
            com.applovin.exoplayer2.al r3 = r3.b(r4)
            r0.x = r3
        L_0x0194:
            boolean r3 = r16.J()
            if (r3 == 0) goto L_0x01a0
            com.applovin.exoplayer2.al r3 = r0.x
            int r3 = r3.f11100e
            if (r3 == r5) goto L_0x01a7
        L_0x01a0:
            com.applovin.exoplayer2.al r3 = r0.x
            int r3 = r3.f11100e
            r4 = 2
            if (r3 != r4) goto L_0x01b0
        L_0x01a7:
            r3 = 10
            boolean r1 = r0.b(r1, r3)
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x01c7
        L_0x01b0:
            int r3 = r0.J
            if (r3 == 0) goto L_0x01c0
            com.applovin.exoplayer2.al r3 = r0.x
            int r3 = r3.f11100e
            if (r3 == r6) goto L_0x01c0
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.a((long) r1, (long) r3)
            goto L_0x01c6
        L_0x01c0:
            com.applovin.exoplayer2.l.o r1 = r0.f13799h
            r2 = 2
            r1.d(r2)
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            com.applovin.exoplayer2.al r2 = r0.x
            boolean r2 = r2.p
            if (r2 == r1) goto L_0x01d5
            com.applovin.exoplayer2.al r2 = r0.x
            com.applovin.exoplayer2.al r1 = r2.c(r1)
            r0.x = r1
        L_0x01d5:
            r0.H = r12
            com.applovin.exoplayer2.l.ah.a()
            return
        L_0x01db:
            com.applovin.exoplayer2.l.o r1 = r0.f13799h
            r2 = 2
            r1.d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.n():void");
    }

    private long o() {
        return a(this.x.f11096a, this.x.f11097b.f12829a, this.x.s);
    }

    private void p() {
        a(true, false, true, false);
        this.f13797f.c();
        b(1);
        this.i.quit();
        synchronized (this) {
            this.z = true;
            notifyAll();
        }
    }

    private void q() throws p {
        float f2 = this.o.d().f11106b;
        ad c2 = this.s.c();
        ad d2 = this.s.d();
        boolean z2 = true;
        while (c2 != null && c2.f11051d) {
            k b2 = c2.b(f2, this.x.f11096a);
            if (!b2.a(c2.i())) {
                af afVar = this.s;
                if (z2) {
                    ad c3 = afVar.c();
                    boolean a2 = this.s.a(c3);
                    boolean[] zArr = new boolean[this.f13792a.length];
                    long a3 = c3.a(b2, this.x.s, a2, zArr);
                    boolean z3 = (this.x.f11100e == 4 || a3 == this.x.s) ? false : true;
                    ad adVar = c3;
                    boolean[] zArr2 = zArr;
                    this.x = a(this.x.f11097b, a3, this.x.f11098c, this.x.f11099d, z3, 5);
                    if (z3) {
                        b(a3);
                    }
                    boolean[] zArr3 = new boolean[this.f13792a.length];
                    int i2 = 0;
                    while (true) {
                        ar[] arVarArr = this.f13792a;
                        if (i2 >= arVarArr.length) {
                            break;
                        }
                        ar arVar = arVarArr[i2];
                        zArr3[i2] = c(arVar);
                        x xVar = adVar.f11050c[i2];
                        if (zArr3[i2]) {
                            if (xVar != arVar.f()) {
                                b(arVar);
                            } else if (zArr2[i2]) {
                                arVar.a(this.L);
                            }
                        }
                        i2++;
                    }
                    a(zArr3);
                } else {
                    afVar.a(c2);
                    if (c2.f11051d) {
                        c2.a(b2, Math.max(c2.f11053f.f11057b, c2.b(this.L)), false);
                    }
                }
                h(true);
                if (this.x.f11100e != 4) {
                    D();
                    l();
                    this.f13799h.c(2);
                    return;
                }
                return;
            }
            if (c2 == d2) {
                z2 = false;
            }
            c2 = c2.g();
        }
    }

    private void r() {
        for (ad c2 = this.s.c(); c2 != null; c2 = c2.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c2.i().f13313c) {
                if (dVar != null) {
                    dVar.g();
                }
            }
        }
    }

    private boolean s() {
        ad c2 = this.s.c();
        long j2 = c2.f11053f.f11060e;
        return c2.f11051d && (j2 == -9223372036854775807L || this.x.s < j2 || !J());
    }

    private long t() {
        ad d2 = this.s.d();
        if (d2 == null) {
            return 0;
        }
        long a2 = d2.a();
        if (!d2.f11051d) {
            return a2;
        }
        int i2 = 0;
        while (true) {
            ar[] arVarArr = this.f13792a;
            if (i2 >= arVarArr.length) {
                return a2;
            }
            if (c(arVarArr[i2]) && this.f13792a[i2].f() == d2.f11050c[i2]) {
                long h2 = this.f13792a[i2].h();
                if (h2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                a2 = Math.max(h2, a2);
            }
            i2++;
        }
    }

    private void u() throws p, IOException {
        if (!this.x.f11096a.d() && this.t.a()) {
            v();
            w();
            x();
            z();
        }
    }

    private void v() throws p {
        ae a2;
        this.s.a(this.L);
        if (this.s.a() && (a2 = this.s.a(this.L, this.x)) != null) {
            ad a3 = this.s.a(this.f13794c, this.f13795d, this.f13797f.d(), this.t, a2, this.f13796e);
            a3.f11048a.a((n.a) this, a2.f11057b);
            if (this.s.c() == a3) {
                b(a3.b());
            }
            h(false);
        }
        if (this.D) {
            this.D = F();
            G();
            return;
        }
        D();
    }

    private void w() {
        ad d2 = this.s.d();
        if (d2 != null) {
            int i2 = 0;
            if (d2.g() == null || this.B) {
                if (d2.f11053f.i || this.B) {
                    while (true) {
                        ar[] arVarArr = this.f13792a;
                        if (i2 < arVarArr.length) {
                            ar arVar = arVarArr[i2];
                            x xVar = d2.f11050c[i2];
                            if (xVar != null && arVar.f() == xVar && arVar.g()) {
                                a(arVar, (d2.f11053f.f11060e == -9223372036854775807L || d2.f11053f.f11060e == Long.MIN_VALUE) ? -9223372036854775807L : d2.a() + d2.f11053f.f11060e);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (C()) {
                if (d2.g().f11051d || this.L >= d2.g().b()) {
                    k i3 = d2.i();
                    ad e2 = this.s.e();
                    k i4 = e2.i();
                    if (!e2.f11051d || e2.f11048a.c() == -9223372036854775807L) {
                        for (int i5 = 0; i5 < this.f13792a.length; i5++) {
                            boolean a2 = i3.a(i5);
                            boolean a3 = i4.a(i5);
                            if (a2 && !this.f13792a[i5].j()) {
                                boolean z2 = this.f13794c[i5].a() == -2;
                                at atVar = i3.f13312b[i5];
                                at atVar2 = i4.f13312b[i5];
                                if (!a3 || !atVar2.equals(atVar) || z2) {
                                    a(this.f13792a[i5], e2.b());
                                }
                            }
                        }
                        return;
                    }
                    c(e2.b());
                }
            }
        }
    }

    private void x() throws p {
        ad d2 = this.s.d();
        if (d2 != null && this.s.c() != d2 && !d2.f11054g && y()) {
            H();
        }
    }

    private boolean y() throws p {
        ad d2 = this.s.d();
        k i2 = d2.i();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            ar[] arVarArr = this.f13792a;
            if (i3 >= arVarArr.length) {
                return !z2;
            }
            ar arVar = arVarArr[i3];
            if (c(arVar)) {
                boolean z3 = arVar.f() != d2.f11050c[i3];
                if (!i2.a(i3) || z3) {
                    if (!arVar.j()) {
                        arVar.a(a(i2.f13313c[i3]), d2.f11050c[i3], d2.b(), d2.a());
                    } else if (arVar.A()) {
                        b(arVar);
                    } else {
                        z2 = true;
                    }
                }
            }
            i3++;
        }
    }

    private void z() throws p {
        boolean z2 = false;
        while (B()) {
            if (z2) {
                f();
            }
            ad c2 = this.s.c();
            ad f2 = this.s.f();
            al a2 = a(f2.f11053f.f11056a, f2.f11053f.f11057b, f2.f11053f.f11058c, f2.f11053f.f11057b, true, 0);
            this.x = a2;
            a(a2.f11096a, f2.f11053f.f11056a, this.x.f11096a, c2.f11053f.f11056a, -9223372036854775807L);
            A();
            l();
            z2 = true;
        }
    }

    public void a() {
        this.f13799h.b(0).a();
    }

    public void a(int i2) {
        this.f13799h.a(11, i2, 0).a();
    }

    public void a(int i2, int i3, z zVar) {
        this.f13799h.a(20, i2, i3, zVar).a();
    }

    public void a(long j2) {
        this.P = j2;
    }

    public void a(am amVar) {
        this.f13799h.a(16, (Object) amVar).a();
    }

    public synchronized void a(ao aoVar) {
        if (!this.z) {
            if (this.i.isAlive()) {
                this.f13799h.a(14, (Object) aoVar).a();
                return;
            }
        }
        q.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        aoVar.a(false);
    }

    public void a(ba baVar, int i2, long j2) {
        this.f13799h.a(3, (Object) new g(baVar, i2, j2)).a();
    }

    public void a(n nVar) {
        this.f13799h.a(8, (Object) nVar).a();
    }

    public void a(List<ah.c> list, int i2, long j2, z zVar) {
        this.f13799h.a(17, (Object) new a(list, zVar, i2, j2)).a();
    }

    public void a(boolean z2) {
        this.f13799h.a(12, z2 ? 1 : 0, 0).a();
    }

    public void a(boolean z2, int i2) {
        this.f13799h.a(1, z2 ? 1 : 0, i2).a();
    }

    public void b() {
        this.f13799h.b(6).a();
    }

    /* renamed from: b */
    public void a(n nVar) {
        this.f13799h.a(9, (Object) nVar).a();
    }

    public synchronized boolean c() {
        if (!this.z) {
            if (this.i.isAlive()) {
                this.f13799h.c(7);
                a((Supplier<Boolean>) new Supplier() {
                    public final Object get() {
                        return s.this.K();
                    }
                }, this.v);
                return this.z;
            }
        }
        return true;
    }

    public Looper d() {
        return this.j;
    }

    public void e() {
        this.f13799h.c(22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.applovin.exoplayer2.k.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: com.applovin.exoplayer2.h.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Playback error"
            java.lang.String r1 = "ExoPlayerImplInternal"
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r4 = 1
            int r5 = r8.what     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            switch(r5) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00af;
                case 9: goto L_0x00a6;
                case 10: goto L_0x00a1;
                case 11: goto L_0x009a;
                case 12: goto L_0x008e;
                case 13: goto L_0x007e;
                case 14: goto L_0x0075;
                case 15: goto L_0x006c;
                case 16: goto L_0x0063;
                case 17: goto L_0x005a;
                case 18: goto L_0x004f;
                case 19: goto L_0x0046;
                case 20: goto L_0x0039;
                case 21: goto L_0x0030;
                case 22: goto L_0x002b;
                case 23: goto L_0x001f;
                case 24: goto L_0x0013;
                case 25: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
        L_0x000d:
            return r3
        L_0x000e:
            r7.k()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0013:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 != r4) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            r7.d((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x001f:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 == 0) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x0025:
            r8 = 0
        L_0x0026:
            r7.c((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x002b:
            r7.h()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0030:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.z r8 = (com.applovin.exoplayer2.h.z) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.h.z) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0039:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            int r6 = r8.arg2     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.z r8 = (com.applovin.exoplayer2.h.z) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.b(r5, r6, r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0046:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$b r8 = (com.applovin.exoplayer2.s.b) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.s.b) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x004f:
            java.lang.Object r5 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$a r5 = (com.applovin.exoplayer2.s.a) r5     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.s.a) r5, (int) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x005a:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$a r8 = (com.applovin.exoplayer2.s.a) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.s.a) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0063:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.am r8 = (com.applovin.exoplayer2.am) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.am) r8, (boolean) r3)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x006c:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.ao r8 = (com.applovin.exoplayer2.ao) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.d((com.applovin.exoplayer2.ao) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0075:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.ao r8 = (com.applovin.exoplayer2.ao) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.b((com.applovin.exoplayer2.ao) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x007e:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r5 == 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((boolean) r5, (java.util.concurrent.atomic.AtomicBoolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x008e:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 == 0) goto L_0x0094
            r8 = 1
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            r7.e((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x009a:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.c((int) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00a1:
            r7.q()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00a6:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.n r8 = (com.applovin.exoplayer2.h.n) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.d((com.applovin.exoplayer2.h.n) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00af:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.n r8 = (com.applovin.exoplayer2.h.n) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.c((com.applovin.exoplayer2.h.n) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00b8:
            r7.p()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            return r4
        L_0x00bc:
            r7.a((boolean) r3, (boolean) r4)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00c1:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.av r8 = (com.applovin.exoplayer2.av) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.av) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00ca:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.am r8 = (com.applovin.exoplayer2.am) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.b((com.applovin.exoplayer2.am) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00d3:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$g r8 = (com.applovin.exoplayer2.s.g) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((com.applovin.exoplayer2.s.g) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00dc:
            r7.n()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00e1:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r5 == 0) goto L_0x00e7
            r5 = 1
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            int r8 = r8.arg2     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.a((boolean) r5, (int) r8, (boolean) r4, (int) r4)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00ef:
            r7.g()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00f4:
            r8 = move-exception
            boolean r5 = r8 instanceof java.lang.IllegalStateException
            if (r5 != 0) goto L_0x00fd
            boolean r5 = r8 instanceof java.lang.IllegalArgumentException
            if (r5 == 0) goto L_0x00ff
        L_0x00fd:
            r2 = 1004(0x3ec, float:1.407E-42)
        L_0x00ff:
            com.applovin.exoplayer2.p r8 = com.applovin.exoplayer2.p.a((java.lang.RuntimeException) r8, (int) r2)
        L_0x0103:
            com.applovin.exoplayer2.l.q.c(r1, r0, r8)
            r7.a((boolean) r4, (boolean) r3)
            com.applovin.exoplayer2.al r0 = r7.x
            com.applovin.exoplayer2.al r8 = r0.a((com.applovin.exoplayer2.p) r8)
            r7.x = r8
            goto L_0x018a
        L_0x0113:
            r8 = move-exception
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x014b
        L_0x0117:
            r8 = move-exception
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x014b
        L_0x011b:
            r8 = move-exception
            int r0 = r8.f13363a
            goto L_0x014b
        L_0x011f:
            r8 = move-exception
            int r0 = r8.f11093b
            if (r0 != r4) goto L_0x0132
            boolean r0 = r8.f11092a
            if (r0 == 0) goto L_0x012d
            r0 = 3001(0xbb9, float:4.205E-42)
            r2 = 3001(0xbb9, float:4.205E-42)
            goto L_0x0144
        L_0x012d:
            r0 = 3003(0xbbb, float:4.208E-42)
            r2 = 3003(0xbbb, float:4.208E-42)
            goto L_0x0144
        L_0x0132:
            int r0 = r8.f11093b
            r1 = 4
            if (r0 != r1) goto L_0x0144
            boolean r0 = r8.f11092a
            if (r0 == 0) goto L_0x0140
            r0 = 3002(0xbba, float:4.207E-42)
            r2 = 3002(0xbba, float:4.207E-42)
            goto L_0x0144
        L_0x0140:
            r0 = 3004(0xbbc, float:4.21E-42)
            r2 = 3004(0xbbc, float:4.21E-42)
        L_0x0144:
            r7.a((java.io.IOException) r8, (int) r2)
            goto L_0x018a
        L_0x0148:
            r8 = move-exception
            int r0 = r8.f11763a
        L_0x014b:
            r7.a((java.io.IOException) r8, (int) r0)
            goto L_0x018a
        L_0x014f:
            r8 = move-exception
            int r2 = r8.f13776a
            if (r2 != r4) goto L_0x0164
            com.applovin.exoplayer2.af r2 = r7.s
            com.applovin.exoplayer2.ad r2 = r2.d()
            if (r2 == 0) goto L_0x0164
            com.applovin.exoplayer2.ae r2 = r2.f11053f
            com.applovin.exoplayer2.h.p$a r2 = r2.f11056a
            com.applovin.exoplayer2.p r8 = r8.a((com.applovin.exoplayer2.h.o) r2)
        L_0x0164:
            boolean r2 = r8.f13782g
            if (r2 == 0) goto L_0x017f
            com.applovin.exoplayer2.p r2 = r7.O
            if (r2 != 0) goto L_0x017f
            java.lang.String r0 = "Recoverable renderer error"
            com.applovin.exoplayer2.l.q.b(r1, r0, r8)
            r7.O = r8
            com.applovin.exoplayer2.l.o r0 = r7.f13799h
            r1 = 25
            com.applovin.exoplayer2.l.o$a r8 = r0.a((int) r1, (java.lang.Object) r8)
            r0.a((com.applovin.exoplayer2.l.o.a) r8)
            goto L_0x018a
        L_0x017f:
            com.applovin.exoplayer2.p r2 = r7.O
            if (r2 == 0) goto L_0x0103
            r2.addSuppressed(r8)
            com.applovin.exoplayer2.p r8 = r7.O
            goto L_0x0103
        L_0x018a:
            r7.f()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.handleMessage(android.os.Message):boolean");
    }
}
