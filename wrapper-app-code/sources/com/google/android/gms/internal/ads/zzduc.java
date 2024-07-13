package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzduc implements Runnable {
    public final /* synthetic */ zzdue zza;

    public /* synthetic */ zzduc(zzdue zzdue) {
        this.zza = zzdue;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }
}
