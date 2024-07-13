package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevw implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzevw(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgaz zzgaz;
        zzevm zza2 = zzevo.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdy)).booleanValue()) {
            zzgaz = zzgaz.zzn(new zzext(zza2, (long) ((Integer) zzba.zzc().zzb(zzbjj.zzdz)).intValue(), scheduledExecutorService));
        } else {
            zzgaz = zzgaz.zzm();
        }
        zzhex.zzb(zzgaz);
        return zzgaz;
    }
}
