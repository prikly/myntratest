package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgcl extends zzgcc implements Serializable {
    final zzgcc zza;

    zzgcl(zzgcc zzgcc) {
        this.zza = zzgcc;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgcl) {
            return this.zza.equals(((zzgcl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zzgcc zzgcc = this.zza;
        sb.append(zzgcc);
        sb.append(".reverse()");
        return zzgcc.toString().concat(".reverse()");
    }

    public final zzgcc zza() {
        return this.zza;
    }
}
