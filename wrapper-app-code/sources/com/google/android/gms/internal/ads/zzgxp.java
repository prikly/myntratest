package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgxp {
    static final zzgxp zza = new zzgxp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgxp zzd;
    private final Map zze;

    zzgxp() {
        this.zze = new HashMap();
    }

    public static zzgxp zza() {
        return zza;
    }

    public final zzgyb zzc(zzgzn zzgzn, int i) {
        return (zzgyb) this.zze.get(new zzgxo(zzgzn, i));
    }

    zzgxp(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgxp zzb() {
        Class<zzgxp> cls = zzgxp.class;
        zzgxp zzgxp = zzd;
        if (zzgxp != null) {
            return zzgxp;
        }
        synchronized (cls) {
            zzgxp zzgxp2 = zzd;
            if (zzgxp2 != null) {
                return zzgxp2;
            }
            zzgxp zzb2 = zzgxx.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }
}
