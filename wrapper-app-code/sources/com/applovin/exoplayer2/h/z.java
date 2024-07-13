package com.applovin.exoplayer2.h;

import java.util.Arrays;
import java.util.Random;

public interface z {

    public static class a implements z {

        /* renamed from: a  reason: collision with root package name */
        private final Random f12904a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f12905b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f12906c;

        public a(int i) {
            this(i, new Random());
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f12905b = iArr;
            this.f12904a = random;
            this.f12906c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f12906c[iArr[i]] = i;
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        public int a() {
            return this.f12905b.length;
        }

        public int a(int i) {
            int i2 = this.f12906c[i] + 1;
            int[] iArr = this.f12905b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        public z a(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                iArr[i3] = this.f12904a.nextInt(this.f12905b.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.f12904a.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3 + i;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f12905b.length + i2)];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f12905b.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr[i5]) {
                    int i8 = i6 + 1;
                    iArr3[i7] = this.f12905b[i6];
                    if (iArr3[i7] >= i) {
                        iArr3[i7] = iArr3[i7] + i2;
                    }
                    i6 = i8;
                } else {
                    iArr3[i7] = iArr2[i5];
                    i5++;
                }
            }
            return new a(iArr3, new Random(this.f12904a.nextLong()));
        }

        public int b() {
            int[] iArr = this.f12905b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public int b(int i) {
            int i2 = this.f12906c[i] - 1;
            if (i2 >= 0) {
                return this.f12905b[i2];
            }
            return -1;
        }

        public z b(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[(this.f12905b.length - i3)];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f12905b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.f12904a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    int i6 = i4 - i5;
                    int[] iArr3 = this.f12905b;
                    iArr[i6] = iArr3[i4] >= i ? iArr3[i4] - i3 : iArr3[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        public int c() {
            int[] iArr = this.f12905b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public z d() {
            return new a(0, new Random(this.f12904a.nextLong()));
        }
    }

    int a();

    int a(int i);

    z a(int i, int i2);

    int b();

    int b(int i);

    z b(int i, int i2);

    int c();

    z d();
}
