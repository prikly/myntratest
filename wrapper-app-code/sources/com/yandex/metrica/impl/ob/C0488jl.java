package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jl  reason: case insensitive filesystem */
public class C0488jl implements Jk {
    public void a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
