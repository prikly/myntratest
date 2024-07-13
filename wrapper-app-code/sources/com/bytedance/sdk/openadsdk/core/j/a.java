package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.e.n;
import io.bidmachine.utils.IabUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAdConfig */
public class a {

    /* renamed from: a  reason: collision with root package name */
    d f1265a = new d(this);

    /* renamed from: b  reason: collision with root package name */
    b f1266b;

    /* renamed from: c  reason: collision with root package name */
    c f1267c;

    /* renamed from: d  reason: collision with root package name */
    private String f1268d;

    /* renamed from: e  reason: collision with root package name */
    private String f1269e;

    /* renamed from: f  reason: collision with root package name */
    private String f1270f;

    /* renamed from: g  reason: collision with root package name */
    private String f1271g;

    /* renamed from: h  reason: collision with root package name */
    private double f1272h;
    private String i;
    private String j;

    public d a() {
        return this.f1265a;
    }

    public b b() {
        return this.f1266b;
    }

    public c c() {
        return this.f1267c;
    }

    public String d() {
        return this.f1268d;
    }

    public String e() {
        return this.f1269e;
    }

    public String f() {
        return this.f1270f;
    }

    public String g() {
        return this.f1271g;
    }

    public void a(b bVar) {
        if (bVar != null) {
            bVar.a(this.f1271g);
        }
        this.f1266b = bVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            cVar.a(this.f1271g);
        }
        this.f1267c = cVar;
    }

    public void a(String str) {
        this.f1268d = str;
    }

    public void b(String str) {
        this.f1269e = str;
    }

    public void c(String str) {
        this.f1270f = str;
    }

    public void d(String str) {
        this.f1271g = str;
    }

    public double h() {
        return this.f1272h;
    }

    public void a(double d2) {
        this.f1272h = d2;
    }

    public String i() {
        String str = this.j;
        if (str == null) {
            return this.f1270f;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -360520052) {
            if (hashCode == 519982247 && str.equals("VAST_END_CARD")) {
                c2 = 1;
            }
        } else if (str.equals("VAST_ICON")) {
            c2 = 0;
        }
        if (c2 == 0) {
            b bVar = this.f1266b;
            return bVar != null ? bVar.f1321h : this.f1270f;
        } else if (c2 != 1) {
            return this.f1270f;
        } else {
            c cVar = this.f1267c;
            return cVar != null ? cVar.f1321h : this.f1270f;
        }
    }

    public void e(String str) {
        this.j = str;
    }

    public JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f1265a.a());
        b bVar = this.f1266b;
        if (bVar != null) {
            jSONObject.put("vastIcon", bVar.a());
        }
        c cVar = this.f1267c;
        if (cVar != null) {
            jSONObject.put("endCard", cVar.a());
        }
        jSONObject.put("title", this.f1268d);
        jSONObject.put("description", this.f1269e);
        jSONObject.put("clickThroughUrl", this.f1270f);
        jSONObject.put(IabUtils.KEY_VIDEO_URL, this.f1271g);
        jSONObject.put("videDuration", this.f1272h);
        jSONObject.put("tag", this.i);
        return jSONObject;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.f1265a.a(jSONObject.optJSONObject("videoTrackers"));
        aVar.f1266b = b.a(jSONObject.optJSONObject("vastIcon"));
        aVar.f1267c = c.b(jSONObject.optJSONObject("endCard"));
        aVar.f1268d = jSONObject.optString("title");
        aVar.f1269e = jSONObject.optString("description");
        aVar.f1270f = jSONObject.optString("clickThroughUrl");
        aVar.f1271g = jSONObject.optString(IabUtils.KEY_VIDEO_URL);
        aVar.f1272h = jSONObject.optDouble("videDuration");
        aVar.i = jSONObject.optString("tag");
        return aVar;
    }

    public void a(n nVar) {
        this.f1265a.a(nVar);
    }

    public String k() {
        return this.i;
    }

    public void f(String str) {
        this.i = str;
        this.f1265a.a(str);
    }
}
