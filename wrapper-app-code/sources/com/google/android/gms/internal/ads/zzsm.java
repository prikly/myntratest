package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzsm implements Runnable {
    public final /* synthetic */ zzsq zza;
    public final /* synthetic */ zzsr zzb;
    public final /* synthetic */ zzry zzc;
    public final /* synthetic */ zzsd zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzsm(zzsq zzsq, zzsr zzsr, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        this.zza = zzsq;
        this.zzb = zzsr;
        this.zzc = zzry;
        this.zzd = zzsd;
        this.zze = iOException;
        this.zzf = z;
    }

    public final void run() {
        zzsq zzsq = this.zza;
        this.zzb.zzai(zzsq.zza, zzsq.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
