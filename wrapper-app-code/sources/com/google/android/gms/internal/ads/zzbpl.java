package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpl implements zzbqd {
    zzbpl() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcno zzcno = (zzcno) obj;
        zzbly zzM = zzcno.zzM();
        if (zzM == null || (zzb = zzM.zzb()) == null) {
            zzcno.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcno.zze("nativeClickMetaReady", zzb);
        }
    }
}
