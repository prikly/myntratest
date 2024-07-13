package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeba implements Runnable {
    public final /* synthetic */ zzebj zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcig zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfol zzf;

    public /* synthetic */ zzeba(zzebj zzebj, Object obj, zzcig zzcig, String str, long j, zzfol zzfol) {
        this.zza = zzebj;
        this.zzb = obj;
        this.zzc = zzcig;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfol;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
