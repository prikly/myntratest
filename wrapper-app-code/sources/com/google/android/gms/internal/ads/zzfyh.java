package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfyh implements zzfyf, Serializable {
    private final List zza;

    /* synthetic */ zzfyh(List list, zzfyg zzfyg) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyh) {
            return this.zza.equals(((zzfyh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfyf) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
