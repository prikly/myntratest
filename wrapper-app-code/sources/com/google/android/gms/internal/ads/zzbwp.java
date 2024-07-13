package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbwp implements MediationAdLoadCallback {
    final /* synthetic */ zzbvz zza;
    final /* synthetic */ zzbwt zzb;

    zzbwp(zzbwt zzbwt, zzbvz zzbvz) {
        this.zzb = zzbwt;
        this.zza = zzbvz;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzcho.zze(canonicalName + "failed to loaded mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzf = (MediationInterstitialAd) obj;
            this.zza.zzo();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
        return new zzbwk(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
