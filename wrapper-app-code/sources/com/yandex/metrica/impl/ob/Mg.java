package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C0763v3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Mg extends Hg {
    private final Jg A;
    private List<String> o;
    private List<String> p;
    private String q;
    private String r;
    private Map<String, String> s;
    private C0763v3.a t;
    private List<String> u;
    private boolean v;
    private boolean w;
    private String x;
    private long y;
    private final C0704sg z;

    public static class b extends Eg.a<b, b> implements Dg<b, b> {

        /* renamed from: d  reason: collision with root package name */
        public final String f4568d;

        /* renamed from: e  reason: collision with root package name */
        public final String f4569e;

        /* renamed from: f  reason: collision with root package name */
        public final Map<String, String> f4570f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f4571g;

        /* renamed from: h  reason: collision with root package name */
        public final List<String> f4572h;

        public b(C0859z3 z3Var) {
            this(z3Var.b().d(), z3Var.b().c(), z3Var.b().b(), z3Var.a().d(), z3Var.a().e(), z3Var.a().a(), z3Var.a().j(), z3Var.a().b());
        }

        public /* bridge */ /* synthetic */ boolean b(Object obj) {
            b bVar = (b) obj;
            return false;
        }

        public b a(b bVar) {
            String str = this.f3952a;
            String str2 = bVar.f3952a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f3953b;
            String str4 = bVar.f3953b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f3954c;
            String str6 = bVar.f3954c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f4568d;
            String str8 = bVar.f4568d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f4569e;
            String str10 = bVar.f4569e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f4570f;
            Map<String, String> map2 = bVar.f4570f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.f4571g || bVar.f4571g, bVar.f4571g ? bVar.f4572h : this.f4572h);
        }

        public b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.f4568d = str4;
            this.f4569e = str5;
            this.f4570f = map;
            this.f4571g = z;
            this.f4572h = list;
        }

        public b() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null);
        }
    }

    public static class c extends Hg.a<Mg, b> {

        /* renamed from: d  reason: collision with root package name */
        private final I f4573d;

        public c(Context context, String str) {
            this(context, str, new C0565mn(), F0.g().d());
        }

        public Eg a(Object obj) {
            Eg.c cVar = (Eg.c) obj;
            Mg mg = (Mg) a(cVar);
            C0635pi piVar = cVar.f3957a;
            mg.c(piVar.s());
            mg.b(piVar.r());
            String str = ((b) cVar.f3958b).f4568d;
            if (str != null) {
                Mg.a(mg, str);
                Mg.b(mg, ((b) cVar.f3958b).f4569e);
            }
            Map<String, String> map = ((b) cVar.f3958b).f4570f;
            mg.a(map);
            mg.a((C0763v3.a) this.f4573d.a(new C0763v3.a(map, C0736u0.APP)));
            mg.a(((b) cVar.f3958b).f4571g);
            mg.a(((b) cVar.f3958b).f4572h);
            mg.b(cVar.f3957a.q());
            mg.h(cVar.f3957a.g());
            mg.b(cVar.f3957a.o());
            return mg;
        }

        protected c(Context context, String str, C0565mn mnVar, I i) {
            super(context, str, mnVar);
            this.f4573d = i;
        }

        /* access modifiers changed from: protected */
        public Eg a() {
            return new Mg();
        }
    }

    public C0763v3.a B() {
        return this.t;
    }

    public Map<String, String> C() {
        return this.s;
    }

    public String D() {
        return this.x;
    }

    public String E() {
        return this.q;
    }

    public String F() {
        return this.r;
    }

    public List<String> G() {
        return this.u;
    }

    public C0704sg H() {
        return this.z;
    }

    public List<String> I() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!A2.b((Collection) this.o)) {
            linkedHashSet.addAll(this.o);
        }
        if (!A2.b((Collection) this.p)) {
            linkedHashSet.addAll(this.p);
        }
        linkedHashSet.addAll(this.A.a());
        return new ArrayList(linkedHashSet);
    }

    public List<String> J() {
        return this.p;
    }

    public boolean K() {
        return this.v;
    }

    public boolean L() {
        return this.w;
    }

    public long a(long j) {
        if (this.y == 0) {
            this.y = j;
        }
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        this.w = z2;
    }

    /* access modifiers changed from: package-private */
    public void c(List<String> list) {
        this.o = list;
    }

    public void h(String str) {
        this.x = str;
    }

    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.o + ", mStartupHostsFromClient=" + this.p + ", mDistributionReferrer='" + this.q + '\'' + ", mInstallReferrerSource='" + this.r + '\'' + ", mClidsFromClient=" + this.s + ", mNewCustomHosts=" + this.u + ", mHasNewCustomHosts=" + this.v + ", mSuccessfulStartup=" + this.w + ", mCountryInit='" + this.x + '\'' + ", mFirstStartupTime=" + this.y + "} " + super.toString();
    }

    private Mg() {
        this(F0.g().m(), new Jg());
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        if (this.y == 0) {
            this.y = j;
        }
    }

    Mg(C0704sg sgVar, Jg jg) {
        this.t = new C0763v3.a((Map<String, String>) null, C0736u0.APP);
        this.y = 0;
        this.z = sgVar;
        this.A = jg;
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, String> map) {
        this.s = map;
    }

    /* access modifiers changed from: package-private */
    public void b(List<String> list) {
        this.p = list;
    }

    static void b(Mg mg, String str) {
        mg.r = str;
    }

    /* access modifiers changed from: package-private */
    public void a(C0763v3.a aVar) {
        this.t = aVar;
    }

    static void a(Mg mg, String str) {
        mg.q = str;
    }

    public void a(List<String> list) {
        this.u = list;
    }

    public void a(boolean z2) {
        this.v = z2;
    }
}
