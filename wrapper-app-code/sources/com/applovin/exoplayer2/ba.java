package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.a.a;
import com.applovin.exoplayer2.l.ai;

public abstract class ba implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final ba f11359a = new ba() {
        public a a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        public c a(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        public Object a(int i) {
            throw new IndexOutOfBoundsException();
        }

        public int b() {
            return 0;
        }

        public int c() {
            return 0;
        }

        public int c(Object obj) {
            return -1;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final g.a<ba> f11360b = $$Lambda$ba$ucFTv0SKlgJD9tnULZjHTNQuYFw.INSTANCE;

    public static final class a implements g {

        /* renamed from: g  reason: collision with root package name */
        public static final g.a<a> f11361g = $$Lambda$ba$a$QWUO7JvC0zLWqO8DCCWahJGhV4.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public Object f11362a;

        /* renamed from: b  reason: collision with root package name */
        public Object f11363b;

        /* renamed from: c  reason: collision with root package name */
        public int f11364c;

        /* renamed from: d  reason: collision with root package name */
        public long f11365d;

        /* renamed from: e  reason: collision with root package name */
        public long f11366e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11367f;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public com.applovin.exoplayer2.h.a.a f11368h = com.applovin.exoplayer2.h.a.a.f12723a;

        /* access modifiers changed from: private */
        public static a a(Bundle bundle) {
            int i = bundle.getInt(g(0), 0);
            long j = bundle.getLong(g(1), -9223372036854775807L);
            long j2 = bundle.getLong(g(2), 0);
            boolean z = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            com.applovin.exoplayer2.h.a.a fromBundle = bundle2 != null ? com.applovin.exoplayer2.h.a.a.f12724g.fromBundle(bundle2) : com.applovin.exoplayer2.h.a.a.f12723a;
            a aVar = new a();
            aVar.a((Object) null, (Object) null, i, j, j2, fromBundle, z);
            return aVar;
        }

        private static String g(int i) {
            return Integer.toString(i, 36);
        }

        public int a(int i, int i2) {
            return this.f11368h.a(i).a(i2);
        }

        public int a(long j) {
            return this.f11368h.a(j, this.f11365d);
        }

        public long a() {
            return this.f11365d;
        }

        public long a(int i) {
            return this.f11368h.a(i).f12732a;
        }

        public a a(Object obj, Object obj2, int i, long j, long j2) {
            return a(obj, obj2, i, j, j2, com.applovin.exoplayer2.h.a.a.f12723a, false);
        }

        public a a(Object obj, Object obj2, int i, long j, long j2, com.applovin.exoplayer2.h.a.a aVar, boolean z) {
            this.f11362a = obj;
            this.f11363b = obj2;
            this.f11364c = i;
            this.f11365d = j;
            this.f11366e = j2;
            this.f11368h = aVar;
            this.f11367f = z;
            return this;
        }

        public int b(int i) {
            return this.f11368h.a(i).a();
        }

        public int b(long j) {
            return this.f11368h.b(j, this.f11365d);
        }

        public long b() {
            return h.a(this.f11366e);
        }

        public long b(int i, int i2) {
            a.C0123a a2 = this.f11368h.a(i);
            if (a2.f12733b != -1) {
                return a2.f12736e[i2];
            }
            return -9223372036854775807L;
        }

        public long c() {
            return this.f11366e;
        }

        public boolean c(int i) {
            return !this.f11368h.a(i).c();
        }

        public int d() {
            return this.f11368h.f12727c;
        }

        public int d(int i) {
            return this.f11368h.a(i).f12733b;
        }

        public int e() {
            return this.f11368h.f12730f;
        }

        public boolean e(int i) {
            return this.f11368h.a(i).f12738g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            a aVar = (a) obj;
            return ai.a(this.f11362a, aVar.f11362a) && ai.a(this.f11363b, aVar.f11363b) && this.f11364c == aVar.f11364c && this.f11365d == aVar.f11365d && this.f11366e == aVar.f11366e && this.f11367f == aVar.f11367f && ai.a((Object) this.f11368h, (Object) aVar.f11368h);
        }

        public long f() {
            return this.f11368h.f12728d;
        }

        public long f(int i) {
            return this.f11368h.a(i).f12737f;
        }

        public int hashCode() {
            Object obj = this.f11362a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f11363b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f11365d;
            long j2 = this.f11366e;
            return ((((((((((hashCode + i) * 31) + this.f11364c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f11367f ? 1 : 0)) * 31) + this.f11368h.hashCode();
        }
    }

    public static final class b extends ba {

        /* renamed from: c  reason: collision with root package name */
        private final s<c> f11369c;

        /* renamed from: d  reason: collision with root package name */
        private final s<a> f11370d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f11371e;

        /* renamed from: f  reason: collision with root package name */
        private final int[] f11372f;

        public b(s<c> sVar, s<a> sVar2, int[] iArr) {
            com.applovin.exoplayer2.l.a.a(sVar.size() == iArr.length);
            this.f11369c = sVar;
            this.f11370d = sVar2;
            this.f11371e = iArr;
            this.f11372f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f11372f[iArr[i]] = i;
            }
        }

        public int a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                return z ? this.f11371e[this.f11372f[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return b(z);
            }
            return -1;
        }

        public int a(boolean z) {
            if (d()) {
                return -1;
            }
            return z ? this.f11371e[b() - 1] : b() - 1;
        }

        public a a(int i, a aVar, boolean z) {
            a aVar2 = (a) this.f11370d.get(i);
            aVar.a(aVar2.f11362a, aVar2.f11363b, aVar2.f11364c, aVar2.f11365d, aVar2.f11366e, aVar2.f11368h, aVar2.f11367f);
            return aVar;
        }

        public c a(int i, c cVar, long j) {
            c cVar2 = cVar;
            c cVar3 = (c) this.f11369c.get(i);
            Object obj = cVar3.f11374b;
            ab abVar = cVar3.f11376d;
            ab abVar2 = abVar;
            c cVar4 = cVar3;
            c cVar5 = cVar;
            cVar5.a(obj, abVar2, cVar3.f11377e, cVar3.f11378f, cVar3.f11379g, cVar3.f11380h, cVar3.i, cVar3.j, cVar3.l, cVar3.n, cVar4.o, cVar4.p, cVar4.q, cVar4.r);
            c cVar6 = cVar;
            cVar6.m = cVar4.m;
            return cVar6;
        }

        public Object a(int i) {
            throw new UnsupportedOperationException();
        }

        public int b() {
            return this.f11369c.size();
        }

        public int b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != b(z)) {
                return z ? this.f11371e[this.f11372f[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }

        public int b(boolean z) {
            if (d()) {
                return -1;
            }
            if (z) {
                return this.f11371e[0];
            }
            return 0;
        }

        public int c() {
            return this.f11370d.size();
        }

        public int c(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final Object f11373a = new Object();
        public static final g.a<c> s = $$Lambda$ba$c$q6ecxdJ5c_7U1bIsVzirqaZfKH8.INSTANCE;
        private static final Object t = new Object();
        private static final ab u = new ab.b().a("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: b  reason: collision with root package name */
        public Object f11374b = f11373a;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public Object f11375c;

        /* renamed from: d  reason: collision with root package name */
        public ab f11376d = u;

        /* renamed from: e  reason: collision with root package name */
        public Object f11377e;

        /* renamed from: f  reason: collision with root package name */
        public long f11378f;

        /* renamed from: g  reason: collision with root package name */
        public long f11379g;

        /* renamed from: h  reason: collision with root package name */
        public long f11380h;
        public boolean i;
        public boolean j;
        @Deprecated
        public boolean k;
        public ab.e l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;

        /* access modifiers changed from: private */
        public static c a(Bundle bundle) {
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2.getBundle(a(1));
            ab.e eVar = null;
            ab fromBundle = bundle3 != null ? ab.f10974g.fromBundle(bundle3) : null;
            long j2 = bundle2.getLong(a(2), -9223372036854775807L);
            long j3 = bundle2.getLong(a(3), -9223372036854775807L);
            long j4 = bundle2.getLong(a(4), -9223372036854775807L);
            boolean z = bundle2.getBoolean(a(5), false);
            boolean z2 = bundle2.getBoolean(a(6), false);
            Bundle bundle4 = bundle2.getBundle(a(7));
            if (bundle4 != null) {
                eVar = ab.e.f11013g.fromBundle(bundle4);
            }
            boolean z3 = bundle2.getBoolean(a(8), false);
            long j5 = bundle2.getLong(a(9), 0);
            long j6 = bundle2.getLong(a(10), -9223372036854775807L);
            int i2 = bundle2.getInt(a(11), 0);
            int i3 = bundle2.getInt(a(12), 0);
            long j7 = bundle2.getLong(a(13), 0);
            c cVar = r0;
            c cVar2 = new c();
            cVar.a(t, fromBundle, (Object) null, j2, j3, j4, z, z2, eVar, j5, j6, i2, i3, j7);
            cVar2.m = z3;
            return cVar2;
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public long a() {
            return h.a(this.n);
        }

        public c a(Object obj, ab abVar, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, ab.e eVar, long j5, long j6, int i2, int i3, long j7) {
            ab abVar2 = abVar;
            ab.e eVar2 = eVar;
            this.f11374b = obj;
            this.f11376d = abVar2 != null ? abVar2 : u;
            this.f11375c = (abVar2 == null || abVar2.f10976c == null) ? null : abVar2.f10976c.f11031h;
            this.f11377e = obj2;
            this.f11378f = j2;
            this.f11379g = j3;
            this.f11380h = j4;
            this.i = z;
            this.j = z2;
            this.k = eVar2 != null;
            this.l = eVar2;
            this.n = j5;
            this.o = j6;
            this.p = i2;
            this.q = i3;
            this.r = j7;
            this.m = false;
            return this;
        }

        public long b() {
            return this.n;
        }

        public long c() {
            return h.a(this.o);
        }

        public long d() {
            return ai.c(this.f11380h);
        }

        public boolean e() {
            com.applovin.exoplayer2.l.a.b(this.k == (this.l != null));
            return this.l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return ai.a(this.f11374b, cVar.f11374b) && ai.a((Object) this.f11376d, (Object) cVar.f11376d) && ai.a(this.f11377e, cVar.f11377e) && ai.a((Object) this.l, (Object) cVar.l) && this.f11378f == cVar.f11378f && this.f11379g == cVar.f11379g && this.f11380h == cVar.f11380h && this.i == cVar.i && this.j == cVar.j && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f11374b.hashCode()) * 31) + this.f11376d.hashCode()) * 31;
            Object obj = this.f11377e;
            int i2 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            ab.e eVar = this.l;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            long j2 = this.f11378f;
            long j3 = this.f11379g;
            long j4 = this.f11380h;
            long j5 = this.n;
            long j6 = this.o;
            long j7 = this.r;
            return ((((((((((((((((((((((hashCode2 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }
    }

    protected ba() {
    }

    /* access modifiers changed from: private */
    public static ba a(Bundle bundle) {
        s<c> a2 = a(c.s, com.applovin.exoplayer2.l.b.a(bundle, b(0)));
        s<a> a3 = a(a.f11361g, com.applovin.exoplayer2.l.b.a(bundle, b(1)));
        int[] intArray = bundle.getIntArray(b(2));
        if (intArray == null) {
            intArray = c(a2.size());
        }
        return new b(a2, a3, intArray);
    }

    private static <T extends g> s<T> a(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return s.g();
        }
        s.a aVar2 = new s.a();
        s<Bundle> a2 = f.a(iBinder);
        for (int i = 0; i < a2.size(); i++) {
            aVar2.a(aVar.fromBundle(a2.get(i)));
        }
        return aVar2.a();
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    private static int[] c(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? b(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final int a(int i, a aVar, c cVar, int i2, boolean z) {
        int i3 = a(i, aVar).f11364c;
        if (a(i3, cVar).q != i) {
            return i + 1;
        }
        int a2 = a(i3, i2, z);
        if (a2 == -1) {
            return -1;
        }
        return a(a2, cVar).p;
    }

    public int a(boolean z) {
        if (d()) {
            return -1;
        }
        return b() - 1;
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i, long j) {
        return (Pair) com.applovin.exoplayer2.l.a.b(a(cVar, aVar, i, j, 0));
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i, long j, long j2) {
        com.applovin.exoplayer2.l.a.a(i, 0, b());
        a(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.p;
        a(i2, aVar);
        while (i2 < cVar.q && aVar.f11366e != j) {
            int i3 = i2 + 1;
            if (a(i3, aVar).f11366e > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, aVar, true);
        long j3 = j - aVar.f11366e;
        if (aVar.f11365d != -9223372036854775807L) {
            j3 = Math.min(j3, aVar.f11365d - 1);
        }
        return Pair.create(com.applovin.exoplayer2.l.a.b(aVar.f11363b), Long.valueOf(Math.max(0, j3)));
    }

    public final a a(int i, a aVar) {
        return a(i, aVar, false);
    }

    public abstract a a(int i, a aVar, boolean z);

    public a a(Object obj, a aVar) {
        return a(c(obj), aVar, true);
    }

    public final c a(int i, c cVar) {
        return a(i, cVar, 0);
    }

    public abstract c a(int i, c cVar, long j);

    public abstract Object a(int i);

    public abstract int b();

    public int b(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == b(z) ? a(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == b(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public int b(boolean z) {
        return d() ? -1 : 0;
    }

    public final boolean b(int i, a aVar, c cVar, int i2, boolean z) {
        return a(i, aVar, cVar, i2, z) == -1;
    }

    public abstract int c();

    public abstract int c(Object obj);

    public final boolean d() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (baVar.b() != b() || baVar.c() != c()) {
            return false;
        }
        c cVar = new c();
        a aVar = new a();
        c cVar2 = new c();
        a aVar2 = new a();
        for (int i = 0; i < b(); i++) {
            if (!a(i, cVar).equals(baVar.a(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < c(); i2++) {
            if (!a(i2, aVar, true).equals(baVar.a(i2, aVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        c cVar = new c();
        a aVar = new a();
        int b2 = 217 + b();
        int i2 = 0;
        while (true) {
            i = b2 * 31;
            if (i2 >= b()) {
                break;
            }
            b2 = i + a(i2, cVar).hashCode();
            i2++;
        }
        int c2 = i + c();
        for (int i3 = 0; i3 < c(); i3++) {
            c2 = (c2 * 31) + a(i3, aVar, true).hashCode();
        }
        return c2;
    }
}
