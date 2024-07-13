package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzbrq extends zzash implements zzbrr {
    public zzbrq() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzasi.zzc(parcel);
        zzb((ParcelFileDescriptor) zzasi.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
