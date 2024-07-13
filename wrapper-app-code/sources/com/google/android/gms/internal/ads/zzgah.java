package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgah extends zzgaj {
    zzgah() {
        super((zzgah) null);
    }

    static final zzgaj zzf(int i) {
        return i < 0 ? zzgaj.zzb : i > 0 ? zzgaj.zzc : zzgaj.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzgaj zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    public final zzgaj zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzgaj zzd(boolean z, boolean z2) {
        return zzf(zzgcy.zza(z, z2));
    }

    public final zzgaj zze(boolean z, boolean z2) {
        return zzf(zzgcy.zza(false, false));
    }
}
