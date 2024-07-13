package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzctc implements zzfgr {
    private final zzcre zza;
    private final zzctc zzb = this;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;

    /* synthetic */ zzctc(zzcre zzcre, Context context, String str, zzq zzq, zzctb zzctb) {
        this.zza = zzcre;
        this.zzc = zzheq.zza(context);
        this.zzd = zzheq.zza(zzq);
        this.zze = zzheq.zza(str);
        this.zzf = zzheo.zzc(new zzesc(this.zza.zzo));
        this.zzg = zzheo.zzc(new zzfhp(this.zza.zzaD));
        zzhfc zzhfc = this.zzc;
        zzcre zzcre2 = this.zza;
        zzhfc zzc2 = zzheo.zzc(new zzfgp(zzhfc, zzcre2.zzp, zzcre2.zzT, this.zzf, this.zzg, zzfji.zza()));
        this.zzh = zzc2;
        this.zzi = zzheo.zzc(new zzesk(this.zzc, this.zzd, this.zze, zzc2, this.zzf, this.zzg, this.zza.zzi));
    }

    public final zzesj zza() {
        return (zzesj) this.zzi.zzb();
    }
}
