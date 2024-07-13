package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcru implements zzfdk {
    private final zzcre zza;
    private final zzcru zzb = this;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;
    private final zzhfc zzk;

    /* synthetic */ zzcru(zzcre zzcre, Context context, String str, zzcrt zzcrt) {
        this.zza = zzcre;
        this.zzc = zzheq.zza(context);
        this.zzd = zzheq.zza(str);
        zzhfc zzhfc = this.zzc;
        zzcre zzcre2 = this.zza;
        this.zze = new zzfge(zzhfc, zzcre2.zzaD, zzcre2.zzaE);
        this.zzf = zzheo.zzc(new zzfei(zzcre2.zzaD));
        zzhfc zzhfc2 = this.zzc;
        zzcre zzcre3 = this.zza;
        this.zzg = zzheo.zzc(new zzfdc(zzhfc2, zzcre3.zzp, zzcre3.zzT, this.zze, this.zzf, zzfji.zza(), zzcre3.zzi));
        zzcre zzcre4 = this.zza;
        this.zzh = zzheo.zzc(new zzfdi(zzcre4.zzT, this.zzc, this.zzd, this.zzg, this.zzf, zzcre4.zzi));
        zzhfc zzhfc3 = this.zzc;
        zzcre zzcre5 = this.zza;
        this.zzi = new zzfgd(zzhfc3, zzcre5.zzaD, zzcre5.zzaE);
        this.zzj = zzheo.zzc(new zzfek(zzhfc3, zzcre5.zzp, zzcre5.zzT, this.zzi, this.zzf, zzfji.zza(), zzcre5.zzi));
        zzcre zzcre6 = this.zza;
        this.zzk = zzheo.zzc(new zzfeq(zzcre6.zzT, this.zzc, this.zzd, this.zzj, this.zzf, zzcre6.zzi));
    }

    public final zzfdh zza() {
        return (zzfdh) this.zzh.zzb();
    }

    public final zzfep zzb() {
        return (zzfep) this.zzk.zzb();
    }
}
