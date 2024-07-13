package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbbp implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbbr zzb;

    zzbbp(zzbbr zzbbr, Surface surface) {
        this.zzb = zzbbr;
        this.zza = surface;
    }

    public final void run() {
        this.zzb.zzb.zzm(this.zza);
    }
}
