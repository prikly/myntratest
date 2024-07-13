package com.applovin.exoplayer2.m.a;

final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f13641a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13642b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13643c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13644d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b[] f13645a;

        public a(b... bVarArr) {
            this.f13645a = bVarArr;
        }

        public int a() {
            return this.f13645a.length;
        }

        public b a(int i) {
            return this.f13645a[i];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13646a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13647b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f13648c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f13649d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f13646a = i;
            com.applovin.exoplayer2.l.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f13648c = fArr;
            this.f13649d = fArr2;
            this.f13647b = i2;
        }
    }

    public e(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public e(a aVar, a aVar2, int i) {
        this.f13641a = aVar;
        this.f13642b = aVar2;
        this.f13643c = i;
        this.f13644d = aVar == aVar2;
    }

    public static e a(float f2, int i, int i2, float f3, float f4, int i3) {
        int i4;
        float f5;
        float[] fArr;
        int i5;
        int i6;
        int i7;
        float f6 = f2;
        int i8 = i;
        int i9 = i2;
        float f7 = f3;
        float f8 = f4;
        com.applovin.exoplayer2.l.a.a(f6 > 0.0f);
        com.applovin.exoplayer2.l.a.a(i8 >= 1);
        com.applovin.exoplayer2.l.a.a(i9 >= 1);
        com.applovin.exoplayer2.l.a.a(f7 > 0.0f && f7 <= 180.0f);
        com.applovin.exoplayer2.l.a.a(f8 > 0.0f && f8 <= 360.0f);
        float radians = (float) Math.toRadians((double) f7);
        float radians2 = (float) Math.toRadians((double) f8);
        float f9 = radians / ((float) i8);
        float f10 = radians2 / ((float) i9);
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[(i11 * 3)];
        float[] fArr3 = new float[(i11 * 2)];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f11 = radians / 2.0f;
            float f12 = (((float) i12) * f9) - f11;
            int i15 = i12 + 1;
            float f13 = (((float) i15) * f9) - f11;
            int i16 = 0;
            while (i16 < i10) {
                float f14 = f12;
                int i17 = i15;
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == 0) {
                        f5 = f14;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f5 = f13;
                    }
                    float f15 = ((float) i16) * f10;
                    float f16 = f10;
                    int i19 = i13 + 1;
                    int i20 = i16;
                    double d2 = (double) f6;
                    float f17 = f9;
                    int i21 = i18;
                    double d3 = (double) ((f15 + 3.1415927f) - (radians2 / 2.0f));
                    double d4 = (double) f5;
                    float[] fArr4 = fArr3;
                    float f18 = f13;
                    fArr2[i13] = -((float) (Math.sin(d3) * d2 * Math.cos(d4)));
                    int i22 = i19 + 1;
                    int i23 = i12;
                    fArr2[i19] = (float) (d2 * Math.sin(d4));
                    int i24 = i22 + 1;
                    fArr2[i22] = (float) (d2 * Math.cos(d3) * Math.cos(d4));
                    int i25 = i14 + 1;
                    fArr4[i14] = f15 / radians2;
                    int i26 = i25 + 1;
                    fArr4[i25] = (((float) (i23 + i21)) * f17) / radians;
                    if (i20 == 0 && i21 == 0) {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                    } else {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                        if (!(i6 == i7 && i5 == 1)) {
                            fArr = fArr4;
                            i14 = i26;
                            i13 = i24;
                            i18 = i5 + 1;
                            i9 = i7;
                            i16 = i6;
                            fArr3 = fArr;
                            i12 = i23;
                            i10 = i4;
                            f10 = f16;
                            f9 = f17;
                            f13 = f18;
                        }
                    }
                    System.arraycopy(fArr2, i24 - 3, fArr2, i24, 3);
                    i24 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i26 - 2, fArr, i26, 2);
                    i26 += 2;
                    i14 = i26;
                    i13 = i24;
                    i18 = i5 + 1;
                    i9 = i7;
                    i16 = i6;
                    fArr3 = fArr;
                    i12 = i23;
                    i10 = i4;
                    f10 = f16;
                    f9 = f17;
                    f13 = f18;
                }
                float f19 = f9;
                float f20 = f10;
                float[] fArr5 = fArr3;
                float f21 = f13;
                int i27 = i12;
                int i28 = i16;
                int i29 = i9;
                int i30 = i28 + 1;
                f12 = f14;
                i15 = i17;
                i10 = i10;
                f10 = f20;
                f9 = f19;
                f13 = f21;
                int i31 = i30;
                i9 = i29;
                i16 = i31;
            }
            i8 = i;
            i12 = i15;
        }
        return new e(new a(new b(0, fArr2, fArr3, 1)), i3);
    }

    public static e a(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
