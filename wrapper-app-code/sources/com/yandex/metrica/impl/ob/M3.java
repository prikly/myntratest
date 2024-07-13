package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0247a4;
import com.yandex.metrica.impl.ob.C0274b6;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.K3;
import com.yandex.metrica.impl.ob.Lg;
import java.util.List;

class M3 {

    /* renamed from: a  reason: collision with root package name */
    private final b f4523a;

    /* renamed from: b  reason: collision with root package name */
    private final c f4524b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f4525c;

    /* renamed from: d  reason: collision with root package name */
    private final I3 f4526d;

    /* renamed from: e  reason: collision with root package name */
    private final D3.a f4527e;

    /* renamed from: f  reason: collision with root package name */
    private final C0778vi f4528f;

    /* renamed from: g  reason: collision with root package name */
    protected final C0635pi f4529g;

    /* renamed from: h  reason: collision with root package name */
    private final Lg.e f4530h;
    private final Dm i;
    private final ICommonExecutor j;
    private final C0369f1 k;
    private final int l;

    class a implements C0247a4.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ S1 f4531a;

        a(M3 m3, S1 s1) {
            this.f4531a = s1;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f4532a;

        b(String str) {
            this.f4532a = str;
        }

        /* access modifiers changed from: package-private */
        public Sl a() {
            return Ul.a(this.f4532a);
        }

        /* access modifiers changed from: package-private */
        public C0315cm b() {
            return Ul.b(this.f4532a);
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final I3 f4533a;

        /* renamed from: b  reason: collision with root package name */
        private final C0477ja f4534b;

        c(Context context, I3 i3) {
            this(i3, C0477ja.a(context));
        }

        /* access modifiers changed from: package-private */
        public C0302c9 a() {
            return new C0302c9(this.f4534b.b(this.f4533a));
        }

        /* access modifiers changed from: package-private */
        public C0252a9 b() {
            return new C0252a9(this.f4534b.b(this.f4533a));
        }

        c(I3 i3, C0477ja jaVar) {
            this.f4533a = i3;
            this.f4534b = jaVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    M3(android.content.Context r14, com.yandex.metrica.impl.ob.I3 r15, com.yandex.metrica.impl.ob.D3.a r16, com.yandex.metrica.impl.ob.C0778vi r17, com.yandex.metrica.impl.ob.C0635pi r18, com.yandex.metrica.impl.ob.Lg.e r19, com.yandex.metrica.core.api.executors.ICommonExecutor r20, int r21, com.yandex.metrica.impl.ob.C0369f1 r22) {
        /*
            r13 = this;
            com.yandex.metrica.impl.ob.Dm r8 = new com.yandex.metrica.impl.ob.Dm
            r8.<init>()
            com.yandex.metrica.impl.ob.M3$b r10 = new com.yandex.metrica.impl.ob.M3$b
            r3 = r16
            java.lang.String r0 = r3.f3853d
            r10.<init>(r0)
            com.yandex.metrica.impl.ob.M3$c r11 = new com.yandex.metrica.impl.ob.M3$c
            r1 = r14
            r2 = r15
            r11.<init>((android.content.Context) r14, (com.yandex.metrica.impl.ob.I3) r15)
            r0 = r13
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.M3.<init>(android.content.Context, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3$a, com.yandex.metrica.impl.ob.vi, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Lg$e, com.yandex.metrica.core.api.executors.ICommonExecutor, int, com.yandex.metrica.impl.ob.f1):void");
    }

    /* access modifiers changed from: package-private */
    public M5 a() {
        return new M5(this.f4525c, this.f4526d, this.l);
    }

    /* access modifiers changed from: package-private */
    public L7 b(L3 l3) {
        return new L7(l3, C0477ja.a(this.f4525c).c(this.f4526d), new K7(l3.s()));
    }

    /* access modifiers changed from: package-private */
    public b c() {
        return this.f4523a;
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f4524b;
    }

    /* access modifiers changed from: package-private */
    public S1<L3> e(L3 l3) {
        S1<L3> s1 = new S1<>(l3, this.f4528f.a(), this.j);
        this.k.a(s1);
        return s1;
    }

    M3(Context context, I3 i3, D3.a aVar, C0778vi viVar, C0635pi piVar, Lg.e eVar, ICommonExecutor iCommonExecutor, Dm dm, int i2, b bVar, c cVar, C0369f1 f1Var) {
        this.f4525c = context;
        this.f4526d = i3;
        this.f4527e = aVar;
        this.f4528f = viVar;
        this.f4529g = piVar;
        this.f4530h = eVar;
        this.j = iCommonExecutor;
        this.i = dm;
        this.l = i2;
        this.f4523a = bVar;
        this.f4524b = cVar;
        this.k = f1Var;
    }

    /* access modifiers changed from: package-private */
    public Z3 a(L3 l3) {
        return new Z3(new Lg.c(l3, this.f4530h), this.f4529g, new Lg.a(this.f4527e));
    }

    /* access modifiers changed from: package-private */
    public I4 c(L3 l3) {
        return new I4(l3);
    }

    /* access modifiers changed from: package-private */
    public K3.b d(L3 l3) {
        return new K3.b(l3);
    }

    /* access modifiers changed from: package-private */
    public C0274b6 a(L3 l3, C0276b8 b8Var, C0274b6.a aVar) {
        return new C0274b6(l3, new C0249a6(b8Var), aVar);
    }

    /* access modifiers changed from: package-private */
    public C0247a4 a(C0302c9 c9Var, C0276b8 b8Var, C0274b6 b6Var, L7 l7, C0687s sVar, C0424h6 h6Var, S1 s1) {
        C0276b8 b8Var2 = b8Var;
        return new C0247a4(c9Var, b8Var2, b6Var, l7, sVar, this.i, h6Var, this.l, new a(this, s1), new O3(b8Var2, new Y8(b8Var2)), new SystemTimeProvider());
    }

    /* access modifiers changed from: package-private */
    public C0424h6 b() {
        return new C0424h6(this.f4525c, this.f4526d);
    }

    /* access modifiers changed from: package-private */
    public C0276b8 e() {
        return F0.g().w().a(this.f4526d);
    }

    /* access modifiers changed from: package-private */
    public L4<X4, L3> a(L3 l3, I4 i4) {
        return new L4<>(i4, l3);
    }

    /* access modifiers changed from: package-private */
    public C0528lb a(L7 l7) {
        return new C0528lb(l7);
    }

    /* access modifiers changed from: package-private */
    public C0652qb a(L7 l7, Z3 z3) {
        return new C0652qb(l7, z3);
    }

    /* access modifiers changed from: package-private */
    public C0603ob a(List<C0553mb> list, C0628pb pbVar) {
        return new C0603ob(list, pbVar);
    }

    /* access modifiers changed from: package-private */
    public H a(C0302c9 c9Var) {
        return new H(this.f4525c, c9Var);
    }
}
