package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbzi extends zzash implements zzbzj {
    public zzbzi() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbzj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbzj ? (zzbzj) queryLocalInterface : new zzbzh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasi.zzc(parcel);
            zze((Intent) zzasi.zza(parcel, Intent.CREATOR));
        } else if (i == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasi.zzc(parcel);
            zzg(asInterface, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
