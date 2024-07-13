package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nl  reason: case insensitive filesystem */
public class C0588nl implements Kk {
    public JSONObject a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
