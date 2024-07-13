package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdol implements zzdaq {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhfc zzd;
    private final zzdqr zze;

    zzdol(Map map, Map map2, Map map3, zzhfc zzhfc, zzdqr zzdqr) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhfc;
        this.zze = zzdqr;
    }

    public final zzekq zza(int i, String str) {
        zzekq zza2;
        zzekq zzekq = (zzekq) this.zza.get(str);
        if (zzekq != null) {
            return zzekq;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzenk zzenk = (zzenk) this.zzc.get(str);
            if (zzenk != null) {
                return new zzekr(zzenk, zzdas.zza);
            }
            zzekq zzekq2 = (zzekq) this.zzb.get(str);
            if (zzekq2 == null) {
                return null;
            }
            return zzdau.zza(zzekq2);
        } else if (this.zze.zze() == null || (zza2 = ((zzdaq) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        } else {
            return zzdau.zza(zza2);
        }
    }
}
