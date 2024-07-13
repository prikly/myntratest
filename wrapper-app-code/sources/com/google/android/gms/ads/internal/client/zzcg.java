package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcg extends zzasg implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public final void zzb() throws RemoteException {
        zzbl(5, zza());
    }

    public final void zzc() throws RemoteException {
        zzbl(3, zza());
    }

    public final void zzd(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zze);
        zzbl(1, zza);
    }

    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzf() throws RemoteException {
        zzbl(2, zza());
    }
}
