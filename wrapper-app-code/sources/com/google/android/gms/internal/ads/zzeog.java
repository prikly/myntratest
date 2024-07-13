package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeog extends zzeob {
    private final zzcpj zza;
    private final zzddx zzb;
    private final zzdka zzc;

    public zzeog(zzcpj zzcpj, zzddx zzddx, zzdka zzdka) {
        this.zza = zzcpj;
        this.zzb = zzddx;
        this.zzc = zzdka;
    }

    /* access modifiers changed from: protected */
    public final zzgfb zzc(zzfjg zzfjg, Bundle bundle) {
        zzdvx zzi = this.zza.zzi();
        zzddx zzddx = this.zzb;
        zzddx.zzf(zzfjg);
        zzddx.zzd(bundle);
        zzi.zzd(zzddx.zzg());
        zzi.zzc(this.zzc);
        zzdbu zzb2 = zzi.zze().zzb();
        return zzb2.zzi(zzb2.zzj());
    }
}
