package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzdf extends zzash implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdg ? (zzdg) queryLocalInterface : new zzde(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzasi.zzc(parcel);
        zze((zzs) zzasi.zza(parcel, zzs.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
