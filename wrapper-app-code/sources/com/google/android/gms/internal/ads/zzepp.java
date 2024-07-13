package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzepp implements zzeks {
    private final zzeqt zza;

    public zzepp(zzeqt zzeqt) {
        this.zza = zzeqt;
    }

    public final zzekt zza(String str, JSONObject jSONObject) throws zzfjl {
        zzbxq zza2 = this.zza.zza(str);
        if (zza2 == null) {
            return null;
        }
        return new zzekt(zza2, new zzems(), str);
    }
}
