package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbya implements SignalCallbacks {
    final /* synthetic */ zzbxt zza;

    zzbya(zzbyc zzbyc, zzbxt zzbxt) {
        this.zza = zzbxt;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }
}
