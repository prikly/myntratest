package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ab implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f10973a = new b().a();

    /* renamed from: g  reason: collision with root package name */
    public static final g.a<ab> f10974g = $$Lambda$ab$gWIwMl_uYHYejR8gVGg7CUA8tuw.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final String f10975b;

    /* renamed from: c  reason: collision with root package name */
    public final f f10976c;

    /* renamed from: d  reason: collision with root package name */
    public final e f10977d;

    /* renamed from: e  reason: collision with root package name */
    public final ac f10978e;

    /* renamed from: f  reason: collision with root package name */
    public final c f10979f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f10980a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f10981b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10980a.equals(aVar.f10980a) && ai.a(this.f10981b, aVar.f10981b);
        }

        public int hashCode() {
            int hashCode = this.f10980a.hashCode() * 31;
            Object obj = this.f10981b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f10982a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f10983b;

        /* renamed from: c  reason: collision with root package name */
        private String f10984c;

        /* renamed from: d  reason: collision with root package name */
        private long f10985d;

        /* renamed from: e  reason: collision with root package name */
        private long f10986e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10987f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10988g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10989h;
        private d.a i;
        private List<Object> j;
        private String k;
        private List<Object> l;
        private a m;
        private Object n;
        private ac o;
        private e.a p;

        public b() {
            this.f10986e = Long.MIN_VALUE;
            this.i = new d.a();
            this.j = Collections.emptyList();
            this.l = Collections.emptyList();
            this.p = new e.a();
        }

        private b(ab abVar) {
            this();
            this.f10986e = abVar.f10979f.f10992b;
            this.f10987f = abVar.f10979f.f10993c;
            this.f10988g = abVar.f10979f.f10994d;
            this.f10985d = abVar.f10979f.f10991a;
            this.f10989h = abVar.f10979f.f10995e;
            this.f10982a = abVar.f10975b;
            this.o = abVar.f10978e;
            this.p = abVar.f10977d.a();
            f fVar = abVar.f10976c;
            if (fVar != null) {
                this.k = fVar.f11029f;
                this.f10984c = fVar.f11025b;
                this.f10983b = fVar.f11024a;
                this.j = fVar.f11028e;
                this.l = fVar.f11030g;
                this.n = fVar.f11031h;
                this.i = fVar.f11026c != null ? fVar.f11026c.b() : new d.a();
                this.m = fVar.f11027d;
            }
        }

        public b a(Uri uri) {
            this.f10983b = uri;
            return this;
        }

        public b a(Object obj) {
            this.n = obj;
            return this;
        }

        public b a(String str) {
            this.f10982a = (String) com.applovin.exoplayer2.l.a.b(str);
            return this;
        }

        public ab a() {
            f fVar;
            com.applovin.exoplayer2.l.a.b(this.i.f11005b == null || this.i.f11004a != null);
            Uri uri = this.f10983b;
            d dVar = null;
            if (uri != null) {
                String str = this.f10984c;
                if (this.i.f11004a != null) {
                    dVar = this.i.a();
                }
                fVar = new f(uri, str, dVar, this.m, this.j, this.k, this.l, this.n);
            } else {
                fVar = null;
            }
            String str2 = this.f10982a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            c cVar = new c(this.f10985d, this.f10986e, this.f10987f, this.f10988g, this.f10989h);
            e a2 = this.p.a();
            ac acVar = this.o;
            if (acVar == null) {
                acVar = ac.f11032a;
            }
            return new ab(str3, cVar, fVar, a2, acVar);
        }

        public b b(String str) {
            this.k = str;
            return this;
        }
    }

    public static final class c implements g {

        /* renamed from: f  reason: collision with root package name */
        public static final g.a<c> f10990f = $$Lambda$ab$c$Dx1vSveCvdPBzi65xKGhCZqqXg.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final long f10991a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10992b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10993c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10994d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f10995e;

        private c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f10991a = j;
            this.f10992b = j2;
            this.f10993c = z;
            this.f10994d = z2;
            this.f10995e = z3;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ c a(Bundle bundle) {
            return new c(bundle.getLong(a(0), 0), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10991a == cVar.f10991a && this.f10992b == cVar.f10992b && this.f10993c == cVar.f10993c && this.f10994d == cVar.f10994d && this.f10995e == cVar.f10995e;
        }

        public int hashCode() {
            long j = this.f10991a;
            long j2 = this.f10992b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f10993c ? 1 : 0)) * 31) + (this.f10994d ? 1 : 0)) * 31) + (this.f10995e ? 1 : 0);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f10996a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f10997b;

        /* renamed from: c  reason: collision with root package name */
        public final u<String, String> f10998c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10999d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11000e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f11001f;

        /* renamed from: g  reason: collision with root package name */
        public final s<Integer> f11002g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f11003h;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f11004a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f11005b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public u<String, String> f11006c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f11007d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f11008e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f11009f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public s<Integer> f11010g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f11011h;

            @Deprecated
            private a() {
                this.f11006c = u.a();
                this.f11010g = s.g();
            }

            private a(d dVar) {
                this.f11004a = dVar.f10996a;
                this.f11005b = dVar.f10997b;
                this.f11006c = dVar.f10998c;
                this.f11007d = dVar.f10999d;
                this.f11008e = dVar.f11000e;
                this.f11009f = dVar.f11001f;
                this.f11010g = dVar.f11002g;
                this.f11011h = dVar.f11003h;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            com.applovin.exoplayer2.l.a.b(!aVar.f11009f || aVar.f11005b != null);
            this.f10996a = (UUID) com.applovin.exoplayer2.l.a.b(aVar.f11004a);
            this.f10997b = aVar.f11005b;
            this.f10998c = aVar.f11006c;
            this.f10999d = aVar.f11007d;
            this.f11001f = aVar.f11009f;
            this.f11000e = aVar.f11008e;
            this.f11002g = aVar.f11010g;
            this.f11003h = aVar.f11011h != null ? Arrays.copyOf(aVar.f11011h, aVar.f11011h.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.f11003h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10996a.equals(dVar.f10996a) && ai.a((Object) this.f10997b, (Object) dVar.f10997b) && ai.a((Object) this.f10998c, (Object) dVar.f10998c) && this.f10999d == dVar.f10999d && this.f11001f == dVar.f11001f && this.f11000e == dVar.f11000e && this.f11002g.equals(dVar.f11002g) && Arrays.equals(this.f11003h, dVar.f11003h);
        }

        public int hashCode() {
            int hashCode = this.f10996a.hashCode() * 31;
            Uri uri = this.f10997b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f10998c.hashCode()) * 31) + (this.f10999d ? 1 : 0)) * 31) + (this.f11001f ? 1 : 0)) * 31) + (this.f11000e ? 1 : 0)) * 31) + this.f11002g.hashCode()) * 31) + Arrays.hashCode(this.f11003h);
        }
    }

    public static final class e implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11012a = new a().a();

        /* renamed from: g  reason: collision with root package name */
        public static final g.a<e> f11013g = $$Lambda$ab$e$jTWWN0THvrW8sUCs0sI5CCG5dA.INSTANCE;

        /* renamed from: b  reason: collision with root package name */
        public final long f11014b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11015c;

        /* renamed from: d  reason: collision with root package name */
        public final long f11016d;

        /* renamed from: e  reason: collision with root package name */
        public final float f11017e;

        /* renamed from: f  reason: collision with root package name */
        public final float f11018f;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f11019a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f11020b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f11021c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f11022d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f11023e;

            public a() {
                this.f11019a = -9223372036854775807L;
                this.f11020b = -9223372036854775807L;
                this.f11021c = -9223372036854775807L;
                this.f11022d = -3.4028235E38f;
                this.f11023e = -3.4028235E38f;
            }

            private a(e eVar) {
                this.f11019a = eVar.f11014b;
                this.f11020b = eVar.f11015c;
                this.f11021c = eVar.f11016d;
                this.f11022d = eVar.f11017e;
                this.f11023e = eVar.f11018f;
            }

            public e a() {
                return new e(this);
            }
        }

        @Deprecated
        public e(long j, long j2, long j3, float f2, float f3) {
            this.f11014b = j;
            this.f11015c = j2;
            this.f11016d = j3;
            this.f11017e = f2;
            this.f11018f = f3;
        }

        private e(a aVar) {
            this(aVar.f11019a, aVar.f11020b, aVar.f11021c, aVar.f11022d, aVar.f11023e);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ e a(Bundle bundle) {
            return new e(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11014b == eVar.f11014b && this.f11015c == eVar.f11015c && this.f11016d == eVar.f11016d && this.f11017e == eVar.f11017e && this.f11018f == eVar.f11018f;
        }

        public int hashCode() {
            long j = this.f11014b;
            long j2 = this.f11015c;
            long j3 = this.f11016d;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f2 = this.f11017e;
            int i2 = 0;
            int floatToIntBits = (i + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f11018f;
            if (f3 != 0.0f) {
                i2 = Float.floatToIntBits(f3);
            }
            return floatToIntBits + i2;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f11024a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11025b;

        /* renamed from: c  reason: collision with root package name */
        public final d f11026c;

        /* renamed from: d  reason: collision with root package name */
        public final a f11027d;

        /* renamed from: e  reason: collision with root package name */
        public final List<Object> f11028e;

        /* renamed from: f  reason: collision with root package name */
        public final String f11029f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Object> f11030g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f11031h;

        private f(Uri uri, String str, d dVar, a aVar, List<Object> list, String str2, List<Object> list2, Object obj) {
            this.f11024a = uri;
            this.f11025b = str;
            this.f11026c = dVar;
            this.f11027d = aVar;
            this.f11028e = list;
            this.f11029f = str2;
            this.f11030g = list2;
            this.f11031h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f11024a.equals(fVar.f11024a) && ai.a((Object) this.f11025b, (Object) fVar.f11025b) && ai.a((Object) this.f11026c, (Object) fVar.f11026c) && ai.a((Object) this.f11027d, (Object) fVar.f11027d) && this.f11028e.equals(fVar.f11028e) && ai.a((Object) this.f11029f, (Object) fVar.f11029f) && this.f11030g.equals(fVar.f11030g) && ai.a(this.f11031h, fVar.f11031h);
        }

        public int hashCode() {
            int hashCode = this.f11024a.hashCode() * 31;
            String str = this.f11025b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f11026c;
            int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            a aVar = this.f11027d;
            int hashCode4 = (((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f11028e.hashCode()) * 31;
            String str2 = this.f11029f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f11030g.hashCode()) * 31;
            Object obj = this.f11031h;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode5 + i;
        }
    }

    private ab(String str, c cVar, f fVar, e eVar, ac acVar) {
        this.f10975b = str;
        this.f10976c = fVar;
        this.f10977d = eVar;
        this.f10978e = acVar;
        this.f10979f = cVar;
    }

    public static ab a(Uri uri) {
        return new b().a(uri).a();
    }

    /* access modifiers changed from: private */
    public static ab a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = (String) com.applovin.exoplayer2.l.a.b(bundle2.getString(a(0), ""));
        Bundle bundle3 = bundle2.getBundle(a(1));
        e fromBundle = bundle3 == null ? e.f11012a : e.f11013g.fromBundle(bundle3);
        Bundle bundle4 = bundle2.getBundle(a(2));
        ac fromBundle2 = bundle4 == null ? ac.f11032a : ac.H.fromBundle(bundle4);
        Bundle bundle5 = bundle2.getBundle(a(3));
        return new ab(str, bundle5 == null ? new c(0, Long.MIN_VALUE, false, false, false) : c.f10990f.fromBundle(bundle5), (f) null, fromBundle, fromBundle2);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return ai.a((Object) this.f10975b, (Object) abVar.f10975b) && this.f10979f.equals(abVar.f10979f) && ai.a((Object) this.f10976c, (Object) abVar.f10976c) && ai.a((Object) this.f10977d, (Object) abVar.f10977d) && ai.a((Object) this.f10978e, (Object) abVar.f10978e);
    }

    public int hashCode() {
        int hashCode = this.f10975b.hashCode() * 31;
        f fVar = this.f10976c;
        return ((((((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f10977d.hashCode()) * 31) + this.f10979f.hashCode()) * 31) + this.f10978e.hashCode();
    }
}
