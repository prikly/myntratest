package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbdr extends zzasg implements zzbdt {
    zzbdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(2, zza);
    }

    public final void zzc(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zze);
        zzbl(3, zza);
    }

    public final void zzd(zzbdq zzbdq) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbdq);
        zzbl(1, zza);
    }
}
