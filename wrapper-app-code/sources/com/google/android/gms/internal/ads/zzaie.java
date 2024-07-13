package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaie {
    private final List zza;
    private final zzaaq[] zzb;

    public zzaie(List list) {
        this.zza = list;
        this.zzb = new zzaaq[list.size()];
    }

    public final void zza(long j, zzef zzef) {
        zzyw.zza(j, zzef, this.zzb);
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaip.zzc();
            zzaaq zzv = zzzm.zzv(zzaip.zza(), 3);
            zzaf zzaf = (zzaf) this.zza.get(i);
            String str = zzaf.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = zzaf.zzb;
            if (str2 == null) {
                str2 = zzaip.zzb();
            }
            zzad zzad = new zzad();
            zzad.zzH(str2);
            zzad.zzS(str);
            zzad.zzU(zzaf.zze);
            zzad.zzK(zzaf.zzd);
            zzad.zzu(zzaf.zzE);
            zzad.zzI(zzaf.zzo);
            zzv.zzk(zzad.zzY());
            this.zzb[i] = zzv;
        }
    }
}
