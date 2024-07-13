package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzath {
    public static final zzath zza = new zzath(1.0f, 1.0f);
    public final float zzb;
    public final float zzc = 1.0f;
    private final int zzd;

    public zzath(float f2, float f3) {
        this.zzb = f2;
        this.zzd = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzb == ((zzath) obj).zzb;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(1.0f);
    }

    public final long zza(long j) {
        return j * ((long) this.zzd);
    }
}
