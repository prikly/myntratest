package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzch extends zzash implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasi.zzc(parcel);
            zzd((zze) zzasi.zza(parcel, zze.CREATOR));
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
