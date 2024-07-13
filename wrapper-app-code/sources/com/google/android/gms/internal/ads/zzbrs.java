package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbrs extends zzasg implements IInterface {
    zzbrs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbrm zzbrm, zzbrr zzbrr) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzbrm);
        zzasi.zzg(zza, zzbrr);
        zzbm(2, zza);
    }
}
