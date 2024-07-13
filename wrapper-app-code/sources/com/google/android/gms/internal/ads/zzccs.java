package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzccs extends zzasg implements IInterface {
    zzccs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzccr zzccr, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzccr);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
