package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import com.applovin.exoplayer2.v;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final z f12278a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12279b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12280c;

    /* renamed from: d  reason: collision with root package name */
    private final r f12281d = new r(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final r f12282e = new r(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final r f12283f = new r(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f12284g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f12285h = new boolean[3];
    private String i;
    private x j;
    private a k;
    private boolean l;
    private long m = -9223372036854775807L;
    private boolean n;
    private final y o = new y();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x f12286a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f12287b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f12288c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<v.b> f12289d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<v.a> f12290e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        private final z f12291f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f12292g;

        /* renamed from: h  reason: collision with root package name */
        private int f12293h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private C0119a m = new C0119a();
        private C0119a n = new C0119a();
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        /* renamed from: com.applovin.exoplayer2.e.i.m$a$a  reason: collision with other inner class name */
        private static final class C0119a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f12294a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f12295b;

            /* renamed from: c  reason: collision with root package name */
            private v.b f12296c;

            /* renamed from: d  reason: collision with root package name */
            private int f12297d;

            /* renamed from: e  reason: collision with root package name */
            private int f12298e;

            /* renamed from: f  reason: collision with root package name */
            private int f12299f;

            /* renamed from: g  reason: collision with root package name */
            private int f12300g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f12301h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private C0119a() {
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                r4 = r6.f12297d;
                r5 = r7.f12297d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
                r0 = r6.k;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean a(com.applovin.exoplayer2.e.i.m.a.C0119a r7) {
                /*
                    r6 = this;
                    boolean r0 = r6.f12294a
                    r1 = 0
                    if (r0 != 0) goto L_0x0006
                    return r1
                L_0x0006:
                    boolean r0 = r7.f12294a
                    r2 = 1
                    if (r0 != 0) goto L_0x000c
                    return r2
                L_0x000c:
                    com.applovin.exoplayer2.l.v$b r0 = r6.f12296c
                    java.lang.Object r0 = com.applovin.exoplayer2.l.a.a(r0)
                    com.applovin.exoplayer2.l.v$b r0 = (com.applovin.exoplayer2.l.v.b) r0
                    com.applovin.exoplayer2.l.v$b r3 = r7.f12296c
                    java.lang.Object r3 = com.applovin.exoplayer2.l.a.a(r3)
                    com.applovin.exoplayer2.l.v$b r3 = (com.applovin.exoplayer2.l.v.b) r3
                    int r4 = r6.f12299f
                    int r5 = r7.f12299f
                    if (r4 != r5) goto L_0x007c
                    int r4 = r6.f12300g
                    int r5 = r7.f12300g
                    if (r4 != r5) goto L_0x007c
                    boolean r4 = r6.f12301h
                    boolean r5 = r7.f12301h
                    if (r4 != r5) goto L_0x007c
                    boolean r4 = r6.i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r7.i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r6.j
                    boolean r5 = r7.j
                    if (r4 != r5) goto L_0x007c
                L_0x003c:
                    int r4 = r6.f12297d
                    int r5 = r7.f12297d
                    if (r4 == r5) goto L_0x0046
                    if (r4 == 0) goto L_0x007c
                    if (r5 == 0) goto L_0x007c
                L_0x0046:
                    int r4 = r0.k
                    if (r4 != 0) goto L_0x005a
                    int r4 = r3.k
                    if (r4 != 0) goto L_0x005a
                    int r4 = r6.m
                    int r5 = r7.m
                    if (r4 != r5) goto L_0x007c
                    int r4 = r6.n
                    int r5 = r7.n
                    if (r4 != r5) goto L_0x007c
                L_0x005a:
                    int r0 = r0.k
                    if (r0 != r2) goto L_0x006e
                    int r0 = r3.k
                    if (r0 != r2) goto L_0x006e
                    int r0 = r6.o
                    int r3 = r7.o
                    if (r0 != r3) goto L_0x007c
                    int r0 = r6.p
                    int r3 = r7.p
                    if (r0 != r3) goto L_0x007c
                L_0x006e:
                    boolean r0 = r6.k
                    boolean r3 = r7.k
                    if (r0 != r3) goto L_0x007c
                    if (r0 == 0) goto L_0x007d
                    int r0 = r6.l
                    int r7 = r7.l
                    if (r0 == r7) goto L_0x007d
                L_0x007c:
                    r1 = 1
                L_0x007d:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.m.a.C0119a.a(com.applovin.exoplayer2.e.i.m$a$a):boolean");
            }

            public void a() {
                this.f12295b = false;
                this.f12294a = false;
            }

            public void a(int i2) {
                this.f12298e = i2;
                this.f12295b = true;
            }

            public void a(v.b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.f12296c = bVar;
                this.f12297d = i2;
                this.f12298e = i3;
                this.f12299f = i4;
                this.f12300g = i5;
                this.f12301h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.f12294a = true;
                this.f12295b = true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f12298e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean b() {
                /*
                    r2 = this;
                    boolean r0 = r2.f12295b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f12298e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.m.a.C0119a.b():boolean");
            }
        }

        public a(x xVar, boolean z, boolean z2) {
            this.f12286a = xVar;
            this.f12287b = z;
            this.f12288c = z2;
            byte[] bArr = new byte[128];
            this.f12292g = bArr;
            this.f12291f = new z(bArr, 0, 0);
            b();
        }

        private void a(int i2) {
            long j2 = this.q;
            if (j2 != -9223372036854775807L) {
                boolean z = this.r;
                this.f12286a.a(j2, z ? 1 : 0, (int) (this.j - this.p), i2, (x.a) null);
            }
        }

        public void a(long j2, int i2, long j3) {
            this.i = i2;
            this.l = j3;
            this.j = j2;
            if (!this.f12287b || i2 != 1) {
                if (this.f12288c) {
                    int i3 = this.i;
                    if (!(i3 == 5 || i3 == 1 || i3 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C0119a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.a();
            this.f12293h = 0;
            this.k = true;
        }

        public void a(v.a aVar) {
            this.f12290e.append(aVar.f13585a, aVar);
        }

        public void a(v.b bVar) {
            this.f12289d.append(bVar.f13591d, bVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f12292g
                int r4 = r3.length
                int r5 = r0.f12293h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f12292g = r3
            L_0x001e:
                byte[] r3 = r0.f12292g
                int r4 = r0.f12293h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f12293h
                int r1 = r1 + r2
                r0.f12293h = r1
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                byte[] r3 = r0.f12292g
                r4 = 0
                r2.a(r3, r4, r1)
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                r1.a()
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                int r10 = r1.c(r7)
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                r2 = 5
                r1.a(r2)
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                r1.d()
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                int r11 = r1.d()
                boolean r1 = r0.f12288c
                if (r1 != 0) goto L_0x0079
                r0.k = r4
                com.applovin.exoplayer2.e.i.m$a$a r1 = r0.n
                r1.a((int) r11)
                return
            L_0x0079:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                int r13 = r1.d()
                android.util.SparseArray<com.applovin.exoplayer2.l.v$a> r1 = r0.f12290e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.k = r4
                return
            L_0x0093:
                android.util.SparseArray<com.applovin.exoplayer2.l.v$a> r1 = r0.f12290e
                java.lang.Object r1 = r1.get(r13)
                com.applovin.exoplayer2.l.v$a r1 = (com.applovin.exoplayer2.l.v.a) r1
                android.util.SparseArray<com.applovin.exoplayer2.l.v$b> r3 = r0.f12289d
                int r5 = r1.f13586b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                com.applovin.exoplayer2.l.v$b r9 = (com.applovin.exoplayer2.l.v.b) r9
                boolean r3 = r9.f13595h
                if (r3 == 0) goto L_0x00b8
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                r3.a(r7)
            L_0x00b8:
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                int r5 = r9.j
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                int r5 = r9.j
                int r12 = r3.c(r5)
                boolean r3 = r9.i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                com.applovin.exoplayer2.l.z r3 = r0.f12291f
                boolean r3 = r3.b()
                if (r3 == 0) goto L_0x00f5
                com.applovin.exoplayer2.l.z r6 = r0.f12291f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                com.applovin.exoplayer2.l.z r6 = r0.f12291f
                boolean r6 = r6.b()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                int r2 = r2.d()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.k
                if (r2 != 0) goto L_0x014e
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                int r3 = r9.l
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                int r3 = r9.l
                int r2 = r2.c(r3)
                boolean r1 = r1.f13587c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                int r1 = r1.e()
                r20 = r1
                r19 = r2
                goto L_0x018e
            L_0x014b:
                r19 = r2
                goto L_0x018c
            L_0x014e:
                int r2 = r9.k
                if (r2 != r5) goto L_0x018a
                boolean r2 = r9.m
                if (r2 != 0) goto L_0x018a
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x015f
                return
            L_0x015f:
                com.applovin.exoplayer2.l.z r2 = r0.f12291f
                int r2 = r2.e()
                boolean r1 = r1.f13587c
                if (r1 == 0) goto L_0x0183
                if (r14 != 0) goto L_0x0183
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0174
                return
            L_0x0174:
                com.applovin.exoplayer2.l.z r1 = r0.f12291f
                int r1 = r1.e()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0192
            L_0x0183:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x018a:
                r19 = 0
            L_0x018c:
                r20 = 0
            L_0x018e:
                r21 = 0
            L_0x0190:
                r22 = 0
            L_0x0192:
                com.applovin.exoplayer2.e.i.m$a$a r8 = r0.n
                r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.m.a.a(byte[], int, int):void");
        }

        public boolean a() {
            return this.f12288c;
        }

        public boolean a(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.f12288c && this.n.a(this.m))) {
                if (z && this.o) {
                    a(i2 + ((int) (j2 - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.f12287b) {
                z2 = this.n.b();
            }
            boolean z4 = this.r;
            int i3 = this.i;
            if (i3 == 5 || (z2 && i3 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public void b() {
            this.k = false;
            this.o = false;
            this.n.a();
        }
    }

    public m(z zVar, boolean z, boolean z2) {
        this.f12278a = zVar;
        this.f12279b = z;
        this.f12280c = z2;
    }

    private void a(long j2, int i2, int i3, long j3) {
        r rVar;
        if (!this.l || this.k.a()) {
            this.f12281d.b(i3);
            this.f12282e.b(i3);
            if (!this.l) {
                if (this.f12281d.b() && this.f12282e.b()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.f12281d.f12340a, this.f12281d.f12341b));
                    arrayList.add(Arrays.copyOf(this.f12282e.f12340a, this.f12282e.f12341b));
                    v.b a2 = v.a(this.f12281d.f12340a, 3, this.f12281d.f12341b);
                    v.a b2 = v.b(this.f12282e.f12340a, 3, this.f12282e.f12341b);
                    this.j.a(new v.a().a(this.i).f(MimeTypes.VIDEO_H264).d(e.a(a2.f13588a, a2.f13589b, a2.f13590c)).g(a2.f13592e).h(a2.f13593f).b(a2.f13594g).a((List<byte[]>) arrayList).a());
                    this.l = true;
                    this.k.a(a2);
                    this.k.a(b2);
                    this.f12281d.a();
                    rVar = this.f12282e;
                }
            } else if (this.f12281d.b()) {
                this.k.a(com.applovin.exoplayer2.l.v.a(this.f12281d.f12340a, 3, this.f12281d.f12341b));
                rVar = this.f12281d;
            } else if (this.f12282e.b()) {
                this.k.a(com.applovin.exoplayer2.l.v.b(this.f12282e.f12340a, 3, this.f12282e.f12341b));
                rVar = this.f12282e;
            }
            rVar.a();
        }
        if (this.f12283f.b(i3)) {
            this.o.a(this.f12283f.f12340a, com.applovin.exoplayer2.l.v.a(this.f12283f.f12340a, this.f12283f.f12341b));
            this.o.d(4);
            this.f12278a.a(j3, this.o);
        }
        if (this.k.a(j2, i2, this.l, this.n)) {
            this.n = false;
        }
    }

    private void a(long j2, int i2, long j3) {
        if (!this.l || this.k.a()) {
            this.f12281d.a(i2);
            this.f12282e.a(i2);
        }
        this.f12283f.a(i2);
        this.k.a(j2, i2, j3);
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.a()) {
            this.f12281d.a(bArr, i2, i3);
            this.f12282e.a(bArr, i2, i3);
        }
        this.f12283f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.j);
        ai.a(this.k);
    }

    public void a() {
        this.f12284g = 0;
        this.n = false;
        this.m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.f12285h);
        this.f12281d.a();
        this.f12282e.a();
        this.f12283f.a();
        a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.m = j2;
        }
        this.n |= (i2 & 2) != 0;
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.i = dVar.c();
        x a2 = jVar.a(dVar.b(), 2);
        this.j = a2;
        this.k = new a(a2, this.f12279b, this.f12280c);
        this.f12278a.a(jVar, dVar);
    }

    public void a(y yVar) {
        c();
        int c2 = yVar.c();
        int b2 = yVar.b();
        byte[] d2 = yVar.d();
        this.f12284g += (long) yVar.a();
        this.j.a(yVar, yVar.a());
        while (true) {
            int a2 = com.applovin.exoplayer2.l.v.a(d2, c2, b2, this.f12285h);
            if (a2 == b2) {
                a(d2, c2, b2);
                return;
            }
            int b3 = com.applovin.exoplayer2.l.v.b(d2, a2);
            int i2 = a2 - c2;
            if (i2 > 0) {
                a(d2, c2, a2);
            }
            int i3 = b2 - a2;
            long j2 = this.f12284g - ((long) i3);
            a(j2, i3, i2 < 0 ? -i2 : 0, this.m);
            a(j2, b3, this.m);
            c2 = a2 + 3;
        }
    }

    public void b() {
    }
}
