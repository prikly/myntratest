package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnh extends zzasg implements zzbnj {
    zzbnh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbna zzbna) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbna);
        zzbl(1, zza);
    }
}
