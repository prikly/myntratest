package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbte implements Runnable {
    public final /* synthetic */ zzbti zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbte(zzbti zzbti, String str) {
        this.zza = zzbti;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb);
    }
}
