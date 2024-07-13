package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehq implements zzgdy {
    public static final /* synthetic */ zzehq zza = new zzehq();

    private /* synthetic */ zzehq() {
    }

    public final zzgfb zza(Object obj) {
        zzehz zzehz = (zzehz) obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", zzehz.zza);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : zzehz.zzb.keySet()) {
                if (str != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : (List) zzehz.zzb.get(str)) {
                        if (str2 != null) {
                            jSONArray.put(str2);
                        }
                    }
                    jSONObject2.put(str, jSONArray);
                }
            }
            jSONObject.put("headers", jSONObject2);
            String str3 = zzehz.zzc;
            if (str3 != null) {
                jSONObject.put("body", str3);
            }
            jSONObject.put("latency", zzehz.zzd);
            return zzger.zzi(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (JSONException e2) {
            zze.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e2.getMessage())));
            throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e2.getCause()))));
        }
    }
}
