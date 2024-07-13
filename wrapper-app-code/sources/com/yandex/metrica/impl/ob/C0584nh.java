package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nh  reason: case insensitive filesystem */
public class C0584nh implements M0, IPluginReporter {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0484jh> f6320a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private volatile M0 f6321b;

    /* renamed from: com.yandex.metrica.impl.ob.nh$a */
    class a implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6323b;

        a(C0584nh nhVar, String str, String str2) {
            this.f6322a = str;
            this.f6323b = str2;
        }

        public void a(M0 m0) {
            m0.d(this.f6322a, this.f6323b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$b */
    class b implements C0484jh {
        b(C0584nh nhVar) {
        }

        public void a(M0 m0) {
            m0.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$c */
    class c implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H6 f6324a;

        c(C0584nh nhVar, H6 h6) {
            this.f6324a = h6;
        }

        public void a(M0 m0) {
            m0.a(this.f6324a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$d */
    class d implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6325a;

        d(C0584nh nhVar, String str) {
            this.f6325a = str;
        }

        public void a(M0 m0) {
            m0.reportEvent(this.f6325a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$e */
    class e implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6327b;

        e(C0584nh nhVar, String str, String str2) {
            this.f6326a = str;
            this.f6327b = str2;
        }

        public void a(M0 m0) {
            m0.reportEvent(this.f6326a, this.f6327b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$f */
    class f implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f6329b;

        f(C0584nh nhVar, String str, Map map) {
            this.f6328a = str;
            this.f6329b = map;
        }

        public void a(M0 m0) {
            m0.reportEvent(this.f6328a, (Map<String, Object>) this.f6329b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$g */
    class g implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f6331b;

        g(C0584nh nhVar, String str, Throwable th) {
            this.f6330a = str;
            this.f6331b = th;
        }

        public void a(M0 m0) {
            m0.reportError(this.f6330a, this.f6331b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$h */
    class h implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f6334c;

        h(C0584nh nhVar, String str, String str2, Throwable th) {
            this.f6332a = str;
            this.f6333b = str2;
            this.f6334c = th;
        }

        public void a(M0 m0) {
            m0.reportError(this.f6332a, this.f6333b, this.f6334c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$i */
    class i implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f6335a;

        i(C0584nh nhVar, Throwable th) {
            this.f6335a = th;
        }

        public void a(M0 m0) {
            m0.reportUnhandledException(this.f6335a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$j */
    class j implements C0484jh {
        j(C0584nh nhVar) {
        }

        public void a(M0 m0) {
            m0.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$k */
    class k implements C0484jh {
        k(C0584nh nhVar) {
        }

        public void a(M0 m0) {
            m0.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$l */
    class l implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6336a;

        l(C0584nh nhVar, String str) {
            this.f6336a = str;
        }

        public void a(M0 m0) {
            m0.setUserProfileID(this.f6336a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$m */
    class m implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfile f6337a;

        m(C0584nh nhVar, UserProfile userProfile) {
            this.f6337a = userProfile;
        }

        public void a(M0 m0) {
            m0.reportUserProfile(this.f6337a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$n */
    class n implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0790w6 f6338a;

        n(C0584nh nhVar, C0790w6 w6Var) {
            this.f6338a = w6Var;
        }

        public void a(M0 m0) {
            m0.a(this.f6338a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$o */
    class o implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Revenue f6339a;

        o(C0584nh nhVar, Revenue revenue) {
            this.f6339a = revenue;
        }

        public void a(M0 m0) {
            m0.reportRevenue(this.f6339a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$p */
    class p implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f6340a;

        p(C0584nh nhVar, ECommerceEvent eCommerceEvent) {
            this.f6340a = eCommerceEvent;
        }

        public void a(M0 m0) {
            m0.reportECommerce(this.f6340a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$q */
    class q implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6341a;

        q(C0584nh nhVar, boolean z) {
            this.f6341a = z;
        }

        public void a(M0 m0) {
            m0.setStatisticsSending(this.f6341a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$r */
    class r implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdRevenue f6342a;

        r(C0584nh nhVar, AdRevenue adRevenue) {
            this.f6342a = adRevenue;
        }

        public void a(M0 m0) {
            m0.reportAdRevenue(this.f6342a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$s */
    class s implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f6343a;

        s(C0584nh nhVar, PluginErrorDetails pluginErrorDetails) {
            this.f6343a = pluginErrorDetails;
        }

        public void a(M0 m0) {
            m0.getPluginExtension().reportUnhandledException(this.f6343a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$t */
    class t implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f6344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6345b;

        t(C0584nh nhVar, PluginErrorDetails pluginErrorDetails, String str) {
            this.f6344a = pluginErrorDetails;
            this.f6345b = str;
        }

        public void a(M0 m0) {
            m0.getPluginExtension().reportError(this.f6344a, this.f6345b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$u */
    class u implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f6348c;

        u(C0584nh nhVar, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f6346a = str;
            this.f6347b = str2;
            this.f6348c = pluginErrorDetails;
        }

        public void a(M0 m0) {
            m0.getPluginExtension().reportError(this.f6346a, this.f6347b, this.f6348c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$v */
    class v implements C0484jh {
        v(C0584nh nhVar) {
        }

        public void a(M0 m0) {
            m0.b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$w */
    class w implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f6350b;

        w(C0584nh nhVar, String str, JSONObject jSONObject) {
            this.f6349a = str;
            this.f6350b = jSONObject;
        }

        public void a(M0 m0) {
            m0.a(this.f6349a, this.f6350b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$x */
    class x implements C0484jh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6352b;

        x(C0584nh nhVar, String str, String str2) {
            this.f6351a = str;
            this.f6352b = str2;
        }

        public void a(M0 m0) {
            m0.b(this.f6351a, this.f6352b);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(Context context) {
        this.f6321b = Pf.a().a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
        for (C0484jh a2 : this.f6320a) {
            a2.a(this.f6321b);
        }
        this.f6320a.clear();
    }

    public void b() {
        a((C0484jh) new v(this));
    }

    public void d(String str, String str2) {
        a((C0484jh) new a(this, str, str2));
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        a((C0484jh) new k(this));
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        a((C0484jh) new r(this, adRevenue));
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        a((C0484jh) new p(this, eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        a((C0484jh) new g(this, str, th));
    }

    public void reportEvent(String str) {
        a((C0484jh) new d(this, str));
    }

    public void reportRevenue(Revenue revenue) {
        a((C0484jh) new o(this, revenue));
    }

    public void reportUnhandledException(Throwable th) {
        a((C0484jh) new i(this, th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        a((C0484jh) new m(this, userProfile));
    }

    public void resumeSession() {
        a((C0484jh) new j(this));
    }

    public void sendEventsBuffer() {
        a((C0484jh) new b(this));
    }

    public void setStatisticsSending(boolean z) {
        a((C0484jh) new q(this, z));
    }

    public void setUserProfileID(String str) {
        a((C0484jh) new l(this, str));
    }

    public void b(String str, String str2) {
        a((C0484jh) new x(this, str, str2));
    }

    public void reportError(String str, String str2) {
        a((C0484jh) new h(this, str, str2, (Throwable) null));
    }

    public void reportEvent(String str, String str2) {
        a((C0484jh) new e(this, str, str2));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        a((C0484jh) new s(this, pluginErrorDetails));
    }

    public void reportError(String str, String str2, Throwable th) {
        a((C0484jh) new h(this, str, str2, th));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        a((C0484jh) new f(this, str, map));
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        a((C0484jh) new t(this, pluginErrorDetails, str));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        a((C0484jh) new u(this, str, str2, pluginErrorDetails));
    }

    public void a(H6 h6) {
        a((C0484jh) new c(this, h6));
    }

    public void a(C0790w6 w6Var) {
        a((C0484jh) new n(this, w6Var));
    }

    public void a(String str, JSONObject jSONObject) {
        a((C0484jh) new w(this, str, jSONObject));
    }

    private synchronized void a(C0484jh jhVar) {
        if (this.f6321b == null) {
            this.f6320a.add(jhVar);
        } else {
            jhVar.a(this.f6321b);
        }
    }
}
