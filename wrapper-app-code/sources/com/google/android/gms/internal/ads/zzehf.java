package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehf implements Callable {
    public final /* synthetic */ zzgfb zza;
    public final /* synthetic */ zzgfb zzb;

    public /* synthetic */ zzehf(zzgfb zzgfb, zzgfb zzgfb2) {
        this.zza = zzgfb;
        this.zzb = zzgfb2;
    }

    public final Object call() {
        zzgfb zzgfb = this.zza;
        zzgfb zzgfb2 = this.zzb;
        return new zzehl((zzehz) zzgfb.get(), ((zzehj) zzgfb2.get()).zzb, ((zzehj) zzgfb2.get()).zza);
    }
}
