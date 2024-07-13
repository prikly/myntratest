package com.bytedance.sdk.openadsdk.h.a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.d.c.b.a;
import com.bytedance.sdk.component.d.d.d;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.a.b;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.bytedance.sdk.openadsdk.utils.u;
import org.json.JSONObject;

/* compiled from: LogStatsBase */
public class b<T extends b> implements a {

    /* renamed from: a  reason: collision with root package name */
    private String f1934a;

    /* renamed from: b  reason: collision with root package name */
    private String f1935b;

    /* renamed from: c  reason: collision with root package name */
    private String f1936c;

    /* renamed from: d  reason: collision with root package name */
    private String f1937d = d.d1657027613261dc("4/7-4+0");

    /* renamed from: e  reason: collision with root package name */
    private String f1938e;

    /* renamed from: f  reason: collision with root package name */
    private long f1939f = (System.currentTimeMillis() / 1000);

    /* renamed from: g  reason: collision with root package name */
    private int f1940g = 0;

    /* renamed from: h  reason: collision with root package name */
    private String f1941h;
    private int i = 0;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    public static b<b> b() {
        return new b<>();
    }

    @JProtect
    private JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(a.a1657027613264dc("or"), 1);
            jSONObject.put(a.a1657027613264dc("mnffh"), Build.MODEL);
            jSONObject.put(a.a1657027613264dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(a.a1657027613264dc("p`ahebcXfhgn"), u.d());
            jSONObject.put(a.a1657027613264dc("u`"), u.b());
            jSONObject.put(a.a1657027613264dc("g`kg"), com.com.bytedance.overseas.sdk.b.a.a().b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private T r() {
        return this;
    }

    public T a(int i2) {
        this.f1940g = i2;
        return r();
    }

    public T a(long j2) {
        this.f1939f = j2;
        return r();
    }

    public T a(String str) {
        this.f1934a = str;
        return r();
    }

    @JProtect
    public JSONObject a() {
        String a1657027613264dc;
        String f2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(c())) {
                jSONObject.put(a.a1657027613264dc("txrf"), c());
            }
            if (!TextUtils.isEmpty(e())) {
                jSONObject.put(a.a1657027613264dc("rhv"), e());
            }
            if (!TextUtils.isEmpty(f())) {
                jSONObject.put(a.a1657027613264dc("csgbplpbW`n"), f());
            }
            if (!TextUtils.isEmpty(g())) {
                jSONObject.put(a.a1657027613264dc("ae]p`nYqm{ybcc"), g());
            }
            if (!TextUtils.isEmpty(h())) {
                a1657027613264dc = a.a1657027613264dc("aqr\\r`ttafd");
                f2 = h();
            } else {
                a1657027613264dc = a.a1657027613264dc("aqr\\r`ttafd");
                f2 = u.f();
            }
            jSONObject.put(a1657027613264dc, f2);
            if (i() > 0) {
                jSONObject.put(a.a1657027613264dc("thofwqgjx"), i());
            }
            if (j() > 0) {
                jSONObject.put(a.a1657027613264dc("aevzt`"), j());
            }
            if (!TextUtils.isEmpty(k())) {
                jSONObject.put(a.a1657027613264dc("rds\\ma"), k());
            }
            jSONObject.put(a.a1657027613264dc("esplvZehll"), l());
            if (!TextUtils.isEmpty(m())) {
                jSONObject.put(a.a1657027613264dc("esplvZkto"), m());
            }
            if (!TextUtils.isEmpty(n())) {
                jSONObject.put(a.a1657027613264dc("eyvqe"), n());
            }
            if (!TextUtils.isEmpty(o())) {
                jSONObject.put(a.a1657027613264dc("ilcdaZsud"), o());
            }
            if (!TextUtils.isEmpty(d())) {
                jSONObject.put(a.a1657027613264dc("ewgmpZc|{k"), d());
            }
            if (!TextUtils.isEmpty(p())) {
                jSONObject.put(a.a1657027613264dc("dtpbplii"), p());
            }
            if (!TextUtils.isEmpty(h.d().f())) {
                jSONObject.put(a.a1657027613264dc("aqrj`"), h.d().f());
            }
            jSONObject.put(a.a1657027613264dc("cnlm[qwm"), NetworkTools.b(m.a()));
            jSONObject.put(a.a1657027613264dc("ddtjg`Ynfoe"), q());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public T b(int i2) {
        this.i = i2;
        return r();
    }

    public T b(String str) {
        this.m = str;
        return r();
    }

    public T c(String str) {
        this.f1935b = str;
        return r();
    }

    public String c() {
        return this.f1934a;
    }

    public T d(String str) {
        this.f1936c = str;
        return r();
    }

    public String d() {
        return this.m;
    }

    public T e(String str) {
        this.f1941h = str;
        return r();
    }

    public String e() {
        return this.f1935b;
    }

    public T f(String str) {
        this.j = str;
        return r();
    }

    public String f() {
        return this.f1936c;
    }

    public T g(String str) {
        this.k = str;
        return r();
    }

    public String g() {
        return this.f1937d;
    }

    public T h(String str) {
        this.n = str;
        return r();
    }

    public String h() {
        return this.f1938e;
    }

    public long i() {
        long j2 = this.f1939f;
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c2 = ']';
                c3 = ']';
            }
            while (true) {
                switch (c3) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c3 = '[';
                }
            }
        }
        return j2;
    }

    public int j() {
        int i2 = this.f1940g;
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c2 = ']';
                c3 = ']';
            }
            while (true) {
                switch (c3) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c3 = '[';
                }
            }
        }
        return i2;
    }

    public String k() {
        return this.f1941h;
    }

    public int l() {
        int i2 = this.i;
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c2 = ']';
                c3 = ']';
            }
            while (true) {
                switch (c3) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c3 = '[';
                }
            }
        }
        return i2;
    }

    public String m() {
        return this.j;
    }

    public String n() {
        return this.k;
    }

    public String o() {
        return this.l;
    }

    public String p() {
        return this.n;
    }
}
