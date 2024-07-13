package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcch implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzccj zzb;

    zzcch(zzccj zzccj, Context context) {
        this.zzb = zzccj;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzccg zzccg;
        zzcci zzcci = (zzcci) this.zzb.zza.get(this.zza);
        if (zzcci == null || zzcci.zza + ((Long) zzbkp.zza.zze()).longValue() < zzt.zzB().currentTimeMillis()) {
            zzccg = new zzccf(this.zza).zza();
        } else {
            zzccg = new zzccf(this.zza, zzcci.zzb).zza();
        }
        zzccj zzccj = this.zzb;
        zzccj.zza.put(this.zza, new zzcci(zzccj, zzccg));
        return zzccg;
    }
}
