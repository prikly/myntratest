package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbsx {
    public static void zza(zzbsy zzbsy, String str, Map map) {
        try {
            zzbsy.zze(str, zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbsy zzbsy, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbsy.zza(sb.toString());
    }

    public static void zzc(zzbsy zzbsy, String str, String str2) {
        zzbsy.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbsy zzbsy, String str, JSONObject jSONObject) {
        zzbsy.zzb(str, jSONObject.toString());
    }
}
