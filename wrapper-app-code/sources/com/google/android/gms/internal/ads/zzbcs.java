package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbcs implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbcw zzb;

    zzbcs(zzbcw zzbcw, View view) {
        this.zzb = zzbcw;
        this.zza = view;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
