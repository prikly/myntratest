package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
public class Pd extends Kd {
    private static final Rd A = new Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);
    static final Rd p = new Rd("PREF_KEY_DEVICE_ID_", (String) null);
    static final Rd q = new Rd("PREF_KEY_UID_", (String) null);
    private static final Rd r = new Rd("PREF_KEY_HOST_URL_", (String) null);
    private static final Rd s = new Rd("PREF_KEY_REPORT_URL_", (String) null);
    private static final Rd t = new Rd("PREF_KEY_GET_AD_URL", (String) null);
    private static final Rd u = new Rd("PREF_KEY_REPORT_AD_URL", (String) null);
    private static final Rd v = new Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);
    private static final Rd w = new Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);
    private static final Rd x = new Rd("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null);
    static final Rd y = new Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);
    static final Rd z = new Rd("PREF_KEY_PINNING_UPDATE_URL", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private Rd f4768f;

    /* renamed from: g  reason: collision with root package name */
    private Rd f4769g;

    /* renamed from: h  reason: collision with root package name */
    private Rd f4770h;
    private Rd i;
    private Rd j;
    private Rd k;
    private Rd l;
    private Rd m;
    private Rd n;
    private Rd o;

    public Pd(Context context) {
        this(context, (String) null);
    }

    public long a(long j2) {
        return this.f4434b.getLong(this.l.a(), j2);
    }

    public String b(String str) {
        return this.f4434b.getString(this.f4768f.a(), (String) null);
    }

    public String c(String str) {
        return this.f4434b.getString(this.m.a(), (String) null);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_startupserviceinfopreferences";
    }

    public String d(String str) {
        return this.f4434b.getString(this.j.a(), (String) null);
    }

    public String e(String str) {
        return this.f4434b.getString(this.f4770h.a(), (String) null);
    }

    public String f(String str) {
        return this.f4434b.getString(this.k.a(), (String) null);
    }

    public String g(String str) {
        return this.f4434b.getString(this.i.a(), (String) null);
    }

    public String h(String str) {
        return this.f4434b.getString(this.f4769g.a(), (String) null);
    }

    public Pd i(String str) {
        return (Pd) a(this.f4768f.a(), str);
    }

    public Pd j(String str) {
        return (Pd) a(this.f4769g.a(), str);
    }

    public Pd(Context context, String str) {
        super(context, str);
        this.f4768f = new Rd(p.b());
        this.f4769g = new Rd(q.b(), c());
        this.f4770h = new Rd(r.b(), c());
        this.i = new Rd(s.b(), c());
        this.j = new Rd(t.b(), c());
        this.k = new Rd(u.b(), c());
        this.l = new Rd(v.b(), c());
        this.m = new Rd(w.b(), c());
        this.n = new Rd(x.b(), c());
        this.o = new Rd(A.b(), c());
    }

    public static void b(Context context) {
        C0267b.a(context, "_startupserviceinfopreferences").edit().remove(p.b()).apply();
    }

    public void f() {
        a(this.f4768f.a()).a(this.f4769g.a()).a(this.f4770h.a()).a(this.i.a()).a(this.j.a()).a(this.k.a()).a(this.l.a()).a(this.o.a()).a(this.m.a()).a(this.n.b()).a(y.b()).a(z.b()).b();
    }
}
