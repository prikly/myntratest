package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaij implements zzaic {
    final /* synthetic */ zzail zza;
    private final zzee zzb = new zzee(new byte[4], 4);

    public zzaij(zzail zzail) {
        this.zza = zzail;
    }

    public final void zza(zzef zzef) {
        if (zzef.zzk() == 0 && (zzef.zzk() & 128) != 0) {
            zzef.zzG(6);
            int zza2 = zzef.zza() / 4;
            for (int i = 0; i < zza2; i++) {
                zzef.zzA(this.zzb, 4);
                int zzc = this.zzb.zzc(16);
                this.zzb.zzj(3);
                if (zzc == 0) {
                    this.zzb.zzj(13);
                } else {
                    int zzc2 = this.zzb.zzc(13);
                    if (this.zza.zzf.get(zzc2) == null) {
                        zzail zzail = this.zza;
                        zzail.zzf.put(zzc2, new zzaid(new zzaik(zzail, zzc2)));
                        zzail zzail2 = this.zza;
                        zzail2.zzl = zzail2.zzl + 1;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    public final void zzb(zzel zzel, zzzm zzzm, zzaip zzaip) {
    }
}
