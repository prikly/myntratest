package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final /* synthetic */ class zzag implements Runnable {
    public final /* synthetic */ Future zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzag(Future future, Runnable runnable) {
        this.zza = future;
        this.zzb = runnable;
    }

    public final void run() {
        Future future = this.zza;
        Runnable runnable = this.zzb;
        if (!future.isDone() && !future.isCancelled()) {
            future.cancel(true);
            zzb.zzo("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
