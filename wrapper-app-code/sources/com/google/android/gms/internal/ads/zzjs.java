package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjs {
    private static final zzsh zzs = new zzsh(new Object());
    public final zzcn zza;
    public final zzsh zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzha zzf;
    public final boolean zzg;
    public final zzug zzh;
    public final zzwa zzi;
    public final List zzj;
    public final zzsh zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzby zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;

    public zzjs(zzcn zzcn, zzsh zzsh, long j, long j2, int i, zzha zzha, boolean z, zzug zzug, zzwa zzwa, List list, zzsh zzsh2, boolean z2, int i2, zzby zzby, long j3, long j4, long j5, boolean z3) {
        this.zza = zzcn;
        this.zzb = zzsh;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzha;
        this.zzg = z;
        this.zzh = zzug;
        this.zzi = zzwa;
        this.zzj = list;
        this.zzk = zzsh2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzby;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzo = z3;
    }

    public static zzjs zzg(zzwa zzwa) {
        return new zzjs(zzcn.zza, zzs, -9223372036854775807L, 0, 1, (zzha) null, false, zzug.zza, zzwa, zzgau.zzo(), zzs, false, 0, zzby.zza, 0, 0, 0, false);
    }

    public static zzsh zzh() {
        return zzs;
    }

    public final zzjs zza(zzsh zzsh) {
        zzcn zzcn = this.zza;
        return new zzjs(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsh, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzjs zzb(zzsh zzsh, long j, long j2, long j3, long j4, zzug zzug, zzwa zzwa, List list) {
        long j5 = j;
        zzug zzug2 = zzug;
        zzwa zzwa2 = zzwa;
        List list2 = list;
        zzcn zzcn = this.zza;
        return new zzjs(zzcn, zzsh, j2, j3, this.zze, this.zzf, this.zzg, zzug2, zzwa2, list2, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j4, j5, this.zzo);
    }

    public final zzjs zzc(boolean z, int i) {
        zzcn zzcn = this.zza;
        return new zzjs(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzjs zzd(zzha zzha) {
        zzcn zzcn = this.zza;
        return new zzjs(zzcn, this.zzb, this.zzc, this.zzd, this.zze, zzha, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzjs zze(int i) {
        zzcn zzcn = this.zza;
        return new zzjs(zzcn, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzjs zzf(zzcn zzcn) {
        return new zzjs(zzcn, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }
}
