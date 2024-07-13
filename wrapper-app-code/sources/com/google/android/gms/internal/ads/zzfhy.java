package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfhy implements zzesr {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcpj zzc;
    /* access modifiers changed from: private */
    public final zzfho zzd;
    /* access modifiers changed from: private */
    public final zzfga zze;
    private final zzfiy zzf;
    /* access modifiers changed from: private */
    public final zzfoy zzg;
    private final zzfje zzh;
    private zzgfb zzi;

    public zzfhy(Context context, Executor executor, zzcpj zzcpj, zzfga zzfga, zzfho zzfho, zzfje zzfje, zzfiy zzfiy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcpj;
        this.zze = zzfga;
        this.zzd = zzfho;
        this.zzh = zzfje;
        this.zzf = zzfiy;
        this.zzg = zzcpj.zzz();
    }

    /* access modifiers changed from: private */
    public final zzdvx zzk(zzffy zzffy) {
        zzfhx zzfhx = (zzfhx) zzffy;
        zzdvx zzi2 = this.zzc.zzi();
        zzddx zzddx = new zzddx();
        zzddx.zzc(this.zza);
        zzddx.zzf(zzfhx.zza);
        String str = zzfhx.zzb;
        zzddx.zze(this.zzf);
        zzi2.zzd(zzddx.zzg());
        zzi2.zzc(new zzdjy().zzn());
        return zzi2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzl zzl, String str, zzesp zzesp, zzesq zzesq) throws RemoteException {
        zzfow zzfow;
        zzccy zzccy = new zzccy(zzl, str);
        if (zzccy.zzb == null) {
            zze.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfhr(this));
        } else {
            zzgfb zzgfb = this.zzi;
            if (zzgfb == null || zzgfb.isDone()) {
                if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
                    zzfga zzfga = this.zze;
                    if (zzfga.zzd() != null) {
                        zzfow zzh2 = ((zzdvy) zzfga.zzd()).zzh();
                        zzh2.zzh(5);
                        zzh2.zzb(zzccy.zza.zzp);
                        zzfow = zzh2;
                        zzfka.zza(this.zza, zzccy.zza.zzf);
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhX)).booleanValue() && zzccy.zza.zzf) {
                            this.zzc.zzk().zzm(true);
                        }
                        zzfje zzfje = this.zzh;
                        zzfje.zzs(zzccy.zzb);
                        zzfje.zzr(zzq.zzd());
                        zzfje.zzE(zzccy.zza);
                        zzfjg zzG = zzfje.zzG();
                        zzfol zzb2 = zzfok.zzb(this.zza, zzfov.zzf(zzG), 5, zzccy.zza);
                        zzfhx zzfhx = new zzfhx((zzfhw) null);
                        zzfhx.zza = zzG;
                        zzfhx.zzb = null;
                        zzgfb zzc2 = this.zze.zzc(new zzfgb(zzfhx, (zzccb) null), new zzfhs(this), (Object) null);
                        this.zzi = zzc2;
                        zzger.zzr(zzc2, new zzfhv(this, zzesq, zzfow, zzb2, zzfhx), this.zzb);
                        return true;
                    }
                }
                zzfow = null;
                zzfka.zza(this.zza, zzccy.zza.zzf);
                this.zzc.zzk().zzm(true);
                zzfje zzfje2 = this.zzh;
                zzfje2.zzs(zzccy.zzb);
                zzfje2.zzr(zzq.zzd());
                zzfje2.zzE(zzccy.zza);
                zzfjg zzG2 = zzfje2.zzG();
                zzfol zzb22 = zzfok.zzb(this.zza, zzfov.zzf(zzG2), 5, zzccy.zza);
                zzfhx zzfhx2 = new zzfhx((zzfhw) null);
                zzfhx2.zza = zzG2;
                zzfhx2.zzb = null;
                zzgfb zzc22 = this.zze.zzc(new zzfgb(zzfhx2, (zzccb) null), new zzfhs(this), (Object) null);
                this.zzi = zzc22;
                zzger.zzr(zzc22, new zzfhv(this, zzesq, zzfow, zzb22, zzfhx2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfkg.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
