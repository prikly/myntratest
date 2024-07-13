package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehc implements Callable {
    public final /* synthetic */ zzehm zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ zzgfb zzc;
    public final /* synthetic */ zzccb zzd;
    public final /* synthetic */ zzfol zze;

    public /* synthetic */ zzehc(zzehm zzehm, zzgfb zzgfb, zzgfb zzgfb2, zzccb zzccb, zzfol zzfol) {
        this.zza = zzehm;
        this.zzb = zzgfb;
        this.zzc = zzgfb2;
        this.zzd = zzccb;
        this.zze = zzfol;
    }

    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
