package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcfg implements Runnable {
    public final /* synthetic */ zzcft zza;
    public final /* synthetic */ zzcfs zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzcfg(zzcft zzcft, zzcfs zzcfs, String str) {
        this.zza = zzcft;
        this.zzb = zzcfs;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
