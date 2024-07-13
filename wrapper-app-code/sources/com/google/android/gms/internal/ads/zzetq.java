package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzetq implements zzezm {
    private final zzgfb zza;
    private final Executor zzb;

    public zzetq(zzgfb zzgfb, Executor executor) {
        this.zza = zzgfb;
        this.zzb = executor;
    }

    public final int zza() {
        return 6;
    }

    public final zzgfb zzb() {
        return zzger.zzn(this.zza, zzetp.zza, this.zzb);
    }
}
