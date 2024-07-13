package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawi implements zzawf {
    private final zzbar zza;
    private final int zzb = this.zza.zzi();
    private final int zzc = (this.zza.zzi() & KotlinVersion.MAX_COMPONENT_VALUE);
    private int zzd;
    private int zze;

    public zzawi(zzawc zzawc) {
        zzbar zzbar = zzawc.zza;
        this.zza = zzbar;
        zzbar.zzv(12);
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzg();
        }
        if (i == 16) {
            return this.zza.zzj();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzg = this.zza.zzg();
        this.zze = zzg;
        return (zzg & 240) >> 4;
    }

    public final boolean zzc() {
        return false;
    }
}
