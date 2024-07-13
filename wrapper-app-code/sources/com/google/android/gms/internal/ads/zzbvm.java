package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbvm {
    private static zzbvm zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbvm() {
    }

    public static zzbvm zza() {
        if (zza == null) {
            zza = new zzbvm();
        }
        return zza;
    }

    public final Thread zzb(Context context, String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbvl(this, context, str));
        thread.start();
        return thread;
    }
}
