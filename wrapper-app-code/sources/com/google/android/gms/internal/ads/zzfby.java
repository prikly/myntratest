package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfby implements zzezl {
    private final List zza;

    public zzfby(List list) {
        this.zza = list;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
