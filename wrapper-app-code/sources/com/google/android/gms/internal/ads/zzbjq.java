package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbjq {
    public static boolean zza(zzbjy zzbjy, zzbjv zzbjv, String... strArr) {
        if (zzbjv == null) {
            return false;
        }
        zzbjy.zze(zzbjv, zzt.zzB().elapsedRealtime(), strArr);
        return true;
    }
}
