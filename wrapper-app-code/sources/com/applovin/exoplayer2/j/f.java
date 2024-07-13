package com.applovin.exoplayer2.j;

import android.util.Pair;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.p;

public abstract class f extends j {

    /* renamed from: a  reason: collision with root package name */
    private a f13290a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f13291a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f13292b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f13293c;

        /* renamed from: d  reason: collision with root package name */
        private final ad[] f13294d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f13295e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f13296f;

        /* renamed from: g  reason: collision with root package name */
        private final ad f13297g;

        a(String[] strArr, int[] iArr, ad[] adVarArr, int[] iArr2, int[][][] iArr3, ad adVar) {
            this.f13292b = strArr;
            this.f13293c = iArr;
            this.f13294d = adVarArr;
            this.f13296f = iArr3;
            this.f13295e = iArr2;
            this.f13297g = adVar;
            this.f13291a = iArr.length;
        }

        public int a() {
            return this.f13291a;
        }

        public int a(int i) {
            return this.f13293c[i];
        }

        public ad b(int i) {
            return this.f13294d[i];
        }
    }

    private static int a(as[] asVarArr, ac acVar, int[] iArr, boolean z) throws p {
        int length = asVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < asVarArr.length; i2++) {
            as asVar = asVarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < acVar.f12749a; i4++) {
                i3 = Math.max(i3, as.CC.c(asVar.a(acVar.a(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    private static int[] a(as asVar, ac acVar) throws p {
        int[] iArr = new int[acVar.f12749a];
        for (int i = 0; i < acVar.f12749a; i++) {
            iArr[i] = asVar.a(acVar.a(i));
        }
        return iArr;
    }

    private static int[] a(as[] asVarArr) throws p {
        int length = asVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = asVarArr[i].o();
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public abstract Pair<at[], d[]> a(a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p;

    public final k a(as[] asVarArr, ad adVar, p.a aVar, ba baVar) throws com.applovin.exoplayer2.p {
        as[] asVarArr2 = asVarArr;
        ad adVar2 = adVar;
        int[] iArr = new int[(asVarArr2.length + 1)];
        int length = asVarArr2.length + 1;
        ac[][] acVarArr = new ac[length][];
        int[][][] iArr2 = new int[(asVarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            acVarArr[i] = new ac[adVar2.f12754b];
            iArr2[i] = new int[adVar2.f12754b][];
        }
        int[] a2 = a(asVarArr);
        for (int i2 = 0; i2 < adVar2.f12754b; i2++) {
            ac a3 = adVar2.a(i2);
            int a4 = a(asVarArr, a3, iArr, u.e(a3.a(0).l) == 5);
            int[] a5 = a4 == asVarArr2.length ? new int[a3.f12749a] : a(asVarArr2[a4], a3);
            int i3 = iArr[a4];
            acVarArr[a4][i3] = a3;
            iArr2[a4][i3] = a5;
            iArr[a4] = iArr[a4] + 1;
        }
        ad[] adVarArr = new ad[asVarArr2.length];
        String[] strArr = new String[asVarArr2.length];
        int[] iArr3 = new int[asVarArr2.length];
        for (int i4 = 0; i4 < asVarArr2.length; i4++) {
            int i5 = iArr[i4];
            adVarArr[i4] = new ad((ac[]) ai.a((T[]) acVarArr[i4], i5));
            iArr2[i4] = (int[][]) ai.a((T[]) iArr2[i4], i5);
            strArr[i4] = asVarArr2[i4].y();
            iArr3[i4] = asVarArr2[i4].a();
        }
        a aVar2 = new a(strArr, iArr3, adVarArr, a2, iArr2, new ad((ac[]) ai.a((T[]) acVarArr[asVarArr2.length], iArr[asVarArr2.length])));
        Pair<at[], d[]> a6 = a(aVar2, iArr2, a2, aVar, baVar);
        return new k((at[]) a6.first, (d[]) a6.second, aVar2);
    }

    public final void a(Object obj) {
        this.f13290a = (a) obj;
    }
}
