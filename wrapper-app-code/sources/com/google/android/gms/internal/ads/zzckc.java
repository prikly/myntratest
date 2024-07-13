package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzckc implements Runnable {
    public final /* synthetic */ zzckp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzckc(zzckp zzckp, boolean z, long j) {
        this.zza = zzckp;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzI(this.zzb, this.zzc);
    }
}
