package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzenj implements zzeks {
    private final zzdxc zza;

    public zzenj(zzdxc zzdxc) {
        this.zza = zzdxc;
    }

    public final zzekt zza(String str, JSONObject jSONObject) throws zzfjl {
        return new zzekt(this.zza.zzc(str, jSONObject), new zzems(), str);
    }
}
