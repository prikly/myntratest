package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.x5;

public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public static final i2 f16451a = new i2();

    /* renamed from: b  reason: collision with root package name */
    public static c f16452b;

    /* renamed from: c  reason: collision with root package name */
    public static b f16453c;

    /* renamed from: d  reason: collision with root package name */
    public static a f16454d;

    public static class a extends x5<k2, j2> {
        public a() {
            super(a.VIEW);
        }

        public final boolean a(View view) {
            return view instanceof MrecView;
        }

        public final void c(Activity activity) {
            h2.a().b((Context) activity, new d());
        }
    }

    public static class b extends a6<j2, k2, d> {
        public b(c cVar) {
            super(cVar, AdType.Mrec);
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new j2((k2) rVar, adNetwork, d0Var);
        }

        public final String i() {
            return "mrec_disabled";
        }

        public final s w() {
            return new d();
        }

        public final x5<k2, j2> x() {
            return h2.c();
        }

        public final r a(s sVar) {
            return new k2((d) sVar);
        }
    }

    public static class c extends b6<j2, k2> {
        public c() {
            super(h2.f16451a);
        }

        public final x5<k2, j2> c() {
            return h2.c();
        }
    }

    public static class d extends s<d> {
        public d() {
            super(Constants.MREC, Constants.DEBUG_MREC);
        }
    }

    public static b a() {
        b bVar = f16453c;
        if (bVar == null) {
            synchronized (u.class) {
                bVar = f16453c;
                if (bVar == null) {
                    bVar = new b(b());
                    f16453c = bVar;
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

    public static c b() {
        if (f16452b == null) {
            f16452b = new c();
        }
        return f16452b;
    }

    public static a c() {
        if (f16454d == null) {
            f16454d = new a();
        }
        return f16454d;
    }
}
