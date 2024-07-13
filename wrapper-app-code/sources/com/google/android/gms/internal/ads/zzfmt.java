package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfmt {
    public static final zzfna zza(Callable callable, Object obj, zzfnb zzfnb) {
        return zzb(callable, zzfnb.zzb, obj, zzfnb);
    }

    public static final zzfna zzb(Callable callable, zzgfc zzgfc, Object obj, zzfnb zzfnb) {
        return new zzfna(zzfnb, obj, (String) null, zzfnb.zza, Collections.emptyList(), zzgfc.zzb(callable), (zzfmz) null);
    }

    public static final zzfna zzc(zzgfb zzgfb, Object obj, zzfnb zzfnb) {
        return new zzfna(zzfnb, obj, (String) null, zzfnb.zza, Collections.emptyList(), zzgfb, (zzfmz) null);
    }

    public static final zzfna zzd(zzfmn zzfmn, zzgfc zzgfc, Object obj, zzfnb zzfnb) {
        return zzb(new zzfms(zzfmn), zzgfc, obj, zzfnb);
    }
}
