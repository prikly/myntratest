package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.e;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class Of implements M0 {

    /* renamed from: a  reason: collision with root package name */
    private final Sf f4654a;

    /* renamed from: b  reason: collision with root package name */
    private final C0259ag f4655b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f4656c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f4657d;

    /* renamed from: e  reason: collision with root package name */
    private final Wf f4658e;

    /* renamed from: f  reason: collision with root package name */
    private final com.yandex.metrica.e f4659f;

    /* renamed from: g  reason: collision with root package name */
    private final com.yandex.metrica.f f4660g;

    /* renamed from: h  reason: collision with root package name */
    private final Nf f4661h;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4663b;

        a(String str, String str2) {
            this.f4662a = str;
            this.f4663b = str2;
        }

        public void run() {
            Of.this.a().b(this.f4662a, this.f4663b);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4666b;

        b(String str, String str2) {
            this.f4665a = str;
            this.f4666b = str2;
        }

        public void run() {
            Of.this.a().d(this.f4665a, this.f4666b);
        }
    }

    class c implements C0663qm<M0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Sf f4668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f4669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.e f4670c;

        c(Sf sf, Context context, com.yandex.metrica.e eVar) {
            this.f4668a = sf;
            this.f4669b = context;
            this.f4670c = eVar;
        }

        public Object a() {
            Sf sf = this.f4668a;
            Context context = this.f4669b;
            com.yandex.metrica.e eVar = this.f4670c;
            sf.getClass();
            return R2.a(context).a(eVar);
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4671a;

        d(String str) {
            this.f4671a = str;
        }

        public void run() {
            Of.this.a().reportEvent(this.f4671a);
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4674b;

        e(String str, String str2) {
            this.f4673a = str;
            this.f4674b = str2;
        }

        public void run() {
            Of.this.a().reportEvent(this.f4673a, this.f4674b);
        }
    }

    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f4677b;

        f(String str, List list) {
            this.f4676a = str;
            this.f4677b = list;
        }

        public void run() {
            Of.this.a().reportEvent(this.f4676a, (Map<String, Object>) A2.a(this.f4677b));
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f4680b;

        g(String str, Throwable th) {
            this.f4679a = str;
            this.f4680b = th;
        }

        public void run() {
            Of.this.a().reportError(this.f4679a, this.f4680b);
        }
    }

    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f4683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f4684c;

        h(String str, String str2, Throwable th) {
            this.f4682a = str;
            this.f4683b = str2;
            this.f4684c = th;
        }

        public void run() {
            Of.this.a().reportError(this.f4682a, this.f4683b, this.f4684c);
        }
    }

    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f4686a;

        i(Throwable th) {
            this.f4686a = th;
        }

        public void run() {
            Of.this.a().reportUnhandledException(this.f4686a);
        }
    }

    class j implements Runnable {
        j() {
        }

        public void run() {
            Of.this.a().resumeSession();
        }
    }

    class k implements Runnable {
        k() {
        }

        public void run() {
            Of.this.a().pauseSession();
        }
    }

    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4690a;

        l(String str) {
            this.f4690a = str;
        }

        public void run() {
            Of.this.a().setUserProfileID(this.f4690a);
        }
    }

    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H6 f4692a;

        m(H6 h6) {
            this.f4692a = h6;
        }

        public void run() {
            Of.this.a().a(this.f4692a);
        }
    }

    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfile f4694a;

        n(UserProfile userProfile) {
            this.f4694a = userProfile;
        }

        public void run() {
            Of.this.a().reportUserProfile(this.f4694a);
        }
    }

    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Revenue f4696a;

        o(Revenue revenue) {
            this.f4696a = revenue;
        }

        public void run() {
            Of.this.a().reportRevenue(this.f4696a);
        }
    }

    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdRevenue f4698a;

        p(AdRevenue adRevenue) {
            this.f4698a = adRevenue;
        }

        public void run() {
            Of.this.a().reportAdRevenue(this.f4698a);
        }
    }

    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f4700a;

        q(ECommerceEvent eCommerceEvent) {
            this.f4700a = eCommerceEvent;
        }

        public void run() {
            Of.this.a().reportECommerce(this.f4700a);
        }
    }

    class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f4702a;

        r(boolean z) {
            this.f4702a = z;
        }

        public void run() {
            Of.this.a().setStatisticsSending(this.f4702a);
        }
    }

    class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.e f4704a;

        s(com.yandex.metrica.e eVar) {
            this.f4704a = eVar;
        }

        public void run() {
            Of.a(Of.this, this.f4704a);
        }
    }

    class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.e f4706a;

        t(com.yandex.metrica.e eVar) {
            this.f4706a = eVar;
        }

        public void run() {
            Of.a(Of.this, this.f4706a);
        }
    }

    class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0790w6 f4708a;

        u(C0790w6 w6Var) {
            this.f4708a = w6Var;
        }

        public void run() {
            Of.this.a().a(this.f4708a);
        }
    }

    class v implements Runnable {
        v() {
        }

        public void run() {
            Of.this.a().b();
        }
    }

    class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f4712b;

        w(String str, JSONObject jSONObject) {
            this.f4711a = str;
            this.f4712b = jSONObject;
        }

        public void run() {
            Of.this.a().a(this.f4711a, this.f4712b);
        }
    }

    class x implements Runnable {
        x() {
        }

        public void run() {
            Of.this.a().sendEventsBuffer();
        }
    }

    public Of(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(iCommonExecutor, context.getApplicationContext(), str, new Sf());
    }

    /* access modifiers changed from: package-private */
    public final M0 a() {
        Sf sf = this.f4654a;
        Context context = this.f4657d;
        com.yandex.metrica.e eVar = this.f4659f;
        sf.getClass();
        return R2.a(context).a(eVar);
    }

    public void b() {
        this.f4660g.getClass();
        this.f4656c.execute(new v());
    }

    public void d(String str) {
        com.yandex.metrica.e a2 = new e.a(str).a();
        this.f4660g.getClass();
        this.f4656c.execute(new s(a2));
    }

    public IPluginReporter getPluginExtension() {
        return this.f4661h;
    }

    public void pauseSession() {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new k());
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        this.f4655b.reportAdRevenue(adRevenue);
        this.f4660g.getClass();
        this.f4656c.execute(new p(adRevenue));
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f4655b.reportECommerce(eCommerceEvent);
        this.f4660g.getClass();
        this.f4656c.execute(new q(eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        this.f4655b.reportError(str, th);
        this.f4660g.getClass();
        if (th == null) {
            th = new C0498k6();
            th.fillInStackTrace();
        }
        this.f4656c.execute(new g(str, th));
    }

    public void reportEvent(String str) {
        this.f4655b.reportEvent(str);
        this.f4660g.getClass();
        this.f4656c.execute(new d(str));
    }

    public void reportRevenue(Revenue revenue) {
        this.f4655b.reportRevenue(revenue);
        this.f4660g.getClass();
        this.f4656c.execute(new o(revenue));
    }

    public void reportUnhandledException(Throwable th) {
        this.f4655b.reportUnhandledException(th);
        this.f4660g.getClass();
        this.f4656c.execute(new i(th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        this.f4655b.reportUserProfile(userProfile);
        this.f4660g.getClass();
        this.f4656c.execute(new n(userProfile));
    }

    public void resumeSession() {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new j());
    }

    public void sendEventsBuffer() {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new x());
    }

    public void setStatisticsSending(boolean z) {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new r(z));
    }

    public void setUserProfileID(String str) {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new l(str));
    }

    private Of(ICommonExecutor iCommonExecutor, Context context, String str, Sf sf) {
        this(iCommonExecutor, context, new C0259ag(), sf, new Wf(), new com.yandex.metrica.f(sf, new D2()), com.yandex.metrica.e.a(str).a());
    }

    public void b(String str, String str2) {
        this.f4655b.getClass();
        this.f4660g.getClass();
        this.f4656c.execute(new a(str, str2));
    }

    public void reportEvent(String str, String str2) {
        this.f4655b.reportEvent(str, str2);
        this.f4660g.getClass();
        this.f4656c.execute(new e(str, str2));
    }

    public void d(String str, String str2) {
        this.f4655b.d(str, str2);
        this.f4660g.getClass();
        this.f4656c.execute(new b(str, str2));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        this.f4655b.reportEvent(str, map);
        this.f4660g.getClass();
        this.f4656c.execute(new f(str, A2.a(map)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Of(com.yandex.metrica.core.api.executors.ICommonExecutor r10, android.content.Context r11, com.yandex.metrica.impl.ob.C0259ag r12, com.yandex.metrica.impl.ob.Sf r13, com.yandex.metrica.impl.ob.Wf r14, com.yandex.metrica.f r15, com.yandex.metrica.e r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Nf r8 = new com.yandex.metrica.impl.ob.Nf
            com.yandex.metrica.impl.ob.Yf r0 = r12.a()
            com.yandex.metrica.impl.ob.Of$c r1 = new com.yandex.metrica.impl.ob.Of$c
            r2 = r11
            r4 = r13
            r7 = r16
            r1.<init>(r13, r11, r7)
            r3 = r10
            r6 = r15
            r8.<init>(r0, r15, r10, r1)
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Of.<init>(com.yandex.metrica.core.api.executors.ICommonExecutor, android.content.Context, com.yandex.metrica.impl.ob.ag, com.yandex.metrica.impl.ob.Sf, com.yandex.metrica.impl.ob.Wf, com.yandex.metrica.f, com.yandex.metrica.e):void");
    }

    Of(ICommonExecutor iCommonExecutor, Context context, C0259ag agVar, Sf sf, Wf wf, com.yandex.metrica.f fVar, com.yandex.metrica.e eVar, Nf nf) {
        this.f4656c = iCommonExecutor;
        this.f4657d = context;
        this.f4655b = agVar;
        this.f4654a = sf;
        this.f4658e = wf;
        this.f4660g = fVar;
        this.f4659f = eVar;
        this.f4661h = nf;
    }

    public void a(H6 h6) {
        this.f4660g.getClass();
        this.f4656c.execute(new m(h6));
    }

    public void a(C0790w6 w6Var) {
        this.f4660g.getClass();
        this.f4656c.execute(new u(w6Var));
    }

    public void a(String str, JSONObject jSONObject) {
        this.f4660g.getClass();
        this.f4656c.execute(new w(str, jSONObject));
    }

    public void a(com.yandex.metrica.e eVar) {
        com.yandex.metrica.e a2 = this.f4658e.a(eVar);
        this.f4660g.getClass();
        this.f4656c.execute(new t(a2));
    }

    static void a(Of of, com.yandex.metrica.e eVar) {
        Sf sf = of.f4654a;
        Context context = of.f4657d;
        sf.getClass();
        R2.a(context).c(eVar);
    }

    public void reportError(String str, String str2) {
        this.f4655b.reportError(str, str2, (Throwable) null);
        this.f4656c.execute(new h(str, str2, (Throwable) null));
    }

    public void reportError(String str, String str2, Throwable th) {
        this.f4655b.reportError(str, str2, th);
        this.f4656c.execute(new h(str, str2, th));
    }
}
