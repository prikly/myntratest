package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbxg extends zzash implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String readString = parcel.readString();
            zzasi.zzc(parcel);
            zze(readString);
        } else if (i != 4) {
            return false;
        } else {
            zzasi.zzc(parcel);
            zzf((zze) zzasi.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
