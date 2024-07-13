package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgeq {
    private final boolean zza;
    private final zzgau zzb;

    /* synthetic */ zzgeq(boolean z, zzgau zzgau, zzgep zzgep) {
        this.zza = z;
        this.zzb = zzgau;
    }

    public final zzgfb zza(Callable callable, Executor executor) {
        return new zzgee(this.zzb, this.zza, executor, callable);
    }
}
