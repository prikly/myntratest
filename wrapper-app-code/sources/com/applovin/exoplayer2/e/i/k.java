package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;

public final class k implements j {

    /* renamed from: c  reason: collision with root package name */
    private static final double[] f12243c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f12244a;

    /* renamed from: b  reason: collision with root package name */
    private x f12245b;

    /* renamed from: d  reason: collision with root package name */
    private final af f12246d;

    /* renamed from: e  reason: collision with root package name */
    private final y f12247e;

    /* renamed from: f  reason: collision with root package name */
    private final r f12248f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean[] f12249g;

    /* renamed from: h  reason: collision with root package name */
    private final a f12250h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    private static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final byte[] f12251d = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public int f12252a;

        /* renamed from: b  reason: collision with root package name */
        public int f12253b;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f12254c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12255e;

        public a(int i) {
            this.f12254c = new byte[i];
        }

        public void a() {
            this.f12255e = false;
            this.f12252a = 0;
            this.f12253b = 0;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f12255e) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12254c;
                int length = bArr2.length;
                int i4 = this.f12252a;
                if (length < i4 + i3) {
                    this.f12254c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f12254c, this.f12252a, i3);
                this.f12252a += i3;
            }
        }

        public boolean a(int i, int i2) {
            if (this.f12255e) {
                int i3 = this.f12252a - i2;
                this.f12252a = i3;
                if (this.f12253b == 0 && i == 181) {
                    this.f12253b = i3;
                } else {
                    this.f12255e = false;
                    return true;
                }
            } else if (i == 179) {
                this.f12255e = true;
            }
            byte[] bArr = f12251d;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    public k() {
        this((af) null);
    }

    k(af afVar) {
        y yVar;
        this.f12246d = afVar;
        this.f12249g = new boolean[4];
        this.f12250h = new a(128);
        if (afVar != null) {
            this.f12248f = new r(178, 128);
            yVar = new y();
        } else {
            yVar = null;
            this.f12248f = null;
        }
        this.f12247e = yVar;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<com.applovin.exoplayer2.v, java.lang.Long> a(com.applovin.exoplayer2.e.i.k.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f12254c
            int r1 = r8.f12252a
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            com.applovin.exoplayer2.v$a r6 = new com.applovin.exoplayer2.v$a
            r6.<init>()
            com.applovin.exoplayer2.v$a r9 = r6.a((java.lang.String) r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.exoplayer2.v$a r9 = r9.f((java.lang.String) r6)
            com.applovin.exoplayer2.v$a r9 = r9.g((int) r2)
            com.applovin.exoplayer2.v$a r9 = r9.h((int) r4)
            com.applovin.exoplayer2.v$a r9 = r9.b((float) r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.exoplayer2.v$a r9 = r9.a((java.util.List<byte[]>) r1)
            com.applovin.exoplayer2.v r9 = r9.a()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x009d
            double[] r5 = f12243c
            int r6 = r5.length
            if (r4 >= r6) goto L_0x009d
            r1 = r5[r4]
            int r8 = r8.f12253b
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x0096
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0096:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x009d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.e.i.k$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        v.a(this.f12249g);
        this.f12250h.a();
        r rVar = this.f12248f;
        if (rVar != null) {
            rVar.a();
        }
        this.i = 0;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        this.m = j2;
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12244a = dVar.c();
        this.f12245b = jVar.a(dVar.b(), 2);
        af afVar = this.f12246d;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.l.y r21) {
        /*
            r20 = this;
            r0 = r20
            com.applovin.exoplayer2.e.x r1 = r0.f12245b
            com.applovin.exoplayer2.l.a.a(r1)
            int r1 = r21.c()
            int r2 = r21.b()
            byte[] r3 = r21.d()
            long r4 = r0.i
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.i = r4
            com.applovin.exoplayer2.e.x r4 = r0.f12245b
            int r5 = r21.a()
            r6 = r21
            r4.a(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f12249g
            int r4 = com.applovin.exoplayer2.l.v.a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.k
            if (r4 != 0) goto L_0x0039
            com.applovin.exoplayer2.e.i.k$a r4 = r0.f12250h
            r4.a(r3, r1, r2)
        L_0x0039:
            com.applovin.exoplayer2.e.i.r r4 = r0.f12248f
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.d()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.k
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            com.applovin.exoplayer2.e.i.k$a r9 = r0.f12250h
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            com.applovin.exoplayer2.e.i.k$a r12 = r0.f12250h
            boolean r9 = r12.a(r5, r9)
            if (r9 == 0) goto L_0x008a
            com.applovin.exoplayer2.e.i.k$a r9 = r0.f12250h
            java.lang.String r12 = r0.f12244a
            java.lang.Object r12 = com.applovin.exoplayer2.l.a.b(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = a((com.applovin.exoplayer2.e.i.k.a) r9, (java.lang.String) r12)
            com.applovin.exoplayer2.e.x r12 = r0.f12245b
            java.lang.Object r13 = r9.first
            com.applovin.exoplayer2.v r13 = (com.applovin.exoplayer2.v) r13
            r12.a(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.l = r12
            r0.k = r11
        L_0x008a:
            com.applovin.exoplayer2.e.i.r r9 = r0.f12248f
            if (r9 == 0) goto L_0x00db
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = 0
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            com.applovin.exoplayer2.e.i.r r8 = r0.f12248f
            boolean r1 = r8.b(r1)
            if (r1 == 0) goto L_0x00c8
            com.applovin.exoplayer2.e.i.r r1 = r0.f12248f
            byte[] r1 = r1.f12340a
            com.applovin.exoplayer2.e.i.r r8 = r0.f12248f
            int r8 = r8.f12341b
            int r1 = com.applovin.exoplayer2.l.v.a((byte[]) r1, (int) r8)
            com.applovin.exoplayer2.l.y r8 = r0.f12247e
            java.lang.Object r8 = com.applovin.exoplayer2.l.ai.a(r8)
            com.applovin.exoplayer2.l.y r8 = (com.applovin.exoplayer2.l.y) r8
            com.applovin.exoplayer2.e.i.r r9 = r0.f12248f
            byte[] r9 = r9.f12340a
            r8.a((byte[]) r9, (int) r1)
            com.applovin.exoplayer2.e.i.af r1 = r0.f12246d
            java.lang.Object r1 = com.applovin.exoplayer2.l.ai.a(r1)
            com.applovin.exoplayer2.e.i.af r1 = (com.applovin.exoplayer2.e.i.af) r1
            long r8 = r0.o
            com.applovin.exoplayer2.l.y r12 = r0.f12247e
            r1.a((long) r8, (com.applovin.exoplayer2.l.y) r12)
        L_0x00c8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00db
            byte[] r1 = r21.d()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00db
            com.applovin.exoplayer2.e.i.r r1 = r0.f12248f
            r1.a(r5)
        L_0x00db:
            if (r5 == 0) goto L_0x00e9
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e2
            goto L_0x00e9
        L_0x00e2:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0147
            r0.p = r11
            goto L_0x0147
        L_0x00e9:
            int r1 = r2 - r4
            boolean r4 = r0.q
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0114
            boolean r4 = r0.k
            if (r4 == 0) goto L_0x0114
            long r13 = r0.o
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0114
            boolean r15 = r0.p
            long r11 = r0.i
            r19 = r5
            long r4 = r0.n
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            com.applovin.exoplayer2.e.x r12 = r0.f12245b
            r18 = 0
            r17 = r1
            r12.a(r13, r15, r16, r17, r18)
            goto L_0x0116
        L_0x0114:
            r19 = r5
        L_0x0116:
            boolean r4 = r0.j
            if (r4 == 0) goto L_0x0121
            boolean r4 = r0.q
            if (r4 == 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r1 = 1
            goto L_0x0142
        L_0x0121:
            long r4 = r0.i
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.n = r4
            long r4 = r0.m
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012e
            goto L_0x0139
        L_0x012e:
            long r4 = r0.o
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0138
            long r11 = r0.l
            long r4 = r4 + r11
            goto L_0x0139
        L_0x0138:
            r4 = r8
        L_0x0139:
            r0.o = r4
            r0.p = r10
            r0.m = r8
            r1 = 1
            r0.j = r1
        L_0x0142:
            if (r19 != 0) goto L_0x0145
            r10 = 1
        L_0x0145:
            r0.q = r10
        L_0x0147:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.l.y):void");
    }

    public void b() {
    }
}
