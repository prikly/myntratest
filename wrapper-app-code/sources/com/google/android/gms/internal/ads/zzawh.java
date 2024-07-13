package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawh implements zzawf {
    private final int zza = this.zzc.zzi();
    private final int zzb = this.zzc.zzi();
    private final zzbar zzc;

    public zzawh(zzawc zzawc) {
        zzbar zzbar = zzawc.zza;
        this.zzc = zzbar;
        zzbar.zzv(12);
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        int i = this.zza;
        return i == 0 ? this.zzc.zzi() : i;
    }

    public final boolean zzc() {
        return this.zza != 0;
    }
}
