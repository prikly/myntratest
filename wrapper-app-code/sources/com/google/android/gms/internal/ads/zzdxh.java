package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdxh {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdxh(Executor executor) {
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        Map map;
        this.zzd = true;
        zzcgr zzh = zzt.zzo().zzh().zzh();
        if (zzh != null) {
            JSONObject zzf = zzh.zzf();
            if (zzf != null) {
                this.zzb = ((Boolean) zzba.zzc().zzb(zzbjj.zzdx)).booleanValue() ? zzf.optJSONObject("common_settings") : null;
                this.zze = zzf.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.zza.containsKey(optString2)) {
                                    map = (Map) this.zza.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zza.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final JSONObject zza() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzdx)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzdw)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza2 = zzdxj.zza(this.zze, str, str2);
        if (zza2 == null) {
            return null;
        }
        return (JSONObject) map.get(zza2);
    }

    public final void zzc() {
        zzt.zzo().zzh().zzq(new zzdxe(this));
        this.zzc.execute(new zzdxf(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.execute(new zzdxg(this));
    }
}
