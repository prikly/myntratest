package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcbp extends zzasg implements zzcbr {
    zzcbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    public final void zze(zzcbj zzcbj, zzcbu zzcbu) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzcbj);
        zzasi.zzg(zza, zzcbu);
        zzbl(3, zza);
    }

    public final void zzf(zzcbf zzcbf, zzcbu zzcbu) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzcbf);
        zzasi.zzg(zza, zzcbu);
        zzbl(1, zza);
    }
}
