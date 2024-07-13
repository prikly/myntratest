package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcfo implements Callable {
    public final /* synthetic */ zzcft zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzcfo(zzcft zzcft, Context context) {
        this.zza = zzcft;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb);
    }
}
