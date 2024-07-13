package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzftl extends zzasg implements IInterface {
    zzftl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzftj zze(zzfth zzfth) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzfth);
        Parcel zzbk = zzbk(1, zza);
        zzftj zzftj = (zzftj) zzasi.zza(zzbk, zzftj.CREATOR);
        zzbk.recycle();
        return zzftj;
    }

    public final zzfts zzf(zzftq zzftq) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzftq);
        Parcel zzbk = zzbk(3, zza);
        zzfts zzfts = (zzfts) zzasi.zza(zzbk, zzfts.CREATOR);
        zzbk.recycle();
        return zzfts;
    }

    public final void zzg(zzfte zzfte) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzfte);
        zzbl(2, zza);
    }
}
