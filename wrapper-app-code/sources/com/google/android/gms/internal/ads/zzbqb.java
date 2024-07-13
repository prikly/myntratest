package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbqb implements zzbqd {
    zzbqb() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        if (map.keySet().contains("start")) {
            zzcno.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcno.zzau(false);
        }
    }
}
