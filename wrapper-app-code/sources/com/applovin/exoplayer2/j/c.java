package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ai;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.a;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.j.f;
import com.applovin.exoplayer2.j.i;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13234a = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final ai<Integer> f13235b = ai.a($$Lambda$c$4xbF8OqnmTEoiz3euTy2hplaWE.INSTANCE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final ai<Integer> f13236c = ai.a($$Lambda$c$Ti2fJ5tN6kmXzPDhz55fk55b2Qg.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    private final d.b f13237d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<C0133c> f13238e;

    protected static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13239a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13240b;

        /* renamed from: c  reason: collision with root package name */
        private final C0133c f13241c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f13242d;

        /* renamed from: e  reason: collision with root package name */
        private final int f13243e;

        /* renamed from: f  reason: collision with root package name */
        private final int f13244f;

        /* renamed from: g  reason: collision with root package name */
        private final int f13245g;

        /* renamed from: h  reason: collision with root package name */
        private final int f13246h;
        private final int i;
        private final boolean j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;

        public a(v vVar, C0133c cVar, int i2) {
            int i3;
            int i4;
            int i5;
            this.f13241c = cVar;
            this.f13240b = c.a(vVar.f13924c);
            int i6 = 0;
            this.f13242d = c.a(i2, false);
            int i7 = 0;
            while (true) {
                i3 = Integer.MAX_VALUE;
                if (i7 >= cVar.C.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = c.a(vVar, (String) cVar.C.get(i7), false);
                if (i4 > 0) {
                    break;
                }
                i7++;
            }
            this.f13244f = i7;
            this.f13243e = i4;
            this.f13245g = Integer.bitCount(vVar.f13926e & cVar.D);
            boolean z = true;
            this.j = (vVar.f13925d & 1) != 0;
            this.k = vVar.y;
            this.l = vVar.z;
            this.m = vVar.f13929h;
            if ((vVar.f13929h != -1 && vVar.f13929h > cVar.F) || (vVar.y != -1 && vVar.y > cVar.E)) {
                z = false;
            }
            this.f13239a = z;
            String[] d2 = com.applovin.exoplayer2.l.ai.d();
            int i8 = 0;
            while (true) {
                if (i8 >= d2.length) {
                    i8 = Integer.MAX_VALUE;
                    i5 = 0;
                    break;
                }
                i5 = c.a(vVar, d2[i8], false);
                if (i5 > 0) {
                    break;
                }
                i8++;
            }
            this.f13246h = i8;
            this.i = i5;
            while (true) {
                if (i6 < cVar.G.size()) {
                    if (vVar.l != null && vVar.l.equals(cVar.G.get(i6))) {
                        i3 = i6;
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            this.n = i3;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            ai a2 = (!this.f13239a || !this.f13242d) ? c.f13235b.a() : c.f13235b;
            n a3 = n.a().b(this.f13242d, aVar.f13242d).a(Integer.valueOf(this.f13244f), Integer.valueOf(aVar.f13244f), ai.b().a()).a(this.f13243e, aVar.f13243e).a(this.f13245g, aVar.f13245g).b(this.f13239a, aVar.f13239a).a(Integer.valueOf(this.n), Integer.valueOf(aVar.n), ai.b().a()).a(Integer.valueOf(this.m), Integer.valueOf(aVar.m), this.f13241c.K ? c.f13235b.a() : c.f13236c).b(this.j, aVar.j).a(Integer.valueOf(this.f13246h), Integer.valueOf(aVar.f13246h), ai.b().a()).a(this.i, aVar.i).a(Integer.valueOf(this.k), Integer.valueOf(aVar.k), a2).a(Integer.valueOf(this.l), Integer.valueOf(aVar.l), a2);
            Integer valueOf = Integer.valueOf(this.m);
            Integer valueOf2 = Integer.valueOf(aVar.m);
            if (!com.applovin.exoplayer2.l.ai.a((Object) this.f13240b, (Object) aVar.f13240b)) {
                a2 = c.f13236c;
            }
            return a3.a(valueOf, valueOf2, a2).b();
        }
    }

    protected static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f13247a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13248b;

        public b(v vVar, int i) {
            this.f13247a = (vVar.f13925d & 1) == 0 ? false : true;
            this.f13248b = c.a(i, false);
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return n.a().b(this.f13248b, bVar.f13248b).b(this.f13247a, bVar.f13247a).b();
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.c$c  reason: collision with other inner class name */
    public static final class C0133c extends i implements com.applovin.exoplayer2.g {

        /* renamed from: a  reason: collision with root package name */
        public static final C0133c f13249a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public static final C0133c f13250b;
        public static final g.a<C0133c> n = $$Lambda$c$c$M4Smkgd59ZHfilEXWTqvoG6Lks.INSTANCE;
        private final SparseArray<Map<ad, e>> O;
        private final SparseBooleanArray P;

        /* renamed from: c  reason: collision with root package name */
        public final int f13251c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f13252d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13253e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f13254f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f13255g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13256h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;

        static {
            C0133c a2 = new d().b();
            f13249a = a2;
            f13250b = a2;
        }

        private C0133c(d dVar) {
            super(dVar);
            this.f13252d = dVar.f13257a;
            this.f13253e = dVar.f13258b;
            this.f13254f = dVar.f13259c;
            this.f13255g = dVar.f13260d;
            this.f13256h = dVar.f13261e;
            this.i = dVar.f13262f;
            this.j = dVar.f13263g;
            this.f13251c = dVar.f13264h;
            this.k = dVar.i;
            this.l = dVar.j;
            this.m = dVar.k;
            this.O = dVar.l;
            this.P = dVar.m;
        }

        public static C0133c a(Context context) {
            return new d(context).b();
        }

        private static boolean a(SparseArray<Map<ad, e>> sparseArray, SparseArray<Map<ad, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (indexOfKey < 0 || !a(sparseArray.valueAt(i2), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(java.util.Map<com.applovin.exoplayer2.h.ad, com.applovin.exoplayer2.j.c.e> r4, java.util.Map<com.applovin.exoplayer2.h.ad, com.applovin.exoplayer2.j.c.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.applovin.exoplayer2.h.ad r1 = (com.applovin.exoplayer2.h.ad) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.C0133c.a(java.util.Map, java.util.Map):boolean");
        }

        /* access modifiers changed from: private */
        public static String d(int i2) {
            return Integer.toString(i2, 36);
        }

        public final boolean a(int i2) {
            return this.P.get(i2);
        }

        public final boolean a(int i2, ad adVar) {
            Map map = this.O.get(i2);
            return map != null && map.containsKey(adVar);
        }

        public final e b(int i2, ad adVar) {
            Map map = this.O.get(i2);
            if (map != null) {
                return (e) map.get(adVar);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0133c cVar = (C0133c) obj;
            return super.equals(cVar) && this.f13252d == cVar.f13252d && this.f13253e == cVar.f13253e && this.f13254f == cVar.f13254f && this.f13255g == cVar.f13255g && this.f13256h == cVar.f13256h && this.i == cVar.i && this.j == cVar.j && this.f13251c == cVar.f13251c && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && a(this.P, cVar.P) && a(this.O, cVar.O);
        }

        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13252d ? 1 : 0)) * 31) + (this.f13253e ? 1 : 0)) * 31) + (this.f13254f ? 1 : 0)) * 31) + (this.f13255g ? 1 : 0)) * 31) + (this.f13256h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + this.f13251c) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0);
        }
    }

    public static final class d extends i.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f13257a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f13258b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f13259c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f13260d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f13261e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f13262f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f13263g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f13264h;
        /* access modifiers changed from: private */
        public boolean i;
        /* access modifiers changed from: private */
        public boolean j;
        /* access modifiers changed from: private */
        public boolean k;
        /* access modifiers changed from: private */
        public final SparseArray<Map<ad, e>> l;
        /* access modifiers changed from: private */
        public final SparseBooleanArray m;

        @Deprecated
        public d() {
            this.l = new SparseArray<>();
            this.m = new SparseBooleanArray();
            c();
        }

        public d(Context context) {
            super(context);
            this.l = new SparseArray<>();
            this.m = new SparseBooleanArray();
            c();
        }

        private d(Bundle bundle) {
            super(bundle);
            C0133c cVar = C0133c.f13249a;
            a(bundle.getBoolean(C0133c.d(1000), cVar.f13252d));
            b(bundle.getBoolean(C0133c.d(1001), cVar.f13253e));
            c(bundle.getBoolean(C0133c.d(1002), cVar.f13254f));
            d(bundle.getBoolean(C0133c.d(1003), cVar.f13255g));
            e(bundle.getBoolean(C0133c.d(1004), cVar.f13256h));
            f(bundle.getBoolean(C0133c.d(1005), cVar.i));
            g(bundle.getBoolean(C0133c.d(1006), cVar.j));
            a(bundle.getInt(C0133c.d(IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS), cVar.f13251c));
            h(bundle.getBoolean(C0133c.d(IronSourceError.AUCTION_ERROR_DECOMPRESSION), cVar.k));
            i(bundle.getBoolean(C0133c.d(1009), cVar.l));
            j(bundle.getBoolean(C0133c.d(1010), cVar.m));
            this.l = new SparseArray<>();
            a(bundle);
            this.m = a(bundle.getIntArray(C0133c.d(1014)));
        }

        private SparseBooleanArray a(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int append : iArr) {
                sparseBooleanArray.append(append, true);
            }
            return sparseBooleanArray;
        }

        private void a(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C0133c.d(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND));
            List<ad> a2 = com.applovin.exoplayer2.l.c.a(ad.f12753c, (List<Bundle>) bundle.getParcelableArrayList(C0133c.d(1012)), s.g());
            SparseArray<e> a3 = com.applovin.exoplayer2.l.c.a(e.f13265e, (SparseArray<Bundle>) bundle.getSparseParcelableArray(C0133c.d(1013)), new SparseArray());
            if (intArray != null && intArray.length == a2.size()) {
                for (int i2 = 0; i2 < intArray.length; i2++) {
                    a(intArray[i2], a2.get(i2), a3.get(i2));
                }
            }
        }

        private void c() {
            this.f13257a = true;
            this.f13258b = false;
            this.f13259c = true;
            this.f13260d = true;
            this.f13261e = false;
            this.f13262f = false;
            this.f13263g = false;
            this.f13264h = 0;
            this.i = true;
            this.j = false;
            this.k = true;
        }

        /* renamed from: a */
        public C0133c b() {
            return new C0133c(this);
        }

        public d a(int i2) {
            this.f13264h = i2;
            return this;
        }

        /* renamed from: a */
        public d b(int i2, int i3, boolean z) {
            super.b(i2, i3, z);
            return this;
        }

        public final d a(int i2, ad adVar, e eVar) {
            Map map = this.l.get(i2);
            if (map == null) {
                map = new HashMap();
                this.l.put(i2, map);
            }
            if (map.containsKey(adVar) && com.applovin.exoplayer2.l.ai.a(map.get(adVar), (Object) eVar)) {
                return this;
            }
            map.put(adVar, eVar);
            return this;
        }

        /* renamed from: a */
        public d b(Context context) {
            super.b(context);
            return this;
        }

        /* renamed from: a */
        public d b(Context context, boolean z) {
            super.b(context, z);
            return this;
        }

        public d a(boolean z) {
            this.f13257a = z;
            return this;
        }

        public d b(boolean z) {
            this.f13258b = z;
            return this;
        }

        public d c(boolean z) {
            this.f13259c = z;
            return this;
        }

        public d d(boolean z) {
            this.f13260d = z;
            return this;
        }

        public d e(boolean z) {
            this.f13261e = z;
            return this;
        }

        public d f(boolean z) {
            this.f13262f = z;
            return this;
        }

        public d g(boolean z) {
            this.f13263g = z;
            return this;
        }

        public d h(boolean z) {
            this.i = z;
            return this;
        }

        public d i(boolean z) {
            this.j = z;
            return this;
        }

        public d j(boolean z) {
            this.k = z;
            return this;
        }
    }

    public static final class e implements com.applovin.exoplayer2.g {

        /* renamed from: e  reason: collision with root package name */
        public static final g.a<e> f13265e = $$Lambda$c$e$WLJC6HBk1Rzojf3dltgOntUrnkk.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final int f13266a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f13267b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13268c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13269d;

        public e(int i, int[] iArr, int i2) {
            this.f13266a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13267b = copyOf;
            this.f13268c = iArr.length;
            this.f13269d = i2;
            Arrays.sort(copyOf);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(a(0), -1);
            int[] intArray = bundle.getIntArray(a(1));
            int i2 = bundle.getInt(a(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            com.applovin.exoplayer2.l.a.a(z);
            com.applovin.exoplayer2.l.a.b(intArray);
            return new e(i, intArray, i2);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f13266a == eVar.f13266a && Arrays.equals(this.f13267b, eVar.f13267b) && this.f13269d == eVar.f13269d;
        }

        public int hashCode() {
            return (((this.f13266a * 31) + Arrays.hashCode(this.f13267b)) * 31) + this.f13269d;
        }
    }

    protected static final class f implements Comparable<f> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13270a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13271b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13272c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f13273d;

        /* renamed from: e  reason: collision with root package name */
        private final int f13274e;

        /* renamed from: f  reason: collision with root package name */
        private final int f13275f;

        /* renamed from: g  reason: collision with root package name */
        private final int f13276g;

        /* renamed from: h  reason: collision with root package name */
        private final int f13277h;
        private final boolean i;

        public f(v vVar, C0133c cVar, int i2, String str) {
            int i3;
            boolean z = false;
            this.f13271b = c.a(i2, false);
            int i4 = vVar.f13925d & (~cVar.f13251c);
            this.f13272c = (i4 & 1) != 0;
            this.f13273d = (i4 & 2) != 0;
            int i5 = Integer.MAX_VALUE;
            s a2 = cVar.H.isEmpty() ? s.a("") : cVar.H;
            int i6 = 0;
            while (true) {
                if (i6 >= a2.size()) {
                    i3 = 0;
                    break;
                }
                i3 = c.a(vVar, (String) a2.get(i6), cVar.J);
                if (i3 > 0) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
            this.f13274e = i5;
            this.f13275f = i3;
            this.f13276g = Integer.bitCount(vVar.f13926e & cVar.I);
            this.i = (vVar.f13926e & 1088) != 0;
            this.f13277h = c.a(vVar, str, c.a(str) == null);
            if (this.f13275f > 0 || ((cVar.H.isEmpty() && this.f13276g > 0) || this.f13272c || (this.f13273d && this.f13277h > 0))) {
                z = true;
            }
            this.f13270a = z;
        }

        /* renamed from: a */
        public int compareTo(f fVar) {
            n a2 = n.a().b(this.f13271b, fVar.f13271b).a(Integer.valueOf(this.f13274e), Integer.valueOf(fVar.f13274e), ai.b().a()).a(this.f13275f, fVar.f13275f).a(this.f13276g, fVar.f13276g).b(this.f13272c, fVar.f13272c).a(Boolean.valueOf(this.f13273d), Boolean.valueOf(fVar.f13273d), this.f13275f == 0 ? ai.b() : ai.b().a()).a(this.f13277h, fVar.f13277h);
            if (this.f13276g == 0) {
                a2 = a2.a(this.i, fVar.i);
            }
            return a2.b();
        }
    }

    protected static final class g implements Comparable<g> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13278a;

        /* renamed from: b  reason: collision with root package name */
        private final C0133c f13279b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13280c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f13281d;

        /* renamed from: e  reason: collision with root package name */
        private final int f13282e;

        /* renamed from: f  reason: collision with root package name */
        private final int f13283f;

        /* renamed from: g  reason: collision with root package name */
        private final int f13284g;

        public g(v vVar, C0133c cVar, int i, boolean z) {
            this.f13279b = cVar;
            boolean z2 = true;
            int i2 = 0;
            this.f13278a = z && (vVar.q == -1 || vVar.q <= cVar.q) && ((vVar.r == -1 || vVar.r <= cVar.r) && ((vVar.s == -1.0f || vVar.s <= ((float) cVar.s)) && (vVar.f13929h == -1 || vVar.f13929h <= cVar.t)));
            if (!z || ((vVar.q != -1 && vVar.q < cVar.u) || ((vVar.r != -1 && vVar.r < cVar.v) || ((vVar.s != -1.0f && vVar.s < ((float) cVar.w)) || (vVar.f13929h != -1 && vVar.f13929h < cVar.x))))) {
                z2 = false;
            }
            this.f13280c = z2;
            this.f13281d = c.a(i, false);
            this.f13282e = vVar.f13929h;
            this.f13283f = vVar.b();
            int i3 = Integer.MAX_VALUE;
            while (true) {
                if (i2 < cVar.B.size()) {
                    if (vVar.l != null && vVar.l.equals(cVar.B.get(i2))) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.f13284g = i3;
        }

        /* renamed from: a */
        public int compareTo(g gVar) {
            ai a2 = (!this.f13278a || !this.f13281d) ? c.f13235b.a() : c.f13235b;
            return n.a().b(this.f13281d, gVar.f13281d).b(this.f13278a, gVar.f13278a).b(this.f13280c, gVar.f13280c).a(Integer.valueOf(this.f13284g), Integer.valueOf(gVar.f13284g), ai.b().a()).a(Integer.valueOf(this.f13282e), Integer.valueOf(gVar.f13282e), this.f13279b.K ? c.f13235b.a() : c.f13236c).a(Integer.valueOf(this.f13283f), Integer.valueOf(gVar.f13283f), a2).a(Integer.valueOf(this.f13282e), Integer.valueOf(gVar.f13282e), a2).b();
        }
    }

    @Deprecated
    public c() {
        this(C0133c.f13249a, (d.b) new a.b());
    }

    public c(Context context) {
        this(context, (d.b) new a.b());
    }

    public c(Context context, d.b bVar) {
        this(C0133c.a(context), bVar);
    }

    public c(C0133c cVar, d.b bVar) {
        this.f13237d = bVar;
        this.f13238e = new AtomicReference<>(cVar);
    }

    private static int a(ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (a(acVar.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    protected static int a(v vVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f13924c)) {
            return 4;
        }
        String a2 = a(str);
        String a3 = a(vVar.f13924c);
        if (a3 == null || a2 == null) {
            return (!z || a3 != null) ? 0 : 1;
        }
        if (a3.startsWith(a2) || a2.startsWith(a3)) {
            return 3;
        }
        return com.applovin.exoplayer2.l.ai.b(a3, "-")[0].equals(com.applovin.exoplayer2.l.ai.b(a2, "-")[0]) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.applovin.exoplayer2.l.ai.a((int) r0, (int) r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.applovin.exoplayer2.l.ai.a((int) r3, (int) r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.a(boolean, int, int, int, int):android.graphics.Point");
    }

    private static d.a a(ad adVar, int[][] iArr, int i, C0133c cVar) {
        ad adVar2 = adVar;
        C0133c cVar2 = cVar;
        int i2 = cVar2.f13254f ? 24 : 16;
        boolean z = cVar2.f13253e && (i & i2) != 0;
        int i3 = 0;
        while (i3 < adVar2.f12754b) {
            ac a2 = adVar2.a(i3);
            int[] iArr2 = iArr[i3];
            int i4 = cVar2.q;
            int i5 = cVar2.r;
            int i6 = cVar2.s;
            int i7 = cVar2.t;
            int i8 = cVar2.u;
            int i9 = cVar2.v;
            int i10 = cVar2.w;
            int i11 = cVar2.x;
            int i12 = cVar2.y;
            int i13 = cVar2.z;
            boolean z2 = cVar2.A;
            ac acVar = a2;
            int i14 = i3;
            int[] a3 = a(a2, iArr2, z, i2, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z2);
            if (a3.length > 0) {
                return new d.a(acVar, a3);
            }
            i3 = i14 + 1;
            adVar2 = adVar;
            cVar2 = cVar;
        }
        return null;
    }

    private static d.a a(ad adVar, int[][] iArr, C0133c cVar) {
        ad adVar2 = adVar;
        C0133c cVar2 = cVar;
        int i = -1;
        ac acVar = null;
        g gVar = null;
        for (int i2 = 0; i2 < adVar2.f12754b; i2++) {
            ac a2 = adVar2.a(i2);
            List<Integer> a3 = a(a2, cVar2.y, cVar2.z, cVar2.A);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a2.f12749a; i3++) {
                v a4 = a2.a(i3);
                if ((a4.f13926e & 16384) == 0 && a(iArr2[i3], cVar2.k)) {
                    g gVar2 = new g(a4, cVar2, iArr2[i3], a3.contains(Integer.valueOf(i3)));
                    if ((gVar2.f13278a || cVar2.f13252d) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        acVar = a2;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i);
    }

    protected static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static List<Integer> a(ac acVar, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(acVar.f12749a);
        for (int i3 = 0; i3 < acVar.f12749a; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < acVar.f12749a; i5++) {
                v a2 = acVar.a(i5);
                if (a2.q > 0 && a2.r > 0) {
                    Point a3 = a(z, i, i2, a2.q, a2.r);
                    int i6 = a2.q * a2.r;
                    if (a2.q >= ((int) (((float) a3.x) * 0.98f)) && a2.r >= ((int) (((float) a3.y) * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int b2 = acVar.a(((Integer) arrayList.get(size)).intValue()).b();
                    if (b2 == -1 || b2 > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void a(f.a aVar, int[][][] iArr, at[] atVarArr, d[] dVarArr) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= aVar.a()) {
                z = true;
                break;
            }
            int a2 = aVar.a(i);
            d dVar = dVarArr[i];
            if ((a2 == 1 || a2 == 2) && dVar != null && a(iArr[i], aVar.b(i), dVar)) {
                if (a2 == 1) {
                    if (i3 != -1) {
                        break;
                    }
                    i3 = i;
                } else if (i2 != -1) {
                    break;
                } else {
                    i2 = i;
                }
            }
            i++;
        }
        z = false;
        if (!(i3 == -1 || i2 == -1)) {
            z2 = true;
        }
        if (z && z2) {
            at atVar = new at(true);
            atVarArr[i3] = atVar;
            atVarArr[i2] = atVar;
        }
    }

    protected static boolean a(int i, boolean z) {
        int c2 = as.CC.c(i);
        return c2 == 4 || (z && c2 == 3);
    }

    private static boolean a(v vVar, int i, v vVar2, int i2, boolean z, boolean z2, boolean z3) {
        if (!a(i, false) || vVar.f13929h == -1 || vVar.f13929h > i2) {
            return false;
        }
        if (!z3 && (vVar.y == -1 || vVar.y != vVar2.y)) {
            return false;
        }
        if (z || (vVar.l != null && TextUtils.equals(vVar.l, vVar2.l))) {
            return z2 || (vVar.z != -1 && vVar.z == vVar2.z);
        }
        return false;
    }

    private static boolean a(v vVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((vVar.f13926e & 16384) != 0 || !a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !com.applovin.exoplayer2.l.ai.a((Object) vVar.l, (Object) str)) {
            return false;
        }
        if (vVar.q != -1 && (i7 > vVar.q || vVar.q > i3)) {
            return false;
        }
        if (vVar.r == -1 || (i8 <= vVar.r && vVar.r <= i4)) {
            return (vVar.s == -1.0f || (((float) i9) <= vVar.s && vVar.s <= ((float) i5))) && vVar.f13929h != -1 && i10 <= vVar.f13929h && vVar.f13929h <= i6;
        }
        return false;
    }

    private static boolean a(int[][] iArr, ad adVar, d dVar) {
        if (dVar == null) {
            return false;
        }
        int a2 = adVar.a(dVar.d());
        for (int i = 0; i < dVar.e(); i++) {
            if (as.CC.d(iArr[a2][dVar.b(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static int[] a(ac acVar, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        ac acVar2 = acVar;
        int i3 = i;
        v a2 = acVar.a(i);
        int[] iArr2 = new int[acVar2.f12749a];
        int i4 = 0;
        for (int i5 = 0; i5 < acVar2.f12749a; i5++) {
            if (i5 == i3 || a(acVar.a(i5), iArr[i5], a2, i2, z, z2, z3)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    private static int[] a(ac acVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        HashSet hashSet;
        int i12;
        int i13;
        ac acVar2 = acVar;
        if (acVar2.f12749a < 2) {
            return f13234a;
        }
        List<Integer> a2 = a(acVar2, i10, i11, z2);
        if (a2.size() < 2) {
            return f13234a;
        }
        if (!z) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < a2.size()) {
                String str3 = acVar2.a(a2.get(i15).intValue()).l;
                if (hashSet2.add(str3)) {
                    String str4 = str3;
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                    int a3 = a(acVar, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, a2);
                    if (a3 > i13) {
                        i14 = a3;
                        str2 = str4;
                        i15 = i12 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                }
                i14 = i13;
                i15 = i12 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        b(acVar, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, a2);
        return a2.size() < 2 ? f13234a : com.applovin.exoplayer2.common.b.c.a((Collection<? extends Number>) a2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void b(ac acVar, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            if (!a(acVar.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list2.remove(size);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Pair<d.a, f> a(ad adVar, int[][] iArr, C0133c cVar, String str) throws p {
        ad adVar2 = adVar;
        C0133c cVar2 = cVar;
        int i = -1;
        ac acVar = null;
        f fVar = null;
        for (int i2 = 0; i2 < adVar2.f12754b; i2++) {
            ac a2 = adVar2.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a2.f12749a; i3++) {
                if (a(iArr2[i3], cVar2.k)) {
                    f fVar2 = new f(a2.a(i3), cVar2, iArr2[i3], str);
                    if (fVar2.f13270a && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        acVar = a2;
                        i = i3;
                        fVar = fVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (acVar == null) {
            return null;
        }
        return Pair.create(new d.a(acVar, i), (f) com.applovin.exoplayer2.l.a.b(fVar));
    }

    /* access modifiers changed from: protected */
    public final Pair<at[], d[]> a(f.a aVar, int[][][] iArr, int[] iArr2, p.a aVar2, ba baVar) throws com.applovin.exoplayer2.p {
        C0133c cVar = this.f13238e.get();
        int a2 = aVar.a();
        d.a[] a3 = a(aVar, iArr, iArr2, cVar);
        int i = 0;
        while (true) {
            d.a aVar3 = null;
            if (i >= a2) {
                break;
            }
            int a4 = aVar.a(i);
            if (cVar.a(i) || cVar.M.contains(Integer.valueOf(a4))) {
                a3[i] = null;
            } else {
                ad b2 = aVar.b(i);
                if (cVar.a(i, b2)) {
                    e b3 = cVar.b(i, b2);
                    if (b3 != null) {
                        aVar3 = new d.a(b2.a(b3.f13266a), b3.f13267b, b3.f13269d);
                    }
                    a3[i] = aVar3;
                }
            }
            i++;
        }
        d[] a5 = this.f13237d.a(a3, d(), aVar2, baVar);
        at[] atVarArr = new at[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            boolean z = true;
            if ((cVar.a(i2) || cVar.M.contains(Integer.valueOf(aVar.a(i2)))) || (aVar.a(i2) != -2 && a5[i2] == null)) {
                z = false;
            }
            atVarArr[i2] = z ? at.f11138a : null;
        }
        if (cVar.l) {
            a(aVar, iArr, atVarArr, a5);
        }
        return Pair.create(atVarArr, a5);
    }

    /* access modifiers changed from: protected */
    public d.a a(int i, ad adVar, int[][] iArr, C0133c cVar) throws com.applovin.exoplayer2.p {
        ac acVar = null;
        b bVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < adVar.f12754b; i3++) {
            ac a2 = adVar.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.f12749a; i4++) {
                if (a(iArr2[i4], cVar.k)) {
                    b bVar2 = new b(a2.a(i4), iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        acVar = a2;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (acVar == null) {
            return null;
        }
        return new d.a(acVar, i2);
    }

    /* access modifiers changed from: protected */
    public d.a a(ad adVar, int[][] iArr, int i, C0133c cVar, boolean z) throws com.applovin.exoplayer2.p {
        d.a a2 = (cVar.L || cVar.K || !z) ? null : a(adVar, iArr, i, cVar);
        return a2 == null ? a(adVar, iArr, cVar) : a2;
    }

    public boolean a() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.applovin.exoplayer2.j.c$a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.j.d.a[] a(com.applovin.exoplayer2.j.f.a r22, int[][][] r23, int[] r24, com.applovin.exoplayer2.j.c.C0133c r25) throws com.applovin.exoplayer2.p {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.a()
            com.applovin.exoplayer2.j.d$a[] r10 = new com.applovin.exoplayer2.j.d.a[r9]
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0044
            int r1 = r7.a(r12)
            if (r14 != r1) goto L_0x0041
            if (r0 != 0) goto L_0x0036
            com.applovin.exoplayer2.h.ad r1 = r7.b(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            com.applovin.exoplayer2.j.d$a r0 = r0.a((com.applovin.exoplayer2.h.ad) r1, (int[][]) r2, (int) r3, (com.applovin.exoplayer2.j.c.C0133c) r4, (boolean) r5)
            r10[r12] = r0
            r0 = r10[r12]
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            com.applovin.exoplayer2.h.ad r1 = r7.b(r12)
            int r1 = r1.f12754b
            if (r1 <= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r15 = 0
        L_0x0040:
            r13 = r13 | r15
        L_0x0041:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0044:
            r12 = -1
            r16 = 0
            r3 = r16
            r4 = r3
            r2 = -1
            r5 = 0
        L_0x004c:
            if (r5 >= r9) goto L_0x00b7
            int r0 = r7.a(r5)
            if (r15 != r0) goto L_0x00a8
            boolean r0 = r8.m
            if (r0 != 0) goto L_0x005e
            if (r13 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r17 = 0
            goto L_0x0060
        L_0x005e:
            r17 = 1
        L_0x0060:
            com.applovin.exoplayer2.h.ad r1 = r7.b(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r15 = r3
            r3 = r19
            r20 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            if (r15 == 0) goto L_0x008a
            java.lang.Object r1 = r0.second
            com.applovin.exoplayer2.j.c$a r1 = (com.applovin.exoplayer2.j.c.a) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ae
        L_0x008a:
            if (r14 == r12) goto L_0x008e
            r10[r14] = r16
        L_0x008e:
            java.lang.Object r1 = r0.first
            com.applovin.exoplayer2.j.d$a r1 = (com.applovin.exoplayer2.j.d.a) r1
            r10[r19] = r1
            com.applovin.exoplayer2.h.ac r2 = r1.f13285a
            int[] r1 = r1.f13286b
            r1 = r1[r11]
            com.applovin.exoplayer2.v r1 = r2.a((int) r1)
            java.lang.String r4 = r1.f13924c
            java.lang.Object r0 = r0.second
            r3 = r0
            com.applovin.exoplayer2.j.c$a r3 = (com.applovin.exoplayer2.j.c.a) r3
            r2 = r19
            goto L_0x00b2
        L_0x00a8:
            r14 = r2
            r15 = r3
            r20 = r4
            r19 = r5
        L_0x00ae:
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x00b2:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004c
        L_0x00b7:
            r20 = r4
            r0 = r16
            r1 = -1
        L_0x00bc:
            if (r11 >= r9) goto L_0x010d
            int r2 = r7.a(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0105
            r4 = 2
            if (r2 == r4) goto L_0x0102
            r5 = 3
            if (r2 == r5) goto L_0x00d8
            com.applovin.exoplayer2.h.ad r5 = r7.b(r11)
            r13 = r23[r11]
            com.applovin.exoplayer2.j.d$a r2 = r6.a((int) r2, (com.applovin.exoplayer2.h.ad) r5, (int[][]) r13, (com.applovin.exoplayer2.j.c.C0133c) r8)
            r10[r11] = r2
            goto L_0x0102
        L_0x00d8:
            com.applovin.exoplayer2.h.ad r2 = r7.b(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.a((com.applovin.exoplayer2.h.ad) r2, (int[][]) r5, (com.applovin.exoplayer2.j.c.C0133c) r8, (java.lang.String) r13)
            if (r2 == 0) goto L_0x0108
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r5 = r2.second
            com.applovin.exoplayer2.j.c$f r5 = (com.applovin.exoplayer2.j.c.f) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0108
        L_0x00f2:
            if (r1 == r12) goto L_0x00f6
            r10[r1] = r16
        L_0x00f6:
            java.lang.Object r0 = r2.first
            com.applovin.exoplayer2.j.d$a r0 = (com.applovin.exoplayer2.j.d.a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            com.applovin.exoplayer2.j.c$f r0 = (com.applovin.exoplayer2.j.c.f) r0
            r1 = r11
            goto L_0x0108
        L_0x0102:
            r13 = r20
            goto L_0x0108
        L_0x0105:
            r13 = r20
            r4 = 2
        L_0x0108:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00bc
        L_0x010d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.j.c.a(com.applovin.exoplayer2.j.f$a, int[][][], int[], com.applovin.exoplayer2.j.c$c):com.applovin.exoplayer2.j.d$a[]");
    }

    /* access modifiers changed from: protected */
    public Pair<d.a, a> b(ad adVar, int[][] iArr, int i, C0133c cVar, boolean z) throws com.applovin.exoplayer2.p {
        ad adVar2 = adVar;
        C0133c cVar2 = cVar;
        d.a aVar = null;
        a aVar2 = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < adVar2.f12754b; i4++) {
            ac a2 = adVar2.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.f12749a; i5++) {
                if (a(iArr2[i5], cVar2.k)) {
                    a aVar3 = new a(a2.a(i5), cVar2, iArr2[i5]);
                    if ((aVar3.f13239a || cVar2.f13255g) && (aVar2 == null || aVar3.compareTo(aVar2) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        aVar2 = aVar3;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        ac a3 = adVar2.a(i2);
        if (!cVar2.L && !cVar2.K && z) {
            int[] a4 = a(a3, iArr[i2], i3, cVar2.F, cVar2.f13256h, cVar2.i, cVar2.j);
            if (a4.length > 1) {
                aVar = new d.a(a3, a4);
            }
        }
        if (aVar == null) {
            aVar = new d.a(a3, i3);
        }
        return Pair.create(aVar, (a) com.applovin.exoplayer2.l.a.b(aVar2));
    }
}
