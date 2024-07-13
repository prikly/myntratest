package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfwp extends zzasg implements zzfwr {
    zzfwp(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfwt zzfwt) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, bundle);
        zzasi.zzg(zza, zzfwt);
        zzbm(2, zza);
    }

    public final void zzf(String str, Bundle bundle, zzfwt zzfwt) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasi.zze(zza, bundle);
        zzasi.zzg(zza, zzfwt);
        zzbm(1, zza);
    }

    public final void zzg(Bundle bundle, zzfwt zzfwt) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, bundle);
        zzasi.zzg(zza, zzfwt);
        zzbm(3, zza);
    }
}
