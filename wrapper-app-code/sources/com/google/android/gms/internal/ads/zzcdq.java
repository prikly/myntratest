package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzcdq extends zzash implements zzcdr {
    public zzcdq() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzasi.zzc(parcel);
            zze(readInt);
        } else if (i != 3) {
            return false;
        } else {
            zzasi.zzc(parcel);
            zzf((zze) zzasi.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
