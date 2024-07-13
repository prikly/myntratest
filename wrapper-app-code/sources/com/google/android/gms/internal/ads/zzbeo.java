package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbeo implements Runnable {
    public final /* synthetic */ zzcig zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzbeo(zzcig zzcig, Future future) {
        this.zza = zzcig;
        this.zzb = future;
    }

    public final void run() {
        zzcig zzcig = this.zza;
        Future future = this.zzb;
        int i = zzbeq.zzd;
        if (zzcig.isCancelled()) {
            future.cancel(true);
        }
    }
}
