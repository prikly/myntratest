package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzesy implements zzesr {
    private final zzfje zza;
    /* access modifiers changed from: private */
    public final zzcpj zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzeso zzd;
    /* access modifiers changed from: private */
    public final zzfoy zze;
    private zzdbb zzf;

    public zzesy(zzcpj zzcpj, Context context, zzeso zzeso, zzfje zzfje) {
        this.zzb = zzcpj;
        this.zzc = context;
        this.zzd = zzeso;
        this.zza = zzfje;
        this.zze = zzcpj.zzz();
        zzfje.zzu(zzeso.zzd());
    }

    public final boolean zza() {
        zzdbb zzdbb = this.zzf;
        return zzdbb != null && zzdbb.zzf();
    }

    public final boolean zzb(zzl zzl, String str, zzesp zzesp, zzesq zzesq) throws RemoteException {
        zzfow zzfow;
        zzt.zzp();
        if (zzs.zzD(this.zzc) && zzl.zzs == null) {
            zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new zzest(this));
            return false;
        } else if (str == null) {
            zze.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new zzesu(this));
            return false;
        } else {
            zzfka.zza(this.zzc, zzl.zzf);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhX)).booleanValue() && zzl.zzf) {
                this.zzb.zzk().zzm(true);
            }
            int i = ((zzess) zzesp).zza;
            zzfje zzfje = this.zza;
            zzfje.zzE(zzl);
            zzfje.zzz(i);
            zzfjg zzG = zzfje.zzG();
            zzfol zzb2 = zzfok.zzb(this.zzc, zzfov.zzf(zzG), 8, zzl);
            zzcb zzcb = zzG.zzn;
            if (zzcb != null) {
                this.zzd.zzd().zzi(zzcb);
            }
            zzdor zzh = this.zzb.zzh();
            zzddx zzddx = new zzddx();
            zzddx.zzc(this.zzc);
            zzddx.zzf(zzG);
            zzh.zzf(zzddx.zzg());
            zzdjy zzdjy = new zzdjy();
            zzdjy.zzk(this.zzd.zzd(), this.zzb.zzB());
            zzh.zze(zzdjy.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcyi((ViewGroup) null));
            zzdos zzg = zzh.zzg();
            if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
                zzfow zzf2 = zzg.zzf();
                zzf2.zzh(8);
                zzf2.zzb(zzl.zzp);
                zzfow = zzf2;
            } else {
                zzfow = null;
            }
            this.zzb.zzx().zzc(1);
            zzgfc zzgfc = zzcib.zza;
            zzhex.zzb(zzgfc);
            ScheduledExecutorService zzC = this.zzb.zzC();
            zzdbu zza2 = zzg.zza();
            zzdbb zzdbb = new zzdbb(zzgfc, zzC, zza2.zzi(zza2.zzj()));
            this.zzf = zzdbb;
            zzdbb.zze(new zzesx(this, zzesq, zzfow, zzb2, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfkg.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfkg.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }
}
