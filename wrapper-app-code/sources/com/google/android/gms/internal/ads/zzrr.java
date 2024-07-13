package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzrr implements zzua {
    protected final zzua[] zza;

    public zzrr(zzua[] zzuaArr) {
        this.zza = zzuaArr;
    }

    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzua zzb : this.zza) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzua zzc : this.zza) {
            long zzc2 = zzc.zzc();
            if (zzc2 != Long.MIN_VALUE) {
                j = Math.min(j, zzc2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void zzm(long j) {
        for (zzua zzm : this.zza) {
            zzm.zzm(j);
        }
    }

    public final boolean zzo(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long zzc = zzc();
            if (zzc != Long.MIN_VALUE) {
                boolean z2 = false;
                for (zzua zzua : this.zza) {
                    long zzc2 = zzua.zzc();
                    boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j2;
                    if (zzc2 == zzc || z3) {
                        z2 |= zzua.zzo(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    public final boolean zzp() {
        for (zzua zzp : this.zza) {
            if (zzp.zzp()) {
                return true;
            }
        }
        return false;
    }
}
