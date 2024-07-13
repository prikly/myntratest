package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0763v3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pa  reason: case insensitive filesystem */
public class C0627pa implements C0698sa<C0763v3> {
    public JSONObject a(Object obj) {
        C0763v3 v3Var = (C0763v3) obj;
        JSONObject jSONObject = new JSONObject();
        if (v3Var != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C0763v3.a a2 : v3Var.a()) {
                    jSONArray.put(a(a2));
                }
                jSONObject.putOpt("chosen", a(v3Var.c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    private JSONObject a(C0763v3.a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", Tl.e((Map) aVar.b())).putOpt("source", aVar.a().a());
    }
}
