package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzagg implements zzzj {
    public static final zzzq zza = zzagf.zza;
    private zzzm zzb;
    private zzago zzc;
    private boolean zzd;

    private final boolean zze(zzzk zzzk) throws IOException {
        zzagi zzagi = new zzagi();
        if (zzagi.zzb(zzzk, true) && (zzagi.zza & 2) == 2) {
            int min = Math.min(zzagi.zze, 8);
            zzef zzef = new zzef(min);
            ((zzyz) zzzk).zzm(zzef.zzH(), 0, min, false);
            zzef.zzF(0);
            if (zzef.zza() >= 5 && zzef.zzk() == 127 && zzef.zzs() == 1179402563) {
                this.zzc = new zzage();
            } else {
                zzef.zzF(0);
                try {
                    if (zzaaw.zzd(1, zzef, true)) {
                        this.zzc = new zzagq();
                    }
                } catch (zzbu unused) {
                }
                zzef.zzF(0);
                if (zzagk.zzd(zzef)) {
                    this.zzc = new zzagk();
                }
            }
            return true;
        }
        return false;
    }

    public final int zza(zzzk zzzk, zzaaj zzaaj) throws IOException {
        zzdd.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzzk)) {
                zzzk.zzj();
            } else {
                throw zzbu.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzd) {
            zzaaq zzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzzk, zzaaj);
    }

    public final void zzb(zzzm zzzm) {
        this.zzb = zzzm;
    }

    public final void zzc(long j, long j2) {
        zzago zzago = this.zzc;
        if (zzago != null) {
            zzago.zzj(j, j2);
        }
    }

    public final boolean zzd(zzzk zzzk) throws IOException {
        try {
            return zze(zzzk);
        } catch (zzbu unused) {
            return false;
        }
    }
}
