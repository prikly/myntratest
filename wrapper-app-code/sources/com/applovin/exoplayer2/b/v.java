package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.a;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

final class v {

    /* renamed from: a  reason: collision with root package name */
    private final int f11339a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11340b;

    /* renamed from: c  reason: collision with root package name */
    private final float f11341c;

    /* renamed from: d  reason: collision with root package name */
    private final float f11342d;

    /* renamed from: e  reason: collision with root package name */
    private final float f11343e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11344f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11345g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11346h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public v(int i2, int i3, float f2, float f3, int i4) {
        this.f11339a = i2;
        this.f11340b = i3;
        this.f11341c = f2;
        this.f11342d = f3;
        this.f11343e = ((float) i2) / ((float) i4);
        this.f11344f = i2 / 400;
        int i5 = i2 / 65;
        this.f11345g = i5;
        int i6 = i5 * 2;
        this.f11346h = i6;
        this.i = new short[i6];
        this.j = new short[(i6 * i3)];
        this.l = new short[(i6 * i3)];
        this.n = new short[(i6 * i3)];
    }

    private int a(short[] sArr, int i2) {
        int i3;
        int i4 = this.f11339a;
        int i5 = i4 > 4000 ? i4 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
        if (this.f11340b == 1 && i5 == 1) {
            i3 = a(sArr, i2, this.f11344f, this.f11345g);
        } else {
            c(sArr, i2, i5);
            int a2 = a(this.i, 0, this.f11344f / i5, this.f11345g / i5);
            if (i5 != 1) {
                int i6 = a2 * i5;
                int i7 = i5 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f11344f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f11345g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f11340b == 1) {
                    i3 = a(sArr, i2, i8, i9);
                } else {
                    c(sArr, i2, 1);
                    i3 = a(this.i, 0, i8, i9);
                }
            } else {
                i3 = a2;
            }
        }
        int i12 = a(this.u, this.v) ? this.s : i3;
        this.t = this.u;
        this.s = i3;
        return i12;
    }

    private int a(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (((float) i3) / (f2 - 1.0f));
        } else {
            this.r = (int) ((((float) i3) * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        short[] a2 = a(this.l, this.m, i4);
        this.l = a2;
        a(i4, this.f11340b, a2, this.m, sArr, i2, sArr, i2 + i3);
        this.m += i4;
        return i4;
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f11340b;
        int i6 = 1;
        int i7 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.u = i6 / i8;
        this.v = i9 / i7;
        return i8;
    }

    private void a(float f2) {
        int a2;
        int i2 = this.k;
        if (i2 >= this.f11346h) {
            int i3 = 0;
            do {
                if (this.r > 0) {
                    a2 = b(i3);
                } else {
                    int a3 = a(this.j, i3);
                    int i4 = (((double) f2) > 1.0d ? 1 : (((double) f2) == 1.0d ? 0 : -1));
                    short[] sArr = this.j;
                    a2 = i4 > 0 ? a3 + a(sArr, i3, f2, a3) : b(sArr, i3, f2, a3);
                }
                i3 += a2;
            } while (this.f11346h + i3 <= i2);
            a(i3);
        }
    }

    private void a(float f2, int i2) {
        int i3;
        int i4;
        if (this.m != i2) {
            int i5 = this.f11339a;
            int i6 = (int) (((float) i5) / f2);
            while (true) {
                if (i6 <= 16384 && i5 <= 16384) {
                    break;
                }
                i6 /= 2;
                i5 /= 2;
            }
            c(i2);
            int i7 = 0;
            while (true) {
                int i8 = this.o;
                boolean z = true;
                if (i7 < i8 - 1) {
                    while (true) {
                        i3 = this.p;
                        int i9 = (i3 + 1) * i6;
                        i4 = this.q;
                        if (i9 <= i4 * i5) {
                            break;
                        }
                        this.l = a(this.l, this.m, 1);
                        int i10 = 0;
                        while (true) {
                            int i11 = this.f11340b;
                            if (i10 >= i11) {
                                break;
                            }
                            this.l[(this.m * i11) + i10] = b(this.n, (i11 * i7) + i10, i5, i6);
                            i10++;
                        }
                        this.q++;
                        this.m++;
                    }
                    int i12 = i3 + 1;
                    this.p = i12;
                    if (i12 == i5) {
                        this.p = 0;
                        if (i4 != i6) {
                            z = false;
                        }
                        a.b(z);
                        this.q = 0;
                    }
                    i7++;
                } else {
                    d(i8 - 1);
                    return;
                }
            }
        }
    }

    private void a(int i2) {
        int i3 = this.k - i2;
        short[] sArr = this.j;
        int i4 = this.f11340b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.k = i3;
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    private boolean a(int i2, int i3) {
        return i2 != 0 && this.s != 0 && i3 <= i2 * 3 && i2 * 2 > this.t * 3;
    }

    private short[] a(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f11340b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    private int b(int i2) {
        int min = Math.min(this.f11346h, this.r);
        b(this.j, i2, min);
        this.r -= min;
        return min;
    }

    private int b(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((((float) i3) * f2) / (1.0f - f2));
        } else {
            this.r = (int) ((((float) i3) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] a2 = a(this.l, this.m, i5);
        this.l = a2;
        int i6 = this.f11340b;
        System.arraycopy(sArr, i2 * i6, a2, this.m * i6, i6 * i3);
        a(i4, this.f11340b, this.l, this.m + i3, sArr, i2 + i3, sArr, i2);
        this.m += i5;
        return i4;
    }

    private short b(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.f11340b];
        int i5 = this.q * i3;
        int i6 = this.p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) (((s2 * i9) + ((i10 - i9) * s3)) / i10);
    }

    private void b(short[] sArr, int i2, int i3) {
        short[] a2 = a(this.l, this.m, i3);
        this.l = a2;
        int i4 = this.f11340b;
        System.arraycopy(sArr, i2 * i4, a2, this.m * i4, i4 * i3);
        this.m += i3;
    }

    private void c(int i2) {
        int i3 = this.m - i2;
        short[] a2 = a(this.n, this.o, i3);
        this.n = a2;
        short[] sArr = this.l;
        int i4 = this.f11340b;
        System.arraycopy(sArr, i2 * i4, a2, this.o * i4, i4 * i3);
        this.m = i2;
        this.o += i3;
    }

    private void c(short[] sArr, int i2, int i3) {
        int i4 = this.f11346h / i3;
        int i5 = this.f11340b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.i[i8] = (short) (i9 / i6);
        }
    }

    private void d(int i2) {
        if (i2 != 0) {
            short[] sArr = this.n;
            int i3 = this.f11340b;
            System.arraycopy(sArr, i2 * i3, sArr, 0, (this.o - i2) * i3);
            this.o -= i2;
        }
    }

    private void e() {
        int i2 = this.m;
        float f2 = this.f11341c;
        float f3 = this.f11342d;
        float f4 = f2 / f3;
        float f5 = this.f11343e * f3;
        double d2 = (double) f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            a(f4);
        } else {
            b(this.j, 0, this.k);
            this.k = 0;
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }

    public int a() {
        return this.k * this.f11340b * 2;
    }

    public void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f11340b;
        int i3 = remaining / i2;
        short[] a2 = a(this.j, this.k, i3);
        this.j = a2;
        shortBuffer.get(a2, this.k * this.f11340b, ((i2 * i3) * 2) / 2);
        this.k += i3;
        e();
    }

    public void b() {
        int i2;
        int i3 = this.k;
        float f2 = this.f11341c;
        float f3 = this.f11342d;
        int i4 = this.m + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.o)) / (this.f11343e * f3)) + 0.5f));
        this.j = a(this.j, i3, (this.f11346h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f11346h;
            int i6 = this.f11340b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.j[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.k += i2 * 2;
        e();
        if (this.m > i4) {
            this.m = i4;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f11340b, this.m);
        shortBuffer.put(this.l, 0, this.f11340b * min);
        int i2 = this.m - min;
        this.m = i2;
        short[] sArr = this.l;
        int i3 = this.f11340b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public void c() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public int d() {
        return this.m * this.f11340b * 2;
    }
}
