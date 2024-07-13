package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SecSdkHelperUtil */
public class s {
    public static void a(String str) {
        if (!TextUtils.isEmpty(str) && m.h().C()) {
            r.a().a(str);
        }
    }

    public static String a() {
        if (m.h().C()) {
            return r.a().b();
        }
        return null;
    }

    public static void b() {
        if (m.h().C()) {
            r.a().b("AdShow");
        }
    }

    public static Map<String, String> a(String str, String str2) {
        if (!m.h().C()) {
            return new HashMap();
        }
        return r.a().a(str, str2 != null ? str2.getBytes() : new byte[0]);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && m.h().C()) {
            try {
                jSONObject.put("sec_did", r.a().c());
                String a2 = e.a(jSONObject.toString());
                Map<String, String> a3 = r.a().a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", a2 != null ? a2.getBytes() : new byte[0]);
                if (a3 != null && a3.size() > 0) {
                    for (String next : a3.keySet()) {
                        jSONObject.put(next, a3.get(next));
                    }
                    jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                    jSONObject.put("pangle_m", a2);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
