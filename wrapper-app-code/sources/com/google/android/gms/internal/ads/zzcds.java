package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcds extends zzasg implements IInterface {
    zzcds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcdh zzcdh, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzcdh);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
