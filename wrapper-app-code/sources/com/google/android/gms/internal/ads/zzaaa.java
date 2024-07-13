package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaaa {
    private final zzef zza = new zzef(10);

    public final zzbq zza(zzzk zzzk, zzadb zzadb) throws IOException {
        zzbq zzbq = null;
        int i = 0;
        while (true) {
            try {
                ((zzyz) zzzk).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzbq == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzyz) zzzk).zzm(bArr, 10, zzj, false);
                    zzbq = zzadd.zza(bArr, i2, zzadb, new zzace());
                } else {
                    ((zzyz) zzzk).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzk.zzj();
        ((zzyz) zzzk).zzl(i, false);
        return zzbq;
    }
}
