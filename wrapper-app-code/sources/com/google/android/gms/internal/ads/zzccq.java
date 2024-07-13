package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzccq extends zzash implements zzccr {
    public zzccq() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i != 2) {
            return false;
        } else {
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
