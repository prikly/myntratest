package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnx extends zzasg implements zzbnz {
    zzbnx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzboi zzboi) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzboi);
        zzbl(1, zza);
    }
}
