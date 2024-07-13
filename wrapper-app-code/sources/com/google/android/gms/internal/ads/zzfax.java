package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfax implements zzezm {
    private final Context zza;
    private final String zzb;
    private final zzgfc zzc;

    public zzfax(zzccd zzccd, Context context, String str, zzgfc zzgfc) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzgfc;
    }

    public final int zza() {
        return 42;
    }

    public final zzgfb zzb() {
        return this.zzc.zzb(new zzfaw(this));
    }
}
