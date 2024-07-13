package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzfb implements Runnable {
    public final /* synthetic */ zzcdr zza;

    public /* synthetic */ zzfb(zzcdr zzcdr) {
        this.zza = zzcdr;
    }

    public final void run() {
        zzcdr zzcdr = this.zza;
        if (zzcdr != null) {
            try {
                zzcdr.zze(1);
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
