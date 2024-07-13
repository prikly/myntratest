package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbpg implements zzbqd {
    public static final /* synthetic */ zzbpg zza = new zzbpg();

    private /* synthetic */ zzbpg() {
    }

    public final void zza(Object obj, Map map) {
        zzcop zzcop = (zzcop) obj;
        zzbqd zzbqd = zzbqc.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from httpTrack GMSG.");
        } else {
            new zzby(zzcop.getContext(), ((zzcox) zzcop).zzp().zza, str).zzb();
        }
    }
}
