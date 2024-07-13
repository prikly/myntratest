package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgag extends zzgcc implements Serializable {
    final Comparator zza;

    zzgag(Comparator comparator) {
        if (comparator != null) {
            this.zza = comparator;
            return;
        }
        throw null;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgag) {
            return this.zza.equals(((zzgag) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
