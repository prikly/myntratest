package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhet extends zzhel {
    private static final zzhfc zza = zzheq.zza(Collections.emptyMap());

    /* synthetic */ zzhet(Map map, zzher zzher) {
        super(map);
    }

    public static zzhes zzc(int i) {
        return new zzhes(i, (zzher) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzhem.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhfc) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
