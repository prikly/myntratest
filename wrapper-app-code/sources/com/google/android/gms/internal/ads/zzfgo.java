package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfgo implements zzesr {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcpj zzc;
    /* access modifiers changed from: private */
    public final zzesb zzd;
    /* access modifiers changed from: private */
    public final zzfho zze;
    private zzbke zzf;
    /* access modifiers changed from: private */
    public final zzfoy zzg;
    private final zzfje zzh;
    /* access modifiers changed from: private */
    public zzgfb zzi;

    public zzfgo(Context context, Executor executor, zzcpj zzcpj, zzesb zzesb, zzfho zzfho, zzfje zzfje) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcpj;
        this.zzd = zzesb;
        this.zzh = zzfje;
        this.zze = zzfho;
        this.zzg = zzcpj.zzz();
    }

    public final boolean zza() {
        zzgfb zzgfb = this.zzi;
        return zzgfb != null && !zzgfb.isDone();
    }

    public final boolean zzb(zzl zzl, String str, zzesp zzesp, zzesq zzesq) {
        zzdnw zzf2;
        zzfow zzfow;
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzfgi(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhX)).booleanValue() && zzl.zzf) {
                this.zzc.zzk().zzm(true);
            }
            zzq zzq = ((zzfgh) zzesp).zza;
            zzfje zzfje = this.zzh;
            zzfje.zzs(str);
            zzfje.zzr(zzq);
            zzfje.zzE(zzl);
            zzfjg zzG = zzfje.zzG();
            zzfol zzb2 = zzfok.zzb(this.zza, zzfov.zzf(zzG), 4, zzl);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhs)).booleanValue()) {
                zzdnv zzg2 = this.zzc.zzg();
                zzddx zzddx = new zzddx();
                zzddx.zzc(this.zza);
                zzddx.zzf(zzG);
                zzg2.zze(zzddx.zzg());
                zzdjy zzdjy = new zzdjy();
                zzdjy.zzj(this.zzd, this.zzb);
                zzdjy.zzk(this.zzd, this.zzb);
                zzg2.zzd(zzdjy.zzn());
                zzg2.zzc(new zzeqk(this.zzf));
                zzf2 = zzg2.zzf();
            } else {
                zzdjy zzdjy2 = new zzdjy();
                zzfho zzfho = this.zze;
                if (zzfho != null) {
                    zzdjy2.zze(zzfho, this.zzb);
                    zzdjy2.zzf(this.zze, this.zzb);
                    zzdjy2.zzb(this.zze, this.zzb);
                }
                zzdnv zzg3 = this.zzc.zzg();
                zzddx zzddx2 = new zzddx();
                zzddx2.zzc(this.zza);
                zzddx2.zzf(zzG);
                zzg3.zze(zzddx2.zzg());
                zzdjy2.zzj(this.zzd, this.zzb);
                zzdjy2.zze(this.zzd, this.zzb);
                zzdjy2.zzf(this.zzd, this.zzb);
                zzdjy2.zzb(this.zzd, this.zzb);
                zzdjy2.zza(this.zzd, this.zzb);
                zzdjy2.zzl(this.zzd, this.zzb);
                zzdjy2.zzk(this.zzd, this.zzb);
                zzdjy2.zzi(this.zzd, this.zzb);
                zzdjy2.zzc(this.zzd, this.zzb);
                zzg3.zzd(zzdjy2.zzn());
                zzg3.zzc(new zzeqk(this.zzf));
                zzf2 = zzg3.zzf();
            }
            zzdnw zzdnw = zzf2;
            if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
                zzfow zzf3 = zzdnw.zzf();
                zzf3.zzh(4);
                zzf3.zzb(zzl.zzp);
                zzfow = zzf3;
            } else {
                zzfow = null;
            }
            zzdbu zza2 = zzdnw.zza();
            zzgfb zzi2 = zza2.zzi(zza2.zzj());
            this.zzi = zzi2;
            zzger.zzr(zzi2, new zzfgn(this, zzesq, zzfow, zzb2, zzdnw), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfkg.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzi(zzbke zzbke) {
        this.zzf = zzbke;
    }
}
