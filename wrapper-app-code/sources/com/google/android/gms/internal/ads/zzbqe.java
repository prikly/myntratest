package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbqe implements zzbqd {
    private final zzbqf zza;

    public zzbqe(zzbqf zzbqf, byte[] bArr) {
        this.zza = zzbqf;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            zze.zzh("Fail to parse float", e2);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f2);
        zzcno.zzav(equals);
    }
}
