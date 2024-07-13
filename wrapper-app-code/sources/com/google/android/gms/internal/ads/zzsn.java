package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzsn implements Runnable {
    public final /* synthetic */ zzsq zza;
    public final /* synthetic */ zzsr zzb;
    public final /* synthetic */ zzry zzc;
    public final /* synthetic */ zzsd zzd;

    public /* synthetic */ zzsn(zzsq zzsq, zzsr zzsr, zzry zzry, zzsd zzsd) {
        this.zza = zzsq;
        this.zzb = zzsr;
        this.zzc = zzry;
        this.zzd = zzsd;
    }

    public final void run() {
        zzsq zzsq = this.zza;
        this.zzb.zzaj(zzsq.zza, zzsq.zzb, this.zzc, this.zzd);
    }
}
