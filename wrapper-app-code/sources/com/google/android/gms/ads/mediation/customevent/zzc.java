package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzc implements CustomEventNativeListener {
    private final CustomEventAdapter zza;
    private final MediationNativeListener zzb;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationNativeListener;
    }

    public final void onAdClicked() {
        zzcho.zze("Custom event adapter called onAdClicked.");
        this.zzb.onAdClicked(this.zza);
    }

    public final void onAdClosed() {
        zzcho.zze("Custom event adapter called onAdClosed.");
        this.zzb.onAdClosed(this.zza);
    }

    public final void onAdFailedToLoad(int i) {
        zzcho.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad((MediationNativeAdapter) this.zza, i);
    }

    public final void onAdImpression() {
        zzcho.zze("Custom event adapter called onAdImpression.");
        this.zzb.onAdImpression(this.zza);
    }

    public final void onAdLeftApplication() {
        zzcho.zze("Custom event adapter called onAdLeftApplication.");
        this.zzb.onAdLeftApplication(this.zza);
    }

    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzcho.zze("Custom event adapter called onAdLoaded.");
        this.zzb.onAdLoaded(this.zza, unifiedNativeAdMapper);
    }

    public final void onAdOpened() {
        zzcho.zze("Custom event adapter called onAdOpened.");
        this.zzb.onAdOpened(this.zza);
    }

    public final void onAdFailedToLoad(AdError adError) {
        zzcho.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad((MediationNativeAdapter) this.zza, adError);
    }
}
