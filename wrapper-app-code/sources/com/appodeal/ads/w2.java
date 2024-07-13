package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.h;
import com.onesignal.outcomes.OSOutcomeConstants;
import org.json.JSONObject;

public final class w2 {

    /* renamed from: a  reason: collision with root package name */
    public static c f17618a;

    /* renamed from: b  reason: collision with root package name */
    public static b f17619b;

    /* renamed from: c  reason: collision with root package name */
    public static p5<q5, o5> f17620c;

    public static class a extends s<a> {
        public a() {
            super("video", Constants.DEBUG_NON_REWARDED_VIDEO);
        }
    }

    public static class b extends u<o5, q5, a> {
        public b(c cVar) {
            super(cVar, AdType.Video, h.b());
            this.z = 1.1f;
            this.A = 1.4f;
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new o5((q5) rVar, adNetwork, d0Var);
        }

        public final void a(JSONObject jSONObject) {
        }

        public final void b(Context context) {
            q1.a().f17038e.a(context, new a());
        }

        public final String i() {
            return "video_disabled";
        }

        public final boolean k() {
            return q1.a().f17036c;
        }

        public final r a(s sVar) {
            return new q5((a) sVar);
        }

        public final boolean a(r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b2;
            q5 q5Var = (q5) rVar;
            if (q5Var.f17077a.size() == 1 && (jSONObject = q5Var.G) != null && jSONObject == q5Var.a(i)) {
                String optString = q5Var.G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b2 = this.f17434e.b(optString)) != null && b2.isVideoShowing()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isVideoShowing() && this.f17436g.size() > 1) {
                AdRequestType adrequesttype = this.x;
                q5 q5Var = (q5) adrequesttype;
                int indexOf = this.f17436g.indexOf(adrequesttype);
                q5 q5Var2 = (q5) (indexOf > 0 ? (r) this.f17436g.get(indexOf - 1) : null);
                if (!(q5Var == null || q5Var2 == null || (adobjecttype = q5Var2.s) == null)) {
                    if (str.equals(((o5) adobjecttype).f16570c.getId())) {
                        q5Var.a(jSONObject);
                    }
                    w2.a().a(q5Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }

        public final void a(Context context, a aVar) {
            q4.f17047a.getClass();
            if (q4.p()) {
                h5.f16458a.post($$Lambda$t7wn7tiegreeNiUeBj9sJSbvJDM.INSTANCE);
                return;
            }
            super.a(context, aVar);
        }
    }

    public static class c extends v2<o5, q5> {
        public c() {
            super(q1.a().f17038e);
        }

        public final void a(r rVar, j1 j1Var) {
            q5 q5Var = (q5) rVar;
            o5 o5Var = (o5) j1Var;
            if (w2.f17620c == null) {
                w2.f17620c = new p5<>();
            }
            w2.f17620c.getClass();
            k1.b();
            k1.a();
            this.f16300a.y = null;
            o5Var.f16569b.setVideoShowing(false);
            c(q5Var);
        }

        public final boolean b() {
            return true;
        }

        public final boolean d(r rVar) {
            return ((q5) rVar).G == null;
        }

        public final void i(r rVar, l lVar) {
            q5 q5Var = (q5) rVar;
            o5 o5Var = (o5) lVar;
            q1.a().f17038e.f17041c = true;
        }

        public final void j(r rVar, l lVar) {
            q5 q5Var = (q5) rVar;
            o5 o5Var = (o5) lVar;
            k1.a();
            if (q5Var != null && !this.f16300a.f17436g.isEmpty()) {
                q1.a().f17038e.f17041c = true;
            }
        }

        public final /* bridge */ /* synthetic */ boolean k(r rVar, l lVar, l2 l2Var) {
            q5 q5Var = (q5) rVar;
            o5 o5Var = (o5) lVar;
            return false;
        }

        public final void l(r rVar, l lVar) {
            q5 q5Var = (q5) rVar;
            o5 o5Var = (o5) lVar;
            q5Var.t = o5Var.f16570c.getEcpm();
            if (q5Var.G == o5Var.f16570c.getJsonData()) {
                q5Var.a((JSONObject) null);
            }
        }

        public final boolean p(r rVar, l lVar) {
            q5 q5Var = (q5) rVar;
            if (super.p(q5Var, (o5) lVar) || q5Var.a(0) == q5Var.G) {
                return true;
            }
            return false;
        }

        public final boolean q(r rVar, l lVar) {
            o5 o5Var = (o5) lVar;
            JSONObject jSONObject = ((q5) rVar).G;
            return jSONObject == null || (o5Var != null && jSONObject.optString(OSOutcomeConstants.OUTCOME_ID).equals(o5Var.f16570c.getId()));
        }

        public final void r(r rVar, l lVar) {
            q5 q5Var = (q5) rVar;
            ((o5) lVar).f16569b.setVideoShowing(true);
        }
    }

    public static b a() {
        b bVar = f17619b;
        if (bVar == null) {
            synchronized (u.class) {
                bVar = f17619b;
                if (bVar == null) {
                    bVar = new b(b());
                    f17619b = bVar;
                }
            }
        }
        return bVar;
    }

    public static boolean a(Activity activity, q qVar) {
        if (f17620c == null) {
            f17620c = new p5<>();
        }
        return f17620c.b(activity, qVar, a());
    }

    public static c b() {
        if (f17618a == null) {
            f17618a = new c();
        }
        return f17618a;
    }
}
