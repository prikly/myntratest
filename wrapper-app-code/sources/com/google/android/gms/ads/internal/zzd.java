package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzd implements zzgdy {
    public final /* synthetic */ zzfoy zza;
    public final /* synthetic */ zzfol zzb;

    public /* synthetic */ zzd(zzfoy zzfoy, zzfol zzfol) {
        this.zza = zzfoy;
        this.zzb = zzfol;
    }

    public final zzgfb zza(Object obj) {
        zzfoy zzfoy = this.zza;
        zzfol zzfol = this.zzb;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzo().zzh().zzu(jSONObject.getString("appSettingsJson"));
        }
        zzfol.zzf(optBoolean);
        zzfoy.zzb(zzfol.zzl());
        return zzger.zzi((Object) null);
    }
}
