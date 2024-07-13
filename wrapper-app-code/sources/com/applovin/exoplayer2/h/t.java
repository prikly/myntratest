package com.applovin.exoplayer2.h;

import android.net.Uri;
import android.os.Handler;
import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.h.i;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import com.applovin.exoplayer2.k.z;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class t implements j, n, w.c, w.a<a>, w.e {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f12840b = t();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final v f12841c = new v.a().a("icy").f("application/x-icy").a();
    private e A;
    private com.applovin.exoplayer2.e.v B;
    private long C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private int H;
    private long I;
    private long J;
    private long K;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;

    /* renamed from: d  reason: collision with root package name */
    private final Uri f12842d;

    /* renamed from: e  reason: collision with root package name */
    private final i f12843e;

    /* renamed from: f  reason: collision with root package name */
    private final h f12844f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f12845g;

    /* renamed from: h  reason: collision with root package name */
    private final q.a f12846h;
    private final g.a i;
    private final b j;
    private final com.applovin.exoplayer2.k.b k;
    /* access modifiers changed from: private */
    public final String l;
    /* access modifiers changed from: private */
    public final long m;
    private final com.applovin.exoplayer2.k.w n = new com.applovin.exoplayer2.k.w("ProgressiveMediaPeriod");
    private final s o;
    private final com.applovin.exoplayer2.l.g p;
    private final Runnable q;
    /* access modifiers changed from: private */
    public final Runnable r;
    /* access modifiers changed from: private */
    public final Handler s;
    private n.a t;
    /* access modifiers changed from: private */
    public com.applovin.exoplayer2.g.d.b u;
    private w[] v;
    private d[] w;
    private boolean x;
    private boolean y;
    private boolean z;

    final class a implements i.a, w.d {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f12848b = j.a();

        /* renamed from: c  reason: collision with root package name */
        private final Uri f12849c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final z f12850d;

        /* renamed from: e  reason: collision with root package name */
        private final s f12851e;

        /* renamed from: f  reason: collision with root package name */
        private final j f12852f;

        /* renamed from: g  reason: collision with root package name */
        private final com.applovin.exoplayer2.l.g f12853g;

        /* renamed from: h  reason: collision with root package name */
        private final u f12854h = new u();
        private volatile boolean i;
        private boolean j = true;
        /* access modifiers changed from: private */
        public long k;
        /* access modifiers changed from: private */
        public l l = a(0);
        /* access modifiers changed from: private */
        public long m = -1;
        private x n;
        private boolean o;

        public a(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, j jVar, com.applovin.exoplayer2.l.g gVar) {
            this.f12849c = uri;
            this.f12850d = new z(iVar);
            this.f12851e = sVar;
            this.f12852f = jVar;
            this.f12853g = gVar;
        }

        private l a(long j2) {
            return new l.a().a(this.f12849c).a(j2).b(t.this.l).b(6).a((Map<String, String>) t.f12840b).a();
        }

        /* access modifiers changed from: private */
        public void a(long j2, long j3) {
            this.f12854h.f12451a = j2;
            this.k = j3;
            this.j = true;
            this.o = false;
        }

        public void a() {
            this.i = true;
        }

        public void a(y yVar) {
            long max = !this.o ? this.k : Math.max(t.this.q(), this.k);
            int a2 = yVar.a();
            x xVar = (x) com.applovin.exoplayer2.l.a.b(this.n);
            xVar.a(yVar, a2);
            xVar.a(max, 1, a2, 0, (x.a) null);
            this.o = true;
        }

        public void b() throws IOException {
            int i2 = 0;
            while (i2 == 0 && !this.i) {
                try {
                    long j2 = this.f12854h.f12451a;
                    l a2 = a(j2);
                    this.l = a2;
                    long a3 = this.f12850d.a(a2);
                    this.m = a3;
                    if (a3 != -1) {
                        this.m = a3 + j2;
                    }
                    com.applovin.exoplayer2.g.d.b unused = t.this.u = com.applovin.exoplayer2.g.d.b.a(this.f12850d.b());
                    com.applovin.exoplayer2.k.g gVar = this.f12850d;
                    if (!(t.this.u == null || t.this.u.f12611f == -1)) {
                        gVar = new i(this.f12850d, t.this.u.f12611f, this);
                        x j3 = t.this.j();
                        this.n = j3;
                        j3.a(t.f12841c);
                    }
                    s sVar = this.f12851e;
                    Uri uri = this.f12849c;
                    Map<String, List<String>> b2 = this.f12850d.b();
                    long j4 = this.m;
                    long j5 = j2;
                    sVar.a(gVar, uri, b2, j2, j4, this.f12852f);
                    if (t.this.u != null) {
                        this.f12851e.b();
                    }
                    if (this.j) {
                        this.f12851e.a(j5, this.k);
                        this.j = false;
                    }
                    while (true) {
                        long j6 = j5;
                        while (i2 == 0 && !this.i) {
                            this.f12853g.c();
                            i2 = this.f12851e.a(this.f12854h);
                            j5 = this.f12851e.c();
                            if (j5 > t.this.m + j6) {
                                this.f12853g.b();
                                t.this.s.post(t.this.r);
                            }
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (this.f12851e.c() != -1) {
                        this.f12854h.f12451a = this.f12851e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f12850d);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i2 == 1 || this.f12851e.c() == -1)) {
                        this.f12854h.f12451a = this.f12851e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f12850d);
                    throw th;
                }
            }
        }
    }

    interface b {
        void a(long j, boolean z, boolean z2);
    }

    private final class c implements x {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f12856b;

        public c(int i) {
            this.f12856b = i;
        }

        public int a(long j) {
            return t.this.a(this.f12856b, j);
        }

        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i) {
            return t.this.a(this.f12856b, wVar, gVar, i);
        }

        public boolean b() {
            return t.this.a(this.f12856b);
        }

        public void c() throws IOException {
            t.this.b(this.f12856b);
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f12857a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12858b;

        public d(int i, boolean z) {
            this.f12857a = i;
            this.f12858b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f12857a == dVar.f12857a && this.f12858b == dVar.f12858b;
        }

        public int hashCode() {
            return (this.f12857a * 31) + (this.f12858b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final ad f12859a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f12860b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f12861c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f12862d;

        public e(ad adVar, boolean[] zArr) {
            this.f12859a = adVar;
            this.f12860b = zArr;
            this.f12861c = new boolean[adVar.f12754b];
            this.f12862d = new boolean[adVar.f12754b];
        }
    }

    public t(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, h hVar, g.a aVar, com.applovin.exoplayer2.k.v vVar, q.a aVar2, b bVar, com.applovin.exoplayer2.k.b bVar2, String str, int i2) {
        this.f12842d = uri;
        this.f12843e = iVar;
        this.f12844f = hVar;
        this.i = aVar;
        this.f12845g = vVar;
        this.f12846h = aVar2;
        this.j = bVar;
        this.k = bVar2;
        this.l = str;
        this.m = (long) i2;
        this.o = sVar;
        this.p = new com.applovin.exoplayer2.l.g();
        this.q = new Runnable() {
            public final void run() {
                t.this.n();
            }
        };
        this.r = new Runnable() {
            public final void run() {
                t.this.u();
            }
        };
        this.s = ai.a();
        this.w = new d[0];
        this.v = new w[0];
        this.K = -9223372036854775807L;
        this.I = -1;
        this.C = -9223372036854775807L;
        this.E = 1;
    }

    private x a(d dVar) {
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dVar.equals(this.w[i2])) {
                return this.v[i2];
            }
        }
        w a2 = w.a(this.k, this.s.getLooper(), this.f12844f, this.i);
        a2.a((w.c) this);
        int i3 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.w, i3);
        dVarArr[length] = dVar;
        this.w = (d[]) ai.a((T[]) dVarArr);
        w[] wVarArr = (w[]) Arrays.copyOf(this.v, i3);
        wVarArr[length] = a2;
        this.v = (w[]) ai.a((T[]) wVarArr);
        return a2;
    }

    private void a(a aVar) {
        if (this.I == -1) {
            this.I = aVar.m;
        }
    }

    private boolean a(a aVar, int i2) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.I == -1 && ((vVar = this.B) == null || vVar.b() == -9223372036854775807L)) {
            if (!this.y || m()) {
                this.G = this.y;
                this.J = 0;
                this.M = 0;
                for (w b2 : this.v) {
                    b2.b();
                }
                aVar.a(0, 0);
                return true;
            }
            this.L = true;
            return false;
        }
        this.M = i2;
        return true;
    }

    private boolean a(boolean[] zArr, long j2) {
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.v[i2].a(j2, false) && (zArr[i2] || !this.z)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void c(com.applovin.exoplayer2.e.v vVar) {
        this.B = this.u == null ? vVar : new v.b(-9223372036854775807L);
        this.C = vVar.b();
        int i2 = 1;
        boolean z2 = this.I == -1 && vVar.b() == -9223372036854775807L;
        this.D = z2;
        if (z2) {
            i2 = 7;
        }
        this.E = i2;
        this.j.a(this.C, vVar.a(), this.D);
        if (!this.y) {
            n();
        }
    }

    private void c(int i2) {
        s();
        boolean[] zArr = this.A.f12862d;
        if (!zArr[i2]) {
            com.applovin.exoplayer2.v a2 = this.A.f12859a.a(i2).a(0);
            this.f12846h.a(com.applovin.exoplayer2.l.u.e(a2.l), a2, 0, (Object) null, this.J);
            zArr[i2] = true;
        }
    }

    private void d(int i2) {
        s();
        boolean[] zArr = this.A.f12860b;
        if (this.L && zArr[i2]) {
            if (!this.v[i2].b(false)) {
                this.K = 0;
                this.L = false;
                this.G = true;
                this.J = 0;
                this.M = 0;
                for (w b2 : this.v) {
                    b2.b();
                }
                ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
            }
        }
    }

    private boolean m() {
        return this.G || r();
    }

    /* access modifiers changed from: private */
    public void n() {
        if (!this.O && !this.y && this.x && this.B != null) {
            w[] wVarArr = this.v;
            int length = wVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (wVarArr[i2].g() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.p.b();
            int length2 = this.v.length;
            ac[] acVarArr = new ac[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.v[i3].g());
                String str = vVar.l;
                boolean a2 = com.applovin.exoplayer2.l.u.a(str);
                boolean z2 = a2 || com.applovin.exoplayer2.l.u.b(str);
                zArr[i3] = z2;
                this.z = z2 | this.z;
                com.applovin.exoplayer2.g.d.b bVar = this.u;
                if (bVar != null) {
                    if (a2 || this.w[i3].f12858b) {
                        com.applovin.exoplayer2.g.a aVar = vVar.j;
                        vVar = vVar.a().a(aVar == null ? new com.applovin.exoplayer2.g.a(bVar) : aVar.a(bVar)).a();
                    }
                    if (a2 && vVar.f13927f == -1 && vVar.f13928g == -1 && bVar.f12606a != -1) {
                        vVar = vVar.a().d(bVar.f12606a).a();
                    }
                }
                acVarArr[i3] = new ac(vVar.a(this.f12844f.a(vVar)));
            }
            this.A = new e(new ad(acVarArr), zArr);
            this.y = true;
            ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
        }
    }

    private void o() {
        a aVar = new a(this.f12842d, this.f12843e, this.o, this, this.p);
        if (this.y) {
            com.applovin.exoplayer2.l.a.b(r());
            long j2 = this.C;
            if (j2 == -9223372036854775807L || this.K <= j2) {
                aVar.a(((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.b(this.B)).a(this.K).f12452a.f12458c, this.K);
                for (w a2 : this.v) {
                    a2.a(this.K);
                }
                this.K = -9223372036854775807L;
            } else {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
        }
        this.M = p();
        this.f12846h.a(new j(aVar.f12848b, aVar.l, this.n.a(aVar, this, this.f12845g.a(this.E))), 1, -1, (com.applovin.exoplayer2.v) null, 0, (Object) null, aVar.k, this.C);
    }

    private int p() {
        int i2 = 0;
        for (w c2 : this.v) {
            i2 += c2.c();
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public long q() {
        long j2 = Long.MIN_VALUE;
        for (w h2 : this.v) {
            j2 = Math.max(j2, h2.h());
        }
        return j2;
    }

    private boolean r() {
        return this.K != -9223372036854775807L;
    }

    private void s() {
        com.applovin.exoplayer2.l.a.b(this.y);
        com.applovin.exoplayer2.l.a.b(this.A);
        com.applovin.exoplayer2.l.a.b(this.B);
    }

    private static Map<String, String> t() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!this.O) {
            ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, long j2) {
        if (m()) {
            return 0;
        }
        c(i2);
        w wVar = this.v[i2];
        int b2 = wVar.b(j2, this.N);
        wVar.a(b2);
        if (b2 == 0) {
            d(i2);
        }
        return b2;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i3) {
        if (m()) {
            return -3;
        }
        c(i2);
        int a2 = this.v[i2].a(wVar, gVar, i3, this.N);
        if (a2 == -3) {
            d(i2);
        }
        return a2;
    }

    public long a(long j2, av avVar) {
        s();
        if (!this.B.a()) {
            return 0;
        }
        v.a a2 = this.B.a(j2);
        return avVar.a(j2, a2.f12452a.f12457b, a2.f12453b.f12457b);
    }

    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j2) {
        s();
        ad adVar = this.A.f12859a;
        boolean[] zArr3 = this.A.f12861c;
        int i2 = this.H;
        int i3 = 0;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (xVarArr[i4] != null && (dVarArr[i4] == null || !zArr[i4])) {
                int a2 = xVarArr[i4].f12856b;
                com.applovin.exoplayer2.l.a.b(zArr3[a2]);
                this.H--;
                zArr3[a2] = false;
                xVarArr[i4] = null;
            }
        }
        boolean z2 = !this.F ? j2 != 0 : i2 == 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            if (xVarArr[i5] == null && dVarArr[i5] != null) {
                com.applovin.exoplayer2.j.d dVar = dVarArr[i5];
                com.applovin.exoplayer2.l.a.b(dVar.e() == 1);
                com.applovin.exoplayer2.l.a.b(dVar.b(0) == 0);
                int a3 = adVar.a(dVar.d());
                com.applovin.exoplayer2.l.a.b(!zArr3[a3]);
                this.H++;
                zArr3[a3] = true;
                xVarArr[i5] = new c(a3);
                zArr2[i5] = true;
                if (!z2) {
                    w wVar = this.v[a3];
                    z2 = !wVar.a(j2, true) && wVar.f() != 0;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.G = false;
            if (this.n.c()) {
                w[] wVarArr = this.v;
                int length = wVarArr.length;
                while (i3 < length) {
                    wVarArr[i3].k();
                    i3++;
                }
                this.n.d();
            } else {
                w[] wVarArr2 = this.v;
                int length2 = wVarArr2.length;
                while (i3 < length2) {
                    wVarArr2[i3].b();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = b(j2);
            while (i3 < xVarArr.length) {
                if (xVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.F = true;
        return j2;
    }

    public x a(int i2, int i3) {
        return a(new d(i2, false));
    }

    public w.b a(a aVar, long j2, long j3, IOException iOException, int i2) {
        w.b bVar;
        a aVar2;
        boolean z2;
        a(aVar);
        z a2 = aVar.f12850d;
        j jVar = new j(aVar.f12848b, aVar.l, a2.e(), a2.f(), j2, j3, a2.d());
        long a3 = this.f12845g.a(new v.a(jVar, new m(1, -1, (com.applovin.exoplayer2.v) null, 0, (Object) null, com.applovin.exoplayer2.h.a(aVar.k), com.applovin.exoplayer2.h.a(this.C)), iOException, i2));
        if (a3 == -9223372036854775807L) {
            bVar = com.applovin.exoplayer2.k.w.f13460d;
            a aVar3 = aVar;
        } else {
            int p2 = p();
            if (p2 > this.M) {
                aVar2 = aVar;
                z2 = true;
            } else {
                z2 = false;
                aVar2 = aVar;
            }
            bVar = a(aVar2, p2) ? com.applovin.exoplayer2.k.w.a(z2, a3) : com.applovin.exoplayer2.k.w.f13459c;
        }
        boolean z3 = !bVar.a();
        this.f12846h.a(jVar, 1, -1, (com.applovin.exoplayer2.v) null, 0, (Object) null, aVar.k, this.C, iOException, z3);
        if (z3) {
            this.f12845g.a(aVar.f12848b);
        }
        return bVar;
    }

    public void a() {
        this.x = true;
        this.s.post(this.q);
    }

    public void a(long j2) {
    }

    public void a(long j2, boolean z2) {
        s();
        if (!r()) {
            boolean[] zArr = this.A.f12861c;
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.v[i2].a(j2, z2, zArr[i2]);
            }
        }
    }

    public void a(com.applovin.exoplayer2.e.v vVar) {
        this.s.post(new Runnable(vVar) {
            public final /* synthetic */ com.applovin.exoplayer2.e.v f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                t.this.c(this.f$1);
            }
        });
    }

    public void a(n.a aVar, long j2) {
        this.t = aVar;
        this.p.a();
        o();
    }

    public void a(a aVar, long j2, long j3) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.C == -9223372036854775807L && (vVar = this.B) != null) {
            boolean a2 = vVar.a();
            long q2 = q();
            long j4 = q2 == Long.MIN_VALUE ? 0 : q2 + 10000;
            this.C = j4;
            this.j.a(j4, a2, this.D);
        }
        z a3 = aVar.f12850d;
        j jVar = new j(aVar.f12848b, aVar.l, a3.e(), a3.f(), j2, j3, a3.d());
        this.f12845g.a(aVar.f12848b);
        this.f12846h.b(jVar, 1, -1, (com.applovin.exoplayer2.v) null, 0, (Object) null, aVar.k, this.C);
        a(aVar);
        this.N = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
    }

    public void a(a aVar, long j2, long j3, boolean z2) {
        z a2 = aVar.f12850d;
        j jVar = new j(aVar.f12848b, aVar.l, a2.e(), a2.f(), j2, j3, a2.d());
        this.f12845g.a(aVar.f12848b);
        this.f12846h.c(jVar, 1, -1, (com.applovin.exoplayer2.v) null, 0, (Object) null, aVar.k, this.C);
        if (!z2) {
            a(aVar);
            for (w b2 : this.v) {
                b2.b();
            }
            if (this.H > 0) {
                ((n.a) com.applovin.exoplayer2.l.a.b(this.t)).a(this);
            }
        }
    }

    public void a(com.applovin.exoplayer2.v vVar) {
        this.s.post(this.q);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2) {
        return !m() && this.v[i2].b(this.N);
    }

    public long b(long j2) {
        s();
        boolean[] zArr = this.A.f12860b;
        if (!this.B.a()) {
            j2 = 0;
        }
        int i2 = 0;
        this.G = false;
        this.J = j2;
        if (r()) {
            this.K = j2;
            return j2;
        } else if (this.E != 7 && a(zArr, j2)) {
            return j2;
        } else {
            this.L = false;
            this.K = j2;
            this.N = false;
            if (this.n.c()) {
                w[] wVarArr = this.v;
                int length = wVarArr.length;
                while (i2 < length) {
                    wVarArr[i2].k();
                    i2++;
                }
                this.n.d();
            } else {
                this.n.b();
                w[] wVarArr2 = this.v;
                int length2 = wVarArr2.length;
                while (i2 < length2) {
                    wVarArr2[i2].b();
                    i2++;
                }
            }
            return j2;
        }
    }

    public ad b() {
        s();
        return this.A.f12859a;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) throws IOException {
        this.v[i2].e();
        i();
    }

    public long c() {
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.N && p() <= this.M) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.J;
    }

    public boolean c(long j2) {
        if (this.N || this.n.a() || this.L) {
            return false;
        }
        if (this.y && this.H == 0) {
            return false;
        }
        boolean a2 = this.p.a();
        if (this.n.c()) {
            return a2;
        }
        o();
        return true;
    }

    public long d() {
        long j2;
        s();
        boolean[] zArr = this.A.f12860b;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.K;
        }
        if (this.z) {
            int length = this.v.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.v[i2].j()) {
                    j2 = Math.min(j2, this.v[i2].h());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = q();
        }
        return j2 == Long.MIN_VALUE ? this.J : j2;
    }

    public long e() {
        if (this.H == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public void e_() throws IOException {
        i();
        if (this.N && !this.y) {
            throw com.applovin.exoplayer2.ai.b("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public boolean f() {
        return this.n.c() && this.p.e();
    }

    public void g() {
        if (this.y) {
            for (w d2 : this.v) {
                d2.d();
            }
        }
        this.n.a((w.e) this);
        this.s.removeCallbacksAndMessages((Object) null);
        this.t = null;
        this.O = true;
    }

    public void h() {
        for (w a2 : this.v) {
            a2.a();
        }
        this.o.a();
    }

    /* access modifiers changed from: package-private */
    public void i() throws IOException {
        this.n.a(this.f12845g.a(this.E));
    }

    /* access modifiers changed from: package-private */
    public x j() {
        return a(new d(0, true));
    }
}
