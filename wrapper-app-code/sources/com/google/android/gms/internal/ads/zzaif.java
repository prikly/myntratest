package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaif implements zzyu {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzaif(int i, zzel zzel, int i2) {
        this.zzc = i;
        this.zza = zzel;
    }

    public final zzyt zza(zzzk zzzk, long j) throws IOException {
        int zza2;
        int i;
        long j2;
        long zzf = zzzk.zzf();
        int min = (int) Math.min(112800, zzzk.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyz) zzzk).zzm(this.zzb.zzH(), 0, min, false);
        zzef zzef = this.zzb;
        int zzd = zzef.zzd();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzef.zza() >= 188 && (i = zza2 + 188) <= zzd) {
            long zzb2 = zzair.zzb(zzef, (zza2 = zzair.zza(zzef.zzH(), zzef.zzc(), zzd)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzyt.zzd(zzb3, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + zzb3 > j) {
                    j2 = zzf + ((long) zza2);
                } else {
                    j4 = (long) zza2;
                    j5 = zzb3;
                }
                return zzyt.zze(j2);
            }
            zzef.zzF(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? zzyt.zzf(j5, zzf + j3) : zzyt.zza;
    }

    public final void zzb() {
        zzef zzef = this.zzb;
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        zzef.zzD(bArr, 0);
    }
}
