package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzchw extends ScheduledThreadPoolExecutor {
    zzchw(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
