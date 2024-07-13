package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdyo implements zzfnk {
    private final Map zza;
    private final zzbew zzb;

    zzdyo(zzbew zzbew, Map map) {
        this.zza = map;
        this.zzb = zzbew;
    }

    public final void zzbH(zzfnd zzfnd, String str) {
    }

    public final void zzbI(zzfnd zzfnd, String str, Throwable th) {
        if (this.zza.containsKey(zzfnd)) {
            this.zzb.zzc(((zzdyn) this.zza.get(zzfnd)).zzc);
        }
    }

    public final void zzc(zzfnd zzfnd, String str) {
        if (this.zza.containsKey(zzfnd)) {
            this.zzb.zzc(((zzdyn) this.zza.get(zzfnd)).zza);
        }
    }

    public final void zzd(zzfnd zzfnd, String str) {
        if (this.zza.containsKey(zzfnd)) {
            this.zzb.zzc(((zzdyn) this.zza.get(zzfnd)).zzb);
        }
    }
}
