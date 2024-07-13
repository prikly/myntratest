package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzciv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcjb zzc;

    zzciv(zzcjb zzcjb, String str, String str2) {
        this.zzc = zzcjb;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        zzcjb zzcjb = this.zzc;
        if (zzcjb.zzr != null) {
            zzcjb.zzr.zzb(this.zza, this.zzb);
        }
    }
}
