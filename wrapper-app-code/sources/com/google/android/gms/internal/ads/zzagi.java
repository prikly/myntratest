package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzagi {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[KotlinVersion.MAX_COMPONENT_VALUE];
    private final zzef zzg = new zzef((int) KotlinVersion.MAX_COMPONENT_VALUE);

    zzagi() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzzk zzzk, boolean z) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzzn.zzc(zzzk, this.zzg.zzH(), 0, 27, z) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() == 0) {
                this.zza = this.zzg.zzk();
                this.zzb = this.zzg.zzp();
                this.zzg.zzq();
                this.zzg.zzq();
                this.zzg.zzq();
                int zzk = this.zzg.zzk();
                this.zzc = zzk;
                this.zzd = zzk + 27;
                this.zzg.zzC(zzk);
                if (zzzn.zzc(zzzk, this.zzg.zzH(), 0, this.zzc, z)) {
                    for (int i = 0; i < this.zzc; i++) {
                        this.zzf[i] = this.zzg.zzk();
                        this.zze += this.zzf[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw zzbu.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean zzc(zzzk zzzk, long j) throws IOException {
        int i;
        zzdd.zzd(zzzk.zzf() == zzzk.zze());
        this.zzg.zzC(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || zzzk.zzf() + 4 < j) && zzzn.zzc(zzzk, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() != 1332176723) {
                    ((zzyz) zzzk).zzo(1, false);
                } else {
                    zzzk.zzj();
                    return true;
                }
            }
        }
        do {
            if ((i != 0 && zzzk.zzf() >= j) || zzzk.zzc(1) == -1) {
                return false;
            }
            break;
        } while (zzzk.zzc(1) == -1);
        return false;
    }
}
