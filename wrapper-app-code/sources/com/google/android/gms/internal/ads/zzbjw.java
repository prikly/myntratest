package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbjw {
    private final Map zza = new HashMap();
    private final zzbjy zzb;

    public zzbjw(zzbjy zzbjy) {
        this.zzb = zzbjy;
    }

    public final zzbjy zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbjv zzbjv) {
        this.zza.put(str, zzbjv);
    }

    public final void zzc(String str, String str2, long j) {
        zzbjy zzbjy = this.zzb;
        zzbjv zzbjv = (zzbjv) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbjv != null) {
            zzbjy.zze(zzbjv, j, strArr);
        }
        this.zza.put(str, new zzbjv(j, (String) null, (zzbjv) null));
    }
}
