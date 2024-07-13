package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzsk implements Runnable {
    public final /* synthetic */ zzsq zza;
    public final /* synthetic */ zzsr zzb;
    public final /* synthetic */ zzsd zzc;

    public /* synthetic */ zzsk(zzsq zzsq, zzsr zzsr, zzsd zzsd) {
        this.zza = zzsq;
        this.zzb = zzsr;
        this.zzc = zzsd;
    }

    public final void run() {
        zzsq zzsq = this.zza;
        this.zzb.zzaf(zzsq.zza, zzsq.zzb, this.zzc);
    }
}
