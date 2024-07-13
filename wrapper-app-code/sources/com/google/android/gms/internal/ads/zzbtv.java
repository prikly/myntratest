package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbtv implements zzcii {
    final /* synthetic */ zzbue zza;
    final /* synthetic */ zzfol zzb;
    final /* synthetic */ zzbuf zzc;

    zzbtv(zzbuf zzbuf, zzbue zzbue, zzfol zzfol) {
        this.zzc = zzbuf;
        this.zza = zzbue;
        this.zzb = zzfol;
    }

    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbks.zzd.zze()).booleanValue()) {
                zzbuf zzbuf = this.zzc;
                if (zzbuf.zze != null) {
                    zzfoy zze = zzbuf.zze;
                    zzfol zzfol = this.zzb;
                    zzfol.zzf(false);
                    zze.zzb(zzfol.zzl());
                }
            }
        }
    }
}
