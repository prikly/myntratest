package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzebg implements Runnable {
    public final /* synthetic */ zzebh zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzebg(zzebh zzebh, String str) {
        this.zza = zzebh;
        this.zzb = str;
    }

    public final void run() {
        zzebh zzebh = this.zza;
        zzebj.zzj(zzebh.zza, this.zzb);
    }
}
