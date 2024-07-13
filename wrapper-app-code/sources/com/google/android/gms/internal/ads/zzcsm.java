package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcsm implements zzeah {
    private final zzcre zza;
    private final zzcss zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcsm(zzcre zzcre, zzcss zzcss, zzcsl zzcsl) {
        this.zza = zzcre;
        this.zzb = zzcss;
    }

    public final /* synthetic */ zzeah zza(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ zzeah zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzeai zzc() {
        zzhex.zzc(this.zzc, Long.class);
        zzhex.zzc(this.zzd, String.class);
        return new zzcso(this.zza, this.zzb, this.zzc, this.zzd, (zzcsn) null);
    }
}
