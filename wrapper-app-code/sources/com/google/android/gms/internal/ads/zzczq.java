package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzczq implements zzhep {
    private final zzhfc zza;

    public zzczq(zzhfc zzhfc) {
        this.zza = zzhfc;
    }

    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzdee) this.zza).zza().zza() == null) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeX)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
