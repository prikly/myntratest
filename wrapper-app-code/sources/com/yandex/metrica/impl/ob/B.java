package com.yandex.metrica.impl.ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.protobuf.nano.ym.MessageNano;
import com.onesignal.OneSignalDbContract;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C0775vf;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import com.yandex.metrica.rtm.wrapper.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class B implements I0 {
    private static final Collection<Integer> n = new HashSet(Arrays.asList(new Integer[]{14, 15}));
    private static final Kn<C0775vf> o = new a();

    /* renamed from: a  reason: collision with root package name */
    protected final Context f3720a;

    /* renamed from: b  reason: collision with root package name */
    protected final Q1 f3721b;

    /* renamed from: c  reason: collision with root package name */
    protected final C0315cm f3722c;

    /* renamed from: d  reason: collision with root package name */
    protected final Sl f3723d;

    /* renamed from: e  reason: collision with root package name */
    protected final X6 f3724e;

    /* renamed from: f  reason: collision with root package name */
    protected final S6 f3725f;

    /* renamed from: g  reason: collision with root package name */
    protected final M6 f3726g;

    /* renamed from: h  reason: collision with root package name */
    private final K6 f3727h;
    protected final T1 i;
    private C0269b1 j;
    private final C0290bm k;
    private final A0 l;
    private final C0694s6 m;

    class a implements Kn<C0775vf> {
        a() {
        }

        public In a(Object obj) {
            C0775vf.a[] aVarArr = ((C0775vf) obj).f6989a;
            if (aVarArr == null || aVarArr.length == 0) {
                return In.a(this, "attributes list is empty");
            }
            return In.a(this);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Kn<Revenue> f3728a = new On();

        public static Kn<Revenue> a() {
            return f3728a;
        }
    }

    B(Context context, T1 t1, Q1 q1, A0 a0, C0290bm bmVar, d dVar, Yg yg, X6 x6, S6 s6, M6 m6, K6 k6, C0694s6 s6Var) {
        this.f3720a = context.getApplicationContext();
        this.i = t1;
        this.f3721b = q1;
        this.l = a0;
        this.f3724e = x6;
        this.f3725f = s6;
        this.f3726g = m6;
        this.f3727h = k6;
        this.m = s6Var;
        C0315cm b2 = Ul.b(q1.b().a());
        this.f3722c = b2;
        q1.a(new C0291bn(b2, "Crash Environment"));
        Sl a2 = Ul.a(q1.b().a());
        this.f3723d = a2;
        if (C0267b.a(q1.b().p())) {
            b2.setEnabled();
            a2.setEnabled();
        }
        this.k = bmVar;
    }

    /* access modifiers changed from: package-private */
    public void a(C0269b1 b1Var) {
        this.j = b1Var;
    }

    public void b(String str, String str2) {
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        this.i.a((C0293c0) new J(str2, str, C0244a1.EVENT_TYPE_STATBOX.b(), 0, cmVar), this.f3721b);
        if (this.f3722c.isEnabled()) {
            StringBuilder sb = new StringBuilder("Statbox event received ");
            sb.append(" with name: ");
            sb.append(f(str));
            sb.append(" with value: ");
            String f2 = f(str2);
            if (f2.length() > 100) {
                sb.append(f2.substring(0, 100));
                sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            } else {
                sb.append(f2);
            }
            this.f3722c.i(sb.toString());
        }
    }

    public void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f3721b.f4805c.a(str, str2);
        } else if (this.f3722c.isEnabled()) {
            this.f3722c.fw("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    public void d(String str, String str2) {
        List<Integer> list = C0856z0.i;
        this.i.a(new C0293c0(str2, str, C0244a1.EVENT_TYPE_DIAGNOSTIC.b()), this.f3721b);
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        this.i.e();
        this.j.b();
        T1 t1 = this.i;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J("", str, C0244a1.EVENT_TYPE_START.b(), cmVar), this.f3721b);
        this.f3721b.h();
    }

    public void f() {
        this.i.b(this.f3721b);
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Pause session");
        }
        d((String) null);
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        this.i.a(new Sg(adRevenue, this.f3722c), this.f3721b);
        if (this.f3722c.isEnabled()) {
            C0315cm cmVar = this.f3722c;
            StringBuilder sb = new StringBuilder();
            sb.append("AdRevenue Received: AdRevenue{adRevenue=");
            sb.append(adRevenue.adRevenue);
            sb.append(", currency='");
            sb.append(f(adRevenue.currency.getCurrencyCode()));
            sb.append('\'');
            sb.append(", adType=");
            Object obj = adRevenue.adType;
            if (obj == null) {
                obj = "<null>";
            }
            sb.append(obj);
            sb.append(", adNetwork='");
            sb.append(f(adRevenue.adNetwork));
            sb.append('\'');
            sb.append(", adUnitId='");
            sb.append(f(adRevenue.adUnitId));
            sb.append('\'');
            sb.append(", adUnitName='");
            sb.append(f(adRevenue.adUnitName));
            sb.append('\'');
            sb.append(", adPlacementId='");
            sb.append(f(adRevenue.adPlacementId));
            sb.append('\'');
            sb.append(", adPlacementName='");
            sb.append(f(adRevenue.adPlacementName));
            sb.append('\'');
            sb.append(", precision='");
            sb.append(f(adRevenue.precision));
            sb.append('\'');
            sb.append(", payload=");
            sb.append(Tl.g(adRevenue.payload));
            sb.append('}');
            cmVar.i(sb.toString());
        }
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f3722c.isEnabled()) {
            C0315cm cmVar = this.f3722c;
            cmVar.i("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.i.a((Za) eCommerceEvent, this.f3721b);
    }

    public void reportError(String str, Throwable th) {
        B6 b6 = new B6(str, a(th));
        T1 t1 = this.i;
        byte[] byteArray = MessageNano.toByteArray(this.f3725f.fromModel(b6));
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J(byteArray, str, C0244a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b(), cmVar), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Error received: %s", f(str));
        }
    }

    public void reportEvent(String str) {
        if (this.f3722c.isEnabled() && this.f3722c.isEnabled()) {
            this.f3722c.i("Event received: " + f(str));
        }
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        this.i.a((C0293c0) new J("", str, C0244a1.EVENT_TYPE_REGULAR.b(), 0, cmVar), this.f3721b);
    }

    public void reportRevenue(Revenue revenue) {
        In a2 = b.a().a(revenue);
        if (a2.b()) {
            this.i.a(new W1(revenue, this.f3722c), this.f3721b);
            if (this.f3722c.isEnabled()) {
                StringBuilder sb = new StringBuilder("Revenue received ");
                sb.append("for productID: ");
                sb.append(f(revenue.productID));
                sb.append(" of quantity: ");
                Integer num = revenue.quantity;
                if (num != null) {
                    sb.append(num);
                } else {
                    sb.append("<null>");
                }
                sb.append(" with price");
                if (revenue.priceMicros != null) {
                    sb.append(" (in micros): ");
                    sb.append(revenue.priceMicros);
                } else {
                    sb.append(": ");
                    sb.append(revenue.price);
                }
                sb.append(" ");
                sb.append(revenue.currency);
                this.f3722c.i(sb.toString());
            }
        } else if (this.f3722c.isEnabled()) {
            C0315cm cmVar = this.f3722c;
            cmVar.w("Passed revenue is not valid. Reason: " + a2.a());
        }
    }

    public void reportUnhandledException(Throwable th) {
        H6 a2 = I6.a(th, new C0790w6((E6) null, (List<E6>) null, ((Xl) this.k).b()), (List<StackTraceElement>) null, this.l.a(), this.l.b());
        this.i.b(a2, this.f3721b);
        b(a2);
    }

    public void reportUserProfile(UserProfile userProfile) {
        C0258af afVar = new C0258af();
        for (UserProfileUpdate<? extends C0283bf> userProfileUpdatePatcher : userProfile.getUserProfileUpdates()) {
            Se se = (Se) userProfileUpdatePatcher.getUserProfileUpdatePatcher();
            se.a(this.f3722c);
            se.a(afVar);
        }
        C0775vf c2 = afVar.c();
        In a2 = o.a(c2);
        if (a2.b()) {
            this.i.a(c2, this.f3721b);
            if (this.f3722c.isEnabled()) {
                this.f3722c.i(new StringBuilder("User profile received").toString());
            }
        } else if (this.f3722c.isEnabled()) {
            C0315cm cmVar = this.f3722c;
            cmVar.w("UserInfo wasn't sent because " + a2.a());
        }
    }

    public void resumeSession() {
        e((String) null);
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Resume session");
        }
    }

    public void sendEventsBuffer() {
        T1 t1 = this.i;
        C0244a1 a1Var = C0244a1.EVENT_TYPE_PURGE_BUFFER;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J("", "", a1Var.b(), 0, cmVar), this.f3721b);
    }

    public void setStatisticsSending(boolean z) {
        this.f3721b.b().c(z);
    }

    public void setUserProfileID(String str) {
        this.i.b(str, this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Set user profile ID: " + f(str));
        }
    }

    public void a(Map<String, String> map) {
        if (!A2.b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                c((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public String f(String str) {
        if (str == null) {
            return "<null>";
        }
        return str.isEmpty() ? "<empty>" : str;
    }

    public void a(String str, byte[] bArr) {
        T1 t1 = this.i;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        J j2 = new J("", (String) null, C0244a1.EVENT_TYPE_SET_SESSION_EXTRA.b(), cmVar);
        if (bArr == null) {
            bArr = new byte[0];
        }
        j2.a((Map<String, byte[]>) Collections.singletonMap(str, bArr));
        t1.a((C0293c0) j2, this.f3721b);
    }

    public void c(String str) {
        this.i.a(str, this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Error received: native");
        }
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String b2;
        H6 a2 = this.m.a(pluginErrorDetails);
        T1 t1 = this.i;
        F6 f6 = a2.f4094a;
        String str = "";
        if (!(f6 == null || (b2 = f6.b()) == null)) {
            str = b2;
        }
        byte[] byteArray = MessageNano.toByteArray(this.f3724e.fromModel(a2));
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J(byteArray, str, C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), cmVar), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Crash from plugin received: %s", f(pluginErrorDetails.getMessage()));
        }
    }

    public void reportEvent(String str, String str2) {
        if (this.f3722c.isEnabled()) {
            e(str, str2);
        }
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        this.i.a((C0293c0) new J(str2, str, C0244a1.EVENT_TYPE_REGULAR.b(), 0, cmVar), this.f3721b);
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        if (!this.f3721b.f()) {
            this.i.d();
            this.j.a();
            this.f3721b.g();
            T1 t1 = this.i;
            C0315cm cmVar = this.f3722c;
            List<Integer> list = C0856z0.i;
            t1.a((C0293c0) new J("", str, C0244a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, cmVar), this.f3721b);
        }
    }

    /* access modifiers changed from: protected */
    public void b(H6 h6) {
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Unhandled exception received: " + h6.toString());
        }
    }

    public void b() {
        Integer num;
        T1 t1 = this.i;
        Context context = this.f3720a;
        C0293c0 c0Var = new C0293c0();
        c0Var.f5574a = "";
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        E c2 = g2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer a2 = c2.a();
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (A2.a(23)) {
            try {
                Object systemService = context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
                if (systemService != null) {
                    num = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                    JSONObject put = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a2).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
                    Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …tionFilter)\n            )");
                    c0Var.f5578e = C0244a1.EVENT_TYPE_IDENTITY_LIGHT.b();
                    c0Var.f5575b = put.toString();
                    t1.a(c0Var, this.f3721b);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } catch (Throwable unused) {
            }
        }
        num = null;
        JSONObject put2 = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a2).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject()\n           …tionFilter)\n            )");
        c0Var.f5578e = C0244a1.EVENT_TYPE_IDENTITY_LIGHT.b();
        c0Var.f5575b = put2.toString();
        t1.a(c0Var, this.f3721b);
    }

    public void b(String str) {
        this.i.a(C0293c0.a(str), this.f3721b);
    }

    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.i.a(C0856z0.a(str2, MessageNano.toByteArray(this.f3726g.fromModel(new C0862z6(new B6(str2, a(th)), str))), this.f3722c), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Error received: id: %s, message: %s", f(str), f(str2));
        }
    }

    private void e(String str, String str2) {
        if (this.f3722c.isEnabled()) {
            this.f3722c.i("Event received: " + f(str) + ". With value: " + f(str2));
        }
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C0694s6 s6Var = this.m;
        s6Var.getClass();
        this.i.a(C0856z0.a(str, MessageNano.toByteArray(this.f3725f.fromModel(new B6(str, pluginErrorDetails != null ? s6Var.a(pluginErrorDetails) : null))), this.f3722c), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Error from plugin received: %s", f(str));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        boolean z = !this.f3721b.f();
        if (z) {
            C0315cm cmVar = this.f3722c;
            List<Integer> list = C0856z0.i;
            this.i.a((C0293c0) new J("", "", C0244a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, cmVar), this.f3721b);
        }
        return z;
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C0694s6 s6Var = this.m;
        s6Var.getClass();
        this.i.a(C0856z0.a(str2, MessageNano.toByteArray(this.f3726g.fromModel(new C0862z6(new B6(str2, pluginErrorDetails != null ? s6Var.a(pluginErrorDetails) : null), str))), this.f3722c), this.f3721b);
        if (this.f3722c.isEnabled()) {
            this.f3722c.fi("Error with identifier: %s from plugin received: %s", str, f(str2));
        }
    }

    public void a(int i2, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
        HashMap hashMap;
        boolean z = true;
        if (n.contains(Integer.valueOf(i2)) || i2 < 1 || i2 > 99) {
            z = false;
        }
        if (!z) {
            if (map == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map);
            }
            C0315cm cmVar = this.f3722c;
            List<Integer> list = C0856z0.i;
            C0293c0 c2 = new J(str2, str, C0244a1.EVENT_TYPE_CUSTOM_EVENT.b(), i2, cmVar).c(Tl.g(hashMap));
            if (map2 != null) {
                c2.a(map2);
            }
            this.i.a(c2, this.f3721b);
        }
    }

    public void reportEvent(String str, Map<String, Object> map) {
        String str2 = null;
        HashMap hashMap = A2.b((Map) map) ? null : new HashMap(map);
        T1 t1 = this.i;
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J("", str, C0244a1.EVENT_TYPE_REGULAR.b(), 0, cmVar), this.f3721b, (Map<String, Object>) hashMap);
        if (this.f3722c.isEnabled()) {
            if (hashMap != null) {
                str2 = hashMap.toString();
            }
            e(str, str2);
        }
    }

    private H6 a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        Throwable th2;
        List list = null;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C0498k6) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        C0790w6 w6Var = new C0790w6((E6) null, (List<E6>) null, ((Xl) this.k).b());
        if (stackTraceElementArr != null) {
            list = Arrays.asList(stackTraceElementArr);
        }
        return I6.a(th2, w6Var, list, this.l.a(), this.l.b());
    }

    public void a(H6 h6) {
        this.i.a(h6, this.f3721b);
        b(h6);
    }

    public void a(C0790w6 w6Var) {
        C0814x6 x6Var = new C0814x6(w6Var, this.l.a(), this.l.b());
        T1 t1 = this.i;
        byte[] byteArray = MessageNano.toByteArray(this.f3727h.fromModel(x6Var));
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        t1.a((C0293c0) new J(byteArray, "", C0244a1.EVENT_TYPE_ANR.b(), cmVar), this.f3721b);
    }

    public void a(String str, JSONObject jSONObject) {
        T1 t1 = this.i;
        C0293c0 c0Var = new C0293c0();
        c0Var.f5574a = str;
        c0Var.f5578e = C0244a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b();
        c0Var.f5575b = jSONObject.toString();
        t1.a(c0Var, this.f3721b);
    }

    public void a(String str, String str2) {
        e(str, str2);
        C0315cm cmVar = this.f3722c;
        List<Integer> list = C0856z0.i;
        this.i.a(new J(str2, str, C0244a1.EVENT_TYPE_REGULAR.b(), 0, cmVar).a(C0832y0.JS), this.f3721b);
    }
}
