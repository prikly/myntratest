package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzctg implements zzfif {
    private final zzcre zza;
    private final zzctg zzb = this;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;

    /* synthetic */ zzctg(zzcre zzcre, Context context, String str, zzctf zzctf) {
        this.zza = zzcre;
        zzhep zza2 = zzheq.zza(context);
        this.zzc = zza2;
        zzcre zzcre2 = this.zza;
        this.zzd = new zzfgf(zza2, zzcre2.zzaD, zzcre2.zzaE);
        this.zze = zzheo.zzc(new zzfhp(zzcre2.zzaD));
        this.zzf = zzheo.zzc(zzfjd.zza());
        zzhfc zzhfc = this.zzc;
        zzcre zzcre3 = this.zza;
        zzhfc zzc2 = zzheo.zzc(new zzfhz(zzhfc, zzcre3.zzp, zzcre3.zzT, this.zzd, this.zze, zzfji.zza(), this.zzf));
        this.zzg = zzc2;
        this.zzh = zzheo.zzc(new zzfij(zzc2, this.zze, this.zzf));
        zzhep zzc3 = zzheq.zzc(str);
        this.zzi = zzc3;
        this.zzj = zzheo.zzc(new zzfid(zzc3, this.zzg, this.zzc, this.zze, this.zzf, this.zza.zzi));
    }

    public final zzfic zza() {
        return (zzfic) this.zzj.zzb();
    }

    public final zzfii zzb() {
        return (zzfii) this.zzh.zzb();
    }
}
