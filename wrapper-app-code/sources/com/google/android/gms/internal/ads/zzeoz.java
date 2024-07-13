package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeoz implements zzeks {
    private final Map zza = new HashMap();
    private final zzdxc zzb;

    public zzeoz(zzdxc zzdxc) {
        this.zzb = zzdxc;
    }

    public final zzekt zza(String str, JSONObject jSONObject) throws zzfjl {
        zzekt zzekt;
        synchronized (this) {
            zzekt = (zzekt) this.zza.get(str);
            if (zzekt == null) {
                zzekt = new zzekt(this.zzb.zzc(str, jSONObject), new zzemt(), str);
                this.zza.put(str, zzekt);
            }
        }
        return zzekt;
    }
}
