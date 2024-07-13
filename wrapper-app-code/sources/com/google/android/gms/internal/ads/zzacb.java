package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzacb implements zzaam {
    final /* synthetic */ zzaam zza;
    final /* synthetic */ zzacc zzb;

    zzacb(zzacc zzacc, zzaam zzaam) {
        this.zzb = zzacc;
        this.zza = zzaam;
    }

    public final long zze() {
        return this.zza.zze();
    }

    public final zzaak zzg(long j) {
        zzaak zzg = this.zza.zzg(j);
        zzaan zzaan = zzg.zza;
        zzaan zzaan2 = new zzaan(zzaan.zzb, zzaan.zzc + this.zzb.zzb);
        zzaan zzaan3 = zzg.zzb;
        return new zzaak(zzaan2, new zzaan(zzaan3.zzb, zzaan3.zzc + this.zzb.zzb));
    }

    public final boolean zzh() {
        return this.zza.zzh();
    }
}
