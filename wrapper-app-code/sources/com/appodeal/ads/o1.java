package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.h;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONObject;

public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static b f17007a;

    /* renamed from: b  reason: collision with root package name */
    public static a f17008b;

    /* renamed from: c  reason: collision with root package name */
    public static k1<r1, p1> f17009c;

    public static class a extends u<p1, r1, c> {
        public a(b bVar) {
            super(bVar, AdType.Interstitial, h.b());
            this.z = 1.1f;
            this.A = 1.4f;
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new p1((r1) rVar, adNetwork, d0Var);
        }

        public final void a(JSONObject jSONObject) {
        }

        public final void b(Context context) {
            q1.a().f17037d.a(context, new c());
        }

        public final String i() {
            return "interstitials_disabled";
        }

        public final boolean k() {
            return q1.a().f17036c;
        }

        public final r a(s sVar) {
            return new r1((c) sVar);
        }

        public final boolean a(r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b2;
            r1 r1Var = (r1) rVar;
            if (r1Var.f17077a.size() == 1 && (jSONObject = r1Var.G) != null && jSONObject == r1Var.a(i)) {
                String optString = r1Var.G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b2 = this.f17434e.b(optString)) != null && b2.isInterstitialShowing()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isInterstitialShowing() && this.f17436g.size() > 1) {
                AdRequestType adrequesttype = this.x;
                r1 r1Var = (r1) adrequesttype;
                int indexOf = this.f17436g.indexOf(adrequesttype);
                r1 r1Var2 = (r1) (indexOf > 0 ? (r) this.f17436g.get(indexOf - 1) : null);
                if (!(r1Var == null || r1Var2 == null || (adobjecttype = r1Var2.s) == null)) {
                    if (str.equals(((p1) adobjecttype).f16570c.getId())) {
                        r1Var.a(jSONObject);
                    }
                    o1.a().a(r1Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }

        public final void a(Context context, s sVar) {
            c cVar = (c) sVar;
            q4.f17047a.getClass();
            if (q4.p()) {
                h5.f16458a.post(new n1());
                return;
            }
            super.a(context, cVar);
        }
    }

    public static class b extends v2<p1, r1> {
        public b() {
            super(q1.a().f17037d);
        }

        public final void a(r rVar, j1 j1Var) {
            r1 r1Var = (r1) rVar;
            p1 p1Var = (p1) j1Var;
            if (o1.f17009c == null) {
                o1.f17009c = new k1<>();
            }
            o1.f17009c.getClass();
            k1.b();
            k1.a();
            this.f16300a.y = null;
            p1Var.f16569b.setInterstitialShowing(false);
            if (!r1Var.z && this.f16300a.q > 0 && r1Var.m > 0 && System.currentTimeMillis() - r1Var.m >= ((long) this.f16300a.q)) {
                i(r1Var, p1Var, (l2) null);
            }
            c(r1Var);
        }

        public final boolean d(r rVar) {
            return ((r1) rVar).G == null;
        }

        public final void i(r rVar, l lVar) {
            r1 r1Var = (r1) rVar;
            p1 p1Var = (p1) lVar;
            q1.a().f17037d.f17041c = true;
        }

        public final void j(r rVar, l lVar) {
            r1 r1Var = (r1) rVar;
            p1 p1Var = (p1) lVar;
            k1.a();
            if (r1Var != null && !this.f16300a.f17436g.isEmpty()) {
                q1.a().f17037d.f17041c = true;
            }
        }

        public final boolean k(r rVar, l lVar, l2 l2Var) {
            p1 p1Var = (p1) lVar;
            if (!(!((r1) rVar).z) || this.f16300a.q <= 0) {
                return false;
            }
            return true;
        }

        public final void l(r rVar, l lVar) {
            r1 r1Var = (r1) rVar;
            p1 p1Var = (p1) lVar;
            r1Var.t = p1Var.f16570c.getEcpm();
            if (r1Var.G == p1Var.f16570c.getJsonData()) {
                r1Var.a((JSONObject) null);
            }
        }

        public final boolean p(r rVar, l lVar) {
            r1 r1Var = (r1) rVar;
            if (super.p(r1Var, (p1) lVar) || r1Var.a(0) == r1Var.G) {
                return true;
            }
            return false;
        }

        public final boolean q(r rVar, l lVar) {
            p1 p1Var = (p1) lVar;
            JSONObject jSONObject = ((r1) rVar).G;
            return jSONObject == null || (p1Var != null && jSONObject.optString(OSOutcomeConstants.OUTCOME_ID).equals(p1Var.f16570c.getId()));
        }

        public final void r(r rVar, l lVar) {
            r1 r1Var = (r1) rVar;
            ((p1) lVar).f16569b.setInterstitialShowing(true);
        }
    }

    public static class c extends s<c> {
        public c() {
            super("banner", Constants.DEBUG_INTERSTITIAL);
        }
    }

    public static a a() {
        a aVar = f17008b;
        if (aVar == null) {
            synchronized (u.class) {
                aVar = f17008b;
                if (aVar == null) {
                    aVar = new a(b());
                    f17008b = aVar;
                }
            }
        }
        return aVar;
    }

    public static boolean a(Activity activity, q qVar) {
        if (f17009c == null) {
            f17009c = new k1<>();
        }
        return f17009c.b(activity, qVar, a());
    }

    public static b b() {
        if (f17007a == null) {
            f17007a = new b();
        }
        return f17007a;
    }
}
