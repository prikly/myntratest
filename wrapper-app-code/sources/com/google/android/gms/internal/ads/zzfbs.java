package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfbs implements Callable {
    public final /* synthetic */ zzgfb zza;
    public final /* synthetic */ zzgfb zzb;

    public /* synthetic */ zzfbs(zzgfb zzgfb, zzgfb zzgfb2) {
        this.zza = zzgfb;
        this.zzb = zzgfb2;
    }

    public final Object call() {
        return new zzfbu((String) this.zza.get(), (String) this.zzb.get());
    }
}
