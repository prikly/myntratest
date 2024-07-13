package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbtg implements Runnable {
    public final /* synthetic */ zzbti zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbtg(zzbti zzbti, String str) {
        this.zza = zzbti;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
