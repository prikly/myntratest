package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgmm {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgmm(Class cls, Class cls2, zzgml zzgml) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmm)) {
            return false;
        }
        zzgmm zzgmm = (zzgmm) obj;
        if (!zzgmm.zza.equals(this.zza) || !zzgmm.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
