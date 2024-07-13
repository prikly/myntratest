package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;

public final class z {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12467a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12468b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f12469c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12470d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f12471e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f12467a = i;
            this.f12468b = i2;
            this.f12469c = jArr;
            this.f12470d = i3;
            this.f12471e = z;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f12472a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f12473b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12474c;

        public b(String str, String[] strArr, int i) {
            this.f12472a = str;
            this.f12473b = strArr;
            this.f12474c = i;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12475a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12476b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12477c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12478d;

        public c(boolean z, int i, int i2, int i3) {
            this.f12475a = z;
            this.f12476b = i;
            this.f12477c = i2;
            this.f12478d = i3;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f12479a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12480b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12481c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12482d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12483e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12484f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12485g;

        /* renamed from: h  reason: collision with root package name */
        public final int f12486h;
        public final boolean i;
        public final byte[] j;

        public d(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, byte[] bArr) {
            this.f12479a = i2;
            this.f12480b = i3;
            this.f12481c = i4;
            this.f12482d = i5;
            this.f12483e = i6;
            this.f12484f = i7;
            this.f12485g = i8;
            this.f12486h = i9;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long a(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    public static b a(y yVar, boolean z, boolean z2) throws ai {
        if (z) {
            a(3, yVar, false);
        }
        String f2 = yVar.f((int) yVar.p());
        int length = 11 + f2.length();
        long p = yVar.p();
        String[] strArr = new String[((int) p)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < p; i2++) {
            strArr[i2] = yVar.f((int) yVar.p());
            i = i + 4 + strArr[i2].length();
        }
        if (!z2 || (yVar.h() & 1) != 0) {
            return new b(f2, strArr, i + 1);
        }
        throw ai.b("framing bit expected to be set", (Throwable) null);
    }

    public static d a(y yVar) throws ai {
        boolean z = true;
        a(1, yVar, false);
        int x = yVar.x();
        int h2 = yVar.h();
        int x2 = yVar.x();
        int r = yVar.r();
        if (r <= 0) {
            r = -1;
        }
        int r2 = yVar.r();
        if (r2 <= 0) {
            r2 = -1;
        }
        int r3 = yVar.r();
        if (r3 <= 0) {
            r3 = -1;
        }
        int h3 = yVar.h();
        int pow = (int) Math.pow(2.0d, (double) (h3 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((h3 & 240) >> 4));
        if ((yVar.h() & 1) <= 0) {
            z = false;
        }
        return new d(x, h2, x2, r, r2, r3, pow, pow2, z, Arrays.copyOf(yVar.d(), yVar.b()));
    }

    private static void a(int i, y yVar) throws ai {
        int a2 = yVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = yVar.a(16);
            if (a3 != 0) {
                q.d("VorbisUtil", "mapping type other than 0 not supported: " + a3);
            } else {
                int a4 = yVar.a() ? yVar.a(4) + 1 : 1;
                if (yVar.a()) {
                    int a5 = yVar.a(8) + 1;
                    for (int i3 = 0; i3 < a5; i3++) {
                        int i4 = i - 1;
                        yVar.b(a(i4));
                        yVar.b(a(i4));
                    }
                }
                if (yVar.a(2) == 0) {
                    if (a4 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            yVar.b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a4; i6++) {
                        yVar.b(8);
                        yVar.b(8);
                        yVar.b(8);
                    }
                } else {
                    throw ai.b("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    public static boolean a(int i, y yVar, boolean z) throws ai {
        if (yVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ai.b("too short header: " + yVar.a(), (Throwable) null);
        } else if (yVar.h() != i) {
            if (z) {
                return false;
            }
            throw ai.b("expected header type " + Integer.toHexString(i), (Throwable) null);
        } else if (yVar.h() == 118 && yVar.h() == 111 && yVar.h() == 114 && yVar.h() == 98 && yVar.h() == 105 && yVar.h() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ai.b("expected characters 'vorbis'", (Throwable) null);
        }
    }

    private static c[] a(y yVar) {
        int a2 = yVar.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i = 0; i < a2; i++) {
            cVarArr[i] = new c(yVar.a(), yVar.a(16), yVar.a(16), yVar.a(8));
        }
        return cVarArr;
    }

    public static c[] a(y yVar, int i) throws ai {
        int i2 = 0;
        a(5, yVar, false);
        int h2 = yVar.h() + 1;
        y yVar2 = new y(yVar.d());
        yVar2.b(yVar.c() * 8);
        for (int i3 = 0; i3 < h2; i3++) {
            d(yVar2);
        }
        int a2 = yVar2.a(6) + 1;
        while (i2 < a2) {
            if (yVar2.a(16) == 0) {
                i2++;
            } else {
                throw ai.b("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        c(yVar2);
        b(yVar2);
        a(i, yVar2);
        c[] a3 = a(yVar2);
        if (yVar2.a()) {
            return a3;
        }
        throw ai.b("framing bit after modes not set as expected", (Throwable) null);
    }

    public static b b(y yVar) throws ai {
        return a(yVar, true, true);
    }

    private static void b(y yVar) throws ai {
        int a2 = yVar.a(6) + 1;
        int i = 0;
        while (i < a2) {
            if (yVar.a(16) <= 2) {
                yVar.b(24);
                yVar.b(24);
                yVar.b(24);
                int a3 = yVar.a(6) + 1;
                yVar.b(8);
                int[] iArr = new int[a3];
                for (int i2 = 0; i2 < a3; i2++) {
                    iArr[i2] = ((yVar.a() ? yVar.a(5) : 0) * 8) + yVar.a(3);
                }
                for (int i3 = 0; i3 < a3; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            yVar.b(8);
                        }
                    }
                }
                i++;
            } else {
                throw ai.b("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    private static void c(y yVar) throws ai {
        int a2 = yVar.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            int a3 = yVar.a(16);
            if (a3 == 0) {
                yVar.b(8);
                yVar.b(16);
                yVar.b(16);
                yVar.b(6);
                yVar.b(8);
                int a4 = yVar.a(4) + 1;
                for (int i2 = 0; i2 < a4; i2++) {
                    yVar.b(8);
                }
            } else if (a3 == 1) {
                int a5 = yVar.a(5);
                int i3 = -1;
                int[] iArr = new int[a5];
                for (int i4 = 0; i4 < a5; i4++) {
                    iArr[i4] = yVar.a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = yVar.a(3) + 1;
                    int a6 = yVar.a(2);
                    if (a6 > 0) {
                        yVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << a6); i7++) {
                        yVar.b(8);
                    }
                }
                yVar.b(2);
                int a7 = yVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < a5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        yVar.b(a7);
                        i9++;
                    }
                }
            } else {
                throw ai.b("floor type greater than 1 not decodable: " + a3, (Throwable) null);
            }
        }
    }

    private static a d(y yVar) throws ai {
        if (yVar.a(24) == 5653314) {
            int a2 = yVar.a(16);
            int a3 = yVar.a(24);
            long[] jArr = new long[a3];
            boolean a4 = yVar.a();
            long j = 0;
            if (!a4) {
                boolean a5 = yVar.a();
                for (int i = 0; i < a3; i++) {
                    if (!a5) {
                        jArr[i] = (long) (yVar.a(5) + 1);
                    } else if (yVar.a()) {
                        jArr[i] = (long) (yVar.a(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int a6 = yVar.a(5) + 1;
                int i2 = 0;
                while (i2 < a3) {
                    int a7 = yVar.a(a(a3 - i2));
                    for (int i3 = 0; i3 < a7 && i2 < a3; i3++) {
                        jArr[i2] = (long) a6;
                        i2++;
                    }
                    a6++;
                }
            }
            int a8 = yVar.a(4);
            if (a8 <= 2) {
                if (a8 == 1 || a8 == 2) {
                    yVar.b(32);
                    yVar.b(32);
                    int a9 = yVar.a(4) + 1;
                    yVar.b(1);
                    if (a8 != 1) {
                        j = ((long) a3) * ((long) a2);
                    } else if (a2 != 0) {
                        j = a((long) a3, (long) a2);
                    }
                    yVar.b((int) (j * ((long) a9)));
                }
                return new a(a2, a3, jArr, a8, a4);
            }
            throw ai.b("lookup type greater than 2 not decodable: " + a8, (Throwable) null);
        }
        throw ai.b("expected code book to start with [0x56, 0x43, 0x42] at " + yVar.b(), (Throwable) null);
    }
}
