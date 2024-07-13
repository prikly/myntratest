package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.ai;

final class d {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f12014a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f12015b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12016c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f12017d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f12018e;

        /* renamed from: f  reason: collision with root package name */
        public final long f12019f;

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f12014a = jArr;
            this.f12015b = iArr;
            this.f12016c = i;
            this.f12017d = jArr2;
            this.f12018e = iArr2;
            this.f12019f = j;
        }
    }

    public static a a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int a2 : iArr2) {
            i3 += ai.a(a2, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new a(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
