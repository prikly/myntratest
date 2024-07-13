package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzro implements zzpj, zzsr {
    final /* synthetic */ zzrq zza;
    private final Object zzb;
    private zzsq zzc;
    private zzpi zzd;

    public zzro(zzrq zzrq, Object obj) {
        this.zza = zzrq;
        this.zzc = zzrq.zze((zzsh) null);
        this.zzd = zzrq.zzc((zzsh) null);
        this.zzb = obj;
    }

    private final zzsd zzf(zzsd zzsd) {
        zzrq zzrq = this.zza;
        Object obj = this.zzb;
        long j = zzsd.zzc;
        zzrq.zzw(obj, j);
        zzrq zzrq2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzsd.zzd;
        zzrq2.zzw(obj2, j2);
        return (j == zzsd.zzc && j2 == zzsd.zzd) ? zzsd : new zzsd(1, zzsd.zza, zzsd.zzb, 0, (Object) null, j, j2);
    }

    private final boolean zzg(int i, zzsh zzsh) {
        zzsh zzsh2;
        if (zzsh != null) {
            zzsh2 = this.zza.zzx(this.zzb, zzsh);
            if (zzsh2 == null) {
                return false;
            }
        } else {
            zzsh2 = null;
        }
        this.zza.zzv(this.zzb, i);
        zzsq zzsq = this.zzc;
        if (zzsq.zza != i || !zzen.zzT(zzsq.zzb, zzsh2)) {
            this.zzc = this.zza.zzf(i, zzsh2, 0);
        }
        zzpi zzpi = this.zzd;
        if (zzpi.zza == i && zzen.zzT(zzpi.zzb, zzsh2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsh2);
        return true;
    }

    public final void zzaf(int i, zzsh zzsh, zzsd zzsd) {
        if (zzg(i, zzsh)) {
            this.zzc.zzc(zzf(zzsd));
        }
    }

    public final void zzag(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzg(i, zzsh)) {
            this.zzc.zze(zzry, zzf(zzsd));
        }
    }

    public final void zzah(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzg(i, zzsh)) {
            this.zzc.zzg(zzry, zzf(zzsd));
        }
    }

    public final void zzai(int i, zzsh zzsh, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        if (zzg(i, zzsh)) {
            this.zzc.zzi(zzry, zzf(zzsd), iOException, z);
        }
    }

    public final void zzaj(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzg(i, zzsh)) {
            this.zzc.zzk(zzry, zzf(zzsd));
        }
    }
}
