package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnq extends zzasg implements zzbns {
    zzbnq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbnf zzbnf) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbnf);
        zzbl(1, zza);
    }
}
