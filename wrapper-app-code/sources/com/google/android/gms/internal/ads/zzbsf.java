package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbsf extends zzash implements zzbsg {
    public zzbsf() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbsg zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbsg ? (zzbsg) queryLocalInterface : new zzbse(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<zzbrz> createTypedArrayList = parcel.createTypedArrayList(zzbrz.CREATOR);
        zzasi.zzc(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
