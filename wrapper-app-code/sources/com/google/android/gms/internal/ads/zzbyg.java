package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbyg implements zzo {
    final /* synthetic */ zzbyi zza;

    zzbyg(zzbyi zzbyi) {
        this.zza = zzbyi;
    }

    public final void zzb() {
        zzcho.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbyi zzbyi = this.zza;
        zzbyi.zzb.onAdOpened(zzbyi);
    }

    public final void zzbE() {
        zzcho.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbM() {
        zzcho.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbs() {
        zzcho.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        zzcho.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbyi zzbyi = this.zza;
        zzbyi.zzb.onAdClosed(zzbyi);
    }
}
