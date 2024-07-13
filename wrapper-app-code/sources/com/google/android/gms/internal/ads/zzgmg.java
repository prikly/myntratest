package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmg implements zzgmh {
    private final zzgwa zza;
    private final zzgtb zzb;

    private zzgmg(zzgtb zzgtb) {
        this.zzb = zzgtb;
        this.zza = zzgmq.zza(zzgtb.zzg());
    }

    public static zzgmg zza(zzgtb zzgtb) {
        return new zzgmg(zzgtb);
    }

    public final zzgtb zzb() {
        return this.zzb;
    }

    public final zzgwa zzd() {
        return this.zza;
    }
}
