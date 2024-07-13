package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgmk {
    private final Class zza;
    private final zzgwa zzb;

    /* synthetic */ zzgmk(Class cls, zzgwa zzgwa, zzgmj zzgmj) {
        this.zza = cls;
        this.zzb = zzgwa;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmk)) {
            return false;
        }
        zzgmk zzgmk = (zzgmk) obj;
        if (!zzgmk.zza.equals(this.zza) || !zzgmk.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(this.zzb);
        return simpleName + ", object identifier: " + valueOf;
    }
}
