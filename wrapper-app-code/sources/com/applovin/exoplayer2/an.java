package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.l.m;
import com.applovin.exoplayer2.m.o;
import java.util.ArrayList;
import java.util.List;

public interface an {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11109a = new C0105a().a();

        /* renamed from: b  reason: collision with root package name */
        public static final g.a<a> f11110b = $$Lambda$an$a$OfLfeSHfSoDCSrP0eAdygVutcA.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final m f11111c;

        /* renamed from: com.applovin.exoplayer2.an$a$a  reason: collision with other inner class name */
        public static final class C0105a {

            /* renamed from: a  reason: collision with root package name */
            private static final int[] f11112a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: b  reason: collision with root package name */
            private final m.a f11113b = new m.a();

            public C0105a a(int i) {
                this.f11113b.a(i);
                return this;
            }

            public C0105a a(int i, boolean z) {
                this.f11113b.a(i, z);
                return this;
            }

            public C0105a a(a aVar) {
                this.f11113b.a(aVar.f11111c);
                return this;
            }

            public C0105a a(int... iArr) {
                this.f11113b.a(iArr);
                return this;
            }

            public a a() {
                return new a(this.f11113b.a());
            }
        }

        private a(m mVar) {
            this.f11111c = mVar;
        }

        /* access modifiers changed from: private */
        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f11109a;
            }
            C0105a aVar = new C0105a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return aVar.a();
        }

        private static String b(int i) {
            return Integer.toString(i, 36);
        }

        public boolean a(int i) {
            return this.f11111c.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f11111c.equals(((a) obj).f11111c);
        }

        public int hashCode() {
            return this.f11111c.hashCode();
        }
    }

    @Deprecated
    public interface b {

        /* renamed from: com.applovin.exoplayer2.an$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(b bVar, ab abVar, int i) {
            }

            public static void $default$a(b bVar, ac acVar) {
            }

            public static void $default$a(b bVar, ak akVar) {
            }

            public static void $default$a(b bVar, am amVar) {
            }

            public static void $default$a(b bVar, a aVar) {
            }

            public static void $default$a(b bVar, e eVar, e eVar2, int i) {
            }

            public static void $default$a(b bVar, an anVar, c cVar) {
            }

            public static void $default$a(b bVar, ba baVar, int i) {
            }

            public static void $default$a(b bVar, ad adVar, h hVar) {
            }

            @Deprecated
            public static void $default$a(b bVar, boolean z, int i) {
            }

            @Deprecated
            public static void $default$b(b bVar) {
            }

            public static void $default$b(b bVar, int i) {
            }

            public static void $default$b(b bVar, ak akVar) {
            }

            public static void $default$b(b bVar, boolean z, int i) {
            }

            public static void $default$b_(b bVar, boolean z) {
            }

            public static void $default$c(b bVar, int i) {
            }

            @Deprecated
            public static void $default$c(b bVar, boolean z) {
            }

            public static void $default$d(b bVar, int i) {
            }

            public static void $default$d(b bVar, boolean z) {
            }

            @Deprecated
            public static void $default$e(b bVar, int i) {
            }

            public static void $default$e(b bVar, boolean z) {
            }
        }

        void a(ab abVar, int i);

        void a(ac acVar);

        void a(ak akVar);

        void a(am amVar);

        void a(a aVar);

        void a(e eVar, e eVar2, int i);

        void a(an anVar, c cVar);

        void a(ba baVar, int i);

        void a(ad adVar, h hVar);

        @Deprecated
        void a(boolean z, int i);

        @Deprecated
        void b();

        void b(int i);

        void b(ak akVar);

        void b(boolean z, int i);

        void b_(boolean z);

        void c(int i);

        @Deprecated
        void c(boolean z);

        void d(int i);

        void d(boolean z);

        @Deprecated
        void e(int i);

        void e(boolean z);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final m f11114a;

        public c(m mVar) {
            this.f11114a = mVar;
        }

        public boolean a(int i) {
            return this.f11114a.a(i);
        }

        public boolean a(int... iArr) {
            return this.f11114a.a(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f11114a.equals(((c) obj).f11114a);
        }

        public int hashCode() {
            return this.f11114a.hashCode();
        }
    }

    public interface d extends b {

        /* renamed from: com.applovin.exoplayer2.an$d$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(d dVar) {
            }

            public static void $default$a(d dVar, float f2) {
            }

            public static void $default$a(d dVar, int i, int i2) {
            }

            public static void $default$a(d dVar, int i, boolean z) {
            }

            public static void $default$a(d dVar, ab abVar, int i) {
            }

            public static void $default$a(d dVar, ac acVar) {
            }

            public static void $default$a(d dVar, ak akVar) {
            }

            public static void $default$a(d dVar, am amVar) {
            }

            public static void $default$a(d dVar, a aVar) {
            }

            public static void $default$a(d dVar, e eVar, e eVar2, int i) {
            }

            public static void $default$a(d dVar, an anVar, c cVar) {
            }

            public static void $default$a(d dVar, ba baVar, int i) {
            }

            public static void $default$a(d dVar, com.applovin.exoplayer2.g.a aVar) {
            }

            public static void $default$a(d dVar, ad adVar, h hVar) {
            }

            public static void $default$a(d dVar, o oVar) {
            }

            public static void $default$a(d dVar, o oVar) {
            }

            public static void $default$a(d dVar, List list) {
            }

            public static void $default$a_(d dVar, boolean z) {
            }

            public static void $default$b(d dVar, int i) {
            }

            public static void $default$b(d dVar, ak akVar) {
            }

            public static void $default$b(d dVar, boolean z, int i) {
            }

            public static void $default$b_(d dVar, boolean z) {
            }

            public static void $default$c(d dVar, int i) {
            }

            public static void $default$d(d dVar, int i) {
            }

            public static void $default$d(d dVar, boolean z) {
            }

            public static void $default$e(d dVar, boolean z) {
            }
        }

        void a();

        void a(float f2);

        void a(int i, int i2);

        void a(int i, boolean z);

        void a(ab abVar, int i);

        void a(ac acVar);

        void a(ak akVar);

        void a(am amVar);

        void a(a aVar);

        void a(e eVar, e eVar2, int i);

        void a(an anVar, c cVar);

        void a(ba baVar, int i);

        void a(com.applovin.exoplayer2.g.a aVar);

        void a(ad adVar, h hVar);

        void a(o oVar);

        void a(o oVar);

        void a(List<com.applovin.exoplayer2.i.a> list);

        void a_(boolean z);

        void b(int i);

        void b(ak akVar);

        void b(boolean z, int i);

        void b_(boolean z);

        void c(int i);

        void d(int i);

        void d(boolean z);

        void e(boolean z);
    }

    public static final class e implements g {
        public static final g.a<e> j = $$Lambda$an$e$0Gu71CpUse6ty3YCMnk1QoxtJRE.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final Object f11115a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11116b;

        /* renamed from: c  reason: collision with root package name */
        public final ab f11117c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f11118d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11119e;

        /* renamed from: f  reason: collision with root package name */
        public final long f11120f;

        /* renamed from: g  reason: collision with root package name */
        public final long f11121g;

        /* renamed from: h  reason: collision with root package name */
        public final int f11122h;
        public final int i;

        public e(Object obj, int i2, ab abVar, Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f11115a = obj;
            this.f11116b = i2;
            this.f11117c = abVar;
            this.f11118d = obj2;
            this.f11119e = i3;
            this.f11120f = j2;
            this.f11121g = j3;
            this.f11122h = i4;
            this.i = i5;
        }

        /* access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e((Object) null, bundle.getInt(a(0), -1), (ab) com.applovin.exoplayer2.l.c.a(ab.f10974g, bundle.getBundle(a(1))), (Object) null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11116b == eVar.f11116b && this.f11119e == eVar.f11119e && this.f11120f == eVar.f11120f && this.f11121g == eVar.f11121g && this.f11122h == eVar.f11122h && this.i == eVar.i && Objects.equal(this.f11115a, eVar.f11115a) && Objects.equal(this.f11118d, eVar.f11118d) && Objects.equal(this.f11117c, eVar.f11117c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f11115a, Integer.valueOf(this.f11116b), this.f11117c, this.f11118d, Integer.valueOf(this.f11119e), Integer.valueOf(this.f11116b), Long.valueOf(this.f11120f), Long.valueOf(this.f11121g), Integer.valueOf(this.f11122h), Integer.valueOf(this.i));
        }
    }

    long A();

    long B();

    long C();

    am D();

    int F();

    int G();

    long H();

    long I();

    long J();

    boolean K();

    int L();

    int M();

    long N();

    long O();

    ad P();

    h Q();

    ac R();

    ba S();

    o T();

    List<com.applovin.exoplayer2.i.a> V();

    void a(int i, long j);

    void a(long j);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(d dVar);

    void a(boolean z);

    boolean a();

    boolean a(int i);

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(d dVar);

    void b(boolean z);

    void c();

    void c(int i);

    void d();

    ak e();

    void g();

    void j();

    boolean o();

    Looper r();

    a s();

    int t();

    int u();

    void w();

    boolean x();

    int y();

    boolean z();
}
