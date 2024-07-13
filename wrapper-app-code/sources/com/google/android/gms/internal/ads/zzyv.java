package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzyv {
    protected final zzyp zza;
    protected final zzyu zzb;
    protected zzyr zzc;
    private final int zzd;

    protected zzyv(zzys zzys, zzyu zzyu, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzyu;
        this.zzd = i;
        this.zza = new zzyp(zzys, j, 0, j3, j4, j5, j6);
    }

    protected static final int zzf(zzzk zzzk, long j, zzaaj zzaaj) {
        if (j == zzzk.zzf()) {
            return 0;
        }
        zzaaj.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzzk zzzk, long j) throws IOException {
        long zzf = j - zzzk.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzyz) zzzk).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzzk zzzk, zzaaj zzaaj) throws IOException {
        while (true) {
            zzyr zzyr = this.zzc;
            zzdd.zzb(zzyr);
            long zzb2 = zzyr.zzf;
            long zza2 = zzyr.zzg;
            long zzc2 = zzyr.zzh;
            if (zza2 - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzzk, zzb2, zzaaj);
            } else if (!zzg(zzzk, zzc2)) {
                return zzf(zzzk, zzc2, zzaaj);
            } else {
                zzzk.zzj();
                zzyt zza3 = this.zzb.zza(zzzk, zzyr.zzb);
                int zza4 = zza3.zzb;
                if (zza4 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzzk, zzc2, zzaaj);
                } else if (zza4 == -2) {
                    zzyr.zzh(zzyr, zza3.zzc, zza3.zzd);
                } else if (zza4 != -1) {
                    zzg(zzzk, zza3.zzd);
                    zzc(true, zza3.zzd);
                    return zzf(zzzk, zza3.zzd, zzaaj);
                } else {
                    zzyr.zzg(zzyr, zza3.zzc, zza3.zzd);
                }
            }
        }
    }

    public final zzaam zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2 = j;
        zzyr zzyr = this.zzc;
        if (zzyr == null || zzyr.zza != j2) {
            long zzf = this.zza.zzf(j2);
            zzyp zzyp = this.zza;
            zzyr zzyr2 = r1;
            zzyr zzyr3 = new zzyr(j, zzf, 0, zzyp.zzc, zzyp.zzd, zzyp.zze, zzyp.zzf);
            this.zzc = zzyr2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
