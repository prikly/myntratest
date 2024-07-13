package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcqs extends zzfae {
    private final zzhfc zzA;
    private final zzhfc zzB;
    private final zzfcg zza;
    private final zzcre zzb;
    private final zzcqs zzc = this;
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
    private final zzhfc zzo;
    private final zzhfc zzp;
    private final zzhfc zzq;
    private final zzhfc zzr;
    private final zzhfc zzs;
    private final zzhfc zzt;
    private final zzhfc zzu;
    private final zzhfc zzv;
    private final zzhfc zzw;
    private final zzhfc zzx;
    private final zzhfc zzy;
    private final zzhfc zzz;

    /* synthetic */ zzcqs(zzcre zzcre, zzfcg zzfcg, zzcqr zzcqr) {
        zzfcg zzfcg2 = zzfcg;
        this.zzb = zzcre;
        this.zza = zzfcg2;
        this.zzd = zzheo.zzc(new zzfox(zzcre.zzH));
        this.zze = new zzfci(zzfcg2);
        this.zzf = new zzfcj(zzfcg2);
        this.zzg = new zzfcl(zzfcg2);
        zzcux zza2 = zzcuw.zza;
        zzcre zzcre2 = this.zzb;
        zzhfc zzaj = zzcre2.zzh;
        zzhfc zzax = zzcre2.zzn;
        zzfme zza3 = zzfme.zza();
        zzhfc zzhfc = this.zze;
        zzhfc zzhfc2 = this.zzf;
        zzhfc zzhfc3 = this.zzg;
        this.zzh = new zzfad(zza2, zzaj, zzax, zza3, zzhfc, zzhfc2, zzhfc3);
        this.zzi = new zzfch(zzfcg2);
        zzcqe zza4 = zzcqd.zza;
        zzhfc zzaj2 = zzcre2.zzh;
        zzhfc zzhfc4 = this.zzi;
        this.zzj = new zzfaz(zza4, zzaj2, zzhfc4, zzfme.zza());
        zzcux zza5 = zzcuw.zza;
        zzhfc zzhfc5 = zzhfc;
        zzhfc zzaj3 = zzcre2.zzh;
        this.zzk = new zzfbk(zza5, zzhfc5, zzaj3, zzcre2.zzaf, zzcre2.zzn, zzfme.zza(), zzhfc4);
        this.zzl = new zzfbo(zzcuq.zza, zzfme.zza(), zzcre2.zzh);
        this.zzm = new zzfbv(zzcus.zza, zzfme.zza(), zzhfc4);
        this.zzn = new zzfcf(zzcuu.zza, zzcre2.zzn, zzcre2.zzh);
        this.zzo = new zzfda(zzfme.zza());
        this.zzp = new zzfck(zzfcg2);
        this.zzq = new zzfcw(zzcre2.zzaf, this.zzp, zzhfc3, zzcuy.zza, zzfme.zza(), zzhfc4, zzcre2.zzn);
        this.zzr = new zzfbe(zzhfc4, zzcuo.zza, zzcre2.zzaf, zzcre2.zzn, zzfme.zza());
        this.zzs = new zzfcm(zzfcg2);
        this.zzt = zzheo.zzc(zzdyg.zza());
        this.zzu = zzheo.zzc(zzdye.zza());
        this.zzv = zzheo.zzc(zzdyi.zza());
        this.zzw = zzheo.zzc(zzdyk.zza());
        zzhes zzc2 = zzhet.zzc(4);
        zzc2.zzb(zzfnd.GMS_SIGNALS, this.zzt);
        zzc2.zzb(zzfnd.BUILD_URL, this.zzu);
        zzc2.zzb(zzfnd.HTTP, this.zzv);
        zzc2.zzb(zzfnd.PRE_PROCESS, this.zzw);
        this.zzx = zzc2.zzc();
        this.zzy = zzheo.zzc(new zzdyl(this.zzs, this.zzb.zzh, zzfme.zza(), this.zzx));
        zzhez zza6 = zzhfa.zza(0, 1);
        zza6.zza(this.zzy);
        zzhfa zzc3 = zza6.zzc();
        this.zzz = zzc3;
        this.zzA = new zzfnm(zzc3);
        this.zzB = zzheo.zzc(new zzfnl(zzfme.zza(), this.zzb.zzn, this.zzA));
    }

    private final zzfah zze() {
        zzcgo zzcgo = new zzcgo();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        String zzd2 = this.zza.zzd();
        zzhex.zzb(zzd2);
        return new zzfah(zzcgo, zzgfc, zzd2, this.zza.zzb(), this.zza.zza(), (byte[]) null);
    }

    private final zzfbx zzf() {
        zzbiu zzbiu = new zzbiu();
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        List zzf2 = this.zza.zzf();
        zzhex.zzb(zzf2);
        return new zzfbx(zzbiu, zzgfc, zzf2, (byte[]) null);
    }

    public final zzezp zza() {
        Context zza2 = this.zzb.zza.zza();
        Context context = zza2;
        zzhex.zzb(zza2);
        zzcgl zzcgl = r1;
        zzcgl zzcgl2 = new zzcgl();
        zzcgm zzcgm = r1;
        zzcgm zzcgm2 = new zzcgm();
        Object zzb2 = this.zzb.zzaH.zzb();
        zzfah zze2 = zze();
        zzfbx zzf2 = zzf();
        zzhej zza3 = zzheo.zza(this.zzh);
        zzhej zza4 = zzheo.zza(this.zzj);
        zzhej zza5 = zzheo.zza(this.zzk);
        zzhej zza6 = zzheo.zza(this.zzl);
        zzhej zza7 = zzheo.zza(this.zzm);
        zzhej zza8 = zzheo.zza(this.zzn);
        zzhej zza9 = zzheo.zza(this.zzo);
        zzhej zza10 = zzheo.zza(this.zzq);
        zzhej zza11 = zzheo.zza(this.zzr);
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        return zzfcr.zza(context, zzcgl, zzcgm, zzb2, zze2, zzf2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zza11, zzgfc, (zzfow) this.zzd.zzb(), (zzdzh) this.zzb.zzY.zzb());
    }

    public final zzezp zzb() {
        Context zza2 = this.zzb.zza.zza();
        zzhex.zzb(zza2);
        zzgfc zzgfc = zzcib.zza;
        zzhex.zzb(zzgfc);
        zzcgl zzcgl = new zzcgl();
        zzgfc zzgfc2 = zzcib.zza;
        zzhex.zzb(zzgfc2);
        String zzc2 = this.zza.zzc();
        zzhex.zzb(zzc2);
        zzezm zza3 = zzfcp.zza(new zzfbt(zzcgl, zzgfc2, zzc2, (byte[]) null), zzexn.zza(), (ScheduledExecutorService) this.zzb.zzn.zzb(), -1);
        Context zza4 = this.zzb.zza.zza();
        zzhex.zzb(zza4);
        zzezm zzb2 = zzfcp.zzb(new zzfcd(new zzbzu(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zza4, (byte[]) null), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzcgo zzcgo = new zzcgo();
        Context zza5 = this.zzb.zza.zza();
        zzhex.zzb(zza5);
        zzgfc zzgfc3 = zzcib.zza;
        zzhex.zzb(zzgfc3);
        zzfcg zzfcg = this.zza;
        zzezm zza6 = zzfcq.zza(zzfad.zza(zzcgo, zza5, (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc3, zzfcg.zza(), zzfcj.zzc(zzfcg), zzfcl.zzc(this.zza)), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzgfc zzgfc4 = zzcib.zza;
        zzhex.zzb(zzgfc4);
        zzezm zzc3 = zzfcp.zzc(new zzfcy(zzgfc4), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzfcn zzfcn = zzfcn.zza;
        Context zza7 = this.zzb.zza.zza();
        zzhex.zzb(zza7);
        String zzc4 = this.zza.zzc();
        zzhex.zzb(zzc4);
        zzgfc zzgfc5 = zzcib.zza;
        zzhex.zzb(zzgfc5);
        zzfax zzfax = new zzfax((zzccd) null, zza7, zzc4, zzgfc5);
        zzbel zzbel = new zzbel();
        zzgfc zzgfc6 = zzcib.zza;
        zzhex.zzb(zzgfc6);
        Context zza8 = this.zzb.zza.zza();
        zzhex.zzb(zza8);
        zzcgo zzcgo2 = new zzcgo();
        int zza9 = this.zza.zza();
        Context zza10 = this.zzb.zza.zza();
        zzhex.zzb(zza10);
        zzgfc zzgfc7 = zzcib.zza;
        zzhex.zzb(zzgfc7);
        String zzc5 = this.zza.zzc();
        zzhex.zzb(zzc5);
        String zzc6 = this.zza.zzc();
        zzhex.zzb(zzc6);
        zzgfc zzgfc8 = zzcib.zza;
        zzhex.zzb(zzgfc8);
        return new zzezp(zza2, zzgfc, zzgaz.zzo(zza3, zzb2, zza6, zzc3, zzfcn, zzfax, new zzfbm(zzbel, zzgfc6, zza8, (byte[]) null), zzf(), zze(), new zzfbi(zzcgo2, zza9, zza10, (zzcgx) this.zzb.zzaf.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc7, zzc5, (byte[]) null), (zzezm) this.zzb.zzaH.zzb(), zzfbe.zza(zzc6, new zzbdz(), (zzcgx) this.zzb.zzaf.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzgfc8)), (zzfow) this.zzd.zzb(), (zzdzh) this.zzb.zzY.zzb());
    }

    public final zzfnj zzc() {
        return (zzfnj) this.zzB.zzb();
    }

    public final zzfow zzd() {
        return (zzfow) this.zzd.zzb();
    }
}
