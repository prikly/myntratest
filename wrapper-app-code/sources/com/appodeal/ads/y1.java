package com.appodeal.ads;

import org.json.JSONObject;

public final class y1 {
    public static void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.optBoolean("refresh")) {
                r0.d();
            }
            if (jSONObject.optBoolean("session_drop_store")) {
                q4.m().b();
            }
        }
    }
}
