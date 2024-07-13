package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapj;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzs) {
        this.zza = zzs;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzs zzs = this.zza;
        return new zzapj(zzapi.zzs(zzs.zza.zza, zzs.zzd, false));
    }
}
