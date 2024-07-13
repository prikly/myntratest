package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfai implements zzezl {
    private final String zza;

    public zzfai(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e2) {
            zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
