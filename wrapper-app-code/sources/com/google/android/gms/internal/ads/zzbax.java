package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbax implements ThreadFactory {
    final /* synthetic */ String zza = "Loader:ExtractorMediaPeriod";

    zzbax(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
