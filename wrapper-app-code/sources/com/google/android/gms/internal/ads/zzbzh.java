package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbzh extends zzasg implements zzbzj {
    zzbzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, intent);
        zzbl(1, zza);
    }

    public final void zzf() throws RemoteException {
        zzbl(3, zza());
    }

    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
