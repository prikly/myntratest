package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcq extends zzasg implements zzcs {
    zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
