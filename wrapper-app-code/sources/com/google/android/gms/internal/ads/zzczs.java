package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzczs implements Runnable {
    public final /* synthetic */ zzczt zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzczs(zzczt zzczt, Runnable runnable) {
        this.zza = zzczt;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
