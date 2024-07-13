package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbnn extends zzasg implements zzbnp {
    zzbnn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbnf zzbnf, String str) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbnf);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
