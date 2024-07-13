package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzxw implements Runnable {
    public final /* synthetic */ zzyd zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzxw(zzyd zzyd, long j, int i) {
        this.zza = zzyd;
        this.zzb = j;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
