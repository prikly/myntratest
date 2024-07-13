package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgck extends zzgcc implements Serializable {
    static final zzgck zza = new zzgck();

    private zzgck() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable == null) {
            throw null;
        } else if (comparable == comparable2) {
            return 0;
        } else {
            return comparable2.compareTo(comparable);
        }
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final zzgcc zza() {
        return zzgca.zza;
    }
}
