package com.applovin.exoplayer2.h;

import android.os.Looper;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

public class w implements x {
    private boolean A;
    private v B;
    private v C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final v f12891a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12892b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final ab<b> f12893c = new ab<>($$Lambda$w$ZgqdAvo8Ssoldu4N7_nka4oiy6s.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    private final h f12894d;

    /* renamed from: e  reason: collision with root package name */
    private final g.a f12895e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f12896f;

    /* renamed from: g  reason: collision with root package name */
    private c f12897g;

    /* renamed from: h  reason: collision with root package name */
    private v f12898h;
    private f i;
    private int j = 1000;
    private int[] k = new int[1000];
    private long[] l = new long[1000];
    private int[] m = new int[1000];
    private int[] n = new int[1000];
    private long[] o = new long[1000];
    private x.a[] p = new x.a[1000];
    private int q;
    private int r;
    private int s;
    private int t;
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private long w = Long.MIN_VALUE;
    private boolean x;
    private boolean y = true;
    private boolean z = true;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f12899a;

        /* renamed from: b  reason: collision with root package name */
        public long f12900b;

        /* renamed from: c  reason: collision with root package name */
        public x.a f12901c;

        a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final v f12902a;

        /* renamed from: b  reason: collision with root package name */
        public final h.a f12903b;

        private b(v vVar, h.a aVar) {
            this.f12902a = vVar;
            this.f12903b = aVar;
        }
    }

    public interface c {
        void a(v vVar);
    }

    protected w(com.applovin.exoplayer2.k.b bVar, Looper looper, h hVar, g.a aVar) {
        this.f12896f = looper;
        this.f12894d = hVar;
        this.f12895e = aVar;
        this.f12891a = new v(bVar);
    }

    private int a(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3 && this.o[i2] <= j2; i5++) {
            if (!z2 || (this.n[i2] & 1) != 0) {
                if (this.o[i2] == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.j) {
                i2 = 0;
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int a(com.applovin.exoplayer2.w r5, com.applovin.exoplayer2.c.g r6, boolean r7, boolean r8, com.applovin.exoplayer2.h.w.a r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f11420c = r0     // Catch:{ all -> 0x008e }
            boolean r0 = r4.o()     // Catch:{ all -> 0x008e }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0035
            if (r8 != 0) goto L_0x002f
            boolean r8 = r4.x     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            com.applovin.exoplayer2.v r6 = r4.C     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x002d
            if (r7 != 0) goto L_0x0020
            com.applovin.exoplayer2.v r6 = r4.C     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r7 = r4.f12898h     // Catch:{ all -> 0x008e }
            if (r6 == r7) goto L_0x002d
        L_0x0020:
            com.applovin.exoplayer2.v r6 = r4.C     // Catch:{ all -> 0x008e }
            java.lang.Object r6 = com.applovin.exoplayer2.l.a.b(r6)     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r6 = (com.applovin.exoplayer2.v) r6     // Catch:{ all -> 0x008e }
            r4.a((com.applovin.exoplayer2.v) r6, (com.applovin.exoplayer2.w) r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r1
        L_0x002d:
            monitor-exit(r4)
            return r2
        L_0x002f:
            r5 = 4
            r6.a_(r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r3
        L_0x0035:
            com.applovin.exoplayer2.h.ab<com.applovin.exoplayer2.h.w$b> r8 = r4.f12893c     // Catch:{ all -> 0x008e }
            int r0 = r4.f()     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = r8.a((int) r0)     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.h.w$b r8 = (com.applovin.exoplayer2.h.w.b) r8     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r8 = r8.f12902a     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x0089
            com.applovin.exoplayer2.v r7 = r4.f12898h     // Catch:{ all -> 0x008e }
            if (r8 == r7) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            int r5 = r4.t     // Catch:{ all -> 0x008e }
            int r5 = r4.f(r5)     // Catch:{ all -> 0x008e }
            boolean r7 = r4.c((int) r5)     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x005b
            r5 = 1
            r6.f11420c = r5     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r2
        L_0x005b:
            int[] r7 = r4.n     // Catch:{ all -> 0x008e }
            r7 = r7[r5]     // Catch:{ all -> 0x008e }
            r6.a_(r7)     // Catch:{ all -> 0x008e }
            long[] r7 = r4.o     // Catch:{ all -> 0x008e }
            r0 = r7[r5]     // Catch:{ all -> 0x008e }
            r6.f11421d = r0     // Catch:{ all -> 0x008e }
            long r7 = r6.f11421d     // Catch:{ all -> 0x008e }
            long r0 = r4.u     // Catch:{ all -> 0x008e }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0075
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.b(r7)     // Catch:{ all -> 0x008e }
        L_0x0075:
            int[] r6 = r4.m     // Catch:{ all -> 0x008e }
            r6 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f12899a = r6     // Catch:{ all -> 0x008e }
            long[] r6 = r4.l     // Catch:{ all -> 0x008e }
            r7 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f12900b = r7     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.e.x$a[] r6 = r4.p     // Catch:{ all -> 0x008e }
            r5 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f12901c = r5     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r3
        L_0x0089:
            r4.a((com.applovin.exoplayer2.v) r8, (com.applovin.exoplayer2.w) r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r1
        L_0x008e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(com.applovin.exoplayer2.w, com.applovin.exoplayer2.c.g, boolean, boolean, com.applovin.exoplayer2.h.w$a):int");
    }

    public static w a(com.applovin.exoplayer2.k.b bVar, Looper looper, h hVar, g.a aVar) {
        return new w(bVar, (Looper) com.applovin.exoplayer2.l.a.b(looper), (h) com.applovin.exoplayer2.l.a.b(hVar), (g.a) com.applovin.exoplayer2.l.a.b(aVar));
    }

    private synchronized void a(long j2, int i2, long j3, int i3, x.a aVar) {
        if (this.q > 0) {
            int f2 = f(this.q - 1);
            com.applovin.exoplayer2.l.a.a(this.l[f2] + ((long) this.m[f2]) <= j3);
        }
        this.x = (536870912 & i2) != 0;
        this.w = Math.max(this.w, j2);
        int f3 = f(this.q);
        this.o[f3] = j2;
        this.l[f3] = j3;
        this.m[f3] = i3;
        this.n[f3] = i2;
        this.p[f3] = aVar;
        this.k[f3] = this.D;
        if (this.f12893c.c() || !this.f12893c.a().f12902a.equals(this.C)) {
            this.f12893c.a(c(), new b((v) com.applovin.exoplayer2.l.a.b(this.C), this.f12894d != null ? this.f12894d.a((Looper) com.applovin.exoplayer2.l.a.b(this.f12896f), this.f12895e, this.C) : h.a.f11771b));
        }
        int i4 = this.q + 1;
        this.q = i4;
        if (i4 == this.j) {
            int i5 = this.j + 1000;
            int[] iArr = new int[i5];
            long[] jArr = new long[i5];
            long[] jArr2 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            x.a[] aVarArr = new x.a[i5];
            int i6 = this.j - this.s;
            System.arraycopy(this.l, this.s, jArr, 0, i6);
            System.arraycopy(this.o, this.s, jArr2, 0, i6);
            System.arraycopy(this.n, this.s, iArr2, 0, i6);
            System.arraycopy(this.m, this.s, iArr3, 0, i6);
            System.arraycopy(this.p, this.s, aVarArr, 0, i6);
            System.arraycopy(this.k, this.s, iArr, 0, i6);
            int i7 = this.s;
            System.arraycopy(this.l, 0, jArr, i6, i7);
            System.arraycopy(this.o, 0, jArr2, i6, i7);
            System.arraycopy(this.n, 0, iArr2, i6, i7);
            System.arraycopy(this.m, 0, iArr3, i6, i7);
            System.arraycopy(this.p, 0, aVarArr, i6, i7);
            System.arraycopy(this.k, 0, iArr, i6, i7);
            this.l = jArr;
            this.o = jArr2;
            this.n = iArr2;
            this.m = iArr3;
            this.p = aVarArr;
            this.k = iArr;
            this.s = 0;
            this.j = i5;
        }
    }

    private void a(v vVar, com.applovin.exoplayer2.w wVar) {
        boolean z2 = this.f12898h == null;
        e eVar = z2 ? null : this.f12898h.o;
        this.f12898h = vVar;
        e eVar2 = vVar.o;
        h hVar = this.f12894d;
        wVar.f13939b = hVar != null ? vVar.a(hVar.a(vVar)) : vVar;
        wVar.f13938a = this.i;
        if (this.f12894d != null) {
            if (z2 || !ai.a((Object) eVar, (Object) eVar2)) {
                f fVar = this.i;
                f b2 = this.f12894d.b((Looper) com.applovin.exoplayer2.l.a.b(this.f12896f), this.f12895e, vVar);
                this.i = b2;
                wVar.f13938a = b2;
                if (fVar != null) {
                    fVar.b(this.f12895e);
                }
            }
        }
    }

    private long b(int i2) {
        int c2 = c() - i2;
        boolean z2 = false;
        com.applovin.exoplayer2.l.a.a(c2 >= 0 && c2 <= this.q - this.t);
        int i3 = this.q - c2;
        this.q = i3;
        this.w = Math.max(this.v, e(i3));
        if (c2 == 0 && this.x) {
            z2 = true;
        }
        this.x = z2;
        this.f12893c.c(i2);
        int i4 = this.q;
        if (i4 == 0) {
            return 0;
        }
        int f2 = f(i4 - 1);
        return this.l[f2] + ((long) this.m[f2]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long b(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.q     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.o     // Catch:{ all -> 0x0038 }
            int r3 = r9.s     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.t     // Catch:{ all -> 0x0038 }
            int r0 = r9.q     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.t     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.q     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.s     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.a((int) r4, (int) r5, (long) r6, (boolean) r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.d(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.b(long, boolean, boolean):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean b(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.q     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.v     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.i()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.c((long) r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.r     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.b((int) r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.b(long):boolean");
    }

    private int c(long j2) {
        int i2 = this.q;
        int f2 = f(i2 - 1);
        while (i2 > this.t && this.o[f2] >= j2) {
            i2--;
            f2--;
            if (f2 == -1) {
                f2 = this.j - 1;
            }
        }
        return i2;
    }

    private boolean c(int i2) {
        f fVar = this.i;
        return fVar == null || fVar.c() == 4 || ((this.n[i2] & 1073741824) == 0 && this.i.d());
    }

    private synchronized boolean c(v vVar) {
        this.z = false;
        if (ai.a((Object) vVar, (Object) this.C)) {
            return false;
        }
        if (!this.f12893c.c() && this.f12893c.a().f12902a.equals(vVar)) {
            vVar = this.f12893c.a().f12902a;
        }
        this.C = vVar;
        this.E = u.a(this.C.l, this.C.i);
        this.F = false;
        return true;
    }

    private long d(int i2) {
        this.v = Math.max(this.v, e(i2));
        this.q -= i2;
        this.r += i2;
        int i3 = this.s + i2;
        this.s = i3;
        int i4 = this.j;
        if (i3 >= i4) {
            this.s = i3 - i4;
        }
        int i5 = this.t - i2;
        this.t = i5;
        if (i5 < 0) {
            this.t = 0;
        }
        this.f12893c.b(this.r);
        if (this.q != 0) {
            return this.l[this.s];
        }
        int i6 = this.s;
        if (i6 == 0) {
            i6 = this.j;
        }
        int i7 = i6 - 1;
        return this.l[i7] + ((long) this.m[i7]);
    }

    private long e(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int f2 = f(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.o[f2]);
            if ((this.n[f2] & 1) != 0) {
                break;
            }
            f2--;
            if (f2 == -1) {
                f2 = this.j - 1;
            }
        }
        return j2;
    }

    private int f(int i2) {
        int i3 = this.s + i2;
        int i4 = this.j;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private synchronized void l() {
        this.t = 0;
        this.f12891a.b();
    }

    private synchronized long m() {
        if (this.q == 0) {
            return -1;
        }
        return d(this.q);
    }

    private void n() {
        f fVar = this.i;
        if (fVar != null) {
            fVar.b(this.f12895e);
            this.i = null;
            this.f12898h = null;
        }
    }

    private boolean o() {
        return this.t != this.q;
    }

    public /* synthetic */ int a(com.applovin.exoplayer2.k.g gVar, int i2, boolean z2) throws IOException {
        return x.CC.$default$a(this, gVar, i2, z2);
    }

    public final int a(com.applovin.exoplayer2.k.g gVar, int i2, boolean z2, int i3) throws IOException {
        return this.f12891a.a(gVar, i2, z2);
    }

    public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i2, boolean z2) {
        boolean z3 = false;
        int a2 = a(wVar, gVar, (i2 & 2) != 0, z2, this.f12892b);
        if (a2 == -4 && !gVar.c()) {
            if ((i2 & 1) != 0) {
                z3 = true;
            }
            if ((i2 & 4) == 0) {
                v vVar = this.f12891a;
                a aVar = this.f12892b;
                if (z3) {
                    vVar.b(gVar, aVar);
                } else {
                    vVar.a(gVar, aVar);
                }
            }
            if (!z3) {
                this.t++;
            }
        }
        return a2;
    }

    public void a() {
        a(true);
        n();
    }

    public final synchronized void a(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                if (this.t + i2 <= this.q) {
                    z2 = true;
                    com.applovin.exoplayer2.l.a.a(z2);
                    this.t += i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z2 = false;
        com.applovin.exoplayer2.l.a.a(z2);
        this.t += i2;
    }

    public final void a(long j2) {
        this.u = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r12, int r14, int r15, int r16, com.applovin.exoplayer2.e.x.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x0010
            com.applovin.exoplayer2.v r0 = r8.B
            java.lang.Object r0 = com.applovin.exoplayer2.l.a.a(r0)
            com.applovin.exoplayer2.v r0 = (com.applovin.exoplayer2.v) r0
            r11.a((com.applovin.exoplayer2.v) r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.y = r1
        L_0x0022:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L_0x0054
            long r6 = r8.u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.F
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.applovin.exoplayer2.v r6 = r8.C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.exoplayer2.l.q.c(r6, r0)
            r8.F = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.H
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.b((long) r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.H = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            com.applovin.exoplayer2.h.v r0 = r8.f12891a
            long r0 = r0.c()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.a((long) r1, (int) r3, (long) r4, (int) r6, (com.applovin.exoplayer2.e.x.a) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(long, int, int, int, com.applovin.exoplayer2.e.x$a):void");
    }

    public final void a(long j2, boolean z2, boolean z3) {
        this.f12891a.a(b(j2, z2, z3));
    }

    public final void a(c cVar) {
        this.f12897g = cVar;
    }

    public /* synthetic */ void a(y yVar, int i2) {
        x.CC.$default$a(this, yVar, i2);
    }

    public final void a(y yVar, int i2, int i3) {
        this.f12891a.a(yVar, i2);
    }

    public final void a(v vVar) {
        v b2 = b(vVar);
        this.A = false;
        this.B = vVar;
        boolean c2 = c(b2);
        c cVar = this.f12897g;
        if (cVar != null && c2) {
            cVar.a(b2);
        }
    }

    public void a(boolean z2) {
        this.f12891a.a();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.f12893c.b();
        if (z2) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.l()     // Catch:{ all -> 0x0040 }
            int r0 = r8.t     // Catch:{ all -> 0x0040 }
            int r2 = r8.f(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.o()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.o     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.q     // Catch:{ all -> 0x0040 }
            int r0 = r8.t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.t = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.a(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r9 != -1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int b(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.t     // Catch:{ all -> 0x003b }
            int r2 = r8.f(r0)     // Catch:{ all -> 0x003b }
            boolean r0 = r8.o()     // Catch:{ all -> 0x003b }
            r7 = 0
            if (r0 == 0) goto L_0x0039
            long[] r0 = r8.o     // Catch:{ all -> 0x003b }
            r3 = r0[r2]     // Catch:{ all -> 0x003b }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            long r0 = r8.w     // Catch:{ all -> 0x003b }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.q     // Catch:{ all -> 0x003b }
            int r10 = r8.t     // Catch:{ all -> 0x003b }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.q     // Catch:{ all -> 0x003b }
            int r0 = r8.t     // Catch:{ all -> 0x003b }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x003b }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0038
            return r7
        L_0x0038:
            return r9
        L_0x0039:
            monitor-exit(r8)
            return r7
        L_0x003b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.b(long, boolean):int");
    }

    /* access modifiers changed from: protected */
    public v b(v vVar) {
        return (this.G == 0 || vVar.p == Long.MAX_VALUE) ? vVar : vVar.a().a(vVar.p + this.G).a();
    }

    public final void b() {
        a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean b(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.o()     // Catch:{ all -> 0x003c }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.x     // Catch:{ all -> 0x003c }
            if (r3 != 0) goto L_0x001a
            com.applovin.exoplayer2.v r3 = r2.C     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0019
            com.applovin.exoplayer2.v r3 = r2.C     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r0 = r2.f12898h     // Catch:{ all -> 0x003c }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            com.applovin.exoplayer2.h.ab<com.applovin.exoplayer2.h.w$b> r3 = r2.f12893c     // Catch:{ all -> 0x003c }
            int r0 = r2.f()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.a((int) r0)     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.h.w$b r3 = (com.applovin.exoplayer2.h.w.b) r3     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r3 = r3.f12902a     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r0 = r2.f12898h     // Catch:{ all -> 0x003c }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.t     // Catch:{ all -> 0x003c }
            int r3 = r2.f(r3)     // Catch:{ all -> 0x003c }
            boolean r3 = r2.c((int) r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r3
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.w.b(boolean):boolean");
    }

    public final int c() {
        return this.r + this.q;
    }

    public void d() {
        k();
        n();
    }

    public void e() throws IOException {
        f fVar = this.i;
        if (fVar != null && fVar.c() == 1) {
            throw ((f.a) com.applovin.exoplayer2.l.a.b(this.i.e()));
        }
    }

    public final int f() {
        return this.r + this.t;
    }

    public final synchronized v g() {
        return this.z ? null : this.C;
    }

    public final synchronized long h() {
        return this.w;
    }

    public final synchronized long i() {
        return Math.max(this.v, e(this.t));
    }

    public final synchronized boolean j() {
        return this.x;
    }

    public final void k() {
        this.f12891a.a(m());
    }
}
