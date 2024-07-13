package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f13581a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f13582b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f13583c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f13584d = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13585a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13586b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13587c;

        public a(int i, int i2, boolean z) {
            this.f13585a = i;
            this.f13586b = i2;
            this.f13587c = z;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13588a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13589b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13590c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13591d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13592e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13593f;

        /* renamed from: g  reason: collision with root package name */
        public final float f13594g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13595h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f13588a = i2;
            this.f13589b = i3;
            this.f13590c = i4;
            this.f13591d = i5;
            this.f13592e = i6;
            this.f13593f = i7;
            this.f13594g = f2;
            this.f13595h = z;
            this.i = z2;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = z3;
        }
    }

    public static int a(byte[] bArr, int i) {
        int i2;
        synchronized (f13583c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = c(bArr, i3, i);
                    if (i3 < i) {
                        if (f13584d.length <= i4) {
                            f13584d = Arrays.copyOf(f13584d, f13584d.length * 2);
                        }
                        f13584d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f13584d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        a.b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            a(zArr);
            return i - 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.exoplayer2.l.v.b a(byte[] r21, int r22, int r23) {
        /*
            com.applovin.exoplayer2.l.z r0 = new com.applovin.exoplayer2.l.z
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.a(r1)
            int r3 = r0.c(r1)
            int r4 = r0.c(r1)
            int r5 = r0.c(r1)
            int r6 = r0.d()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.d()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.b()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.d()
            r0.d()
            r0.a()
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.b()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            a((com.applovin.exoplayer2.l.z) r0, (int) r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.d()
            int r12 = r12 + 4
            int r13 = r0.d()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.d()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.b()
            r0.e()
            r0.e()
            int r15 = r0.d()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.d()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.d()
            r0.a()
            int r1 = r0.d()
            int r1 = r1 + r9
            int r2 = r0.d()
            int r2 = r2 + r9
            boolean r16 = r0.b()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d9
            r0.a()
        L_0x00d9:
            r0.a()
            r2 = 16
            int r1 = r1 * 16
            int r7 = r7 * 16
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x011c
            int r2 = r0.d()
            int r8 = r0.d()
            int r17 = r0.d()
            int r18 = r0.d()
            if (r10 != 0) goto L_0x00fd
            int r10 = 2 - r16
            goto L_0x0112
        L_0x00fd:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0106
            r9 = 1
            r20 = 1
            goto L_0x0109
        L_0x0106:
            r9 = 1
            r20 = 2
        L_0x0109:
            if (r10 != r9) goto L_0x010c
            r9 = 2
        L_0x010c:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x0112:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x011c:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x0168
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x0168
            r2 = 8
            int r2 = r0.c(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0149
            r9 = 16
            int r2 = r0.c(r9)
            int r0 = r0.c(r9)
            if (r2 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0147:
            r9 = r1
            goto L_0x016a
        L_0x0149:
            float[] r0 = f13582b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x0152
            r0 = r0[r2]
            r9 = r0
            goto L_0x016a
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            com.applovin.exoplayer2.l.q.c(r2, r0)
        L_0x0168:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x016a:
            com.applovin.exoplayer2.l.v$b r0 = new com.applovin.exoplayer2.l.v$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.v.a(byte[], int, int):com.applovin.exoplayer2.l.v$b");
    }

    private static void a(z zVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((zVar.e() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b2 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b2 == 1 && (byteBuffer.get(i3) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b2 == 0) {
                    i2++;
                }
                if (b2 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean a(String str, byte b2) {
        if (!MimeTypes.VIDEO_H264.equals(str) || (b2 & Ascii.US) != 6) {
            return MimeTypes.VIDEO_H265.equals(str) && ((b2 & 126) >> 1) == 39;
        }
        return true;
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.US;
    }

    public static a b(byte[] bArr, int i, int i2) {
        z zVar = new z(bArr, i, i2);
        zVar.a(8);
        int d2 = zVar.d();
        int d3 = zVar.d();
        zVar.a();
        return new a(d2, d3, zVar.b());
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    private static int c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
