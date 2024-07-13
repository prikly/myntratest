package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbxy implements MediationAdLoadCallback {
    final /* synthetic */ zzbxk zza;
    final /* synthetic */ zzbvz zzb;

    zzbxy(zzbyc zzbyc, zzbxk zzbxk, zzbvz zzbvz) {
        this.zza = zzbxk;
        this.zzb = zzbvz;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper == null) {
            zzcho.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzcho.zzh("", e2);
                return null;
            }
        } else {
            try {
                this.zza.zzg(new zzbwy(unifiedNativeAdMapper));
            } catch (RemoteException e3) {
                zzcho.zzh("", e3);
            }
            return new zzbyd(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
