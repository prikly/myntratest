package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbps implements zzbqd {
    zzbps() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfxl.zzc("true", str)) {
                if (!zzfxl.zzc("false", str)) {
                    return;
                }
            }
            zzfvg.zzi(zzcno.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e2) {
            zzt.zzo().zzu(e2, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
