package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnk extends zzasg implements zzbnm {
    zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbnc zzbnc) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbnc);
        zzbl(1, zza);
    }
}
