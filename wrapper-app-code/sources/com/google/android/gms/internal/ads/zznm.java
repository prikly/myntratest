package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zznm implements Runnable {
    public final /* synthetic */ zznp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zznm(zznp zznp, String str) {
        this.zza = zznp;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
