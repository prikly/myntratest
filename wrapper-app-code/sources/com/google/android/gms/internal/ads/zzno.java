package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzno implements Runnable {
    public final /* synthetic */ zznp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzno(zznp zznp, int i, long j, long j2) {
        this.zza = zznp;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}
