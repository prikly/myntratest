package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcdo extends zzasg implements IInterface {
    zzcdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbvt zzbvt, int i) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasi.zzg(zza, zzbvt);
        zza.writeInt(224400000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
