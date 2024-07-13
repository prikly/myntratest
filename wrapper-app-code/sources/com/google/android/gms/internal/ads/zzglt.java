package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzglt {
    private static final zzglt zza = new zzglt();
    private static final zzgls zzb = new zzgls((zzglr) null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzglt zza() {
        return zza;
    }

    public final zzgol zzb() {
        zzgol zzgol = (zzgol) this.zzc.get();
        return zzgol == null ? zzb : zzgol;
    }
}
