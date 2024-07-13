package com.applovin.exoplayer2.b;

public final class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f11320a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11321b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11322c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11323d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11324e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f11325f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f11326g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11327a;

        /* renamed from: b  reason: collision with root package name */
        public String f11328b;

        /* renamed from: c  reason: collision with root package name */
        public int f11329c;

        /* renamed from: d  reason: collision with root package name */
        public int f11330d;

        /* renamed from: e  reason: collision with root package name */
        public int f11331e;

        /* renamed from: f  reason: collision with root package name */
        public int f11332f;

        /* renamed from: g  reason: collision with root package name */
        public int f11333g;

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(int r9) {
            /*
                r8 = this;
                boolean r0 = com.applovin.exoplayer2.b.r.d(r9)
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L_0x0010
                return r1
            L_0x0010:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L_0x0016
                return r1
            L_0x0016:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto L_0x00ae
                if (r5 != r6) goto L_0x0021
                goto L_0x00ae
            L_0x0021:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L_0x0027
                return r1
            L_0x0027:
                r8.f11327a = r0
                java.lang.String[] r1 = com.applovin.exoplayer2.b.r.f11320a
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f11328b = r1
                int[] r1 = com.applovin.exoplayer2.b.r.f11321b
                r1 = r1[r6]
                r8.f11330d = r1
                r6 = 2
                if (r0 != r6) goto L_0x0042
                int r1 = r1 / r6
            L_0x003f:
                r8.f11330d = r1
                goto L_0x0047
            L_0x0042:
                if (r0 != 0) goto L_0x0047
                int r1 = r1 / 4
                goto L_0x003f
            L_0x0047:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = com.applovin.exoplayer2.b.r.b(r0, r4)
                r8.f11333g = r7
                if (r4 != r2) goto L_0x0070
                if (r0 != r2) goto L_0x005c
                int[] r0 = com.applovin.exoplayer2.b.r.f11322c
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L_0x0063
            L_0x005c:
                int[] r0 = com.applovin.exoplayer2.b.r.f11323d
                int r5 = r5 - r3
                r0 = r0[r5]
            L_0x0063:
                r8.f11332f = r0
                int r0 = r0 * 12
                int r4 = r8.f11330d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L_0x006d:
                r8.f11329c = r0
                goto L_0x00a5
            L_0x0070:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L_0x008e
                if (r4 != r6) goto L_0x007e
                int[] r0 = com.applovin.exoplayer2.b.r.f11324e
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L_0x0085
            L_0x007e:
                int[] r0 = com.applovin.exoplayer2.b.r.f11325f
                int r5 = r5 - r3
                r0 = r0[r5]
            L_0x0085:
                r8.f11332f = r0
                int r0 = r0 * 144
                int r4 = r8.f11330d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L_0x006d
            L_0x008e:
                int[] r0 = com.applovin.exoplayer2.b.r.f11326g
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f11332f = r0
                if (r4 != r3) goto L_0x009b
                r7 = 72
            L_0x009b:
                int r0 = r8.f11332f
                int r7 = r7 * r0
                int r0 = r8.f11330d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f11329c = r7
            L_0x00a5:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto L_0x00ab
                r6 = 1
            L_0x00ab:
                r8.f11331e = r6
                return r3
            L_0x00ae:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.r.a.a(int):boolean");
        }
    }

    public static int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f11321b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f11322c[i4 - 1] : f11323d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f11324e[i4 - 1] : f11325f[i4 - 1] : f11326g[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    public static int b(int i) {
        int i2;
        int i3;
        if (!d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return b(i2, i3);
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public static boolean d(int i) {
        return (i & -2097152) == -2097152;
    }
}
