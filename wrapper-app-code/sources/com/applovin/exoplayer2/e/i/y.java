package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.l.ag;

public final class y implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final x f12382a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f12383b = new com.applovin.exoplayer2.l.y(32);

    /* renamed from: c  reason: collision with root package name */
    private int f12384c;

    /* renamed from: d  reason: collision with root package name */
    private int f12385d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12386e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12387f;

    public y(x xVar) {
        this.f12382a = xVar;
    }

    public void a() {
        this.f12387f = true;
    }

    public void a(ag agVar, j jVar, ad.d dVar) {
        this.f12382a.a(agVar, jVar, dVar);
        this.f12387f = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104 A[SYNTHETIC] */
    public void a(com.applovin.exoplayer2.l.y r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            r8 = r8 & r0
            r1 = 0
            if (r8 == 0) goto L_0x0007
            r8 = 1
            goto L_0x0008
        L_0x0007:
            r8 = 0
        L_0x0008:
            r2 = -1
            if (r8 == 0) goto L_0x0015
            int r3 = r7.h()
            int r4 = r7.c()
            int r4 = r4 + r3
            goto L_0x0016
        L_0x0015:
            r4 = -1
        L_0x0016:
            boolean r3 = r6.f12387f
            if (r3 == 0) goto L_0x0024
            if (r8 != 0) goto L_0x001d
            return
        L_0x001d:
            r6.f12387f = r1
            r7.d(r4)
        L_0x0022:
            r6.f12385d = r1
        L_0x0024:
            int r8 = r7.a()
            if (r8 <= 0) goto L_0x0104
            int r8 = r6.f12385d
            r3 = 3
            if (r8 >= r3) goto L_0x00b1
            if (r8 != 0) goto L_0x0044
            int r8 = r7.h()
            int r4 = r7.c()
            int r4 = r4 - r0
            r7.d(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r8 != r4) goto L_0x0044
            r6.f12387f = r0
            return
        L_0x0044:
            int r8 = r7.a()
            int r4 = r6.f12385d
            int r4 = 3 - r4
            int r8 = java.lang.Math.min(r8, r4)
            com.applovin.exoplayer2.l.y r4 = r6.f12383b
            byte[] r4 = r4.d()
            int r5 = r6.f12385d
            r7.a(r4, r5, r8)
            int r4 = r6.f12385d
            int r4 = r4 + r8
            r6.f12385d = r4
            if (r4 != r3) goto L_0x0024
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            r8.d(r1)
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            r8.c(r3)
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            r8.e(r0)
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            int r8 = r8.h()
            com.applovin.exoplayer2.l.y r4 = r6.f12383b
            int r4 = r4.h()
            r5 = r8 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            r6.f12386e = r5
            r8 = r8 & 15
            int r8 = r8 << 8
            r8 = r8 | r4
            int r8 = r8 + r3
            r6.f12384c = r8
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            int r8 = r8.e()
            int r3 = r6.f12384c
            if (r8 >= r3) goto L_0x0024
            r8 = 4098(0x1002, float:5.743E-42)
            com.applovin.exoplayer2.l.y r4 = r6.f12383b
            int r4 = r4.e()
            int r4 = r4 * 2
            int r3 = java.lang.Math.max(r3, r4)
            int r8 = java.lang.Math.min(r8, r3)
            com.applovin.exoplayer2.l.y r3 = r6.f12383b
            r3.b(r8)
            goto L_0x0024
        L_0x00b1:
            int r8 = r7.a()
            int r3 = r6.f12384c
            int r4 = r6.f12385d
            int r3 = r3 - r4
            int r8 = java.lang.Math.min(r8, r3)
            com.applovin.exoplayer2.l.y r3 = r6.f12383b
            byte[] r3 = r3.d()
            int r4 = r6.f12385d
            r7.a(r3, r4, r8)
            int r3 = r6.f12385d
            int r3 = r3 + r8
            r6.f12385d = r3
            int r8 = r6.f12384c
            if (r3 != r8) goto L_0x0024
            boolean r3 = r6.f12386e
            if (r3 == 0) goto L_0x00f1
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            byte[] r8 = r8.d()
            int r3 = r6.f12384c
            int r8 = com.applovin.exoplayer2.l.ai.a((byte[]) r8, (int) r1, (int) r3, (int) r2)
            if (r8 == 0) goto L_0x00e7
            r6.f12387f = r0
            return
        L_0x00e7:
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            int r3 = r6.f12384c
            int r3 = r3 + -4
            r8.c(r3)
            goto L_0x00f6
        L_0x00f1:
            com.applovin.exoplayer2.l.y r3 = r6.f12383b
            r3.c(r8)
        L_0x00f6:
            com.applovin.exoplayer2.l.y r8 = r6.f12383b
            r8.d(r1)
            com.applovin.exoplayer2.e.i.x r8 = r6.f12382a
            com.applovin.exoplayer2.l.y r3 = r6.f12383b
            r8.a(r3)
            goto L_0x0022
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.y.a(com.applovin.exoplayer2.l.y, int):void");
    }
}
