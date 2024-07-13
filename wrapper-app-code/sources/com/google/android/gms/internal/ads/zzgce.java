package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgce extends zzgau {
    final /* synthetic */ zzgcf zza;

    zzgce(zzgcf zzgcf) {
        this.zza = zzgcf;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfye.zza(i, this.zza.zzc, "index");
        zzgcf zzgcf = this.zza;
        int i2 = i + i;
        Object obj = zzgcf.zzb[i2];
        obj.getClass();
        Object obj2 = zzgcf.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
