package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    zzer(zzet zzet) {
        this.zza = zzet;
    }

    public final void run() {
        zzeu zzeu = this.zza.zza;
        if (zzeu.zza != null) {
            try {
                zzeu.zza.zze(1);
            } catch (RemoteException e2) {
                zzcho.zzk("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}
