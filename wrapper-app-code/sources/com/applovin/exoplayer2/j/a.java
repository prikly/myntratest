package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ad;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.z;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a extends b {

    /* renamed from: d  reason: collision with root package name */
    private final d f13214d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13215e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13216f;

    /* renamed from: g  reason: collision with root package name */
    private final long f13217g;

    /* renamed from: h  reason: collision with root package name */
    private final float f13218h;
    private final float i;
    private final s<C0132a> j;
    private final com.applovin.exoplayer2.l.d k;
    private float l;
    private int m;
    private int n;
    private long o;
    private com.applovin.exoplayer2.h.b.b p;

    /* renamed from: com.applovin.exoplayer2.j.a$a  reason: collision with other inner class name */
    public static final class C0132a {

        /* renamed from: a  reason: collision with root package name */
        public final long f13219a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13220b;

        public C0132a(long j, long j2) {
            this.f13219a = j;
            this.f13220b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0132a)) {
                return false;
            }
            C0132a aVar = (C0132a) obj;
            return this.f13219a == aVar.f13219a && this.f13220b == aVar.f13220b;
        }

        public int hashCode() {
            return (((int) this.f13219a) * 31) + ((int) this.f13220b);
        }
    }

    public static class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f13221a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13222b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13223c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13224d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13225e;

        /* renamed from: f  reason: collision with root package name */
        private final com.applovin.exoplayer2.l.d f13226f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, com.applovin.exoplayer2.l.d.f13534a);
        }

        public b(int i, int i2, int i3, float f2, float f3, com.applovin.exoplayer2.l.d dVar) {
            this.f13221a = i;
            this.f13222b = i2;
            this.f13223c = i3;
            this.f13224d = f2;
            this.f13225e = f3;
            this.f13226f = dVar;
        }

        /* access modifiers changed from: protected */
        public a a(ac acVar, int[] iArr, int i, com.applovin.exoplayer2.k.d dVar, s<C0132a> sVar) {
            return new a(acVar, iArr, i, dVar, (long) this.f13221a, (long) this.f13222b, (long) this.f13223c, this.f13224d, this.f13225e, sVar, this.f13226f);
        }

        public final d[] a(d.a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar) {
            d dVar2;
            d.a[] aVarArr2 = aVarArr;
            s a2 = a.b(aVarArr);
            d[] dVarArr = new d[aVarArr2.length];
            for (int i = 0; i < aVarArr2.length; i++) {
                d.a aVar2 = aVarArr2[i];
                if (!(aVar2 == null || aVar2.f13286b.length == 0)) {
                    if (aVar2.f13286b.length == 1) {
                        dVar2 = new e(aVar2.f13285a, aVar2.f13286b[0], aVar2.f13287c);
                    } else {
                        dVar2 = a(aVar2.f13285a, aVar2.f13286b, aVar2.f13287c, dVar, (s) a2.get(i));
                    }
                    dVarArr[i] = dVar2;
                }
            }
            return dVarArr;
        }
    }

    protected a(ac acVar, int[] iArr, int i2, com.applovin.exoplayer2.k.d dVar, long j2, long j3, long j4, float f2, float f3, List<C0132a> list, com.applovin.exoplayer2.l.d dVar2) {
        super(acVar, iArr, i2);
        if (j4 < j2) {
            q.c("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j2;
        }
        this.f13214d = dVar;
        this.f13215e = j2 * 1000;
        this.f13216f = j3 * 1000;
        this.f13217g = j4 * 1000;
        this.f13218h = f2;
        this.i = f3;
        this.j = s.a(list);
        this.k = dVar2;
        this.l = 1.0f;
        this.n = 0;
        this.o = -9223372036854775807L;
    }

    private static s<Integer> a(long[][] jArr) {
        long[][] jArr2 = jArr;
        z<K, V> b2 = ad.a().b().b();
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            if (jArr2[i2].length > 1) {
                int length = jArr2[i2].length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    double d2 = 0.0d;
                    if (i3 >= jArr2[i2].length) {
                        break;
                    }
                    if (jArr2[i2][i3] != -1) {
                        d2 = Math.log((double) jArr2[i2][i3]);
                    }
                    dArr[i3] = d2;
                    i3++;
                }
                int i4 = length - 1;
                double d3 = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d4 = dArr[i5];
                    i5++;
                    b2.a(Double.valueOf(d3 == 0.0d ? 1.0d : (((d4 + dArr[i5]) * 0.5d) - dArr[0]) / d3), Integer.valueOf(i2));
                }
            }
        }
        return s.a(b2.h());
    }

    private static void a(List<s.a<C0132a>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            s.a aVar = list.get(i2);
            if (aVar != null) {
                aVar.a(new C0132a(j2, jArr[i2]));
            }
        }
    }

    /* access modifiers changed from: private */
    public static s<s<C0132a>> b(d.a[] aVarArr) {
        s.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            if (aVarArr[i2] == null || aVarArr[i2].f13286b.length <= 1) {
                aVar = null;
            } else {
                aVar = s.i();
                aVar.a(new C0132a(0, 0));
            }
            arrayList.add(aVar);
        }
        long[][] c2 = c(aVarArr);
        int[] iArr = new int[c2.length];
        long[] jArr = new long[c2.length];
        for (int i3 = 0; i3 < c2.length; i3++) {
            jArr[i3] = c2[i3].length == 0 ? 0 : c2[i3][0];
        }
        a(arrayList, jArr);
        s<Integer> a2 = a(c2);
        for (int i4 = 0; i4 < a2.size(); i4++) {
            int intValue = ((Integer) a2.get(i4)).intValue();
            int i5 = iArr[intValue] + 1;
            iArr[intValue] = i5;
            jArr[intValue] = c2[intValue][i5];
            a(arrayList, jArr);
        }
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            if (arrayList.get(i6) != null) {
                jArr[i6] = jArr[i6] * 2;
            }
        }
        a(arrayList, jArr);
        s.a i7 = s.i();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            s.a aVar2 = (s.a) arrayList.get(i8);
            i7.a(aVar2 == null ? s.g() : aVar2.a());
        }
        return i7.a();
    }

    private static long[][] c(d.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            d.a aVar = aVarArr[i2];
            if (aVar == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[aVar.f13286b.length];
                for (int i3 = 0; i3 < aVar.f13286b.length; i3++) {
                    jArr[i2][i3] = (long) aVar.f13285a.a(aVar.f13286b[i3]).f13929h;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    public void a() {
        this.o = -9223372036854775807L;
        this.p = null;
    }

    public void a(float f2) {
        this.l = f2;
    }

    public void b() {
        this.p = null;
    }

    public int c() {
        return this.m;
    }
}
