package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfbq implements zzezm {
    private final JSONObject zza;

    zzfbq(Context context) {
        this.zza = zzccl.zzc(context);
    }

    public final int zza() {
        return 46;
    }

    public final zzgfb zzb() {
        return zzger.zzi(new zzfbp(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }
}
