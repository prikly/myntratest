package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;

public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f12256a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    private final af f12257b;

    /* renamed from: c  reason: collision with root package name */
    private final y f12258c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f12259d;

    /* renamed from: e  reason: collision with root package name */
    private final a f12260e;

    /* renamed from: f  reason: collision with root package name */
    private final r f12261f;

    /* renamed from: g  reason: collision with root package name */
    private b f12262g;

    /* renamed from: h  reason: collision with root package name */
    private long f12263h;
    private String i;
    private x j;
    private boolean k;
    private long l;

    private static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final byte[] f12264d = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public int f12265a;

        /* renamed from: b  reason: collision with root package name */
        public int f12266b;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f12267c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12268e;

        /* renamed from: f  reason: collision with root package name */
        private int f12269f;

        public a(int i) {
            this.f12267c = new byte[i];
        }

        public void a() {
            this.f12268e = false;
            this.f12265a = 0;
            this.f12269f = 0;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f12268e) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12267c;
                int length = bArr2.length;
                int i4 = this.f12265a;
                if (length < i4 + i3) {
                    this.f12267c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f12267c, this.f12265a, i3);
                this.f12265a += i3;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
            if (r9 != 181) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f12269f
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x004b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L_0x003f
                r7 = 3
                if (r0 == r4) goto L_0x0037
                r4 = 4
                if (r0 == r7) goto L_0x002b
                if (r0 != r4) goto L_0x0025
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L_0x001d
                if (r9 != r3) goto L_0x0053
            L_0x001d:
                int r9 = r8.f12265a
                int r9 = r9 - r10
                r8.f12265a = r9
                r8.f12268e = r1
                return r2
            L_0x0025:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L_0x002b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L_0x0032
                goto L_0x0041
            L_0x0032:
                int r9 = r8.f12265a
                r8.f12266b = r9
                goto L_0x0048
            L_0x0037:
                r10 = 31
                if (r9 <= r10) goto L_0x003c
                goto L_0x0041
            L_0x003c:
                r8.f12269f = r7
                goto L_0x0053
            L_0x003f:
                if (r9 == r3) goto L_0x0048
            L_0x0041:
                com.applovin.exoplayer2.l.q.c(r6, r5)
                r8.a()
                goto L_0x0053
            L_0x0048:
                r8.f12269f = r4
                goto L_0x0053
            L_0x004b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L_0x0053
                r8.f12269f = r2
                r8.f12268e = r2
            L_0x0053:
                byte[] r9 = f12264d
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.l.a.a(int, int):boolean");
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x f12270a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12271b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12272c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f12273d;

        /* renamed from: e  reason: collision with root package name */
        private int f12274e;

        /* renamed from: f  reason: collision with root package name */
        private int f12275f;

        /* renamed from: g  reason: collision with root package name */
        private long f12276g;

        /* renamed from: h  reason: collision with root package name */
        private long f12277h;

        public b(x xVar) {
            this.f12270a = xVar;
        }

        public void a() {
            this.f12271b = false;
            this.f12272c = false;
            this.f12273d = false;
            this.f12274e = -1;
        }

        public void a(int i, long j) {
            this.f12274e = i;
            this.f12273d = false;
            boolean z = true;
            this.f12271b = i == 182 || i == 179;
            if (i != 182) {
                z = false;
            }
            this.f12272c = z;
            this.f12275f = 0;
            this.f12277h = j;
        }

        public void a(long j, int i, boolean z) {
            if (this.f12274e == 182 && z && this.f12271b) {
                long j2 = this.f12277h;
                if (j2 != -9223372036854775807L) {
                    int i2 = (int) (j - this.f12276g);
                    this.f12270a.a(j2, this.f12273d ? 1 : 0, i2, i, (x.a) null);
                }
            }
            if (this.f12274e != 179) {
                this.f12276g = j;
            }
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f12272c) {
                int i3 = this.f12275f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.f12273d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f12272c = false;
                    return;
                }
                this.f12275f = i3 + (i2 - i);
            }
        }
    }

    public l() {
        this((af) null);
    }

    l(af afVar) {
        y yVar;
        this.f12257b = afVar;
        this.f12259d = new boolean[4];
        this.f12260e = new a(128);
        this.l = -9223372036854775807L;
        if (afVar != null) {
            this.f12261f = new r(178, 128);
            yVar = new y();
        } else {
            yVar = null;
            this.f12261f = null;
        }
        this.f12258c = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.e.i.l.a r8, int r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f12267c
            int r8 = r8.f12265a
            byte[] r8 = java.util.Arrays.copyOf(r0, r8)
            com.applovin.exoplayer2.l.x r0 = new com.applovin.exoplayer2.l.x
            r0.<init>(r8)
            r0.e(r9)
            r9 = 4
            r0.e(r9)
            r0.d()
            r1 = 8
            r0.b(r1)
            boolean r2 = r0.e()
            r3 = 3
            if (r2 == 0) goto L_0x0029
            r0.b(r9)
            r0.b(r3)
        L_0x0029:
            int r9 = r0.c(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "Invalid aspect ratio"
            java.lang.String r5 = "H263Reader"
            r6 = 15
            if (r9 != r6) goto L_0x0047
            int r9 = r0.c(r1)
            int r1 = r0.c(r1)
            if (r1 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            float r9 = (float) r9
            float r1 = (float) r1
            float r9 = r9 / r1
            r2 = r9
            goto L_0x0052
        L_0x0047:
            float[] r1 = f12256a
            int r7 = r1.length
            if (r9 >= r7) goto L_0x004f
            r2 = r1[r9]
            goto L_0x0052
        L_0x004f:
            com.applovin.exoplayer2.l.q.c(r5, r4)
        L_0x0052:
            boolean r9 = r0.e()
            r1 = 2
            if (r9 == 0) goto L_0x0089
            r0.b(r1)
            r9 = 1
            r0.b(r9)
            boolean r9 = r0.e()
            if (r9 == 0) goto L_0x0089
            r0.b(r6)
            r0.d()
            r0.b(r6)
            r0.d()
            r0.b(r6)
            r0.d()
            r0.b(r3)
            r9 = 11
            r0.b(r9)
            r0.d()
            r0.b(r6)
            r0.d()
        L_0x0089:
            int r9 = r0.c(r1)
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = "Unhandled video object layer shape"
            com.applovin.exoplayer2.l.q.c(r5, r9)
        L_0x0094:
            r0.d()
            r9 = 16
            int r9 = r0.c(r9)
            r0.d()
            boolean r1 = r0.e()
            if (r1 == 0) goto L_0x00bb
            if (r9 != 0) goto L_0x00ae
            java.lang.String r9 = "Invalid vop_increment_time_resolution"
            com.applovin.exoplayer2.l.q.c(r5, r9)
            goto L_0x00bb
        L_0x00ae:
            int r9 = r9 + -1
            r1 = 0
        L_0x00b1:
            if (r9 <= 0) goto L_0x00b8
            int r1 = r1 + 1
            int r9 = r9 >> 1
            goto L_0x00b1
        L_0x00b8:
            r0.b(r1)
        L_0x00bb:
            r0.d()
            r9 = 13
            int r1 = r0.c(r9)
            r0.d()
            int r9 = r0.c(r9)
            r0.d()
            r0.d()
            com.applovin.exoplayer2.v$a r0 = new com.applovin.exoplayer2.v$a
            r0.<init>()
            com.applovin.exoplayer2.v$a r10 = r0.a((java.lang.String) r10)
            java.lang.String r0 = "video/mp4v-es"
            com.applovin.exoplayer2.v$a r10 = r10.f((java.lang.String) r0)
            com.applovin.exoplayer2.v$a r10 = r10.g((int) r1)
            com.applovin.exoplayer2.v$a r9 = r10.h((int) r9)
            com.applovin.exoplayer2.v$a r9 = r9.b((float) r2)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            com.applovin.exoplayer2.v$a r8 = r9.a((java.util.List<byte[]>) r8)
            com.applovin.exoplayer2.v r8 = r8.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.l.a(com.applovin.exoplayer2.e.i.l$a, int, java.lang.String):com.applovin.exoplayer2.v");
    }

    public void a() {
        v.a(this.f12259d);
        this.f12260e.a();
        b bVar = this.f12262g;
        if (bVar != null) {
            bVar.a();
        }
        r rVar = this.f12261f;
        if (rVar != null) {
            rVar.a();
        }
        this.f12263h = 0;
        this.l = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.i = dVar.c();
        x a2 = jVar.a(dVar.b(), 2);
        this.j = a2;
        this.f12262g = new b(a2);
        af afVar = this.f12257b;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    public void a(y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f12262g);
        com.applovin.exoplayer2.l.a.a(this.j);
        int c2 = yVar.c();
        int b2 = yVar.b();
        byte[] d2 = yVar.d();
        this.f12263h += (long) yVar.a();
        this.j.a(yVar, yVar.a());
        while (true) {
            int a2 = v.a(d2, c2, b2, this.f12259d);
            if (a2 == b2) {
                break;
            }
            int i2 = a2 + 3;
            byte b3 = yVar.d()[i2] & 255;
            int i3 = a2 - c2;
            int i4 = 0;
            if (!this.k) {
                if (i3 > 0) {
                    this.f12260e.a(d2, c2, a2);
                }
                if (this.f12260e.a(b3, i3 < 0 ? -i3 : 0)) {
                    x xVar = this.j;
                    a aVar = this.f12260e;
                    xVar.a(a(aVar, aVar.f12266b, (String) com.applovin.exoplayer2.l.a.b(this.i)));
                    this.k = true;
                }
            }
            this.f12262g.a(d2, c2, a2);
            r rVar = this.f12261f;
            if (rVar != null) {
                if (i3 > 0) {
                    rVar.a(d2, c2, a2);
                } else {
                    i4 = -i3;
                }
                if (this.f12261f.b(i4)) {
                    ((y) ai.a(this.f12258c)).a(this.f12261f.f12340a, v.a(this.f12261f.f12340a, this.f12261f.f12341b));
                    ((af) ai.a(this.f12257b)).a(this.l, this.f12258c);
                }
                if (b3 == 178 && yVar.d()[a2 + 2] == 1) {
                    this.f12261f.a(b3);
                }
            }
            int i5 = b2 - a2;
            this.f12262g.a(this.f12263h - ((long) i5), i5, this.k);
            this.f12262g.a(b3, this.l);
            c2 = i2;
        }
        if (!this.k) {
            this.f12260e.a(d2, c2, b2);
        }
        this.f12262g.a(d2, c2, b2);
        r rVar2 = this.f12261f;
        if (rVar2 != null) {
            rVar2.a(d2, c2, b2);
        }
    }

    public void b() {
    }
}
