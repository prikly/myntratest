package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbm extends zzash implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasi.zzc(parcel);
            zzg((zzl) zzasi.zza(parcel, zzl.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            zzasi.zzd(parcel2, zzi);
        } else if (i == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzasi.zzc(parcel);
            zzh((zzl) zzasi.zza(parcel, zzl.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
