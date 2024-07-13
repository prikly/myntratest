package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeoe extends zzeob {
    private final zzcpj zza;
    private final zzddx zzb;
    private final zzeqk zzc;
    private final zzdka zzd;

    public zzeoe(zzcpj zzcpj, zzddx zzddx, zzeqk zzeqk, zzdka zzdka) {
        this.zza = zzcpj;
        this.zzb = zzddx;
        this.zzc = zzeqk;
        this.zzd = zzdka;
    }

    /* access modifiers changed from: protected */
    public final zzgfb zzc(zzfjg zzfjg, Bundle bundle) {
        zzdnv zzg = this.zza.zzg();
        zzddx zzddx = this.zzb;
        zzddx.zzf(zzfjg);
        zzddx.zzd(bundle);
        zzg.zze(zzddx.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzdbu zza2 = zzg.zzf().zza();
        return zza2.zzi(zza2.zzj());
    }
}
