package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcqw extends zzfat {
    private final zzfbz zza;
    private final zzcre zzb;
    private final zzcqw zzc = this;
    private final zzhfc zzd;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;
    private final zzhfc zzk;
    private final zzhfc zzl;
    private final zzhfc zzm;
    private final zzhfc zzn;

    /* synthetic */ zzcqw(zzcre zzcre, zzfbz zzfbz, zzcqv zzcqv) {
        this.zzb = zzcre;
        this.zza = zzfbz;
        this.zzd = new zzfcb(zzfbz);
        this.zze = zzheo.zzc(zzdyg.zza());
        this.zzf = zzheo.zzc(zzdye.zza());
        this.zzg = zzheo.zzc(zzdyi.zza());
        this.zzh = zzheo.zzc(zzdyk.zza());
        zzhes zzc2 = zzhet.zzc(4);
        zzc2.zzb(zzfnd.GMS_SIGNALS, this.zze);
        zzc2.zzb(zzfnd.BUILD_URL, this.zzf);
        zzc2.zzb(zzfnd.HTTP, this.zzg);
        zzc2.zzb(zzfnd.PRE_PROCESS, this.zzh);
        this.zzi = zzc2.zzc();
        this.zzj = zzheo.zzc(new zzdyl(this.zzd, this.zzb.zzh, zzfme.zza(), this.zzi));
        zzhez zza2 = zzhfa.zza(0, 1);
        zza2.zza(this.zzj);
        zzhfa zzc3 = zza2.zzc();
        this.zzk = zzc3;
        this.zzl = new zzfnm(zzc3);
        this.zzm = zzheo.zzc(new zzfnl(zzfme.zza(), this.zzb.zzn, this.zzl));
        this.zzn = zzheo.zzc(new zzfox(this.zzb.zzH));
    }

    public final zzezp zza() {
        Context zza2 = this.zzb.zza.zza();
        zzhex.zzb(zza2);
        zzcgl zzcgl = new zzcgl();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        zzfbt zzfbt = new zzfbt(zzcgl, zzgfc, zzfca.zza(this.zza), (byte[]) null);
        zzgfc zzgfc2 = zzcib.zza;
        zzhex.zzb(zzgfc2);
        HashSet hashSet = new HashSet();
        hashSet.add(new zzext(zzfbt, 0, (ScheduledExecutorService) this.zzb.zzn.zzb()));
        return new zzezp(zza2, zzgfc2, hashSet, (zzfow) this.zzn.zzb(), (zzdzh) this.zzb.zzY.zzb());
    }

    public final zzfnj zzb() {
        return (zzfnj) this.zzm.zzb();
    }
}
