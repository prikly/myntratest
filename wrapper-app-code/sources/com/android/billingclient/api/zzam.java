package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzam implements ThreadFactory {
    private final ThreadFactory zza = Executors.defaultThreadFactory();
    private final AtomicInteger zzb = new AtomicInteger(1);

    zzam(BillingClientImpl billingClientImpl) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        int andIncrement = this.zzb.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
