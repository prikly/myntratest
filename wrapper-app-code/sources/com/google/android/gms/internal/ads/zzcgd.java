package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcgd extends zzasg implements zzcgf {
    zzcgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzcgj zzcgj, zzcgc zzcgc) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzcgj);
        zzasi.zzg(zza, zzcgc);
        zzbl(1, zza);
    }

    public final void zzf(zzcao zzcao) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzcao);
        zzbl(7, zza);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzcaf);
        zzbl(10, zza);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzcaf);
        zzbl(9, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzcaf);
        zzbl(6, zza);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzcaf);
        zzbl(5, zza);
    }
}
