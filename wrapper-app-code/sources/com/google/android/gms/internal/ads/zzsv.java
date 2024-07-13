package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzsv implements zzse, zzsf {
    /* access modifiers changed from: private */
    public final zzsf zza;
    private final long zzb;
    private zzse zzc;

    public zzsv(zzsf zzsf, long j) {
        this.zza = zzsf;
        this.zzb = j;
    }

    public final long zza(long j, zzkb zzkb) {
        return this.zza.zza(j - this.zzb, zzkb) + this.zzb;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    public final long zzf(zzvt[] zzvtArr, boolean[] zArr, zzty[] zztyArr, boolean[] zArr2, long j) {
        zzty[] zztyArr2 = zztyArr;
        zzty[] zztyArr3 = new zzty[zztyArr2.length];
        int i = 0;
        while (true) {
            zzty zzty = null;
            if (i >= zztyArr2.length) {
                break;
            }
            zzsw zzsw = (zzsw) zztyArr2[i];
            if (zzsw != null) {
                zzty = zzsw.zzc();
            }
            zztyArr3[i] = zzty;
            i++;
        }
        long zzf = this.zza.zzf(zzvtArr, zArr, zztyArr3, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztyArr2.length; i2++) {
            zzty zzty2 = zztyArr3[i2];
            if (zzty2 == null) {
                zztyArr2[i2] = null;
            } else {
                zzty zzty3 = zztyArr2[i2];
                if (zzty3 == null || ((zzsw) zzty3).zzc() != zzty2) {
                    zztyArr2[i2] = new zzsw(zzty2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzua zzua) {
        zzsf zzsf = (zzsf) zzua;
        zzse zzse = this.zzc;
        if (zzse != null) {
            zzse.zzg(this);
            return;
        }
        throw null;
    }

    public final zzug zzh() {
        return this.zza.zzh();
    }

    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzse zzse, long j) {
        this.zzc = zzse;
        this.zza.zzl(this, j - this.zzb);
    }

    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final void zzi(zzsf zzsf) {
        zzse zzse = this.zzc;
        if (zzse != null) {
            zzse.zzi(this);
            return;
        }
        throw null;
    }
}
