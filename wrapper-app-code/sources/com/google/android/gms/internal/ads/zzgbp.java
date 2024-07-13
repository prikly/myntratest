package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgbp {
    static Object zza(Map map, Object obj) {
        if (map != null) {
            try {
                return map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        } else {
            throw null;
        }
    }

    static boolean zzb(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
