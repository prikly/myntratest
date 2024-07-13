package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzedk implements Callable {
    public final /* synthetic */ zzapj zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzedk(zzapj zzapj, Context context) {
        this.zza = zzapj;
        this.zzb = context;
    }

    public final Object call() {
        zzapj zzapj = this.zza;
        return zzapj.zzc().zzg(this.zzb);
    }
}
