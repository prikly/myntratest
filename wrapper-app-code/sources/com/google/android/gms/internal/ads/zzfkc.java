package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfkc {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgfc zzc;

    public zzfkc(Callable callable, zzgfc zzgfc) {
        this.zzb = callable;
        this.zzc = zzgfc;
    }

    public final synchronized zzgfb zza() {
        zzc(1);
        return (zzgfb) this.zza.poll();
    }

    public final synchronized void zzb(zzgfb zzgfb) {
        this.zza.addFirst(zzgfb);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
