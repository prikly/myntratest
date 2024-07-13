package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.io.IOException;

public final class d implements n, n.a {

    /* renamed from: a  reason: collision with root package name */
    public final n f12761a;

    /* renamed from: b  reason: collision with root package name */
    long f12762b;

    /* renamed from: c  reason: collision with root package name */
    long f12763c;

    /* renamed from: d  reason: collision with root package name */
    private n.a f12764d;

    /* renamed from: e  reason: collision with root package name */
    private a[] f12765e = new a[0];

    /* renamed from: f  reason: collision with root package name */
    private long f12766f;

    private final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final x f12767a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12769c;

        public a(x xVar) {
            this.f12767a = xVar;
        }

        public int a(long j) {
            if (d.this.g()) {
                return -3;
            }
            return this.f12767a.a(j);
        }

        public int a(w wVar, g gVar, int i) {
            if (d.this.g()) {
                return -3;
            }
            if (this.f12769c) {
                gVar.a_(4);
                return -4;
            }
            int a2 = this.f12767a.a(wVar, gVar, i);
            if (a2 == -5) {
                v vVar = (v) com.applovin.exoplayer2.l.a.b(wVar.f13939b);
                if (!(vVar.B == 0 && vVar.C == 0)) {
                    int i2 = 0;
                    int i3 = d.this.f12762b != 0 ? 0 : vVar.B;
                    if (d.this.f12763c == Long.MIN_VALUE) {
                        i2 = vVar.C;
                    }
                    wVar.f13939b = vVar.a().n(i3).o(i2).a();
                }
                return -5;
            } else if (d.this.f12763c == Long.MIN_VALUE || ((a2 != -4 || gVar.f11421d < d.this.f12763c) && (a2 != -3 || d.this.d() != Long.MIN_VALUE || gVar.f11420c))) {
                return a2;
            } else {
                gVar.a();
                gVar.a_(4);
                this.f12769c = true;
                return -4;
            }
        }

        public void a() {
            this.f12769c = false;
        }

        public boolean b() {
            return !d.this.g() && this.f12767a.b();
        }

        public void c() throws IOException {
            this.f12767a.c();
        }
    }

    public d(n nVar, boolean z, long j, long j2) {
        this.f12761a = nVar;
        this.f12766f = z ? j : -9223372036854775807L;
        this.f12762b = j;
        this.f12763c = j2;
    }

    private static boolean a(long j, com.applovin.exoplayer2.j.d[] dVarArr) {
        if (j != 0) {
            for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
                if (dVar != null) {
                    v f2 = dVar.f();
                    if (!u.a(f2.l, f2.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private av b(long j, av avVar) {
        long a2 = ai.a(avVar.f11145f, 0, j - this.f12762b);
        long j2 = avVar.f11146g;
        long j3 = this.f12763c;
        long a3 = ai.a(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (a2 == avVar.f11145f && a3 == avVar.f11146g) ? avVar : new av(a2, a3);
    }

    public long a(long j, av avVar) {
        long j2 = this.f12762b;
        if (j == j2) {
            return j2;
        }
        return this.f12761a.a(j, b(j, avVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(com.applovin.exoplayer2.j.d[] r13, boolean[] r14, com.applovin.exoplayer2.h.x[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.exoplayer2.h.d$a[] r2 = new com.applovin.exoplayer2.h.d.a[r2]
            r0.f12765e = r2
            int r2 = r1.length
            com.applovin.exoplayer2.h.x[] r9 = new com.applovin.exoplayer2.h.x[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            com.applovin.exoplayer2.h.d$a[] r3 = r0.f12765e
            r4 = r1[r2]
            com.applovin.exoplayer2.h.d$a r4 = (com.applovin.exoplayer2.h.d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            com.applovin.exoplayer2.h.x r11 = r3.f12767a
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            com.applovin.exoplayer2.h.n r2 = r0.f12761a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.g()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f12762b
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = a((long) r4, (com.applovin.exoplayer2.j.d[]) r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f12766f = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f12762b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f12763c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            com.applovin.exoplayer2.l.a.b((boolean) r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0099
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f12765e
            r4[r10] = r11
            goto L_0x0090
        L_0x0077:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f12765e
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r4 = r4[r10]
            com.applovin.exoplayer2.h.x r4 = r4.f12767a
            r5 = r9[r10]
            if (r4 == r5) goto L_0x0090
        L_0x0085:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f12765e
            com.applovin.exoplayer2.h.d$a r5 = new com.applovin.exoplayer2.h.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x0090:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f12765e
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.a(com.applovin.exoplayer2.j.d[], boolean[], com.applovin.exoplayer2.h.x[], boolean[], long):long");
    }

    public void a(long j) {
        this.f12761a.a(j);
    }

    public void a(long j, long j2) {
        this.f12762b = j;
        this.f12763c = j2;
    }

    public void a(long j, boolean z) {
        this.f12761a.a(j, z);
    }

    public void a(n.a aVar, long j) {
        this.f12764d = aVar;
        this.f12761a.a((n.a) this, j);
    }

    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f12764d)).a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f12766f = r0
            com.applovin.exoplayer2.h.d$a[] r0 = r6.f12765e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.applovin.exoplayer2.h.n r0 = r6.f12761a
            long r0 = r0.b(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f12762b
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f12763c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.applovin.exoplayer2.l.a.b((boolean) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.b(long):long");
    }

    public ad b() {
        return this.f12761a.b();
    }

    /* renamed from: b */
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f12764d)).a(this);
    }

    public long c() {
        if (g()) {
            long j = this.f12766f;
            this.f12766f = -9223372036854775807L;
            long c2 = c();
            return c2 != -9223372036854775807L ? c2 : j;
        }
        long c3 = this.f12761a.c();
        if (c3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        com.applovin.exoplayer2.l.a.b(c3 >= this.f12762b);
        long j2 = this.f12763c;
        if (j2 != Long.MIN_VALUE && c3 > j2) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.b(z);
        return c3;
    }

    public boolean c(long j) {
        return this.f12761a.c(j);
    }

    public long d() {
        long d2 = this.f12761a.d();
        if (d2 != Long.MIN_VALUE) {
            long j = this.f12763c;
            if (j == Long.MIN_VALUE || d2 < j) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    public long e() {
        long e2 = this.f12761a.e();
        if (e2 != Long.MIN_VALUE) {
            long j = this.f12763c;
            if (j == Long.MIN_VALUE || e2 < j) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    public void e_() throws IOException {
        this.f12761a.e_();
    }

    public boolean f() {
        return this.f12761a.f();
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f12766f != -9223372036854775807L;
    }
}
