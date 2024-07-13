package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfev implements zzesr {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcpj zzc;
    /* access modifiers changed from: private */
    public final zzesb zzd;
    /* access modifiers changed from: private */
    public final zzesf zze;
    /* access modifiers changed from: private */
    public final ViewGroup zzf;
    private zzbke zzg;
    /* access modifiers changed from: private */
    public final zzdhc zzh;
    /* access modifiers changed from: private */
    public final zzfoy zzi;
    /* access modifiers changed from: private */
    public final zzdjj zzj;
    private final zzfje zzk;
    /* access modifiers changed from: private */
    public zzgfb zzl;

    public zzfev(Context context, Executor executor, zzq zzq, zzcpj zzcpj, zzesb zzesb, zzesf zzesf, zzfje zzfje, zzdjj zzdjj) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcpj;
        this.zzd = zzesb;
        this.zze = zzesf;
        this.zzk = zzfje;
        this.zzh = zzcpj.zzf();
        this.zzi = zzcpj.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdjj;
        zzfje.zzr(zzq);
    }

    public final boolean zza() {
        zzgfb zzgfb = this.zzl;
        return zzgfb != null && !zzgfb.isDone();
    }

    public final boolean zzb(zzl zzl2, String str, zzesp zzesp, zzesq zzesq) throws RemoteException {
        zzczi zzczi;
        zzfow zzfow;
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzfer(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhX)).booleanValue() && zzl2.zzf) {
                this.zzc.zzk().zzm(true);
            }
            zzfje zzfje = this.zzk;
            zzfje.zzs(str);
            zzfje.zzE(zzl2);
            zzfjg zzG = zzfje.zzG();
            zzfol zzb2 = zzfok.zzb(this.zza, zzfov.zzf(zzG), 3, zzl2);
            if (!((Boolean) zzble.zzd.zze()).booleanValue() || !this.zzk.zzg().zzk) {
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzhq)).booleanValue()) {
                    zzczh zze2 = this.zzc.zze();
                    zzddx zzddx = new zzddx();
                    zzddx.zzc(this.zza);
                    zzddx.zzf(zzG);
                    zze2.zzi(zzddx.zzg());
                    zzdjy zzdjy = new zzdjy();
                    zzdjy.zzj(this.zzd, this.zzb);
                    zzdjy.zzk(this.zzd, this.zzb);
                    zze2.zzf(zzdjy.zzn());
                    zze2.zze(new zzeqk(this.zzg));
                    zze2.zzd(new zzdon(zzdqr.zza, (zzbh) null));
                    zze2.zzg(new zzdaf(this.zzh, this.zzj));
                    zze2.zzc(new zzcyi(this.zzf));
                    zzczi = zze2.zzj();
                } else {
                    zzczh zze3 = this.zzc.zze();
                    zzddx zzddx2 = new zzddx();
                    zzddx2.zzc(this.zza);
                    zzddx2.zzf(zzG);
                    zze3.zzi(zzddx2.zzg());
                    zzdjy zzdjy2 = new zzdjy();
                    zzdjy2.zzj(this.zzd, this.zzb);
                    zzdjy2.zza(this.zzd, this.zzb);
                    zzdjy2.zza(this.zze, this.zzb);
                    zzdjy2.zzl(this.zzd, this.zzb);
                    zzdjy2.zzd(this.zzd, this.zzb);
                    zzdjy2.zze(this.zzd, this.zzb);
                    zzdjy2.zzf(this.zzd, this.zzb);
                    zzdjy2.zzb(this.zzd, this.zzb);
                    zzdjy2.zzk(this.zzd, this.zzb);
                    zzdjy2.zzi(this.zzd, this.zzb);
                    zze3.zzf(zzdjy2.zzn());
                    zze3.zze(new zzeqk(this.zzg));
                    zze3.zzd(new zzdon(zzdqr.zza, (zzbh) null));
                    zze3.zzg(new zzdaf(this.zzh, this.zzj));
                    zze3.zzc(new zzcyi(this.zzf));
                    zzczi = zze3.zzj();
                }
                zzczi zzczi2 = zzczi;
                if (((Boolean) zzbks.zzc.zze()).booleanValue()) {
                    zzfow zzj2 = zzczi2.zzj();
                    zzj2.zzh(3);
                    zzj2.zzb(zzl2.zzp);
                    zzfow = zzj2;
                } else {
                    zzfow = null;
                }
                zzdbu zzd2 = zzczi2.zzd();
                zzgfb zzi2 = zzd2.zzi(zzd2.zzj());
                this.zzl = zzi2;
                zzger.zzr(zzi2, new zzfeu(this, zzesq, zzfow, zzb2, zzczi2), this.zzb);
                return true;
            }
            zzesb zzesb = this.zzd;
            if (zzesb != null) {
                zzesb.zza(zzfkg.zzd(7, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            }
            return false;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfje zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfkg.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(zzbe zzbe) {
        this.zze.zza(zzbe);
    }

    public final void zzp(zzdhd zzdhd) {
        this.zzh.zzj(zzdhd, this.zzb);
    }

    public final void zzq(zzbke zzbke) {
        this.zzg = zzbke;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return zzs.zzT(view, view.getContext());
    }
}
