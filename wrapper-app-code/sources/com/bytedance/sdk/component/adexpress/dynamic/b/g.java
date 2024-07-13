package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.graphics.Color;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.c.l;

/* compiled from: DynamicLayoutNativeValue */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f18517a;

    /* renamed from: b  reason: collision with root package name */
    public String f18518b;

    /* renamed from: c  reason: collision with root package name */
    private f f18519c;

    /* renamed from: d  reason: collision with root package name */
    private e f18520d;

    /* renamed from: e  reason: collision with root package name */
    private String f18521e;

    public g(e eVar) {
        this.f18520d = eVar;
        this.f18517a = eVar.a();
        this.f18518b = eVar.c();
        this.f18521e = eVar.d();
        if (c.c() == 1) {
            this.f18519c = eVar.f();
        } else {
            this.f18519c = eVar.e();
        }
        if (c.b()) {
            this.f18519c = eVar.e();
        }
    }

    public int a() {
        return (int) this.f18519c.f();
    }

    public int b() {
        return (int) this.f18519c.i();
    }

    public int c() {
        return (int) this.f18519c.g();
    }

    public int d() {
        return (int) this.f18519c.h();
    }

    public float e() {
        return this.f18519c.j();
    }

    public String f() {
        return this.f18517a == 0 ? this.f18518b : "";
    }

    public int g() {
        return a(this.f18519c.n());
    }

    public int h() {
        String m = this.f18519c.m();
        if ("left".equals(m)) {
            return 2;
        }
        if ("center".equals(m)) {
            return 4;
        }
        if ("right".equals(m)) {
            return 3;
        }
        return 2;
    }

    public int i() {
        int h2 = h();
        if (h2 == 4) {
            return 17;
        }
        return h2 == 3 ? 5 : 3;
    }

    public String j() {
        int i = this.f18517a;
        if (i == 2 || i == 13) {
            return this.f18518b;
        }
        return "";
    }

    public String k() {
        return this.f18517a == 1 ? this.f18518b : "";
    }

    public String l() {
        return this.f18521e;
    }

    public double m() {
        if (this.f18517a == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f18518b);
                return !c.b() ? (double) ((int) parseDouble) : parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double n() {
        return this.f18519c.k();
    }

    public float o() {
        return this.f18519c.c();
    }

    public int p() {
        return a(this.f18519c.p());
    }

    public float q() {
        return this.f18519c.d();
    }

    public int r() {
        return this.f18519c.af();
    }

    public boolean s() {
        return this.f18519c.ag();
    }

    public void a(float f2) {
        this.f18519c.a(f2);
    }

    public boolean t() {
        return this.f18519c.y();
    }

    public int u() {
        return this.f18519c.z();
    }

    public int v() {
        String u = this.f18519c.u();
        if ("skip-with-time-skip-btn".equals(this.f18520d.b()) || "skip".equals(this.f18520d.b()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f18520d.b())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f18520d.b()) && !"skip-with-time".equals(this.f18520d.b())) {
            if (this.f18517a == 10 && TextUtils.equals(this.f18519c.v(), Constants.CLICK)) {
                return 5;
            }
            if (L() && M()) {
                return 0;
            }
            if (L()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f18520d.b())) {
                return 3;
            }
            if (!TextUtils.isEmpty(u) && !u.equals("none")) {
                if (u.equals("video") || (this.f18520d.a() == 7 && TextUtils.equals(u, "normal"))) {
                    return (!c.b() || this.f18520d.e() == null || !this.f18520d.e().ai()) ? 4 : 11;
                }
                if (u.equals("normal")) {
                    return 1;
                }
                if (!u.equals("creative") && !"slide".equals(this.f18519c.v())) {
                    return 0;
                }
                return 2;
            }
        }
        return 0;
    }

    private boolean L() {
        return "logo-union".equals(this.f18520d.b()) || "logounion".equals(this.f18520d.b()) || "logoad".equals(this.f18520d.b());
    }

    public int w() {
        return a(this.f18519c.o());
    }

    public int x() {
        return this.f18519c.a();
    }

    public String y() {
        return this.f18519c.b();
    }

    public String z() {
        return this.f18519c.v();
    }

    private boolean M() {
        if (c.b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f18518b) || !this.f18518b.contains("adx:")) && !l.b()) {
            return false;
        }
        return true;
    }

    public static int a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba") || (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) == null || split.length != 4) {
            return -16777216;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
    }

    public static float[] b(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split == null || split.length != 4) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    public boolean a(int i) {
        e eVar = this.f18520d;
        if (eVar == null) {
            return false;
        }
        if (i == 1) {
            this.f18519c = eVar.f();
        } else {
            this.f18519c = eVar.e();
        }
        if (this.f18519c != null) {
            return true;
        }
        return false;
    }

    public boolean A() {
        return this.f18519c.R();
    }

    public int B() {
        return this.f18519c.T();
    }

    public int C() {
        return this.f18519c.S();
    }

    public String D() {
        return this.f18519c.t();
    }

    public int E() {
        return this.f18519c.ae();
    }

    public int F() {
        return this.f18519c.aj();
    }

    public int G() {
        return this.f18519c.ab();
    }

    public int H() {
        return this.f18519c.aa();
    }

    public String I() {
        return this.f18519c.s();
    }

    public boolean J() {
        return this.f18519c.e();
    }

    public String K() {
        return this.f18520d.b() + ":" + this.f18519c.ad();
    }
}
