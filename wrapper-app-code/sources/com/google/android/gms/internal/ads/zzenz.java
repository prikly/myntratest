package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzenz extends zzeob {
    private final zzcpj zza;
    private final zzdon zzb;
    private final zzddx zzc;
    private final zzdka zzd;

    public zzenz(zzcpj zzcpj, zzdon zzdon, zzddx zzddx, zzdka zzdka) {
        this.zza = zzcpj;
        this.zzb = zzdon;
        this.zzc = zzddx;
        this.zzd = zzdka;
    }

    /* access modifiers changed from: protected */
    public final zzgfb zzc(zzfjg zzfjg, Bundle bundle) {
        zzdor zzh = this.zza.zzh();
        zzddx zzddx = this.zzc;
        zzddx.zzf(zzfjg);
        zzddx.zzd(bundle);
        zzh.zzf(zzddx.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcyi((ViewGroup) null));
        zzdbu zza2 = zzh.zzg().zza();
        return zza2.zzi(zza2.zzj());
    }
}
