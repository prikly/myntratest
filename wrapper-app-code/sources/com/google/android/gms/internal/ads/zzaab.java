package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaab implements zzaam {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaab(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            this.zzb = new long[i];
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, this.zzb, 1, length2);
        }
        this.zzc = j;
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaak zzg(long j) {
        if (!this.zzd) {
            zzaan zzaan = zzaan.zza;
            return new zzaak(zzaan, zzaan);
        }
        int zzd2 = zzen.zzd(this.zzb, j, true, true);
        zzaan zzaan2 = new zzaan(this.zzb[zzd2], this.zza[zzd2]);
        if (zzaan2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzaak(zzaan2, new zzaan(jArr[i], this.zza[i]));
            }
        }
        return new zzaak(zzaan2, zzaan2);
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
