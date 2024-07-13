package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzzt {
    public static zzzv zzb(zzef zzef) {
        zzef.zzG(1);
        int zzm = zzef.zzm();
        long zzc = ((long) zzef.zzc()) + ((long) zzm);
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzef.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzef.zzr();
            zzef.zzG(2);
            i2++;
        }
        zzef.zzG((int) (zzc - ((long) zzef.zzc())));
        return new zzzv(jArr, jArr2);
    }

    public static zzbq zza(zzzk zzzk, boolean z) throws IOException {
        zzbq zza = new zzaaa().zza(zzzk, z ? null : zzadd.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
