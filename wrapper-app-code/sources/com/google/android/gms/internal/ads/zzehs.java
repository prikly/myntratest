package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehs implements zzfmm {
    public static final /* synthetic */ zzehs zza = new zzehs();

    private /* synthetic */ zzehs() {
    }

    public final Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zze.zza("GMS AdRequest Signals: ");
        zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
