package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdds implements Callable {
    public final /* synthetic */ zzddt zza;
    public final /* synthetic */ zzgfb zzb;

    public /* synthetic */ zzdds(zzddt zzddt, zzgfb zzgfb) {
        this.zza = zzddt;
        this.zzb = zzgfb;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
