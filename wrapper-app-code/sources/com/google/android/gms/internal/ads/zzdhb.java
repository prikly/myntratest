package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdhb implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzdhb(zzdhc zzdhc, zzdha zzdha) {
        this.zza = new WeakReference(zzdhc);
    }

    public final void run() {
        zzdhc zzdhc = (zzdhc) this.zza.get();
        if (zzdhc != null) {
            zzdhc.zzo(zzdgz.zza);
        }
    }
}
