package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdf;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgfg extends zzgdf.zzi implements Runnable {
    private final Runnable zza;

    public zzgfg(Runnable runnable) {
        if (runnable != null) {
            this.zza = runnable;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String valueOf = String.valueOf(this.zza);
        return "task=[" + valueOf + "]";
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e2) {
            zze(e2);
            throw e2;
        }
    }
}
