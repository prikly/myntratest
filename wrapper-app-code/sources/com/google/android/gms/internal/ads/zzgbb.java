package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgbb extends zzfyx {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfyf zzb;

    zzgbb(Iterator it, zzfyf zzfyf) {
        this.zza = it;
        this.zzb = zzfyf;
    }

    /* access modifiers changed from: protected */
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
