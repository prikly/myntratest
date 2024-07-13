package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfpm implements Runnable {
    public final /* synthetic */ zzfpo zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfpm(zzfpo zzfpo, String str) {
        this.zza = zzfpo;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
