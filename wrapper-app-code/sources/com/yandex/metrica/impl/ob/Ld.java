package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

@Deprecated
public class Ld extends Kd {
    private static final Rd l = new Rd(IronSourceConstants.TYPE_UUID, (String) null);
    private static final Rd m = new Rd("DEVICEID_3", (String) null);
    private static final Rd n = new Rd("AD_URL_GET", (String) null);
    private static final Rd o = new Rd("AD_URL_REPORT", (String) null);
    private static final Rd p = new Rd("HOST_URL", (String) null);
    private static final Rd q = new Rd("SERVER_TIME_OFFSET", (String) null);
    private static final Rd r = new Rd("CLIDS", (String) null);

    /* renamed from: f  reason: collision with root package name */
    private Rd f4487f = new Rd(l.b());

    /* renamed from: g  reason: collision with root package name */
    private Rd f4488g = new Rd(m.b());

    /* renamed from: h  reason: collision with root package name */
    private Rd f4489h = new Rd(n.b());
    private Rd i = new Rd(o.b());
    private Rd j;
    private Rd k;

    public Ld(Context context) {
        super(context, (String) null);
        new Rd(p.b());
        this.j = new Rd(q.b());
        this.k = new Rd(r.b());
    }

    public long a(long j2) {
        return this.f4434b.getLong(this.j.b(), j2);
    }

    public String b(String str) {
        return this.f4434b.getString(this.f4489h.a(), (String) null);
    }

    public String c(String str) {
        return this.f4434b.getString(this.i.a(), (String) null);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "_startupinfopreferences";
    }

    public String d(String str) {
        return this.f4434b.getString(this.k.a(), (String) null);
    }

    public String e(String str) {
        return this.f4434b.getString(this.f4488g.a(), (String) null);
    }

    public String f(String str) {
        return this.f4434b.getString(this.f4487f.a(), (String) null);
    }

    public Map<String, ?> g() {
        return this.f4434b.getAll();
    }

    public Ld f() {
        return (Ld) e();
    }
}
