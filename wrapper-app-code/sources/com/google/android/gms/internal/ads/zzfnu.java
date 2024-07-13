package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfnu implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzfnu(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzhej zza2 = zzheo.zza(this.zza);
        zzhej zza3 = zzheo.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhL)).booleanValue()) {
            obj = new zzfnw((zzfnt) zza2.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfnt) zza3.zzb();
        }
        zzhex.zzb(obj);
        return obj;
    }
}
