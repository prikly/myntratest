package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Sh;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ui {
    private C0805wl A;
    private C0439hl B;
    private C0439hl C;
    private C0439hl D;
    private C0442i E;
    private boolean F;
    private C0754ui G;
    private Ph H;
    private C0674ra I;
    private List<String> J;
    private Oh K;
    private C0784w0 L;
    private Uh M;
    private C0706si N;
    private Map<String, Object> O;

    /* renamed from: a  reason: collision with root package name */
    private a f5178a;

    /* renamed from: b  reason: collision with root package name */
    private Sh f5179b = new Sh.a().a();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f5180c;

    /* renamed from: d  reason: collision with root package name */
    private String f5181d = "";

    /* renamed from: e  reason: collision with root package name */
    private List<String> f5182e;

    /* renamed from: f  reason: collision with root package name */
    private String f5183f = "";

    /* renamed from: g  reason: collision with root package name */
    private List<String> f5184g;

    /* renamed from: h  reason: collision with root package name */
    private String f5185h;
    private String i;
    private String j;
    private String k;
    private String l;
    private C0336di m = null;
    private C0261ai n = null;
    private List<C0604oc> o;
    private Long p;
    private List<C0286bi> q;
    private String r;
    private List<String> s;
    private List<String> t;
    private Map<String, List<String>> u;
    private C0730ti v;
    private C0311ci w;
    private RetryPolicyConfig x;
    private List<Bd> y = new ArrayList();
    private Zh z;

    public enum a {
        BAD,
        OK
    }

    public a A() {
        return this.f5178a;
    }

    public RetryPolicyConfig B() {
        return this.x;
    }

    public C0311ci C() {
        return this.w;
    }

    public String D() {
        return this.f5185h;
    }

    public C0336di E() {
        return this.m;
    }

    public C0706si F() {
        return this.N;
    }

    public List<String> G() {
        return this.f5180c;
    }

    public C0730ti H() {
        return this.v;
    }

    public C0754ui I() {
        return this.G;
    }

    public C0439hl J() {
        return this.D;
    }

    public C0439hl K() {
        return this.B;
    }

    public C0805wl L() {
        return this.A;
    }

    public C0439hl M() {
        return this.C;
    }

    public Long N() {
        return this.p;
    }

    public boolean O() {
        return this.F;
    }

    /* access modifiers changed from: package-private */
    public void a(Sh sh) {
        this.f5179b = sh;
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.r = str;
    }

    /* access modifiers changed from: package-private */
    public void c(List<String> list) {
        this.f5184g = list;
    }

    public String d() {
        return this.i;
    }

    public Sh e() {
        return this.f5179b;
    }

    /* access modifiers changed from: package-private */
    public void f(String str) {
        this.f5181d = str;
    }

    /* access modifiers changed from: package-private */
    public void g(String str) {
        this.f5183f = str;
    }

    /* access modifiers changed from: package-private */
    public void h(List<String> list) {
        this.f5180c = list;
    }

    public String i() {
        return this.j;
    }

    public List<String> j() {
        return this.s;
    }

    public C0674ra k() {
        return this.I;
    }

    public C0784w0 l() {
        return this.L;
    }

    public Uh m() {
        return this.M;
    }

    public String n() {
        return this.l;
    }

    public String o() {
        return this.f5181d;
    }

    public Zh p() {
        return this.z;
    }

    public List<C0604oc> q() {
        return this.o;
    }

    public List<String> r() {
        return this.f5184g;
    }

    public List<String> s() {
        return this.J;
    }

    public List<String> t() {
        return this.t;
    }

    public Map<String, Object> u() {
        return this.O;
    }

    public List<Bd> v() {
        return this.y;
    }

    public C0261ai w() {
        return this.n;
    }

    public String x() {
        return this.f5183f;
    }

    public List<String> y() {
        return this.f5182e;
    }

    public List<C0286bi> z() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, boolean z2) {
        this.y.add(new Bd(str, z2));
    }

    /* access modifiers changed from: package-private */
    public void b(List<C0604oc> list) {
        this.o = list;
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        this.k = str;
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        this.j = str;
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        this.l = str;
    }

    /* access modifiers changed from: package-private */
    public void f(List<String> list) {
        this.f5182e = list;
    }

    /* access modifiers changed from: package-private */
    public void g(List<C0286bi> list) {
        this.q = list;
    }

    /* access modifiers changed from: package-private */
    public void h(String str) {
        this.f5185h = str;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.i = str;
    }

    public void b(C0439hl hlVar) {
        this.B = hlVar;
    }

    public void c(C0439hl hlVar) {
        this.C = hlVar;
    }

    public void d(List<String> list) {
        this.J = list;
    }

    /* access modifiers changed from: package-private */
    public void e(List<String> list) {
        this.t = list;
    }

    public String f() {
        return this.r;
    }

    public Map<String, List<String>> g() {
        return this.u;
    }

    public String h() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f5178a = aVar;
    }

    public C0442i b() {
        return this.E;
    }

    public Ph c() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public void a(C0336di diVar) {
        this.m = diVar;
    }

    public void b(Map<String, Object> map) {
        this.O = map;
    }

    /* access modifiers changed from: package-private */
    public void a(C0261ai aiVar) {
        this.n = aiVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Long l2) {
        this.p = l2;
    }

    /* access modifiers changed from: package-private */
    public void a(List<String> list) {
        this.s = list;
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, List<String>> map) {
        this.u = map;
    }

    /* access modifiers changed from: package-private */
    public void a(C0730ti tiVar) {
        this.v = tiVar;
    }

    /* access modifiers changed from: package-private */
    public void a(C0311ci ciVar) {
        this.w = ciVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Zh zh) {
        this.z = zh;
    }

    /* access modifiers changed from: package-private */
    public void a(RetryPolicyConfig retryPolicyConfig) {
        this.x = retryPolicyConfig;
    }

    public void a(C0805wl wlVar) {
        this.A = wlVar;
    }

    public void a(C0439hl hlVar) {
        this.D = hlVar;
    }

    public void a(C0442i iVar) {
        this.E = iVar;
    }

    public void a(boolean z2) {
        this.F = z2;
    }

    public void a(C0754ui uiVar) {
        this.G = uiVar;
    }

    public void a(Ph ph) {
        this.H = ph;
    }

    public void a(C0674ra raVar) {
        this.I = raVar;
    }

    public Oh a() {
        return this.K;
    }

    public void a(Oh oh) {
        this.K = oh;
    }

    public void a(C0784w0 w0Var) {
        this.L = w0Var;
    }

    public void a(Uh uh) {
        this.M = uh;
    }

    public void a(C0706si siVar) {
        this.N = siVar;
    }
}
