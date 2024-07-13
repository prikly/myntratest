package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawy {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzawy(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        zzbaj.zzc(iArr.length == length);
        int length2 = jArr.length;
        zzbaj.zzc(length2 == length);
        zzbaj.zzc(iArr2.length != length ? false : z);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j) {
        for (int zzc2 = zzbay.zzc(this.zze, j, true, false); zzc2 >= 0; zzc2--) {
            if ((this.zzf[zzc2] & 1) != 0) {
                return zzc2;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzb2 = zzbay.zzb(this.zze, j, true, false); zzb2 < this.zze.length; zzb2++) {
            if ((this.zzf[zzb2] & 1) != 0) {
                return zzb2;
            }
        }
        return -1;
    }
}
