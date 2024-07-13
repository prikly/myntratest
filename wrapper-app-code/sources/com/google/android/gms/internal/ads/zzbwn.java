package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbwn implements InitializationCompleteCallback {
    final /* synthetic */ zzbsd zza;

    zzbwn(zzbwt zzbwt, zzbsd zzbsd) {
        this.zza = zzbsd;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }
}
