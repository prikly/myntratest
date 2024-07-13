package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzblt extends zzasg implements IInterface {
    zzblt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzcba zzcba) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzcba);
        zzbl(1, zza);
    }
}
