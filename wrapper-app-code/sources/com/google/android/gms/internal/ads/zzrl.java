package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzrl implements zzty {
    public final zzty zza;
    final /* synthetic */ zzrm zzb;
    private boolean zzc;

    public zzrl(zzrm zzrm, zzty zzty) {
        this.zzb = zzrm;
        this.zza = zzty;
    }

    public final int zza(zzje zzje, zzgi zzgi, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgi.zzc(4);
            return -4;
        }
        int zza2 = this.zza.zza(zzje, zzgi, i);
        if (zza2 == -5) {
            zzaf zzaf = zzje.zza;
            if (zzaf != null) {
                int i2 = zzaf.zzC;
                int i3 = 0;
                if (i2 == 0) {
                    if (zzaf.zzD != 0) {
                        i2 = 0;
                    }
                    return -5;
                }
                if (this.zzb.zzb == Long.MIN_VALUE) {
                    i3 = zzaf.zzD;
                }
                zzad zzb2 = zzaf.zzb();
                zzb2.zzC(i2);
                zzb2.zzD(i3);
                zzje.zza = zzb2.zzY();
                return -5;
            }
            throw null;
        }
        zzrm zzrm = this.zzb;
        long j = zzrm.zzb;
        if (j == Long.MIN_VALUE || ((zza2 != -4 || zzgi.zzd < j) && (zza2 != -3 || zzrm.zzb() != Long.MIN_VALUE || zzgi.zzc))) {
            return zza2;
        }
        zzgi.zzb();
        zzgi.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
