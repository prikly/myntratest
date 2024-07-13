package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeun implements zzezm {
    private final Executor zza;
    private final zzcgx zzb;

    zzeun(Executor executor, zzcgx zzcgx) {
        this.zza = executor;
        this.zzb = zzcgx;
    }

    public final int zza() {
        return 10;
    }

    public final zzgfb zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzco)).booleanValue()) {
            return zzger.zzi((Object) null);
        }
        return zzger.zzm(this.zzb.zzj(), zzeul.zza, this.zza);
    }
}
