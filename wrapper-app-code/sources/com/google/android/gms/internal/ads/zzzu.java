package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzzu implements zzaam {
    private final zzzw zza;
    private final long zzb;

    public zzzu(zzzw zzzw, long j) {
        this.zza = zzzw;
        this.zzb = j;
    }

    private final zzaan zza(long j, long j2) {
        return new zzaan((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    public final long zze() {
        return this.zza.zza();
    }

    public final zzaak zzg(long j) {
        long j2;
        zzdd.zzb(this.zza.zzk);
        zzzw zzzw = this.zza;
        zzzv zzzv = zzzw.zzk;
        long[] jArr = zzzv.zza;
        long[] jArr2 = zzzv.zzb;
        int zzd = zzen.zzd(jArr, zzzw.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzaan zza2 = zza(j2, j3);
        if (zza2.zzb == j || zzd == jArr.length - 1) {
            return new zzaak(zza2, zza2);
        }
        int i = zzd + 1;
        return new zzaak(zza2, zza(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
