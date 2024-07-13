package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpz implements zzbqd {
    zzbpz() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcno.zzbn();
        } else if ("resume".equals(str)) {
            zzcno.zzbo();
        }
    }
}
