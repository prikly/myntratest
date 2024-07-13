package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgdk extends AbstractExecutorService implements zzgfc {
    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgfr.zzf(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzgfb) super.submit(runnable);
    }

    public final zzgfb zza(Runnable runnable) {
        return (zzgfb) super.submit(runnable);
    }

    public final zzgfb zzb(Callable callable) {
        return (zzgfb) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgfr(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzgfb) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (zzgfb) super.submit(callable);
    }
}
