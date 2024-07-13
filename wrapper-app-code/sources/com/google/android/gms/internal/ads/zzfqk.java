package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqk {
    private final zzfrr zza;
    private final String zzb;
    private final zzfpz zzc;
    private final String zzd = "Ad overlay";

    public zzfqk(View view, zzfpz zzfpz, String str) {
        this.zza = new zzfrr(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfpz;
    }

    public final zzfpz zza() {
        return this.zzc;
    }

    public final zzfrr zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
