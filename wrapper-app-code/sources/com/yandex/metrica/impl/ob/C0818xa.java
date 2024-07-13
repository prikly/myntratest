package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ud;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xa  reason: case insensitive filesystem */
public class C0818xa implements C0698sa<Ud> {
    public JSONObject a(Object obj) {
        JSONObject jSONObject;
        Ud ud = (Ud) obj;
        JSONObject jSONObject2 = new JSONObject();
        if (ud != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (Ud.a next : ud.f5098b) {
                    if (next == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject().putOpt("tracking_id", next.f5099a).put("additional_parameters", next.f5100b).put("source", next.f5101c.a());
                    }
                    jSONArray.put(jSONObject);
                }
                JSONObject put = jSONObject2.put("candidates", jSONArray);
                C0357ee eeVar = ud.f5097a;
                put.put("chosen", new JSONObject().putOpt("tracking_id", eeVar.f5743a).put("additional_parameters", eeVar.f5744b).put("source", eeVar.f5747e.a()).put("auto_tracking_enabled", eeVar.f5746d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }
}
