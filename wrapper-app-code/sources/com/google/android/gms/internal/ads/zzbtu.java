package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbtu implements zzcik {
    final /* synthetic */ zzbue zza;
    final /* synthetic */ zzfol zzb;
    final /* synthetic */ zzbuf zzc;

    zzbtu(zzbuf zzbuf, zzbue zzbue, zzfol zzfol) {
        this.zzc = zzbuf;
        this.zza = zzbue;
        this.zzb = zzfol;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbta zzbta = (zzbta) obj;
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbuf zzbuf = this.zzc;
            if (!(zzbuf.zzh == null || this.zza == zzbuf.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbks.zzd.zze()).booleanValue()) {
                zzbuf zzbuf2 = this.zzc;
                if (zzbuf2.zze != null) {
                    zzfoy zze = zzbuf2.zze;
                    zzfol zzfol = this.zzb;
                    zzfol.zzf(true);
                    zze.zzb(zzfol.zzl());
                }
            }
        }
    }
}
