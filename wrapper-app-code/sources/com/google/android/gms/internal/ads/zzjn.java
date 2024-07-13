package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjn implements zzpj, zzsr {
    final /* synthetic */ zzjr zza;
    private final zzjp zzb;
    private zzsq zzc;
    private zzpi zzd;

    public zzjn(zzjr zzjr, zzjp zzjp) {
        this.zza = zzjr;
        this.zzc = zzjr.zzf;
        this.zzd = zzjr.zzg;
        this.zzb = zzjp;
    }

    private final boolean zzf(int i, zzsh zzsh) {
        zzsh zzsh2 = null;
        if (zzsh != null) {
            zzjp zzjp = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjp.zzc.size()) {
                    break;
                } else if (((zzsh) zzjp.zzc.get(i2)).zzd == zzsh.zzd) {
                    zzsh2 = zzsh.zzc(Pair.create(zzjp.zzb, zzsh.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzsh2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsq zzsq = this.zzc;
        if (zzsq.zza != i3 || !zzen.zzT(zzsq.zzb, zzsh2)) {
            this.zzc = this.zza.zzf.zza(i3, zzsh2, 0);
        }
        zzpi zzpi = this.zzd;
        if (zzpi.zza == i3 && zzen.zzT(zzpi.zzb, zzsh2)) {
            return true;
        }
        this.zzd = this.zza.zzg.zza(i3, zzsh2);
        return true;
    }

    public final void zzaf(int i, zzsh zzsh, zzsd zzsd) {
        if (zzf(i, zzsh)) {
            this.zzc.zzc(zzsd);
        }
    }

    public final void zzag(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzf(i, zzsh)) {
            this.zzc.zze(zzry, zzsd);
        }
    }

    public final void zzah(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzf(i, zzsh)) {
            this.zzc.zzg(zzry, zzsd);
        }
    }

    public final void zzai(int i, zzsh zzsh, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        if (zzf(i, zzsh)) {
            this.zzc.zzi(zzry, zzsd, iOException, z);
        }
    }

    public final void zzaj(int i, zzsh zzsh, zzry zzry, zzsd zzsd) {
        if (zzf(i, zzsh)) {
            this.zzc.zzk(zzry, zzsd);
        }
    }
}
