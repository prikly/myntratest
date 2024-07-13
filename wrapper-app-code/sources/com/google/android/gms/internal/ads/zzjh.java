package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjh {
    public final zzsf zza;
    public final Object zzb;
    public final zzty[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzji zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzjz[] zzi;
    private final zzvz zzj;
    private final zzjr zzk;
    private zzjh zzl;
    private zzug zzm = zzug.zza;
    private zzwa zzn;
    private long zzo;

    public zzjh(zzjz[] zzjzArr, long j, zzvz zzvz, zzwi zzwi, zzjr zzjr, zzji zzji, zzwa zzwa, byte[] bArr) {
        zzji zzji2 = zzji;
        this.zzi = zzjzArr;
        this.zzo = j;
        this.zzj = zzvz;
        this.zzk = zzjr;
        this.zzb = zzji2.zza.zza;
        this.zzf = zzji2;
        this.zzn = zzwa;
        this.zzc = new zzty[2];
        this.zzh = new boolean[2];
        zzsh zzsh = zzji2.zza;
        long j2 = zzji2.zzb;
        long j3 = zzji2.zzd;
        zzwi zzwi2 = zzwi;
        zzsf zzo2 = zzjr.zzo(zzsh, zzwi, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrm(zzo2, true, 0, j3) : zzo2;
    }

    private final void zzs() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzwa zzwa = this.zzn;
                if (i < zzwa.zza) {
                    zzwa.zzb(i);
                    zzvt zzvt = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzwa zzwa = this.zzn;
                if (i < zzwa.zza) {
                    zzwa.zzb(i);
                    zzvt zzvt = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzwa zzwa, long j, boolean z) {
        return zzb(zzwa, j, false, new boolean[2]);
    }

    public final long zzb(zzwa zzwa, long j, boolean z, boolean[] zArr) {
        zzwa zzwa2 = zzwa;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzwa2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzwa.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzjz[] zzjzArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzjzArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzwa2;
        zzt();
        long zzf2 = this.zza.zzf(zzwa2.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzjz[] zzjzArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjzArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzty[] zztyArr = this.zzc;
            if (i4 >= 2) {
                return zzf2;
            }
            if (zztyArr[i4] != null) {
                zzdd.zzf(zzwa.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzdd.zzf(zzwa2.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb2 = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzf.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjh zzg() {
        return this.zzl;
    }

    public final zzug zzh() {
        return this.zzm;
    }

    public final zzwa zzi() {
        return this.zzn;
    }

    public final zzwa zzj(float f2, zzcn zzcn) throws zzha {
        zzwa zzn2 = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, zzcn);
        for (zzvt zzvt : zzn2.zzc) {
        }
        return zzn2;
    }

    public final void zzk(long j) {
        zzdd.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f2, zzcn zzcn) throws zzha {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzwa zzj2 = zzj(f2, zzcn);
        zzji zzji = this.zzf;
        long j = zzji.zzb;
        long j2 = zzji.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long zza2 = zza(zzj2, j, false);
        long j3 = this.zzo;
        zzji zzji2 = this.zzf;
        this.zzo = j3 + (zzji2.zzb - zza2);
        this.zzf = zzji2.zzb(zza2);
    }

    public final void zzm(long j) {
        zzdd.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjr zzjr = this.zzk;
        zzsf zzsf = this.zza;
        try {
            if (zzsf instanceof zzrm) {
                zzjr.zzh(((zzrm) zzsf).zza);
            } else {
                zzjr.zzh(zzsf);
            }
        } catch (RuntimeException e2) {
            zzdw.zzc("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void zzo(zzjh zzjh) {
        if (zzjh != this.zzl) {
            zzs();
            this.zzl = zzjh;
            zzt();
        }
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzsf zzsf = this.zza;
        if (zzsf instanceof zzrm) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrm) zzsf).zzn(0, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
