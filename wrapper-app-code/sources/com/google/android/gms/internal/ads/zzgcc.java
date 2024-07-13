package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgcc implements Comparator {
    protected zzgcc() {
    }

    public static zzgcc zzb(Comparator comparator) {
        if (comparator instanceof zzgcc) {
            return (zzgcc) comparator;
        }
        return new zzgag(comparator);
    }

    public static zzgcc zzc() {
        return zzgca.zza;
    }

    public abstract int compare(Object obj, Object obj2);

    public zzgcc zza() {
        return new zzgcl(this);
    }
}
