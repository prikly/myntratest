package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbqr implements zzbqd {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    public final void zza(Object obj, Map map) {
        String str;
        String str2 = (String) map.get(OSOutcomeConstants.OUTCOME_ID);
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get(IronSourceConstants.EVENTS_RESULT);
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            str = "\n".concat(String.valueOf(str5));
        }
        synchronized (this.zza) {
            zzbqq zzbqq = (zzbqq) this.zzb.remove(str2);
            if (zzbqq == null) {
                zze.zzj("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                zzbqq.zza(str4 + str);
            } else if (str6 == null) {
                zzbqq.zzb((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        zze.zza("Result GMSG: " + jSONObject2);
                    }
                    zzbqq.zzb(jSONObject);
                } catch (JSONException e2) {
                    zzbqq.zza(e2.getMessage());
                }
            }
        }
    }

    public final zzgfb zzb(zzbtj zzbtj, String str, JSONObject jSONObject) {
        zzcig zzcig = new zzcig();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbqp(this, zzcig));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(OSOutcomeConstants.OUTCOME_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbtj.zzl(str, jSONObject2);
        } catch (Exception e2) {
            zzcig.zze(e2);
        }
        return zzcig;
    }

    public final void zzc(String str, zzbqq zzbqq) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqq);
        }
    }
}
