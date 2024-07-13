package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeoc extends zzeob {
    private final zzcpj zza;
    private final zzddx zzb;
    private final zzeqk zzc;
    private final zzdka zzd;
    private final zzdon zze;
    private final zzdhc zzf;
    private final ViewGroup zzg;
    private final zzdjj zzh;

    public zzeoc(zzcpj zzcpj, zzddx zzddx, zzeqk zzeqk, zzdka zzdka, zzdon zzdon, zzdhc zzdhc, ViewGroup viewGroup, zzdjj zzdjj) {
        this.zza = zzcpj;
        this.zzb = zzddx;
        this.zzc = zzeqk;
        this.zzd = zzdka;
        this.zze = zzdon;
        this.zzf = zzdhc;
        this.zzg = viewGroup;
        this.zzh = zzdjj;
    }

    /* access modifiers changed from: protected */
    public final zzgfb zzc(zzfjg zzfjg, Bundle bundle) {
        zzczh zze2 = this.zza.zze();
        zzddx zzddx = this.zzb;
        zzddx.zzf(zzfjg);
        zzddx.zzd(bundle);
        zze2.zzi(zzddx.zzg());
        zze2.zzf(this.zzd);
        zze2.zze(this.zzc);
        zze2.zzd(this.zze);
        zze2.zzg(new zzdaf(this.zzf, this.zzh));
        zze2.zzc(new zzcyi(this.zzg));
        zzdbu zzd2 = zze2.zzj().zzd();
        return zzd2.zzi(zzd2.zzj());
    }
}
