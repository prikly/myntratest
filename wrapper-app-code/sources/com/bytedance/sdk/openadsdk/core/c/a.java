package com.bytedance.sdk.openadsdk.core.c;

import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.openadsdk.core.c.a.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import org.json.JSONObject;

/* compiled from: DynamicUtils */
public class a {
    public static String a(l lVar, n nVar) {
        return a(lVar.a(), lVar.e(), lVar.f(), lVar.g(), lVar.h(), lVar.i(), nVar);
    }

    public static String a(JSONObject jSONObject, String str, String str2, String str3, boolean z, int i, n nVar) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject.put("setting", a(str3, z, i, nVar));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("templateInfo", jSONObject);
        jSONObject2.put("adInfo", new com.bytedance.sdk.openadsdk.core.c.a.a(str, str3, str2).a());
        jSONObject2.put("appInfo", new b().a());
        return jSONObject2.toString();
    }

    private static JSONObject a(String str, boolean z, int i, n nVar) {
        JSONObject jSONObject = new JSONObject();
        if (m.h() != null) {
            try {
                int f2 = u.f(nVar);
                int f3 = m.h().f(String.valueOf(f2));
                boolean c2 = m.h().c(String.valueOf(f2));
                jSONObject.put("voice_control", m.h().b(f2));
                jSONObject.put("rv_skip_time", f3);
                jSONObject.put("fv_skip_show", c2);
                jSONObject.put("show_dislike", z);
                jSONObject.put("video_adaptation", i);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
