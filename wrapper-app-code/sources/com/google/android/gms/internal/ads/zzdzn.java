package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdzn implements Runnable {
    public final /* synthetic */ zzdzo zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdzn(zzdzo zzdzo, String str) {
        this.zza = zzdzo;
        this.zzb = str;
    }

    public final void run() {
        zzdzo zzdzo = this.zza;
        zzdzo.zzd.zza(this.zzb);
    }
}
