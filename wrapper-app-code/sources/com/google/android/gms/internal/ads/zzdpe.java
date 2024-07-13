package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdpe implements zzbqd {
    private final WeakReference zza;

    /* synthetic */ zzdpe(zzdpf zzdpf, zzdpd zzdpd) {
        this.zza = new WeakReference(zzdpf);
    }

    public final void zza(Object obj, Map map) {
        zzdpf zzdpf = (zzdpf) this.zza.get();
        if (zzdpf != null) {
            zzdpf.zzg.zza();
        }
    }
}
