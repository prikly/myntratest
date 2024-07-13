package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcbl extends zzasg implements zzcbn {
    zzcbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzccb zzccb, zzcbx zzcbx) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzccb);
        zzasi.zzg(zza, zzcbx);
        zzbl(6, zza);
    }

    public final void zzf(zzccb zzccb, zzcbx zzcbx) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzccb);
        zzasi.zzg(zza, zzcbx);
        zzbl(5, zza);
    }

    public final void zzg(zzccb zzccb, zzcbx zzcbx) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzccb);
        zzasi.zzg(zza, zzcbx);
        zzbl(4, zza);
    }

    public final void zzh(String str, zzcbx zzcbx) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasi.zzg(zza, zzcbx);
        zzbl(7, zza);
    }
}
