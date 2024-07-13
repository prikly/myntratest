package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfqw implements Runnable {
    final /* synthetic */ zzfqx zza;
    private final WebView zzb = this.zza.zza;

    zzfqw(zzfqx zzfqx) {
        this.zza = zzfqx;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
