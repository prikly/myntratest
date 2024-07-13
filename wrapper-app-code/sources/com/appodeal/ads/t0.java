package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.x5;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f17413a = new u0();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17414b = true;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f17415c = true;

    /* renamed from: d  reason: collision with root package name */
    public static c f17416d;

    /* renamed from: e  reason: collision with root package name */
    public static b f17417e;

    /* renamed from: f  reason: collision with root package name */
    public static a f17418f;

    public static class a extends x5<w0, v0> {
        public a() {
            super(a.BOTTOM);
        }

        public final boolean a(View view) {
            return view instanceof BannerView;
        }

        public final void c(Activity activity) {
            t0.a().b((Context) activity, new d());
        }
    }

    public static class b extends a6<v0, w0, d> {
        public b(c cVar) {
            super(cVar, AdType.Banner);
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new v0((w0) rVar, adNetwork, d0Var);
        }

        public final String i() {
            return "banners_disabled";
        }

        public final s w() {
            return new d();
        }

        public final x5<w0, v0> x() {
            return t0.c();
        }

        public final r a(s sVar) {
            return new w0((d) sVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
            r0 = r0.u;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.res.Configuration r3) {
            /*
                r2 = this;
                com.appodeal.ads.r r0 = r2.f()
                com.appodeal.ads.w0 r0 = (com.appodeal.ads.w0) r0
                if (r0 == 0) goto L_0x0033
                AdObjectType r0 = r0.s
                com.appodeal.ads.v0 r0 = (com.appodeal.ads.v0) r0
                if (r0 == 0) goto L_0x0028
                UnifiedAdType r1 = r0.f16573f
                com.appodeal.ads.unified.UnifiedBanner r1 = (com.appodeal.ads.unified.UnifiedBanner) r1
                if (r1 == 0) goto L_0x0025
                boolean r1 = r1.isRefreshOnRotate()
                if (r1 == 0) goto L_0x0025
                int r0 = r0.u
                r1 = -1
                if (r0 == r1) goto L_0x0025
                int r3 = r3.orientation
                if (r0 == r3) goto L_0x0025
                r3 = 1
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x0033
            L_0x0028:
                com.appodeal.ads.context.b r3 = com.appodeal.ads.context.b.f16327b
                com.appodeal.ads.context.f r3 = r3.f16328a
                android.content.Context r3 = r3.getApplicationContext()
                r2.c(r3)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.t0.b.a(android.content.res.Configuration):void");
        }
    }

    public static class c extends b6<v0, w0> {
        public c() {
            super(t0.f17413a);
        }

        public final x5<w0, v0> c() {
            return t0.c();
        }
    }

    public static class d extends s<d> {
        public d() {
            super(Constants.BANNER, Constants.DEBUG_BANNER);
        }
    }

    public static b a() {
        b bVar = f17417e;
        if (bVar == null) {
            synchronized (u.class) {
                bVar = f17417e;
                if (bVar == null) {
                    bVar = new b(b());
                    f17417e = bVar;
                }
            }
        }
        return bVar;
    }

    public static void a(Activity activity) {
        a c2 = c();
        b a2 = a();
        x5.d a3 = c2.a(activity);
        a3.f17694a = null;
        a3.f17695b = f0.HIDDEN;
        if (c2.f17684c != null) {
            h5.f16458a.post(new v5(c2, a2));
        }
    }

    public static boolean a(Activity activity, y5 y5Var) {
        return c().a(activity, y5Var, a());
    }

    public static boolean a(Context context) {
        return f17415c && f1.r(context) && f1.p(context) >= 728.0f;
    }

    public static c b() {
        if (f17416d == null) {
            f17416d = new c();
        }
        return f17416d;
    }

    public static a c() {
        if (f17418f == null) {
            f17418f = new a();
        }
        return f17418f;
    }
}
