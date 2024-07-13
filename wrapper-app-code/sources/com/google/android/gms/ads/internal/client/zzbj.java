package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbj extends zzash implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else if (i != 2) {
            return false;
        } else {
            zzasi.zzc(parcel);
            zzb((zze) zzasi.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
