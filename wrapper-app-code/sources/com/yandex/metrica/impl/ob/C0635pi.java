package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C0659qi;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.pi  reason: case insensitive filesystem */
public final class C0635pi {
    private final C0311ci A;
    private final Zh B;
    private final RetryPolicyConfig C;
    private final C0754ui D;
    private final long E;
    private final long F;
    private final boolean G;
    private final C0805wl H;
    private final C0439hl I;
    private final C0439hl J;
    private final C0439hl K;
    private final C0442i L;
    private final Ph M;
    private final C0674ra N;
    private final List<String> O;
    private final Oh P;
    private final Uh Q;
    private final C0706si R;
    private final Map<String, Object> S;
    private final String T;
    private final String U;
    /* access modifiers changed from: private */
    public final C0659qi V;

    /* renamed from: a  reason: collision with root package name */
    private final String f6461a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f6462b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f6463c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f6464d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f6465e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f6466f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f6467g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, List<String>> f6468h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final Sh p;
    private final List<C0604oc> q;
    private final C0336di r;
    private final long s;
    private final boolean t;
    private final boolean u;
    private final List<C0286bi> v;
    private final String w;
    private final C0730ti x;
    private final C0261ai y;
    private final List<Bd> z;

    /* renamed from: com.yandex.metrica.impl.ob.pi$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6469a;

        /* renamed from: b  reason: collision with root package name */
        private String f6470b;

        /* renamed from: c  reason: collision with root package name */
        private final C0659qi.b f6471c;

        public a(C0659qi.b bVar) {
            this.f6471c = bVar;
        }

        public final a a(List<String> list) {
            this.f6471c.l = list;
            return this;
        }

        public final a b(List<String> list) {
            this.f6471c.k = list;
            return this;
        }

        public final a c(String str) {
            this.f6469a = str;
            return this;
        }

        public final a d(String str) {
            this.f6470b = str;
            return this;
        }

        public final a e(List<String> list) {
            this.f6471c.i = list;
            return this;
        }

        public final a f(List<String> list) {
            this.f6471c.Q = list;
            return this;
        }

        public final a g(List<String> list) {
            this.f6471c.m = list;
            return this;
        }

        public final a h(String str) {
            this.f6471c.p = str;
            return this;
        }

        public final a i(List<String> list) {
            this.f6471c.f6657d = list;
            return this;
        }

        public final a j(String str) {
            this.f6471c.f6660g = str;
            return this;
        }

        public final a k(String str) {
            this.f6471c.f6654a = str;
            return this;
        }

        public final a c(List<String> list) {
            this.f6471c.j = list;
            return this;
        }

        public final a d(List<? extends C0604oc> list) {
            this.f6471c.s = list;
            return this;
        }

        public final a a(Map<String, ? extends List<String>> map) {
            this.f6471c.n = map;
            return this;
        }

        public final a b(long j) {
            this.f6471c.b(j);
            return this;
        }

        public final a e(String str) {
            this.f6471c.o = str;
            return this;
        }

        public final a f(String str) {
            this.f6471c.f6658e = str;
            return this;
        }

        public final a g(String str) {
            this.f6471c.q = str;
            return this;
        }

        public final a h(List<? extends Bd> list) {
            this.f6471c.h((List<Bd>) list);
            return this;
        }

        public final a i(String str) {
            this.f6471c.f6659f = str;
            return this;
        }

        public final a j(List<? extends C0286bi> list) {
            this.f6471c.j((List<C0286bi>) list);
            return this;
        }

        public final a b(boolean z) {
            this.f6471c.F = z;
            return this;
        }

        public final a c(long j) {
            this.f6471c.v = j;
            return this;
        }

        public final a a(String str) {
            this.f6471c.f6661h = str;
            return this;
        }

        public final a b(String str) {
            this.f6471c.b(str);
            return this;
        }

        public final a c(boolean z) {
            this.f6471c.x = z;
            return this;
        }

        public final a a(C0336di diVar) {
            this.f6471c.t = diVar;
            return this;
        }

        public final a b(C0439hl hlVar) {
            this.f6471c.K = hlVar;
            return this;
        }

        public final a c(C0439hl hlVar) {
            this.f6471c.L = hlVar;
            return this;
        }

        public final a a(long j) {
            this.f6471c.a(j);
            return this;
        }

        public final a b(Map<String, ? extends Object> map) {
            this.f6471c.b((Map<String, Object>) map);
            return this;
        }

        public final a a(boolean z) {
            this.f6471c.w = z;
            return this;
        }

        public final a a(C0730ti tiVar) {
            this.f6471c.C = tiVar;
            return this;
        }

        public final a a(C0261ai aiVar) {
            this.f6471c.u = aiVar;
            return this;
        }

        public final a a(C0311ci ciVar) {
            this.f6471c.a(ciVar);
            return this;
        }

        public final a a(Zh zh) {
            this.f6471c.a(zh);
            return this;
        }

        public final a a(RetryPolicyConfig retryPolicyConfig) {
            this.f6471c.H = retryPolicyConfig;
            return this;
        }

        public final a a(C0754ui uiVar) {
            this.f6471c.I = uiVar;
            return this;
        }

        public final a a(C0805wl wlVar) {
            this.f6471c.J = wlVar;
            return this;
        }

        public final a a(C0439hl hlVar) {
            this.f6471c.M = hlVar;
            return this;
        }

        public final a a(C0442i iVar) {
            this.f6471c.N = iVar;
            return this;
        }

        public final a a(Ph ph) {
            this.f6471c.O = ph;
            return this;
        }

        public final a a(C0674ra raVar) {
            this.f6471c.P = raVar;
            return this;
        }

        public final a a(Oh oh) {
            this.f6471c.R = oh;
            return this;
        }

        public final a a(C0784w0 w0Var) {
            this.f6471c.S = w0Var;
            return this;
        }

        public final a a(Uh uh) {
            this.f6471c.T = uh;
            return this;
        }

        public final a a(C0706si siVar) {
            this.f6471c.a(siVar);
            return this;
        }

        public final C0635pi a() {
            String str = this.f6469a;
            String str2 = this.f6470b;
            C0659qi a2 = this.f6471c.a();
            Intrinsics.checkNotNullExpressionValue(a2, "modelBuilder.build()");
            return new C0635pi(str, str2, a2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pi$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6472a;

        /* renamed from: b  reason: collision with root package name */
        private final C0251a8 f6473b;

        public b(ProtobufStateStorage<C0659qi> protobufStateStorage, C0251a8 a8Var) {
            this.f6472a = protobufStateStorage;
            this.f6473b = a8Var;
        }

        public final C0635pi a() {
            String a2 = this.f6473b.a();
            String b2 = this.f6473b.b();
            Object read = this.f6472a.read();
            Intrinsics.checkNotNullExpressionValue(read, "modelStorage.read()");
            return new C0635pi(a2, b2, (C0659qi) read, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r3) {
            /*
                r2 = this;
                java.lang.Class<com.yandex.metrica.impl.ob.qi> r0 = com.yandex.metrica.impl.ob.C0659qi.class
                com.yandex.metrica.impl.ob.fa r0 = com.yandex.metrica.impl.ob.C0378fa.b.a(r0)
                com.yandex.metrica.core.api.ProtobufStateStorage r3 = r0.a(r3)
                java.lang.String r0 = "StorageFactory.Provider.…ass.java).create(context)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
                com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.ob.F0.g()
                java.lang.String r1 = "GlobalServiceLocator.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.yandex.metrica.impl.ob.e8 r0 = r0.w()
                com.yandex.metrica.impl.ob.a8 r0 = r0.a()
                r2.<init>(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0635pi.b.<init>(android.content.Context):void");
        }

        public final void a(C0635pi piVar) {
            this.f6473b.a(piVar.i());
            this.f6473b.b(piVar.j());
            this.f6472a.save(piVar.V);
        }
    }

    private C0635pi(String str, String str2, C0659qi qiVar) {
        this.T = str;
        this.U = str2;
        this.V = qiVar;
        this.f6461a = qiVar.f6646a;
        this.f6462b = qiVar.f6649d;
        this.f6463c = qiVar.i;
        this.f6464d = qiVar.j;
        this.f6465e = qiVar.k;
        this.f6466f = qiVar.l;
        this.f6467g = qiVar.m;
        this.f6468h = qiVar.n;
        this.i = qiVar.f6650e;
        this.j = qiVar.f6651f;
        this.k = qiVar.f6652g;
        this.l = qiVar.f6653h;
        this.m = qiVar.o;
        this.n = qiVar.p;
        this.o = qiVar.q;
        Sh sh = qiVar.r;
        Intrinsics.checkNotNullExpressionValue(sh, "startupStateModel.collectingFlags");
        this.p = sh;
        List<C0604oc> list = qiVar.s;
        Intrinsics.checkNotNullExpressionValue(list, "startupStateModel.locationCollectionConfigs");
        this.q = list;
        this.r = qiVar.t;
        this.s = qiVar.u;
        this.t = qiVar.v;
        this.u = qiVar.w;
        this.v = qiVar.x;
        this.w = qiVar.y;
        this.x = qiVar.z;
        this.y = qiVar.A;
        this.z = qiVar.B;
        this.A = qiVar.C;
        this.B = qiVar.D;
        RetryPolicyConfig retryPolicyConfig = qiVar.E;
        Intrinsics.checkNotNullExpressionValue(retryPolicyConfig, "startupStateModel.retryPolicyConfig");
        this.C = retryPolicyConfig;
        this.D = qiVar.F;
        this.E = qiVar.G;
        this.F = qiVar.H;
        this.G = qiVar.I;
        this.H = qiVar.J;
        this.I = qiVar.K;
        this.J = qiVar.L;
        this.K = qiVar.M;
        this.L = qiVar.N;
        this.M = qiVar.O;
        C0674ra raVar = qiVar.P;
        Intrinsics.checkNotNullExpressionValue(raVar, "startupStateModel.diagnosticsConfigsHolder");
        this.N = raVar;
        List<String> list2 = qiVar.Q;
        Intrinsics.checkNotNullExpressionValue(list2, "startupStateModel.mediascopeApiKeys");
        this.O = list2;
        this.P = qiVar.R;
        Intrinsics.checkNotNullExpressionValue(qiVar.S, "startupStateModel.easyCollectingConfig");
        this.Q = qiVar.T;
        C0706si siVar = qiVar.U;
        Intrinsics.checkNotNullExpressionValue(siVar, "startupStateModel.startupUpdateConfig");
        this.R = siVar;
        Map<String, Object> map = qiVar.V;
        Intrinsics.checkNotNullExpressionValue(map, "startupStateModel.modulesRemoteConfigs");
        this.S = map;
    }

    public final Map<String, Object> A() {
        return this.S;
    }

    public final long B() {
        return this.E;
    }

    public final long C() {
        return this.s;
    }

    public final boolean D() {
        return this.G;
    }

    public final List<Bd> E() {
        return this.z;
    }

    public final C0261ai F() {
        return this.y;
    }

    public final String G() {
        return this.j;
    }

    public final List<String> H() {
        return this.f6462b;
    }

    public final List<C0286bi> I() {
        return this.v;
    }

    public final RetryPolicyConfig J() {
        return this.C;
    }

    public final C0311ci K() {
        return this.A;
    }

    public final String L() {
        return this.k;
    }

    public final C0336di M() {
        return this.r;
    }

    public final boolean N() {
        return this.u;
    }

    public final C0706si O() {
        return this.R;
    }

    public final C0730ti P() {
        return this.x;
    }

    public final C0754ui Q() {
        return this.D;
    }

    public final C0439hl R() {
        return this.K;
    }

    public final C0439hl S() {
        return this.I;
    }

    public final C0805wl T() {
        return this.H;
    }

    public final C0439hl U() {
        return this.J;
    }

    public final String V() {
        return this.f6461a;
    }

    public final Oh b() {
        return this.P;
    }

    public final C0442i c() {
        return this.L;
    }

    public final Ph d() {
        return this.M;
    }

    public final String e() {
        return this.l;
    }

    public final Sh f() {
        return this.p;
    }

    public final String g() {
        return this.w;
    }

    public final Map<String, List<String>> h() {
        return this.f6468h;
    }

    public final String i() {
        return this.T;
    }

    public final String j() {
        return this.U;
    }

    public final List<String> k() {
        return this.f6466f;
    }

    public final C0674ra l() {
        return this.N;
    }

    public final Uh m() {
        return this.Q;
    }

    public final String n() {
        return this.m;
    }

    public final long o() {
        return this.F;
    }

    public final String p() {
        return this.i;
    }

    public final boolean q() {
        return this.t;
    }

    public final List<String> r() {
        return this.f6465e;
    }

    public final List<String> s() {
        return this.f6464d;
    }

    public final Zh t() {
        return this.B;
    }

    public String toString() {
        return "StartupState(deviceId=" + this.T + ", deviceIdHash=" + this.U + ", startupStateModel=" + this.V + ')';
    }

    public final String u() {
        return this.o;
    }

    public final String v() {
        return this.n;
    }

    public final List<C0604oc> w() {
        return this.q;
    }

    public final List<String> x() {
        return this.f6463c;
    }

    public final List<String> y() {
        return this.O;
    }

    public final List<String> z() {
        return this.f6467g;
    }

    public final a a() {
        Sh sh = this.V.r;
        Intrinsics.checkNotNullExpressionValue(sh, "startupStateModel.collectingFlags");
        C0659qi.b a2 = this.V.a(sh);
        Intrinsics.checkNotNullExpressionValue(a2, "startupStateModel.buildUpon(collectingFlags)");
        return new a(a2).c(this.T).d(this.U);
    }

    public /* synthetic */ C0635pi(String str, String str2, C0659qi qiVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, qiVar);
    }
}
