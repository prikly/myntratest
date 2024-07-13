package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzjr {
    static final zzjr zza = new zzjr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzjr zzd;
    private final Map zze;

    zzjr() {
        this.zze = new HashMap();
    }

    public final zzkd zzb(zzlm zzlm, int i) {
        return (zzkd) this.zze.get(new zzjq(zzlm, i));
    }

    zzjr(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzjr zza() {
        Class<zzjr> cls = zzjr.class;
        zzjr zzjr = zzd;
        if (zzjr != null) {
            return zzjr;
        }
        synchronized (cls) {
            zzjr zzjr2 = zzd;
            if (zzjr2 != null) {
                return zzjr2;
            }
            zzjr zzb2 = zzjz.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }
}
