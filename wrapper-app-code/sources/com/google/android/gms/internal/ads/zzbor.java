package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbor implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbu zzb;
    final /* synthetic */ zzbos zzc;

    zzbor(zzbos zzbos, AdManagerAdView adManagerAdView, zzbu zzbu) {
        this.zzc = zzbos;
        this.zza = adManagerAdView;
        this.zzb = zzbu;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzcho.zzj("Could not bind.");
        }
    }
}
