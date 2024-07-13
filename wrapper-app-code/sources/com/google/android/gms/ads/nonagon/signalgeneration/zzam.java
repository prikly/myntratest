package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzam implements zzgdy {
    private final Executor zza;
    private final zzeec zzb;

    public zzam(Executor executor, zzeec zzeec) {
        this.zza = executor;
        this.zzb = zzeec;
    }

    public final /* bridge */ /* synthetic */ zzgfb zza(Object obj) throws Exception {
        zzccb zzccb = (zzccb) obj;
        return zzger.zzn(this.zzb.zzb(zzccb), new zzal(zzccb), this.zza);
    }
}
