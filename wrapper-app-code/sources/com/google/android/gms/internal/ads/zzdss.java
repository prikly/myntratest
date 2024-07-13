package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.utils.IabUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdss implements Callable {
    public final /* synthetic */ zzdsu zza;
    public final /* synthetic */ zzfix zzb;
    public final /* synthetic */ zzfil zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdss(zzdsu zzdsu, zzfix zzfix, zzfil zzfil, JSONObject jSONObject) {
        this.zza = zzdsu;
        this.zzb = zzfix;
        this.zzc = zzfil;
        this.zzd = jSONObject;
    }

    public final Object call() {
        zzfix zzfix = this.zzb;
        zzfil zzfil = this.zzc;
        JSONObject jSONObject = this.zzd;
        zzdqg zzdqg = new zzdqg();
        zzdqg.zzV(jSONObject.optInt("template_id", -1));
        zzdqg.zzI(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdqg.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfjg zzfjg = zzfix.zza.zza;
        if (zzfjg.zzg.contains(Integer.toString(zzdqg.zzc()))) {
            if (zzdqg.zzc() == 3) {
                if (zzdqg.zzy() == null) {
                    throw new zzeom(1, "No custom template id for custom template ad response.");
                } else if (!zzfjg.zzh.contains(zzdqg.zzy())) {
                    throw new zzeom(1, "Unexpected custom template id in the response.");
                }
            }
            zzdqg.zzT(jSONObject.optDouble(IabUtils.KEY_RATING, -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfil.zzN) {
                zzt.zzp();
                optString = zzs.zzv() + " : " + optString;
            }
            zzdqg.zzU("headline", optString);
            zzdqg.zzU("body", jSONObject.optString("body", (String) null));
            zzdqg.zzU("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdqg.zzU("store", jSONObject.optString("store", (String) null));
            zzdqg.zzU(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, (String) null));
            zzdqg.zzU("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdqg;
        }
        throw new zzeom(1, "Invalid template ID: " + zzdqg.zzc());
    }
}
