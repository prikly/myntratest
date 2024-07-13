package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzfnd;
import com.google.android.gms.internal.ads.zzfnj;
import com.google.android.gms.internal.ads.zzhep;
import com.google.android.gms.internal.ads.zzhfc;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzak implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzak(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfnj) this.zza.zzb()).zzb(zzfnd.GENERATE_SIGNALS, ((zzddu) this.zzc).zzb().zzc()).zzf(((zzan) this.zzb).zzb()).zzi((long) ((Integer) zzba.zzc().zzb(zzbjj.zzeW)).intValue(), TimeUnit.SECONDS).zza();
    }
}
