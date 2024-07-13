package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ml  reason: case insensitive filesystem */
public class C0563ml implements Jk {
    public void a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
