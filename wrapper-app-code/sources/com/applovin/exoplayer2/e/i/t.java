package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;

public final class t implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final j f12348a;

    /* renamed from: b  reason: collision with root package name */
    private final x f12349b = new x(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f12350c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f12351d;

    /* renamed from: e  reason: collision with root package name */
    private ag f12352e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12353f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12354g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12355h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public t(j jVar) {
        this.f12348a = jVar;
    }

    private void a(int i2) {
        this.f12350c = i2;
        this.f12351d = 0;
    }

    private boolean a(y yVar, byte[] bArr, int i2) {
        int min = Math.min(yVar.a(), i2 - this.f12351d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.e(min);
        } else {
            yVar.a(bArr, this.f12351d, min);
        }
        int i3 = this.f12351d + min;
        this.f12351d = i3;
        return i3 == i2;
    }

    private boolean b() {
        this.f12349b.a(0);
        int c2 = this.f12349b.c(24);
        if (c2 != 1) {
            q.c("PesReader", "Unexpected start code prefix: " + c2);
            this.j = -1;
            return false;
        }
        this.f12349b.b(8);
        int c3 = this.f12349b.c(16);
        this.f12349b.b(5);
        this.k = this.f12349b.e();
        this.f12349b.b(2);
        this.f12353f = this.f12349b.e();
        this.f12354g = this.f12349b.e();
        this.f12349b.b(6);
        int c4 = this.f12349b.c(8);
        this.i = c4;
        if (c3 != 0) {
            int i2 = ((c3 + 6) - 9) - c4;
            this.j = i2;
            if (i2 < 0) {
                q.c("PesReader", "Found negative packet payload size: " + this.j);
            }
            return true;
        }
        this.j = -1;
        return true;
    }

    private void c() {
        this.f12349b.a(0);
        this.l = -9223372036854775807L;
        if (this.f12353f) {
            this.f12349b.b(4);
            this.f12349b.b(1);
            this.f12349b.b(1);
            long c2 = (((long) this.f12349b.c(3)) << 30) | ((long) (this.f12349b.c(15) << 15)) | ((long) this.f12349b.c(15));
            this.f12349b.b(1);
            if (!this.f12355h && this.f12354g) {
                this.f12349b.b(4);
                this.f12349b.b(1);
                this.f12349b.b(1);
                this.f12349b.b(1);
                this.f12352e.b((((long) this.f12349b.c(3)) << 30) | ((long) (this.f12349b.c(15) << 15)) | ((long) this.f12349b.c(15)));
                this.f12355h = true;
            }
            this.l = this.f12352e.b(c2);
        }
    }

    public final void a() {
        this.f12350c = 0;
        this.f12351d = 0;
        this.f12355h = false;
        this.f12348a.a();
    }

    public void a(ag agVar, j jVar, ad.d dVar) {
        this.f12352e = agVar;
        this.f12348a.a(jVar, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8 A[SYNTHETIC] */
    public final void a(com.applovin.exoplayer2.l.y r8, int r9) throws com.applovin.exoplayer2.ai {
        /*
            r7 = this;
            com.applovin.exoplayer2.l.ag r0 = r7.f12352e
            com.applovin.exoplayer2.l.a.a(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0047
            int r0 = r7.f12350c
            if (r0 == 0) goto L_0x0044
            if (r0 == r4) goto L_0x0044
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L_0x003f
            if (r0 != r2) goto L_0x0039
            int r0 = r7.j
            if (r0 == r1) goto L_0x007c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.applovin.exoplayer2.l.q.c(r5, r0)
            goto L_0x007c
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x003f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            com.applovin.exoplayer2.l.q.c(r5, r0)
        L_0x0044:
            r7.a(r4)
        L_0x0047:
            int r0 = r8.a()
            if (r0 <= 0) goto L_0x00d8
            int r0 = r7.f12350c
            if (r0 == 0) goto L_0x00cf
            r5 = 0
            if (r0 == r4) goto L_0x00b7
            if (r0 == r3) goto L_0x0088
            if (r0 != r2) goto L_0x0082
            int r0 = r8.a()
            int r6 = r7.j
            if (r6 != r1) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            int r5 = r0 - r6
        L_0x0063:
            if (r5 <= 0) goto L_0x006e
            int r0 = r0 - r5
            int r5 = r8.c()
            int r5 = r5 + r0
            r8.c(r5)
        L_0x006e:
            com.applovin.exoplayer2.e.i.j r5 = r7.f12348a
            r5.a(r8)
            int r5 = r7.j
            if (r5 == r1) goto L_0x0047
            int r5 = r5 - r0
            r7.j = r5
            if (r5 != 0) goto L_0x0047
        L_0x007c:
            com.applovin.exoplayer2.e.i.j r0 = r7.f12348a
            r0.b()
            goto L_0x0044
        L_0x0082:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0088:
            r0 = 10
            int r6 = r7.i
            int r0 = java.lang.Math.min(r0, r6)
            com.applovin.exoplayer2.l.x r6 = r7.f12349b
            byte[] r6 = r6.f13604a
            boolean r0 = r7.a((com.applovin.exoplayer2.l.y) r8, (byte[]) r6, (int) r0)
            if (r0 == 0) goto L_0x0047
            r0 = 0
            int r6 = r7.i
            boolean r0 = r7.a((com.applovin.exoplayer2.l.y) r8, (byte[]) r0, (int) r6)
            if (r0 == 0) goto L_0x0047
            r7.c()
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x00ab
            r5 = 4
        L_0x00ab:
            r9 = r9 | r5
            com.applovin.exoplayer2.e.i.j r0 = r7.f12348a
            long r5 = r7.l
            r0.a((long) r5, (int) r9)
            r7.a(r2)
            goto L_0x0047
        L_0x00b7:
            com.applovin.exoplayer2.l.x r0 = r7.f12349b
            byte[] r0 = r0.f13604a
            r6 = 9
            boolean r0 = r7.a((com.applovin.exoplayer2.l.y) r8, (byte[]) r0, (int) r6)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x00ca
            r5 = 2
        L_0x00ca:
            r7.a(r5)
            goto L_0x0047
        L_0x00cf:
            int r0 = r8.a()
            r8.e(r0)
            goto L_0x0047
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.t.a(com.applovin.exoplayer2.l.y, int):void");
    }
}
