package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbvs extends zzash implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvt zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzasi.zzc(parcel);
            zzbvw zzb = zzb(readString);
            parcel2.writeNoException();
            zzasi.zzg(parcel2, zzb);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzasi.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            zzasi.zzd(parcel2, zze);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzasi.zzc(parcel);
            zzbxq zzc = zzc(readString3);
            parcel2.writeNoException();
            zzasi.zzg(parcel2, zzc);
        } else if (i != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            zzasi.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            zzasi.zzd(parcel2, zzd);
        }
        return true;
    }
}
