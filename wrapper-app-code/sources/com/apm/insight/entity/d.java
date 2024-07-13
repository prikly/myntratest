package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.l;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f10565a;

    /* renamed from: b  reason: collision with root package name */
    private static JSONObject f10566b;

    private static void a() {
        JSONObject jSONObject;
        if (f10565a == null) {
            f10565a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + h.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f10566b == null) {
            try {
                f10566b = new JSONObject(i.c(f10565a));
                return;
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            } catch (IOException unused2) {
                jSONObject = new JSONObject();
            }
        } else {
            return;
        }
        f10566b = jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                d(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    private static void c(JSONObject jSONObject) {
        Object opt;
        a();
        JSONObject jSONObject2 = f10566b;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f10566b.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    private static void d(JSONObject jSONObject) {
        a();
        JSONObject jSONObject2 = f10566b;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!l.a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                a.b(optJSONObject2, optJSONObject);
            }
        }
    }
}
