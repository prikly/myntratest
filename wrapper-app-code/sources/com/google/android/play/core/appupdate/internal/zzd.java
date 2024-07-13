package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public final class zzd extends zza implements zzf {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void zzc(String str, Bundle bundle, zzh zzh) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc.zzd(zza, zzh);
        zzb(3, zza);
    }

    public final void zzd(String str, Bundle bundle, zzh zzh) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc.zzd(zza, zzh);
        zzb(2, zza);
    }
}
