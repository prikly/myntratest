package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzkb {
    public static final zzkb zza = new zzkb(0, 0);
    public static final zzkb zzb = new zzkb(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzkb zzc = new zzkb(Long.MAX_VALUE, 0);
    public static final zzkb zzd = new zzkb(0, Long.MAX_VALUE);
    public static final zzkb zze = zza;
    public final long zzf;
    public final long zzg;

    public zzkb(long j, long j2) {
        boolean z = true;
        zzdd.zzd(j >= 0);
        zzdd.zzd(j2 < 0 ? false : z);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkb zzkb = (zzkb) obj;
            return this.zzf == zzkb.zzf && this.zzg == zzkb.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
