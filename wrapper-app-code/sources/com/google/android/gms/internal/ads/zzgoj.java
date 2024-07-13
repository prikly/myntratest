package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgoj {
    public static final zzgoj zza = new zzgoh().zza();
    private final Map zzb;

    /* synthetic */ zzgoj(Map map, zzgoi zzgoi) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoj)) {
            return false;
        }
        return this.zzb.equals(((zzgoj) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
