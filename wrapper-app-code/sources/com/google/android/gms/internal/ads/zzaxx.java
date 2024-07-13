package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaxx implements zzayx {
    private final zzayx[] zza;

    public zzaxx(zzayx[] zzayxArr) {
        this.zza = zzayxArr;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzayx zza2 : this.zza) {
            long zza3 = zza2.zza();
            if (zza3 != Long.MIN_VALUE) {
                j = Math.min(j, zza3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzbj(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza2 = zza();
            if (zza2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzayx zzayx : this.zza) {
                if (zzayx.zza() == zza2) {
                    z |= zzayx.zzbj(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
