package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONObject;

class E7 {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f3928a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    E7() {
    }

    /* access modifiers changed from: package-private */
    public C0447i4 a(String str) {
        try {
            return a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    private C0447i4 a(JSONObject jSONObject) {
        try {
            for (String has : f3928a) {
                if (!jSONObject.has(has)) {
                    return null;
                }
            }
            int i = jSONObject.getInt("arg_pd");
            if (i == 0) {
                i = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C0447i4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i), jSONObject.getString("arg_ps"), CounterConfiguration.b.a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
