package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfrw implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfrw(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.setResult(zzfub.zzc());
    }
}
