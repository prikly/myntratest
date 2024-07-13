package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzabm implements zzyu {
    private final zzzw zza;
    private final int zzb;
    private final zzzr zzc = new zzzr();

    /* synthetic */ zzabm(zzzw zzzw, int i, zzabl zzabl) {
        this.zza = zzzw;
        this.zzb = i;
    }

    private final long zzc(zzzk zzzk) throws IOException {
        zzzk zzzk2 = zzzk;
        while (zzzk.zze() < zzzk.zzd() - 6) {
            zzzw zzzw = this.zza;
            int i = this.zzb;
            zzzr zzzr = this.zzc;
            long zze = zzzk.zze();
            byte[] bArr = new byte[2];
            zzyz zzyz = (zzyz) zzzk2;
            zzyz.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzzk.zzj();
                zzyz.zzl((int) (zze - zzzk.zzf()), false);
            } else {
                zzef zzef = new zzef(16);
                System.arraycopy(bArr, 0, zzef.zzH(), 0, 2);
                zzef.zzE(zzzn.zza(zzzk2, zzef.zzH(), 2, 14));
                zzzk.zzj();
                zzyz.zzl((int) (zze - zzzk.zzf()), false);
                if (zzzs.zzc(zzef, zzzw, i, zzzr)) {
                    break;
                }
            }
            zzyz.zzl(1, false);
        }
        if (zzzk.zze() < zzzk.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzyz) zzzk2).zzl((int) (zzzk.zzd() - zzzk.zze()), false);
        return this.zza.zzj;
    }

    public final zzyt zza(zzzk zzzk, long j) throws IOException {
        long zzf = zzzk.zzf();
        long zzc2 = zzc(zzzk);
        long zze = zzzk.zze();
        ((zzyz) zzzk).zzl(Math.max(6, this.zza.zzc), false);
        long zzc3 = zzc(zzzk);
        long zze2 = zzzk.zze();
        if (zzc2 > j || zzc3 <= j) {
            return zzc3 <= j ? zzyt.zzf(zzc3, zze2) : zzyt.zzd(zzc2, zzf);
        }
        return zzyt.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
