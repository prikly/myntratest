package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzecv extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzecy zzb;

    zzecv(zzecy zzecy, String str) {
        this.zzb = zzecy;
        this.zza = str;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzl(zzecy.zzk(loadAdError), this.zza);
    }
}
