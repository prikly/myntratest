package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcdt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdRequest zzc;
    public final /* synthetic */ RewardedAdLoadCallback zzd;

    public /* synthetic */ zzc(Context context, String str, AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zza = context;
        this.zzb = str;
        this.zzc = adRequest;
        this.zzd = rewardedAdLoadCallback;
    }

    public final void run() {
        Context context = this.zza;
        String str = this.zzb;
        AdRequest adRequest = this.zzc;
        try {
            new zzcdt(context, str).zza(adRequest.zza(), this.zzd);
        } catch (IllegalStateException e2) {
            zzcat.zza(context).zzf(e2, "RewardedAd.load");
        }
    }
}
