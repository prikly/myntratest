package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.h;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONObject;

public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    public static final p4 f17013a = new p4();

    /* renamed from: b  reason: collision with root package name */
    public static int f17014b = 90000;

    /* renamed from: c  reason: collision with root package name */
    public static c f17015c;

    /* renamed from: d  reason: collision with root package name */
    public static b f17016d;

    /* renamed from: e  reason: collision with root package name */
    public static p5<n4, m4> f17017e;

    public static class a extends s<a> {
        public a() {
            super("rewarded_video", Constants.DEBUG_REWARDED_VIDEO);
        }
    }

    public static class b extends u<m4, n4, a> {
        public b(c cVar) {
            super(cVar, AdType.Rewarded, h.b());
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new m4((n4) rVar, adNetwork, d0Var);
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject.has("max_duration")) {
                o4.f17014b = jSONObject.optInt("max_duration", 0);
            }
        }

        public final void b(Context context) {
            b(context, new a());
        }

        public final String i() {
            return "rewarded_video_disabled";
        }

        public final r a(s sVar) {
            return new n4((a) sVar);
        }

        public final boolean a(r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b2;
            n4 n4Var = (n4) rVar;
            if (n4Var.f17077a.size() == 1 && (jSONObject = n4Var.G) != null && jSONObject == n4Var.a(i)) {
                String optString = n4Var.G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b2 = this.f17434e.b(optString)) != null && b2.isRewardedShowing()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isRewardedShowing() && this.f17436g.size() > 1) {
                AdRequestType adrequesttype = this.x;
                n4 n4Var = (n4) adrequesttype;
                int indexOf = this.f17436g.indexOf(adrequesttype);
                n4 n4Var2 = (n4) (indexOf > 0 ? (r) this.f17436g.get(indexOf - 1) : null);
                if (!(n4Var == null || n4Var2 == null || (adobjecttype = n4Var2.s) == null)) {
                    if (str.equals(((m4) adobjecttype).f16570c.getId())) {
                        n4Var.a(jSONObject);
                    }
                    o4.a().a(n4Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }
    }

    public static class c extends v2<m4, n4> {
        public c() {
            super(o4.f17013a);
        }

        public final void a(r rVar, j1 j1Var) {
            n4 n4Var = (n4) rVar;
            m4 m4Var = (m4) j1Var;
            if (o4.f17017e == null) {
                o4.f17017e = new p5<>();
            }
            o4.f17017e.getClass();
            k1.b();
            k1.a();
            this.f16300a.y = null;
            m4Var.f16569b.setRewardedShowing(false);
            c(n4Var);
        }

        public final boolean b() {
            return true;
        }

        public final boolean d(r rVar) {
            return ((n4) rVar).G == null;
        }

        public final void h(r rVar, l lVar) {
            n4 n4Var = (n4) rVar;
            m4 m4Var = (m4) lVar;
            if (this.f16300a.k()) {
                this.f16300a.c(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext());
            }
        }

        public final void j(r rVar, l lVar) {
            n4 n4Var = (n4) rVar;
            m4 m4Var = (m4) lVar;
            k1.a();
        }

        public final /* bridge */ /* synthetic */ boolean k(r rVar, l lVar, l2 l2Var) {
            n4 n4Var = (n4) rVar;
            m4 m4Var = (m4) lVar;
            return false;
        }

        public final void l(r rVar, l lVar) {
            n4 n4Var = (n4) rVar;
            m4 m4Var = (m4) lVar;
            n4Var.t = m4Var.f16570c.getEcpm();
            if (n4Var.G == m4Var.f16570c.getJsonData()) {
                n4Var.a((JSONObject) null);
            }
        }

        public final boolean p(r rVar, l lVar) {
            n4 n4Var = (n4) rVar;
            if (super.p(n4Var, (m4) lVar) || n4Var.a(0) == n4Var.G) {
                return true;
            }
            return false;
        }

        public final boolean q(r rVar, l lVar) {
            m4 m4Var = (m4) lVar;
            JSONObject jSONObject = ((n4) rVar).G;
            return jSONObject == null || (m4Var != null && jSONObject.optString(OSOutcomeConstants.OUTCOME_ID).equals(m4Var.f16570c.getId()));
        }

        public final void r(r rVar, l lVar) {
            ((m4) lVar).f16569b.setRewardedShowing(true);
            if (!((n4) rVar).f17084h && this.f16300a.k()) {
                n4 n4Var = (n4) this.f16300a.f();
                if (n4Var == null || n4Var.b()) {
                    this.f16300a.c(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext());
                }
            }
        }
    }

    public static b a() {
        b bVar = f17016d;
        if (bVar == null) {
            synchronized (u.class) {
                bVar = f17016d;
                if (bVar == null) {
                    bVar = new b(b());
                    f17016d = bVar;
                }
            }
        }
        return bVar;
    }

    public static boolean a(Activity activity, q qVar) {
        if (f17017e == null) {
            f17017e = new p5<>();
        }
        return f17017e.b(activity, qVar, a());
    }

    public static c b() {
        if (f17015c == null) {
            f17015c = new c();
        }
        return f17015c;
    }

    public static double c() {
        return a().e().c();
    }

    public static String d() {
        return a().e().d();
    }
}
