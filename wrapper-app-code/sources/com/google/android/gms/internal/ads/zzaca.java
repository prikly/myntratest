package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaca extends zzzx {
    private final long zza;

    public zzaca(zzzk zzzk, long j) {
        super(zzzk);
        zzdd.zzd(zzzk.zzf() >= j);
        this.zza = j;
    }

    public final long zzd() {
        return super.zzd() - this.zza;
    }

    public final long zze() {
        return super.zze() - this.zza;
    }

    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
