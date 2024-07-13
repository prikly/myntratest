package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcbt extends zzash implements zzcbu {
    public zzcbt() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasi.zzc(parcel);
            zzf((ParcelFileDescriptor) zzasi.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzasi.zzc(parcel);
            zze((zzaz) zzasi.zza(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
