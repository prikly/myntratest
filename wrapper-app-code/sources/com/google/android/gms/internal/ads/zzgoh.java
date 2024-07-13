package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgoh {
    private HashMap zza = new HashMap();

    public final zzgoj zza() {
        if (this.zza != null) {
            zzgoj zzgoj = new zzgoj(Collections.unmodifiableMap(this.zza), (zzgoi) null);
            this.zza = null;
            return zzgoj;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
