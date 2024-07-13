package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzecr extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzecy zzd;

    zzecr(zzecy zzecy, String str, AdView adView, String str2) {
        this.zzd = zzecy;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzd.zzl(zzecy.zzk(loadAdError), this.zzc);
    }

    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
