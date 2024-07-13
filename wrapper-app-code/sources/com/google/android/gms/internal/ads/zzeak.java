package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzeak {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzeak(String str, zzeaj zzeaj) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzeak zzeak) {
        String str = (String) zzba.zzc().zzb(zzbjj.zziI);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzeak.zza);
            jSONObject.put("eventCategory", zzeak.zzb);
            jSONObject.putOpt("event", zzeak.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzeak.zzd);
            jSONObject.putOpt("rewardType", zzeak.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzeak.zzf);
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
