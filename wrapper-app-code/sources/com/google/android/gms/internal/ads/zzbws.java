package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbws implements MediationAdLoadCallback {
    final /* synthetic */ zzbvz zza;
    final /* synthetic */ zzbwt zzb;

    zzbws(zzbwt zzbwt, zzbvz zzbvz) {
        this.zzb = zzbwt;
        this.zza = zzbvz;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzcho.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzj = (MediationAppOpenAd) obj;
            this.zza.zzo();
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
        return new zzbwk(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            zzcho.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }
}
