package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzckm implements Runnable {
    public final /* synthetic */ zzckp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzckm(zzckp zzckp, int i, int i2) {
        this.zza = zzckp;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzN(this.zzb, this.zzc);
    }
}
