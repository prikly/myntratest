package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class w implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12366a = $$Lambda$w$5Weks6gnHQS7C0GU3KjY2qoJIzk.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final ag f12367b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<a> f12368c;

    /* renamed from: d  reason: collision with root package name */
    private final y f12369d;

    /* renamed from: e  reason: collision with root package name */
    private final v f12370e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12371f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12372g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12373h;
    private long i;
    private u j;
    private j k;
    private boolean l;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final j f12374a;

        /* renamed from: b  reason: collision with root package name */
        private final ag f12375b;

        /* renamed from: c  reason: collision with root package name */
        private final x f12376c = new x(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f12377d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12378e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12379f;

        /* renamed from: g  reason: collision with root package name */
        private int f12380g;

        /* renamed from: h  reason: collision with root package name */
        private long f12381h;

        public a(j jVar, ag agVar) {
            this.f12374a = jVar;
            this.f12375b = agVar;
        }

        private void b() {
            this.f12376c.b(8);
            this.f12377d = this.f12376c.e();
            this.f12378e = this.f12376c.e();
            this.f12376c.b(6);
            this.f12380g = this.f12376c.c(8);
        }

        private void c() {
            this.f12381h = 0;
            if (this.f12377d) {
                this.f12376c.b(4);
                this.f12376c.b(1);
                this.f12376c.b(1);
                long c2 = (((long) this.f12376c.c(3)) << 30) | ((long) (this.f12376c.c(15) << 15)) | ((long) this.f12376c.c(15));
                this.f12376c.b(1);
                if (!this.f12379f && this.f12378e) {
                    this.f12376c.b(4);
                    this.f12376c.b(1);
                    this.f12376c.b(1);
                    this.f12376c.b(1);
                    this.f12375b.b((((long) this.f12376c.c(3)) << 30) | ((long) (this.f12376c.c(15) << 15)) | ((long) this.f12376c.c(15)));
                    this.f12379f = true;
                }
                this.f12381h = this.f12375b.b(c2);
            }
        }

        public void a() {
            this.f12379f = false;
            this.f12374a.a();
        }

        public void a(y yVar) throws ai {
            yVar.a(this.f12376c.f13604a, 0, 3);
            this.f12376c.a(0);
            b();
            yVar.a(this.f12376c.f13604a, 0, this.f12380g);
            this.f12376c.a(0);
            c();
            this.f12374a.a(this.f12381h, 4);
            this.f12374a.a(yVar);
            this.f12374a.b();
        }
    }

    public w() {
        this(new ag(0));
    }

    public w(ag agVar) {
        this.f12367b = agVar;
        this.f12369d = new y(4096);
        this.f12368c = new SparseArray<>();
        this.f12370e = new v();
    }

    private void a(long j2) {
        v vVar;
        j jVar;
        if (!this.l) {
            this.l = true;
            if (this.f12370e.c() != -9223372036854775807L) {
                u uVar = new u(this.f12370e.b(), this.f12370e.c(), j2);
                this.j = uVar;
                jVar = this.k;
                vVar = uVar.a();
            } else {
                jVar = this.k;
                vVar = new v.b(this.f12370e.c());
            }
            jVar.a(vVar);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] a() {
        return new h[]{new w()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(com.applovin.exoplayer2.e.i r11, com.applovin.exoplayer2.e.u r12) throws java.io.IOException {
        /*
            r10 = this;
            com.applovin.exoplayer2.e.j r0 = r10.k
            com.applovin.exoplayer2.l.a.a(r0)
            long r0 = r11.d()
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0013
            r7 = 1
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            if (r7 == 0) goto L_0x0025
            com.applovin.exoplayer2.e.i.v r7 = r10.f12370e
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0025
            com.applovin.exoplayer2.e.i.v r0 = r10.f12370e
            int r11 = r0.a((com.applovin.exoplayer2.e.i) r11, (com.applovin.exoplayer2.e.u) r12)
            return r11
        L_0x0025:
            r10.a((long) r0)
            com.applovin.exoplayer2.e.i.u r7 = r10.j
            if (r7 == 0) goto L_0x0039
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0039
            com.applovin.exoplayer2.e.i.u r0 = r10.j
            int r11 = r0.a((com.applovin.exoplayer2.e.i) r11, (com.applovin.exoplayer2.e.u) r12)
            return r11
        L_0x0039:
            r11.a()
            if (r6 == 0) goto L_0x0044
            long r6 = r11.b()
            long r0 = r0 - r6
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            r12 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0051
            r2 = 4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0051
            return r12
        L_0x0051:
            com.applovin.exoplayer2.l.y r0 = r10.f12369d
            byte[] r0 = r0.d()
            r1 = 4
            boolean r0 = r11.b(r0, r5, r1, r4)
            if (r0 != 0) goto L_0x005f
            return r12
        L_0x005f:
            com.applovin.exoplayer2.l.y r0 = r10.f12369d
            r0.d(r5)
            com.applovin.exoplayer2.l.y r0 = r10.f12369d
            int r0 = r0.q()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L_0x006f
            return r12
        L_0x006f:
            r12 = 442(0x1ba, float:6.2E-43)
            if (r0 != r12) goto L_0x0093
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            byte[] r12 = r12.d()
            r0 = 10
            r11.d(r12, r5, r0)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            r0 = 9
            r12.d(r0)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            int r12 = r12.h()
            r12 = r12 & 7
            int r12 = r12 + 14
        L_0x008f:
            r11.b(r12)
            return r5
        L_0x0093:
            r12 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r2 = 6
            if (r0 != r12) goto L_0x00af
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            byte[] r12 = r12.d()
            r11.d(r12, r5, r1)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            r12.d(r5)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            int r12 = r12.i()
            int r12 = r12 + r2
            goto L_0x008f
        L_0x00af:
            r12 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r12 = r12 >> 8
            if (r12 == r4) goto L_0x00b9
            r11.b(r4)
            return r5
        L_0x00b9:
            r12 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.applovin.exoplayer2.e.i.w$a> r0 = r10.f12368c
            java.lang.Object r0 = r0.get(r12)
            com.applovin.exoplayer2.e.i.w$a r0 = (com.applovin.exoplayer2.e.i.w.a) r0
            boolean r3 = r10.f12371f
            if (r3 != 0) goto L_0x0130
            if (r0 != 0) goto L_0x0110
            r3 = 0
            r6 = 189(0xbd, float:2.65E-43)
            if (r12 != r6) goto L_0x00dc
            com.applovin.exoplayer2.e.i.b r3 = new com.applovin.exoplayer2.e.i.b
            r3.<init>()
        L_0x00d3:
            r10.f12372g = r4
        L_0x00d5:
            long r6 = r11.c()
            r10.i = r6
            goto L_0x00f6
        L_0x00dc:
            r6 = r12 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x00e8
            com.applovin.exoplayer2.e.i.q r3 = new com.applovin.exoplayer2.e.i.q
            r3.<init>()
            goto L_0x00d3
        L_0x00e8:
            r6 = r12 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00f6
            com.applovin.exoplayer2.e.i.k r3 = new com.applovin.exoplayer2.e.i.k
            r3.<init>()
            r10.f12373h = r4
            goto L_0x00d5
        L_0x00f6:
            if (r3 == 0) goto L_0x0110
            com.applovin.exoplayer2.e.i.ad$d r0 = new com.applovin.exoplayer2.e.i.ad$d
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r12, r6)
            com.applovin.exoplayer2.e.j r6 = r10.k
            r3.a((com.applovin.exoplayer2.e.j) r6, (com.applovin.exoplayer2.e.i.ad.d) r0)
            com.applovin.exoplayer2.e.i.w$a r0 = new com.applovin.exoplayer2.e.i.w$a
            com.applovin.exoplayer2.l.ag r6 = r10.f12367b
            r0.<init>(r3, r6)
            android.util.SparseArray<com.applovin.exoplayer2.e.i.w$a> r3 = r10.f12368c
            r3.put(r12, r0)
        L_0x0110:
            boolean r12 = r10.f12372g
            if (r12 == 0) goto L_0x011e
            boolean r12 = r10.f12373h
            if (r12 == 0) goto L_0x011e
            long r6 = r10.i
            r8 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r8
            goto L_0x0121
        L_0x011e:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L_0x0121:
            long r8 = r11.c()
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0130
            r10.f12371f = r4
            com.applovin.exoplayer2.e.j r12 = r10.k
            r12.a()
        L_0x0130:
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            byte[] r12 = r12.d()
            r11.d(r12, r5, r1)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            r12.d(r5)
            com.applovin.exoplayer2.l.y r12 = r10.f12369d
            int r12 = r12.i()
            int r12 = r12 + r2
            if (r0 != 0) goto L_0x014b
            r11.b(r12)
            goto L_0x016c
        L_0x014b:
            com.applovin.exoplayer2.l.y r1 = r10.f12369d
            r1.a((int) r12)
            com.applovin.exoplayer2.l.y r1 = r10.f12369d
            byte[] r1 = r1.d()
            r11.b(r1, r5, r12)
            com.applovin.exoplayer2.l.y r11 = r10.f12369d
            r11.d(r2)
            com.applovin.exoplayer2.l.y r11 = r10.f12369d
            r0.a(r11)
            com.applovin.exoplayer2.l.y r11 = r10.f12369d
            int r12 = r11.e()
            r11.c(r12)
        L_0x016c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.w.a(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):int");
    }

    public void a(long j2, long j3) {
        boolean z = true;
        boolean z2 = this.f12367b.c() == -9223372036854775807L;
        if (!z2) {
            long a2 = this.f12367b.a();
            if (a2 == -9223372036854775807L || a2 == 0 || a2 == j3) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.f12367b.a(j3);
        }
        u uVar = this.j;
        if (uVar != null) {
            uVar.a(j3);
        }
        for (int i2 = 0; i2 < this.f12368c.size(); i2++) {
            this.f12368c.valueAt(i2).a();
        }
    }

    public void a(j jVar) {
        this.k = jVar;
    }

    public boolean a(i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.d(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.c(bArr[13] & 7);
        iVar.d(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public void c() {
    }
}
