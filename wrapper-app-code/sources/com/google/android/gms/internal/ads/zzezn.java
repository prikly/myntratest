package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzezn implements Runnable {
    public final /* synthetic */ zzezp zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzezm zzc;

    public /* synthetic */ zzezn(zzezp zzezp, long j, zzezm zzezm) {
        this.zza = zzezp;
        this.zzb = j;
        this.zzc = zzezm;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
