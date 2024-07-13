package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbyb implements MediationAdLoadCallback {
    final /* synthetic */ zzbxn zza;
    final /* synthetic */ zzbvz zzb;
    final /* synthetic */ zzbyc zzc;

    zzbyb(zzbyc zzbyc, zzbxn zzbxn, zzbvz zzbvz) {
        this.zzc = zzbyc;
        this.zza = zzbxn;
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
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
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
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
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
