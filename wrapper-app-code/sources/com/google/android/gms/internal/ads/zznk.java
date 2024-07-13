package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zznk implements Runnable {
    public final /* synthetic */ zznp zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zznk(zznp zznp, String str, long j, long j2) {
        this.zza = zznp;
        this.zzb = str;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd);
    }
}
