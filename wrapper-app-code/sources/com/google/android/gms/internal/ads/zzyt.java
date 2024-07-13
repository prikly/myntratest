package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzyt {
    public static final zzyt zza = new zzyt(-3, -9223372036854775807L, -1);
    /* access modifiers changed from: private */
    public final int zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final long zzd;

    private zzyt(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzyt zzd(long j, long j2) {
        return new zzyt(-1, j, j2);
    }

    public static zzyt zze(long j) {
        return new zzyt(0, -9223372036854775807L, j);
    }

    public static zzyt zzf(long j, long j2) {
        return new zzyt(-2, j, j2);
    }
}
