package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpk implements zzbqd {
    zzbpk() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcno zzcno = (zzcno) obj;
        zzbly zzM = zzcno.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            zzcno.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcno.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
