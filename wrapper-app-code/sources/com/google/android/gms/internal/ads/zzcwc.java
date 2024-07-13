package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcwc implements Runnable {
    public final /* synthetic */ zzcwh zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcwc(zzcwh zzcwh, int i, int i2) {
        this.zza = zzcwh;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzh(this.zzb, this.zzc);
    }
}
