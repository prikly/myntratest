package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbi extends zzasg implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final void zzb(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zze);
        zzbl(2, zza);
    }

    public final void zzc() throws RemoteException {
        zzbl(1, zza());
    }
}
