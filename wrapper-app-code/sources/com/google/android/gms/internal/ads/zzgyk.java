package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgyk extends AbstractList {
    private final List zza;
    private final zzgyj zzb;

    public zzgyk(List list, zzgyj zzgyj) {
        this.zza = list;
        this.zzb = zzgyj;
    }

    public final Object get(int i) {
        zzbfu zzb2 = zzbfu.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb2 == null ? zzbfu.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
