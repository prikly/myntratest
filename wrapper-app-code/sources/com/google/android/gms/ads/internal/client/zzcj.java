package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcj extends zzasg implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbvt getAdapterCreator() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbvt zzf = zzbvs.zzf(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzf;
    }

    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        zzen zzen = (zzen) zzasi.zza(zzbk, zzen.CREATOR);
        zzbk.recycle();
        return zzen;
    }
}
