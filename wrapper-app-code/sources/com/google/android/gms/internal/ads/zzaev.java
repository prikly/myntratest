package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaev implements zzaet {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzaev(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1;
    }

    public static zzaev zza(long j, long j2, zzaac zzaac, zzef zzef) {
        int zzn;
        long j3 = j;
        zzaac zzaac2 = zzaac;
        int i = zzaac2.zzg;
        int i2 = zzaac2.zzd;
        int zze2 = zzef.zze();
        if ((zze2 & 1) != 1 || (zzn = zzef.zzn()) == 0) {
            return null;
        }
        long zzw = zzen.zzw((long) zzn, ((long) i) * 1000000, (long) i2);
        if ((zze2 & 6) != 6) {
            return new zzaev(j2, zzaac2.zzc, zzw, -1, (long[]) null);
        }
        long zzs = zzef.zzs();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) zzef.zzk();
        }
        if (j3 != -1) {
            long j4 = j2 + zzs;
            if (j3 != j4) {
                zzdw.zze("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new zzaev(j2, zzaac2.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc(long j) {
        long j2;
        long j3 = j - this.zza;
        if (!zzh() || j3 <= ((long) this.zzb)) {
            return 0;
        }
        long[] jArr = (long[]) zzdd.zzb(this.zzf);
        double d2 = (((double) j3) * 256.0d) / ((double) this.zzd);
        int zzd2 = zzen.zzd(jArr, (long) d2, true, true);
        long zzd3 = zzd(zzd2);
        long j4 = jArr[zzd2];
        int i = zzd2 + 1;
        long zzd4 = zzd(i);
        if (zzd2 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        return zzd3 + Math.round((j4 == j2 ? 0.0d : (d2 - ((double) j4)) / ((double) (j2 - j4))) * ((double) (zzd4 - zzd3)));
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaak zzg(long j) {
        double d2;
        if (!zzh()) {
            zzaan zzaan = new zzaan(0, this.zza + ((long) this.zzb));
            return new zzaak(zzaan, zzaan);
        }
        long zzr = zzen.zzr(j, 0, this.zzc);
        double d3 = (((double) zzr) * 100.0d) / ((double) this.zzc);
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                long[] jArr = (long[]) zzdd.zzb(this.zzf);
                double d5 = (double) jArr[i];
                if (i == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = (double) jArr[i + 1];
                }
                d4 = d5 + ((d3 - ((double) i)) * (d2 - d5));
            }
        }
        zzaan zzaan2 = new zzaan(zzr, this.zza + zzen.zzr(Math.round((d4 / 256.0d) * ((double) this.zzd)), (long) this.zzb, this.zzd - 1));
        return new zzaak(zzaan2, zzaan2);
    }

    public final boolean zzh() {
        return this.zzf != null;
    }
}
