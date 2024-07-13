package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfrn {
    private final BlockingQueue zza = new LinkedBlockingQueue();
    private final ThreadPoolExecutor zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.zza);
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfrm zzd = null;

    private final void zzc() {
        zzfrm zzfrm = (zzfrm) this.zzc.poll();
        this.zzd = zzfrm;
        if (zzfrm != null) {
            zzfrm.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfrm zzfrm) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfrm zzfrm) {
        zzfrm.zzb(this);
        this.zzc.add(zzfrm);
        if (this.zzd == null) {
            zzc();
        }
    }
}
