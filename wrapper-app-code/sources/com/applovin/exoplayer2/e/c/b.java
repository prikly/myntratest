package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f11855a = $$Lambda$b$o1afdW7vYJZ3hkP278G2VQ0xrrY.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final y f11856b = new y(4);

    /* renamed from: c  reason: collision with root package name */
    private final y f11857c = new y(9);

    /* renamed from: d  reason: collision with root package name */
    private final y f11858d = new y(11);

    /* renamed from: e  reason: collision with root package name */
    private final y f11859e = new y();

    /* renamed from: f  reason: collision with root package name */
    private final c f11860f = new c();

    /* renamed from: g  reason: collision with root package name */
    private j f11861g;

    /* renamed from: h  reason: collision with root package name */
    private int f11862h = 1;
    private boolean i;
    private long j;
    private int k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private a p;
    private e q;

    private void a() {
        if (!this.o) {
            this.f11861g.a(new v.b(-9223372036854775807L));
            this.o = true;
        }
    }

    private long b() {
        if (this.i) {
            return this.j + this.n;
        }
        if (this.f11860f.a() == -9223372036854775807L) {
            return 0;
        }
        return this.n;
    }

    private boolean b(i iVar) throws IOException {
        boolean z = false;
        if (!iVar.a(this.f11857c.d(), 0, 9, true)) {
            return false;
        }
        this.f11857c.d(0);
        this.f11857c.e(4);
        int h2 = this.f11857c.h();
        boolean z2 = (h2 & 4) != 0;
        if ((h2 & 1) != 0) {
            z = true;
        }
        if (z2 && this.p == null) {
            this.p = new a(this.f11861g.a(8, 1));
        }
        if (z && this.q == null) {
            this.q = new e(this.f11861g.a(9, 2));
        }
        this.f11861g.a();
        this.k = (this.f11857c.q() - 9) + 4;
        this.f11862h = 2;
        return true;
    }

    private void c(i iVar) throws IOException {
        iVar.b(this.k);
        this.k = 0;
        this.f11862h = 3;
    }

    private boolean d(i iVar) throws IOException {
        if (!iVar.a(this.f11858d.d(), 0, 11, true)) {
            return false;
        }
        this.f11858d.d(0);
        this.l = this.f11858d.h();
        this.m = this.f11858d.m();
        this.n = (long) this.f11858d.m();
        this.n = (((long) (this.f11858d.h() << 24)) | this.n) * 1000;
        this.f11858d.e(3);
        this.f11862h = 4;
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new b()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(com.applovin.exoplayer2.e.i r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.b()
            int r2 = r9.l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            com.applovin.exoplayer2.e.c.a r2 = r9.p
            if (r2 == 0) goto L_0x0024
            r9.a()
            com.applovin.exoplayer2.e.c.a r2 = r9.p
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r5 = r2.b(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0079
        L_0x0024:
            int r2 = r9.l
            r7 = 9
            if (r2 != r7) goto L_0x003c
            com.applovin.exoplayer2.e.c.e r2 = r9.q
            if (r2 == 0) goto L_0x003c
            r9.a()
            com.applovin.exoplayer2.e.c.e r2 = r9.q
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r5 = r2.b(r10, r0)
            goto L_0x0022
        L_0x003c:
            int r2 = r9.l
            r7 = 18
            if (r2 != r7) goto L_0x0073
            boolean r2 = r9.o
            if (r2 != 0) goto L_0x0073
            com.applovin.exoplayer2.e.c.c r2 = r9.f11860f
            com.applovin.exoplayer2.l.y r10 = r9.f(r10)
            boolean r5 = r2.b(r10, r0)
            com.applovin.exoplayer2.e.c.c r10 = r9.f11860f
            long r0 = r10.a()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            com.applovin.exoplayer2.e.j r10 = r9.f11861g
            com.applovin.exoplayer2.e.t r2 = new com.applovin.exoplayer2.e.t
            com.applovin.exoplayer2.e.c.c r7 = r9.f11860f
            long[] r7 = r7.c()
            com.applovin.exoplayer2.e.c.c r8 = r9.f11860f
            long[] r8 = r8.b()
            r2.<init>(r7, r8, r0)
            r10.a(r2)
            r9.o = r6
            goto L_0x0022
        L_0x0073:
            int r0 = r9.m
            r10.b(r0)
            r10 = 0
        L_0x0079:
            boolean r0 = r9.i
            if (r0 != 0) goto L_0x0093
            if (r5 == 0) goto L_0x0093
            r9.i = r6
            com.applovin.exoplayer2.e.c.c r0 = r9.f11860f
            long r0 = r0.a()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008f
            long r0 = r9.n
            long r0 = -r0
            goto L_0x0091
        L_0x008f:
            r0 = 0
        L_0x0091:
            r9.j = r0
        L_0x0093:
            r0 = 4
            r9.k = r0
            r0 = 2
            r9.f11862h = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.c.b.e(com.applovin.exoplayer2.e.i):boolean");
    }

    private y f(i iVar) throws IOException {
        if (this.m > this.f11859e.e()) {
            y yVar = this.f11859e;
            yVar.a(new byte[Math.max(yVar.e() * 2, this.m)], 0);
        } else {
            this.f11859e.d(0);
        }
        this.f11859e.c(this.m);
        iVar.b(this.f11859e.d(), 0, this.m);
        return this.f11859e;
    }

    public int a(i iVar, u uVar) throws IOException {
        a.a(this.f11861g);
        while (true) {
            int i2 = this.f11862h;
            if (i2 != 1) {
                if (i2 == 2) {
                    c(iVar);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    } else if (e(iVar)) {
                        return 0;
                    }
                } else if (!d(iVar)) {
                    return -1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f11862h = 1;
            this.i = false;
        } else {
            this.f11862h = 3;
        }
        this.k = 0;
    }

    public void a(j jVar) {
        this.f11861g = jVar;
    }

    public boolean a(i iVar) throws IOException {
        iVar.d(this.f11856b.d(), 0, 3);
        this.f11856b.d(0);
        if (this.f11856b.m() != 4607062) {
            return false;
        }
        iVar.d(this.f11856b.d(), 0, 2);
        this.f11856b.d(0);
        if ((this.f11856b.i() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        iVar.d(this.f11856b.d(), 0, 4);
        this.f11856b.d(0);
        int q2 = this.f11856b.q();
        iVar.a();
        iVar.c(q2);
        iVar.d(this.f11856b.d(), 0, 4);
        this.f11856b.d(0);
        return this.f11856b.q() == 0;
    }

    public void c() {
    }
}
