package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemt extends zzcdb implements zzdfx {
    private zzcdc zza;
    private zzdfw zzb;
    private zzdmn zzc;

    public final synchronized void zza(zzdfw zzdfw) {
        this.zzb = zzdfw;
    }

    public final synchronized void zzc(zzcdc zzcdc) {
        this.zza = zzcdc;
    }

    public final synchronized void zzd(zzdmn zzdmn) {
        this.zzc = zzdmn;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            zzcdc.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdfw zzdfw = this.zzb;
        if (zzdfw != null) {
            zzdfw.zza(i);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdfw zzdfw = this.zzb;
        if (zzdfw != null) {
            zzdfw.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zza.zzb();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdmn zzdmn = this.zzc;
        if (zzdmn != null) {
            zze.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzepl) zzdmn).zzc.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdmn zzdmn = this.zzc;
        if (zzdmn != null) {
            ((zzepl) zzdmn).zzd.zzb.execute(new zzepk((zzepl) zzdmn, ((zzepl) zzdmn).zza, ((zzepl) zzdmn).zzb, ((zzepl) zzdmn).zzc));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcdd zzcdd) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zzd.zza(zzcdd);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zzc.zze();
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcdc zzcdc = this.zza;
        if (zzcdc != null) {
            ((zzepm) zzcdc).zzd.zzc();
        }
    }
}
