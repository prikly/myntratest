package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcsg {
    private zzcpm zza;
    private zzctt zzb;
    private zzfnn zzc;
    private zzcug zzd;
    private zzfkh zze;

    private zzcsg() {
    }

    /* synthetic */ zzcsg(zzcsf zzcsf) {
    }

    public final zzcpj zza() {
        zzhex.zzc(this.zza, zzcpm.class);
        zzhex.zzc(this.zzb, zzctt.class);
        if (this.zzc == null) {
            this.zzc = new zzfnn();
        }
        if (this.zzd == null) {
            this.zzd = new zzcug();
        }
        if (this.zze == null) {
            this.zze = new zzfkh();
        }
        return new zzcre(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzcrd) null);
    }

    public final zzcsg zzb(zzcpm zzcpm) {
        this.zza = zzcpm;
        return this;
    }

    public final zzcsg zzc(zzctt zzctt) {
        this.zzb = zzctt;
        return this;
    }
}
