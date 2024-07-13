package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbdo extends zzasg implements zzbdq {
    zzbdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzbu zze() throws RemoteException {
        throw null;
    }

    public final zzdn zzf() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzdn zzb = zzdm.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(6, zza);
    }

    public final void zzh(zzdg zzdg) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzdg);
        zzbl(7, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbdx zzbdx) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbdx);
        zzbl(4, zza);
    }

    public final void zzj(zzbdu zzbdu) throws RemoteException {
        throw null;
    }
}
