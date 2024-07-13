package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbxj extends zzash implements zzbxk {
    public zzbxj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbwi zzb = zzbwh.zzb(parcel.readStrongBinder());
            zzasi.zzc(parcel);
            zzg(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzasi.zzc(parcel);
            zze(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzasi.zzc(parcel);
            zzf((zze) zzasi.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
