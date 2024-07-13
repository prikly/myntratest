package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbtd implements Runnable {
    public final /* synthetic */ zzbti zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbtd(zzbti zzbti, String str) {
        this.zza = zzbti;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzm(this.zzb);
    }
}
