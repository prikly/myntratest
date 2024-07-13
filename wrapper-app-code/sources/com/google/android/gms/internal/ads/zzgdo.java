package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzgdo implements Runnable {
    public final /* synthetic */ zzgdq zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzgdo(zzgdq zzgdq, zzgfb zzgfb, int i) {
        this.zza = zzgdq;
        this.zzb = zzgfb;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}
