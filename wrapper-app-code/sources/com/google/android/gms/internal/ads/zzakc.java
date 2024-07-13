package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzakc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzake zzc;

    zzakc(zzake zzake, String str, long j) {
        this.zzc = zzake;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzake zzake = this.zzc;
        zzake.zza.zzb(zzake.toString());
    }
}
