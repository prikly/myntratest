package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbvt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbv extends zzasg implements IInterface {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvt zzbvt, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzq);
        zza.writeString(str);
        zzasi.zzg(zza, zzbvt);
        zza.writeInt(224400000);
        zza.writeInt(i2);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
