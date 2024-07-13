package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaar {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaaq zzaaq, zzaap zzaap) {
        if (this.zzc > 0) {
            zzaaq.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzaap);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaaq zzaaq, long j, int i, int i2, int i3, zzaap zzaap) {
        if (this.zzg > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzaaq, zzaap);
            }
        }
    }

    public final void zzd(zzzk zzzk) throws IOException {
        if (!this.zzb) {
            zzzk.zzh(this.zza, 0, 10);
            zzzk.zzj();
            byte[] bArr = this.zza;
            int i = zzyk.zza;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.zzb = true;
            }
        }
    }
}
