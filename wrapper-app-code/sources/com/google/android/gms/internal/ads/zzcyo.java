package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcyo extends zzcyl {
    private final Context zzc;
    private final View zzd;
    private final zzcno zze;
    private final zzfim zzf;
    private final zzdal zzg;
    private final zzdqr zzh;
    private final zzdme zzi;
    private final zzhej zzj;
    private final Executor zzk;
    private zzq zzl;

    zzcyo(zzdam zzdam, Context context, zzfim zzfim, View view, zzcno zzcno, zzdal zzdal, zzdqr zzdqr, zzdme zzdme, zzhej zzhej, Executor executor) {
        super(zzdam);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcno;
        this.zzf = zzfim;
        this.zzg = zzdal;
        this.zzh = zzdqr;
        this.zzi = zzdme;
        this.zzj = zzhej;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcyo zzcyo) {
        zzdqr zzdqr = zzcyo.zzh;
        if (zzdqr.zze() != null) {
            try {
                zzdqr.zze().zze((zzbu) zzcyo.zzj.zzb(), ObjectWrapper.wrap(zzcyo.zzc));
            } catch (RemoteException e2) {
                zze.zzh("RemoteException when notifyAdLoad is called", e2);
            }
        }
    }

    public final int zza() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzha)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final void zzab() {
        this.zzk.execute(new zzcyn(this));
        super.zzab();
    }

    public final View zzc() {
        return this.zzd;
    }

    public final zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfjl unused) {
            return null;
        }
    }

    public final zzfim zze() {
        zzq zzq = this.zzl;
        if (zzq != null) {
            return zzfjk.zzc(zzq);
        }
        zzfil zzfil = this.zzb;
        if (zzfil.zzad) {
            for (String str : zzfil.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfim(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfjk.zzb(this.zzb.zzs, this.zzf);
    }

    public final zzfim zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
        zzcno zzcno;
        if (viewGroup != null && (zzcno = this.zze) != null) {
            zzcno.zzai(zzcpd.zzc(zzq));
            viewGroup.setMinimumHeight(zzq.zzc);
            viewGroup.setMinimumWidth(zzq.zzf);
            this.zzl = zzq;
        }
    }
}
