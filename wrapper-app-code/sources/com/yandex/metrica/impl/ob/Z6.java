package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.J;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Z6 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5400a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5401b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5402c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<J.a, Integer> f5403d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5404e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f5405f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5406g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5407h;
    private final CounterConfiguration.b i;
    private final String j;

    public Z6(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f5400a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f5401b = jSONObject2.getString("name");
        this.f5402c = jSONObject2.getInt("bytes_truncated");
        this.j = Tl.b(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f5403d = new HashMap<>();
        if (optString != null) {
            try {
                HashMap<String, String> d2 = Tl.d(optString);
                if (d2 != null) {
                    for (Map.Entry next : d2.entrySet()) {
                        this.f5403d.put(J.a.valueOf((String) next.getKey()), Integer.valueOf(Integer.parseInt((String) next.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f5404e = jSONObject3.getString("package_name");
        this.f5405f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f5406g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f5407h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
    }

    public String a() {
        return this.f5407h;
    }

    public int b() {
        return this.f5402c;
    }

    public byte[] c() {
        return this.f5400a;
    }

    public String d() {
        return this.j;
    }

    public String e() {
        return this.f5401b;
    }

    public String f() {
        return this.f5404e;
    }

    public Integer g() {
        return this.f5405f;
    }

    public String h() {
        return this.f5406g;
    }

    public CounterConfiguration.b i() {
        return this.i;
    }

    public HashMap<J.a, Integer> j() {
        return this.f5403d;
    }

    public String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f5403d.entrySet()) {
            hashMap.put(((J.a) next.getKey()).name(), next.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f5405f).put("psid", this.f5406g).put("package_name", this.f5404e)).put("reporter_configuration", new JSONObject().put("api_key", this.f5407h).put("reporter_type", this.i.a())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f5400a, 0)).put("name", this.f5401b).put("bytes_truncated", this.f5402c).put("trimmed_fields", Tl.g(hashMap)).putOpt("environment", this.j)).toString();
    }

    @Deprecated
    private CounterConfiguration.b a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("reporter_type")) {
            return CounterConfiguration.b.a(jSONObject.getString("reporter_type"));
        }
        if (jSONObject.getBoolean("is_commutation")) {
            return CounterConfiguration.b.COMMUTATION;
        }
        return CounterConfiguration.b.MAIN;
    }

    public Z6(C0293c0 c0Var, C0859z3 z3Var, HashMap<J.a, Integer> hashMap) {
        this.f5400a = c0Var.r();
        this.f5401b = c0Var.g();
        this.f5402c = c0Var.d();
        if (hashMap != null) {
            this.f5403d = hashMap;
        } else {
            this.f5403d = new HashMap<>();
        }
        A3 a2 = z3Var.a();
        this.f5404e = a2.f();
        this.f5405f = a2.g();
        this.f5406g = a2.h();
        CounterConfiguration b2 = z3Var.b();
        this.f5407h = b2.a();
        this.i = b2.k();
        this.j = c0Var.h();
    }
}
