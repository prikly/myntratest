package com.apm.insight.runtime;

import com.apm.insight.l.l;
import com.apm.insight.l.q;
import java.util.HashMap;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, e> f10848a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f10849b = null;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f10850c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10851d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f10852e;

    public e(JSONObject jSONObject, String str) {
        this.f10852e = str;
        a(jSONObject);
        f10848a.put(this.f10852e, this);
        q.a((Object) "after update aid " + str);
    }

    public static void a(String str, JSONObject jSONObject) {
        e eVar = f10848a.get(str);
        if (eVar != null) {
            eVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f10849b = jSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("error_module")) != null) {
            boolean z = true;
            if (optJSONObject.optInt("switcher") != 1) {
                z = false;
            }
            this.f10851d = z;
        }
    }

    public static boolean b(String str) {
        return f10848a.get(str) != null;
    }

    public static JSONObject c(String str) {
        e eVar = f10848a.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static e d(String str) {
        return f10848a.get(str);
    }

    public static long e(String str) {
        e eVar = f10848a.get(str);
        if (eVar == null) {
            return 3600000;
        }
        try {
            return Long.decode(l.b(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    public static boolean f(String str) {
        e eVar = f10848a.get(str);
        return eVar != null && eVar.b();
    }

    public static boolean g(String str) {
        e eVar = f10848a.get(str);
        return eVar != null && eVar.c();
    }

    public static boolean h(String str) {
        e eVar = f10848a.get(str);
        return eVar != null && eVar.d();
    }

    public JSONObject a() {
        return this.f10849b;
    }

    public boolean a(String str) {
        if (this.f10849b == null) {
            return false;
        }
        return this.f10851d;
    }

    public boolean b() {
        JSONObject jSONObject = this.f10849b;
        return jSONObject != null && 1 == l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean c() {
        JSONObject jSONObject = this.f10849b;
        return jSONObject != null && 1 == l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean d() {
        JSONObject jSONObject = this.f10849b;
        return jSONObject != null && 1 == l.a(jSONObject, 0, "crash_module", "switcher");
    }
}
