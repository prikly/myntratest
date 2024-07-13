package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0659qi;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Sh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.f9  reason: case insensitive filesystem */
public class C0377f9 extends C0327d9 {
    @Deprecated
    private static final Rd A = new Rd("PREF_KEY_REPORT_URL_", (String) null);
    private static final Rd B = new Rd("PREF_KEY_REPORT_URLS_", (String) null);
    @Deprecated
    private static final Rd C = new Rd("PREF_L_URL", (String) null);
    private static final Rd D = new Rd("PREF_L_URLS", (String) null);
    private static final Rd E = new Rd("PREF_KEY_GET_AD_URL", (String) null);
    private static final Rd F = new Rd("PREF_KEY_REPORT_AD_URL", (String) null);
    private static final Rd G = new Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);
    private static final Rd H = new Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);
    static final Rd I = new Rd("PREF_KEY_DEVICE_ID_", (String) null);
    private static final Rd J = new Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);
    @Deprecated
    private static final Rd K = new Rd("PREF_KEY_PINNING_UPDATE_URL", (String) null);
    private static final Rd L = new Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);
    private static final Rd M = new Rd("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", (String) null);
    private static final Rd N = new Rd("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", (String) null);
    private static final Rd O = new Rd("PREF_KEY_FEATURES_COLLECTING_ENABLED_", (String) null);
    private static final Rd P = new Rd("SOCKET_CONFIG_", (String) null);
    private static final Rd Q = new Rd("LAST_STARTUP_REQUEST_CLIDS", (String) null);
    static final Rd w = new Rd("PREF_KEY_UID_", (String) null);
    private static final Rd x = new Rd("PREF_KEY_HOST_URL_", (String) null);
    private static final Rd y = new Rd("PREF_KEY_HOST_URLS_FROM_STARTUP", (String) null);
    private static final Rd z = new Rd("PREF_KEY_HOST_URLS_FROM_CLIENT", (String) null);

    /* renamed from: c  reason: collision with root package name */
    private Rd f5797c = new Rd(I.b());

    /* renamed from: d  reason: collision with root package name */
    private Rd f5798d = d(w.b());

    /* renamed from: e  reason: collision with root package name */
    private Rd f5799e = d(x.b());

    /* renamed from: f  reason: collision with root package name */
    private Rd f5800f = d(y.b());

    /* renamed from: g  reason: collision with root package name */
    private Rd f5801g = d(z.b());
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private Rd f5802h = d(A.b());
    private Rd i = d(B.b());
    @Deprecated
    private Rd j = d(C.b());
    private Rd k = d(D.b());
    private Rd l = d(E.b());
    private Rd m = d(F.b());
    private Rd n = d(G.b());
    private Rd o = d(H.b());
    private Rd p = d(J.b());
    private Rd q = d(L.b());
    private Rd r = d(M.b());
    private Rd s = d(N.b());
    private Rd t = d(O.b());
    private Rd u = d(P.b());
    private Rd v = d(Q.b());

    public C0377f9(S7 s7, String str) {
        super(s7, str);
    }

    public C0377f9 a(List<String> list) {
        return (C0377f9) b(this.k.a(), Tl.c(list));
    }

    public C0377f9 b(List<String> list) {
        return (C0377f9) b(this.i.a(), Tl.c(list));
    }

    public void f() {
        f(K.a());
        f(this.f5797c.a());
        f(this.l.a());
        f(this.r.a());
        f(this.q.a());
        f(this.o.a());
        f(this.t.a());
        f(this.f5799e.a());
        f(this.f5801g.a());
        f(this.f5800f.a());
        f(this.v.a());
        f(this.j.a());
        f(this.k.a());
        f(this.n.a());
        f(this.s.a());
        f(this.m.a());
        f(this.f5802h.a());
        f(this.i.a());
        f(this.u.a());
        f(this.p.a());
        f(this.f5798d.a());
        f(d(new Rd("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null).b()).a());
        d();
    }

    @Deprecated
    public C0659qi g() {
        C0336di diVar;
        C0659qi.b bVar;
        C0659qi.b bVar2;
        C0659qi.b i2 = new C0659qi.b(new Sh(new Sh.a().d(a(this.q.a(), Sh.b.f4969b)).m(a(this.r.a(), Sh.b.f4970c)).n(a(this.s.a(), Sh.b.f4971d)).f(a(this.t.a(), Sh.b.f4972e)))).k(e(this.f5798d.a())).c(Tl.c(e(this.f5800f.a()))).b(Tl.c(e(this.f5801g.a()))).e(e(this.o.a())).i(Tl.c(e(this.i.a()))).e(Tl.c(e(this.k.a()))).f(e(this.l.a())).i(e(this.m.a()));
        String e2 = e(this.u.a());
        try {
            if (TextUtils.isEmpty(e2)) {
                bVar = i2;
                diVar = null;
                return bVar.a(diVar).h(e(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1)).a();
            }
            JSONObject jSONObject = new JSONObject(e2);
            If.q qVar = new If.q();
            long j2 = jSONObject.getLong("seconds_to_live");
            String string = jSONObject.getString("token");
            JSONArray jSONArray = jSONObject.getJSONArray("ports");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i3)));
            }
            bVar2 = i2;
            try {
                diVar = new C0336di(j2, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", qVar.f4232g), qVar.f4233h, qVar.i, qVar.j);
                bVar = bVar2;
            } catch (Throwable unused) {
                bVar = bVar2;
                diVar = null;
                return bVar.a(diVar).h(e(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1)).a();
            }
            return bVar.a(diVar).h(e(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1)).a();
        } catch (Throwable unused2) {
            bVar2 = i2;
            bVar = bVar2;
            diVar = null;
            return bVar.a(diVar).h(e(this.v.a())).c(a(this.p.a(), true)).c(a(this.n.a(), -1)).a();
        }
    }

    @Deprecated
    public String h(String str) {
        return a(this.f5802h.a(), (String) null);
    }

    @Deprecated
    public C0377f9 i(String str) {
        return (C0377f9) b(this.f5797c.a(), str);
    }

    public C0377f9 j(String str) {
        return (C0377f9) b(this.o.a(), str);
    }

    public C0377f9 k(String str) {
        return (C0377f9) b(this.l.a(), str);
    }

    public C0377f9 l(String str) {
        return (C0377f9) b(this.f5799e.a(), str);
    }

    public C0377f9 m(String str) {
        return (C0377f9) b(this.m.a(), str);
    }

    @Deprecated
    public C0377f9 n(String str) {
        return (C0377f9) b(this.f5802h.a(), str);
    }

    public C0377f9 o(String str) {
        return (C0377f9) b(this.f5798d.a(), str);
    }

    public C0377f9 a(boolean z2) {
        return (C0377f9) b(this.p.a(), z2);
    }

    public C0377f9 b(long j2) {
        return (C0377f9) b(this.n.a(), j2);
    }

    @Deprecated
    public String g(String str) {
        return a(this.j.a(), (String) null);
    }
}
