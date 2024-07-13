package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzehk implements zzbum {
    zzehk() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzehl zzehl = (zzehl) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziq)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzehl.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzehl.zzd.zzd());
        }
        jSONObject2.put("base_url", zzehl.zzd.zzb());
        jSONObject2.put("signals", zzehl.zzc);
        jSONObject3.put("body", zzehl.zzb.zzc);
        jSONObject3.put("headers", zzay.zzb().zzj(zzehl.zzb.zzb));
        jSONObject3.put("response_code", zzehl.zzb.zza);
        jSONObject3.put("latency", zzehl.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzehl.zzd.zzg());
        return jSONObject;
    }
}
