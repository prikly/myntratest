package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzi {
    zzgzi() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzgzh zzgzh = (zzgzh) obj;
        zzgzg zzgzg = (zzgzg) obj2;
        if (zzgzh.isEmpty()) {
            return 0;
        }
        Iterator it = zzgzh.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgzh) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgzh zzgzh = (zzgzh) obj;
        zzgzh zzgzh2 = (zzgzh) obj2;
        if (!zzgzh2.isEmpty()) {
            if (!zzgzh.zze()) {
                zzgzh = zzgzh.zzb();
            }
            zzgzh.zzd(zzgzh2);
        }
        return zzgzh;
    }
}
