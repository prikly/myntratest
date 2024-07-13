package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12199a = $$Lambda$c$jeU8HBkNv0m6PJMXlOsb0ZhDRw.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final d f12200b = new d();

    /* renamed from: c  reason: collision with root package name */
    private final y f12201c = new y(16384);

    /* renamed from: d  reason: collision with root package name */
    private boolean f12202d;

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] a() {
        return new h[]{new c()};
    }

    public int a(i iVar, u uVar) throws IOException {
        int a2 = iVar.a(this.f12201c.d(), 0, 16384);
        if (a2 == -1) {
            return -1;
        }
        this.f12201c.d(0);
        this.f12201c.c(a2);
        if (!this.f12202d) {
            this.f12200b.a(0, 4);
            this.f12202d = true;
        }
        this.f12200b.a(this.f12201c);
        return 0;
    }

    public void a(long j, long j2) {
        this.f12202d = false;
        this.f12200b.a();
    }

    public void a(j jVar) {
        this.f12200b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new v.b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.a();
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.exoplayer2.e.i r9) throws java.io.IOException {
        /*
            r8 = this;
            com.applovin.exoplayer2.l.y r0 = new com.applovin.exoplayer2.l.y
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.d()
            r9.d(r4, r2, r1)
            r0.d(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.a()
            r9.c(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.d()
            r6 = 7
            r9.d(r5, r2, r6)
            r0.d(r2)
            int r5 = r0.i()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.c(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.d()
            int r5 = com.applovin.exoplayer2.b.c.a((byte[]) r6, (int) r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.c(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.e(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.c.a(com.applovin.exoplayer2.e.i):boolean");
    }

    public void c() {
    }
}
