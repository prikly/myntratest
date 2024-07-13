package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfr extends zzgeh implements RunnableFuture {
    private volatile zzgfa zza;

    zzgfr(zzgdx zzgdx) {
        this.zza = new zzgfp(this, zzgdx);
    }

    static zzgfr zzf(Runnable runnable, Object obj) {
        return new zzgfr(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzgfa zzgfa = this.zza;
        if (zzgfa != null) {
            zzgfa.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzgfa zzgfa = this.zza;
        if (zzgfa == null) {
            return super.zza();
        }
        String obj = zzgfa.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzgfa zzgfa;
        if (zzu() && (zzgfa = this.zza) != null) {
            zzgfa.zzh();
        }
        this.zza = null;
    }

    zzgfr(Callable callable) {
        this.zza = new zzgfq(this, callable);
    }
}
