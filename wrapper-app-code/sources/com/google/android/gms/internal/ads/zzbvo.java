package com.google.android.gms.internal.ads;

import com.appnext.core.a.b;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbvo {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzbvo(JSONObject jSONObject) throws JSONException {
        if (zze.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbvn zzbvn = new zzbvn(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbvn.zzv);
                arrayList.add(zzbvn);
                if (i < 0) {
                    Iterator it = zzbvn.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject(b.hW);
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzt.zzg();
            this.zzb = zzbvp.zza(optJSONObject, "click_urls");
            zzt.zzg();
            this.zzc = zzbvp.zza(optJSONObject, "imp_urls");
            zzt.zzg();
            this.zzd = zzbvp.zza(optJSONObject, "downloaded_imp_urls");
            zzt.zzg();
            this.zze = zzbvp.zza(optJSONObject, "nofill_urls");
            zzt.zzg();
            this.zzf = zzbvp.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            zzcdd zza2 = zzcdd.zza(optJSONObject.optJSONArray("rewards"));
            if (zza2 == null) {
                this.zzh = null;
            } else {
                this.zzh = zza2.zza;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzh = null;
    }
}
