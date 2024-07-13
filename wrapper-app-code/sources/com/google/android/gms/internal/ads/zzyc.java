package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzyc implements Runnable {
    public final /* synthetic */ zzyd zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzyc(zzyd zzyd, String str) {
        this.zza = zzyd;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
