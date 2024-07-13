package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaeo implements zzaet {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaeo(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzen.zzv(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaeo zza(long j, zzadi zzadi, long j2) {
        int length = zzadi.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzadi.zzb + zzadi.zzd[i3]);
            j3 += (long) (zzadi.zzc + zzadi.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaeo(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        int zzd = zzen.zzd(jArr, j, true, true);
        long j2 = jArr[zzd];
        long j3 = jArr2[zzd];
        int i = zzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    public final long zzb() {
        return -1;
    }

    public final long zzc(long j) {
        return zzen.zzv(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaak zzg(long j) {
        Pair zzd = zzd(zzen.zzz(zzen.zzr(j, 0, this.zzc)), this.zzb, this.zza);
        long longValue = ((Long) zzd.first).longValue();
        zzaan zzaan = new zzaan(zzen.zzv(longValue), ((Long) zzd.second).longValue());
        return new zzaak(zzaan, zzaan);
    }

    public final boolean zzh() {
        return true;
    }
}
