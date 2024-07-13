package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnu extends zzasg implements zzbnw {
    zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void zze(zzbu zzbu, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbu);
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }
}
