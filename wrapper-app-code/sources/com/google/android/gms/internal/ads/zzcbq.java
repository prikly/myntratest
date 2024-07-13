package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcbq extends zzash implements zzcbr {
    public zzcbq() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbu zzcbu = null;
        if (i == 1) {
            zzcbf zzcbf = (zzcbf) zzasi.zza(parcel, zzcbf.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzcbu = queryLocalInterface instanceof zzcbu ? (zzcbu) queryLocalInterface : new zzcbs(readStrongBinder);
            }
            zzasi.zzc(parcel);
            zzf(zzcbf, zzcbu);
        } else if (i == 2) {
            zzcbf zzcbf2 = (zzcbf) zzasi.zza(parcel, zzcbf.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzcbu) {
                    zzcbu zzcbu2 = (zzcbu) queryLocalInterface2;
                }
            }
            zzasi.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzcbj zzcbj = (zzcbj) zzasi.zza(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzcbu = queryLocalInterface3 instanceof zzcbu ? (zzcbu) queryLocalInterface3 : new zzcbs(readStrongBinder3);
            }
            zzasi.zzc(parcel);
            zze(zzcbj, zzcbu);
        }
        parcel2.writeNoException();
        return true;
    }
}
