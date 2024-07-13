package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeej implements zzgdy {
    public final /* synthetic */ zzeem zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeej(zzeem zzeem, String str, String str2) {
        this.zza = zzeem;
        this.zzb = str;
        this.zzc = str2;
    }

    public final zzgfb zza(Object obj) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzger.zzi(jSONObject);
        } catch (JSONException e2) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e2.getCause()))));
        }
    }
}
