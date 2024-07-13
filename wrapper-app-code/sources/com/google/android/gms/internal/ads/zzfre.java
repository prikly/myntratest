package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfre {
    private JSONObject zza;
    private final zzfrn zzb;

    public zzfre(zzfrn zzfrn) {
        this.zzb = zzfrn;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfro(this, (byte[]) null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfrp(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfrq(this, hashSet, jSONObject, j, (byte[]) null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
