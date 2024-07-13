package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbbo implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzbbr zze;

    zzbbo(zzbbr zzbbr, int i, int i2, int i3, float f2) {
        this.zze = zzbbr;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f2;
    }

    public final void run() {
        this.zze.zzb.zzo(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
