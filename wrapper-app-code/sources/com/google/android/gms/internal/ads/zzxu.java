package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzxu implements Runnable {
    public final /* synthetic */ zzyd zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzxu(zzyd zzyd, Object obj, long j) {
        this.zza = zzyd;
        this.zzb = obj;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
