package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.c;
import com.applovin.exoplayer2.m.b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class v implements g {
    public static final g.a<v> F = $$Lambda$v$BzlP3upmt6g8uH2d00KE1crm1k.INSTANCE;
    private static final v G = new a().a();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    public final String f13922a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13923b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13924c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13925d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13926e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13927f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13928g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13929h;
    public final String i;
    public final com.applovin.exoplayer2.g.a j;
    public final String k;
    public final String l;
    public final int m;
    public final List<byte[]> n;
    public final e o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final b x;
    public final int y;
    public final int z;

    public static final class a {
        /* access modifiers changed from: private */
        public int A;
        /* access modifiers changed from: private */
        public int B;
        /* access modifiers changed from: private */
        public int C;
        /* access modifiers changed from: private */
        public int D;
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f13930a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f13931b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f13932c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f13933d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f13934e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f13935f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f13936g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String f13937h;
        /* access modifiers changed from: private */
        public com.applovin.exoplayer2.g.a i;
        /* access modifiers changed from: private */
        public String j;
        /* access modifiers changed from: private */
        public String k;
        /* access modifiers changed from: private */
        public int l;
        /* access modifiers changed from: private */
        public List<byte[]> m;
        /* access modifiers changed from: private */
        public e n;
        /* access modifiers changed from: private */
        public long o;
        /* access modifiers changed from: private */
        public int p;
        /* access modifiers changed from: private */
        public int q;
        /* access modifiers changed from: private */
        public float r;
        /* access modifiers changed from: private */
        public int s;
        /* access modifiers changed from: private */
        public float t;
        /* access modifiers changed from: private */
        public byte[] u;
        /* access modifiers changed from: private */
        public int v;
        /* access modifiers changed from: private */
        public b w;
        /* access modifiers changed from: private */
        public int x;
        /* access modifiers changed from: private */
        public int y;
        /* access modifiers changed from: private */
        public int z;

        public a() {
            this.f13935f = -1;
            this.f13936g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = 0;
        }

        private a(v vVar) {
            this.f13930a = vVar.f13922a;
            this.f13931b = vVar.f13923b;
            this.f13932c = vVar.f13924c;
            this.f13933d = vVar.f13925d;
            this.f13934e = vVar.f13926e;
            this.f13935f = vVar.f13927f;
            this.f13936g = vVar.f13928g;
            this.f13937h = vVar.i;
            this.i = vVar.j;
            this.j = vVar.k;
            this.k = vVar.l;
            this.l = vVar.m;
            this.m = vVar.n;
            this.n = vVar.o;
            this.o = vVar.p;
            this.p = vVar.q;
            this.q = vVar.r;
            this.r = vVar.s;
            this.s = vVar.t;
            this.t = vVar.u;
            this.u = vVar.v;
            this.v = vVar.w;
            this.w = vVar.x;
            this.x = vVar.y;
            this.y = vVar.z;
            this.z = vVar.A;
            this.A = vVar.B;
            this.B = vVar.C;
            this.C = vVar.D;
            this.D = vVar.E;
        }

        public a a(float f2) {
            this.r = f2;
            return this;
        }

        public a a(int i2) {
            this.f13930a = Integer.toString(i2);
            return this;
        }

        public a a(long j2) {
            this.o = j2;
            return this;
        }

        public a a(e eVar) {
            this.n = eVar;
            return this;
        }

        public a a(com.applovin.exoplayer2.g.a aVar) {
            this.i = aVar;
            return this;
        }

        public a a(b bVar) {
            this.w = bVar;
            return this;
        }

        public a a(String str) {
            this.f13930a = str;
            return this;
        }

        public a a(List<byte[]> list) {
            this.m = list;
            return this;
        }

        public a a(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public v a() {
            return new v(this);
        }

        public a b(float f2) {
            this.t = f2;
            return this;
        }

        public a b(int i2) {
            this.f13933d = i2;
            return this;
        }

        public a b(String str) {
            this.f13931b = str;
            return this;
        }

        public a c(int i2) {
            this.f13934e = i2;
            return this;
        }

        public a c(String str) {
            this.f13932c = str;
            return this;
        }

        public a d(int i2) {
            this.f13935f = i2;
            return this;
        }

        public a d(String str) {
            this.f13937h = str;
            return this;
        }

        public a e(int i2) {
            this.f13936g = i2;
            return this;
        }

        public a e(String str) {
            this.j = str;
            return this;
        }

        public a f(int i2) {
            this.l = i2;
            return this;
        }

        public a f(String str) {
            this.k = str;
            return this;
        }

        public a g(int i2) {
            this.p = i2;
            return this;
        }

        public a h(int i2) {
            this.q = i2;
            return this;
        }

        public a i(int i2) {
            this.s = i2;
            return this;
        }

        public a j(int i2) {
            this.v = i2;
            return this;
        }

        public a k(int i2) {
            this.x = i2;
            return this;
        }

        public a l(int i2) {
            this.y = i2;
            return this;
        }

        public a m(int i2) {
            this.z = i2;
            return this;
        }

        public a n(int i2) {
            this.A = i2;
            return this;
        }

        public a o(int i2) {
            this.B = i2;
            return this;
        }

        public a p(int i2) {
            this.C = i2;
            return this;
        }

        public a q(int i2) {
            this.D = i2;
            return this;
        }
    }

    private v(a aVar) {
        this.f13922a = aVar.f13930a;
        this.f13923b = aVar.f13931b;
        this.f13924c = ai.b(aVar.f13932c);
        this.f13925d = aVar.f13933d;
        this.f13926e = aVar.f13934e;
        this.f13927f = aVar.f13935f;
        int g2 = aVar.f13936g;
        this.f13928g = g2;
        this.f13929h = g2 == -1 ? this.f13927f : g2;
        this.i = aVar.f13937h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m == null ? Collections.emptyList() : aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        int i2 = 0;
        this.t = aVar.s == -1 ? 0 : aVar.s;
        this.u = aVar.t == -1.0f ? 1.0f : aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = aVar.y;
        this.A = aVar.z;
        this.B = aVar.A == -1 ? 0 : aVar.A;
        this.C = aVar.B != -1 ? aVar.B : i2;
        this.D = aVar.C;
        this.E = (aVar.D != 0 || this.o == null) ? aVar.D : 1;
    }

    /* access modifiers changed from: private */
    public static v a(Bundle bundle) {
        a aVar = new a();
        c.a(bundle);
        int i2 = 0;
        aVar.a((String) a(bundle.getString(b(0)), G.f13922a)).b((String) a(bundle.getString(b(1)), G.f13923b)).c((String) a(bundle.getString(b(2)), G.f13924c)).b(bundle.getInt(b(3), G.f13925d)).c(bundle.getInt(b(4), G.f13926e)).d(bundle.getInt(b(5), G.f13927f)).e(bundle.getInt(b(6), G.f13928g)).d((String) a(bundle.getString(b(7)), G.i)).a((com.applovin.exoplayer2.g.a) a((com.applovin.exoplayer2.g.a) bundle.getParcelable(b(8)), G.j)).e((String) a(bundle.getString(b(9)), G.k)).f((String) a(bundle.getString(b(10)), G.l)).f(bundle.getInt(b(11), G.m));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i2));
            if (byteArray == null) {
                aVar.a((List<byte[]>) arrayList).a((e) bundle.getParcelable(b(13))).a(bundle.getLong(b(14), G.p)).g(bundle.getInt(b(15), G.q)).h(bundle.getInt(b(16), G.r)).a(bundle.getFloat(b(17), G.s)).i(bundle.getInt(b(18), G.t)).b(bundle.getFloat(b(19), G.u)).a(bundle.getByteArray(b(20))).j(bundle.getInt(b(21), G.w)).a((b) c.a(b.f13672e, bundle.getBundle(b(22)))).k(bundle.getInt(b(23), G.y)).l(bundle.getInt(b(24), G.z)).m(bundle.getInt(b(25), G.A)).n(bundle.getInt(b(26), G.B)).o(bundle.getInt(b(27), G.C)).p(bundle.getInt(b(28), G.D)).q(bundle.getInt(b(29), G.E));
                return aVar.a();
            }
            arrayList.add(byteArray);
            i2++;
        }
    }

    private static <T> T a(T t2, T t3) {
        return t2 != null ? t2 : t3;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    private static String c(int i2) {
        return b(12) + "_" + Integer.toString(i2, 36);
    }

    public a a() {
        return new a();
    }

    public v a(int i2) {
        return a().q(i2).a();
    }

    public boolean a(v vVar) {
        if (this.n.size() != vVar.n.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            if (!Arrays.equals(this.n.get(i2), vVar.n.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int b() {
        int i2;
        int i3 = this.q;
        if (i3 == -1 || (i2 = this.r) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = r8.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r8 == 0) goto L_0x0109
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L_0x0013
            goto L_0x0109
        L_0x0013:
            com.applovin.exoplayer2.v r8 = (com.applovin.exoplayer2.v) r8
            int r2 = r7.H
            if (r2 == 0) goto L_0x0020
            int r3 = r8.H
            if (r3 == 0) goto L_0x0020
            if (r2 == r3) goto L_0x0020
            return r1
        L_0x0020:
            int r2 = r7.f13925d
            int r3 = r8.f13925d
            if (r2 != r3) goto L_0x0107
            int r2 = r7.f13926e
            int r3 = r8.f13926e
            if (r2 != r3) goto L_0x0107
            int r2 = r7.f13927f
            int r3 = r8.f13927f
            if (r2 != r3) goto L_0x0107
            int r2 = r7.f13928g
            int r3 = r8.f13928g
            if (r2 != r3) goto L_0x0107
            int r2 = r7.m
            int r3 = r8.m
            if (r2 != r3) goto L_0x0107
            long r2 = r7.p
            long r4 = r8.p
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0107
            int r2 = r7.q
            int r3 = r8.q
            if (r2 != r3) goto L_0x0107
            int r2 = r7.r
            int r3 = r8.r
            if (r2 != r3) goto L_0x0107
            int r2 = r7.t
            int r3 = r8.t
            if (r2 != r3) goto L_0x0107
            int r2 = r7.w
            int r3 = r8.w
            if (r2 != r3) goto L_0x0107
            int r2 = r7.y
            int r3 = r8.y
            if (r2 != r3) goto L_0x0107
            int r2 = r7.z
            int r3 = r8.z
            if (r2 != r3) goto L_0x0107
            int r2 = r7.A
            int r3 = r8.A
            if (r2 != r3) goto L_0x0107
            int r2 = r7.B
            int r3 = r8.B
            if (r2 != r3) goto L_0x0107
            int r2 = r7.C
            int r3 = r8.C
            if (r2 != r3) goto L_0x0107
            int r2 = r7.D
            int r3 = r8.D
            if (r2 != r3) goto L_0x0107
            int r2 = r7.E
            int r3 = r8.E
            if (r2 != r3) goto L_0x0107
            float r2 = r7.s
            float r3 = r8.s
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L_0x0107
            float r2 = r7.u
            float r3 = r8.u
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = r7.f13922a
            java.lang.String r3 = r8.f13922a
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r7.f13923b
            java.lang.String r3 = r8.f13923b
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r7.i
            java.lang.String r3 = r8.i
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r7.k
            java.lang.String r3 = r8.k
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r7.l
            java.lang.String r3 = r8.l
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            java.lang.String r2 = r7.f13924c
            java.lang.String r3 = r8.f13924c
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            byte[] r2 = r7.v
            byte[] r3 = r8.v
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L_0x0107
            com.applovin.exoplayer2.g.a r2 = r7.j
            com.applovin.exoplayer2.g.a r3 = r8.j
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            com.applovin.exoplayer2.m.b r2 = r7.x
            com.applovin.exoplayer2.m.b r3 = r8.x
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            com.applovin.exoplayer2.d.e r2 = r7.o
            com.applovin.exoplayer2.d.e r3 = r8.o
            boolean r2 = com.applovin.exoplayer2.l.ai.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0107
            boolean r8 = r7.a((com.applovin.exoplayer2.v) r8)
            if (r8 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            return r0
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.f13922a;
            int i2 = 0;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13923b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13924c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13925d) * 31) + this.f13926e) * 31) + this.f13927f) * 31) + this.f13928g) * 31;
            String str4 = this.i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            com.applovin.exoplayer2.g.a aVar = this.j;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.H = ((((((((((((((((((((((((((((((hashCode6 + i2) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        }
        return this.H;
    }

    public String toString() {
        return "Format(" + this.f13922a + ", " + this.f13923b + ", " + this.k + ", " + this.l + ", " + this.i + ", " + this.f13929h + ", " + this.f13924c + ", [" + this.q + ", " + this.r + ", " + this.s + "], [" + this.y + ", " + this.z + "])";
    }
}
