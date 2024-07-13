package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsu {
    private final zzgfc zza;
    private final zzdth zzb;
    private final zzdtm zzc;

    public zzdsu(zzgfc zzgfc, zzdth zzdth, zzdtm zzdtm) {
        this.zza = zzgfc;
        this.zzb = zzdth;
        this.zzc = zzdtm;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil, JSONObject jSONObject) {
        zzgfb zzn;
        zzfix zzfix2 = zzfix;
        zzfil zzfil2 = zzfil;
        JSONObject jSONObject2 = jSONObject;
        zzgfb zzb2 = this.zza.zzb(new zzdss(this, zzfix2, zzfil2, jSONObject2));
        zzgfb zzf = this.zzb.zzf(jSONObject2, "images");
        zzgfb zzg = this.zzb.zzg(jSONObject2, "images", zzfil2, zzfix2.zzb.zzb);
        zzgfb zze = this.zzb.zze(jSONObject2, "secondary_image");
        zzgfb zze2 = this.zzb.zze(jSONObject2, "app_icon");
        zzgfb zzd = this.zzb.zzd(jSONObject2, "attribution");
        zzgfb zzh = this.zzb.zzh(jSONObject2, zzfil2, zzfix2.zzb.zzb);
        zzdth zzdth = this.zzb;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzn = zzger.zzi((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzger.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzger.zzi((Object) null);
                } else {
                    zzn = zzger.zzn(zzger.zzi((Object) null), new zzdsw(zzdth, optString), zzcib.zze);
                }
            }
        }
        zzgfb zzgfb = zzn;
        zzgfb zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        return zzger.zzb(zzb2, zzf, zzg, zze, zze2, zzd, zzh, zzgfb, zza2).zza(new zzdst(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzg, zzgfb, zza2), this.zza);
    }
}
