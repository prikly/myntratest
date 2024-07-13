package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaja {
    public static Pair zza(zzzk zzzk) throws IOException {
        zzzk.zzj();
        zzaiz zzd = zzd(1684108385, zzzk, new zzef(8));
        ((zzyz) zzzk).zzo(8, false);
        return Pair.create(Long.valueOf(zzzk.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaiy zzb(zzzk zzzk) throws IOException {
        byte[] bArr;
        zzef zzef = new zzef(16);
        zzaiz zzd = zzd(1718449184, zzzk, zzef);
        zzdd.zzf(zzd.zzb >= 16);
        zzyz zzyz = (zzyz) zzzk;
        zzyz.zzm(zzef.zzH(), 0, 16, false);
        zzef.zzF(0);
        int zzi = zzef.zzi();
        int zzi2 = zzef.zzi();
        int zzh = zzef.zzh();
        int zzh2 = zzef.zzh();
        int zzi3 = zzef.zzi();
        int zzi4 = zzef.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzyz.zzm(bArr, 0, i, false);
        } else {
            bArr = zzen.zzf;
        }
        byte[] bArr2 = bArr;
        zzyz.zzo((int) (zzzk.zze() - zzzk.zzf()), false);
        return new zzaiy(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr2);
    }

    public static boolean zzc(zzzk zzzk) throws IOException {
        zzef zzef = new zzef(8);
        int i = zzaiz.zza(zzzk, zzef).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzyz) zzzk).zzm(zzef.zzH(), 0, 4, false);
        zzef.zzF(0);
        int zze = zzef.zze();
        if (zze == 1463899717) {
            return true;
        }
        zzdw.zzb("WavHeaderReader", "Unsupported form type: " + zze);
        return false;
    }

    private static zzaiz zzd(int i, zzzk zzzk, zzef zzef) throws IOException {
        zzaiz zza = zzaiz.zza(zzzk, zzef);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzdw.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j <= 2147483647L) {
                ((zzyz) zzzk).zzo((int) j, false);
                zza = zzaiz.zza(zzzk, zzef);
            } else {
                int i3 = zza.zza;
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }
}
