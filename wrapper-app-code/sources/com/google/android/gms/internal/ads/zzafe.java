package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzafe implements zzafb {
    private final zzef zza;
    private final int zzb = this.zza.zzn();
    private final int zzc = (this.zza.zzn() & KotlinVersion.MAX_COMPONENT_VALUE);
    private int zzd;
    private int zze;

    public zzafe(zzaex zzaex) {
        zzef zzef = zzaex.zza;
        this.zza = zzef;
        zzef.zzF(12);
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzk();
        }
        if (i == 16) {
            return this.zza.zzo();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzk = this.zza.zzk();
        this.zze = zzk;
        return (zzk & 240) >> 4;
    }
}
