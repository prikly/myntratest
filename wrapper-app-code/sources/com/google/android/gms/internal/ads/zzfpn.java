package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfpn implements Runnable {
    public final /* synthetic */ zzfpo zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfow zzc;

    public /* synthetic */ zzfpn(zzfpo zzfpo, String str, zzfow zzfow) {
        this.zza = zzfpo;
        this.zzb = str;
        this.zzc = zzfow;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
