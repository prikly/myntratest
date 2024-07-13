package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fk  reason: case insensitive filesystem */
public class C0388fk implements Gk {
    public JSONObject a(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", obj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
