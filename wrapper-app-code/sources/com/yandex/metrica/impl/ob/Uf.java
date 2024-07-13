package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.e;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.f;
import com.yandex.metrica.impl.ob.C0640q;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

public final class Uf extends Lf {
    private final Qf i;
    private final Xf j;
    private final Wf k;
    /* access modifiers changed from: private */
    public final C0594o2 l;

    class A implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f5102a;

        A(Activity activity) {
            this.f5102a = activity;
        }

        public void run() {
            Uf.this.l.a(this.f5102a, Uf.a(Uf.this));
        }
    }

    class B implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0640q.c f5104a;

        B(C0640q.c cVar) {
            this.f5104a = cVar;
        }

        public void run() {
            Uf.a(Uf.this).a(this.f5104a);
        }
    }

    class C implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5106a;

        C(String str) {
            this.f5106a = str;
        }

        public void run() {
            Uf.a(Uf.this).reportEvent(this.f5106a);
        }
    }

    class D implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5109b;

        D(String str, String str2) {
            this.f5108a = str;
            this.f5109b = str2;
        }

        public void run() {
            Uf.a(Uf.this).reportEvent(this.f5108a, this.f5109b);
        }
    }

    class E implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f5112b;

        E(String str, List list) {
            this.f5111a = str;
            this.f5112b = list;
        }

        public void run() {
            Uf.a(Uf.this).reportEvent(this.f5111a, (Map<String, Object>) A2.a(this.f5112b));
        }
    }

    class F implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f5115b;

        F(String str, Throwable th) {
            this.f5114a = str;
            this.f5115b = th;
        }

        public void run() {
            Uf.a(Uf.this).reportError(this.f5114a, this.f5115b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a  reason: case insensitive filesystem */
    class C0236a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5118b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f5119c;

        C0236a(String str, String str2, Throwable th) {
            this.f5117a = str;
            this.f5118b = str2;
            this.f5119c = th;
        }

        public void run() {
            Uf.a(Uf.this).reportError(this.f5117a, this.f5118b, this.f5119c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b  reason: case insensitive filesystem */
    class C0237b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f5121a;

        C0237b(Throwable th) {
            this.f5121a = th;
        }

        public void run() {
            Uf.a(Uf.this).reportUnhandledException(this.f5121a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$c  reason: case insensitive filesystem */
    class C0238c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5123a;

        C0238c(String str) {
            this.f5123a = str;
        }

        public void run() {
            Uf.a(Uf.this).c(this.f5123a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$d  reason: case insensitive filesystem */
    class C0239d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f5125a;

        C0239d(Intent intent) {
            this.f5125a = intent;
        }

        public void run() {
            Uf.c(Uf.this).a().a(this.f5125a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$e  reason: case insensitive filesystem */
    class C0240e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5127a;

        C0240e(String str) {
            this.f5127a = str;
        }

        public void run() {
            Uf.c(Uf.this).a().a(this.f5127a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$f  reason: case insensitive filesystem */
    class C0241f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f5129a;

        C0241f(Intent intent) {
            this.f5129a = intent;
        }

        public void run() {
            Uf.c(Uf.this).a().a(this.f5129a);
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5131a;

        g(String str) {
            this.f5131a = str;
        }

        public void run() {
            Uf.a(Uf.this).a(this.f5131a);
        }
    }

    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Location f5133a;

        h(Location location) {
            this.f5133a = location;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            Location location = this.f5133a;
            e2.getClass();
            R2.a(location);
        }
    }

    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5135a;

        i(boolean z) {
            this.f5135a = z;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            boolean z = this.f5135a;
            e2.getClass();
            R2.a(z);
        }
    }

    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5137a;

        j(boolean z) {
            this.f5137a = z;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            boolean z = this.f5137a;
            e2.getClass();
            R2.a(z);
        }
    }

    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ YandexMetricaConfig f5140b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.i f5141c;

        k(Context context, YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.i iVar) {
            this.f5139a = context;
            this.f5140b = yandexMetricaConfig;
            this.f5141c = iVar;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            Context context = this.f5139a;
            e2.getClass();
            R2.a(context).b(this.f5140b, Uf.this.c().a(this.f5141c));
        }
    }

    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5143a;

        l(boolean z) {
            this.f5143a = z;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            boolean z = this.f5143a;
            e2.getClass();
            R2.c(z);
        }
    }

    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5145a;

        m(String str) {
            this.f5145a = str;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            String str = this.f5145a;
            e2.getClass();
            R2.a(str);
        }
    }

    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfile f5147a;

        n(UserProfile userProfile) {
            this.f5147a = userProfile;
        }

        public void run() {
            Uf.a(Uf.this).reportUserProfile(this.f5147a);
        }
    }

    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Revenue f5149a;

        o(Revenue revenue) {
            this.f5149a = revenue;
        }

        public void run() {
            Uf.a(Uf.this).reportRevenue(this.f5149a);
        }
    }

    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdRevenue f5151a;

        p(AdRevenue adRevenue) {
            this.f5151a = adRevenue;
        }

        public void run() {
            Uf.a(Uf.this).reportAdRevenue(this.f5151a);
        }
    }

    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f5153a;

        q(ECommerceEvent eCommerceEvent) {
            this.f5153a = eCommerceEvent;
        }

        public void run() {
            Uf.a(Uf.this).reportECommerce(this.f5153a);
        }
    }

    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeferredDeeplinkParametersListener f5155a;

        r(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f5155a = deferredDeeplinkParametersListener;
        }

        public void run() {
            Uf.this.e().getClass();
            R2.k().a(this.f5155a);
        }
    }

    class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeferredDeeplinkListener f5157a;

        s(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f5157a = deferredDeeplinkListener;
        }

        public void run() {
            Uf.this.e().getClass();
            R2.k().a(this.f5157a);
        }
    }

    class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppMetricaDeviceIDListener f5159a;

        t(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f5159a = appMetricaDeviceIDListener;
        }

        public void run() {
            Uf.this.e().getClass();
            R2.k().b(this.f5159a);
        }
    }

    class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5162b;

        u(String str, String str2) {
            this.f5161a = str;
            this.f5162b = str2;
        }

        public void run() {
            Sf e2 = Uf.this.e();
            String str = this.f5161a;
            String str2 = this.f5162b;
            e2.getClass();
            R2.a(str, str2);
        }
    }

    class v implements Runnable {
        v() {
        }

        public void run() {
            Uf.a(Uf.this).sendEventsBuffer();
        }
    }

    class w implements Runnable {
        w() {
        }

        public void run() {
            Uf.a(Uf.this).a(Uf.this.h());
        }
    }

    class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5167b;

        x(String str, String str2) {
            this.f5166a = str;
            this.f5167b = str2;
        }

        public void run() {
            Uf.a(Uf.this).a(this.f5166a, this.f5167b);
        }
    }

    class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5169a;

        y(String str) {
            this.f5169a = str;
        }

        public void run() {
            Uf.a(Uf.this).b(this.f5169a);
        }
    }

    class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f5171a;

        z(Activity activity) {
            this.f5171a = activity;
        }

        public void run() {
            Uf.this.l.b(this.f5171a, Uf.a(Uf.this));
        }
    }

    public Uf(ICommonExecutor iCommonExecutor) {
        this(new Sf(), iCommonExecutor, new Xf(), new Wf(), new D2());
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        com.yandex.metrica.i iVar;
        this.j.a(context, yandexMetricaConfig);
        Wf wf = this.k;
        if (yandexMetricaConfig instanceof com.yandex.metrica.i) {
            iVar = (com.yandex.metrica.i) yandexMetricaConfig;
        } else {
            iVar = new com.yandex.metrica.i(yandexMetricaConfig);
        }
        com.yandex.metrica.i a2 = wf.a(iVar);
        g().a(context, (YandexMetricaConfig) a2);
        d().execute(new k(context, yandexMetricaConfig, a2));
        e().getClass();
        R2.j();
    }

    public void c(Activity activity) {
        a().a(null);
        this.j.getClass();
        g().getClass();
        d().execute(new z(activity));
    }

    public void d(String str) {
        a().a(null);
        this.j.c(str);
        g().getClass();
        d().execute(new C0238c(str));
    }

    public void e(String str) {
        a().a(null);
        this.j.a(str);
        d().execute(new g(str));
    }

    public void f(String str) {
        this.j.getClass();
        g().getClass();
        d().execute(new m(str));
    }

    public void i() {
        a().a(null);
        this.j.getClass();
        g().getClass();
        d().execute(new v());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Uf(com.yandex.metrica.impl.ob.Sf r14, com.yandex.metrica.core.api.executors.ICommonExecutor r15, com.yandex.metrica.impl.ob.Xf r16, com.yandex.metrica.impl.ob.Wf r17, com.yandex.metrica.impl.ob.D2 r18) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.Kf r5 = new com.yandex.metrica.impl.ob.Kf
            r5.<init>(r14)
            com.yandex.metrica.impl.ob.Qf r6 = new com.yandex.metrica.impl.ob.Qf
            r6.<init>(r14)
            com.yandex.metrica.f r8 = new com.yandex.metrica.f
            r7 = r18
            r8.<init>(r14, r7)
            com.yandex.metrica.impl.ob.Pf r9 = com.yandex.metrica.impl.ob.Pf.a()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.l0 r10 = r0.f()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.o2 r11 = r0.l()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.a0 r12 = r0.e()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Uf.<init>(com.yandex.metrica.impl.ob.Sf, com.yandex.metrica.core.api.executors.ICommonExecutor, com.yandex.metrica.impl.ob.Xf, com.yandex.metrica.impl.ob.Wf, com.yandex.metrica.impl.ob.D2):void");
    }

    public void b(String str) {
        a().a(null);
        this.j.reportEvent(str);
        g().getClass();
        d().execute(new C(str));
    }

    public void b(String str, String str2) {
        a().a(null);
        this.j.reportEvent(str, str2);
        g().getClass();
        d().execute(new D(str, str2));
    }

    public void c(String str, String str2) {
        a().a(null);
        if (!this.j.f(str)) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
            return;
        }
        g().getClass();
        d().execute(new x(str, str2));
    }

    public void b(Activity activity) {
        Intent intent = null;
        a().a(null);
        this.j.c(activity);
        g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        d().execute(new C0239d(intent));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Uf(Sf sf, ICommonExecutor iCommonExecutor, Xf xf, Wf wf, Kf kf, Qf qf, D2 d2, f fVar, Pf pf, C0517l0 l0Var, C0594o2 o2Var, C0243a0 a0Var) {
        super(sf, iCommonExecutor, kf, d2, fVar, pf, l0Var, a0Var);
        this.k = wf;
        this.j = xf;
        this.i = qf;
        this.l = o2Var;
    }

    public void c(String str) {
        if (this.i.a().b() && this.j.g(str)) {
            g().getClass();
            d().execute(new y(str));
        }
    }

    public void b(Context context, boolean z2) {
        this.j.b(context);
        g().c(context);
        d().execute(new l(z2));
    }

    static C0493k1 c(Uf uf) {
        uf.e().getClass();
        return R2.k().d();
    }

    public void a(Activity activity) {
        a().a(null);
        this.j.getClass();
        g().getClass();
        d().execute(new A(activity));
    }

    public void a(Application application) {
        a().a(null);
        this.j.a(application);
        d().execute(new B(g().a(application)));
    }

    public void a(String str, Map<String, Object> map) {
        a().a(null);
        this.j.reportEvent(str, map);
        g().getClass();
        d().execute(new E(str, A2.a(map)));
    }

    public void a(String str, Throwable th) {
        a().a(null);
        this.j.reportError(str, th);
        g().getClass();
        if (th == null) {
            th = new C0498k6();
            th.fillInStackTrace();
        }
        d().execute(new F(str, th));
    }

    public void a(String str, String str2, Throwable th) {
        a().a(null);
        this.j.reportError(str, str2, th);
        d().execute(new C0236a(str, str2, th));
    }

    public void a(Throwable th) {
        a().a(null);
        this.j.reportUnhandledException(th);
        g().getClass();
        d().execute(new C0237b(th));
    }

    public void a(String str) {
        a().a(null);
        this.j.e(str);
        g().getClass();
        d().execute(new C0240e(str));
    }

    public void a(Intent intent) {
        a().a(null);
        this.j.a(intent);
        g().getClass();
        d().execute(new C0241f(intent));
    }

    public void a(Location location) {
        this.j.getClass();
        g().getClass();
        d().execute(new h(location));
    }

    public void a(boolean z2) {
        this.j.getClass();
        g().getClass();
        d().execute(new i(z2));
    }

    public void a(Context context, boolean z2) {
        this.j.a(context);
        g().b(context);
        d().execute(new j(z2));
    }

    public void a(UserProfile userProfile) {
        a().a(null);
        this.j.reportUserProfile(userProfile);
        g().getClass();
        d().execute(new n(userProfile));
    }

    public void a(Revenue revenue) {
        a().a(null);
        this.j.reportRevenue(revenue);
        g().getClass();
        d().execute(new o(revenue));
    }

    public void a(AdRevenue adRevenue) {
        a().a(null);
        this.j.reportAdRevenue(adRevenue);
        g().getClass();
        d().execute(new p(adRevenue));
    }

    public void a(ECommerceEvent eCommerceEvent) {
        a().a(null);
        this.j.reportECommerce(eCommerceEvent);
        g().getClass();
        d().execute(new q(eCommerceEvent));
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        a().a(null);
        this.j.a(deferredDeeplinkParametersListener);
        g().getClass();
        d().execute(new r(deferredDeeplinkParametersListener));
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        a().a(null);
        this.j.a(deferredDeeplinkListener);
        g().getClass();
        d().execute(new s(deferredDeeplinkListener));
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a().a(null);
        this.j.a(appMetricaDeviceIDListener);
        g().getClass();
        d().execute(new t(appMetricaDeviceIDListener));
    }

    public IReporter a(Context context, String str) {
        this.j.a(context, str);
        b().a(context);
        return f().a(context, str);
    }

    public void a(Context context, ReporterConfig reporterConfig) {
        this.j.a(context, reporterConfig);
        e a2 = e.a(reporterConfig);
        g().a(context);
        f().a(context, a2);
    }

    public void a(String str, String str2) {
        this.j.d(str);
        g().getClass();
        d().execute(new u(str, str2));
    }

    public void a(WebView webView) {
        a().a(null);
        this.j.a(webView);
        g().a(webView, this);
        d().execute(new w());
    }

    static K0 a(Uf uf) {
        uf.e().getClass();
        return R2.k().d().b();
    }
}
