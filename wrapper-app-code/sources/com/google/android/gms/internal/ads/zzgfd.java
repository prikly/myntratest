package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfd implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgdf zzb;

    zzgfd(Executor executor, zzgdf zzgdf) {
        this.zza = executor;
        this.zzb = zzgdf;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.zzb.zze(e2);
        }
    }
}
