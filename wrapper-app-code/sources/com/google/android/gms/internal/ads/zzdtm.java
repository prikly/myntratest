package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdtm {
    private final Executor zza;
    private final zzdth zzb;

    public zzdtm(Executor executor, zzdth zzdth) {
        this.zza = executor;
        this.zzb = zzdth;
    }

    public final zzgfb zza(JSONObject jSONObject, String str) {
        zzgfb zzgfb;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzger.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzgfb = zzger.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzgfb = zzger.zzi((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzgfb = zzger.zzi(new zzdtl(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzgfb = zzger.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzdtj(optString), this.zza);
                    } else {
                        zzgfb = zzger.zzi((Object) null);
                    }
                }
            }
            arrayList.add(zzgfb);
        }
        return zzger.zzm(zzger.zze(arrayList), zzdtk.zza, this.zza);
    }
}
