package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzayz {
    public final int zza = 1;
    private final zzatd[] zzb;
    private int zzc;

    public zzayz(zzatd... zzatdArr) {
        this.zzb = zzatdArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zzb, ((zzayz) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        this.zzc = hashCode;
        return hashCode;
    }

    public final int zza(zzatd zzatd) {
        for (int i = 0; i <= 0; i++) {
            if (zzatd == this.zzb[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzatd zzb(int i) {
        return this.zzb[i];
    }
}
