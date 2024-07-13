package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcra extends zzfav {
    private final zzfaj zza;
    private final zzcre zzb;
    private final zzcra zzc = this;
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

    /* synthetic */ zzcra(zzcre zzcre, zzfaj zzfaj, zzcqz zzcqz) {
        this.zzb = zzcre;
        this.zza = zzfaj;
        this.zzd = zzheo.zzc(new zzfox(zzcre.zzH));
        this.zze = new zzfar(zzfaj);
        this.zzf = zzheo.zzc(zzdyg.zza());
        this.zzg = zzheo.zzc(zzdye.zza());
        this.zzh = zzheo.zzc(zzdyi.zza());
        this.zzi = zzheo.zzc(zzdyk.zza());
        zzhes zzc2 = zzhet.zzc(4);
        zzc2.zzb(zzfnd.GMS_SIGNALS, this.zzf);
        zzc2.zzb(zzfnd.BUILD_URL, this.zzg);
        zzc2.zzb(zzfnd.HTTP, this.zzh);
        zzc2.zzb(zzfnd.PRE_PROCESS, this.zzi);
        this.zzj = zzc2.zzc();
        this.zzk = zzheo.zzc(new zzdyl(this.zze, this.zzb.zzh, zzfme.zza(), this.zzj));
        zzhez zza2 = zzhfa.zza(0, 1);
        zza2.zza(this.zzk);
        zzhfa zzc3 = zza2.zzc();
        this.zzl = zzc3;
        this.zzm = new zzfnm(zzc3);
        this.zzn = zzheo.zzc(new zzfnl(zzfme.zza(), this.zzb.zzn, this.zzm));
    }

    public final zzezp zza() {
        Context zza2 = this.zzb.zza.zza();
        zzhex.zzb(zza2);
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        zzcgl zzcgl = new zzcgl();
        zzgfc zzgfc2 = zzcib.zza;
        zzhex.zzb(zzgfc2);
        zzezm zza3 = zzfcp.zza(new zzfbt(zzcgl, zzgfc2, zzfak.zza(this.zza), (byte[]) null), zzexn.zza(), (ScheduledExecutorService) this.zzb.zzn.zzb(), 0);
        Context zza4 = this.zzb.zza.zza();
        zzhex.zzb(zza4);
        zzezm zzb2 = zzfcp.zzb(new zzfcd(new zzbzu(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zza4, (byte[]) null), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzcgo zzcgo = new zzcgo();
        Context zza5 = this.zzb.zza.zza();
        zzhex.zzb(zza5);
        zzgfc zzgfc3 = zzcib.zza;
        zzhex.zzb(zzgfc3);
        zzezm zza6 = zzfcq.zza(zzfad.zza(zzcgo, zza5, (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc3, zzfal.zza(this.zza), zzfan.zza(this.zza), zzfao.zza(this.zza)), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzgfc zzgfc4 = zzcib.zza;
        zzhex.zzb(zzgfc4);
        zzezm zzc2 = zzfcp.zzc(new zzfcy(zzgfc4), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzfcn zzfcn = zzfcn.zza;
        Context zza7 = this.zzb.zza.zza();
        zzhex.zzb(zza7);
        String zza8 = zzfak.zza(this.zza);
        zzgfc zzgfc5 = zzcib.zza;
        zzhex.zzb(zzgfc5);
        zzfax zzfax = new zzfax((zzccd) null, zza7, zza8, zzgfc5);
        zzbel zzbel = new zzbel();
        zzgfc zzgfc6 = zzcib.zza;
        zzhex.zzb(zzgfc6);
        Context zza9 = this.zzb.zza.zza();
        zzhex.zzb(zza9);
        zzbiu zzbiu = new zzbiu();
        zzgfc zzgfc7 = zzcib.zza;
        zzhex.zzb(zzgfc7);
        zzcgo zzcgo2 = new zzcgo();
        zzgfc zzgfc8 = zzcib.zza;
        zzhex.zzb(zzgfc8);
        zzcgo zzcgo3 = new zzcgo();
        int zza10 = zzfal.zza(this.zza);
        Context zza11 = this.zzb.zza.zza();
        zzhex.zzb(zza11);
        zzgfc zzgfc9 = zzcib.zza;
        zzhex.zzb(zzgfc9);
        zzgfc zzgfc10 = zzcib.zza;
        zzhex.zzb(zzgfc10);
        return new zzezp(zza2, zzgfc, zzgaz.zzo(zza3, zzb2, zza6, zzc2, zzfcn, zzfax, new zzfbm(zzbel, zzgfc6, zza9, (byte[]) null), new zzfbx(zzbiu, zzgfc7, zzfam.zza(this.zza), (byte[]) null), new zzfah(zzcgo2, zzgfc8, zzfap.zza(this.zza), zzfaq.zza(this.zza), zzfal.zza(this.zza), (byte[]) null), new zzfbi(zzcgo3, zza10, zza11, (zzcgx) this.zzb.zzaf.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc9, zzfak.zza(this.zza), (byte[]) null), (zzezm) this.zzb.zzaH.zzb(), zzfbe.zza(zzfak.zza(this.zza), new zzbdz(), (zzcgx) this.zzb.zzaf.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc10)), (zzfow) this.zzd.zzb(), (zzdzh) this.zzb.zzY.zzb());
    }

    public final zzfnj zzb() {
        return (zzfnj) this.zzn.zzb();
    }
}
