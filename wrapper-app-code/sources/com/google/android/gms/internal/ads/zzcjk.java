package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcjk implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcjl zzb;

    zzcjk(zzcjl zzcjl, boolean z) {
        this.zzb = zzcjl;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
