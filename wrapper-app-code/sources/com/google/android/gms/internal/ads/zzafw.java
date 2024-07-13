package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzafw {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzafx[] zzk;

    public zzafw(int i, int i2, long j, long j2, long j3, zzaf zzaf, int i3, zzafx[] zzafxArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzaf;
        this.zzg = i3;
        this.zzk = zzafxArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzafx zza(int i) {
        zzafx[] zzafxArr = this.zzk;
        if (zzafxArr == null) {
            return null;
        }
        return zzafxArr[i];
    }
}
