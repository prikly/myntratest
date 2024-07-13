package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcjj implements Runnable {
    final /* synthetic */ zzcjl zza;

    zzcjj(zzcjl zzcjl) {
        this.zza = zzcjl;
    }

    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
