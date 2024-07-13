package com.bytedance.sdk.openadsdk.core.d;

import android.content.Context;
import com.bytedance.sdk.component.e.a.a;
import com.bytedance.sdk.component.e.b;
import com.bytedance.sdk.component.e.b.d;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrequentCallEventHelper */
public class c {
    public static void a(Context context, String str, long j) {
        JSONObject a2 = a(str, j);
        d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
        b2.a(u.g("/api/ad/union/sdk/stats/"));
        b2.c(a2.toString());
        b2.a((a) new a() {
            public void a(com.bytedance.sdk.component.e.b.c cVar, b bVar) {
                if (bVar != null) {
                    l.a("uploadFrequentEvent", Boolean.valueOf(bVar.f()), bVar.d());
                    return;
                }
                l.c("uploadFrequentEvent", "NetResponse is null");
            }

            public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                l.c("uploadFrequentEvent", iOException.getMessage());
            }
        });
    }

    private static JSONObject a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", "4.5.0.6");
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
