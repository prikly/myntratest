package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzv {
    private static final zzgzv zza = new zzgzv();
    private final zzhah zzb = new zzgzf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzgzv() {
    }

    public static zzgzv zza() {
        return zza;
    }

    public final zzhag zzb(Class cls) {
        zzgyn.zzf(cls, "messageType");
        zzhag zzhag = (zzhag) this.zzc.get(cls);
        if (zzhag == null) {
            zzhag = this.zzb.zza(cls);
            zzgyn.zzf(cls, "messageType");
            zzgyn.zzf(zzhag, "schema");
            zzhag zzhag2 = (zzhag) this.zzc.putIfAbsent(cls, zzhag);
            return zzhag2 == null ? zzhag : zzhag2;
        }
    }
}
