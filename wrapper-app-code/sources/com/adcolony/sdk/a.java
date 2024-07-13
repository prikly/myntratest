package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import com.adcolony.sdk.e0;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f9872a = null;

    /* renamed from: b  reason: collision with root package name */
    private static k f9873b = null;

    /* renamed from: c  reason: collision with root package name */
    static boolean f9874c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f9875d = false;

    /* renamed from: e  reason: collision with root package name */
    static boolean f9876e = false;

    static void a(AdColonyAppOptions adColonyAppOptions) {
        f9876e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    static k b() {
        if (!d()) {
            Context a2 = a();
            if (a2 == null) {
                return new k();
            }
            f9873b = new k();
            f9873b.a(new AdColonyAppOptions().a(c0.h(c0.c(a2.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), "appId")), false);
        }
        return f9873b;
    }

    static boolean c() {
        return f9872a != null;
    }

    static boolean d() {
        return f9873b != null;
    }

    static boolean e() {
        return f9874c;
    }

    static void f() {
        b().r().j();
    }

    static void a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        a((!z || !(context instanceof Activity)) ? context : ((Activity) context).getApplication());
        f9875d = true;
        if (f9873b == null) {
            f9873b = new k();
            adColonyAppOptions.b(context);
            f9873b.a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.b(context);
            f9873b.a(adColonyAppOptions);
        }
        a(adColonyAppOptions);
        q n = f9873b.n();
        n.a(context);
        n.b(context);
        new e0.a().a("Configuring AdColony").a(e0.f10041d);
        f9873b.c(false);
        f9873b.x().g(false);
        f9873b.d(true);
        f9873b.x().c(false);
        f9873b.x().d(true);
    }

    static void b(String str, j0 j0Var) {
        b().r().b(str, j0Var);
    }

    static void a(Context context) {
        f9872a = context;
    }

    static Context a() {
        return f9872a;
    }

    static void a(String str, j0 j0Var) {
        b().r().a(str, j0Var);
    }

    static j0 a(String str, j0 j0Var, boolean z) {
        b().r().a(str, j0Var);
        return j0Var;
    }

    static void a(String str, f1 f1Var) {
        if (f1Var == null) {
            f1Var = c0.b();
        }
        c0.a(f1Var, "m_type", str);
        b().r().c(f1Var);
    }
}
