package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfnq {
    private final Executor zza;
    private final zzcht zzb;

    public zzfnq(Executor executor, zzcht zzcht) {
        this.zza = executor;
        this.zzb = zzcht;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(String str) {
        this.zza.execute(new zzfnp(this, str));
    }
}
