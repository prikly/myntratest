package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbbf {
    public final List zza;
    public final int zzb;

    private zzbbf(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzbbf zza(zzbar zzbar) throws zzatg {
        List list;
        try {
            zzbar.zzw(21);
            int zzg = zzbar.zzg() & 3;
            int zzg2 = zzbar.zzg();
            int zzc = zzbar.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzbar.zzw(1);
                int zzj = zzbar.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzbar.zzj();
                    i += zzj2 + 4;
                    zzbar.zzw(zzj2);
                }
            }
            zzbar.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzbar.zzw(1);
                int zzj3 = zzbar.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzbar.zzj();
                    System.arraycopy(zzbap.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzbar.zza, zzbar.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzbar.zzw(zzj4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzbbf(list, zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzatg("Error parsing HEVC config", e2);
        }
    }
}
