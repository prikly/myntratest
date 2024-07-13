package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcdp extends zzasg implements zzcdr {
    zzcdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zze);
        zzbl(3, zza);
    }

    public final void zzg() throws RemoteException {
        zzbl(1, zza());
    }
}
