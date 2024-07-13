package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbxr extends zzasg implements zzbxt {
    zzbxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }

    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }

    public final void zzg(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zze);
        zzbl(3, zza);
    }
}
