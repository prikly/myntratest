package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzecp implements NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ zzecy zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzecp(zzecy zzecy, String str, String str2) {
        this.zza = zzecy;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void onNativeAdLoaded(NativeAd nativeAd) {
        this.zza.zzg(this.zzb, nativeAd, this.zzc);
    }
}
