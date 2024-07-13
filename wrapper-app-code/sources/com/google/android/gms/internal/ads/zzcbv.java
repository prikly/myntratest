package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcbv extends zzasg implements zzcbx {
    zzcbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zze(zzaz zzaz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzaz);
        zzbl(2, zza);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, parcelFileDescriptor);
        zzbl(1, zza);
    }
}
