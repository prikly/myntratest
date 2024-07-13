package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzagh {
    private final zzagi zza = new zzagi();
    private final zzef zzb = new zzef(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzagh() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzagi zzagi = this.zza;
            if (i5 >= zzagi.zzc) {
                break;
            }
            int[] iArr = zzagi.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzef zza() {
        return this.zzb;
    }

    public final zzagi zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzef zzef = this.zzb;
        if (zzef.zzH().length != 65025) {
            zzef.zzD(Arrays.copyOf(zzef.zzH(), Math.max(65025, zzef.zzd())), this.zzb.zzd());
        }
    }

    public final boolean zze(zzzk zzzk) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            boolean z = true;
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzzk, -1) || !this.zza.zzb(zzzk, true)) {
                    return false;
                }
                zzagi zzagi = this.zza;
                int i2 = zzagi.zzd;
                if ((zzagi.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzzn.zze(zzzk, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzef zzef = this.zzb;
                zzef.zzz(zzef.zzd() + zzf);
                zzef zzef2 = this.zzb;
                if (!zzzn.zzd(zzzk, zzef2.zzH(), zzef2.zzd(), zzf)) {
                    return false;
                }
                zzef zzef3 = this.zzb;
                zzef3.zzE(zzef3.zzd() + zzf);
                if (this.zza.zzf[i3 - 1] == 255) {
                    z = false;
                }
                this.zze = z;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
        return false;
    }
}
