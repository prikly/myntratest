package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbek extends zzasg implements IInterface {
    zzbek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbei zzbei) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzbei);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbef zzf(zzbei zzbei) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzbei);
        Parcel zzbk = zzbk(1, zza);
        zzbef zzbef = (zzbef) zzasi.zza(zzbk, zzbef.CREATOR);
        zzbk.recycle();
        return zzbef;
    }

    public final zzbef zzg(zzbei zzbei) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzbei);
        Parcel zzbk = zzbk(2, zza);
        zzbef zzbef = (zzbef) zzasi.zza(zzbk, zzbef.CREATOR);
        zzbk.recycle();
        return zzbef;
    }
}
