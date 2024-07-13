package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpu implements zzbqd {
    zzbpu() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        if (zzcno.zzL() != null) {
            zzcno.zzL().zza();
        }
        zzl zzN = zzcno.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        zzl zzO = zzcno.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            zze.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
