package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdmg {
    private final List zza;
    private final zzfpo zzb;
    private boolean zzc;

    public zzdmg(zzfil zzfil, zzfpo zzfpo) {
        this.zza = zzfil.zzq;
        this.zzb = zzfpo;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
