package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfxt;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzj implements zzfxt {
    public static final /* synthetic */ zzj zza = new zzj();

    private /* synthetic */ zzj() {
    }

    public final Object apply(Object obj) {
        int i = zzac.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
