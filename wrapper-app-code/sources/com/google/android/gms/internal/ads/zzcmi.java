package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcmi implements Runnable {
    public final /* synthetic */ zzcjx zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcmi(zzcjx zzcjx, boolean z, long j) {
        this.zza = zzcjx;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        zzcjx zzcjx = this.zza;
        boolean z = this.zzb;
        long j = this.zzc;
        int i = zzcmj.zzd;
        zzcjx.zzx(z, j);
    }
}
