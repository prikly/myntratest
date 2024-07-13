package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzkm implements Callable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzkt zzb;

    zzkm(zzkt zzkt, zzq zzq) {
        this.zzb = zzkt;
        this.zza = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza)).zzi(zzah.ANALYTICS_STORAGE) && zzai.zzb(this.zza.zzv).zzi(zzah.ANALYTICS_STORAGE)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
