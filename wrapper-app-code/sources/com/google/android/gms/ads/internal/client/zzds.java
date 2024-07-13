package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzds extends zzash implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzi();
        } else if (i == 2) {
            zzh();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            boolean zzh = zzasi.zzh(parcel);
            zzasi.zzc(parcel);
            zzf(zzh);
        }
        parcel2.writeNoException();
        return true;
    }
}
