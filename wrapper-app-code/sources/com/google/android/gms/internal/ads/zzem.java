package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzem implements ThreadFactory {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzem(String str) {
        this.zza = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
