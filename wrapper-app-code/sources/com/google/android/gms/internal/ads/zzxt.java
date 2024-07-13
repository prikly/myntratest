package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzxt implements Runnable {
    public final /* synthetic */ zzyd zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzxt(zzyd zzyd, int i, long j) {
        this.zza = zzyd;
        this.zzb = i;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
