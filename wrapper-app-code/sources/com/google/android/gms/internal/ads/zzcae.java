package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzcae extends zzash implements zzcaf {
    public zzcae() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzcaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzcaf ? (zzcaf) queryLocalInterface : new zzcad(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzasi.zzc(parcel);
            zzf(createTypedArrayList);
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            zzasi.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
