package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzczr implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzczr(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzczt.zzi(this.zza);
    }
}
