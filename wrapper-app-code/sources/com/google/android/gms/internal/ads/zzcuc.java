package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcuc implements Runnable {
    public final /* synthetic */ zzcue zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcuc(zzcue zzcue, Runnable runnable) {
        this.zza = zzcue;
        this.zzb = runnable;
    }

    public final void run() {
        zzcib.zze.execute(new zzcud(this.zza, this.zzb));
    }
}
