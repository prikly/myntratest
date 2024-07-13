package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcis implements Runnable {
    public final /* synthetic */ zzcjb zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcis(zzcjb zzcjb, int i) {
        this.zza = zzcjb;
        this.zzb = i;
    }

    public final void run() {
        this.zza.zzm(this.zzb);
    }
}
