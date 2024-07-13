package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzegg implements zzfxt {
    public final /* synthetic */ zzegh zza;
    public final /* synthetic */ zzccb zzb;

    public /* synthetic */ zzegg(zzegh zzegh, zzccb zzccb) {
        this.zza = zzegh;
        this.zzb = zzccb;
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zzb.zza;
        if (bundle == null) {
            return jSONObject;
        }
        try {
            JSONObject zzi = zzay.zzb().zzi(bundle);
            try {
                zzay.zzb().zzl(zzi, jSONObject);
            } catch (JSONException unused) {
            }
            return zzi;
        } catch (JSONException unused2) {
            return jSONObject;
        }
    }
}
