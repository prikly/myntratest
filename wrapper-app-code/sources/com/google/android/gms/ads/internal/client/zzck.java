package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbvt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzck extends zzash implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzasi.zzf(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            zzbvt adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzasi.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}
