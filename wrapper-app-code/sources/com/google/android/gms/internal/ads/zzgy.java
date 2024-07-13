package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgy implements zzjg {
    private final zzke zza;
    private final zzgx zzb;
    private zzjy zzc;
    private zzjg zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgy(zzgx zzgx, zzde zzde) {
        this.zzb = zzgx;
        this.zza = new zzke(zzde);
    }

    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzjy zzjy = this.zzc;
        if (zzjy == null || zzjy.zzM() || (!this.zzc.zzN() && (z || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzjg zzjg = this.zzd;
            if (zzjg != null) {
                long zza2 = zzjg.zza();
                if (this.zze) {
                    if (zza2 < this.zza.zza()) {
                        this.zza.zze();
                    } else {
                        this.zze = false;
                        if (this.zzf) {
                            this.zza.zzd();
                        }
                    }
                }
                this.zza.zzb(zza2);
                zzby zzc2 = zzjg.zzc();
                if (!zzc2.equals(this.zza.zzc())) {
                    this.zza.zzg(zzc2);
                    this.zzb.zza(zzc2);
                }
            } else {
                throw null;
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjg zzjg2 = this.zzd;
        if (zzjg2 != null) {
            return zzjg2.zza();
        }
        throw null;
    }

    public final zzby zzc() {
        zzjg zzjg = this.zzd;
        return zzjg != null ? zzjg.zzc() : this.zza.zzc();
    }

    public final void zzd(zzjy zzjy) {
        if (zzjy == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzjy zzjy) throws zzha {
        zzjg zzjg;
        zzjg zzi = zzjy.zzi();
        if (zzi != null && zzi != (zzjg = this.zzd)) {
            if (zzjg == null) {
                this.zzd = zzi;
                this.zzc = zzjy;
                zzi.zzg(this.zza.zzc());
                return;
            }
            throw zzha.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    public final void zzg(zzby zzby) {
        zzjg zzjg = this.zzd;
        if (zzjg != null) {
            zzjg.zzg(zzby);
            zzby = this.zzd.zzc();
        }
        this.zza.zzg(zzby);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
