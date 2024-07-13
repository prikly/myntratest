package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzagd implements zzagj {
    private final zzzw zza;
    private final zzzv zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzagd(zzzw zzzw, zzzv zzzv) {
        this.zza = zzzw;
        this.zzb = zzzv;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final long zzd(zzzk zzzk) {
        long j = this.zzd;
        if (j < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j + 2);
    }

    public final zzaam zze() {
        zzdd.zzf(this.zzc != -1);
        return new zzzu(this.zza, this.zzc);
    }

    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzen.zzd(jArr, j, true, true)];
    }
}
