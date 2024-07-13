package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbzf extends zzbny {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbzf(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzboi zzboi) {
        this.zza.onNativeAdLoaded(new zzbyy(zzboi));
    }
}
