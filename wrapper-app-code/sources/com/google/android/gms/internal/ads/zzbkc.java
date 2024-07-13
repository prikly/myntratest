package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbkc extends zzasg implements zzbke {
    zzbkc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbkb zzbkb) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbkb);
        zzbl(1, zza);
    }
}
