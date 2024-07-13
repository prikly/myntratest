package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfud extends zzash implements zzfue {
    public zzfud() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzasi.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzasi.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzasi.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzasi.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzasi.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzasi.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
