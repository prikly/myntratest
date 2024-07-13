package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfmr {
    final /* synthetic */ zzfnb zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfmr(zzfnb zzfnb, Object obj, List list, zzfmq zzfmq) {
        this.zza = zzfnb;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfna zza(Callable callable) {
        zzgeq zzc2 = zzger.zzc(this.zzc);
        zzgfb zza2 = zzc2.zza(zzfmp.zza, zzcib.zzf);
        zzfnb zzfnb = this.zza;
        return new zzfna(zzfnb, this.zzb, (String) null, zza2, this.zzc, zzc2.zza(callable, zzfnb.zzb), (zzfmz) null);
    }
}
