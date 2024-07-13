package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzahc implements zzahd {
    private final List zza;
    private final zzaaq[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzahc(List list) {
        this.zza = list;
        this.zzb = new zzaaq[list.size()];
    }

    private final boolean zzf(zzef zzef, int i) {
        if (zzef.zza() == 0) {
            return false;
        }
        if (zzef.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    public final void zza(zzef zzef) {
        if (!this.zzc) {
            return;
        }
        if (this.zzd != 2 || zzf(zzef, 32)) {
            if (this.zzd != 1 || zzf(zzef, 0)) {
                int zzc2 = zzef.zzc();
                int zza2 = zzef.zza();
                for (zzaaq zzq : this.zzb) {
                    zzef.zzF(zzc2);
                    zzq.zzq(zzef, zza2);
                }
                this.zze += zza2;
            }
        }
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaim zzaim = (zzaim) this.zza.get(i);
            zzaip.zzc();
            zzaaq zzv = zzzm.zzv(zzaip.zza(), 3);
            zzad zzad = new zzad();
            zzad.zzH(zzaip.zzb());
            zzad.zzS("application/dvbsubs");
            zzad.zzI(Collections.singletonList(zzaim.zzb));
            zzad.zzK(zzaim.zza);
            zzv.zzk(zzad.zzY());
            this.zzb[i] = zzv;
        }
    }

    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzaaq zzs : this.zzb) {
                    zzs.zzs(this.zzf, 1, this.zze, 0, (zzaap) null);
                }
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzc = true;
            if (j != -9223372036854775807L) {
                this.zzf = j;
            }
            this.zze = 0;
            this.zzd = 2;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
