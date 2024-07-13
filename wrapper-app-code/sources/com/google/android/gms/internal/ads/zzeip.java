package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeip implements zzfnk {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfns zzc;

    public zzeip(Set set, zzfns zzfns) {
        this.zzc = zzfns;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzeio zzeio = (zzeio) it.next();
            this.zza.put(zzeio.zzb, zzeio.zza);
            this.zzb.put(zzeio.zzc, zzeio.zza);
        }
    }

    public final void zzbH(zzfnd zzfnd, String str) {
    }

    public final void zzbI(zzfnd zzfnd, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfnd)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfnd))), "f.");
        }
    }

    public final void zzc(zzfnd zzfnd, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfnd)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfnd))));
        }
    }

    public final void zzd(zzfnd zzfnd, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfnd)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfnd))), "s.");
        }
    }
}
