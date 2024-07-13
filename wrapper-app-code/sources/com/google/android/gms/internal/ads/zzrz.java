package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzrz implements zzse, zzsf {
    public final zzsh zza;
    private final long zzb;
    private zzsj zzc;
    private zzsf zzd;
    private zzse zze;
    private long zzf = -9223372036854775807L;
    private final zzwi zzg;

    public zzrz(zzsh zzsh, zzwi zzwi, long j, byte[] bArr) {
        this.zza = zzsh;
        this.zzg = zzwi;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza(long j, zzkb zzkb) {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zza(j, zzkb);
    }

    public final long zzb() {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zzb();
    }

    public final long zzc() {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zzc();
    }

    public final long zzd() {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zzd();
    }

    public final long zze(long j) {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zze(j);
    }

    public final long zzf(zzvt[] zzvtArr, boolean[] zArr, zzty[] zztyArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zzf(zzvtArr, zArr, zztyArr, zArr2, j2);
    }

    public final /* bridge */ /* synthetic */ void zzg(zzua zzua) {
        zzsf zzsf = (zzsf) zzua;
        zzse zzse = this.zze;
        int i = zzen.zza;
        zzse.zzg(this);
    }

    public final zzug zzh() {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        return zzsf.zzh();
    }

    public final void zzi(zzsf zzsf) {
        zzse zzse = this.zze;
        int i = zzen.zza;
        zzse.zzi(this);
    }

    public final void zzj(long j, boolean z) {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        zzsf.zzj(j, false);
    }

    public final void zzk() throws IOException {
        try {
            zzsf zzsf = this.zzd;
            if (zzsf != null) {
                zzsf.zzk();
                return;
            }
            zzsj zzsj = this.zzc;
            if (zzsj != null) {
                zzsj.zzy();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public final void zzl(zzse zzse, long j) {
        this.zze = zzse;
        zzsf zzsf = this.zzd;
        if (zzsf != null) {
            zzsf.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j) {
        zzsf zzsf = this.zzd;
        int i = zzen.zza;
        zzsf.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(long j) {
        zzsf zzsf = this.zzd;
        return zzsf != null && zzsf.zzo(j);
    }

    public final boolean zzp() {
        zzsf zzsf = this.zzd;
        return zzsf != null && zzsf.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsh zzsh) {
        long zzv = zzv(this.zzb);
        zzsj zzsj = this.zzc;
        if (zzsj != null) {
            zzsf zzH = zzsj.zzH(zzsh, this.zzg, zzv);
            this.zzd = zzH;
            if (this.zze != null) {
                zzH.zzl(this, zzv);
                return;
            }
            return;
        }
        throw null;
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzsj zzsj) {
        zzdd.zzf(this.zzc == null);
        this.zzc = zzsj;
    }

    public final void zzt() {
        zzsf zzsf = this.zzd;
        if (zzsf != null) {
            zzsj zzsj = this.zzc;
            if (zzsj != null) {
                zzsj.zzF(zzsf);
                return;
            }
            throw null;
        }
    }
}
