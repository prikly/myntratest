package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzaal implements zzaam {
    private final long zza;
    private final zzaak zzb;

    public zzaal(long j, long j2) {
        this.zza = j;
        zzaan zzaan = j2 == 0 ? zzaan.zza : new zzaan(0, j2);
        this.zzb = new zzaak(zzaan, zzaan);
    }

    public final long zze() {
        return this.zza;
    }

    public final zzaak zzg(long j) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}
