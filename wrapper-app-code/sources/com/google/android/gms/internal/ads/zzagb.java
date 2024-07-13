package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzagb implements zzaam {
    final /* synthetic */ zzagc zza;

    /* synthetic */ zzagb(zzagc zzagc, zzaga zzaga) {
        this.zza = zzagc;
    }

    public final long zze() {
        zzagc zzagc = this.zza;
        return zzagc.zzd.zzf(zzagc.zzf);
    }

    public final zzaak zzg(long j) {
        zzagc zzagc = this.zza;
        long zzg = zzagc.zzd.zzg(j);
        long zzb = zzagc.zzb;
        long zza2 = zzg * (zzagc.zzc - zzagc.zzb);
        zzaan zzaan = new zzaan(j, zzen.zzr(-30000 + zzb + (zza2 / zzagc.zzf), zzagc.zzb, zzagc.zzc - 1));
        return new zzaak(zzaan, zzaan);
    }

    public final boolean zzh() {
        return true;
    }
}
