package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zztq implements zzwc {
    public long zza;
    public long zzb;
    public zzwb zzc;
    public zztq zzd;

    public zztq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zztq zzb() {
        this.zzc = null;
        zztq zztq = this.zzd;
        this.zzd = null;
        return zztq;
    }

    public final zzwb zzc() {
        zzwb zzwb = this.zzc;
        if (zzwb != null) {
            return zzwb;
        }
        throw null;
    }

    public final zzwc zzd() {
        zztq zztq = this.zzd;
        if (zztq == null || zztq.zzc == null) {
            return null;
        }
        return zztq;
    }

    public final void zze(long j, int i) {
        zzdd.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
