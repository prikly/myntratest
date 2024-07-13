package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzyy implements zzaam {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzyy(long j, long j2, int i, int i2, boolean z) {
        long zzb2;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1;
            zzb2 = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzb2 = zzb(j, j2, i);
        }
        this.zzf = zzb2;
    }

    private static long zzb(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    public final long zza(long j) {
        return zzb(j, this.zzb, this.zze);
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzaak zzg(long j) {
        long j2 = this.zzd;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            int i2 = this.zze;
            long j3 = (long) this.zzc;
            long j4 = (((((long) i2) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.zzb + Math.max(j4, 0);
            long zza2 = zza(max);
            zzaan zzaan = new zzaan(zza2, max);
            if (this.zzd != -1 && zza2 < j) {
                long j5 = max + ((long) this.zzc);
                if (j5 < this.zza) {
                    return new zzaak(zzaan, new zzaan(zza(j5), j5));
                }
            }
            return new zzaak(zzaan, zzaan);
        }
        zzaan zzaan2 = new zzaan(0, this.zzb);
        return new zzaak(zzaan2, zzaan2);
    }

    public final boolean zzh() {
        return this.zzd != -1;
    }
}
