package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcbm extends zzash implements zzcbn {
    public zzcbm() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbx zzcbx = null;
        if (i == 1) {
            zzcbc zzcbc = (zzcbc) zzasi.zza(parcel, zzcbc.CREATOR);
            zzasi.zzc(parcel);
            parcel2.writeNoException();
            zzasi.zzf(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzcbc zzcbc2 = (zzcbc) zzasi.zza(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzcbo) {
                    zzcbo zzcbo = (zzcbo) queryLocalInterface;
                }
            }
            zzasi.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzccb zzccb = (zzccb) zzasi.zza(parcel, zzccb.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbx = queryLocalInterface2 instanceof zzcbx ? (zzcbx) queryLocalInterface2 : new zzcbv(readStrongBinder2);
            }
            zzasi.zzc(parcel);
            zzg(zzccb, zzcbx);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzccb zzccb2 = (zzccb) zzasi.zza(parcel, zzccb.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbx = queryLocalInterface3 instanceof zzcbx ? (zzcbx) queryLocalInterface3 : new zzcbv(readStrongBinder3);
            }
            zzasi.zzc(parcel);
            zzf(zzccb2, zzcbx);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzccb zzccb3 = (zzccb) zzasi.zza(parcel, zzccb.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbx = queryLocalInterface4 instanceof zzcbx ? (zzcbx) queryLocalInterface4 : new zzcbv(readStrongBinder4);
            }
            zzasi.zzc(parcel);
            zze(zzccb3, zzcbx);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbx = queryLocalInterface5 instanceof zzcbx ? (zzcbx) queryLocalInterface5 : new zzcbv(readStrongBinder5);
            }
            zzasi.zzc(parcel);
            zzh(readString, zzcbx);
            parcel2.writeNoException();
        }
        return true;
    }
}
