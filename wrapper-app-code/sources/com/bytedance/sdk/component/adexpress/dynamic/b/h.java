package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.text.TextUtils;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutUnit */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private String f18522a;

    /* renamed from: b  reason: collision with root package name */
    private float f18523b;

    /* renamed from: c  reason: collision with root package name */
    private float f18524c;

    /* renamed from: d  reason: collision with root package name */
    private float f18525d;

    /* renamed from: e  reason: collision with root package name */
    private float f18526e;

    /* renamed from: f  reason: collision with root package name */
    private float f18527f;

    /* renamed from: g  reason: collision with root package name */
    private float f18528g;

    /* renamed from: h  reason: collision with root package name */
    private float f18529h;
    private e i;
    private List<h> j;
    private h k;
    private List<List<h>> l;
    private String m;

    public String a() {
        return this.m;
    }

    public void a(String str) {
        this.m = str;
    }

    public String b() {
        return this.f18522a;
    }

    public void b(String str) {
        this.f18522a = str;
    }

    public float c() {
        return this.f18525d;
    }

    public void a(float f2) {
        this.f18525d = f2;
    }

    public float d() {
        return this.f18526e;
    }

    public void b(float f2) {
        this.f18526e = f2;
    }

    public float e() {
        return this.f18523b;
    }

    public void c(float f2) {
        this.f18523b = f2;
    }

    public float f() {
        return this.f18524c;
    }

    public void d(float f2) {
        this.f18524c = f2;
    }

    public float g() {
        return this.f18527f;
    }

    public void e(float f2) {
        this.f18527f = f2;
    }

    public float h() {
        return this.f18528g;
    }

    public void f(float f2) {
        this.f18528g = f2;
    }

    public void g(float f2) {
        this.f18529h = f2;
    }

    public e i() {
        return this.i;
    }

    public void a(e eVar) {
        this.i = eVar;
    }

    public List<h> j() {
        return this.j;
    }

    public void a(List<h> list) {
        this.j = list;
    }

    public void a(h hVar) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(hVar);
    }

    public void b(h hVar) {
        this.k = hVar;
    }

    public h k() {
        return this.k;
    }

    public int l() {
        f e2 = this.i.e();
        return e2.C() + e2.D();
    }

    public int m() {
        f e2 = this.i.e();
        return e2.A() + e2.B();
    }

    public float n() {
        f e2 = this.i.e();
        return ((float) l()) + e2.g() + e2.h() + (e2.d() * 2.0f);
    }

    public float o() {
        f e2 = this.i.e();
        return ((float) m()) + e2.i() + e2.f() + (e2.d() * 2.0f);
    }

    public void b(List<List<h>> list) {
        this.l = list;
    }

    public List<List<h>> p() {
        return this.l;
    }

    public boolean q() {
        List<h> list = this.j;
        return list == null || list.size() <= 0;
    }

    public void r() {
        List<List<h>> list = this.l;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List next : this.l) {
                if (next != null && next.size() > 0) {
                    arrayList.add(next);
                }
            }
            this.l = arrayList;
        }
    }

    public boolean s() {
        return TextUtils.equals(this.i.e().r(), "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f18522a + '\'' + ", x=" + this.f18523b + ", y=" + this.f18524c + ", width=" + this.f18527f + ", height=" + this.f18528g + ", remainWidth=" + this.f18529h + ", rootBrick=" + this.i + ", childrenBrickUnits=" + this.j + '}';
    }

    public static void a(JSONObject jSONObject, h hVar, h hVar2) {
        if (jSONObject != null && hVar != null) {
            hVar.b(jSONObject.optString(OSOutcomeConstants.OUTCOME_ID, "root"));
            hVar.c((float) jSONObject.optDouble("x", 0.0d));
            hVar.d((float) jSONObject.optDouble("y", 0.0d));
            hVar.e((float) jSONObject.optDouble(IabUtils.KEY_WIDTH, 0.0d));
            hVar.f((float) jSONObject.optDouble(IabUtils.KEY_HEIGHT, 0.0d));
            hVar.g((float) jSONObject.optDouble("remainWidth", 0.0d));
            e eVar = new e();
            e.a(jSONObject.optJSONObject("brick"), eVar);
            hVar.a(eVar);
            hVar.b(hVar2);
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    Object opt = optJSONArray.opt(i2);
                    if (opt != null && !"null".equals(opt.toString()) && (opt instanceof JSONArray)) {
                        int i3 = 0;
                        while (true) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (i3 >= jSONArray.length()) {
                                break;
                            }
                            JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                            h hVar3 = new h();
                            a(optJSONObject, hVar3, hVar);
                            hVar.a(hVar3);
                            i3++;
                        }
                    }
                }
            }
        }
    }

    public boolean t() {
        return this.i.e().W() < 0 || this.i.e().X() < 0 || this.i.e().U() < 0 || this.i.e().V() < 0;
    }
}
