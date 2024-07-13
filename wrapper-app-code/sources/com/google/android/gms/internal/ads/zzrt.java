package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzrt {
    private final zzzq zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzew zze;

    public zzrt(zzzq zzzq) {
        this.zza = zzzq;
    }

    public final void zza(zzew zzew) {
        if (zzew != this.zze) {
            this.zze = zzew;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
