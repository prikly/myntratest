package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzegb implements zzgdy {
    public static final /* synthetic */ zzegb zza = new zzegb();

    private /* synthetic */ zzegb() {
    }

    public final zzgfb zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        JSONObject jSONObject = new JSONObject();
        if (inputStream == null) {
            return zzger.zzi(jSONObject);
        }
        try {
            zzt.zzp();
            jSONObject = new JSONObject(zzs.zzJ(new InputStreamReader(inputStream)));
        } catch (IOException | JSONException e2) {
            zzt.zzo().zzu(e2, "AdsServiceSignalTask.startAdsServiceSignalTask");
        }
        return zzger.zzi(jSONObject);
    }
}
